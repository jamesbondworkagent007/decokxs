package com.okinc.business.dex.trade.order.domain.model;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import o.C23274hvD;
import o.C31200lpY;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class OrderStrategyType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OrderStrategyType[] $VALUES;
    public static final TaskDescription Companion;
    private final int strRes;
    private final int type;
    public static final OrderStrategyType Market = new OrderStrategyType("Market", 0, 1, C23274hvD.Fragment.PlaybackStateCompatRepeatMode);
    public static final OrderStrategyType Limit = new OrderStrategyType("Limit", 1, 6, C23274hvD.Fragment.PlaybackStateCompatApi21);
    public static final OrderStrategyType Tp = new OrderStrategyType("Tp", 2, 201, C23274hvD.Fragment.PlaybackStateCompatApi21);
    public static final OrderStrategyType Sl = new OrderStrategyType("Sl", 3, 202, C23274hvD.Fragment.PlaybackStateCompatApi21);
    public static final OrderStrategyType CopyTrade = new OrderStrategyType("CopyTrade", 4, 203, C23274hvD.Fragment.DXd);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OrderStrategyType[] $values() {
        return new OrderStrategyType[]{Market, Limit, Tp, Sl, CopyTrade};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OrderStrategyType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStrRes() {
        return this.strRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    private OrderStrategyType(String str, int i, int i2, int i3) {
        this.type = i2;
        this.strRes = i3;
    }

    static {
        OrderStrategyType[] orderStrategyTypeArr$values = $values();
        $VALUES = orderStrategyTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(orderStrategyTypeArr$values);
        Companion = new TaskDescription(null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.order.domain.model.OrderStrategyType.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final OrderStrategyType copydefault(int i) {
            OrderStrategyType next;
            Iterator<OrderStrategyType> it = OrderStrategyType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.getType() == i) {
                    break;
                }
            }
            OrderStrategyType orderStrategyType = next;
            if (orderStrategyType != null) {
                return orderStrategyType;
            }
            return (OrderStrategyType) C31200lpY.copydefault(OrderStrategyType.Market, "Unsupported OrderStrategyType type:" + i);
        }

        public final OrderStrategyType KWHzl(String str) {
            Integer intOrNull;
            OrderStrategyType orderStrategyType = null;
            if (str == null || (intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(str)) == null) {
                return null;
            }
            int iIntValue = intOrNull.intValue();
            Iterator<OrderStrategyType> it = OrderStrategyType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                OrderStrategyType next = it.next();
                if (next.getType() == iIntValue) {
                    orderStrategyType = next;
                    break;
                }
            }
            return orderStrategyType;
        }
    }

    public static OrderStrategyType valueOf(String str) {
        return (OrderStrategyType) Enum.valueOf(OrderStrategyType.class, str);
    }

    public static OrderStrategyType[] values() {
        return (OrderStrategyType[]) $VALUES.clone();
    }
}
