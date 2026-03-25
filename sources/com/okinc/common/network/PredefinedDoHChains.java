package com.okinc.common.network;

import com.okinc.network.okg.dns.DomainsUtils;
import com.okinc.network.okg.dns.model.DoHChain;
import com.okinc.network.okg.dns.model.NetType;
import com.okinc.network.request.Uri;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class PredefinedDoHChains {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PredefinedDoHChains[] $VALUES;
    public static final PredefinedDoHChains OKX_HTTP_MAIN;
    public static final PredefinedDoHChains OKX_WS_V5;
    public static final PredefinedDoHChains TR_HTTP_MAIN;
    public static final PredefinedDoHChains WEB3_HTTP_MAIN;
    public static final PredefinedDoHChains WEB3_WS_DEX;
    private final Uri holder;
    private final NetType netType;
    private final Uri target;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PredefinedDoHChains[] $values() {
        return new PredefinedDoHChains[]{OKX_HTTP_MAIN, OKX_WS_V5, WEB3_HTTP_MAIN, WEB3_WS_DEX, TR_HTTP_MAIN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PredefinedDoHChains> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Uri getHolder() {
        return this.holder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NetType getNetType() {
        return this.netType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Uri getTarget() {
        return this.target;
    }

    private PredefinedDoHChains(String str, int i, NetType netType, Uri uri, Uri uri2) {
        this.netType = netType;
        this.holder = uri;
        this.target = uri2;
    }

    static {
        NetType netType = NetType.HTTP;
        OKX_HTTP_MAIN = new PredefinedDoHChains("OKX_HTTP_MAIN", 0, netType, new Uri(DomainsUtils.HOLDER_OKX_HTTP_MAIN), new Uri("https://www.okx.com"));
        NetType netType2 = NetType.WebSocket;
        OKX_WS_V5 = new PredefinedDoHChains("OKX_WS_V5", 1, netType2, new Uri(DomainsUtils.HOLDER_OKX_WS_V5), new Uri("wss://wspri.okx.com"));
        WEB3_HTTP_MAIN = new PredefinedDoHChains("WEB3_HTTP_MAIN", 2, netType, new Uri(DomainsUtils.HOLDER_WEB3_HTTP_MAIN), new Uri("https://web3.okx.com"));
        WEB3_WS_DEX = new PredefinedDoHChains("WEB3_WS_DEX", 3, netType2, new Uri(DomainsUtils.HOLDER_WEB3_WS_DEX), new Uri("wss://wsdexpri.okx.com"));
        TR_HTTP_MAIN = new PredefinedDoHChains("TR_HTTP_MAIN", 4, netType, new Uri("https://tr.http.holder.com"), new Uri("https://tr.okx.com"));
        PredefinedDoHChains[] predefinedDoHChainsArr$values = $values();
        $VALUES = predefinedDoHChainsArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(predefinedDoHChainsArr$values);
    }

    public final DoHChain toPlainModel() {
        return new DoHChain(this.netType, this.holder, this.target);
    }

    public static PredefinedDoHChains valueOf(String str) {
        return (PredefinedDoHChains) Enum.valueOf(PredefinedDoHChains.class, str);
    }

    public static PredefinedDoHChains[] values() {
        return (PredefinedDoHChains[]) $VALUES.clone();
    }
}
