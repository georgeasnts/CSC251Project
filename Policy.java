public class Policy {
   // Attributes to store policy details
   private int policyNumber;
   private String providerName;
   private String policyholderFirstName;
   private String policyholderLastName;
   private int policyholderAge;
   private String smokingStatus;
   private double height;
   private double weight;


   // Constructor w/o arguments - it ensures everything has a value
   public Policy() {
   this.policyNumber = 0;
   this.providerName = "Unknown";
   this.policyholderFirstName = "Unknown";
   this.policyholderLastName = "Unknown";
   this.policyholderAge = 0;
   this.smokingStatus = "non-smoker";
   this.height = 0.0;
   this.weight = 0.0;
   }
   
    // Constructor w arguments - it sets all the policy details when creating the object
   public Policy(int policyNumber, String providerName, String policyholderFirstName, String policyholderLastName, int policyholderAge, String smokingStatus, double height, double weight) {
   this.policyNumber = policyNumber;
   this.providerName = providerName;
   this.policyholderFirstName = policyholderFirstName;
   this.policyholderLastName = policyholderLastName;
   this.policyholderAge = policyholderAge;
   this.smokingStatus = smokingStatus;
   this.height = height;
   this.weight = weight;
}

// METHODS
// Method to get the policy number
public int getPolicyNumber() {
   return policyNumber;
}
// Method to set the policy number
public void setPolicyNumber(int policyNumber) {
   this.policyNumber = policyNumber;
}
// Method to get the provider name
public String getProviderName() {
   return providerName;
}
// Method to set the provider name
public void setproviderName(String providerName) {
   this.providerName = providerName;
}
// Method to get the policy holder first nAME
public String getPolicyholderFirstName() {
   return policyholderFirstName;
}
// Method to set the policy holder first name
public void setPolicyholderFirstName(String policyholderFirstName) {
   this.policyholderFirstName = policyholderFirstName;
}
// Method to get the policy holder last nAME
public String getPolicyholderLastName() {
   return policyholderLastName;
}
// Method to set the policy holder last name
public void setPolicyholderLastName(String policyholderLastName) {
   this.policyholderLastName = policyholderLastName;
}
// Method to get the policy holder age
public int getPolicyholderAge() {
        return policyholderAge;
}
// Method to set the policy holder age
public void setPolicyholderAge(int policyholderAge) {
        this.policyholderAge = policyholderAge;
}
// Method to get the smoking status
public String getSmokingStatus(){
   return smokingStatus;
}
// Method to set the smoking status
public void setSmokingStatus(String smokingStatus) {
   this.smokingStatus = smokingStatus;
}
// Method to get the height
public double getHeight() {
   return height;
}
// Method to set the height
public void setHeight(double height) {
   this.height = height;
}
// Method to get the weight
public double getWeight() {
   return weight;
}
// Method to set the weight
public void setWeight(double weight) {
   this.weight = weight;
}


// method that calculates BMI based on height and weight
public double calculateBMI() {
   return (this.weight * 703) / (this.height * this.height);
}

// method that calculates policy price
public double calculatePolicyPrice() {
   double basePrice = 600; // starting price

   //additional $75 if the policy holder is over 50 
   if (this.policyholderAge > 50) {
      basePrice += 75; 
   }
      //additional $100 if the policy holder is over 50 
    if (this.smokingStatus.equals("smoker")) {
      basePrice += 100;
   }
   
    //additional fee if the policy holder BMI is over 35
   double bmi = calculateBMI();
   if (bmi > 35) {
      basePrice +=(bmi - 35) * 20;
   }
   
   return basePrice; //return to the total calculated price
   }
}