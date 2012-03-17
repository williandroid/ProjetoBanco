package banco;

public class Banco 
{

    public static void main(String[] args) 
    {
        Cliente cli1 = new Cliente();
        Cliente cli2 = new Cliente();
        Cliente cli3 = new Cliente("000.897.876.21", "Tiago Gouj", "Rua Wtagas", "21/09/1982", 1009.2f, "Axiliar Administrativo");

        Conta a = new Conta("1233", "2233-9", 122.3f);
        Conta b = new Conta("1234", "2233-10", 1298.4f);
        Conta c = new Conta("1235", "2233-11", 1456.4f);

         cli1.setConta(a);
         cli2.setConta(b);
         cli3.setConta(c);
         
         cli1.getConta.exibir();
         
         if (cli1.getRenda() > 2500)
         {
             cli1.getConta().exibir();
         }
         
         if(a.sacar(3000))
         {
             a.exibir();
         }
         else 
         {
             a.depositar(1500);
         }
                 

    }
}
