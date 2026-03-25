package com.okinc.network.proxy;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56402yEa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class SafeProxySelector extends ProxySelector {
    public static final int $stable = 8;
    private final ProxySelector delegate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SafeProxySelector() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.net.ProxySelector:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.net.ProxySelector:0x0004: INVOKE  STATIC call: java.net.ProxySelector.getDefault():java.net.ProxySelector A[MD:():java.net.ProxySelector (c), WRAPPED] (LINE:16)) : (r1v0 java.net.ProxySelector))
 A[MD:(java.net.ProxySelector):void (m)] (LINE:15) call: com.okinc.network.proxy.SafeProxySelector.<init>(java.net.ProxySelector):void type: THIS */
    public /* synthetic */ SafeProxySelector(ProxySelector proxySelector, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ProxySelector.getDefault() : proxySelector);
    }

    public SafeProxySelector(@NotNull ProxySelector proxySelector) {
        Intrinsics.checkNotNullParameter(proxySelector, "");
        this.delegate = proxySelector;
    }

    @Override // java.net.ProxySelector
    public List<Proxy> select(@NotNull URI uri) {
        Intrinsics.checkNotNullParameter(uri, "");
        try {
            List<Proxy> listSelect = this.delegate.select(uri);
            return listSelect == null ? C56402yEa.EZpvd(Proxy.NO_PROXY) : listSelect;
        } catch (Exception unused) {
            return C56402yEa.EZpvd(Proxy.NO_PROXY);
        }
    }

    @Override // java.net.ProxySelector
    public void connectFailed(@NotNull URI uri, @NotNull SocketAddress socketAddress, @NotNull IOException iOException) {
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(socketAddress, "");
        Intrinsics.checkNotNullParameter(iOException, "");
        this.delegate.connectFailed(uri, socketAddress, iOException);
    }
}
