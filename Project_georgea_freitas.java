import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Project_georgea_freitas {

    public static void main(String[] args) {
        // Create an ArrayList to store Policy objects
        ArrayList<Policy> policyList = new ArrayList<>();

        // Variables to keep track of the number of smokers and non-smokers
        int smokerCount = 0;
        int nonSmokerCount = 0;

        try {
            // Open the PolicyInformation.txt file
            File file = new File("PolicyInformation.txt");
            Scanner fileScanner = new Scanner(file);

            // Read file line by line and create Policy objects
            while (fileScanner.hasNext()) {
                int policyNumber = fileScanner.nextInt();
                fileScanner.nextLine(); // Consume the newline character
                String providerName = fileScanner.nextLine();
                String firstName = fileScanner.nextLine();
                String lastName = fileScanner.nextLine();
                int age = fileScanner.nextInt();
                String smokingStatus = fileScanner.next();
                double height = fileScanner.nextDouble();
                double weight = fileScanner.nextDouble();
                fileScanner.nextLine(); // Consume the newline character after weight

                // Create a Policy object using the constructor
                Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);

                // Add the Policy object to the ArrayList
                policyList.add(policy);

                // Update the smoker/non-smoker count
                if (smokingStatus.equals("smoker")) {
                    smokerCount++;
                } else {
                    nonSmokerCount++;
                }
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }

        // Display the policy information for each policy in the list
        for (Policy policy : policyList) {
            System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
            System.out.println("Provider Name: " + policy.getProviderName());
            System.out.println("Policyholder’s First Name: " + policy.getPolicyholderFirstName());
            System.out.println("Policyholder’s Last Name: " + policy.getPolicyholderLastName());
            System.out.println("Policyholder’s Age: " + policy.getPolicyholderAge());
            System.out.println("Policyholder’s Smoking Status: " + policy.getSmokingStatus());
            System.out.println("Policyholder’s Height: " + policy.getHeight() + " inches");
            System.out.println("Policyholder’s Weight: " + policy.getWeight() + " pounds");
            System.out.printf("Policyholder’s BMI: %.2f\n", policy.calculateBMI());
            System.out.printf("Policy Price: $%.2f\n", policy.calculatePolicyPrice());
        }

        // Display the number of smokers and non-smokers
        System.out.println("\nThe number of policies with a smoker is: " + smokerCount);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
    }
}
