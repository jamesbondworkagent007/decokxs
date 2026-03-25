package com.okinc.business.defi.api.bean.passkeywallet.cedefi;

import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class OrderStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OrderStatus[] $VALUES;
    public static final Activity Companion;
    private final int value;
    public static final OrderStatus PENDING = new OrderStatus(CardSyncResponse.PENDING, 0, 1);
    public static final OrderStatus SUCCESS = new OrderStatus("SUCCESS", 1, 3);
    public static final OrderStatus FAILED = new OrderStatus(CardSyncResponse.FAILED, 2, 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OrderStatus[] $values() {
        return new OrderStatus[]{PENDING, SUCCESS, FAILED};
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
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.passkeywallet.cedefi.OrderStatus.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final OrderStatus OLrzqt(int i) {
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
