import java.util.*;

class Student{
   private int sid;
   private String sname;
   private int sroll;

   Student(int sid, String sname, int sroll){
      this.sid = sid;
      this.sname = sname;
      this.sroll = sroll;
   }

   public int getSid(){
      return sid;
   }
   public int getSroll(){
      return sroll;
   }
   public String getSname(){
      return sname;
   }

   public String toString(){
      return sid+" "+sname+" "+sroll;
   }
}

class CRUDDemo{
   public static void main(String[] args) {
      
     List<Student> c = new ArrayList<Student>();
      Scanner s = new Scanner(System.in);
      Scanner s1 = new Scanner(System.in);
      int ch;
      do{
         System.out.println("1.INSERT");
         System.out.println("2.DISPLAY");
         System.out.println("3.SEARCH");
         System.out.println("4.DELETE");
         System.out.println("5.UPDATE");
         System.out.print("Enter Your Choice : ");
         ch = s.nextInt();

         switch(ch){
            case 1:
               System.out.print("Enter studentid : ");
               int sid = s.nextInt();
               System.out.print("Enter StudentName : ");
               String sname = s1.nextLine();
               System.out.print("Enter Studentroll : ");
               int sroll= s.nextInt();

               c.add(new Student(sid,sname,sroll));
            break;
            case 2:
               System.out.println("----------------------------");
               Iterator<Student> i = c.iterator();
               while(i.hasNext()){
                  Student e = i.next(); 
                  System.out.println(e);
               }
               System.out.println("----------------------------");
            break;
            case 3:
               boolean found = false;
               System.out.print("Enter Studentid to Search :");
               int stid = s.nextInt();
               System.out.println("----------------------------");
               i = c.iterator();
               while(i.hasNext()){
                  Student e = i.next();
                  if(e.getSid() == stid)  {
                     System.out.println(e);
                     found = true;
                  }
               }
               
               if(!found){
                  System.out.println("Record Not Found");
               }
               System.out.println("----------------------------");
            break;

            case 4:
               found = false;
               System.out.print("Enter Sid to Delete :");
               sid = s.nextInt();
               System.out.println("----------------------------");
               i = c.iterator();
               while(i.hasNext()){
                  Student e = i.next();
                  if(e.getSid() == sid)  {
                     i.remove();
                     found = true;
                  }
               }
               
               if(!found){
                  System.out.println("Record Not Found");
               }else{
                  System.out.println("Record is Deleted Successfully...!");
               }

               System.out.println("----------------------------");
            break;
            case 5:
               found = false;
               System.out.print("Enter Sid to Update :");
               sid = s.nextInt();
               
               ListIterator<Student>li = c.listIterator();
               while(li.hasNext()){
                  Student e = li.next();
                  if(e.getSid() == sid)  {
                     System.out.print("Enter new Name : ");
                     sname = s1.nextLine();

                     System.out.print("Enter new rollno: ");
                     sroll = s.nextInt();
                     li.set(new Student(sid,sname,sroll));
                     found = true;
                  }
               }
               
               if(!found){
                  System.out.println("Record Not Found");
               }else{
                  System.out.println("Record is Updated Successfully...!");
               }

               
            break;

            
         }
      }while(ch!=0);
   }
}




     




