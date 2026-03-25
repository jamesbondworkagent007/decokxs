package com.okinc.business.defi.wallet.metricsmonitor;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class DeleteActionType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DeleteActionType[] $VALUES;
    public static final DeleteActionType DELETE = new DeleteActionType("DELETE", 0, RequestParameters.SUBRESOURCE_DELETE);
    public static final DeleteActionType RESET = new DeleteActionType("RESET", 1, "reset");
    private final String stringValue;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DeleteActionType[] $values() {
        return new DeleteActionType[]{DELETE, RESET};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DeleteActionType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStringValue() {
        return this.stringValue;
    }

    private DeleteActionType(String str, int i, String str2) {
        this.stringValue = str2;
    }

    static {
        DeleteActionType[] deleteActionTypeArr$values = $values();
        $VALUES = deleteActionTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(deleteActionTypeArr$values);
    }

    public static DeleteActionType valueOf(String str) {
        return (DeleteActionType) Enum.valueOf(DeleteActionType.class, str);
    }

    public static DeleteActionType[] values() {
        return (DeleteActionType[]) $VALUES.clone();
    }
}
