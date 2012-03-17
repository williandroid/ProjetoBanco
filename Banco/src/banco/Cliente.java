
package banco;

public class Cliente 
{
   private String cpf;
    	private String nome;
    	private String endereco;
    	private String data_nascimento;
    	private float renda;
    	private String profissao;
        private Conta conta;
        
    	
    	public Cliente(String cpf, String nome, String endereco, String data_nascimento, float renda, String profissao)
    	{
    		this.cpf = cpf;
    		this.nome = nome;
    		this.endereco = endereco;
    		this.data_nascimento = data_nascimento;
    		this.renda = renda;
    		this.profissao = profissao;
    	}
    	
    	public Cliente()
    	{
    		Teclado ler = new Teclado();
    		
    		cpf = ler.lerStrings("Digite o CPF: ");
    		nome = ler.lerStrings("Digite o NOME: ");
    		endereco = ler.lerStrings("Digite o ENDERE�O: ");
    		data_nascimento = ler.lerStrings("Digite a DATA DE NASCIMENTO: ");
    		renda = ler.lerReal("Digite a RENDA: ");
    		profissao = ler.lerStrings("Digite a PROFISS�O: "); 
    	}
    	
    	float calcularSalarioLiquido()
    	{
    		if(renda < 1200)
    		{
    			renda *= 0.07;    			
    		}
    		if(renda >= 1201 && renda <= 2750)
    		{
    			renda *= 0.165;	
    		}
    		else 
    		{
    			renda *= 0.275;
    		}
    		return renda;   		
    	}
    	
  		String montarCliente()
    	{
    		String valor = "";
    		valor = valor + "CPF: " + cpf + "\n";  
    		valor = valor + "NOME: " + nome + "\n";
    		valor = valor + "ENDERECO: " + endereco + "\n";
    		valor = valor + "DATA DE NASCIMENTO: " + data_nascimento + "\n";
    		valor = valor + "RENDA: " +  renda + "\n";
    		valor = valor + "PROFISS�O: " + profissao + "\n";  	
    		return valor;	
    	}
    	
    	
 //-----------------------------Metodos GET E SET---------------------
    	//GET cpf
    	public String getCpf()
    	{
    		return this.cpf;
    	}
    	
    	//SET cpf
    	public void setCpf(String cpf)
    	{
    		this.cpf = cpf;
    	}
    	
    	//GET nome
    	public String getNome()
    	{
    		return this.nome;
    	}
    	
    	//SET nome
    	public void setNome(String nome)
    	{
    		this.nome = nome;
    	}
    	
    	//GET endereco
    	public String getEndereco()
    	{
    		return this.endereco;
    	}
    	
    	//SET endereco
    	public void setEndereco(String endereco)
    	{
    		this.endereco = endereco;
    	}
    	
    	//GET data_nascimento
    	public String getData_nascimento()
    	{
    		return this.data_nascimento;
    	}
    	
    	//SET data_nascimento
    	public void setData_nascimento(String data_nascimento)
    	{
    		this.data_nascimento = data_nascimento;
    	}
    	
    	//GET renda
    	public float getRenda()
    	{
    		return this.renda;
    	}
    	
    	//SET renda
    	public void setRenda(float renda)
    	{
    		this.renda = renda;
    	}
    	
    	
	//GET profissao
    	public String getProfissao()
    	{
    		return this.profissao;
    	}
    	
    	//SET profissao
    	public void setProfissao(String profissao)
    	{
    		this.profissao = profissao;
    	}
    	
        
    	//GET Conta conta
    	public Conta getConta()
    	{
    		return this.conta;
    	}
    	
    	//SET profissao
    	public void setConta(Conta conta)
    	{
    		this.conta = conta;
    	}
    	 
}
