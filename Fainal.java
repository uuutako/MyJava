class Student{
  String name;

  public double calculateAvg(double[]date){
    double sum = 0;
    for( int i=0; i < date.length; i++) {
             sum +=date[i];
    }
    double avg = sum/date.length;
    return avg;
  }

  public String jedge(double avg) {
    String result;
    if( avg >= 60 ){
      result = "passed";
    } else {
      result = "failed";
    }
    return result;
    }
}

public class Fainal{
  public static void main(String[] args){
    Student a001 =new Student();
    a001.name= "sato";
    double[] date = { 70, 65, 50, 10, 30};

    double avg = a001.calculateAvg(date);
    String result =  a001.jedge(avg);

    System.out.println(avg);
    System.out.println(a001.name + " " + result);

  }
}
