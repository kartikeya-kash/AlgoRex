create database hackx;
use hackx;

CREATE TABLE HealthProfile (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(100),
    userid VARCHAR(50),
    DOB VARCHAR(30),
    sex ENUM('Male', 'Female', 'Other'),
    height DOUBLE,
    weight DOUBLE,
    BMI DOUBLE GENERATED ALWAYS AS (weight / POW(height / 100, 2)) STORED,
    age SMALLINT,
    country VARCHAR(100),
    state VARCHAR(100),
    district VARCHAR(100),
  -- Lifestyle
    smoking TINYINT CHECK (smoking BETWEEN 0 AND 5),
    alcohol TINYINT CHECK (alcohol BETWEEN 0 AND 5),
    drug TINYINT CHECK (drug BETWEEN 0 AND 5),
    exercise ENUM('dl', 'dm', 'dh', 
                  'wl', 'wm', 'wh', 'none'),
	 -- Cardiovascular Health Assessment
    heartattack BOOLEAN,
    stroke SMALLINT,
    HBP INT,
    LBP INT,
    cholesterol_levels INT,
    chestpainfreq INT,
    chestpainfreq_duration DOUBLE,
    breath_shortness DOUBLE,

    -- Metabolic Health Screening
    diabetes BOOLEAN,
    dib_type TINYINT CHECK (dib_type BETWEEN 0 AND 2),
    l_sugar_level DOUBLE,
    medication VARCHAR(50),

    -- Thyroid Function
    hasHypothyroidism BOOLEAN,
    hasHyperthyroidism BOOLEAN,
    takesThyroidMedications BOOLEAN,
     -- Obesity-Related Conditions
    isObese BOOLEAN GENERATED ALWAYS AS (BMI > 30) STORED,
    hasWeightLossHistory BOOLEAN,
    hadBariatricSurgery BOOLEAN,

    -- Lipid Profile
    hdl FLOAT,
    ldl FLOAT,
    triglycerides FLOAT,

    -- Major Organ Systems Evaluation
    hasLiverDisease BOOLEAN,
    hasAlcoholLiverDamage BOOLEAN,
    hasKidneyDisease BOOLEAN,
    hadKidneyStones BOOLEAN,
    hadDialysis BOOLEAN,
    takesKidneyAffectingMeds BOOLEAN,

    -- Respiratory Health
    hasAsthma BOOLEAN,
    hasCOPD BOOLEAN,
    hasSmokingLungDamage BOOLEAN,
    hasSleepApnea BOOLEAN,
    usesCPAP BOOLEAN,
    hasFrequentLungInfections BOOLEAN,

    -- Neurological & Mental Health Screening
    hadStroke BOOLEAN,
    hadBrainInjury BOOLEAN,
    hasDepression BOOLEAN,
    hasAnxiety BOOLEAN,
    hasBipolarDisorder BOOLEAN,
    takesPsychiatricMeds BOOLEAN,
    hasMemoryLoss BOOLEAN,
    hasDementiaSymptoms BOOLEAN,

    -- Cancer & Family Medical History
    hadCancer BOOLEAN,
    cancerStage TINYINT,
    hadCancerTreatment BOOLEAN,
    familyHasHeartDisease BOOLEAN,
    familyHasDiabetes BOOLEAN,
    familyHasCancer BOOLEAN,
    hasGeneticDisorders BOOLEAN,

    hadRecentBloodTests BOOLEAN,
    hadMRI BOOLEAN,
    hadCTScan BOOLEAN,
    hadXRay BOOLEAN,
    hadBiopsy BOOLEAN,

    -- Medications & Allergies
    takesPrescriptionMeds BOOLEAN,
    takesOTCMeds BOOLEAN,
    hasDrugAllergies BOOLEAN,

    hadCovidVaccine BOOLEAN,
    hadFluVaccine BOOLEAN,
    hadHepatitisVaccine BOOLEAN
);

SET SQL_SAFE_UPDATES = 9803420086897427896539;

select * from HealthProfile;
