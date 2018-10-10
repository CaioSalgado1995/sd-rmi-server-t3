package br.com.utfpr.sd.rmi.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ClientCallback extends Remote {

	void callbackConsultaPassagem(String mensagem) throws RemoteException;
	
	void callbackCompraPassagem(String mensagem) throws RemoteException;
	
	void callbackConsultaHospedagem(String mensagem) throws RemoteException;
	
	void callbackCompraHospedagem(String mensagem) throws RemoteException;
	
	void callbackConsultaPacote(String mensagem) throws RemoteException;
	
	void callbackCompraPacote(String mensagem) throws RemoteException;
	
	void callbackRemoveRegistroDeInteresse(String mensagem) throws RemoteException;
	
	void callbackRegistraRegistroInteresse(String mensagem, int idRegistro) throws RemoteException;
}
