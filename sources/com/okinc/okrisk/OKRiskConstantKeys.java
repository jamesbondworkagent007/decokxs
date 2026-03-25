package com.okinc.okrisk;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class OKRiskConstantKeys {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OKRiskConstantKeys[] $VALUES;
    public static final OKRiskConstantKeys NO_SEC = new OKRiskConstantKeys("NO_SEC", 0, "no_sec");
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OKRiskConstantKeys[] $values() {
        return new OKRiskConstantKeys[]{NO_SEC};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OKRiskConstantKeys> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private OKRiskConstantKeys(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        OKRiskConstantKeys[] oKRiskConstantKeysArr$values = $values();
        $VALUES = oKRiskConstantKeysArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(oKRiskConstantKeysArr$values);
    }

    public static OKRiskConstantKeys valueOf(String str) {
        return (OKRiskConstantKeys) Enum.valueOf(OKRiskConstantKeys.class, str);
    }

    public static OKRiskConstantKeys[] values() {
        return (OKRiskConstantKeys[]) $VALUES.clone();
    }
}
