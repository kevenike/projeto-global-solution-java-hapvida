package br.com.hapvida.beans;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Farmacia {

	private int idFuncionario;
	private LocalDateTime horarioDoFuncionario;
	private String enderecoFarmacia;
	private Estoque estoque;
	private Medicacao medicacao;
	private Paciente paciente;

	
	public int getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public LocalDateTime getHorarioDoFuncionario() {
		return horarioDoFuncionario;
	}

	public void setHorarioDoFuncionario(LocalDateTime horarioDoFuncionario) {
		this.horarioDoFuncionario = horarioDoFuncionario;
	}

	public String getEnderecoFarmacia() {
		return enderecoFarmacia;
	}

	public void setEnderecoFarmacia(String enderecoFarmacia) {
		this.enderecoFarmacia = enderecoFarmacia;
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

	public Medicacao getMedicacao() {
		return medicacao;
	}

	public void setMedicacao(Medicacao medicacao) {
		this.medicacao = medicacao;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public void registrarEntradaFuncionario() {
		horarioDoFuncionario = LocalDateTime.now();
		System.out.println("\nEntrada do funcionário registrada: " + formatarHorario(horarioDoFuncionario));
	}

	public void registrarSaidaFuncionario() {
		if (horarioDoFuncionario == null) {
			System.out.println("Erro: Funcionário não registrou entrada.");
		} else {
			LocalDateTime horarioSaida = LocalDateTime.now();
			System.out.println("\nSaída do funcionário registrada: " + formatarHorario(horarioSaida));
			calcularTempoTrabalho(horarioSaida);
		}
	}

	private String formatarHorario(LocalDateTime horario) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		return horario.format(formatter);
	}

	private void calcularTempoTrabalho(LocalDateTime horarioSaida) {
		long minutosTrabalhados = java.time.Duration.between(horarioDoFuncionario, horarioSaida).toMinutes();
		System.out.println("Tempo total de trabalho: " + minutosTrabalhados + " minutos.");
	}

}
