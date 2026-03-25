package o;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpHost;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.client.AuthCache;
import org.apache.http.client.AuthenticationStrategy;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.config.AuthSchemes;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.protocol.HttpClientContext;

/* JADX INFO: renamed from: o.zlt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59697zlt implements AuthenticationStrategy {
    public static final java.util.List<java.lang.String> AEQbTJ = Collections.unmodifiableList(java.util.Arrays.asList("Negotiate", "Kerberos", "NTLM", AuthSchemes.CREDSSP, "Digest", "Basic"));
    public final int EZpvd;
    public final InterfaceC59499ziG OLrzqt = LogFactory.copydefault(getClass());
    public final java.lang.String copydefault;

    public abstract java.util.Collection<java.lang.String> OLrzqt(RequestConfig requestConfig);

    public AbstractC59697zlt(int i, java.lang.String str) {
        this.EZpvd = i;
        this.copydefault = str;
    }

    @Override // org.apache.http.client.AuthenticationStrategy
    public boolean isAuthenticationRequested(HttpHost httpHost, InterfaceC59584zjm interfaceC59584zjm, InterfaceC59838zob interfaceC59838zob) {
        C59851zoo.AEQbTJ(interfaceC59584zjm, "HTTP response");
        return interfaceC59584zjm.AEQbTJ().getStatusCode() == this.EZpvd;
    }

    @Override // org.apache.http.client.AuthenticationStrategy
    public java.util.Map<java.lang.String, InterfaceC59518ziZ> getChallenges(HttpHost httpHost, InterfaceC59584zjm interfaceC59584zjm, InterfaceC59838zob interfaceC59838zob) throws MalformedChallengeException {
        org.apache.http.util.CharArrayBuffer charArrayBuffer;
        int valuePos;
        C59851zoo.AEQbTJ(interfaceC59584zjm, "HTTP response");
        InterfaceC59518ziZ[] headers = interfaceC59584zjm.getHeaders(this.copydefault);
        java.util.HashMap map = new java.util.HashMap(headers.length);
        for (InterfaceC59518ziZ interfaceC59518ziZ : headers) {
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

    @Override // org.apache.http.client.AuthenticationStrategy
    public Queue<C59590zjs> select(java.util.Map<java.lang.String, InterfaceC59518ziZ> map, HttpHost httpHost, InterfaceC59584zjm interfaceC59584zjm, InterfaceC59838zob interfaceC59838zob) throws MalformedChallengeException {
        C59851zoo.AEQbTJ(map, "Map of auth challenges");
        C59851zoo.AEQbTJ(httpHost, "Host");
        C59851zoo.AEQbTJ(interfaceC59584zjm, "HTTP response");
        C59851zoo.AEQbTJ(interfaceC59838zob, "HTTP context");
        HttpClientContext httpClientContextAdapt = HttpClientContext.adapt(interfaceC59838zob);
        LinkedList linkedList = new LinkedList();
        InterfaceC59548zjC<InterfaceC59594zjw> authSchemeRegistry = httpClientContextAdapt.getAuthSchemeRegistry();
        if (authSchemeRegistry == null) {
            this.OLrzqt.debug("Auth scheme registry not set in the context");
            return linkedList;
        }
        CredentialsProvider credentialsProvider = httpClientContextAdapt.getCredentialsProvider();
        if (credentialsProvider == null) {
            this.OLrzqt.debug("Credentials provider not set in the context");
            return linkedList;
        }
        java.util.Collection<java.lang.String> collectionOLrzqt = OLrzqt(httpClientContextAdapt.getRequestConfig());
        if (collectionOLrzqt == null) {
            collectionOLrzqt = AEQbTJ;
        }
        if (this.OLrzqt.isDebugEnabled()) {
            this.OLrzqt.debug("Authentication schemes in the order of preference: " + collectionOLrzqt);
        }
        for (java.lang.String str : collectionOLrzqt) {
            InterfaceC59518ziZ interfaceC59518ziZ = map.get(str.toLowerCase(java.util.Locale.ROOT));
            if (interfaceC59518ziZ != null) {
                InterfaceC59594zjw interfaceC59594zjwKWHzl = authSchemeRegistry.KWHzl(str);
                if (interfaceC59594zjwKWHzl == null) {
                    if (this.OLrzqt.isWarnEnabled()) {
                        this.OLrzqt.warn("Authentication scheme " + str + " not supported");
                    }
                } else {
                    InterfaceC59588zjq interfaceC59588zjqCopydefault = interfaceC59594zjwKWHzl.copydefault(interfaceC59838zob);
                    interfaceC59588zjqCopydefault.processChallenge(interfaceC59518ziZ);
                    InterfaceC59597zjz credentials = credentialsProvider.getCredentials(new C59596zjy(httpHost, interfaceC59588zjqCopydefault.getRealm(), interfaceC59588zjqCopydefault.getSchemeName()));
                    if (credentials != null) {
                        linkedList.add(new C59590zjs(interfaceC59588zjqCopydefault, credentials));
                    }
                }
            } else if (this.OLrzqt.isDebugEnabled()) {
                this.OLrzqt.debug("Challenge for " + str + " authentication scheme not available");
            }
        }
        return linkedList;
    }

    @Override // org.apache.http.client.AuthenticationStrategy
    public void authSucceeded(HttpHost httpHost, InterfaceC59588zjq interfaceC59588zjq, InterfaceC59838zob interfaceC59838zob) {
        C59851zoo.AEQbTJ(httpHost, "Host");
        C59851zoo.AEQbTJ(interfaceC59588zjq, "Auth scheme");
        C59851zoo.AEQbTJ(interfaceC59838zob, "HTTP context");
        HttpClientContext httpClientContextAdapt = HttpClientContext.adapt(interfaceC59838zob);
        if (OLrzqt(interfaceC59588zjq)) {
            AuthCache authCache = httpClientContextAdapt.getAuthCache();
            if (authCache == null) {
                authCache = new C59695zlr();
                httpClientContextAdapt.setAuthCache(authCache);
            }
            if (this.OLrzqt.isDebugEnabled()) {
                this.OLrzqt.debug("Caching '" + interfaceC59588zjq.getSchemeName() + "' auth scheme for " + httpHost);
            }
            authCache.put(httpHost, interfaceC59588zjq);
        }
    }

    public boolean OLrzqt(InterfaceC59588zjq interfaceC59588zjq) {
        if (interfaceC59588zjq == null || !interfaceC59588zjq.isComplete()) {
            return false;
        }
        return interfaceC59588zjq.getSchemeName().equalsIgnoreCase("Basic");
    }

    @Override // org.apache.http.client.AuthenticationStrategy
    public void authFailed(HttpHost httpHost, InterfaceC59588zjq interfaceC59588zjq, InterfaceC59838zob interfaceC59838zob) {
        C59851zoo.AEQbTJ(httpHost, "Host");
        C59851zoo.AEQbTJ(interfaceC59838zob, "HTTP context");
        AuthCache authCache = HttpClientContext.adapt(interfaceC59838zob).getAuthCache();
        if (authCache != null) {
            if (this.OLrzqt.isDebugEnabled()) {
                this.OLrzqt.debug("Clearing cached auth scheme for " + httpHost);
            }
            authCache.remove(httpHost);
        }
    }
}
