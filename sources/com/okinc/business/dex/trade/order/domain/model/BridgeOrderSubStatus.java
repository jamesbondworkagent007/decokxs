package com.okinc.business.dex.trade.order.domain.model;

import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C23274hvD;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class BridgeOrderSubStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BridgeOrderSubStatus[] $VALUES;
    public static final Application Companion;
    private final boolean isTerminalState;
    private final int status;
    private final int textRes;
    private final String trackValue;
    public static final BridgeOrderSubStatus ReadyToClaim = new BridgeOrderSubStatus("ReadyToClaim", 0, 6, true, C23274hvD.Fragment.getPlaybackSpeed, "claim_ready");
    public static final BridgeOrderSubStatus Cancelling = new BridgeOrderSubStatus("Cancelling", 1, 4, false, C23274hvD.Fragment.getActions, "canceling");
    public static final BridgeOrderSubStatus Cancelled = new BridgeOrderSubStatus("Cancelled", 2, 2, true, C23274hvD.Fragment.getActiveQueueItemId, "canceled");
    public static final BridgeOrderSubStatus Failed = new BridgeOrderSubStatus("Failed", 3, 3, true, C23274hvD.Fragment.AwvSrB, EopTrackEvent.KEY_RESULT_FAILED);
    public static final BridgeOrderSubStatus Pending = new BridgeOrderSubStatus("Pending", 4, 5, false, C23274hvD.Fragment.PlaybackStateCompatBuilder, "processing");
    public static final BridgeOrderSubStatus Completed = new BridgeOrderSubStatus("Completed", 5, 1, true, C23274hvD.Fragment.getCustomActions, "completed");
    public static final BridgeOrderSubStatus Claim = new BridgeOrderSubStatus("Claim", 6, 7, false, C23274hvD.Fragment.getErrorMessage, "claiming");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BridgeOrderSubStatus[] $values() {
        return new BridgeOrderSubStatus[]{ReadyToClaim, Cancelling, Cancelled, Failed, Pending, Completed, Claim};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BridgeOrderSubStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTextRes() {
        return this.textRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTrackValue() {
        return this.trackValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isTerminalState() {
        return this.isTerminalState;
    }

    private BridgeOrderSubStatus(String str, int i, int i2, boolean z, int i3, String str2) {
        this.status = i2;
        this.isTerminalState = z;
        this.textRes = i3;
        this.trackValue = str2;
    }

    static {
        BridgeOrderSubStatus[] bridgeOrderSubStatusArr$values = $values();
        $VALUES = bridgeOrderSubStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(bridgeOrderSubStatusArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.order.domain.model.BridgeOrderSubStatus.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static BridgeOrderSubStatus valueOf(String str) {
        return (BridgeOrderSubStatus) Enum.valueOf(BridgeOrderSubStatus.class, str);
    }

    public static BridgeOrderSubStatus[] values() {
        return (BridgeOrderSubStatus[]) $VALUES.clone();
    }
}
