package org.acme;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@QuarkusMain
public class MyApplication implements QuarkusApplication {

    @RestClient
    QuarkusExtensionsService remoteService;

    @RestClient
    QuarkusStreamsService streamService;

    @Override
    public int run(String... args) {
        remoteService.getExtensionsById("quarkus-rest-client");
        streamService.getStreams();
        return 0;
    }
}
