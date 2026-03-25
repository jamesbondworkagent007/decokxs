package com.okinc.business.web3pay.api.model;

import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class Web3PayOrderStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ Web3PayOrderStatus[] $VALUES;
    public static final TaskDescription Companion;
    private final int value;
    public static final Web3PayOrderStatus PENDING = new Web3PayOrderStatus(CardSyncResponse.PENDING, 0, 1);
    public static final Web3PayOrderStatus WAITING_CLAIM = new Web3PayOrderStatus("WAITING_CLAIM", 1, 2);
    public static final Web3PayOrderStatus SUCCESS = new Web3PayOrderStatus("SUCCESS", 2, 3);
    public static final Web3PayOrderStatus FAILED = new Web3PayOrderStatus(CardSyncResponse.FAILED, 3, 4);
    public static final Web3PayOrderStatus REFUND = new Web3PayOrderStatus("REFUND", 4, 5);
    public static final Web3PayOrderStatus CANCELLING = new Web3PayOrderStatus("CANCELLING", 5, 6);
    public static final Web3PayOrderStatus CANCELLED = new Web3PayOrderStatus("CANCELLED", 6, 7);
    public static final Web3PayOrderStatus EXPIRED = new Web3PayOrderStatus("EXPIRED", 7, 8);
    public static final Web3PayOrderStatus VOIDED = new Web3PayOrderStatus("VOIDED", 8, 9);
    public static final Web3PayOrderStatus DECLINED = new Web3PayOrderStatus("DECLINED", 9, 10);
    public static final Web3PayOrderStatus CARD_PENDING = new Web3PayOrderStatus("CARD_PENDING", 10, 11);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ Web3PayOrderStatus[] $values() {
        return new Web3PayOrderStatus[]{PENDING, WAITING_CLAIM, SUCCESS, FAILED, REFUND, CANCELLING, CANCELLED, EXPIRED, VOIDED, DECLINED, CARD_PENDING};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<Web3PayOrderStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private Web3PayOrderStatus(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        Web3PayOrderStatus[] web3PayOrderStatusArr$values = $values();
        $VALUES = web3PayOrderStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(web3PayOrderStatusArr$values);
        Companion = new TaskDescription(null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.api.model.Web3PayOrderStatus.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static Web3PayOrderStatus valueOf(String str) {
        return (Web3PayOrderStatus) Enum.valueOf(Web3PayOrderStatus.class, str);
    }

    public static Web3PayOrderStatus[] values() {
        return (Web3PayOrderStatus[]) $VALUES.clone();
    }
}
