package com.gop.expertec.entite;

public class Client extends Personne {
	protected Long numeroClient;

	public Long getNumeroClient() {
		return numeroClient;
	}

	public void setNumeroClient(Long numeroClient) {
		this.numeroClient = numeroClient;
	}

	@Override
	public String toString() {
		return "Client [numeroClient=" + numeroClient + ", toString()="
				+ super.toString() + "]";
	}
}
