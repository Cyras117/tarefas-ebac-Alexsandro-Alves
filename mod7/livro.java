public class livro {
    public String titulo,autor,editora;
    private int quantidadeDePaginas,paginaAtual;
    /**
     * Classe para descrever um livro
     * 
     */

    public void setQuantidadeDePaginas(int quantidadeDePaginas) {
        this.quantidadeDePaginas = quantidadeDePaginas;
    }

    public int getQuantidadeDePaginas() {
        return quantidadeDePaginas;
    }
    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }
    public int getPaginaAtual() {
        return paginaAtual;
    }

    /**
     * Abre o livro em uma pagina especificada
     * @param numeroDaPagina
     */
    public void abrirNaPagina(int numeroDaPagina){
        if (numeroDaPagina > quantidadeDePaginas || numeroDaPagina <= 0) {
            System.out.println("Numero informado invalido");
            return;
        }
        setPaginaAtual(numeroDaPagina);   
    }
    
    /**
     * Abre o livro na primeira pagina
     */
    public void abrirNoInicio(){
        setPaginaAtual(1);
    }

    /**
     * Fecha o livro
     */
    public void fecharLivro(){
        System.out.println("Fechando livro");
    }

    /**
     * Imprime as informações do livro
     */
    public void mostrarInformcoesDoLivro(){
        System.out.println("Titulo:"+titulo);
        System.out.println("Autor:"+autor);
        System.out.println("Editora:"+editora);
        System.out.println("Total de paginas:"+getQuantidadeDePaginas());
    }
    
}
