package com.okinc.buysell.ui.otcagent.tradecard;

import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.C59449zhJ;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class OtcAgentTradeCardStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OtcAgentTradeCardStatus[] $VALUES;
    public static final Application Companion;
    private final String value;
    public static final OtcAgentTradeCardStatus QUOTE_READY = new OtcAgentTradeCardStatus("QUOTE_READY", 0, "QUOTE_READY");
    public static final OtcAgentTradeCardStatus IN_PROGRESS = new OtcAgentTradeCardStatus("IN_PROGRESS", 1, "ORDER_IN_PROGRESS");
    public static final OtcAgentTradeCardStatus SUCCEEDED = new OtcAgentTradeCardStatus(CardSyncResponse.SUCCEEDED, 2, "ORDER_SUCCEEDED");
    public static final OtcAgentTradeCardStatus FAILED = new OtcAgentTradeCardStatus(CardSyncResponse.FAILED, 3, "ORDER_FAILED");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OtcAgentTradeCardStatus[] $values() {
        return new OtcAgentTradeCardStatus[]{QUOTE_READY, IN_PROGRESS, SUCCEEDED, FAILED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OtcAgentTradeCardStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private OtcAgentTradeCardStatus(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        OtcAgentTradeCardStatus[] otcAgentTradeCardStatusArr$values = $values();
        $VALUES = otcAgentTradeCardStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(otcAgentTradeCardStatusArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardStatus.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final OtcAgentTradeCardStatus AEQbTJ(String str) {
            OtcAgentTradeCardStatus next;
            Iterator<OtcAgentTradeCardStatus> it = OtcAgentTradeCardStatus.getEntries().iterator();
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
            OtcAgentTradeCardStatus otcAgentTradeCardStatus = next;
            return otcAgentTradeCardStatus == null ? OtcAgentTradeCardStatus.QUOTE_READY : otcAgentTradeCardStatus;
        }
    }

    public static OtcAgentTradeCardStatus valueOf(String str) {
        return (OtcAgentTradeCardStatus) Enum.valueOf(OtcAgentTradeCardStatus.class, str);
    }

    public static OtcAgentTradeCardStatus[] values() {
        return (OtcAgentTradeCardStatus[]) $VALUES.clone();
    }
}
