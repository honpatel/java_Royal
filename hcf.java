class hcf { 
    public static void main(String[] args) {

        int n1 = 5, n2 = 10, num = 1;
    
        for(int i = 1; i <= n1 && i <= n2; i++) {
          if(n1 % i == 0 && n2 % i == 0)
            num = i;
        }
    
        int lcm = (n1 * n2) / num;
        System.out.print(" "+ lcm);
      }
}
