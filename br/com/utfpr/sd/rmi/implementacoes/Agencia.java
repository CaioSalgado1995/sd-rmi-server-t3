package br.com.utfpr.sd.rmi.implementacoes;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import br.com.utfpr.sd.rmi.interfaces.ClientCallback;
import br.com.utfpr.sd.rmi.interfaces.IAgencia;
import br.com.utfpr.sd.rmi.modelos.Hospedagem;
import br.com.utfpr.sd.rmi.modelos.Pacote;
import br.com.utfpr.sd.rmi.modelos.Passagem;
import br.com.utfpr.sd.rmi.modelos.RegistroInteresse;

public class Agencia extends UnicastRemoteObject implements IAgencia {
	
	private static final long serialVersionUID = -9110305914208512943L;
	private List<Passagem> listaPassagens = new ArrayList<Passagem>();
	
	
	public Agencia() throws RemoteException {
		super();
		criaListaPassagens();
	}

	private void criaListaPassagens() {
		Passagem p1 = new Passagem();
		p1.setDataIda("11/10/2018");
		p1.setDataVolta("14/10/2018");
		p1.setDestino("Florianopolis");
		p1.setNumeroPessoas(2);
		p1.setOrigem("Curitiba");
		p1.setTipo(2);
		
		this.listaPassagens.add(p1);
	}

	@Override
	public void consultaPassagem(Passagem passagem, ClientCallback callback) throws RemoteException {
		System.out.println("iniciando consulta de passagem");
		boolean passagemDisponivel = false;
		
		for (Passagem p : listaPassagens) {
			if(p.equals(passagem)) {
				passagemDisponivel = true;
			}
		}
		
		System.out.println("Finalizando ...");
		
		if(passagemDisponivel) {
			callback.callbackConsultaPassagem("Passagem disponivel");
		}else {
			callback.callbackConsultaPassagem("Passagem indisponível");
		}
	}

	@Override
	public void compraPassagem(Passagem passagem, ClientCallback callback) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void consultaHospedagem(Hospedagem hospedagem, ClientCallback callback) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void compraHospedagem(Hospedagem hospedagem, ClientCallback callback) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void consultaPacotes(Pacote pacote, ClientCallback callback) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void compraPacotes(Pacote pacote, ClientCallback callback) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cadastrarRegistroInteresse(RegistroInteresse registro, ClientCallback callback) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removerRegistroInteresse(int idRegistro, ClientCallback callback) throws RemoteException {
		// TODO Auto-generated method stub
		
	}
}
