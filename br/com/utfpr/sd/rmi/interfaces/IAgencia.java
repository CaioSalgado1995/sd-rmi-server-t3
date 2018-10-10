package br.com.utfpr.sd.rmi.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

import br.com.utfpr.sd.rmi.modelos.Hospedagem;
import br.com.utfpr.sd.rmi.modelos.Pacote;
import br.com.utfpr.sd.rmi.modelos.Passagem;
import br.com.utfpr.sd.rmi.modelos.RegistroInteresse;

public interface IAgencia extends Remote {

	void consultaPassagem(Passagem passagem, ClientCallback callback) throws RemoteException;
	
	void compraPassagem(Passagem passagem, ClientCallback callback) throws RemoteException;
	
	void consultaHospedagem(Hospedagem hospedagem, ClientCallback callback) throws RemoteException;
	
	void compraHospedagem(Hospedagem hospedagem, ClientCallback callback) throws RemoteException;
	
	void consultaPacotes(Pacote pacote, ClientCallback callback) throws RemoteException;
	
	void compraPacotes(Pacote pacote, ClientCallback callback) throws RemoteException;
	
	void cadastrarRegistroInteresse(RegistroInteresse registro, ClientCallback callback) throws RemoteException;
	
	void removerRegistroInteresse(int idRegistro, ClientCallback callback) throws RemoteException;
	
	
}
