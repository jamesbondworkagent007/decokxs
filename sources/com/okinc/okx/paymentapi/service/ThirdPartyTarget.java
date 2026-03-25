package com.okinc.okx.paymentapi.service;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class ThirdPartyTarget {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ThirdPartyTarget[] $VALUES;
    public static final ThirdPartyTarget ACH = new ThirdPartyTarget("ACH", 0);
    public static final ThirdPartyTarget PAYPAL = new ThirdPartyTarget("PAYPAL", 1);
    public static final ThirdPartyTarget LEAN_LINKAGE = new ThirdPartyTarget("LEAN_LINKAGE", 2);
    public static final ThirdPartyTarget LEAN_DEPOSIT = new ThirdPartyTarget("LEAN_DEPOSIT", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ThirdPartyTarget[] $values() {
        return new ThirdPartyTarget[]{ACH, PAYPAL, LEAN_LINKAGE, LEAN_DEPOSIT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ThirdPartyTarget> getEntries() {
        return $ENTRIES;
    }

    private ThirdPartyTarget(String str, int i) {
    }

    static {
        ThirdPartyTarget[] thirdPartyTargetArr$values = $values();
        $VALUES = thirdPartyTargetArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(thirdPartyTargetArr$values);
    }

    public static ThirdPartyTarget valueOf(String str) {
        return (ThirdPartyTarget) Enum.valueOf(ThirdPartyTarget.class, str);
    }

    public static ThirdPartyTarget[] values() {
        return (ThirdPartyTarget[]) $VALUES.clone();
    }
}
