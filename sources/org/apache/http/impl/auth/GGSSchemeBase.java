package org.apache.http.impl.auth;

import com.google.common.net.HttpHeaders;
import java.net.InetAddress;
import java.net.UnknownHostException;
import o.AbstractC59682zle;
import o.C59497ziE;
import o.C59570zjY;
import o.C59851zoo;
import o.InterfaceC59499ziG;
import o.InterfaceC59518ziZ;
import o.InterfaceC59577zjf;
import o.InterfaceC59597zjz;
import o.InterfaceC59838zob;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.InvalidCredentialsException;
import org.apache.http.auth.KerberosCredentials;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.message.BufferedHeader;
import org.apache.http.util.CharArrayBuffer;
import org.ietf.jgss.GSSContext;
import org.ietf.jgss.GSSCredential;
import org.ietf.jgss.GSSException;
import org.ietf.jgss.GSSManager;
import org.ietf.jgss.GSSName;
import org.ietf.jgss.Oid;

/* JADX INFO: loaded from: classes13.dex */
public abstract class GGSSchemeBase extends AbstractC59682zle {
    public final boolean AEQbTJ;
    public final boolean AhwBna;
    public byte[] EZpvd;
    public final InterfaceC59499ziG KWHzl;
    public State OLrzqt;
    public final C59497ziE copydefault;

    public enum State {
        UNINITIATED,
        CHALLENGE_RECEIVED,
        TOKEN_GENERATED,
        FAILED
    }

    @Deprecated
    public byte[] OLrzqt(byte[] bArr, String str) throws GSSException {
        return null;
    }

    public GGSSchemeBase(boolean z, boolean z2) {
        this.KWHzl = LogFactory.copydefault(getClass());
        this.copydefault = new C59497ziE(0);
        this.AEQbTJ = z;
        this.AhwBna = z2;
        this.OLrzqt = State.UNINITIATED;
    }

    public GGSSchemeBase() {
        this(true, true);
    }

