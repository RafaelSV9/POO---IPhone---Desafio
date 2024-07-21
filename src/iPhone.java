public class iPhone implements ReprodutorMusicalInterface, AparelhoTelefonicoInterface, NavegadorNaInternetInterface {
    private ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
    private AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
    private NavegadorNaInternet navegadorNaInternet = new NavegadorNaInternet();

    @Override
    public void tocar() {
        reprodutorMusical.tocar();
    }

    @Override
    public void pausar() {
        reprodutorMusical.pausar();
    }

    @Override
    public void selecionarMusica(String musica) {
        reprodutorMusical.selecionarMusica(musica);
    }

    @Override
    public void ligar(String numero) {
        aparelhoTelefonico.ligar(numero);
    }

    @Override
    public void atender() {
        aparelhoTelefonico.atender();
    }

    @Override
    public void iniciarCorreioVoz() {
        aparelhoTelefonico.iniciarCorreioVoz();
    }

    @Override
    public void exibirPagina(String url) {
        navegadorNaInternet.exibirPagina(url);
    }

    @Override
    public void adicionarNovaAba() {
        navegadorNaInternet.adicionarNovaAba();
    }

    @Override
    public void atualizarPagina() {
        navegadorNaInternet.atualizarPagina();
    }

    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();
        meuIphone.tocar();
        meuIphone.ligar("123-456-7890");
        meuIphone.exibirPagina("www.exemplo.com");
    }
}
