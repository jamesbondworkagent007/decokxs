package com.okinc.business.web3pay.lib.core.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class OrderSubStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OrderSubStatus[] $VALUES;
    public static final TaskDescription Companion;
    private final int value;
    public static final OrderSubStatus CONVERT_UNFINISHED = new OrderSubStatus("CONVERT_UNFINISHED", 0, 1);
    public static final OrderSubStatus CONVERT_FINISHED = new OrderSubStatus("CONVERT_FINISHED", 1, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OrderSubStatus[] $values() {
        return new OrderSubStatus[]{CONVERT_UNFINISHED, CONVERT_FINISHED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OrderSubStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private OrderSubStatus(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        OrderSubStatus[] orderSubStatusArr$values = $values();
        $VALUES = orderSubStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(orderSubStatusArr$values);
        Companion = new TaskDescription(null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.core.model.OrderSubStatus.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final OrderSubStatus AEQbTJ(int i) {
            for (OrderSubStatus orderSubStatus : OrderSubStatus.values()) {
                if (orderSubStatus.getValue() == i) {
                    return orderSubStatus;
                }
            }
            return null;
        }
    }

    public static OrderSubStatus valueOf(String str) {
        return (OrderSubStatus) Enum.valueOf(OrderSubStatus.class, str);
    }

    public static OrderSubStatus[] values() {
        return (OrderSubStatus[]) $VALUES.clone();
    }
}
