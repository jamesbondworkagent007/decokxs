package com.okinc.websocket.connection;

import com.okinc.network.okg.dns.DohTypeEnum;
import o.C43334rnN;
import o.C43337rnQ;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import okhttp3.Dns;
import okhttp3.Interceptor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class OKWsDoh {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OKWsDoh[] $VALUES;
    public static final OKWsDoh DEXPRI;
    public static final OKWsDoh V5;
    private final Dns dns;
    private final DohTypeEnum dohType;
    private final Interceptor interceptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OKWsDoh[] $values() {
        return new OKWsDoh[]{V5, DEXPRI};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OKWsDoh> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Dns getDns$OKNetwork_websocket() {
        return this.dns;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DohTypeEnum getDnsDohType$OKNetwork_websocket() {
        return this.dohType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Interceptor getDnsInterceptor$OKNetwork_websocket() {
        return this.interceptor;
    }

    private OKWsDoh(String str, int i, Dns dns, Interceptor interceptor, DohTypeEnum dohTypeEnum) {
        this.dns = dns;
        this.interceptor = interceptor;
        this.dohType = dohTypeEnum;
    }

    static {
        DohTypeEnum dohTypeEnum = DohTypeEnum.V5;
        V5 = new OKWsDoh("V5", 0, new C43337rnQ(dohTypeEnum), new C43334rnN(dohTypeEnum), dohTypeEnum);
        DohTypeEnum dohTypeEnum2 = DohTypeEnum.DEXPRI;
        DEXPRI = new OKWsDoh("DEXPRI", 1, new C43337rnQ(dohTypeEnum2), new C43334rnN(dohTypeEnum2), dohTypeEnum2);
        OKWsDoh[] oKWsDohArr$values = $values();
        $VALUES = oKWsDohArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(oKWsDohArr$values);
    }

    public static OKWsDoh valueOf(String str) {
        return (OKWsDoh) Enum.valueOf(OKWsDoh.class, str);
    }

    public static OKWsDoh[] values() {
        return (OKWsDoh[]) $VALUES.clone();
    }
}
