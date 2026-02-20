import java.util.*;
public class practice {
   static Scanner sc=new Scanner(System.in);
   static void freq(int a[],int n){
    int c=0;
    for(int i=0;i<n;i++)
for(int j=1;j<n-i-1;j++){
    if(a[i]==a[j]){
        c++;
    }System.out.println("frequency of"+a[i]+" "+c);
}System.out.println("highest frequency is"+c);
}
   static  void third(int a[],int n){
              for(int i=0;i<n;i++){
                for(int j=1;j<n-i-1;j++){
                    if(a[i]>a[j]){
                        int temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }
              } System.out.println(a[n-3]);
   }
   static  void third2(int a[],int n){
              int max1=a[0],max2=(1<<31),max3=(1<<31);
              for(int i=1;i<n;i++){
                   if(a[i]>max1){
                    max3=max2;
                    max2=max1;
                    max1=a[i];
                   }else if(a[i]<max1&&a[i]>max2){
                    max3=max2;
                    max2=a[i];
                   }else if(a[i]<max2&&a[i]>max3){
                    max3=a[i];
                   }
              } System.out.println(max3);
   }
   static void swap(int a[],int size) {
    int temp;
    for(int i=1;i<size;i++){
        temp=a[i];
        a[i]=a[i-1];
        a[i-1]=temp;
        System.out.print(" "+a[i-1]+" "+a[i]);
        i++;
    }
   }
   static void que(int a[],int n){
           
         for(int i=0;i<n;i++){
            for(int j=n-1;j>0;j--){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
               
            }
         }for(int i=0;i<n;i++){
             System.out.println(a[i]);
         }
   }
   static void que3(int a[],int n){
           
         int fast=n-1,slow=0;
         while(slow<=0){
           int temp=a[fast];
               a[fast]=a[slow];
               a[slow]=temp;
               fast--;
               slow++;
         }for(int i=0;i<n;i++){
            System.out.println(a[i]);
         }
   }
   static void ques(int a[],int n){
        int i=0;
        System.out.println(a[0]);
            for(int j=1;j<n;j++){
              a[j]=a[i]+a[j];
              i++;
               System.out.println(a[j]);
            } 
   }
   
      public static void main(String[]args){
    System.out.println("enter size");


int size=sc.nextInt();
int a[]=new int[size];
System.out.println("enter array elements");
for(int i=0;i<size;i++){
    a[i]=sc.nextInt();
}
que3(a,5);
System.out.println("third largest");
third(a,size);
System.out.println();
System.out.println("third2");
third2(a,size);
System.out.println();
System.out.println();
freq(a,size);
System.out.println();
que(a,size);
System.out.println();
//5
// 1
// System.out.println("swapping");
//swap(a,size);
System.out.println();
ques(a,size);
System.out.println();
System.out.println();

ques(a,size);

   }
}
