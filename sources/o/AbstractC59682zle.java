package o;

import com.google.common.net.HttpHeaders;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.ChallengeState;
import org.apache.http.auth.MalformedChallengeException;

/* JADX INFO: renamed from: o.zle, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59682zle implements InterfaceC59547zjB {
    public ChallengeState challengeState;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChallengeState getChallengeState() {
        return this.challengeState;
    }

    public abstract void parseChallenge(org.apache.http.util.CharArrayBuffer charArrayBuffer, int i, int i2) throws MalformedChallengeException;

    @java.lang.Deprecated
    public AbstractC59682zle(ChallengeState challengeState) {
        this.challengeState = challengeState;
    }

    public AbstractC59682zle() {
    }

    @Override // o.InterfaceC59588zjq
    public void processChallenge(InterfaceC59518ziZ interfaceC59518ziZ) throws MalformedChallengeException {
        org.apache.http.util.CharArrayBuffer charArrayBuffer;
        int valuePos;
        C59851zoo.AEQbTJ(interfaceC59518ziZ, "Header");
        java.lang.String name = interfaceC59518ziZ.getName();
        if (name.equalsIgnoreCase(HttpHeaders.WWW_AUTHENTICATE)) {
            this.challengeState = ChallengeState.TARGET;
        } else if (name.equalsIgnoreCase(HttpHeaders.PROXY_AUTHENTICATE)) {
            this.challengeState = ChallengeState.PROXY;
        } else {
            throw new MalformedChallengeException("Unexpected header name: " + name);
        }
        if (interfaceC59518ziZ instanceof InterfaceC59516ziX) {
            InterfaceC59516ziX interfaceC59516ziX = (InterfaceC59516ziX) interfaceC59518ziZ;
            charArrayBuffer = interfaceC59516ziX.getBuffer();
            valuePos = interfaceC59516ziX.getValuePos();
        } else {
            java.lang.String value = interfaceC59518ziZ.getValue();
            if (value == null) {
                throw new MalformedChallengeException("Header value is null");
            }
            charArrayBuffer = new org.apache.http.util.CharArrayBuffer(value.length());
            charArrayBuffer.append(value);
            valuePos = 0;
        }
        while (valuePos < charArrayBuffer.length() && C59841zoe.copydefault(charArrayBuffer.charAt(valuePos))) {
            valuePos++;
        }
        int i = valuePos;
        while (i < charArrayBuffer.length() && !C59841zoe.copydefault(charArrayBuffer.charAt(i))) {
            i++;
        }
        java.lang.String strSubstring = charArrayBuffer.substring(valuePos, i);
        if (!strSubstring.equalsIgnoreCase(getSchemeName())) {
            throw new MalformedChallengeException("Invalid scheme identifier: " + strSubstring);
        }
        parseChallenge(charArrayBuffer, i, charArrayBuffer.length());
    }

    @Override // o.InterfaceC59547zjB
    public InterfaceC59518ziZ authenticate(InterfaceC59597zjz interfaceC59597zjz, InterfaceC59577zjf interfaceC59577zjf, InterfaceC59838zob interfaceC59838zob) throws AuthenticationException {
        return authenticate(interfaceC59597zjz, interfaceC59577zjf);
    }

    public boolean isProxy() {
        ChallengeState challengeState = this.challengeState;
        return challengeState != null && challengeState == ChallengeState.PROXY;
    }

    public java.lang.String toString() {
        java.lang.String schemeName = getSchemeName();
        if (schemeName != null) {
            return schemeName.toUpperCase(java.util.Locale.ROOT);
        }
        return super.toString();
    }
}
