public class userdata {
     

        double risk = 0; // 0 - 100 overall risk factor

        // Personal Details
        String username;
        String userid;
        String DOB;
        String sex;
        double height = 175;  
        double weight = 70;   
        double BMI = weight / Math.pow(height / 100, 2); 
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
        boolean heartattack; // true if had a heart attack
        short stroke; // 0 times or more
        int HBP; // High blood pressure reading, enter 0 if not applicable
        int LBP; // Low blood pressure reading, enter 0 if not applicable
        int cholesterol_levels; // Cholesterol level

        int chestpainfreq; // Number of times chest pain occurs
        double chestpainfreq_duration; // Duration of chest pain in minutes

        double breath_shortness; // Duration in minutes or 0 if not present

        // Metabolic Health Screening
        boolean diabetes; // false if no diabetes, true if yes
        short dib_type; // 0 if no diabetes, 1 for Type 1, 2 for Type 2
        double l_sugar_level; // Last fasting blood sugar level, 0 if not applicable
        String medication; // "insulin", "metformin", etc., else enter "none"

        // Thyroid Function
        boolean hasHypothyroidism; // true if diagnosed with hypothyroidism
        boolean hasHyperthyroidism; // true if diagnosed with hyperthyroidism
        boolean takesThyroidMedications; // true if taking thyroid medication

        // Obesity-Related Conditions
        boolean isObese = BMI > 30; // Automatically calculated
        boolean hasWeightLossHistory; // true if attempted weight loss
        boolean hadBariatricSurgery; // true if gastric bypass or similar

        // Lipid Profile
        float hdl; // HDL cholesterol level
        float ldl; // LDL cholesterol level
        float triglycerides; // Triglycerides level

        // Major Organ Systems Evaluation
        boolean hasLiverDisease; // true if history of liver disease
        boolean hasAlcoholLiverDamage; // true if diagnosed

        boolean hasKidneyDisease; // true if history of kidney disease
        boolean hadKidneyStones; // true if had kidney stones
        boolean hadDialysis; // true if undergone dialysis
        boolean takesKidneyAffectingMeds; // true if taking NSAIDs, diuretics

        // Respiratory Health
        boolean hasAsthma; // true if diagnosed with asthma
        boolean hasCOPD; // true if diagnosed with COPD or chronic bronchitis
        boolean hasSmokingLungDamage; // true if smoking-related lung issues

        boolean hasSleepApnea; // true if diagnosed
        boolean usesCPAP; // true if using CPAP machine
        boolean hasFrequentLungInfections; // true if frequent infections

        // Neurological & Mental Health Screening
        boolean hadStroke; // true if history of stroke
        boolean hadBrainInjury; // true if history of brain injury

        boolean hasDepression; // true if diagnosed with depression
        boolean hasAnxiety; // true if diagnosed with anxiety
        boolean hasBipolarDisorder; // true if diagnosed with bipolar disorder
        boolean takesPsychiatricMeds; // true if on psychiatric meds

        boolean hasMemoryLoss; // true if experiencing memory loss
        boolean hasDementiaSymptoms; // true if dementia symptoms present

        // Cancer & Family Medical History
        boolean hadCancer; // true if personal history of cancer
        int cancerStage; // 0 if no cancer, else stores stage number
        boolean hadCancerTreatment; // true if undergone cancer treatment

        boolean familyHasHeartDisease; // true if family history of heart disease
        boolean familyHasDiabetes; // true if family history of diabetes
        boolean familyHasCancer; // true if family history of cancer
        boolean hasGeneticDisorders; // true if family has genetic disorders

        boolean hadRecentBloodTests; // true if blood test done recently
        boolean hadMRI; // true if MRI done
        boolean hadCTScan; // true if CT scan done
        boolean hadXRay; // true if X-ray done
        boolean hadBiopsy; // true if biopsy done

        // Medications & Allergies
        boolean takesPrescriptionMeds; // true if taking any prescription meds
        boolean takesOTCMeds; // true if taking over-the-counter meds
        boolean hasDrugAllergies; // true if allergic to any medication

        boolean hadCovidVaccine; // true if vaccinated for COVID-19
        boolean hadFluVaccine; // true if vaccinated for flu
        boolean hadHepatitisVaccine; // true if vaccinated for hepatitis
    
}