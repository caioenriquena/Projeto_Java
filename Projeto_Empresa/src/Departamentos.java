public enum Departamentos {

    ADMINISTRACAO("Administração"),
    MIDIA("Mídia"),
    ATENDIMENTO("Atendimento"),
    DIRECAOGERAL("Direção Geral");

    private String dpto;

    public String getDpto() {
        return dpto;
    }

    Departamentos(String dpto) {
        this.dpto = dpto;
    }
}
