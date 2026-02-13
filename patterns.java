public class patterns {


 static void _0(int n){
     for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
           if((j==0)||(j==n/2)||(j<=n/2&&(i==0||i==n-1))){
               System.out.print(" *");
           }else{
               System.out.print("  ");
           }
       }System.out.println(" ");
   }
}
static void _1(int n){
     for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
           if((j==n/2)||(i==n-1&&j>=n/4&&j<=3*n/4)||(j==n/4&&i>=3*n/4)||(j==3*n/4&&i>=3*n/4)||(i+j==n/2&&i-j<=0)){
               System.out.print(" *");
           }else{
               System.out.print("  ");
           }
       }System.out.println(" ");
   }
}
static void _2(int n){
     for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
           if((j==n/2&&i<=n/2)||(i==0&&j<=n/2)||(i==n-1&&j<=3*n/4)||(i+j==n-1&&j<=n/2)||(j==3*n/4&&i>=3*n/4)||(j==0&&i<=n/4)){
               System.out.print(" *");
           }else{
               System.out.print("  ");
           }
       }System.out.println(" ");
   }
}
static void _3(int n){
     for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
           if((i==0&&j<=n/2)||(i+j==n/2)||(i==n/2&&j<=n/2)||(i+j==n-1&&j<=n/2)){
               System.out.print(" *");
           }else{
               System.out.print("  ");
           }
       }System.out.println(" ");
   }
}
static void _4(int n){
     for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
           if(i==n/2||j==n/2||(i+j==n/2&&j<=n/2)){
               System.out.print(" *");
           }else{
               System.out.print("  ");
           }
       }System.out.println(" ");
   }
}
static void _5(int n){
     for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
           if((i==0&&j<=n/2)||(i==n/2&&j<=n/2)||(j==n/2&&i>=n/2)||(i==n-1&&j<=n/2)||(j==0&&i>=3*n/4)||(j==0&&i<=n/2)){
               System.out.print(" *");
           }else{
               System.out.print("  ");
           }
       }System.out.println(" ");
   }
}
static void _6(int n){
     for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
           if((j==n/4)||(i==n/2&&j>=n/4&&j<=3*n/4)||(i==0&&j>=n/4&&j<=3*n/4)||(i==n-1&&j>=n/4&&j<=3*n/4)||(j==3*n/4&&i>=n/2)){
               System.out.print(" *");
           }else{
               System.out.print("  ");
           }
       }System.out.println(" ");
   }
}
static void _7(int n){
     for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
           if((j==n/2)||(i==0&&j<=n/2)||(i==n/2&&j>=n/4&&j<=3*n/4)||(j==0&&i<=n/4)){
               System.out.print(" *");
           }else{
               System.out.print("  ");
           }
       }System.out.println(" ");
   }
}
static void _8(int n){
     for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
           if((j==0)||(j==n/2)||(j<=n/2&&(i==0||i==n/2||i==n-1))){
               System.out.print(" *");
           }else{
               System.out.print("  ");
           }
       }System.out.println(" ");
   }
}
static void _9(int n){
     for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
           if((j==3*n/4)||(i==0&&j>=n/4&&j<=3*n/4)||(j==n/4&&i<=n/2)||(i==n/2&&j>=n/4&&j<=3*n/4)||(i==n-1&&j>=n/4&&j<=3*n/4)||(j==n/4&&i>=3*n/4)){
               System.out.print(" *");
           }else{
               System.out.print("  ");
           }
       }System.out.println(" ");
   }
}
static void a(int n){
 
   for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
           if((j==n/4&&i>=n/4)||(j==3*n/4&&i>=n/4)||(i==n/2&&j>=n/4&&j<=3*n/4)||(i+j==n/2&&i-j<=0)|| (i-j==-n/2&&i+j<=n-1)){
               System.out.print("*");
           }else{
               System.out.print(" ");
           }
       }System.out.println(" ");
    }
}
static void b(int n){
 
   for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
           if((j==0)||(j==n/2)||(j<=n/2&&(i==0||i==n/2||i==n-1))){
               System.out.print(" *");
           }else{
               System.out.print("  ");
           }
       }System.out.println(" ");
   }
}
static void c(int n){
 
   for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
           if((j==0)||(i==0&&j<=n/2)||(i==n-1&&j<=n/2)||(j==n/2&&i<=n/4)||(j==n/2&&i>=3*(n/4))){
               System.out.print(" *");
           }else{
               System.out.print("  ");
           }
       }System.out.println(" ");
   }
}
static void d(int n){
 
   for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
           if((j==0)||(i==n-1&&j<=n/2)||(i==0&&j<=n/2)||(j==3*n/4&&i>=n/4&&i<=3*n/4)||(i+j==3*n/2&&j<=3*n/4)||(i-j==-n/2&&j<=3*n/4)){
               System.out.print("*");
           }else{
               System.out.print(" ");
           }
       }System.out.println(" ");
   }
}
  static void e(int n){
 
   for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
          if((j==0)||(i==0&&j<=3*n/4)||(i==n-1&&j<=3*n/4)||(i==n/2&&j<=n/2)||(j==n/2&&i>=n/4&&i<=3*n/4)||(j==3*n/4&&i<=n/4)||(j==3*n/4&&i>=3*n/4)){
        System.out.print(" *");
           }else{
               System.out.print("  ");
           }
       }System.out.println(" ");
   }
}

