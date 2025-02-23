import java.util.Scanner;

public class userdata {     

        double risk = 0; // 0 - 100 overall risk factor

        // Personal Details
        String username;
        String userid;
        String DOB;
        String sex;
        double height ;  
        double weight ;   
        double BMI ; 
        short age;
        String country;
        String state;
        String district;

        // Lifestyle
        int smoking; // 0-5 consumption level
        int alcohol; // 0-5 consumption level
        int drug; // 0-5 times consumption level
        String exercise; // daily (low, moderate, high) or weekends (low, moderate, high)

        // Cardiovascular Health Assessment
        int heartattack; // true if had a heart attack
        short stroke; // 0 times or more
        int HBP; // High blood pressure reading, enter 0 if not applicable
        int LBP; // Low blood pressure reading, enter 0 if not applicable
        int cholesterol_levels; // Cholesterol level

        int chestpainfreq; // Number of times chest pain occurs
        double chestpainfreq_duration; // Duration of chest pain in minutes

        double breath_shortness; // Duration in minutes or 0 if not present


        // Metabolic Health Screening
        int diabetes;
        short dib_type; // 0 if no diabetes, 1 for Type 1, 2 for Type 2
        double l_sugar_level; // Last fasting blood sugar level, 0 if not applicable
        String medication; // "insulin", "metformin", etc., else enter "none"

        // Thyroid Function
        int hasHypothyroidism; // true if diagnosed with hypothyroidism
        int hasHyperthyroidism; // true if diagnosed with hyperthyroidism
        int takesThyroidMedications; // true if taking thyroid medication

        // Obesity-Related Conditions
       // int isObese = BMI > 30; // Automatically calculated
        int hasWeightLossHistory; // true if attempted weight loss
        int hadBariatricSurgery; // true if gastric bypass or similar

        // Lipid Profile
        float hdl; // HDL cholesterol level
        float ldl; // LDL cholesterol level
        float triglycerides; // Triglycerides level

        // Major Organ Systems Evaluation
        int hasLiverDisease; // true if history of liver disease
        int hasAlcoholLiverDamage; // true if diagnosed
        int hasKidneyDisease; // true if history of kidney disease
        int hadKidneyStones; // true if had kidney stones
        int hadDialysis; // true if undergone dialysis
        int takesKidneyAffectingMeds; // true if taking NSAIDs, diuretics

        // Respiratory Health
        int hasAsthma; // true if diagnosed with asthma
        int hasCOPD; // true if diagnosed with COPD or chronic bronchitis
        int hasSmokingLungDamage; // true if smoking-related lung issues

        int hasSleepApnea; // true if diagnosed
        int usesCPAP; // true if using CPAP machine
        int hasFrequentLungInfections; // true if frequent infections

        // Neurological & Mental Health Screening
        int hadStroke; // true if history of stroke
        int hadBrainInjury; // true if history of brain injury

        int hasDepression; // true if diagnosed with depression
        int hasAnxiety; // true if diagnosed with anxiety
        int hasBipolarDisorder; // true if diagnosed with bipolar disorder
        int takesPsychiatricMeds; // true if on psychiatric meds

        int hasMemoryLoss; // true if experiencing memory loss
        int hasDementiaSymptoms; // true if dementia symptoms present

        // Cancer & Family Medical History
        int hadCancer; // true if personal history of cancer
        int cancerStage; // 0 if no cancer, else stores stage number
        int hadCancerTreatment; // true if undergone cancer treatment

        int familyHasHeartDisease; // true if family history of heart disease
        int familyHasDiabetes; // true if family history of diabetes
        int familyHasCancer; // true if family history of cancer
        int hasGeneticDisorders; // true if family has genetic disorders

        int hadRecentBloodTests; // true if blood test done recently
        int hadMRI; // true if MRI done
        int hadCTScan; // true if CT scan done
        int hadXRay; // true if X-ray done
        int hadBiopsy; // true if biopsy done

