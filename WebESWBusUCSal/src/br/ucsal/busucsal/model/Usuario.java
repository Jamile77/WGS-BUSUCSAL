package br.ucsal.busucsal.model;

public class Usuario {
	
	private String matricula; 
	private String senhaUsuario;
	private String nomeUsuario; 
	private String papelUsuario; //USUARIO, COLABORADOR, ADMINISTRADOR
	
	
	public Usuario() { 
		super();
	}
	
	//CADASTRO PARA USUARIO
	public Usuario(String matricula, String senhaUsuario, String nomeUsuario) {
		super();
		this.matricula = matricula;
		this.senhaUsuario = senhaUsuario;
		this.nomeUsuario = nomeUsuario;
		this.papelUsuario = "USUARIO";
	}
	
	//CADASTRO PARA COLABORADOR E/OU ADMINISTRADOR
	public Usuario(String matricula, String senhaUsuario, String nomeUsuario, String papelUsuario) {
		super();
		this.matricula = matricula;
		this.senhaUsuario = senhaUsuario;
		this.nomeUsuario = nomeUsuario;
		this.papelUsuario = papelUsuario;
	}

	//GETTERS & SETTERS
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getPapelUsuario() {
		return papelUsuario;
	}

	public void setPapelUsuario(String papelUsuario) {
		this.papelUsuario = papelUsuario;
	}

	@Override
	public String toString() {
		return "Usuario [matricula=" + matricula + ", senhaUsuario=" + senhaUsuario + ", nomeUsuario=" + nomeUsuario
				+ ", papelUsuario=" + papelUsuario + "]\n";
	}
	
	
}