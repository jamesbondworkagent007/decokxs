package com.okinc.buysell.common;

import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class FiatOrderStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FiatOrderStatus[] $VALUES;
    private final int value;
    public static final FiatOrderStatus IGNORED = new FiatOrderStatus("IGNORED", 0, -1);
    public static final FiatOrderStatus CREATED = new FiatOrderStatus(DebugCoroutineInfoImplKt.CREATED, 1, 0);
    public static final FiatOrderStatus PROCESSING = new FiatOrderStatus("PROCESSING", 2, 1);
    public static final FiatOrderStatus FAILED = new FiatOrderStatus(CardSyncResponse.FAILED, 3, 2);
    public static final FiatOrderStatus SUCCESS = new FiatOrderStatus("SUCCESS", 4, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FiatOrderStatus[] $values() {
        return new FiatOrderStatus[]{IGNORED, CREATED, PROCESSING, FAILED, SUCCESS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FiatOrderStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private FiatOrderStatus(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        FiatOrderStatus[] fiatOrderStatusArr$values = $values();
        $VALUES = fiatOrderStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(fiatOrderStatusArr$values);
    }

    public static FiatOrderStatus valueOf(String str) {
        return (FiatOrderStatus) Enum.valueOf(FiatOrderStatus.class, str);
    }

    public static FiatOrderStatus[] values() {
        return (FiatOrderStatus[]) $VALUES.clone();
    }
}
