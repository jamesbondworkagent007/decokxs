package com.okinc.lib.monitor.memory;

import com.okinc.business.defi.api.bean.VerifyDAppDomainUrlResponse;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class LeakCertainty {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LeakCertainty[] $VALUES;
    private final String displayName;
    public static final LeakCertainty LOW = new LeakCertainty(VerifyDAppDomainUrlResponse.LEVEL_LOW, 0, "Low");
    public static final LeakCertainty HIGH = new LeakCertainty(VerifyDAppDomainUrlResponse.LEVEL_HIGH, 1, "High");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LeakCertainty[] $values() {
        return new LeakCertainty[]{LOW, HIGH};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LeakCertainty> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayName() {
        return this.displayName;
    }

    private LeakCertainty(String str, int i, String str2) {
        this.displayName = str2;
    }

    static {
        LeakCertainty[] leakCertaintyArr$values = $values();
        $VALUES = leakCertaintyArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(leakCertaintyArr$values);
    }

    public static LeakCertainty valueOf(String str) {
        return (LeakCertainty) Enum.valueOf(LeakCertainty.class, str);
    }

    public static LeakCertainty[] values() {
        return (LeakCertainty[]) $VALUES.clone();
    }
}
