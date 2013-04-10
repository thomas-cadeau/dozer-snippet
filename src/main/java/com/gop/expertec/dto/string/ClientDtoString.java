package com.gop.expertec.dto.string;

public class ClientDtoString extends PersonneDtoString {
	protected String numeroClient;

	public String getNumeroClient() {
		return numeroClient;
	}

	public void setNumeroClient(String numeroClient) {
		this.numeroClient = numeroClient;
	}

	@Override
	public String toString() {
		return "ClientDTO [numeroClient=" + numeroClient + ", toString()="
				+ super.toString() + "]";
	}
}
