package com.okinc.business.dex.trade.component.orderandposition.ordertab.domain.model;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class OrderAndPositionTab {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OrderAndPositionTab[] $VALUES;
    public static final TaskDescription Companion;
    private final String tabName;
    public static final OrderAndPositionTab Position = new OrderAndPositionTab("Position", 0, "Position");
    public static final OrderAndPositionTab Order = new OrderAndPositionTab("Order", 1, "Order");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OrderAndPositionTab[] $values() {
        return new OrderAndPositionTab[]{Position, Order};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OrderAndPositionTab> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTabName() {
        return this.tabName;
    }

    private OrderAndPositionTab(String str, int i, String str2) {
        this.tabName = str2;
    }

    static {
        OrderAndPositionTab[] orderAndPositionTabArr$values = $values();
        $VALUES = orderAndPositionTabArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(orderAndPositionTabArr$values);
        Companion = new TaskDescription(null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.component.orderandposition.ordertab.domain.model.OrderAndPositionTab.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final OrderAndPositionTab KWHzl(@NotNull String str) {
            OrderAndPositionTab next;
            Intrinsics.checkNotNullParameter(str, "");
            Iterator<OrderAndPositionTab> it = OrderAndPositionTab.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) next.getTabName(), (Object) str)) {
                    break;
                }
            }
            OrderAndPositionTab orderAndPositionTab = next;
            return orderAndPositionTab == null ? OrderAndPositionTab.Position : orderAndPositionTab;
        }
    }

    public static OrderAndPositionTab valueOf(String str) {
        return (OrderAndPositionTab) Enum.valueOf(OrderAndPositionTab.class, str);
    }

    public static OrderAndPositionTab[] values() {
        return (OrderAndPositionTab[]) $VALUES.clone();
    }
}
