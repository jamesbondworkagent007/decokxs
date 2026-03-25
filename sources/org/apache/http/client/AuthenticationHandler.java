package org.apache.http.client;

import java.util.Map;
import o.InterfaceC59518ziZ;
import o.InterfaceC59584zjm;
import o.InterfaceC59588zjq;
import o.InterfaceC59838zob;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.MalformedChallengeException;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public interface AuthenticationHandler {
    Map<String, InterfaceC59518ziZ> getChallenges(InterfaceC59584zjm interfaceC59584zjm, InterfaceC59838zob interfaceC59838zob) throws MalformedChallengeException;

    boolean isAuthenticationRequested(InterfaceC59584zjm interfaceC59584zjm, InterfaceC59838zob interfaceC59838zob);

    InterfaceC59588zjq selectScheme(Map<String, InterfaceC59518ziZ> map, InterfaceC59584zjm interfaceC59584zjm, InterfaceC59838zob interfaceC59838zob) throws AuthenticationException;
}
