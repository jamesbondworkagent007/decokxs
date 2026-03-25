package com.okinc.buysell.api.data;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class BSCFlowType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BSCFlowType[] $VALUES;
    public static final BSCFlowType ONSHORE = new BSCFlowType("ONSHORE", 0);
    public static final BSCFlowType OFFSHORE = new BSCFlowType("OFFSHORE", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BSCFlowType[] $values() {
        return new BSCFlowType[]{ONSHORE, OFFSHORE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BSCFlowType> getEntries() {
        return $ENTRIES;
    }

    private BSCFlowType(String str, int i) {
    }

    static {
        BSCFlowType[] bSCFlowTypeArr$values = $values();
        $VALUES = bSCFlowTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(bSCFlowTypeArr$values);
    }

    public static BSCFlowType valueOf(String str) {
        return (BSCFlowType) Enum.valueOf(BSCFlowType.class, str);
    }

    public static BSCFlowType[] values() {
        return (BSCFlowType[]) $VALUES.clone();
    }
}
