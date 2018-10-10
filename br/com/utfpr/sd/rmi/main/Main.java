package br.com.utfpr.sd.rmi.main;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import br.com.utfpr.sd.rmi.interfaces.IAgencia;
import br.com.utfpr.sd.rmi.implementacoes.Agencia;

public class Main {

	public static void main(String[] args) {
		System.out.println("iniciando servidor ...");
		try {
			Registry names = LocateRegistry.createRegistry(1099);
			IAgencia agencia = new Agencia();
			
			names.bind("IAgencia", agencia);
			System.out.println("Servidor pronto ... ");
		} catch (RemoteException e) {
			System.out.println("Erro ao inicializar o servidor ...");
		} catch (AlreadyBoundException e) {
			System.out.println("Erro ao fazer bind da referência ...");
		}
		
	
	}
	
}
