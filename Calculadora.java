class Calculadora{
  public static double soma(double num1, double num2){
    return num1 + num2;
  }
  public static double divisao(double num1, double num2){
    return num1 / num2;
  }
  public static double mult(double num1, double num2){
    return num1 * num2;
  }
  public static double subtra(double num1, double num2){
    return num1 - num2;
  }
  public static double maiorNum(double num1, double num2){
   return Math.max(num1,num2);
  }
  public static double menorNum(double num1, double num2){
   return Math.min(num1,num2);
  }
  public static double media(double num1, double num2){
    return (num1+num2)/2;
  }
  public static double quadrado(double num1, double num2){
    return (num1*num1)+(num2*num2);
  }
  
}