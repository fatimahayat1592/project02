package project02;



public  abstract class Marks {
  /*  We have to calculate the average of marks obtained in three subjects
    by student A and by student B. Create class 'Marks' with an abstract
    method 'getPercentage' that will be returning the average percentage
    of marks. Provide implementation of abstract method in classes 'A'
    and 'B'. The constructor of student A takes the marks in three
    subjects as its parameters and the marks in four subjects as its
    parameters for student B. Test your code*/


  abstract double getPercentage();

  }


class A extends Marks{
  private double subject1;
  private  double subject2;
  private double subject3;

  public A(double subject1, double subject2, double subject3) {
    this.subject1 = subject1;
    this.subject2 = subject2;
    this.subject3 = subject3;
  }
  @Override
  double getPercentage() {
    double average1=(subject1+subject2+subject3)/3;
    return average1;
  }
}
class B extends A{
private  double subject4;
  public B(double subject1, double subject2, double subject3,double subject4) {
    super(subject1, subject2, subject3);
    this.subject4=subject4;
  }
}
class MarksTester {
  public static void main(String[] args) {

    Marks[] marks = {new A(98, 78, 97), new B(87, 86, 98, 72)};
    for (Marks m : marks) {
      System.out.println(m.getPercentage());
    }
  }
}