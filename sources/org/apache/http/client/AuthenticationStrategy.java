package org.apache.http.client;

import java.util.Map;
import java.util.Queue;
import o.C59590zjs;
import o.InterfaceC59518ziZ;
import o.InterfaceC59584zjm;
import o.InterfaceC59588zjq;
import o.InterfaceC59838zob;
import org.apache.http.HttpHost;
import org.apache.http.auth.MalformedChallengeException;

/* JADX INFO: loaded from: classes13.dex */
public interface AuthenticationStrategy {
    void authFailed(HttpHost httpHost, InterfaceC59588zjq interfaceC59588zjq, InterfaceC59838zob interfaceC59838zob);

    void authSucceeded(HttpHost httpHost, InterfaceC59588zjq interfaceC59588zjq, InterfaceC59838zob interfaceC59838zob);

    Map<String, InterfaceC59518ziZ> getChallenges(HttpHost httpHost, InterfaceC59584zjm interfaceC59584zjm, InterfaceC59838zob interfaceC59838zob) throws MalformedChallengeException;

    boolean isAuthenticationRequested(HttpHost httpHost, InterfaceC59584zjm interfaceC59584zjm, InterfaceC59838zob interfaceC59838zob);

    Queue<C59590zjs> select(Map<String, InterfaceC59518ziZ> map, HttpHost httpHost, InterfaceC59584zjm interfaceC59584zjm, InterfaceC59838zob interfaceC59838zob) throws MalformedChallengeException;
}
