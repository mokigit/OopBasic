package Company;

public class Engineer extends Employee {
    String programmingLanguage;
    
    public Engineer(String name, Department department, String position, int employeeId, String programmingLamguage) {
        super(name, department, position, employeeId);
        this.programmingLanguage = programmingLanguage;
    }
    public void developSoftware() {
        System.out.println("ソフトウェアを開発します。 名前: " + name + " , プログラミング言語: " + programmingLanguage);
    }
}
