package com.okinc.network.okg.tag;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class RequestTagEnum {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RequestTagEnum[] $VALUES;
    private final String tag;
    public static final RequestTagEnum NONE = new RequestTagEnum("NONE", 0, "none");
    public static final RequestTagEnum WEB3 = new RequestTagEnum("WEB3", 1, "web3");
    public static final RequestTagEnum EXCHANGE = new RequestTagEnum("EXCHANGE", 2, "exchange");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RequestTagEnum[] $values() {
        return new RequestTagEnum[]{NONE, WEB3, EXCHANGE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RequestTagEnum> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    private RequestTagEnum(String str, int i, String str2) {
        this.tag = str2;
    }

    static {
        RequestTagEnum[] requestTagEnumArr$values = $values();
        $VALUES = requestTagEnumArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(requestTagEnumArr$values);
    }

    public static RequestTagEnum valueOf(String str) {
        return (RequestTagEnum) Enum.valueOf(RequestTagEnum.class, str);
    }

    public static RequestTagEnum[] values() {
        return (RequestTagEnum[]) $VALUES.clone();
    }
}
