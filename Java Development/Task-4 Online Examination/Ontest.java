import java.util.Scanner;

public class Ontest{
    public static void main(String[] args) {
        int ch=4;
        int choice;
        String name,surname;
        int id=0;
        Scanner sc=new Scanner(System.in);
      
          System.out.print("Enter user name:");
               name=sc.next();
               System.out.print("Enter user surname:");
              surname=sc.next();
                System.out.print("Enter roll no:");
                id=sc.nextInt();
                int count=0;
                 System.out.println("\t\tWelcome "+name+" "+surname+" to Oasis Online Examination");
        
        do
        {
       
     
        System.out.println("1.Take Exam");
        System.out.println("2.View Marks");
        System.out.println("3.Exit");
            System.out.print("Enter your choice:");
        ch=sc.nextInt();
        if(ch==4)
        {
            System.out.println("Thank you for taking exam");
            break;
        }
        switch(ch)
        {
            case 1:
            {
                System.out.println("Select programming language:");
                System.out.println("1.C \n2.Java \n3.C++");
                System.out.println("Enter your choice:");
                int sub=sc.nextInt();
                System.out.println("There are 5 questions in the examination");
             
              
                System.out.println("Each question consist of 4 option you have to choose correct answer");
                if(sub==2)
                {
                    count=0;
                    System.out.println("Q.1.Java is developed by:");
                
                System.out.println("1.James Gosling \n2.Dennis Ritchie\n3.Steve Jobs\n4.Ken Thompson");
                System.out.print("Enter answer:");
                choice=sc.nextInt();
                if(choice==1)
                {
                    ++count;
                }
                System.out.println("Q.2.Java is:");
                System.out.println("1.High Level\n2.Low Level\n3.Middle Level\n4.Machine Level");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();
                if(choice==1)
                {
                    ++count;
                }
                  System.out.println("Q.3.Which component is used to compile, debug and execute the java programs?:");
                System.out.println("1.JRE\n2.JIT\n3.JDK\n4.JVM");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();
                  if(choice==3)
                {
                    ++count;
                }
                  System.out.println("Q.4.Technical Name of Core Java is knon as:");
                System.out.println("1.JSE\n2.JEE\n3.J2SE\n4.J2EE");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();
                  if(choice==1)
                {
                    ++count;
                }
                  System.out.println("Q.5.Which one of the following is not a Java feature?:");
                System.out.println("1.Object-oriented\n2.Use of pointers\n3.Portable\n4.Dynamic and Extensible");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();
                
                  if(choice==2)
                {
                    ++count;
                }
                }
                else if(sub==1)
                {
                    count=0;
                    System.out.println("Q.1.Who is the father of C language?:");
                
                System.out.println("1.Bjarne Strousrup\n2.Dennis Ritchie\n3.Steve Jobs\n4.Ken Thompson");
                System.out.print("Enter answer:");
                choice=sc.nextInt();
                if(choice==2)
                {
                    ++count;
                }
                System.out.println("Q.2.C is:");
                System.out.println("1.High Level\n2.Low Level\n3.Middle Level\n4.Machine Level");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();
                if(choice==3)
                {
                    ++count;
                }
                  System.out.println("Q.3.All keywords in C are in:");
                System.out.println("1.LowerCase letters\n2.LUpperCase letters\n3.CamelCase letters\n4.None of the mentioned");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();
                  if(choice==1)
                {
                    ++count;
                }
                  System.out.println("Q.4.Which of the following is not a valid C variable name?:");
                System.out.println("1.int number;\n2.float rate;\n3. int variable_count;\n4.int $main;");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();
                  if(choice==4)
                {
                    ++count;
                }
                  System.out.println("Q.5.C is:");
                System.out.println("1.Compiled Language\n2.Interpreted Language\n3.Both Compiled and Interpreted\n4.None");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();   
                if(choice==1)
                {
                    ++count;
                }
                }
                else
                {
                    count=0;
                       System.out.println("Q.1.Who invented C++?");
                
                System.out.println("1.Bjarne Strousrup\n2.Dennis Ritchie\n3.Steve Jobs\n4.Ken Thompson");
                System.out.print("Enter answer:");
                choice=sc.nextInt();
                if(choice==1)
                {
                    ++count;
                }
                System.out.println("Q.2.C++ is:");
                System.out.println("1.High Level\n2.Low Level\n3.Middle Level\n4.Machine Level");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();
                if(choice==3)
                {
                    ++count;
                }
                  System.out.println("Q.3. Which of the following is used for comments in C++?");
                System.out.println("1./* comment */\n2.// comment */\n3.// comment \n4.both // comment or /* comment */");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();
                  if(choice==4)
                {
                    ++count;
                }
                  System.out.println("Q.4.Which of the following user-defined header file extension used in c++?:");
                System.out.println("1.hg\n2.cpp\n3.h\n4.hf");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();
                  if(choice==3)
                {
                    ++count;
                }
                  System.out.println("Q.5. Which of the following type is provided by C++ but not C?:");
                System.out.println("1.double\n2.float\n3.int\n4.bool");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();   
                if(choice==4)
                {
                    ++count;
                }
                }
                
                
                break;
            }
            case 2:
            {
                System.out.println("Congrats  "+name+" "+surname+" You scored "+count+" marks"+"out of 5");
            }
                    
        }
        
        
    }while(true);
}
    
}