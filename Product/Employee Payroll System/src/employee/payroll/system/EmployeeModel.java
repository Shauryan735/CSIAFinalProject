package employee.payroll.system;
public class EmployeeModel {
    private int ID;
    private String fName, mName, lName, dob, gender, phone, mail, address, dept, des;
    private double salary;
    private int leaves;
    private String joined;

    public EmployeeModel(int ID, String fName, String mName, String lName, String dob, String gender, String phone, String mail, String address, String dept, String des, double salary, int leaves, String joined) {
        this.ID = ID;
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
        this.dob = dob;
        this.gender = gender;
        this.phone = phone;
        this.mail = mail;
        this.address = address;
        this.dept = dept;
        this.des = des;
        this.salary = salary;
        this.leaves = leaves;
        this.joined = joined;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getLeaves() {
        return leaves;
    }

    public void setLeaves(int leaves) {
        this.leaves = leaves;
    }

    public String getJoined() {
        return joined;
    }

    public void setJoined(String joined) {
        this.joined = joined;
    }
    

}
