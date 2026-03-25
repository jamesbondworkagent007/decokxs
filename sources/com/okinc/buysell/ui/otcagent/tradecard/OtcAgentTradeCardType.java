package com.okinc.buysell.ui.otcagent.tradecard;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.C59449zhJ;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class OtcAgentTradeCardType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OtcAgentTradeCardType[] $VALUES;
    public static final TaskDescription Companion;
    private final String value;
    public static final OtcAgentTradeCardType BUY = new OtcAgentTradeCardType("BUY", 0, "buy");
    public static final OtcAgentTradeCardType SELL = new OtcAgentTradeCardType("SELL", 1, "sell");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OtcAgentTradeCardType[] $values() {
        return new OtcAgentTradeCardType[]{BUY, SELL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OtcAgentTradeCardType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private OtcAgentTradeCardType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        OtcAgentTradeCardType[] otcAgentTradeCardTypeArr$values = $values();
        $VALUES = otcAgentTradeCardTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(otcAgentTradeCardTypeArr$values);
        Companion = new TaskDescription(null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardType.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final OtcAgentTradeCardType AEQbTJ(String str) {
            OtcAgentTradeCardType next;
            Iterator<OtcAgentTradeCardType> it = OtcAgentTradeCardType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C59449zhJ.gEmmrt(next.getValue(), str, true)) {
                    break;
                }
            }
            OtcAgentTradeCardType otcAgentTradeCardType = next;
            return otcAgentTradeCardType == null ? OtcAgentTradeCardType.BUY : otcAgentTradeCardType;
        }
    }

    public static OtcAgentTradeCardType valueOf(String str) {
        return (OtcAgentTradeCardType) Enum.valueOf(OtcAgentTradeCardType.class, str);
    }

    public static OtcAgentTradeCardType[] values() {
        return (OtcAgentTradeCardType[]) $VALUES.clone();
    }
}
