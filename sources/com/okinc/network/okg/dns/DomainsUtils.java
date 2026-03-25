package com.okinc.network.okg.dns;

import com.okinc.network.okg.dns.model.DoHChain;
import com.okinc.network.okg.dns.model.NetType;
import com.okinc.network.request.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class DomainsUtils {
    public static final int $stable;
    public static final String HOLDER_OKX_HTTP_MAIN = "https://okexcomweb.bafang.com";
    public static final String HOLDER_OKX_WS_V5 = "wss://okexcomwspri.bafang.com";
    private static final String HOLDER_TR_HTTP_MAIN = "https://tr.http.holder.com";
    public static final String HOLDER_WEB3_HTTP_MAIN = "https://web3.http.holder.com";
    public static final String HOLDER_WEB3_WS_DEX = "wss://wsdexpri.bafang.com";
    public static final DomainsUtils INSTANCE = new DomainsUtils();
    private static final String TARGET_OKX_HTTP_MAIN = "https://www.okx.com";
    private static final String TARGET_OKX_WS_V5 = "wss://wspri.okx.com";
    private static final String TARGET_TR_HTTP_MAIN = "https://tr.okx.com";
    private static final String TARGET_WEB3_HTTP_MAIN = "https://web3.okx.com";
    private static final String TARGET_WEB3_WS_DEX = "wss://wsdexpri.okx.com";
    private static DoHChain okxHttpMain;
    private static DoHChain okxWsV5;
    private static DoHChain trHttpMain;
    private static DoHChain web3HttpMain;
    private static DoHChain web3WsDex;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DoHChain getOkxHttpMain() {
        return okxHttpMain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DoHChain getOkxWsV5() {
        return okxWsV5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DoHChain getTrHttpMain() {
        return trHttpMain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DoHChain getWeb3HttpMain() {
        return web3HttpMain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DoHChain getWeb3WsDex() {
        return web3WsDex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOkxHttpMain(@NotNull DoHChain doHChain) {
        Intrinsics.checkNotNullParameter(doHChain, "");
        okxHttpMain = doHChain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOkxWsV5(@NotNull DoHChain doHChain) {
        Intrinsics.checkNotNullParameter(doHChain, "");
        okxWsV5 = doHChain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTrHttpMain(@NotNull DoHChain doHChain) {
        Intrinsics.checkNotNullParameter(doHChain, "");
        trHttpMain = doHChain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWeb3HttpMain(@NotNull DoHChain doHChain) {
        Intrinsics.checkNotNullParameter(doHChain, "");
        web3HttpMain = doHChain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWeb3WsDex(@NotNull DoHChain doHChain) {
        Intrinsics.checkNotNullParameter(doHChain, "");
        web3WsDex = doHChain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setupDomains(@NotNull DoHChain doHChain, @NotNull DoHChain doHChain2, @NotNull DoHChain doHChain3, @NotNull DoHChain doHChain4, @NotNull DoHChain doHChain5) {
        Intrinsics.checkNotNullParameter(doHChain, "");
        Intrinsics.checkNotNullParameter(doHChain2, "");
        Intrinsics.checkNotNullParameter(doHChain3, "");
        Intrinsics.checkNotNullParameter(doHChain4, "");
        Intrinsics.checkNotNullParameter(doHChain5, "");
        okxHttpMain = doHChain;
        web3HttpMain = doHChain2;
        okxWsV5 = doHChain3;
        web3WsDex = doHChain4;
        trHttpMain = doHChain5;
    }

    private DomainsUtils() {
    }

    static {
        NetType netType = NetType.HTTP;
        okxHttpMain = new DoHChain(netType, new Uri(HOLDER_OKX_HTTP_MAIN), new Uri(TARGET_OKX_HTTP_MAIN));
        web3HttpMain = new DoHChain(netType, new Uri(HOLDER_WEB3_HTTP_MAIN), new Uri(TARGET_WEB3_HTTP_MAIN));
        NetType netType2 = NetType.WebSocket;
        okxWsV5 = new DoHChain(netType2, new Uri(HOLDER_OKX_WS_V5), new Uri(TARGET_OKX_WS_V5));
        web3WsDex = new DoHChain(netType2, new Uri(HOLDER_WEB3_WS_DEX), new Uri(TARGET_WEB3_WS_DEX));
        trHttpMain = new DoHChain(netType, new Uri(HOLDER_TR_HTTP_MAIN), new Uri(TARGET_TR_HTTP_MAIN));
        $stable = 8;
    }
}
