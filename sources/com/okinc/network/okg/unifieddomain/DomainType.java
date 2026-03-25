package com.okinc.network.okg.unifieddomain;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class DomainType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DomainType[] $VALUES;
    public static final DomainType NATIVE = new DomainType("NATIVE", 0);
    public static final DomainType WEBVIEW = new DomainType("WEBVIEW", 1);
    public static final DomainType OSS = new DomainType("OSS", 2);
    public static final DomainType CDN = new DomainType("CDN", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DomainType[] $values() {
        return new DomainType[]{NATIVE, WEBVIEW, OSS, CDN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DomainType> getEntries() {
        return $ENTRIES;
    }

    private DomainType(String str, int i) {
    }

    static {
        DomainType[] domainTypeArr$values = $values();
        $VALUES = domainTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(domainTypeArr$values);
    }

    public static DomainType valueOf(String str) {
        return (DomainType) Enum.valueOf(DomainType.class, str);
    }

    public static DomainType[] values() {
        return (DomainType[]) $VALUES.clone();
    }
}
