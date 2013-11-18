class Exercise3 {
	public static void main(String[] args) {
		int a = 1;
                int b = 2;
                int c = 3;
		isTriangle(a, b, c);
	System.out.println(isTriangle(a, b, c));


}
	public static boolean isTriangle(int a,int b,int c){
	  if(a > (b + c) || b > (a + c) || c > (a + b)){
	     return false;
          } else {
	     return true;
	  }
  }
}
