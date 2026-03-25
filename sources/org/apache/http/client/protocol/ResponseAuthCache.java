package org.apache.http.client.protocol;

import java.io.IOException;
import o.C59593zjv;
import o.C59636zkl;
import o.C59695zlr;
import o.C59840zod;
import o.C59851zoo;
import o.InterfaceC59499ziG;
import o.InterfaceC59584zjm;
import o.InterfaceC59585zjn;
import o.InterfaceC59588zjq;
import o.InterfaceC59838zob;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthProtocolState;
import org.apache.http.client.AuthCache;

/* JADX INFO: loaded from: classes24.dex */
@Deprecated
public class ResponseAuthCache implements InterfaceC59585zjn {
    private final InterfaceC59499ziG log = LogFactory.copydefault(getClass());

    @Override // o.InterfaceC59585zjn
    public void process(InterfaceC59584zjm interfaceC59584zjm, InterfaceC59838zob interfaceC59838zob) throws HttpException, IOException {
        C59851zoo.AEQbTJ(interfaceC59584zjm, "HTTP request");
        C59851zoo.AEQbTJ(interfaceC59838zob, "HTTP context");
        AuthCache c59695zlr = (AuthCache) interfaceC59838zob.getAttribute("http.auth.auth-cache");
        HttpHost httpHost = (HttpHost) interfaceC59838zob.getAttribute(C59840zod.HTTP_TARGET_HOST);
        C59593zjv c59593zjv = (C59593zjv) interfaceC59838zob.getAttribute("http.auth.target-scope");
        if (httpHost != null && c59593zjv != null) {
            if (this.log.isDebugEnabled()) {
                this.log.debug("Target auth state: " + c59593zjv.copydefault());
            }
            if (isCachable(c59593zjv)) {
                C59636zkl c59636zkl = (C59636zkl) interfaceC59838zob.getAttribute(ClientContext.SCHEME_REGISTRY);
                if (httpHost.getPort() < 0) {
                    httpHost = new HttpHost(httpHost.getHostName(), c59636zkl.EZpvd(httpHost).AEQbTJ(httpHost.getPort()), httpHost.getSchemeName());
                }
                if (c59695zlr == null) {
                    c59695zlr = new C59695zlr();
                    interfaceC59838zob.setAttribute("http.auth.auth-cache", c59695zlr);
                }
                int i = AnonymousClass1.$SwitchMap$org$apache$http$auth$AuthProtocolState[c59593zjv.copydefault().ordinal()];
                if (i == 1) {
                    cache(c59695zlr, httpHost, c59593zjv.KWHzl());
                } else if (i == 2) {
                    uncache(c59695zlr, httpHost, c59593zjv.KWHzl());
                }
            }
        }
        HttpHost httpHost2 = (HttpHost) interfaceC59838zob.getAttribute("http.proxy_host");
        C59593zjv c59593zjv2 = (C59593zjv) interfaceC59838zob.getAttribute("http.auth.proxy-scope");
        if (httpHost2 == null || c59593zjv2 == null) {
            return;
        }
        if (this.log.isDebugEnabled()) {
            this.log.debug("Proxy auth state: " + c59593zjv2.copydefault());
        }
        if (isCachable(c59593zjv2)) {
            if (c59695zlr == null) {
                c59695zlr = new C59695zlr();
                interfaceC59838zob.setAttribute("http.auth.auth-cache", c59695zlr);
            }
            int i2 = AnonymousClass1.$SwitchMap$org$apache$http$auth$AuthProtocolState[c59593zjv2.copydefault().ordinal()];
            if (i2 == 1) {
                cache(c59695zlr, httpHost2, c59593zjv2.KWHzl());
            } else {
                if (i2 != 2) {
                    return;
                }
                uncache(c59695zlr, httpHost2, c59593zjv2.KWHzl());
            }
        }
    }

    /* JADX INFO: renamed from: org.apache.http.client.protocol.ResponseAuthCache$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$http$auth$AuthProtocolState;

        static {
            int[] iArr = new int[AuthProtocolState.values().length];
            $SwitchMap$org$apache$http$auth$AuthProtocolState = iArr;
            try {
                iArr[AuthProtocolState.CHALLENGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$apache$http$auth$AuthProtocolState[AuthProtocolState.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private boolean isCachable(C59593zjv c59593zjv) {
        InterfaceC59588zjq interfaceC59588zjqKWHzl = c59593zjv.KWHzl();
        if (interfaceC59588zjqKWHzl != null && interfaceC59588zjqKWHzl.isComplete()) {
            String schemeName = interfaceC59588zjqKWHzl.getSchemeName();
            if (schemeName.equalsIgnoreCase("Basic") || schemeName.equalsIgnoreCase("Digest")) {
                return true;
            }
        }
        return false;
    }

    private void cache(AuthCache authCache, HttpHost httpHost, InterfaceC59588zjq interfaceC59588zjq) {
        if (this.log.isDebugEnabled()) {
            this.log.debug("Caching '" + interfaceC59588zjq.getSchemeName() + "' auth scheme for " + httpHost);
        }
        authCache.put(httpHost, interfaceC59588zjq);
    }

    private void uncache(AuthCache authCache, HttpHost httpHost, InterfaceC59588zjq interfaceC59588zjq) {
        if (this.log.isDebugEnabled()) {
            this.log.debug("Removing from cache '" + interfaceC59588zjq.getSchemeName() + "' auth scheme for " + httpHost);
        }
        authCache.remove(httpHost);
    }
}
