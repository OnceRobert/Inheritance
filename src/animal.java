public class animal {
    public int age;
    public String weight;
    public animal (int age, String weight){
        this.age = age;
        this.weight = weight;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setWeight(String weight){
        this.weight = weight;
    }

    public int getAge(){
        return age;
    }

    public String getWeight() {
        return weight;
    }

    public void running(int x){
        System.out.println("I can run at " + x + "mph");
    }

    public void eating(String x){
        System.out.println("I eat " + x);
    }
}
