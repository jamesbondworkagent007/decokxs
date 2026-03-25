package com.okinc.buysell.ui.otcagent.depositcard;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.C59449zhJ;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class OtcAgentDepositCardDepositType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OtcAgentDepositCardDepositType[] $VALUES;
    public static final Activity Companion;
    private final String value;
    public static final OtcAgentDepositCardDepositType FIAT = new OtcAgentDepositCardDepositType("FIAT", 0, "FIAT");
    public static final OtcAgentDepositCardDepositType CRYPTO = new OtcAgentDepositCardDepositType("CRYPTO", 1, "CRYPTO");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OtcAgentDepositCardDepositType[] $values() {
        return new OtcAgentDepositCardDepositType[]{FIAT, CRYPTO};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OtcAgentDepositCardDepositType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private OtcAgentDepositCardDepositType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        OtcAgentDepositCardDepositType[] otcAgentDepositCardDepositTypeArr$values = $values();
        $VALUES = otcAgentDepositCardDepositTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(otcAgentDepositCardDepositTypeArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.otcagent.depositcard.OtcAgentDepositCardDepositType.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final OtcAgentDepositCardDepositType KWHzl(String str) {
            OtcAgentDepositCardDepositType next;
            Iterator<OtcAgentDepositCardDepositType> it = OtcAgentDepositCardDepositType.getEntries().iterator();
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
            OtcAgentDepositCardDepositType otcAgentDepositCardDepositType = next;
            return otcAgentDepositCardDepositType == null ? OtcAgentDepositCardDepositType.FIAT : otcAgentDepositCardDepositType;
        }
    }

    public static OtcAgentDepositCardDepositType valueOf(String str) {
        return (OtcAgentDepositCardDepositType) Enum.valueOf(OtcAgentDepositCardDepositType.class, str);
    }

    public static OtcAgentDepositCardDepositType[] values() {
        return (OtcAgentDepositCardDepositType[]) $VALUES.clone();
    }
}