    public GSSManager EZpvd() {
        return GSSManager.getInstance();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.ietf.jgss.GSSException */
    public byte[] KWHzl(byte[] bArr, Oid oid, String str, InterfaceC59597zjz interfaceC59597zjz) throws GSSException {
        GSSManager gSSManagerEZpvd = EZpvd();
        GSSContext gSSContextEZpvd = EZpvd(gSSManagerEZpvd, oid, gSSManagerEZpvd.createName("HTTP@" + str, GSSName.NT_HOSTBASED_SERVICE), interfaceC59597zjz instanceof KerberosCredentials ? ((KerberosCredentials) interfaceC59597zjz).getGSSCredential() : null);
        if (bArr != null) {
            return gSSContextEZpvd.initSecContext(bArr, 0, bArr.length);
        }
        return gSSContextEZpvd.initSecContext(new byte[0], 0, 0);
    }

    public GSSContext EZpvd(GSSManager gSSManager, Oid oid, GSSName gSSName, GSSCredential gSSCredential) throws GSSException {
        GSSContext gSSContextCreateContext = gSSManager.createContext(gSSName.canonicalize(oid), oid, gSSCredential, 0);
        gSSContextCreateContext.requestMutualAuth(true);
        return gSSContextCreateContext;
    }

    public byte[] KWHzl(byte[] bArr, String str, InterfaceC59597zjz interfaceC59597zjz) throws GSSException {
        return OLrzqt(bArr, str);
    }

    @Override // o.InterfaceC59588zjq
    public boolean isComplete() {
        State state = this.OLrzqt;
        return state == State.TOKEN_GENERATED || state == State.FAILED;
    }

    @Override // o.InterfaceC59588zjq
    @Deprecated
    public InterfaceC59518ziZ authenticate(InterfaceC59597zjz interfaceC59597zjz, InterfaceC59577zjf interfaceC59577zjf) throws AuthenticationException {
        return authenticate(interfaceC59597zjz, interfaceC59577zjf, null);
    }

    /* JADX INFO: renamed from: org.apache.http.impl.auth.GGSSchemeBase$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] EZpvd;

        static {
            int[] iArr = new int[State.values().length];
            EZpvd = iArr;
            try {
                iArr[State.UNINITIATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EZpvd[State.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EZpvd[State.CHALLENGE_RECEIVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                EZpvd[State.TOKEN_GENERATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // o.AbstractC59682zle, o.InterfaceC59547zjB
    public InterfaceC59518ziZ authenticate(InterfaceC59597zjz interfaceC59597zjz, InterfaceC59577zjf interfaceC59577zjf, InterfaceC59838zob interfaceC59838zob) throws AuthenticationException {
        HttpHost httpHostCopydefault;
        C59851zoo.AEQbTJ(interfaceC59577zjf, "HTTP request");
        int i = AnonymousClass2.EZpvd[this.OLrzqt.ordinal()];
        if (i == 1) {
            throw new AuthenticationException(getSchemeName() + " authentication has not been initiated");
        }
        if (i == 2) {
            throw new AuthenticationException(getSchemeName() + " authentication has failed");
        }
        if (i == 3) {
            try {
                C59570zjY c59570zjY = (C59570zjY) interfaceC59838zob.getAttribute("http.route");
                if (c59570zjY == null) {
                    throw new AuthenticationException("Connection route is not available");
                }
                if (!isProxy() || (httpHostCopydefault = c59570zjY.EZpvd()) == null) {
                    httpHostCopydefault = c59570zjY.copydefault();
                }
                String hostName = httpHostCopydefault.getHostName();
                if (this.AhwBna) {
                    try {
                        hostName = KWHzl(hostName);
                    } catch (UnknownHostException unused) {
                    }
                }
                if (!this.AEQbTJ) {
                    hostName = hostName + ":" + httpHostCopydefault.getPort();
                }
                if (this.KWHzl.isDebugEnabled()) {
                    this.KWHzl.debug("init " + hostName);
                }
                this.EZpvd = KWHzl(this.EZpvd, hostName, interfaceC59597zjz);
                this.OLrzqt = State.TOKEN_GENERATED;
            } catch (GSSException e) {
                this.OLrzqt = State.FAILED;
                if (e.getMajor() == 9 || e.getMajor() == 8) {
                    throw new InvalidCredentialsException(e.getMessage(), e);
                }
                if (e.getMajor() == 13) {
                    throw new InvalidCredentialsException(e.getMessage(), e);
                }
                if (e.getMajor() == 10 || e.getMajor() == 19 || e.getMajor() == 20) {
                    throw new AuthenticationException(e.getMessage(), e);
                }
                throw new AuthenticationException(e.getMessage());
            }
        } else if (i != 4) {
            throw new IllegalStateException("Illegal state: " + this.OLrzqt);
        }
        String str = new String(this.copydefault.AYXKKw(this.EZpvd));
        if (this.KWHzl.isDebugEnabled()) {
            this.KWHzl.debug("Sending response '" + str + "' back to the auth server");
        }
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(32);
        if (isProxy()) {
            charArrayBuffer.append(HttpHeaders.PROXY_AUTHORIZATION);
        } else {
            charArrayBuffer.append("Authorization");
        }
        charArrayBuffer.append(": Negotiate ");
        charArrayBuffer.append(str);
        return new BufferedHeader(charArrayBuffer);
    }

    @Override // o.AbstractC59682zle
    public void parseChallenge(CharArrayBuffer charArrayBuffer, int i, int i2) throws MalformedChallengeException {
        String strSubstringTrimmed = charArrayBuffer.substringTrimmed(i, i2);
        if (this.KWHzl.isDebugEnabled()) {
            this.KWHzl.debug("Received challenge '" + strSubstringTrimmed + "' from the auth server");
        }
        if (this.OLrzqt == State.UNINITIATED) {
            this.EZpvd = C59497ziE.copydefault(strSubstringTrimmed.getBytes());
            this.OLrzqt = State.CHALLENGE_RECEIVED;
        } else {
            this.KWHzl.debug("Authentication already attempted");
            this.OLrzqt = State.FAILED;
        }
    }

    public final String KWHzl(String str) throws UnknownHostException {
        InetAddress byName = InetAddress.getByName(str);
        String canonicalHostName = byName.getCanonicalHostName();
        return byName.getHostAddress().contentEquals(canonicalHostName) ? str : canonicalHostName;
    }
}