        // Medications & Allergies
        int takesPrescriptionMeds; // true if taking any prescription meds
        int takesOTCMeds; // true if taking over-the-counter meds
        int hasDrugAllergies; // true if allergic to any medication

        int hadCovidVaccine; // true if vaccinated for COVID-19
        int hadFluVaccine; // true if vaccinated for flu
        int hadHepatitisVaccine; // true if vaccinated for hepatitis

       void user_input(){
        Scanner sc = new Scanner(System.in);

        
         //Personal Information
         System.out.print("Enter Full Name: ");
         this.username=sc.nextLine();

         System.out.print("Enter user ID: ");
         this.userid=sc.nextLine();

         System.out.print("Date of Birth (DD/MM/YYYY): ");
         this.DOB=sc.nextLine();

         System.out.print("Enter your Gender: (M/F)");
         this.sex=sc.nextLine();

         System.out.print("Height (in cm): ");
         this.height=sc.nextDouble();
         sc.nextLine();

         System.out.print("Weight (in kg): ");
         this.weight=sc.nextDouble();
         sc.nextLine();

         this.BMI = this.weight / Math.pow(this.height / 100, 2);

         System.out.print("enter your age: ");
         this.age=sc.nextShort();
         sc.nextLine();

         System.out.print("Country of Residence: ");
         this.country=sc.nextLine();
         sc.nextLine();

         System.out.print("State of Residence: ");
         this.state = sc.nextLine();
         sc.nextLine();
         
         System.out.print("District of Residence: ");
         this.district = sc.nextLine();
 


         //Lifestyle Assessment
         System.out.println("Do you currently smoke? (Yes/No) If yes, how frequently do you smoke? (Scale: 0-5)  \n");
         this.smoking = sc.nextInt();
         sc.nextLine();
         System.out.println("Do you consume alcohol? (Yes/No) If yes, how frequently do you consume alcohol? (Scale: 0-5) ");
         this.alcohol = sc.nextInt();
         sc.nextLine();
         System.out.println(" Do you use any recreational drugs? (Yes/No) If yes, how frequently? (Scale: 0-5)");
         this.drug = sc.nextInt();
         sc.nextLine();
         System.out.println("How often do you engage in physical exercise? (daily/weekends/none) Intensity of exercise? (Low/Moderate/High) enter dl/dm/dh/wl/wm/wh/none ");
         this.exercise = sc.nextLine();
        
 
         //Cardiovascular Health
         System.out.println(" Have you ever had a heart attack? (true/false)");
         this.heartattack=sc.nextInt();

         System.out.println("Have you ever experienced a stroke? (Yes/No) If yes, how many times? else enter 0");
         this.stroke=sc.nextShort();
         System.out.println("Have you been diagnosed with high blood pressure (HBP)? (Yes/No) If yes, please provide the latest recorded HBP reading.  \n");
         this.HBP=sc.nextInt();
         sc.nextLine();
         System.out.println("Have you been diagnosed with low blood pressure (LBP)? (Yes/No) If yes, please provide the latest recorded LBP reading.  \n");
         this.LBP=sc.nextInt();
         sc.nextLine();
         System.out.println("What is your most recent cholesterol level reading? (If known else enter 0)");
         this.cholesterol_levels = sc.nextInt();
         sc.nextLine();
         System.out.println("Have you experienced chest pain in the past year? (Yes/No) If yes, how frequently does it occur? (Enter number of times)");
         this.chestpainfreq = sc.nextInt();
         sc.nextLine();
         System.out.println("How long does the chest pain typically last? (Enter duration in minutes)");
         this.chestpainfreq_duration=sc.nextDouble();
         sc.nextLine();
         System.out.println("Have you experienced shortness of breath? (Yes/No) If yes, what is the typical duration? (Enter duration in minutes)");
         this.breath_shortness= sc.nextDouble();
         sc.nextLine();
 
 
 
         //Metabolic Health Screening
         System.out.println("do you have diabetes? (true/false) ");
         this.diabetes=sc.nextInt();
         System.out.println("Have you been diagnosed with diabetes? (Yes/No) If yes, specify type: (Type 1/Type 2 else enter 0)");
        this.dib_type=sc.nextShort();
         System.out.println("What was your last recorded fasting blood sugar level? (Enter value if known, else state 0");
         this.l_sugar_level=sc.nextDouble();
         sc.nextLine();
         System.out.println("Are you currently on any medication for diabetes? (Yes/No) If yes, specify the medication insulin/metformin else enter \"none\".");
         this.medication=sc.nextLine();
 
 
         //Thyroid Function
         System.out.println("Have you been diagnosed with hypothyroidism? (true/false)");
         this.hasHypothyroidism=sc.nextInt();
         System.out.println("Have you been diagnosed with hyperthyroidism? (true/false)");
         this.hasHyperthyroidism=sc.nextInt();
         sc.nextLine();
         System.out.println("Are you currently taking any thyroid medication? (true/false)");
         this.takesThyroidMedications=sc.nextInt();
         sc.nextLine();
 
 
         //Obesity and Related Conditions
         System.out.println("Have you attempted weight loss programs or treatments in the past? (Yes/No)");
         this.hasWeightLossHistory=sc.nextInt();
         System.out.println("Have you undergone bariatric surgery or any weight loss surgery? (Yes/No)");
         this.hadBariatricSurgery=sc.nextInt();
 
 
         //Lipid Profile
         System.out.println("What is your most recent recorded HDL cholesterol level? (Enter value if known, else state 0.0)");
         this.hdl=sc.nextFloat();
         sc.nextLine();
         System.out.println("What is your most recent recorded LDL cholesterol level? (Enter value if known, else state 0.0) ");
         this.ldl=sc.nextFloat();
         sc.nextLine();
         System.out.println("What is your most recent triglycerides level? (Enter value if known, else state 0.0)");
         this.triglycerides=sc.nextFloat();
         sc.nextLine();
 
 
         //Major Organ Systems Evaluation
         System.out.println("Have you been diagnosed with any liver disease? (t/f)");
         this.hasLiverDisease=sc.nextInt();
         sc.nextLine();
         System.out.println("Have you been diagnosed with alcohol-induced liver damage? (Yes/No)");
         this.hasAlcoholLiverDamage=sc.nextInt();
         sc.nextLine();
         System.out.println("Have you been diagnosed with any kidney disease? (Yes/No)");
         this.hasKidneyDisease=sc.nextInt();
         sc.nextLine();
         System.out.println("Have you had kidney stones? (Yes/No)");
         this.hadKidneyStones=sc.nextInt();
         sc.nextLine();
         System.out.println("Have you ever undergone dialysis? (Yes/No)");
         this.hadDialysis=sc.nextInt();
         sc.nextLine();
         System.out.println("Are you taking medications that may affect kidney function (e.g., NSAIDs, diuretics)? (Yes/No)");
         this.takesKidneyAffectingMeds=sc.nextInt();
         sc.nextLine();

 
 
         //Respiratory Health
         System.out.println("Have you been diagnosed with asthma? (Yes/No)");
         this.hasAsthma=sc.nextInt();
         sc.nextLine();
         System.out.println("Have you been diagnosed with chronic obstructive pulmonary disease (COPD) or chronic bronchitis? (Yes/No) ");
         this.hasCOPD=sc.nextInt();
         sc.nextLine();

         System.out.println("Have you been diagnosed with smoking-related lung conditions? (Yes/No)");
         this.hasSmokingLungDamage=sc.nextInt();
         sc.nextLine();
         System.out.println(" Have you been diagnosed with sleep apnea? (Yes/No)");
         this.hasSleepApnea=sc.nextInt();
         sc.nextLine();

         System.out.println("Do you use a CPAP machine for sleep apnea? (Yes/No) ");
         this.usesCPAP=sc.nextInt();
         sc.nextLine();
         System.out.println("Have you experienced frequent lung infections? (Yes/No)");
         this.hasFrequentLungInfections=sc.nextInt();
         sc.nextLine();
 
 
         //Neurological & Mental Health Screening
         System.out.println("Have you ever experienced a stroke? (Yes/No)");
         this.hadStroke=sc.nextInt();
         sc.nextLine();
         System.out.println("Have you suffered a brain injury in the past? (Yes/No)");
         this.hadBrainInjury=sc.nextInt();
         sc.nextLine();
         System.out.println("Have you been diagnosed with depression? (Yes/No)");
         this.hasDepression=sc.nextInt();
         sc.nextLine();
         System.out.println("Have you been diagnosed with anxiety? (Yes/No)");
         this.hasAnxiety=sc.nextInt();
         sc.nextLine();
         System.out.println("Have you been diagnosed with bipolar disorder? (Yes/No)");
         this.hasBipolarDisorder=sc.nextInt();
         sc.nextLine();
         System.out.println("Are you currently taking any psychiatric medications? (Yes/No)");
         this.takesPsychiatricMeds=sc.nextInt();
         sc.nextLine();
         System.out.println("Have you experienced memory loss? (Yes/No)");
         this.hasMemoryLoss=sc.nextInt();
         sc.nextLine();
         System.out.println("Have you been diagnosed with dementia or dementia-like symptoms? (Yes/No)");
         this.hasDementiaSymptoms=sc.nextInt();
         sc.nextLine();
 
 
         //Cancer & Family Medical History
         System.out.println("Have you ever been diagnosed with cancer? (Yes/No) ");
         this.hadCancer=sc.nextInt();
         sc.nextLine();
         System.out.println("If yes, what was the stage at diagnosis? (Enter stage number)");
         this.cancerStage=sc.nextInt();
         
         sc.nextLine();
         System.out.println("Have you undergone any cancer treatment? (Yes/No)");
         this.hadCancerTreatment=sc.nextInt();

         System.out.println("Is there a family history of heart disease? (Yes/No)");
         this.familyHasHeartDisease=sc.nextInt();
         sc.nextLine();
         System.out.println("Is there a family history of diabetes? (Yes/No)");
         this.familyHasDiabetes=sc.nextInt();
         sc.nextLine();
         System.out.println("Is there a family history of cancer? (Yes/No)");
         this.familyHasCancer=sc.nextInt();
         sc.nextLine();
         System.out.println("Does your family have any known genetic disorders? (Yes/No)");
         this.hasGeneticDisorders=sc.nextInt();
         sc.nextLine();
 
         //Recent Medical Tests & Examinations
         System.out.println("Have you had a blood test in the past year? (Yes/No)");
         this.hadRecentBloodTests=sc.nextInt();
         System.out.println("Have you undergone an MRI scan? (Yes/No)");
         this.hadMRI=sc.nextInt();
         System.out.println("Have you undergone a CT scan? (Yes/No)");
         this.hadCTScan=sc.nextInt();
         System.out.println("Have you had an X-ray in the past year? (Yes/No)");
         this.hadXRay=sc.nextInt();
         System.out.println("Have you undergone a biopsy? (Yes/No)");
         this.hadBiopsy=sc.nextInt();
 
 
         //Medications & Allergies
         System.out.println("Are you currently taking any prescription medications? (Yes/No)");
         this.takesPrescriptionMeds=sc.nextInt();
         System.out.println("Are you currently taking any over-the-counter (OTC) medications? (Yes/No)");
         this.takesOTCMeds=sc.nextInt();
         System.out.println("Do you have any known drug allergies? (Yes/No)");
         this.hasDrugAllergies=sc.nextInt();
 
 
         //Vaccination History
         System.out.println("Have you received the COVID-19 vaccine? (Yes/No)");
         this.hadCovidVaccine=sc.nextInt();
         System.out.println("Have you received the flu vaccine? (Yes/No)");
         this.hadFluVaccine=sc.nextInt();
         System.out.println("Have you received the hepatitis vaccine?(Yes/No)");
         this.hadHepatitisVaccine=sc.nextInt();
 

        sc.close();
       }
    
}