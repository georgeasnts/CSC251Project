import java.util.Scanner;

public class Project_georgea_freitas {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get information from the user
        System.out.print("Please enter the Policy Number: ");
        int policyNumber = input.nextInt();

        input.nextLine();  // Consume the newline character left by nextInt()

        System.out.print("Please enter the Provider Name: ");
        String providerName = input.nextLine();

        System.out.print("Please enter the Policyholder’s First Name: ");
        String firstName = input.nextLine();

        System.out.print("Please enter the Policyholder’s Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Please enter the Policyholder’s Age: ");
        int age = input.nextInt();

        System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
        String smokingStatus = input.next();

        System.out.print("Please enter the Policyholder’s Height (in inches): ");
        double height = input.nextDouble();

        System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
        double weight = input.nextDouble();

        // Create a Policy object using the constructor that accepts arguments

        // Display the policy information
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

        // Close the scanner
        input.close();
    }
}
