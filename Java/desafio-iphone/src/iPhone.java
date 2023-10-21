interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}

interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}

interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}

class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private String numeroSerie;
    private String sistemaOperacional;
    private boolean conectadoAInternet;

    public iPhone(String modelo, String numeroSerie, String sistemaOperacional) {
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
        this.sistemaOperacional = sistemaOperacional;
        this.conectadoAInternet = false;
    }

    public String getInformacoes() {
        return "Modelo: " + modelo + "\nNúmero de Série: " + numeroSerie + "\nSistema Operacional: " + sistemaOperacional;
    }    

    @Override
    public void tocar() {
        // Implementação para reproduzir música
    }

    @Override
    public void pausar() {
        // Implementação para pausar a reprodução de música
    }

    @Override
    public void selecionarMusica(String musica) {
        // Implementação para selecionar uma música
    }

    @Override
    public void ligar(String numero) {
        // Implementação para fazer uma chamada telefônica
    }

    @Override
    public void atender() {
        // Implementação para atender uma chamada telefônica
    }

    @Override
    public void iniciarCorreioVoz() {
        // Implementação para iniciar o correio de voz
    }

    @Override
    public void exibirPagina(String url) {
        // Implementação para exibir uma página na internet
    }

    @Override
    public void adicionarNovaAba() {
        // Implementação para adicionar uma nova aba no navegador
    }

    @Override
    public void atualizarPagina() {
        // Implementação para atualizar a página no navegador
    }
}