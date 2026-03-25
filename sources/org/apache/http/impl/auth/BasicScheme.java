package org.apache.http.impl.auth;

import com.google.common.net.HttpHeaders;
import java.nio.charset.Charset;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C59497ziE;
import o.C59514ziV;
import o.C59782znY;
import o.C59851zoo;
import o.C59856zot;
import o.InterfaceC59518ziZ;
import o.InterfaceC59577zjf;
import o.InterfaceC59597zjz;
import o.InterfaceC59838zob;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.ChallengeState;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.message.BufferedHeader;
import org.apache.http.util.CharArrayBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class BasicScheme extends RFC2617Scheme {
    private static final long serialVersionUID = -1931571557597830536L;
    private boolean complete;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59588zjq
    public String getSchemeName() {
        return "basic";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59588zjq
    public boolean isComplete() {
        return this.complete;
    }

    @Override // o.InterfaceC59588zjq
    public boolean isConnectionBased() {
        return false;
    }

    public BasicScheme(Charset charset) {
        super(charset);
        this.complete = false;
    }

    @Deprecated
    public BasicScheme(ChallengeState challengeState) {
        super(challengeState);
    }

    public BasicScheme() {
        this(C59514ziV.EZpvd);
    }

    @Override // o.AbstractC59682zle, o.InterfaceC59588zjq
    public void processChallenge(InterfaceC59518ziZ interfaceC59518ziZ) throws MalformedChallengeException {
        super.processChallenge(interfaceC59518ziZ);
        this.complete = true;
    }

    @Override // o.InterfaceC59588zjq
    @Deprecated
    public InterfaceC59518ziZ authenticate(InterfaceC59597zjz interfaceC59597zjz, InterfaceC59577zjf interfaceC59577zjf) throws AuthenticationException {
        return authenticate(interfaceC59597zjz, interfaceC59577zjf, new C59782znY());
    }

    @Override // o.AbstractC59682zle, o.InterfaceC59547zjB
    public InterfaceC59518ziZ authenticate(InterfaceC59597zjz interfaceC59597zjz, InterfaceC59577zjf interfaceC59577zjf, InterfaceC59838zob interfaceC59838zob) throws AuthenticationException {
        C59851zoo.AEQbTJ(interfaceC59597zjz, "Credentials");
        C59851zoo.AEQbTJ(interfaceC59577zjf, "HTTP request");
        StringBuilder sb = new StringBuilder();
        sb.append(interfaceC59597zjz.getUserPrincipal().getName());
        sb.append(":");
        sb.append(interfaceC59597zjz.getPassword() == null ? AbstractJsonLexerKt.NULL : interfaceC59597zjz.getPassword());
        byte[] bArrAYXKKw = new C59497ziE(0).AYXKKw(C59856zot.KWHzl(sb.toString(), getCredentialsCharset(interfaceC59577zjf)));
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(32);
        if (isProxy()) {
            charArrayBuffer.append(HttpHeaders.PROXY_AUTHORIZATION);
        } else {
            charArrayBuffer.append("Authorization");
        }
        charArrayBuffer.append(": Basic ");
        charArrayBuffer.append(bArrAYXKKw, 0, bArrAYXKKw.length);
        return new BufferedHeader(charArrayBuffer);
    }

    @Deprecated
    public static InterfaceC59518ziZ authenticate(InterfaceC59597zjz interfaceC59597zjz, String str, boolean z) {
        C59851zoo.AEQbTJ(interfaceC59597zjz, "Credentials");
        C59851zoo.AEQbTJ(str, "charset");
        StringBuilder sb = new StringBuilder();
        sb.append(interfaceC59597zjz.getUserPrincipal().getName());
        sb.append(":");
        sb.append(interfaceC59597zjz.getPassword() == null ? AbstractJsonLexerKt.NULL : interfaceC59597zjz.getPassword());
        byte[] bArrKWHzl = C59497ziE.KWHzl(C59856zot.KWHzl(sb.toString(), str), false);
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(32);
        if (z) {
            charArrayBuffer.append(HttpHeaders.PROXY_AUTHORIZATION);
        } else {
            charArrayBuffer.append("Authorization");
        }
        charArrayBuffer.append(": Basic ");
        charArrayBuffer.append(bArrKWHzl, 0, bArrKWHzl.length);
        return new BufferedHeader(charArrayBuffer);
    }

    @Override // o.AbstractC59682zle
    public String toString() {
        return "BASIC [complete=" + this.complete + "]";
    }
}