static void f(int n){
 
   for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
          if((j==0)||(i==0&&j<=3*n/4)||(i==n/2&&j<=n/2)||(j==3*n/4&&i<=n/4)){
        System.out.print(" *");
           }else{
               System.out.print("  ");
           }
       }System.out.println(" ");
   }
}
static void g(int n){
 
   for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
          if((i*j==0)||(i==n-1&&j<=n/2)||(j==n/2&&i>=n/2)||(i==n/2&&j>=n/4&&j<=n/2)||(j==n/4&&i>=n/4&&i<=n/2)||(i==n/4&&j>=n/4&&j<=3*n/4)||(j==3*n/4&&i>=n/4)){
        System.out.print(" *");
           }else{
               System.out.print("  ");
           }
       }System.out.println(" ");
   }
}
static void h(int n){
 
   for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
          if((j==n/4)||(j==3*n/4)||(i==n/2&&j>=n/4&&j<=3*n/4)){
        System.out.print(" *");
           }else{
               System.out.print("  ");
           }
       }System.out.println(" ");
   }
}
static void i(int n){
 
   for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
          if((i==0) || (i==n-1) || (j==n/2) ||(j==0 && (i<=n/4 || i>=3*n/4)) || (j==n-1 && (i<=n/4 || i>=3*n/4)))
{
        System.out.print(" *");
           }else{
               System.out.print("  ");
           }
       }System.out.println(" ");
   }
}
static void j(int n){
 
   for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
          if((i==0)||(j==n/2)||(i==n-1&&j<=n/2)||(j==0&&i>=3*n/4))
{
        System.out.print(" *");
           }else{
               System.out.print("  ");
           }
       }System.out.println(" ");
   }
}
static void k(int n){
 
   for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
          if((j==0)||(i+j==n/2&&j<=n/2)||(i-j==n/2&&j<=n/2)||(j==n/2&&(i<=n/4||i>=3*n/4)))
{
        System.out.print(" *");
           }else{
               System.out.print("  ");
           }
       }System.out.println(" ");
   }
}
static void l(int n){
 
   for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
          if((i==n-1)||(j==0)||(j==n-1&&i>=3*n/4)){
        System.out.print(" *");
           }else{
               System.out.print("  ");
           }
       }System.out.println(" ");
   }
}
static void m(int n){
 
   for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
          if((j==0)||(j==n-1)||(i-j==0&&j<=n/2)||(i+j==n-1&&j>=n/2)){
        System.out.print(" *");
           }else{
               System.out.print("  ");
           }
       }System.out.println(" ");
    }
}
 static void n(int n){
 
   for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
          if((j==0)||(j==n-1)||(i-j==0)){
        System.out.print(" *");
           }else{
               System.out.print("  ");
           }
       }System.out.println(" ");
   }
}
static void o(int n){
 
   for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
          if((j==n/4)||(j==3*n/4)||(i==0&&j>=n/4&&j<=3*n/4)||(i==n-1&&j>=n/4&&j<=3*n/4)){
        System.out.print(" *");
           }else{
               System.out.print("  ");
           }
       }System.out.println(" ");
   }
}
static void p(int n){
 
   for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
          if((j==0)||(i==0&&j<=n/2)||(i+j==n/2&&j<=n/2)){
        System.out.print(" *");
           }else{
               System.out.print("  ");
           }
       }System.out.println(" ");
   }
}
static void q(int n){
 
   for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
          if((j==0)||(j==3*n/4)||(i==0&&j<=3*n/4)||(i==n-1&&j<=3*n/4)||(i-j==0&&j>=n/2)){
        System.out.print(" *");
           }else{
               System.out.print("  ");
           }
       }System.out.println(" ");
   }
}
static void r(int n){
 
   for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
          if((j==0)||(j<=n/2&&i==0)||(i+j==n/2)||(i-j==n/2)){
        System.out.print(" *");
           }else{
               System.out.print("  ");
           }
       }System.out.println(" ");
   }
}
static void s(int n){
 n=16;
   
       for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
          if((i-j==0&&j>=n/4&&j<=3*n/4)||(i+j==n/2&&j>=n/4&&j<=n/2)||(i-j==-n/2&&j>=n/2&&j<=3*n/4)||(i+j==3*n/2&&j>=n/2&&j<=3*n/4)||(i-j==n/2&&j>=n/4&&j<=n/2)){
        System.out.print(" *");
           }else{
               System.out.print("  ");
           }
        }System.out.println(" ");
    }
}
static void t(int n){
 for(int i=0;i<n;i++){}
   for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
          if((i==0)||(j==n/2)||(i<=n/4&&(j==0||j==n-1))){
        System.out.print(" *");
           }else{
               System.out.print("  ");
           }
       }System.out.println(" ");
    }
   }

