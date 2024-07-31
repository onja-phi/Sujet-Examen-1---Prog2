# Sujet-Examen-1-Prog2    STD23035

A-Theorie 
  1.L'annotation @Override signifie que une méthode est hérité d'une classe parente et à surcharger dans une classe descendante.
  2.On a besoin de redefinir equals et hashCode en même temps car même si la méthode equals equals est utilisé pour determiner si deux objets sont équivalents, 
    la méthode hashCode est nécessaire pour des comparaisons rapides
  3.Le polymorphisme statique c'est l'utilisation d'une méthode mais avec des arguments différents dans la même classe. Ainsi,  le compilateur choisi la bonne méthode correpondant à 
    appeler au moment de la compilation.
    Par exemple dans une classe Calcul, il y a 3 méthodes "add" avec des arguments et type différents. Le compilateur connait après quel est la méthode à appeler:

        public class Calcul {  
              public int add(int a, int b) {  
              return a + b;  
              }  
              
              public int add(int a, int b, int c) {  
              return a + b + c;  
              }  
              public static void main(String[] args) {  
              Calcul calculator = new Calculator();  
              System.out.println(calcul.add(2.5, 3.7,));  
              System.out.println(calculat.add(1, 2, 3));  
              }  
        }  
