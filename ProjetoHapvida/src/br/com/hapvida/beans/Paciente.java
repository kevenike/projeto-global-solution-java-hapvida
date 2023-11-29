package br.com.hapvida.beans;

public class Paciente {
	
	private int idPaciente;
	private String nomePaciente;
	private String sobrenomePaciente;
	private String cpfPaciente;
	private String sexoPaciente;
	
	
	public int getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}
	public String getNomePaciente() {
		return nomePaciente;
	}
	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente.toUpperCase();
	}
	public String getSobrenomePaciente() {
		return sobrenomePaciente;
	}
	public void setSobrenomePaciente(String sobrenomePaciente) {
		this.sobrenomePaciente = sobrenomePaciente.toUpperCase();
	}
	public String getCpfPaciente() {
		return cpfPaciente;
	}
	public void setCpfPaciente(String cpfPaciente) {
		this.cpfPaciente = cpfPaciente;
	}
	public String getSexoPaciente() {
		return sexoPaciente;
	}
	public void setSexoPaciente(String sexoPaciente) {
		 this.sexoPaciente = sexoPaciente.toUpperCase();
	}
	
	public String toString() {
		return "\nNome Do Paciente: " + nomePaciente + "\nSobrenome Do Paciente: " + sobrenomePaciente + "\nCPF Do Paciente: " + 
			   cpfPaciente + "\nSexo Do Paciente: " + sexoPaciente;
	}
	
	
}
