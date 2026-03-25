package com.okinc.business.dex.trade.order.domain.model;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31200lpY;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class OrderSide {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OrderSide[] $VALUES;
    public static final Application Companion;
    private final String side;
    public static final OrderSide None = new OrderSide("None", 0, MultiTransferSignData.DEFAULT_INTERVAL);
    public static final OrderSide Buy = new OrderSide("Buy", 1, "0");
    public static final OrderSide Sell = new OrderSide("Sell", 2, "1");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OrderSide[] $values() {
        return new OrderSide[]{None, Buy, Sell};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OrderSide> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    private OrderSide(String str, int i, String str2) {
        this.side = str2;
    }

    static {
        OrderSide[] orderSideArr$values = $values();
        $VALUES = orderSideArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(orderSideArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.order.domain.model.OrderSide.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final OrderSide KWHzl(@NotNull String str) {
            OrderSide next;
            Intrinsics.checkNotNullParameter(str, "");
            Iterator<OrderSide> it = OrderSide.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) next.getSide(), (Object) str)) {
                    break;
                }
            }
            OrderSide orderSide = next;
            if (orderSide != null) {
                return orderSide;
            }
            return (OrderSide) C31200lpY.copydefault(OrderSide.None, "Unsupported exchangeDirection:" + str);
        }
    }

    public static OrderSide valueOf(String str) {
        return (OrderSide) Enum.valueOf(OrderSide.class, str);
    }

    public static OrderSide[] values() {
        return (OrderSide[]) $VALUES.clone();
    }
}
