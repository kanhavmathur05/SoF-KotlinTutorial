package enums;

import java.io.*;
 public class Test {
 public static void main(String[] args) {
         File dir = new File("dir");
         File f = new File(dir, "f");
         }
 }




//public class Test  {
//    public static void main(String[] args){
//        System.out.println(Thread.currentThread().getName());
//        float f=2.3f;
//        f=2.8;
//    }
//
//}


//interface TestInf {
//    int i =10;
//}
//public class Test {
//    public static void main(String... args) {
//
//        System.out.println(TestInf.i);
//    }
//}


//class MyThread extends Thread{
//    MyThread(){}
//
//    public void run(){
//        System.out.println("Inside Thread");
//    }}
//class MyRunnable implements Runnable{
//    public void run(){
//        System.out.println("Inside Runnable");
//    }}
//class Test{
//    public static void main(String[] args){
//        new MyThread().start();
//        new MyThread(new MyRunnable()).start();
//    }
//}




//class Test
//{
//    public static void main(String[] args)
//    {
//        try
//        {
//            int a[]= {1, 2, 3, 4};
//            for (int i = 1; i <= 4; i++)
//            {
//                System.out.println ("a[" + i + "]=" + a[i] + "\n");
//            }
//        }
//        catch (ArrayIndexOutOfBoundsException e)
//        {
//            System.out.println ("ArrayIndexOutOfBoundsException");
//        }
//        catch (Exception e)
//        {
//            System.out.println ("error = " + e);
//        }
//    }
//}



//import java.io.File;
//public class Test {
//    public static void main(String[] args) throws Exception {
//        File file = new File("test.txt");
//        System.out.println(file.exists());
//        file.createNewFile();
//        System.out.println(file.exists());
//    }}


//public class Test extends Thread{
//    public static void main(String argv[]){
//        Test b = new Test();
//        b.start();
//    }
//    public void run(){
//        int i = 0;
//        for (; i < 5; ){
//            System.out.println("Value of i = " + i);
//            i++;
//        }
//    }
//}


//class Test {
//    public interface A{public void m1();}
//    class B implements A{}
//    class C implements A {public void m1(){}}
//    class D implements A{public void m1(int x){}}
//    abstract class E implements A{}
//    abstract class F implements A{public void m1(){}}
//    abstract class G implements A{public void m1(int x){}}
//
//    public static void main(String args[])
//    {
//
//    }
//}

//import java.io.File;
//public class Test {
//    public static void main(String... args) throws Exception {
//        File myDir = new File("test");
//        myDir.mkdir();
//        File myFile = new File(myDir, "test.txt");
//        myFile.createNewFile();
//    }}

//public class Test {
//    public static void main(String... args) {
//        long d=2D+2d+2.+2l+2L+2f+2F+2.f+2.D+2l;
//        System.out.println(d);
//    }
//}

//class Test{
//    abstract class Emp{
//        private int id;
//
//        public Emp(int id) {
//            this.id = id;
//        }
//    }
//    public static void main(String args[])
//    {
//        Emp e=new Emp();
//    }
//}

//import java.io.*;
//import java.io.Serializable;
//class A{}
//public class Test implements Serializable {
//    private static A a = new A();
//    public static void main(String... args){
//        Test b = new Test();
//        try{
//            FileOutputStream fs = new
//                    FileOutputStream("b.ser");
//            ObjectOutputStream os = new
//                    ObjectOutputStream(fs);
//            os.writeObject(b);
//            os.close();
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//
//    } }



//abstract class C1 {
//    public C1() { System.out.print(1); }
//}
//class C2 extends C1 {
//    public C2() { System.out.print(2); }
//}
//class C3 extends C2 {
//    public C3() { System.out.println(3); }
//}
//public class Test {
//    public static void main(String[] a) { new C3(); }
//}



//import java.io.FileNotFoundException;
//class A {
//    public void printName() throws FileNotFoundException {
//        System.out.println("ValueA")
//        ;
//    }}
//class B extends A{
//    public void printName() throws NullPointerException{
//        System.out.println("NameB")
//        ;
//    }}
//public class Test{
//    public static void main (String[] args) throws Exception{
//        A a = new B();
//        a.printName();
//    }}


//public class Test extends Thread{
//    public static void main(String argv[]){
//        Test t = new Test();
//        t.run();
//        t.start();
//        t.start();
//    }
//    public void run(){
//        System.out.println("runtest");
//    }
//}
