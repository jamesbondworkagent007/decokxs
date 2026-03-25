package o;

import java.util.Collections;
import org.apache.commons.logging.LogFactory;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.client.AuthenticationHandler;

/* JADX INFO: renamed from: o.zll, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@java.lang.Deprecated
public abstract class AbstractC59689zll implements AuthenticationHandler {
    public static final java.util.List<java.lang.String> AEQbTJ = Collections.unmodifiableList(java.util.Arrays.asList("Negotiate", "NTLM", "Digest", "Basic"));
    public final InterfaceC59499ziG KWHzl = LogFactory.copydefault(getClass());

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.List<java.lang.String> OLrzqt() {
        return AEQbTJ;
    }

    public java.util.Map<java.lang.String, InterfaceC59518ziZ> OLrzqt(InterfaceC59518ziZ[] interfaceC59518ziZArr) throws MalformedChallengeException {
        org.apache.http.util.CharArrayBuffer charArrayBuffer;
        int valuePos;
        java.util.HashMap map = new java.util.HashMap(interfaceC59518ziZArr.length);
        for (InterfaceC59518ziZ interfaceC59518ziZ : interfaceC59518ziZArr) {
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
            map.put(charArrayBuffer.substring(valuePos, i).toLowerCase(java.util.Locale.ROOT), interfaceC59518ziZ);
        }
        return map;
    }

    public java.util.List<java.lang.String> AEQbTJ(InterfaceC59584zjm interfaceC59584zjm, InterfaceC59838zob interfaceC59838zob) {
        return OLrzqt();
    }

    @Override // org.apache.http.client.AuthenticationHandler
    public InterfaceC59588zjq selectScheme(java.util.Map<java.lang.String, InterfaceC59518ziZ> map, InterfaceC59584zjm interfaceC59584zjm, InterfaceC59838zob interfaceC59838zob) throws AuthenticationException {
        InterfaceC59588zjq interfaceC59588zjqAEQbTJ;
        C59595zjx c59595zjx = (C59595zjx) interfaceC59838zob.getAttribute("http.authscheme-registry");
        C59849zom.AEQbTJ(c59595zjx, "AuthScheme registry");
        java.util.List<java.lang.String> listAEQbTJ = AEQbTJ(interfaceC59584zjm, interfaceC59838zob);
        if (listAEQbTJ == null) {
            listAEQbTJ = AEQbTJ;
        }
        if (this.KWHzl.isDebugEnabled()) {
            this.KWHzl.debug("Authentication schemes in the order of preference: " + listAEQbTJ);
        }
        java.util.Iterator<java.lang.String> it = listAEQbTJ.iterator();
        while (true) {
            if (!it.hasNext()) {
                interfaceC59588zjqAEQbTJ = null;
                break;
            }
            java.lang.String next = it.next();
            if (map.get(next.toLowerCase(java.util.Locale.ENGLISH)) != null) {
                if (this.KWHzl.isDebugEnabled()) {
                    this.KWHzl.debug(next + " authentication scheme selected");
                }
                try {
                    interfaceC59588zjqAEQbTJ = c59595zjx.AEQbTJ(next, interfaceC59584zjm.getParams());
                    break;
                } catch (java.lang.IllegalStateException unused) {
                    if (this.KWHzl.isWarnEnabled()) {
                        this.KWHzl.warn("Authentication scheme " + next + " not supported");
                    }
                }
            } else if (this.KWHzl.isDebugEnabled()) {
                this.KWHzl.debug("Challenge for " + next + " authentication scheme not available");
            }
        }
        if (interfaceC59588zjqAEQbTJ != null) {
            return interfaceC59588zjqAEQbTJ;
        }
        throw new AuthenticationException("Unable to respond to any of these challenges: " + map);
    }
}
