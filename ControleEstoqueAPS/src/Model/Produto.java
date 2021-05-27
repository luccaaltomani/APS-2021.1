package Model;

public class Produto {
    private int idProduto;
    private int idUsuario;
    private int idFornecedor;
    private String nomeProduto;
    private String categoriaProduto;
    private int codBarrasProduto;
    private double valorProduto;
    private double precoVendaProduto;
    private int qtdProduto;
    private int qtdMinimaProduto;

    public int getIdProduto() {
        return idProduto;
    }
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }
    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getCategoriaProduto() {
        return categoriaProduto;
    }
    public void setCategoriaProduto(String categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    public int getCodBarrasProduto() {
        return codBarrasProduto;
    }
    public void setCodBarrasProduto(int codBarrasProduto) {
        this.codBarrasProduto = codBarrasProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }
    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public double getPrecoVendaProduto() {
        return precoVendaProduto;
    }
    public void setPrecoVendaProduto(double precoVendaProduto) {
        this.precoVendaProduto = precoVendaProduto;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }
    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public int getQtdMinimaProduto() {
        return qtdMinimaProduto;
    }
    public void setQtdMinimaProduto(int qtdMinimaProduto) {
        this.qtdMinimaProduto = qtdMinimaProduto;
    }
    
}
