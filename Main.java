import java.util.Scanner; // for input 
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    private static final String Url = "jdbc:mysql://127.0.0.1:3306/hackx"; 

    private static final String username = "root";

    private static final String password = "Kash@17022005";

    public static void openLink(String url) {
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI(url));
                System.out.println("Opening: " + url);
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Desktop is not supported, cannot open the link.");
        }
    }

    public static void main (String args[]) throws SQLException, ClassNotFoundException{ // can throw exception 

        System.out.println("Before initiating the virtual medical assessment, the system must display a clear consent form informing users about data collection, processing, and storage. Users must explicitly agree by clicking an “Accept & Proceed” button before continuing. Additionally, a medical disclaimer should be prominently shown, stating:\n" + //
                        "\n" + //
                        "⚠️ This AI-powered assistant is not a licensed medical professional and does not provide official diagnoses or medical advice. The assessment is for preliminary screening purposes only and should not replace a consultation with a qualified healthcare provider. 🏥✅\n" + //
                        "\n" + //
                        "Audit logs should record user consent, ensuring compliance with data privacy regulations.");

                        int consent ; // 0 is for No and 1 is for Yes
                        System.out.println("Enter 0 for no and enter 1 for accepting ");
                        Scanner input = new Scanner(System.in);
                        consent = input.nextInt();

        if(consent != 1) // will exit the function 
        {
            System.out.println("Thank you for using VMEA by AlgoRex");
            return ;
        }


        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); // load all drivers
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection connection = DriverManager.getConnection(Url, username, password); // load the connection in "connection"
            while (true) {
                System.out.println();
                System.out.println("👋 Welcome! I’m your AI-powered Medical Examiner Assistant 🤖🩺, here to conduct preliminary health assessments for insurance underwriters. I streamline the evaluation process with accuracy and efficiency. How can I assist you today? 😊");
                System.out.println("1. ✅ Ask about a specific medical condition ❓ ");
                System.out.println("2. ✅ Start the preliminary health assessment 📝");
                System.out.println("0. Exit");
                System.out.println("Select an option: ");
                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                    openLink("https://cdn.botpress.cloud/webchat/v2.2/shareable.html?configUrl=https://files.bpcontent.cloud/2025/02/22/08/20250222081155-ZU8ON9AY.json\n" + //
                                                "");
                        break;
                    case 2:
                    { 
                        userdata user = new userdata();
                        user.user_input(); // used to take inputs from user
                        
                        try {
                
                            String sql = "INSERT INTO HealthProfile (username, userid, DOB, sex, height, weight, age, country, state, district, " +
                            "smoking, alcohol, drug, exercise, heartattack, stroke, HBP, LBP, cholesterol_levels, " +
                            "chestpainfreq, chestpainfreq_duration, breath_shortness, diabetes, dib_type, l_sugar_level, medication, " +
                            "hasHypothyroidism, hasHyperthyroidism, takesThyroidMedications, hasWeightLossHistory, hadBariatricSurgery, " +
                            "hdl, ldl, triglycerides, hasLiverDisease, hasAlcoholLiverDamage, hasKidneyDisease, hadKidneyStones, hadDialysis, takesKidneyAffectingMeds, " +
                            "hasAsthma, hasCOPD, hasSmokingLungDamage, hasSleepApnea, usesCPAP, hasFrequentLungInfections, hadStroke, hadBrainInjury, " +
                            "hasDepression, hasAnxiety, hasBipolarDisorder, takesPsychiatricMeds, hasMemoryLoss, hasDementiaSymptoms, hadCancer, cancerStage, " +
                            "hadCancerTreatment, familyHasHeartDisease, familyHasDiabetes, familyHasCancer, hasGeneticDisorders, hadRecentBloodTests, hadMRI, " +
                            "hadCTScan, hadXRay, hadBiopsy, takesPrescriptionMeds, takesOTCMeds, hasDrugAllergies, hadCovidVaccine, hadFluVaccine, hadHepatitisVaccine) " +
                            "VALUES ('" + user.username + "', '" + user.userid + "', '" + user.DOB + "', '" + user.sex + "', '" + user.height + "', '" + user.weight + "', " +
                            "'" + user.age + "', '" + user.country + "', '" + user.state + "', '" + user.district + "', '" + user.smoking + "', '" + user.alcohol + "', " +
                            "'" + user.drug + "', '" + user.exercise + "', '" + user.heartattack + "', '" + user.stroke + "', '" + user.HBP + "', '" + user.LBP + "', " +
                            "'" + user.cholesterol_levels + "', '" + user.chestpainfreq + "', '" + user.chestpainfreq_duration + "', '" + user.breath_shortness + "', " +
                            "'" + user.diabetes + "', '" + user.dib_type + "', '" + user.l_sugar_level + "', '" + user.medication + "', '" + user.hasHypothyroidism + "', " +
                            "'" + user.hasHyperthyroidism + "', '" + user.takesThyroidMedications + "', '" + user.hasWeightLossHistory + "', '" + user.hadBariatricSurgery + "', " +
                            "'" + user.hdl + "', '" + user.ldl + "', '" + user.triglycerides + "', '" + user.hasLiverDisease + "', '" + user.hasAlcoholLiverDamage + "', " +
                            "'" + user.hasKidneyDisease + "', '" + user.hadKidneyStones + "', '" + user.hadDialysis + "', '" + user.takesKidneyAffectingMeds + "', " +
                            "'" + user.hasAsthma + "', '" + user.hasCOPD + "', '" + user.hasSmokingLungDamage + "', '" + user.hasSleepApnea + "', '" + user.usesCPAP + "', " +
                            "'" + user.hasFrequentLungInfections + "', '" + user.hadStroke + "', '" + user.hadBrainInjury + "', '" + user.hasDepression + "', " +
                            "'" + user.hasAnxiety + "', '" + user.hasBipolarDisorder + "', '" + user.takesPsychiatricMeds + "', '" + user.hasMemoryLoss + "', " +
                            "'" + user.hasDementiaSymptoms + "', '" + user.hadCancer + "', '" + user.cancerStage + "', '" + user.hadCancerTreatment + "', " +
                            "'" + user.familyHasHeartDisease + "', '" + user.familyHasDiabetes + "', '" + user.familyHasCancer + "', '" + user.hasGeneticDisorders + "', " +
                            "'" + user.hadRecentBloodTests + "', '" + user.hadMRI + "', '" + user.hadCTScan + "', '" + user.hadXRay + "', '" + user.hadBiopsy + "', " +
                            "'" + user.takesPrescriptionMeds + "', '" + user.takesOTCMeds + "', '" + user.hasDrugAllergies + "', '" + user.hadCovidVaccine + "', " +
                            "'" + user.hadFluVaccine + "', '" + user.hadHepatitisVaccine + "');";
                
                            try (Statement statement = connection.createStatement()) {
                                int affectedRows = statement.executeUpdate(sql);
                
                                if (affectedRows > 0) {
                                    System.out.println("Data receved!");
                                } else {
                                    System.out.println("Data Not receved!");
                                }
                            }
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                        String C_name;
                        System.out.println("enter the company name to know their risk factor and premiums");
                        C_name = input.nextLine();
                        user.calculate_risk(C_name);
                    
                    }
                        break;
                    case 0:
                        exit(); //exit function
                        scanner.close();
                        return;
    
                    default:
                    System.out.println("Invalid input please select again!");
                        break;
                }
            }

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    


        
    }

    public static void exit() throws InterruptedException {
        System.out.print("Exiting System");
        int i = 5;
        while(i!=0){
            System.out.print(".");
            Thread.sleep(1000);
            i--;
        }
        System.out.println();
        System.out.println("ThankYou For Using  Virtual Medical Examiner Assistant (VMEA) by AlgoRex!!!");
        
    }
    
}


