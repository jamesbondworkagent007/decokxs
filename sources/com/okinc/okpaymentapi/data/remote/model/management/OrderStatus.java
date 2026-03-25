package com.okinc.okpaymentapi.data.remote.model.management;

import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.yED;
import o.yEE;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class OrderStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OrderStatus[] $VALUES;
    public static final Application Companion;
    private final Set<String> codes;
    public static final OrderStatus PAID = new OrderStatus("PAID", 0, yED.AEQbTJ("100"));
    public static final OrderStatus PENDING = new OrderStatus(CardSyncResponse.PENDING, 1, yEE.AhwBna("20", "50", "90"));
    public static final OrderStatus VERIFY = new OrderStatus("VERIFY", 2, yED.AEQbTJ("85"));
    public static final OrderStatus FAILURE = new OrderStatus("FAILURE", 3, yED.AEQbTJ("-60"));
    public static final OrderStatus DENIED = new OrderStatus("DENIED", 4, yED.AEQbTJ("-64"));
    public static final OrderStatus TRANSACTION_EXPIRED = new OrderStatus("TRANSACTION_EXPIRED", 5, yED.AEQbTJ("-80"));
    public static final OrderStatus ABORTED_USER = new OrderStatus("ABORTED_USER", 6, yED.AEQbTJ("-90"));
    public static final OrderStatus FAILED = new OrderStatus(CardSyncResponse.FAILED, 7, yEE.copydefault());

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OrderStatus[] $values() {
        return new OrderStatus[]{PAID, PENDING, VERIFY, FAILURE, DENIED, TRANSACTION_EXPIRED, ABORTED_USER, FAILED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OrderStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Set<String> getCodes() {
        return this.codes;
    }

    private OrderStatus(String str, int i, Set set) {
        this.codes = set;
    }

    static {
        OrderStatus[] orderStatusArr$values = $values();
        $VALUES = orderStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(orderStatusArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.management.OrderStatus.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static OrderStatus valueOf(String str) {
        return (OrderStatus) Enum.valueOf(OrderStatus.class, str);
    }

    public static OrderStatus[] values() {
        return (OrderStatus[]) $VALUES.clone();
    }
}
