package com.okinc.business.defi.api.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class NostrSignType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ NostrSignType[] $VALUES;
    public static final NostrSignType MESSAGE = new NostrSignType("MESSAGE", 0);
    public static final NostrSignType ENCRYPT = new NostrSignType("ENCRYPT", 1);
    public static final NostrSignType DECRYPT = new NostrSignType("DECRYPT", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ NostrSignType[] $values() {
        return new NostrSignType[]{MESSAGE, ENCRYPT, DECRYPT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<NostrSignType> getEntries() {
        return $ENTRIES;
    }

    private NostrSignType(String str, int i) {
    }

    static {
        NostrSignType[] nostrSignTypeArr$values = $values();
        $VALUES = nostrSignTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(nostrSignTypeArr$values);
    }

    public static NostrSignType valueOf(String str) {
        return (NostrSignType) Enum.valueOf(NostrSignType.class, str);
    }

    public static NostrSignType[] values() {
        return (NostrSignType[]) $VALUES.clone();
    }
}
