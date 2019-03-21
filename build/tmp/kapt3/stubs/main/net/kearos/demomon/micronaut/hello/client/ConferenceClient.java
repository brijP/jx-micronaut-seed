package net.kearos.demomon.micronaut.hello.client;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'\u00a8\u0006\u0004"}, d2 = {"Lnet/kearos/demomon/micronaut/hello/client/ConferenceClient;", "", "GetRandomConference", "Lnet/kearos/demomon/micronaut/hello/client/Conference;", "jx-micronaut-seed"})
@io.micronaut.http.client.annotation.Client(value = "http://localhost:8081")
public abstract interface ConferenceClient {
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.tracing.annotation.ContinueSpan()
    @io.micronaut.http.annotation.Get(value = "/conferences/random")
    public abstract net.kearos.demomon.micronaut.hello.client.Conference GetRandomConference();
}