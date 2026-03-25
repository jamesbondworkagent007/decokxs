package com.okinc.business.dex.trade.order.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class HistoryOrderType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ HistoryOrderType[] $VALUES;
    public static final TaskDescription Companion;
    private final String type;
    public static final HistoryOrderType Swap = new HistoryOrderType("Swap", 0, "Swap");
    public static final HistoryOrderType Bridge = new HistoryOrderType("Bridge", 1, "Bridge");
    public static final HistoryOrderType Limit = new HistoryOrderType("Limit", 2, "Limit");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ HistoryOrderType[] $values() {
        return new HistoryOrderType[]{Swap, Bridge, Limit};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<HistoryOrderType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    private HistoryOrderType(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        HistoryOrderType[] historyOrderTypeArr$values = $values();
        $VALUES = historyOrderTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(historyOrderTypeArr$values);
        Companion = new TaskDescription(null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.order.domain.model.HistoryOrderType.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static HistoryOrderType valueOf(String str) {
        return (HistoryOrderType) Enum.valueOf(HistoryOrderType.class, str);
    }

    public static HistoryOrderType[] values() {
        return (HistoryOrderType[]) $VALUES.clone();
    }
}
