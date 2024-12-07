package org.acme;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

import java.util.List;
import java.util.Set;

@RegisterRestClient(configKey = "quarkusApi")
public interface QuarkusExtensionsService {

    @GET
    @Path("/extensions")
    Set<Extension> getExtensionsById(@QueryParam("id") String id);

    record Extension(
            String id,
            String name,
            String shortName,
            List<String> keywords) {
    }
}
