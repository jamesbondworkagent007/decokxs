package com.okinc.okassetslite.api.assets_lite_api.transactionhistory.model;

import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class FiatTransactionEventStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FiatTransactionEventStatus[] $VALUES;
    public static final StateListAnimator Companion;
    private int value;
    public static final FiatTransactionEventStatus UNKNOWN = new FiatTransactionEventStatus("UNKNOWN", 0, -1);
    public static final FiatTransactionEventStatus PROCESSING = new FiatTransactionEventStatus("PROCESSING", 1, 1);
    public static final FiatTransactionEventStatus SUCCESS = new FiatTransactionEventStatus("SUCCESS", 2, 2);
    public static final FiatTransactionEventStatus CANCELLED = new FiatTransactionEventStatus("CANCELLED", 3, 3);
    public static final FiatTransactionEventStatus FAILED = new FiatTransactionEventStatus(CardSyncResponse.FAILED, 4, 4);
    public static final FiatTransactionEventStatus SUBMITTED = new FiatTransactionEventStatus("SUBMITTED", 5, 5);
    public static final FiatTransactionEventStatus REVERSED = new FiatTransactionEventStatus("REVERSED", 6, 6);
    public static final FiatTransactionEventStatus REVERSING = new FiatTransactionEventStatus("REVERSING", 7, 7);
    public static final FiatTransactionEventStatus COMPLETED = new FiatTransactionEventStatus("COMPLETED", 8, 8);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FiatTransactionEventStatus[] $values() {
        return new FiatTransactionEventStatus[]{UNKNOWN, PROCESSING, SUCCESS, CANCELLED, FAILED, SUBMITTED, REVERSED, REVERSING, COMPLETED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FiatTransactionEventStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValue(int i) {
        this.value = i;
    }

    private FiatTransactionEventStatus(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        FiatTransactionEventStatus[] fiatTransactionEventStatusArr$values = $values();
        $VALUES = fiatTransactionEventStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(fiatTransactionEventStatusArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okassetslite.api.assets_lite_api.transactionhistory.model.FiatTransactionEventStatus.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static FiatTransactionEventStatus valueOf(String str) {
        return (FiatTransactionEventStatus) Enum.valueOf(FiatTransactionEventStatus.class, str);
    }

    public static FiatTransactionEventStatus[] values() {
        return (FiatTransactionEventStatus[]) $VALUES.clone();
    }
}
