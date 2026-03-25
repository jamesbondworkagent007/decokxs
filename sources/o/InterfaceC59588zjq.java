package o;

import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.MalformedChallengeException;

/* JADX INFO: renamed from: o.zjq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC59588zjq {
    @java.lang.Deprecated
    InterfaceC59518ziZ authenticate(InterfaceC59597zjz interfaceC59597zjz, InterfaceC59577zjf interfaceC59577zjf) throws AuthenticationException;

    java.lang.String getRealm();

    java.lang.String getSchemeName();

    boolean isComplete();

    boolean isConnectionBased();

    void processChallenge(InterfaceC59518ziZ interfaceC59518ziZ) throws MalformedChallengeException;
}
