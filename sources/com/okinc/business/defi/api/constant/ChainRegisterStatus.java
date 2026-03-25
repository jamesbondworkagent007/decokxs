package com.okinc.business.defi.api.constant;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ChainRegisterStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ChainRegisterStatus[] $VALUES;
    public static final ChainRegisterStatus REGISTERED = new ChainRegisterStatus("REGISTERED", 0);
    public static final ChainRegisterStatus REGISTERING = new ChainRegisterStatus("REGISTERING", 1);
    public static final ChainRegisterStatus UNREGISTERED = new ChainRegisterStatus("UNREGISTERED", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ChainRegisterStatus[] $values() {
        return new ChainRegisterStatus[]{REGISTERED, REGISTERING, UNREGISTERED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ChainRegisterStatus> getEntries() {
        return $ENTRIES;
    }

    private ChainRegisterStatus(String str, int i) {
    }

    static {
        ChainRegisterStatus[] chainRegisterStatusArr$values = $values();
        $VALUES = chainRegisterStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(chainRegisterStatusArr$values);
    }

    public static ChainRegisterStatus valueOf(String str) {
        return (ChainRegisterStatus) Enum.valueOf(ChainRegisterStatus.class, str);
    }

    public static ChainRegisterStatus[] values() {
        return (ChainRegisterStatus[]) $VALUES.clone();
    }
}
