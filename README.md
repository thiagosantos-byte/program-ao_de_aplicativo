
class Iphone {
    private String Interface;
    private String modelo;

    public Iphone(String Interface, String modelo) {
        this.Interface = Interface;
        this.modelo = modelo;
    }

    public String getInterface() {
        return Interface;
    }

    public void setInterface(String Interface) {
        this.Interface = Interface;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}


class RepMsc extends Iphone {
    private String musica;
    private String duracao;

    public RepMsc(String Interface, String modelo, String musica, String duracao) {
        super(Interface, modelo);
        this.musica = musica;
        this.duracao = duracao;
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }
}


class Aptef extends Iphone {
    private String numero;

    public Aptef(String Interface, String modelo, String numero) {
        super(Interface, modelo);
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}


class Navegador extends Iphone {
    private String url;

    public Navegador(String Interface, String modelo, String url) {
        super(Interface, modelo);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}


public class Main {
    public static void main(String[] args) {
        RepMsc musica = new RepMsc("Touch", "iPhone 14", "Imagine", "3:05");
        musica.tocar();
        musica.selecionarMusica("Imagine");

        Aptef telefone = new Aptef("Touch", "iPhone 14", "99999-9999");
        telefone.ligar("99999-9999");
        telefone.atender();

        Navegador navegador = new Navegador("Touch", "iPhone 14", "www.google.com");
        navegador.exibirPagina("www.google.com");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}

<img width="704" height="628" alt="image" src="https://github.com/user-attachments/assets/e089ab7b-33a5-4b2b-9036-0901c8e43e99" />

