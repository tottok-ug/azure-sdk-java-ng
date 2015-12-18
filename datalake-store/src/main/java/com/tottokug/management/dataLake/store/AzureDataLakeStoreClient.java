package com.tottokug.management.dataLake.store;

import com.tottokug.restclient.RestClient;
import com.tottokug.restclient.auth.CredentialProvider;

/**
 * Hello world!
 *
 */
public class AzureDataLakeStoreClient extends RestClient {

	protected AzureDataLakeStoreClient(CredentialProvider credentialProvider) {
		super(credentialProvider);
	}

	public static void main(String[] args) {
		System.out.println("Hello World!");
	}

	@Override
	protected String getEndpointHost() {
		return null;
	}
}
