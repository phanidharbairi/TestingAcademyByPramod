package OOPs.Abstraction;

public class Lab007_InterviewQ {
}

interface I11{}; //possible
interface I12{}; //possible
class A1{}; //possible
class B1{}; //possible
class Test1 extends A1{}; //possible
//class Test2 extends A1, B1 {}; //not possible. Diamond problem
class Test3 implements I11 {}; //possible
class Test4 implements I11, I12{}; //possible
class Test5 extends A1 implements I11, I12 {};   //possible
//class test6 implements I11 extends A1 {}; //not possible