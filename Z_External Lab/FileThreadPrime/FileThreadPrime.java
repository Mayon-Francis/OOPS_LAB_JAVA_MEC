// Create a file named f1.txt and write numbers from 1 to 9 in it.
// Then, write a java program to create two child threads. One child 
// Thread should read file f1.txt and write all prime numbers to f2.txt 
// and other child thread should read the same filw and write all non-prime 
// numbers to f3.txt



import java.io.FileReader;
import java.io.FileWriter;

public class FileThreadPrime {
    public static boolean isPrime(int num) {
        boolean flag = true;
        if(num == 1)
            return false;
        for(int i=2; i<num; i++) {
            if(num%i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void main(String args[]) {
        new Thread1();
        new Thread2();
    }
}

class Thread1 extends Thread {
    FileReader f1;
    FileWriter f2;
    Thread1() {
        super("Thread1");
        this.f1 = null;
        this.f2 = null;
        this.start();
    }

    public void run() {
        try {
            f1 = new FileReader("f1.txt");
            f2 = new FileWriter("f2.txt");

            int i;
            String data = "";
            while((i=f1.read()) != -1) {
                if(FileThreadPrime.isPrime( (char)i-'0') ) {
                    data+=(char)i;
                }
            }
            f2.write(data);

        }catch(Exception e) {
            System.out.println(e);
        }finally {
            try {
                if(f1 != null)
                    f1.close();
                if(f2 != null)
                    f2.close();
            }catch( Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Thread2 extends Thread {
    FileReader f1;
    FileWriter f3;
    Thread2() {
        super("Thread2");
        this.f1 = null;
        this.f3 = null;
        this.start();
    }

    public void run() {
        try {
            f1 = new FileReader("f1.txt");
            f3 = new FileWriter("f3.txt");

            int i;
            String data = "";
            while((i=f1.read()) != -1) {
                if(!FileThreadPrime.isPrime( (char)i-'0') ) {
                    data+=(char)i;
                }
            }
            f3.write(data);
            
        }catch(Exception e) {
            System.out.println(e);
        }finally {
            try {
                if(f1 != null)
                    f1.close();
                if(f3 != null)
                    f3.close();
            }catch( Exception e) {
                System.out.println(e);
            }
        }
    }
}
