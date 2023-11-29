package br.com.hapvida.beans;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Estoque {
	
	private int idEstoque;
    private String fornecedorEstoque;
    private String loteEstoque;
    private String controleMedicacaoEstoque;
    private LocalDate dataEntradaEstoque;
    private LocalDate dataSaidaEstoque;
    private int quantidadeEntrada;
    private int quantidadeSaida;

    public Estoque() {
        super();
    }

    public Estoque(int idEstoque, String fornecedorEstoque, String loteEstoque, String controleMedicacaoEstoque,
                   LocalDate dataEntradaEstoque, LocalDate dataSaidaEstoque, int quantidadeEntrada, int quantidadeSaida) {
        super();
        this.idEstoque = idEstoque;
        this.fornecedorEstoque = fornecedorEstoque;
        this.loteEstoque = loteEstoque;
        this.controleMedicacaoEstoque = controleMedicacaoEstoque;
        this.dataEntradaEstoque = dataEntradaEstoque;
        this.dataSaidaEstoque = dataSaidaEstoque;
        this.quantidadeEntrada = quantidadeEntrada;
        this.quantidadeSaida = quantidadeSaida;
    }

    public int getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(int idEstoque) {
        this.idEstoque = idEstoque;
    }

    public String getFornecedorEstoque() {
        return fornecedorEstoque;
    }

    public void setFornecedorEstoque(String fornecedorEstoque) {
        this.fornecedorEstoque = fornecedorEstoque;
    }

    public String getLoteEstoque() {
        return loteEstoque;
    }

    public void setLoteEstoque(String loteEstoque) {
        this.loteEstoque = loteEstoque;
    }

    public String getControleMedicacaoEstoque() {
        return controleMedicacaoEstoque;
    }

    public void setControleMedicacaoEstoque(String controleMedicacaoEstoque) {
        this.controleMedicacaoEstoque = controleMedicacaoEstoque;
    }

    public LocalDate getDataEntradaEstoque() {
        return dataEntradaEstoque;
    }

    public void setDataEntradaEstoque(LocalDate dataEntradaEstoque) {
        this.dataEntradaEstoque = dataEntradaEstoque;
        this.quantidadeEntrada++;
    }

    public LocalDate getDataSaidaEstoque() {
        return dataSaidaEstoque;
    }

    public void setDataSaidaEstoque(LocalDate dataSaidaEstoque) {
        this.dataSaidaEstoque = dataSaidaEstoque;
        this.quantidadeSaida++;
    }

    public int getQuantidadeEntrada() {
        return quantidadeEntrada;
    }

    public void setQuantidadeEntrada(int quantidadeEntrada) {
        this.quantidadeEntrada = quantidadeEntrada;
    }

    public int getQuantidadeSaida() {
        return quantidadeSaida;
    }

    public void setQuantidadeSaida(int quantidadeSaida) {
        this.quantidadeSaida = quantidadeSaida;
    }

    public int getQuantidadeAtual() {
        return quantidadeEntrada - quantidadeSaida;
    }

    public boolean medicamentoNoEstoque() {
        return dataSaidaEstoque == null;
    }

    public void registrarSaida(LocalDate dataSaida, int quantidadeSaida) {
        if (medicamentoNoEstoque() && quantidadeSaida <= this.quantidadeEntrada) {
            setDataSaidaEstoque(dataSaida);
            this.quantidadeSaida += quantidadeSaida;
            System.out.println("Medicamento retirado do estoque. Data de Saída: " + dataSaida.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        } else {
            System.out.println("Erro: Medicamento não disponível em quantidade suficiente no estoque.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("\nID do Estoque: " + idEstoque);
        System.out.println("Fornecedor: " + fornecedorEstoque);
        System.out.println("Lote: " + loteEstoque);
        System.out.println("Controle de Medicamento: " + controleMedicacaoEstoque);
        System.out.println("Data de Entrada: " + dataEntradaEstoque.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Data de Saída: " + (dataSaidaEstoque != null ? dataSaidaEstoque.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) : "N/A"));
        System.out.println("Quantidade de Entradas: " + quantidadeEntrada);
        System.out.println("Quantidade de Saídas: " + quantidadeSaida);
        System.out.println("Quantidade Atual no Estoque: " + getQuantidadeAtual());
    }

	
}
  