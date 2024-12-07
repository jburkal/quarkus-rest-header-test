package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.Set;

@RegisterRestClient(configKey = "quarkusApi")
public interface QuarkusStreamsService {

    @GET
    @Path("/streams")
    Set<Stream> getStreams();

    record Stream(
            String key,
            String quarkusCoreVersion,
            String platformVersion) {
    }
}
