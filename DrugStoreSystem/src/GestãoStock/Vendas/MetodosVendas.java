/*
 * Metodos do Submodulo Vendas(Gestao de Stock)
 */
package GestãoStock.Vendas;

/**
 *
 * @author Valeriano Filipe Calológio
 */
public interface MetodosVendas {
    /*
    *   Metodo de venda de produto: decrementa o produto no Stock atual & incrementa
    *   na Compra do Cliente "saco de compras".
    */
    public void venderProduto();
}
