package com.tottokug.restclient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Configuration;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.tottokug.restclient.auth.CredentialProvider;

public abstract class RestClient {

	Client client;

	protected RestClient(CredentialProvider credentialProvider) {
		Configuration configuration = null;
		client = ClientBuilder.newClient(configuration);
	}

	protected abstract String getEndpointHost();

	protected RestResponse get() {
		WebTarget target = client.target(getEndpointHost());
		Invocation.Builder request = target.request();
		Response response = request.post(Entity.entity("A string entity to be POSTed", MediaType.TEXT_PLAIN));
		System.out.println(response.readEntity(String.class));
		return null;
	}

	protected RestResponse post() {
		WebTarget target = client.target(getEndpointHost());
		Invocation.Builder request = target.request();
		Response response = request.post(Entity.entity("A string entity to be POSTed", MediaType.TEXT_PLAIN));
		System.out.println(response.readEntity(String.class));
		return null;

	}

	protected RestResponse put() {
		WebTarget target = client.target(getEndpointHost());
		Invocation.Builder request = target.request();
		Response response = request.post(Entity.entity("A string entity to be POSTed", MediaType.TEXT_PLAIN));
		System.out.println(response.readEntity(String.class));
		return null;

	}

	protected RestResponse delete() {
		WebTarget target = client.target(getEndpointHost());
		Invocation.Builder request = target.request();
		Response response = request.post(Entity.entity("A string entity to be POSTed", MediaType.TEXT_PLAIN));
		System.out.println(response.readEntity(String.class));
		return null;

	}

}
