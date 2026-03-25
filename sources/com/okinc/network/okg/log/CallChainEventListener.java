package com.okinc.network.okg.log;

import com.okinc.network.model.CallChainExtraInfo;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class CallChainEventListener extends EventListener {
    private static final String TAG = "CallChainEventListener";
    private String currentHost;
    public static final Application Companion = new Application(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // okhttp3.EventListener
    public void dnsStart(@NotNull Call call, @NotNull String str) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.currentHost = str;
    }

    @Override // okhttp3.EventListener
    public void connectionAcquired(@NotNull Call call, @NotNull Connection connection) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(connection, "");
        Proxy.Type type = connection.route().proxy().type();
        Intrinsics.checkNotNullExpressionValue(type, "");
        updateCallChainExtraInfo(true, call, call.request().url().newBuilder().host(getHostOrdered(connection, call)).build(), connection.socket().getInetAddress(), type);
    }

    @Override // okhttp3.EventListener
    public void connectFailed(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, Protocol protocol, @NotNull IOException iOException) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "");
        Intrinsics.checkNotNullParameter(proxy, "");
        Intrinsics.checkNotNullParameter(iOException, "");
        Proxy.Type type = proxy.type();
        Intrinsics.checkNotNullExpressionValue(type, "");
        updateCallChainExtraInfo(false, call, call.request().url().newBuilder().host(getHostOrdered(null, call)).build(), toInetAddressOrNull(inetSocketAddress), type);
    }

    private final void updateCallChainExtraInfo(boolean z, Call call, HttpUrl httpUrl, InetAddress inetAddress, Proxy.Type type) {
        CallChainExtraInfo callChainExtraInfo = (CallChainExtraInfo) call.request().tag(CallChainExtraInfo.class);
        if (callChainExtraInfo != null) {
            callChainExtraInfo.setConnectSuccess(Boolean.valueOf(z));
            callChainExtraInfo.setConnectUrl(httpUrl);
            callChainExtraInfo.setProxyType(type);
            if (inetAddress != null) {
                callChainExtraInfo.setConnectIP(inetAddress);
            }
        }
    }

    private final InetAddress toInetAddressOrNull(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        if (address != null) {
            return address;
        }
        String hostName = inetSocketAddress.getHostName();
        Intrinsics.copydefault((Object) hostName);
        if (!(!StringsKt__StringsKt.fARcdN((CharSequence) hostName))) {
            hostName = null;
        }
        if (hostName == null) {
            String hostString = inetSocketAddress.getHostString();
            Intrinsics.copydefault((Object) hostString);
            hostName = StringsKt__StringsKt.fARcdN((CharSequence) hostString) ^ true ? hostString : null;
            if (hostName == null) {
                return null;
            }
        }
        try {
            return InetAddress.getByName(hostName);
        } catch (Exception unused) {
            return null;
        }
    }

    private final String getHostOrdered(Connection connection, Call call) {
        HttpUrl connectUrl;
        String str = this.currentHost;
        if (str != null && !StringsKt__StringsKt.fARcdN((CharSequence) str)) {
            return str;
        }
        if (connection != null) {
            String strHost = connection.route().address().url().host();
            if (!StringsKt__StringsKt.fARcdN((CharSequence) strHost)) {
                return strHost;
            }
        }
        CallChainExtraInfo callChainExtraInfo = (CallChainExtraInfo) call.request().tag(CallChainExtraInfo.class);
        if (callChainExtraInfo != null && (connectUrl = callChainExtraInfo.getConnectUrl()) != null) {
            return connectUrl.host();
        }
        return call.request().url().host();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.network.okg.log.CallChainEventListener.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
