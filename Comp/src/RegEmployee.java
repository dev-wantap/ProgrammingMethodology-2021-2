// 정규직 직원을 나타낸다
public class RegEmployee extends Employee{
    protected double yearlySalary;   // 연봉
    protected double bonusRate;      // 보너스 지급률

    // 정규직 직원의 이름, 소속부서, 연봉과 보너스 지급률을
    // 각각 주어진 값으로 초기화하면서 RegEmployee 객체를 생성한다
    public RegEmployee (String name, String department, double yearlySalary, double bonusRate) {
        // 여기에 코드를 입력하세요
        super(name, department);
        this.yearlySalary = yearlySalary;
        this.bonusRate = bonusRate;
    }
    // 정규직 직원의 월급을 계산한다
    public double pay(){
        // 여기에 코드를 입력하세요
        double result = (yearlySalary/12)*(1+bonusRate);
        return result;
    }

    // 정규직 직원의 모든 데이터를 반환한다
    public String toString() {
        // 여기에 코드를 입력하세요
        String result = "직원의 이름 : "+name+", 소속 부서: "+department+", 연봉: "+Double.toString(yearlySalary)+", 보너스 지급률: "+Double.toString(bonusRate);
        return result;
    }

}