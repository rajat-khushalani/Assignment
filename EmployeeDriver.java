import model.EducationalDetails;
import model.Employee;
import model.EmploymentHistory;
import java.util.Scanner;
import java.util.*;

    public class EmployeeDriver {


        /**
         * @return menu input
         */
        public static int menu() {
            System.out.println("Choose one option from following : ");
            System.out.println("1) Add a new employee.");
            System.out.println("2) Print all employees ");
            System.out.println("3) Print all employees who are developers");
            System.out.println("4) List all employees who are freshers.");
            System.out.println("5) Print all employees who are developers and have morethan two yearsof experience.");
            System.out.println("6) Exit");
            Scanner sc = new Scanner(System.in);
            return sc.nextInt();
        }



        public static void main(String[] args) {
            ArrayList<Employee> employeesByKey = new ArrayList<Employee>();
            ArrayList<EmploymentHistory> PastHistory = new ArrayList<EmploymentHistory>();
            ArrayList<EducationalDetails> Education = new ArrayList<EducationalDetails>();



            int menuStore = menu();

            while (menuStore != 6) {
                System.out.println();
                switch (menuStore) {
                    //Add data
                    case 1:
                        Scanner input = new Scanner(System.in);

                        System.out.println("Enter employee Name: ");
                        String emp_name = input.next();
                        System.out.println("Enter employee Age: ");
                        int age = input.nextInt();
                        System.out.println("Enter employee Designation: ");
                        String designation = input.next();

                        System.out.println("$$ Enter qualification Details $$");
                        System.out.println(" Enter number of certificate you possess");
                        int no_0f_certificates = input.nextInt();

                        while (no_0f_certificates > 0) {
                            System.out.println("Enter Certificate Name: ");
                            String certificateName = input.next();
                            System.out.println("Enter year of passing: ");
                            String yearPassed = input.next();
                            System.out.println("Enter Percentage/Grade obtained: ");
                            float percentage = input.nextFloat();

                            EducationalDetails education = new EducationalDetails(certificateName, yearPassed, percentage);
                            Education.add(education);
                            no_0f_certificates--;
                        }
                        System.out.println("$$ Enter Past Employment History Details $$");

                        System.out.println(" Enter number of experience you possess");
                        int no_0f_experience;
                        no_0f_experience = input.nextInt();

                        while (no_0f_experience > 0) {
                            System.out.println("Enter Previous Organization: ");
                            String previousOrganization = input.next();
                            System.out.println("Enter workDuration: ");
                            float workDuration = input.nextFloat();
                            System.out.println("Enter Projects worked on: ");
                            String projects = input.next();


                            EmploymentHistory workHistory = new EmploymentHistory(previousOrganization, workDuration, projects);
                            PastHistory.add(workHistory);
                            no_0f_experience--;

                        }

                        Employee newEmp = new Employee(emp_name, age, designation, PastHistory, Education);

                        employeesByKey.add(newEmp);

                        break;

                    case 2:
                        //Print all employees
                        for(int i=0;i<employeesByKey.size();i++){
                            Employee e = (Employee)employeesByKey.get(i);
                            System.out.println(e.toString());
                        }

                    case 3:
                        //Print all employees who are developers
                        for(int i=0;i<employeesByKey.size();i++){
                            Employee e = (Employee)employeesByKey.get(i);
                            if(e.getdesignation().equalsIgnoreCase("developer")){
                            System.out.println(e.toString());
                        }




                        }


                        break;


                    case 4:
                        //print all employees who have single organization
                        for(int i=0;i<employeesByKey.size();i++) {
                            Employee e = (Employee) employeesByKey.get(i);
                            if (e.getEmpHistory().equals(null)) {
                                System.out.println(e.toString());
                            }
                        }
                            break;

                    case 5:
                        //Print all employees who are developers and have morethan two years of experience
                        for(int i=0;i<employeesByKey.size();i++){
                            Employee e = (Employee)employeesByKey.get(i);
                            for(int j=0;j<e.getEmpHistory().size();j++){
                            if((e.getdesignation().equalsIgnoreCase("developer")&&(e.getEmpHistory().get(j).getWorkDuration())>2.0)){
                            System.out.println(e.toString());
                        }
                        }
                        }

                        break;
                    case 6:
                        System.out.println("Thank You");
                        break;





                        }
                        menuStore = menu();


                }
            }
        }






