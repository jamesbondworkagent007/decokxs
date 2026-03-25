package o;

import java.util.Queue;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthProtocolState;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.client.AuthenticationStrategy;

/* JADX INFO: renamed from: o.zlf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59683zlf {
    public final InterfaceC59499ziG OLrzqt;

    public C59683zlf(InterfaceC59499ziG interfaceC59499ziG) {
        this.OLrzqt = interfaceC59499ziG == null ? LogFactory.copydefault(getClass()) : interfaceC59499ziG;
    }

    public C59683zlf() {
        this(null);
    }

    public boolean copydefault(HttpHost httpHost, InterfaceC59584zjm interfaceC59584zjm, AuthenticationStrategy authenticationStrategy, C59593zjv c59593zjv, InterfaceC59838zob interfaceC59838zob) {
        if (authenticationStrategy.isAuthenticationRequested(httpHost, interfaceC59584zjm, interfaceC59838zob)) {
            this.OLrzqt.debug("Authentication required");
            if (c59593zjv.copydefault() == AuthProtocolState.SUCCESS) {
                authenticationStrategy.authFailed(httpHost, c59593zjv.KWHzl(), interfaceC59838zob);
            }
            return true;
        }
        int i = AnonymousClass4.KWHzl[c59593zjv.copydefault().ordinal()];
        if (i == 1 || i == 2) {
            this.OLrzqt.debug("Authentication succeeded");
            c59593zjv.EZpvd(AuthProtocolState.SUCCESS);
            authenticationStrategy.authSucceeded(httpHost, c59593zjv.KWHzl(), interfaceC59838zob);
            return false;
        }
        if (i == 3) {
            return false;
        }
        c59593zjv.EZpvd(AuthProtocolState.UNCHALLENGED);
        return false;
    }

    /* JADX INFO: renamed from: o.zlf$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] KWHzl;

        static {
            int[] iArr = new int[AuthProtocolState.values().length];
            KWHzl = iArr;
            try {
                iArr[AuthProtocolState.CHALLENGED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                KWHzl[AuthProtocolState.HANDSHAKE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                KWHzl[AuthProtocolState.SUCCESS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                KWHzl[AuthProtocolState.FAILURE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                KWHzl[AuthProtocolState.UNCHALLENGED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    public boolean AEQbTJ(HttpHost httpHost, InterfaceC59584zjm interfaceC59584zjm, AuthenticationStrategy authenticationStrategy, C59593zjv c59593zjv, InterfaceC59838zob interfaceC59838zob) {
        Queue<C59590zjs> queueSelect;
        try {
            if (this.OLrzqt.isDebugEnabled()) {
                this.OLrzqt.debug(httpHost.toHostString() + " requested authentication");
            }
            java.util.Map<java.lang.String, InterfaceC59518ziZ> challenges = authenticationStrategy.getChallenges(httpHost, interfaceC59584zjm, interfaceC59838zob);
            if (challenges.isEmpty()) {
                this.OLrzqt.debug("Response contains no authentication challenges");
                return false;
            }
            InterfaceC59588zjq interfaceC59588zjqKWHzl = c59593zjv.KWHzl();
            int i = AnonymousClass4.KWHzl[c59593zjv.copydefault().ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3) {
                    c59593zjv.OLrzqt();
                } else {
                    if (i == 4) {
                        return false;
                    }
                    if (i != 5) {
                    }
                }
                queueSelect = authenticationStrategy.select(challenges, httpHost, interfaceC59584zjm, interfaceC59838zob);
                if (queueSelect != null || queueSelect.isEmpty()) {
                    return false;
                }
                if (this.OLrzqt.isDebugEnabled()) {
                    this.OLrzqt.debug("Selected authentication options: " + queueSelect);
                }
                c59593zjv.EZpvd(AuthProtocolState.CHALLENGED);
                c59593zjv.copydefault(queueSelect);
                return true;
            }
            if (interfaceC59588zjqKWHzl == null) {
                this.OLrzqt.debug("Auth scheme is null");
                authenticationStrategy.authFailed(httpHost, null, interfaceC59838zob);
                c59593zjv.OLrzqt();
                c59593zjv.EZpvd(AuthProtocolState.FAILURE);
                return false;
            }
            if (interfaceC59588zjqKWHzl != null) {
                InterfaceC59518ziZ interfaceC59518ziZ = challenges.get(interfaceC59588zjqKWHzl.getSchemeName().toLowerCase(java.util.Locale.ROOT));
                if (interfaceC59518ziZ != null) {
                    this.OLrzqt.debug("Authorization challenge processed");
                    interfaceC59588zjqKWHzl.processChallenge(interfaceC59518ziZ);
                    if (interfaceC59588zjqKWHzl.isComplete()) {
                        this.OLrzqt.debug("Authentication failed");
                        authenticationStrategy.authFailed(httpHost, c59593zjv.KWHzl(), interfaceC59838zob);
                        c59593zjv.OLrzqt();
                        c59593zjv.EZpvd(AuthProtocolState.FAILURE);
                        return false;
                    }
                    c59593zjv.EZpvd(AuthProtocolState.HANDSHAKE);
                    return true;
                }
                c59593zjv.OLrzqt();
            }
            queueSelect = authenticationStrategy.select(challenges, httpHost, interfaceC59584zjm, interfaceC59838zob);
            if (queueSelect != null) {
            }
            return false;
        } catch (MalformedChallengeException e) {
            if (this.OLrzqt.isWarnEnabled()) {
                this.OLrzqt.warn("Malformed challenge: " + e.getMessage());
            }
            c59593zjv.OLrzqt();
            return false;
        }
    }
}
