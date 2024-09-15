public class Policy {
   // Attributes
   private int policyNumber;
   private String providerName;
   private String policyholderFirstName;
   private String policyholderLastName;
   private int policyholderAge;
   private String smokingStatus;
   private double height;
   private double weight;


   // constructor w/o arguments
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
   
    // constructor w arguments
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

// methods 

public int getPolicyNumber() {
   return policyNumber;
}

public void setPolicyNumber(int policyNumber) {
   this.policyNumber = policyNumber;
}

public String getProviderName() {
   return providerName;
}

public void setproviderName(String providerName) {
   this.providerName = providerName;
}

public String getPolicyholderFirstName() {
   return policyholderFirstName;
}

public void setPolicyholderFirstName(String policyholderFirstName) {
   this.policyholderFirstName = policyholderFirstName;
}

public String getPolicyholderLastName() {
   return policyholderLastName;
}

public void setPolicyholderLastName(String policyholderLastName) {
   this.policyholderLastName = policyholderLastName;
}

public int getPolicyholderAge() {
        return policyholderAge;
}

public void setPolicyholderAge(int policyholderAge) {
        this.policyholderAge = policyholderAge;
}

public String getSmokingStatus(){
   return smokingStatus;
}

public void setSmokingStatus(String smokingStatus) {
   this.smokingStatus = smokingStatus;
}

public double getHeight() {
   return height;
}

public void setHeight(double height) {
   this.height = height;
}

public double getWeight() {
   return weight;
}

public void setWeight(double weight) {
   this.weight = weight;
}


// method that calculates BMI

public double calculateBMI() {
   return (this.weight * 703) / (this.height * this.height);
}

// method that calculates policy price

public double calculatePolicyPrice() {
   double basePrice = 600;
   if (this.policyholderAge > 50) {
      basePrice += 75;
   }
   
    if (this.smokingStatus.equals("smoker")) {
      basePrice += 100;
   }
   
   double bmi = calculateBMI();
   if (bmi > 35) {
      basePrice +=(bmi - 35) * 20;
   }
   
   return basePrice;
   }
}