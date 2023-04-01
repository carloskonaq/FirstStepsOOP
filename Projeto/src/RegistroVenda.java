import java.text.DecimalFormat; // Importa a biblioteca de ponto flutuante
import java.util.ArrayList; // Importa a biblioteca para utilizar Arrays

public class RegistroVenda {

    private static ArrayList<Venda> registroVendas = new ArrayList<Venda>(); // Cria uma array de produtos vendidos

    public static void main(String[] args) {
        RegistroVenda reg1 = new RegistroVenda();

        // Estabelece todos os valores para as vendas
        Venda camisa = new Venda("00001", 230.00f, "07/03/2022");
        Venda calca = new Venda("00002", 312.90f, "02/07/2022");
        Venda sapato = new Venda("00003", 530.00f, "08/02/2022");
        Venda colar = new Venda("00004", 870.00f, "12/11/2022");
        Venda oculos = new Venda("00005", 120.00f, "21/12/2022");
        Venda meia = new Venda("00006", 30.00f, "12/01/2022");
        Venda cinto = new Venda("00007", 70.00f, "28/08/2022");
        Venda tenis = new Venda("80000", 710.00f, "18/04/2022");
        Venda bone = new Venda("90000", 90.80f, "09/03/2022");
        Venda touca = new Venda("00010", 75.10f, "01/08/2022");
        Venda blusa = new Venda("00011", 120.99f, "08/04/2022");
        Venda regata = new Venda("00022", 30.90f, "03/08/2022");
        Venda camiseta = new Venda("00033", 80.70f, "09/03/2022");
        Venda shortt = new Venda("00044", 70.00f, "13/12/2022");
        Venda bermuda = new Venda("00055", 20.90f, "22/01/2022");
        Venda luva = new Venda("00066", 15.00f, "13/02/2022");
        Venda cachecol = new Venda("00077", 25.90f, "29/09/2022");
        Venda sandalia = new Venda("88000", 100.00f, "19/05/2022");
        Venda chinelo = new Venda("99000", 15.80f, "10/04/2022");
        Venda jaqueta = new Venda("00110", 600.10f, "02/09/2022");

        reg1.registroVendas(camisa);
        reg1.registroVendas(calca);
        reg1.registroVendas(sapato);
        reg1.registroVendas(colar);
        reg1.registroVendas(oculos);
        reg1.registroVendas(meia);
        reg1.registroVendas(cinto);
        reg1.registroVendas(tenis);
        reg1.registroVendas(bone);
        reg1.registroVendas(touca);
        reg1.registroVendas(blusa);
        reg1.registroVendas(regata);
        reg1.registroVendas(camiseta);
        reg1.registroVendas(shortt);
        reg1.registroVendas(bermuda);
        reg1.registroVendas(luva);
        reg1.registroVendas(cachecol);
        reg1.registroVendas(sandalia);
        reg1.registroVendas(chinelo);
        reg1.registroVendas(jaqueta);

        System.out.println("-------------------- Produtos --------------------");
        // Imprime na tela o vetor de vendas com todas as informações
        for (Venda func : reg1.getRegistroVendas()) {
            System.out.println(" A venda " + func.getCodigo() + ", valor R$" + func.getValor() + " foi vendida na data: "
                    + func.getData());
        }

        // Chama as funções para calcular a maior venda e a média do valor de vendas
        float totalVenda = reg1.totalVendas();
        float maiorVenda = reg1.maiorVenda();
        float mediaVenda = reg1.valorMedio();

        // Código para ajustar o tamanho das casas decimais
        DecimalFormat frmt = new DecimalFormat();
		frmt.setMaximumFractionDigits(2);
        
        // Imprime na tela os valores das funções
        System.out.println("-------------------- Dados --------------------");

        System.out.println(" O total de vendas é R$" + totalVenda + "\n A maior venda é de R$" + maiorVenda
                + "\n O valor médio das vendas é de R$" + frmt.format(mediaVenda));
    }

    // Insere uma venda no registro de vendas
    public void registroVendas(Venda novaVenda) {
        registroVendas.add(novaVenda);

    }

    public ArrayList<Venda> getRegistroVendas() {
        return registroVendas;
    }

    public void setRegistroVendas(ArrayList<Venda> registroVendas) {
        RegistroVenda.registroVendas = registroVendas;
    }

    // Função para mostrar a soma de todas as vendas
    public float totalVendas() {
        int total=0;
		
		for(int i = 0; i < registroVendas.size(); i++) {
			total += registroVendas.get(i).getValor();
		} 	
		return (float) total;
    }

    // Função para calcular o valor da maior venda
    public float maiorVenda() {
        float maior = 0;

        for (int i = 0; i < registroVendas.size(); i++) {
            if (registroVendas.get(i).getValor() > maior) {
                maior = registroVendas.get(i).getValor();
            }
        }
        return (float) maior;
    }

    // Função para calcular a media dos valores de venda
    public float valorMedio() {
        float soma = 0f;

        for (int i = 0; i < registroVendas.size(); i++) {
            soma += registroVendas.get(i).getValor();
        }
        return (float) soma / registroVendas.size();
    }
}
