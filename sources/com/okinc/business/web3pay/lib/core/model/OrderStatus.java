package com.okinc.business.web3pay.lib.core.model;

import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class OrderStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OrderStatus[] $VALUES;
    public static final ActionBar Companion;
    private final int value;
    public static final OrderStatus PENDING = new OrderStatus(CardSyncResponse.PENDING, 0, 1);
    public static final OrderStatus WAITING_CLAIM = new OrderStatus("WAITING_CLAIM", 1, 2);
    public static final OrderStatus SUCCESS = new OrderStatus("SUCCESS", 2, 3);
    public static final OrderStatus FAILED = new OrderStatus(CardSyncResponse.FAILED, 3, 4);
    public static final OrderStatus REFUND = new OrderStatus("REFUND", 4, 5);
    public static final OrderStatus CANCELLING = new OrderStatus("CANCELLING", 5, 6);
    public static final OrderStatus CANCELLED = new OrderStatus("CANCELLED", 6, 7);
    public static final OrderStatus EXPIRED = new OrderStatus("EXPIRED", 7, 8);
    public static final OrderStatus VOIDED = new OrderStatus("VOIDED", 8, 9);
    public static final OrderStatus DECLINED = new OrderStatus("DECLINED", 9, 10);
    public static final OrderStatus CARD_PENDING = new OrderStatus("CARD_PENDING", 10, 11);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OrderStatus[] $values() {
        return new OrderStatus[]{PENDING, WAITING_CLAIM, SUCCESS, FAILED, REFUND, CANCELLING, CANCELLED, EXPIRED, VOIDED, DECLINED, CARD_PENDING};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OrderStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private OrderStatus(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        OrderStatus[] orderStatusArr$values = $values();
        $VALUES = orderStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(orderStatusArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.core.model.OrderStatus.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final OrderStatus EZpvd(int i) {
            for (OrderStatus orderStatus : OrderStatus.values()) {
                if (orderStatus.getValue() == i) {
                    return orderStatus;
                }
            }
            return null;
        }
    }

    public static OrderStatus valueOf(String str) {
        return (OrderStatus) Enum.valueOf(OrderStatus.class, str);
    }

    public static OrderStatus[] values() {
        return (OrderStatus[]) $VALUES.clone();
    }
}
