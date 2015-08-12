package com.tottokug.azure;

public interface AzureRestRequest extends AzureRequest {

	public HttpMethod getHttpMethod();

	public String getPath();

	public String getUrl();

}
