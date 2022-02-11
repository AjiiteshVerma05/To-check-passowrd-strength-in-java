import java.util.Scanner;

public class password_check
{
   public static void main(String[] args)
   {
      int passLength=10; 
      int upChar=0;
      int lowChar=0;
      int spec=0;
      int num=0;
      char ch;
      Scanner in = new Scanner(System.in);
      
      System.out.print("Enter the Password: ");
      String password = in.nextLine();
      String passtrim=password.trim();
      int ttl = passtrim.length();
      if(ttl<passLength)
      {
         System.out.println("Password too small");
         return;
      }
      else
      {
         for(int i=0; i<ttl; i++)
         {
            ch = passtrim.charAt(i);
            if(Character.isUpperCase(ch))
            {
               upChar = 1;
            }
            else if(Character.isLowerCase(ch))
            {
               lowChar = 1;
            }
            else if(Character.isDigit(ch))
            {
               num = 1;
            }
            else
            {
               spec = 1;
            }
         }
      }
      if(upChar==1 && lowChar==1 && num==1 && spec==1)
         System.out.println("The Password is Strong.");
      else
         System.out.println("The Password is Weak.");
   }
}