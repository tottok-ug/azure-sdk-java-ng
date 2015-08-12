package com.tottokug.azure;

public interface AzureRestClient extends AzureClient {
	public AzureRestResponse request(AzureRestRequest request); 
}
