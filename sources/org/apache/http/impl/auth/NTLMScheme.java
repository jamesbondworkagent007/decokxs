package org.apache.http.impl.auth;

import com.google.common.net.HttpHeaders;
import o.AbstractC59682zle;
import o.C59851zoo;
import o.InterfaceC59518ziZ;
import o.InterfaceC59577zjf;
import o.InterfaceC59597zjz;
import o.InterfaceC59685zlh;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.InvalidCredentialsException;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.auth.NTCredentials;
import org.apache.http.message.BufferedHeader;
import org.apache.http.util.CharArrayBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class NTLMScheme extends AbstractC59682zle {
    public String EZpvd;
    public State KWHzl;
    public final InterfaceC59685zlh copydefault;

    public enum State {
        UNINITIATED,
        CHALLENGE_RECEIVED,
        MSG_TYPE1_GENERATED,
        MSG_TYPE2_RECEVIED,
        MSG_TYPE3_GENERATED,
        FAILED
    }

    @Override // o.InterfaceC59588zjq
    public String getRealm() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59588zjq
    public String getSchemeName() {
        return "ntlm";
    }

    @Override // o.InterfaceC59588zjq
    public boolean isConnectionBased() {
        return true;
    }

    public NTLMScheme(InterfaceC59685zlh interfaceC59685zlh) {
        C59851zoo.AEQbTJ(interfaceC59685zlh, "NTLM engine");
        this.copydefault = interfaceC59685zlh;
        this.KWHzl = State.UNINITIATED;
        this.EZpvd = null;
    }

    public NTLMScheme() {
        this(new NTLMEngineImpl());
    }

    @Override // o.AbstractC59682zle
    public void parseChallenge(CharArrayBuffer charArrayBuffer, int i, int i2) throws MalformedChallengeException {
        String strSubstringTrimmed = charArrayBuffer.substringTrimmed(i, i2);
        this.EZpvd = strSubstringTrimmed;
        if (strSubstringTrimmed.isEmpty()) {
            if (this.KWHzl == State.UNINITIATED) {
                this.KWHzl = State.CHALLENGE_RECEIVED;
                return;
            } else {
                this.KWHzl = State.FAILED;
                return;
            }
        }
        State state = this.KWHzl;
        State state2 = State.MSG_TYPE1_GENERATED;
        if (state.compareTo(state2) < 0) {
            this.KWHzl = State.FAILED;
            throw new MalformedChallengeException("Out of sequence NTLM response message");
        }
        if (this.KWHzl == state2) {
            this.KWHzl = State.MSG_TYPE2_RECEVIED;
        }
    }

    @Override // o.InterfaceC59588zjq
    public InterfaceC59518ziZ authenticate(InterfaceC59597zjz interfaceC59597zjz, InterfaceC59577zjf interfaceC59577zjf) throws AuthenticationException {
        String strOLrzqt;
        try {
            NTCredentials nTCredentials = (NTCredentials) interfaceC59597zjz;
            State state = this.KWHzl;
            if (state == State.FAILED) {
                throw new AuthenticationException("NTLM authentication failed");
            }
            if (state == State.CHALLENGE_RECEIVED) {
                strOLrzqt = this.copydefault.EZpvd(nTCredentials.getDomain(), nTCredentials.getWorkstation());
                this.KWHzl = State.MSG_TYPE1_GENERATED;
            } else if (state == State.MSG_TYPE2_RECEVIED) {
                strOLrzqt = this.copydefault.OLrzqt(nTCredentials.getUserName(), nTCredentials.getPassword(), nTCredentials.getDomain(), nTCredentials.getWorkstation(), this.EZpvd);
                this.KWHzl = State.MSG_TYPE3_GENERATED;
            } else {
                throw new AuthenticationException("Unexpected state: " + this.KWHzl);
            }
            CharArrayBuffer charArrayBuffer = new CharArrayBuffer(32);
            if (isProxy()) {
                charArrayBuffer.append(HttpHeaders.PROXY_AUTHORIZATION);
            } else {
                charArrayBuffer.append("Authorization");
            }
            charArrayBuffer.append(": NTLM ");
            charArrayBuffer.append(strOLrzqt);
            return new BufferedHeader(charArrayBuffer);
        } catch (ClassCastException unused) {
            throw new InvalidCredentialsException("Credentials cannot be used for NTLM authentication: " + interfaceC59597zjz.getClass().getName());
        }
    }

    @Override // o.InterfaceC59588zjq
    public boolean isComplete() {
        State state = this.KWHzl;
        return state == State.MSG_TYPE3_GENERATED || state == State.FAILED;
    }
}
