package github.LeandroBryto.domain.entity;

public class ItemPdido {
    private Integer id;
    private Pedido Pedido;
    private Produto produto;
    private Integer quantidade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public github.LeandroBryto.domain.entity.Pedido getPedido() {
        return Pedido;
    }

    public void setPedido(github.LeandroBryto.domain.entity.Pedido pedido) {
        Pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
