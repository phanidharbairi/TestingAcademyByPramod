package ex_Constructors;

public class pr01_Constructors {
    public static void main(String[] args) {
        Mobile iphone = new Mobile("Iphone 17", "2025");
        Mobile one_plus = new Mobile("OnePlus 15R", "2026");
        System.out.println(iphone.model);
        System.out.println(one_plus.model);
    }
}

class Mobile{
    String model;
    String launch_year;

    Mobile(String model_name, String year_of_launch){
        this.model = model_name;
        this.launch_year = year_of_launch;
    }
}
