package com.gop.expertec.dto;

public class ClientDTO extends PersonneDTO {
	protected Long numeroClient;

	public Long getNumeroClient() {
		return numeroClient;
	}

	public void setNumeroClient(Long numeroClient) {
		this.numeroClient = numeroClient;
	}

	@Override
	public String toString() {
		return "ClientDTO [numeroClient=" + numeroClient + ", toString()="
				+ super.toString() + "]";
	}
}
