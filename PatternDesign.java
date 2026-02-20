public class PatternDesign

{
    static void _1(){
        int n=7;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if((i-j>=0&&j<=n/2)&&(i+j<=n-1&&j<=n/2)){
                       System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }System.out.println(" ");
            }
    }
    static void _2(){
        int n=7;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if((i-j>=0&&j<=n/2)&&(i+j<=n-1&&j<=n/2)){
                        
                       System.out.print(n/2-j+" ");
                        
                    }else{
                        System.out.print(" ");
                    }
                }System.out.println(" ");
            }
    }
    static void _3(){
        int n=7;
            for(int i=0;i<n;i++){
                int a;
                if(n/2<i){
                    a=i-n/2;
                }else{
                    a=n/2-i;
                }
                for(int j=0;j<n;j++){
                    if((i-j>=0&&j<=n/2)&&(i+j<=n-1&&j<=n/2)){
                       System.out.print(a+j);
                    }else{
                        System.out.print(" ");
                    }
                }System.out.println(" ");
            }
    }
    static void _4(){
        int n=7;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if((i-j>=0&&j<=n/2)&&(i+j<=n-1&&j<=n/2)){
                       System.out.print((char)('D'-j));
                    }else{
                        System.out.print(" ");
                    }
                }System.out.println(" ");
            }
    }
   static void _5(){
        int n=7;
            for(int i=0;i<n;i++){
                int a;
                if(n/2<i){
                    a=i-n/2;
                }else{
                    a=n/2-i;
                }
                for(int j=0;j<n;j++){
                    if((i-j>=0&&j<=n/2)&&(i+j<=n-1&&j<=n/2)){
                       System.out.print((char)('A'+a+j));
                    }else{
                        System.out.print(" ");
                    }
                }System.out.println(" ");
            }
    }
    static void _6(){
        int n=7;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if((i-j<=0&&j>=n/2)&&(i+j>=n-1&&j>=n/2)){
                       System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }System.out.println(" ");
            }
    }
    
   static void _8(){
        int n=7;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if((i-j<=0&&j>=n/2)&&(i+j>=n-1&&j>=n/2)){
                       System.out.print(j-n/2);
                    }else{
                        System.out.print(" ");
                    }
                }System.out.println(" ");
            }
    }
    static void _9(){
        int n=7;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if((i-j<=0&&j>=n/2)&&(i+j>=n-1&&j>=n/2)){
                       System.out.print((char)('A'+(j-n/2)));
                    }else{
                        System.out.print(" ");
                    }
                }System.out.println(" ");
            }
    }
    static void _11() {
    int n = 5;   

    for (int i = 0; i < n; i++) {

        for (int s = 0; s < (n - i - 1) * 3; s++) {
            System.out.print(" ");
        }
        for (int j = 0; j <= i; j++) {
            System.out.print("  *  ");
        }

        System.out.println();
    }
}
static void _12() {
    int n = 5;   

    for (int i = 1; i <=n; i++) {

        for (int s = 0; s <(n - i - 1) * 3; s++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) {
            System.out.print( "   "+i+"  " );
        }

        System.out.println();
    }
}
static void _13() {
    int n = 5;   

    for (int i = 1; i <=n; i++) {

        for (int s = 0; s <(n - i - 1) * 3; s++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) {
            System.out.print( "   "+j+"  " );
        }

        System.out.println();
    }
}