static void u(int n){
 n=16;
   for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
          if((j==n/4&&i<=3*n/4)||(j==3*n/4&&i<=3*n/4)||(i-j==n/2&&j>=n/4&&j<=n/2)||(i+j==3*n/2&&j>=n/2&&j<=3*n/4)){
        System.out.print(" *");
           }else{
               System.out.print("  ");
           }
       }System.out.println(" ");
   }
}
static void v(int n){
 
   for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
          if((i-j==n/2&&j<=n/2)||(i+j==3*n/2&&j>=n/2)){
        System.out.print(" *");
           }else{
               System.out.print("  ");
           }
       }System.out.println(" ");
   }
}
static void w(int n){
 
   for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
          if((j==0)||(j==n-1)||(i+j==n-1&&j<=n/2)||(i-j==0&&j>=n/2)){
        System.out.print(" *");
           }else{
               System.out.print("  ");
           }
       }System.out.println(" ");
   }
}
static void x(int n){
 
   for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
          if((i+j==n-1)||(i-j==0)){
        System.out.print(" *");
           }else{
               System.out.print("  ");
           }
       }System.out.println(" ");
   }
}
static void y(int n){
 
   for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
          if((i-j==0&&j<=n/2)||(i+j==n-1&&j>=n/2)||(j==n/2&&i>=n/2)){
        System.out.print(" *");
           }else{
               System.out.print("  ");
           }
       }System.out.println(" ");
   }
}static void z(int n){
 
   for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
          if((i==0)||(i==n-1)||(i+j==n-1)||(j==n-1&&i>=3*n/4)){
        System.out.print(" *");
           }else{
               System.out.print("  ");
           }
       }System.out.println(" ");
   }
}
public static void main(String [] args){
    int n=15;
    _0(n);
    System.out.println(" ");
    _1(n);
    System.out.println(" ");
    _2(n);
    System.out.println(" ");
    _3(n);
    System.out.println(" ");
    _4(n);
    System.out.println(" ");
    _5(n);
    System.out.println(" ");
    _6(n);
    System.out.println(" ");
    _7(n);
    System.out.println(" ");
    _8(n);
    System.out.println(" ");
    _9(n);
    System.out.println(" ");
    a(n);
    System.out.println(" ");
    b(n);
    System.out.println(" ");
    c(n);
    System.out.println(" ");
    d(n);
    System.out.println(" ");
    e(n);
    System.out.println(" ");
    f(n);
    System.out.println(" ");
    g(n);
    System.out.println(" ");
    h(n);
    System.out.println(" ");
    i(n);
    System.out.println(" ");
    j(n);
    System.out.println(" ");
    k(n);
    System.out.println(" ");
    l(n);
    System.out.println(" ");
    m(n);
    System.out.println(" ");
    n(n);
    System.out.println(" ");
    o(n);
    System.out.println(" ");
    p(n);
    System.out.println(" ");
    q(n);
    System.out.println(" ");
    r(n);
    System.out.println(" ");
    s(n);
    System.out.println(" ");
    t(n);
    System.out.println(" ");
    u(n);
    System.out.println(" ");
    v(n);
    System.out.println(" ");
    w(n);
    System.out.println(" ");
    x(n);
    System.out.println(" ");
    y(n);
    System.out.println(" ");
    z(n);
System.out.println(" ");
System.out.println("NAME");
a(n);s(n);m(n);a(n);


for(int i=0;i<n;i++){

    // A
    for(int j=0;j<n;j++){
        if((j==n/4&&i>=n/4)||(j==3*n/4&&i>=n/4)||(i==n/2&&j>=n/4&&j<=3*n/4)||(i+j==n/2&&i-j<=0)|| (i-j==-n/2&&i+j<=n-1)){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
    }

    System.out.print("   ");

    // S
    int ns = 16; 
    for(int j=0;j<ns;j++){
        if((i-j==0&&j>=ns/4&&j<=3*ns/4)||(i+j==ns/2&&j>=ns/4&&j<=ns/2)||(i-j==-ns/2&&j>=ns/2&&j<=3*ns/4)||(i+j==3*ns/2&&j>=ns/2&&j<=3*ns/4)||(i-j==ns/2&&j>=ns/4&&j<=ns/2)){
            System.out.print(" *");
        }else{
            System.out.print("  ");
        }
    }

    System.out.print("   ");

    // M
    for(int j=0;j<n;j++){
        if((j==0)||(j==n-1)||(i-j==0&&j<=n/2)||(i+j==n-1&&j>=n/2)){
            System.out.print(" *");
        }else{
            System.out.print("  ");
        }
    }

    System.out.print("   ");

    // A again
    for(int j=0;j<n;j++){
        if((j==n/4&&i>=n/4)||(j==3*n/4&&i>=n/4)||(i==n/2&&j>=n/4&&j<=3*n/4)||(i+j==n/2&&i-j<=0)|| (i-j==-n/2&&i+j<=n-1)){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
    }

    System.out.println();
}

}
}

