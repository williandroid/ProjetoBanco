package banco;


public class Conta 
{
    private String numero;
	private String agencia;
	private float saldo;
	Cliente cli = new Cliente();

	public Conta(String numero, String agencia, float saldo)
	{
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
	}

	public void exibir()
	{
		System.out.println("NUMERO DA CONTA: " + numero + "\n" + "NUMERO AGENCIA: " + agencia + "\n" + "SALDO: " + saldo + "\n");
		cli.montarCliente();
	}

	boolean sacar(float valor)
	{
		if(valor < saldo)
		{
			saldo -= valor;
			return true;
		}
		else
		{
			return false;
		}
	}

	public void depositar(float valor)
	{
		saldo += valor;
	}

//-----------------------------Metodos GET E SET---------------------
    	//GET numero
    	public String getNumero()
    	{
    		return this.numero;
    	}

    	//SET numero
    	public void setNumero(String numero)
    	{
    		this.numero = numero;
    	}

    	//GET agencia
    	public String getAgencia()
    	{
    		return this.agencia;
    	}

    	//SET agencia
    	public void setAgencia(String agencia)
    	{
    		this.agencia = agencia;
    	}

    	//GET saldo
    	public float getSaldo()
    	{
    		return this.saldo;
    	}

    	//SET saldo
    	public void setSaldo(float saldo)
    	{
    		this.saldo = saldo;
    	}
}