static void _14() {
    int n = 5;   

    for (int i = 0; i <n; i++) {

        for (int s = 0; s <(n - i - 1) * 3; s++) {
            System.out.print(" ");
        }
        for (int j = 0; j <= i; j++) {
            System.out.print( "   "+(char)('A'+i)+"  " );
        }

        System.out.println();
    }
}
static void _15() {
    int n = 5;   

    for (int i = 0; i <n; i++) {

        for (int s = 0; s <(n - i - 1) * 3; s++) {
            System.out.print(" ");
        }
        for (int j = 0; j <= i; j++) {
            System.out.print( "   "+(char)('A'+j)+"  " );
        }

        System.out.println();
    }
}
static void _16() {
    int n =5 ;   

    for (int i = n+1; i>0; i--) {

        for (int s = 0;s<n-i;s++) {
            System.out.print("  ");
        }
        for (int j=0;j<i;j++) {
            System.out.print( " *  " );
        }

        System.out.println();
    }
}
static void _17() {
    int n = 5;   

    for (int i = n; i>0; i--) {

        for (int s=0;s<n-i;s++) {
            System.out.print("  ");
        }
        for (int j=0;j<i;j++) {
            System.out.print("  "+i+"  " );
        }

        System.out.println();
    }
}
static void _18() {
    int n = 5;   

    for (int i = n; i>0; i--) {

        for (int s=0;s<n-i;s++) {
            System.out.print("  ");
        }
        for (int j=i;j>0;j--) {
            System.out.print("  "+j+"  " );
        }

        System.out.println();
    }
}
static void _19() {
    int n = 5;   

    for (int i = n-1; i>=0; i--) {

        for (int s=0;s<n-i;s++) {
            System.out.print("  ");
        }
        for (int j=0;j<=i;j++) {
            System.out.print("  "+(char)('A'+i)+"  " );
        }

        System.out.println();
    }
}
static void _20() {
    int n = 5;   

    for (int i = n-1; i>=0; i--) {

        for (int s=0;s<n-i;s++) {
            System.out.print("  ");
        }
        for (int j=i;j>=0;j--) {
            System.out.print("  "+(char)('A'+j)+"  " );
        }

        System.out.println();
    }
}
static void _21() {
    int n = 5;   

    for (int i = n-1; i>=0; i--) {

        for (int s=0;s<n-i;s++) {
            System.out.print("  ");
        }
        for (int j=0;j<=i;j++) {
            System.out.print("  "+(char)('A'+j)+"  " );
        }

        System.out.println();
    }
}
static void _22() {
    int n = 5;

    // Upper half
    for (int i = 0; i < n; i++) {

        // left spaces
        for (int s = 0; s < n - i - 1; s++) {
            System.out.print(" ");
        }

        // stars
        for (int j = 0; j <= i; j++) {
            System.out.print("* ");
        }

        System.out.println();
    }

    // Lower half
    for (int i = n - 2; i >= 0; i--) {

        // left spaces
        for (int s = 0; s < n - i - 1; s++) {
            System.out.print(" ");
        }

        // stars
        for (int j = 0; j <= i; j++) {
            System.out.print("* ");
        }

        System.out.println();
    }
}
static void _23() {
    int n = 5;

    // Upper half
    for (int i = 1; i <=n; i++) {

        // left spaces
        for (int s = 0; s <n - i - 1; s++) {
            System.out.print(" ");
        }

        // stars
        for (int j = 1; j < i+1; j++) {
            System.out.print(" "+i+" ");
        }

        System.out.println();
    }

    // Lower half
    for (int i = n - 1; i > 0; i--) {

        // left spaces
        for (int s = 0; s < n - i - 1; s++) {
            System.out.print(" ");
        }

        // stars
        for (int j = 1; j < i+1; j++) {
            System.out.print(" "+i+" ");
        }

        System.out.println();
    }
}
static void _24() {
    int n = 5;

    // Upper half
    for (int i = 1; i <=n; i++) {

        // left spaces
        for (int s = 0; s <n - i - 1; s++) {
            System.out.print(" ");
        }

        // stars
        for (int j = 1; j < i+1; j++) {
            System.out.print(" "+j+" ");
        }

        System.out.println();
    }

    // Lower half
    for (int i = 1; i < n; i++) {

        for (int s = 0; s < i; s++) {
            System.out.print(" ");
        }

        for (int j = i + 1; j <= n; j++) {
            System.out.print(j + "  ");
        }

        System.out.println();
    }
}
static void _25() {
    int n = 5;

    // Upper half
    for (int i = 1; i <=n; i++) {

        // left spaces
        for (int s = 0; s <n - i - 1; s++) {
            System.out.print(" ");
        }

        // stars
        for (int j = 1; j < i+1; j++) {
            System.out.print(" "+j+" ");
        }

        System.out.println();
    }

    // Lower half
    for (int i = n - 1; i > 0; i--) {

        // left spaces
        for (int s = 0; s < n - i - 1; s++) {
            System.out.print(" ");
        }

        // stars
        for (int j = 1;j<i+1;j++) {
            System.out.print(" "+j+" ");
        }

        System.out.println();
    }
}
static void _26() {
    int n = 5;

    // Upper half
    for (int i = 0; i <n; i++) {

        // left spaces
        for (int s = 0; s <n - i - 1; s++) {
            System.out.print(" ");
        }

        // stars
        for (int j = 0; j <= i; j++) {
            System.out.print(" "+(char)('A'+i)+" ");
        }

        System.out.println();
    }

    // Lower half
    for (int i = n - 2; i >= 0; i--) {

        // left spaces
        for (int s = 0; s < n - i - 1; s++) {
            System.out.print(" ");
        }

        // stars
        for (int j = 0; j <= i; j++) {
            System.out.print(" "+(char)('A'+i)+" ");
        }

        System.out.println();
    }
}
static void _27() {
    int n = 5;

    // Upper half
    for (int i = 0; i <n; i++) {

        // left spaces
        for (int s = 0; s <n - i - 1; s++) {
            System.out.print(" ");
        }

        // stars
        for (int j = 0; j <= i; j++) {
            System.out.print(" "+(char)('A'+j)+" ");
        }

        System.out.println();
    }

    // Lower half
    for (int i =1;i<n;i++) {

        // left spaces
        for (int s = 0; s < i; s++) {
            System.out.print(" ");
        }

        // stars
        for (int j = i;j<n;j++) {
            System.out.print(" "+(char)('A'+j)+" ");
        }

        System.out.println();
    }
}
 static void _28(){
        int n=10;
            for(int i=0;i<n/2;i++){
                for(int j=0;j<n;j++){
                    if((i+j==n/2)||(i-j==-n/2)){
                       System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }System.out.println(" ");
            }
    }
    static void _29(){
    int n=9;

    for(int i=0;i<=n/2;i++){
        for(int j=0;j<=n;j++){
            if((i+j==n/2)||(i-j==-n/2)){
               System.out.print((i+1)+ " ");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
 static void _30(){
    int n=9;

    for(int i=0;i<=n/2;i++){
        for(int j=0;j<n;j++){
            if((i+j==n/2)||(i-j==-n/2)){
               System.out.print(n/2-i+1+ " ");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

static void _31(){
    int n=9;

    for(int i=0;i<=n/2;i++){
        for(int j=0;j<n;j++){
            if((i+j==n/2)||(i-j==-n/2)){
               System.out.print((char)('A'+i)+ " ");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
static void _32(){
    int n=9;

    for(int i=0;i<=n/2;i++){
        for(int j=0;j<n;j++){
            if((i+j==n/2)||(i-j==-n/2)){
               System.out.print((char)('A'+(n/2-i))+ " ");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
static void _33(){
    int n=9;

    for(int i=0;i<=n/2;i++){
        for(int j=0;j<n;j++){
            if((i+j==n-1)||(i-j==0)){
               System.out.print( "*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
static void _34(){
    int n=9;

    for(int i=n/2;i>=0;i--){
        for(int j=0;j<n;j++){
            if((i+j==n/2)||(i-j==-n/2)){
               System.out.print((n/2-i+1)+ " ");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
    static void _35(){
    int n=9;

    for(int i=n/2;i>=0;i--){
        for(int j=0;j<=n;j++){
            if((i+j==n/2)||(i-j==-n/2)){
               System.out.print((i+1)+ " ");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
static void _36(){
    int n=9;

    for(int i=n/2;i>=0;i--){
        for(int j=0;j<n;j++){
            if((i+j==n/2)||(i-j==-n/2)){
               System.out.print((char)('A'+(n/2-i))+ " ");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
 static void _37(){
    int n=9;

    for(int i=n/2;i>=0;i--){
        for(int j=0;j<=n;j++){
            if((i+j==n/2)||(i-j==-n/2)){
               System.out.print((char)('A'+i)+ " ");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
 static void _38(){
    int n=9;

    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if((i+j==n/2)||(i-j==-n/2)||(i-j==n/2)||(i+j==3*n/2&&i!=n-1)){
               System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
static void _39(){
    int n=9;

    for(int i=0;i<n/2;i++){
        for(int j=0;j<n;j++){
            if((i+j==n/2)||(i-j==-n/2)){
               System.out.print(i+1+" ");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    for(int i=n/2-2;i>=0;i--){
        for(int j=0;j<n;j++){
            if((i-j==-n/2)||(i+j==n/2)){
               System.out.print(i+1+" ");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
static void _40(){
    int n=9;

    for(int i=0;i<n/2;i++){
        for(int j=0;j<n;j++){
            if((i+j==n/2)||(i-j==-n/2)){
               System.out.print(n/2-i+1+" ");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    for(int i=n/2-2;i>=0;i--){
        for(int j=0;j<n;j++){
            if((i-j==-n/2)||(i+j==n/2)){
               System.out.print(n/2-i+1+" ");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
static void _41(){
    int n=9;

    for(int i=0;i<n/2;i++){
        for(int j=0;j<n;j++){
            if((i+j==n/2)||(i-j==-n/2)){
               System.out.print((char)('A'+i)+" ");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    for(int i=n/2-2;i>=0;i--){
        for(int j=0;j<n;j++){
            if((i-j==-n/2)||(i+j==n/2)){
               System.out.print((char)('A'+i)+" ");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
static void _42(){
    int n=9;

    for(int i=0;i<n/2;i++){
        for(int j=0;j<n;j++){
            if((i+j==n/2)||(i-j==-n/2)){
               System.out.print((char)('A'+n/2-i)+" ");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    for(int i=n/2-2;i>=0;i--){
        for(int j=0;j<n;j++){
            if((i-j==-n/2)||(i+j==n/2)){
               System.out.print((char)('A'+n/2-i)+" ");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
static void _43(){
    int n=9;

    for(int i=0;i<=n/2;i++){
        for(int j=0;j<n;j++){

            if((i+j<=n/2)||(i-j<=-n/2)){
               System.out.print(" * ");
            }else{
                System.out.print("   ");
            }

        }
        System.out.println();
    }
}
static void _44(){
    int n=9;

    for(int i=0;i<=n/2;i++){
        for(int j=0;j<n;j++){

            if((i-j>=0)||(i+j>=n-1)){
               System.out.print(" * ");
            }else{
                System.out.print("   ");
            }

        }
        System.out.println();
    }
}
static void _45(){
    int n=9;

    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){

            if((i-j>=0&&i+j<=n-1)||(i-j<=0&&i+j>=n-1)){
               System.out.print(" * ");
            }else{
                System.out.print("   ");
            }

        }
        System.out.println();
    }
}
static void _46() {
    int n = 5;   

    for (int i = 0; i < n; i++) {

        for (int s = 0; s < (n - i - 1) * 3; s++) {
            System.out.print(" ");
        }
        for (int j = 0; j <= i; j++) {
            System.out.print("   *   ");
        }

        for (int s = 0; s < (n - i - 1) * 3; s++) {
            System.out.print("  ");
        }
        for (int j = 0; j <= i; j++) {
            System.out.print("   *   ");
        }
        System.out.println();

    }
}
static void _47(){
    int n=7;

    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){

            if((i==n/2+1)||(i<n/2&&i+j>=n/2)&&(i<n/2&&i-j>=-n/2)){
               System.out.print(" * ");
            }else{
                System.out.print("   ");
            }

        }
        for(int j=0;j<n;j++){

            if((i==n/2+1)||(i<n/2&&i+j>=n/2)&&(i<n/2&&i-j>=-n/2)){
               System.out.print(" * ");
            }else{
                System.out.print("   ");
            }

        }
        System.out.println();
    }
}
 static void _48() {
    int n = 11;   

    for (int i = 0; i < n; i++) {
                
        for (int s = 0; s < (n - i - 1) * 3; s++) {
            System.out.print(" ");
        }

        for (int j = 0; j <= i; j++) {
               if(i > n/2 && j > i - n/2 && j < n/2){
                System.out.print("     ");   
            }else{
                System.out.print("  *  ");
            }
        }

        System.out.println();
    }
}
static void _49(){
    int n=5;

    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){

            if((i-j==0)||(i+j==n-1)){
               System.out.print(" * ");
            }else{
                System.out.print("   ");
            }

        }
        System.out.println();
    }
}
static void _50(){
    int n=5;

    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){

            if((i-j==0)||(i+j==n-1)){
               System.out.print(i+1+" ");
            }else{
                System.out.print("   ");
            }

        }
        System.out.println();
    }
}
static void _51(){
    int n=5;

    for(int i=n;i>0;i--){
        for(int j=0;j<n;j++){

            if((i-j==1) || (i+j==n)){
               System.out.print(i+" ");
            }else{
                System.out.print("   ");
            }

        }
        System.out.println();
    }
}
static void _52(){
    int n=5;

    for(int i=0;i<n;i++){
        for(int j=1;j<=n;j++){

            if((i==j-1) || (i+j==n)){
               System.out.print(j+" ");
            }else{
                System.out.print("   ");
            }

        }
        System.out.println();
    }
}
static void _53(){
    int n=5;

    for(int i=1;i<=n;i++){
        for(int j=n;j>0;j--){

            if(i+j==n+1||i==j){
               System.out.print(j+" ");
            }else{
                System.out.print(" ");
            }

        }
        System.out.println();
    }
}
static void _54(){
    int n=5;

    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){

            if((i+j==n-1) || (i==j)){
               System.out.print((char)('A'+i)+" ");
            }else{
                System.out.print("   ");
            }

        }
        System.out.println();
    }
}
static void _55(){
    int n=5;

    for(int i=0;i<n;i++){
        for(int j=0;j<=n;j++){

            if((i==j-1) || (i+j==n)){
               System.out.print((char)('A'+j-1)+" ");
            }else{
                System.out.print("   ");
            }

        }
        System.out.println();
    }
}
static void _56(){
    int n=5;

    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){

            if(i==j){
               System.out.print("o");
            }else{
                System.out.print("*");
            }

        }
        System.out.println();
    }
}
static void _57(){
    int n=5;

    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){

            if(i-j<=0){
               System.out.print("o");
            }else{
                System.out.print("*");
            }

        }
        System.out.println();
    }
}
static void _58(){
    int n=5;

    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){

            if(i-j==0||i+j==n-1){
               System.out.print("*");
            }else{
                System.out.print("o");
            }

        }
        System.out.println();
    }
}
static void _59(){
    int n=5;

    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){

            if(i==n/2&&j==n/2){
               System.out.print("o");
            }else{
                System.out.print("*");
            }

        }
        System.out.println();
    }
}
static void _60(){
    int n=5;

    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){

            if(i==n/2||j==n/2){
               System.out.print("*");
            }else{
                System.out.print(" ");
            }

        }
        System.out.println();
    }
}
static void _61(){
    int n=5;

    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){

            if(i==n/2||j==n/2){
               System.out.print("*");
            }else{
                System.out.print("o");
            }

        }
        System.out.println();
    }
}
static void _62(){
    int n=9;

    for(int i=0;i<n/2+1;i++){
        for(int j=0;j<n;j++){

            if((i+j>=n/2+1&&i+j<=n-1)){
               System.out.print("*");
            }else{
                System.out.print(" ");
            }

        }
        System.out.println();
    }
}
static void _63() {

    int n = 6;

    for (int i = 0; i < n; i++) {

        int stars = (i / 2 + 1) * 2;

        for (int j = 0; j < n; j++) {

            if (j < stars)
                System.out.print("*");
            else
                System.out.print(" ");
        }

        System.out.println();
    }
}
static void _64() {

    int n = 6;

    for (int i = 0;i<n;i++) {
        for (int j=0;j<n;j++) {

            if ((i<=n/4)||(i>n/4&&i<=n/2&&j<3*n/4)||(i>=3*n/4&&j<=n/4))
                System.out.print("*");
            else
                System.out.print(" ");
        }

        System.out.println();
    }
}
static void _65() {

    int n = 6;

    for (int i = 0;i<n;i++) {
        for (int j=0;j<n;j++) {

            if ((i<=n/4&&j>=3*n/4)||(i>n/4&&i<=n/2&&j>=n/2)||(i>=3*n/4))
                System.out.print("*");
            else
                System.out.print(" ");
        }

        System.out.println();
    }
}
static void _66() {

    int n = 6;

    for (int i = 0;i<n;i++) {
        for (int j=0;j<n;j++) {

            if ((i<=n/4)||(i>n/4&&i<3*n/4&&j>n/4)||(i>=3*n/4&&j>=3*n/4))
                System.out.print("*");
            else
                System.out.print(" ");
        }

        System.out.println();
    }
}
static void _67() {

    int n = 6;

    for (int i = 0;i<n;i++) {
        for (int j=0;j<=n/2;j++) {

            if ((j==0)||(i>n/4&&j<=n/4)||(i>=3*n/4&&j<n/2))
                System.out.print("*");
            else
                System.out.print(" ");
        }

        System.out.println();
    }
}
static void _68() {

    int n = 6;

    for (int i = 0;i<n;i++) {
        for (int j=0;j<n;j++) {

            if ((j==n-1)||(j==3*n/4&&i>n/4)||(i>=3*n/4&&j>=n/2))
                System.out.print("*");
            else
                System.out.print(" ");
        }

        System.out.println();
    }
}
static void _69() {

    int n = 6;

    for (int i = 0;i<n;i++) {
        for (int j=0;j<n;j++) {

            if ((j==0)||(i<3*n/4&&j<=n/4)||(i<=n/4&&j==n/2))
                System.out.print("*");
            else
                System.out.print(" ");
        }

        System.out.println();
    }
}
static void _70() {

    int n = 6;

    for (int i = 0;i<n;i++) {
        for (int j=0;j<n;j++) {

            if ((j==n-1)||(i<3*n/4&&j>=3*n/4)||(i<=n/4&&j>=n/2))
                System.out.print("*");
            else
                System.out.print(" ");
        }

        System.out.println();
    }
}
static void _71() {

    int n = 5;

    for (int i = 0;i<n;i++) {
        for (int j=0;j<n;j++) {

            if ((j==n/2)||(i>=3*n/4)||(i<=n/2&&i>=n/4&&j==3*n/4)||(i>=n/4&&i<=n/2&&j==n/4))
                System.out.print("*");
            else
                System.out.print(" ");
        }

        System.out.println();
    }
}
static void _72() {

    int n = 5;

    for (int i = 0;i<n;i++) {
        for (int j=0;j<n;j++) {

            if ((i*j==0)||(i==n-1)||(j==n-1))
                System.out.print("*");
            else
                System.out.print(" ");
        }

        System.out.println();
    }
}
static void _73() {

    int n = 5;

    for (int i = 0;i<n;i++) {
        for (int j=0;j<n;j++) {

            if ((i*j==0)||(i==n-1)||(j==n-1))
                System.out.print("*");
            else
                System.out.print("#");
        }

        System.out.println();
    }
}
static void _74() {

    int n = 7;

    for (int i = 0;i<n;i++) {
        for (int j=0;j<n;j++) {

            if ((i==n-1||j==0||i-j==0))
                System.out.print("*");
            else
                System.out.print(" ");
        }

        System.out.println();
    }
}
static void _75() {

    int n = 7;

    for (int i = 0;i<n;i++) {
        for (int j=0;j<n;j++) {

            if ((i*j==0)||(i==n-1)||(j==n-1)||(i-j==0)||(i+j==n-1))
                System.out.print("*");
            else
                System.out.print(" ");
        }

        System.out.println();
    }
}
static void _76() {

    int n = 5;
    int t=0,t1=1;int next=0;
    for (int i = 0;i<n;i++) {
        
        for (int j=0;j<n;j++) {
            if (i-j>=0){
                next=t+t1;
                t=t1;
               t1=next;
                System.out.print(" "+t+" ");
              }else
                System.out.print("  ");
        
        } System.out.println();
    }
       
    }
static void _77() {

    int n = 5;
    
    for (int i = 0;i<n;i++) {
        int t=0,t1=1;int next=0;
        
        for (int j=0;j<n;j++) {
            if (i-j>=0){
                
                
                System.out.print(" "+t+" ");
                next=t1+t;
                t=t1;
                t1=next;
              }else
                System.out.print("  ");
        
        } 
        System.out.println();
    }
       
    }
    static void _78() {

    int n = 4;int a=1;

    for (int i = 0;i<n;i++) {
        
        for (int j=0;j<n;j++) {

            if ((i-j>=0)){
                System.out.print(a);
                a++;
             } else
                System.out.print(" ");
        }

        System.out.println();
    }
}
static void _80(){

    int n = 5;

    for (int i = 0;i<n;i++) {
        
        for (int j=0;j<n;j++) {

            if ((i-j>=0)){
               if(i%2==0){
                System.out.print((j*2)+1+" ");
               }else{
                System.out.print((j*2)+2+" ");
               }
                
             } else
                System.out.print(" ");
        }

        System.out.println();
    }
}
static void _81() {

    int n = 4;int a=1;

    for (int i=0;i<n;i++) {
        
        for (int j=0;j<n;j++) {

            if ((i-j>=0)){
                System.out.print(a);
                a++;
             } else
                System.out.print(" ");
        }

        System.out.println();
    }
}
static void _83() {

    int n = 7;

    for (int i=0;i<n;i++) {
        
        for (int j=0;j<n/2;j++) {

            if ((i-j>=0)&&(i+j<n-1)){
                System.out.print((char)('A'+j)+" ");
    
             } else
                System.out.print(" ");
        }

        System.out.println();
    }
}
static void _84() {

    int n = 8;

    for (int i=0;i<n;i++) {
        
        for (int j=0;j<n;j++) {

            if ((j==0&&i>=n/2)||(j==1&&i>n/2)||(j==2)||(j==n/2&&i>=n/4)||(i==n-1&&j<3*n/4-1)){
                System.out.print("*");
    
             } else
                System.out.print(" ");
        }

        System.out.println();
    }
}
    static void _85() {

    int n = 7;

    for (int i=0;i<n;i++) {
        
        for (int j=0;j<n;j++) {

            if ((i==0&&j<=n/2)||(i==n/4&&j<n/2)||(i==n/4)||(i==n/2&&j<=3*n/4)||(i==0&&j<=n/2)||(j==0&&i<=n/2)){
                System.out.print("*");
    
             } else
                System.out.print(" ");
        }

        System.out.println();
    }
}
static void _86() {

         
    int n = 6;  
    for (int i = 1; i <= n-1; i++) {

        for (int j = 0; j < n; j++) {

            if (j % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print((j / 2 + 1) + " ");
            }

        }

        System.out.println();
    }
}

static void _87() {

         
    int n = 6;  
    for (int i = 0; i < n; i++) {

        for (int j = 1; j <= n-1; j++) {

            if (i % 2 == 0) {
                System.out.print(j + " ");
            } else {
                System.out.print((i / 2 + 1) + " ");
            }

        }

        System.out.println();
    }
}
static void _88() {

         
    int n = 9;  
    for (int i = 0; i < n; i++) {

        for (int j = 0; j <n; j++) {

            if ((i==n/2)||(j==n/2)||(i+j==n/2)||(i-j==-n/2)||(i+j==3*n/2)||(i-j==n/2)) {
                System.out.print(" *");
            } else {
                System.out.print( "  ");
            }

        }

        System.out.println();
    }
}
static void _89() {

         
    int n = 9;  
    for (int i = 0; i < n; i++) {

        for (int j = 0; j <n; j++) {

            if ((i==n/2)||(i-j==-n/2)||(i+j==3*n/2)) {
                System.out.print(" *");
            } else {
                System.out.print( "  ");
            }

        }

        System.out.println();
    }
}
static void _90() {

         
    int n = 9;  
    for (int i = 0; i < n; i++) {

        for (int j = 0; j <n; j++) {

            if ((i+j>n/2)&&(i-j>-n/2)&&(i-j<n/2)&&(i+j<3*n/2)) {
                System.out.print("  ");
            } else {
                System.out.print( " *");
            }

        }

        System.out.println();
    }
}
static void _91() {

         
    int n = 9;  
    for (int i = 0; i < n; i++) {

        for (int j = 0; j <n; j++) {

            if ((i+j>n/2+1)&&(i-j>-n/2+1)&&(i-j<n/2-1)&&(i+j<3*n/2-1)) {
                System.out.print("  ");
            } else {
                System.out.print( " *");
            }

        }

        System.out.println();
    }
}
static void _92() {

         
    int n = 12;  
    for (int i = 0; i < n+1; i++) {

        for (int j = 0; j <n+1; j++) {

            if ((i<n/4)||(i<n/2&&j<n/4+1)||(i>=n/2&&i<3*n/4)||(j>3*n/4&&i>=n/2)||(i>3*n/4)) {
                System.out.print(" *");
            } else {
                System.out.print( "  ");
            }

        }

        System.out.println();
    }
}
static void _93() {

         
    int n = 10;  
    for (int i = 0; i < n+1; i++) {

        for (int j = 0; j <n+1; j++) {

            if ((i-j>=n/2+3)||(i+j<=n/2-3)) {
                System.out.print(" ");
            } else {
                System.out.print( " *");
            }

        }

        System.out.println();
    }
}
static void _94() {

         
    int n = 8;  
    for (int i = 0; i < n/2; i++) {

        for (int j = 0; j <n; j++) {

            if ((i+j==n/2-1)||(i-j==-n/2)){
              System.out.print("/");
            }            
             else {
                System.out.print( " ");
            }

        }

        
        for (int j = 0; j <n; j++) {

            if ((i+j==n/2-1)||(i-j==-n/2)){
              System.out.print("/");
            }            
             else {
                System.out.print( " ");
            }

        }
        for (int j = 0; j <n; j++) {

            if ((i+j==n/2-1)||(i-j==-n/2)){
              System.out.print("/");
            }            
             else {
                System.out.print( " ");
            }

        }
        for (int j = 0; j <n; j++) {

            if ((i+j==n/2-1)||(i-j==-n/2)){
              System.out.print("/");
            }            
             else {
                System.out.print( " ");
            }

        }
        for (int j = 0; j <n; j++) {

            if ((i+j==n/2-1)||(i-j==-n/2)){
              System.out.print("/");
            }            
             else {
                System.out.print( " ");
            }

        }

        System.out.println();
    }
}
static void _95() {

         
    int n = 8;  
    for (int i = 0; i < n/2; i++) {

        for (int j = 0; j <n; j++) {

            if ((i+j==n/2-1)||(i-j==-n/2)){
              System.out.print("|");
            }            
             else {
                System.out.print( " ");
            }

        }

        
        for (int j = 0; j <n; j++) {

            if ((i+j==n/2-1)||(i-j==-n/2)){
              System.out.print("|");
            }            
             else {
                System.out.print( " ");
            }

        }
        for (int j = 0; j <n; j++) {

            if ((i+j==n/2-1)||(i-j==-n/2)){
              System.out.print("|");
            }            
             else {
                System.out.print( " ");
            }

        }
        for (int j = 0; j <n; j++) {

            if ((i+j==n/2-1)||(i-j==-n/2)){
              System.out.print("|");
            }            
             else {
                System.out.print( " ");
            }

        }
        for (int j = 0; j <n; j++) {

            if ((i+j==n/2-1)||(i-j==-n/2)){
              System.out.print("|");
            }            
             else {
                System.out.print( " ");
            }

        }

        System.out.println();
    }
}
static void _96() {

         
    int n = 10;  
    for (int i = 0; i < n/2; i++) {

        for (int j = 0; j <n; j++) {

            if ((i+j==n/2-1)||(i-j==-n/2)){
              System.out.print(  "0"+j);
            }            
             else {
                System.out.print( "  ");
            }

        }

        
        for (int j = 0; j <n; j++) {

            if ((i+j==n/2-1)||(i-j==-n/2)){
              System.out.print( "0"+j);
            }            
             else {
                System.out.print( "  ");
            }

        }
        for (int j = 0; j <n; j++) {

            if ((i+j==n/2-1)||(i-j==-n/2)){
              System.out.print( "0"+j);
            }            
             else {
                System.out.print( "  ");
            }

        }
        for (int j = 0; j <n; j++) {

            if ((i+j==n/2-1)||(i-j==-n/2)){
              System.out.print( "0"+j);
            }            
             else {
                System.out.print( "  ");
            }

        }
        for (int j = 0; j <n; j++) {

            if ((i+j==n/2-1)||(i-j==-n/2)){
              System.out.print( "0"+j);
            }            
             else {
                System.out.print( "  ");
            }

        }

        System.out.println();
    }
}

static void _97() {

         
    int n = 8;  
    for (int i = 0; i < n; i++) {

        for (int j = 0; j <n; j++) {

            if ((i+j==n/2-1)||(i-j==-n/2)){
              System.out.print((char)('A'+j));
            }            
             else {
                System.out.print( " ");
            }

        }

        
        for (int j = 0; j <n; j++) {

            if ((i+j==n/2-1)||(i-j==-n/2)){
              System.out.print((char)('A'+j));
            }            
             else {
                System.out.print( " ");
            }

        }
        for (int j = 0; j <n; j++) {

            if ((i+j==n/2-1)||(i-j==-n/2)){
              System.out.print((char)('A'+j));
            }            
             else {
                System.out.print( " ");
            }

        }
        for (int j = 0; j <n; j++) {

            if ((i+j==n/2-1)||(i-j==-n/2)){
              System.out.print((char)('A'+j));
            }            
             else {
                System.out.print( " ");
            }

        }
        for (int j = 0; j <n; j++) {

            if ((i+j==n/2-1)||(i-j==-n/2)){
              System.out.print((char)('A'+j));
            }            
             else {
                System.out.print( " ");
            }

        }

        System.out.println();
    }
}
static void _98() {

         
    int n = 8;  
    for (int i = 0; i < n; i++) {

        for (int j = 0; j <n; j++) {

            if ((i+j==n/2-1)||(i-j==-n/2)){
              System.out.print((char)('a'+j));
            }            
             else {
                System.out.print( " ");
            }

        }

        
        for (int j = 0; j <n; j++) {

            if ((i+j==n/2-1)||(i-j==-n/2)){
              System.out.print((char)('a'+j));
            }            
             else {
                System.out.print( " ");
            }

        }
        for (int j = 0; j <n; j++) {

            if ((i+j==n/2-1)||(i-j==-n/2)){
              System.out.print((char)('a'+j));
            }            
             else {
                System.out.print( " ");
            }

        }
        for (int j = 0; j <n; j++) {

            if ((i+j==n/2-1)||(i-j==-n/2)){
              System.out.print((char)('a'+j));
            }            
             else {
                System.out.print( " ");
            }

        }
        for (int j = 0; j <n; j++) {

            if ((i+j==n/2-1)||(i-j==-n/2)){
              System.out.print((char)('a'+j));
            }            
             else {
                System.out.print( " ");
            }

        }

        System.out.println();
    }
}
static void _99() {

         
    int n = 8;  
    for (int i = 0; i < n; i++) {

        for (int j = 0; j <n; j++) {

            if ((i+j==n/2-1)||(i-j==-n/2)){
              System.out.print((char)('Z'-j));
            }            
             else {
                System.out.print( " ");
            }

        }

        
        for (int j = 0; j <n; j++) {

            if ((i+j==n/2-1)||(i-j==-n/2)){
              System.out.print((char)('Z'-j));
            }            
             else {
                System.out.print( " ");
            }

        }
        for (int j = 0; j <n; j++) {

            if ((i+j==n/2-1)||(i-j==-n/2)){
              System.out.print((char)('Z'-j));
            }            
             else {
                System.out.print( " ");
            }

        }
        for (int j = 0; j <n; j++) {

            if ((i+j==n/2-1)||(i-j==-n/2)){
              System.out.print((char)('Z'-j));
            }            
             else {
                System.out.print( " ");
            }

        }
        for (int j = 0; j <n; j++) {

            if ((i+j==n/2-1)||(i-j==-n/2)){
              System.out.print((char)('Z'-j));
            }            
             else {
                System.out.print( " ");
            }

        }

        System.out.println();
    }
}

static void _100() {

         
    int n = 8;  
    for (int i = 0; i < n; i++) {

        for (int j = 0; j <n; j++) {

            if ((i+j==n/2-1)||(i-j==-n/2)){
              System.out.print((char)('z'-j));
            }            
             else {
                System.out.print( " ");
            }

        }

        
        for (int j = 0; j <n; j++) {

            if ((i+j==n/2-1)||(i-j==-n/2)){
              System.out.print((char)('z'-j));
            }            
             else {
                System.out.print( " ");
            }

        }
        for (int j = 0; j <n; j++) {

            if ((i+j==n/2-1)||(i-j==-n/2)){
              System.out.print((char)('z'-j));
            }            
             else {
                System.out.print( " ");
            }

        }
        for (int j = 0; j <n; j++) {

            if ((i+j==n/2-1)||(i-j==-n/2)){
              System.out.print((char)('z'-j));
            }            
             else {
                System.out.print( " ");
            }

        }
        for (int j = 0; j <n; j++) {

            if ((i+j==n/2-1)||(i-j==-n/2)){
              System.out.print((char)('z'-j));
            }            
             else {
                System.out.print( " ");
            }

        }

        System.out.println();
    }
}
static void _101() {

         
    int n = 8;  
    for (int i = 0; i < n/2; i++) {

        for (int j = 0; j <n; j++) {

            if ((i+j==n/2-1)||(i-j==-n/2)){
              System.out.print("o");
            }            
             else {
                System.out.print( " ");
            }

        }

        
        for (int j = 0; j <n; j++) {

            if ((i+j==n/2-1)||(i-j==-n/2)){
              System.out.print("o");
            }            
             else {
                System.out.print( " ");
            }

        }
        for (int j = 0; j <n; j++) {

            if ((i+j==n/2-1)||(i-j==-n/2)){
              System.out.print("o");
            }            
             else {
                System.out.print( " ");
            }

        }
        for (int j = 0; j <n; j++) {

            if ((i+j==n/2-1)||(i-j==-n/2)){
              System.out.print("o");
            }            
             else {
                System.out.print( " ");
            }

        }
        for (int j = 0; j <n; j++) {

            if ((i+j==n/2-1)||(i-j==-n/2)){
              System.out.print("o");
            }            
             else {
                System.out.print( " ");
            }

        }

        System.out.println();
    }
}
static void _102() {

         
    int n = 6;  
    for (int i = 0; i <= n/2; i++) {

        for (int j = 0; j <n; j++) {

            if ((j==1)||(j==n-2)||(i==0&&j>n/4&&j<3*n/4)||(i==n/2&&(j<=n/4||j>=3*n/4))){
              System.out.print(" *");
            }            
             else {
                System.out.print( "  ");
            }

        }
for (int j = 0; j <n; j++) {

            if ((j==1)||(j==n-2)||(i==0&&j>n/4&&j<3*n/4)||(i==n/2&&(j<=n/4||j>=3*n/4))){
              System.out.print(" *");
            }            
             else {
                System.out.print( "  ");
            }

        }
        for (int j = 0; j <n; j++) {

            if ((j==1)||(j==n-2)||(i==0&&j>n/4&&j<3*n/4)||(i==n/2&&(j<=n/4||j>=3*n/4))){
              System.out.print(" *");
            }            
             else {
                System.out.print( "  ");
            }

        }
        for (int j = 0; j <n; j++) {

            if ((j==1)||(j==n-2)||(i==0&&j>n/4&&j<3*n/4)||(i==n/2&&(j<=n/4||j>=3*n/4))){
              System.out.print(" *");
            }            
             else {
                System.out.print( "  ");
            }

        }
        
        
        System.out.println();
    }
}
static void _103() {

         
    int n = 6;  
    for (int i = 0; i <= n/2; i++) {

        for (int j = 0; j <n; j++) {

            if ((j==1)||(j==n-2)||(i==0&&j>n/4&&j<3*n/4)||(i==n/2&&(j<=n/4||j>=3*n/4))){
              System.out.print("&");
            }            
             else {
                System.out.print( " ");
            }

        }
for (int j = 0; j <n; j++) {

            if ((j==1)||(j==n-2)||(i==0&&j>n/4&&j<3*n/4)||(i==n/2&&(j<=n/4||j>=3*n/4))){
              System.out.print("&");
            }            
             else {
                System.out.print( " ");
            }

        }
        for (int j = 0; j <n; j++) {

            if ((j==1)||(j==n-2)||(i==0&&j>n/4&&j<3*n/4)||(i==n/2&&(j<=n/4||j>=3*n/4))){
              System.out.print("&");
            }            
             else {
                System.out.print( " ");
            }

        }
        for (int j = 0; j <n; j++) {

            if ((j==1)||(j==n-2)||(i==0&&j>n/4&&j<3*n/4)||(i==n/2&&(j<=n/4||j>=3*n/4))){
              System.out.print("&");
            }            
             else {
                System.out.print( " ");
            }

        }
        
        
        System.out.println();
    }
}
static void _104() {

         
    int n = 19;  
    for (int i = 0; i <= n/2-5; i++) {

        for (int j = 0; j <=n; j++) {
            if ((j<=n/4-3&&i<n/2-5)||(j>n/4-2&&j<=n/2-2&&i>0)||(j>n/2-1&&j<=n/2+1&&i<n/2-5)||(j>n/3+5&&j<=n/2+6&&i>0)||(i<n/2-5&&(j==n-2||j==n-1))){
              System.out.print("#");
            }            
             else {
                System.out.print( " ");
            }

        }
        

        
        System.out.println();
    }
}
static void _105() {

         
    int n = 5;  
    for (int i = 0; i < n; i++) {

        for (int j = 0; j <n; j++) {

            if ((i+j==n-1)||(i-j==0)) {
                System.out.print("*");
            } else {
                System.out.print( " ");
            }

        }
for (int j = 0; j <n; j++) {

            if ((i+j==n-1)||(i-j==0)) {
                System.out.print("*");
            } else {
                System.out.print( " ");
            }

        }
for (int j = 0; j <n; j++) {

            if ((i+j==n-1)||(i-j==0)) {
                System.out.print("*");
            } else {
                System.out.print( " ");
            }

        }
for (int j = 0; j <n; j++) {

            if ((i+j==n-1)||(i-j==0)) {
                System.out.print("*");
            } else {
                System.out.print( " ");
            }

        }

        System.out.println();
    }
}
static void _106() {

         
    int n = 5;  
    for (int i = 0; i < n; i++) {

        for (int j = 0; j <n; j++) {

            if ((i+j==n-1)||(i-j==0)) {
                System.out.print("][");
            } else {
                System.out.print( "  ");
            }

        }
for (int j = 0; j <n; j++) {

            if ((i+j==n-1)||(i-j==0)) {
                System.out.print("][");
            } else {
                System.out.print( "  ");
            }

        }
for (int j = 0; j <n; j++) {

            if ((i+j==n-1)||(i-j==0)) {
                System.out.print("][");
            } else {
                System.out.print( "  ");
            }

        }
for (int j = 0; j <n; j++) {

            if ((i+j==n-1)||(i-j==0)) {
                System.out.print("][");
            } else {
                System.out.print( "  ");
            }

        }

        System.out.println();
    }
}

static void _107() {

         
    int n = 5;  
    for (int i = 0; i < n; i++) {

        for (int j = 0; j <n; j++) {

            if ((i+j==n-1)||(i-j==0)) {
                System.out.print(">>");
            } else {
                System.out.print( "  ");
            }

        }
for (int j = 0; j <n; j++) {

            if ((i+j==n-1)||(i-j==0)) {
                System.out.print(">>");
            } else {
                System.out.print( "  ");
            }

        }
for (int j = 0; j <n; j++) {

            if ((i+j==n-1)||(i-j==0)) {
                System.out.print(">>");
            } else {
                System.out.print( "  ");
            }

        }
for (int j = 0; j <n; j++) {

            if ((i+j==n-1)||(i-j==0)) {
                System.out.print(">>");
            } else {
                System.out.print( "  ");
            }

        }

        System.out.println();
    }
}
static void _108() {

         
    int n = 9;  
    for (int i = 0; i < n; i++) {

        for (int j = 0; j <n; j++) {
if(i==n/2&&j==n/2){
                System.out.print( "o");
            }
            if ((i+j>n/2)&&(i-j>-n/2)&&(i+j<3*n/2)&&(i-j<n/2)) {
                System.out.print("*");
            }  else{
                System.out.print(" ");
            }

        }

        System.out.println();
    }
}

  public static void main(String []args){
_1(); System.out.println("  "); _2();System.out.println("  ");  _3();  System.out.println("  ");  _4();  System.out.println("  "); _5(); System.out.println("  "); _6(); System.out.println("  "); _8(); System.out.println("  "); _9();System.out.println("  ");_11();System.out.println("  ");_12();System.out.println("  ");_13();System.out.println("  ");_14();System.out.println("  ");_15(); System.out.println("  "); _16(); System.out.println("  "); _17(); System.out.println("  "); _18(); System.out.println("  "); _19();System.out.println("  ");_20();System.out.println("  ");_21(); System.out.println("  "); _22(); System.out.println("  "); _23(); System.out.println("  "); _24(); System.out.println("  "); _25(); System.out.println("  "); _26(); System.out.println("  "); _27(); System.out.println("  ");
 _28();System.out.println("  ");_29();System.out.println("  ");_30();System.out.println("  ");_31();System.out.println("  ");_32();System.out.println("  "); _33(); System.out.println("  "); _34(); System.out.println("  "); _35(); System.out.println("  "); _36(); System.out.println("  "); _37();System.out.println("  ");_38();System.out.println("  "); _39(); System.out.println("  ");_40();System.out.println("  ");_41();System.out.println("  ");_42();System.out.println("  ");_43();System.out.println("  ");_44(); System.out.println("  ");_45(); System.out.println("  ");_46();System.out.println("  ");_47();System.out.println("  ");_48();System.out.println("  "); _49(); System.out.println("  "); _50(); System.out.println("  "); _51(); System.out.println("  "); _52(); System.out.println("  "); _53(); System.out.println("  "); _54();System.out.println("  ");
 _55(); System.out.println("  "); _56(); System.out.println("  "); _57(); System.out.println("  "); _58(); System.out.println("  "); _59();System.out.println("  ");_60();System.out.println("  ");_61();System.out.println("  ");_62();System.out.println("  ");_63();System.out.println("  "); _64(); System.out.println(" "); _65(); System.out.println(" "); _66(); System.out.println("  ");
_67();System.out.println("  ");_68();System.out.println("  ");_69();System.out.println("  ");_70();
System.out.println("  ");_71();System.out.println("  ");_72();System.out.println("  ");
_73();System.out.println("  ");_74();System.out.println("  ");_75();System.out.println("  ");_76();System.out.println("  ");
_77();System.out.println("  ");_78();System.out.println("  ");_80();System.out.println("  ");_81();System.out.println("  ");
   _83();System.out.println("  ");_84();System.out.println("  ");_85();System.out.println("  ");_86();System.out.println("  ");
   _87();System.out.println("  ");_88();System.out.println("  ");_89();System.out.println("  ");_90();System.out.println("  ");
   _91();System.out.println("  ");_92();System.out.println("  ");_93();System.out.println("  ");_94();System.out.println();_95();System.out.println();
   _96();System.out.println();_97();System.out.println();_98();System.out.println();_99();System.out.println();_100();System.out.println();_101();
System.out.println();_102();System.out.println();_103();System.out.println();_104();System.out.println();_105();System.out.println();
_106();System.out.println();_107();System.out.println();_108();
}
}
