package com.okinc.buysell.common;

import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C31351lsQ;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class HistoryOrderStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ HistoryOrderStatus[] $VALUES;
    private final int displayName;
    private final int value;
    public static final HistoryOrderStatus PENDING = new HistoryOrderStatus(CardSyncResponse.PENDING, 0, 0, C31351lsQ.Activity.gwwfep);
    public static final HistoryOrderStatus PROCESSING = new HistoryOrderStatus("PROCESSING", 1, 1, C31351lsQ.Activity.zzQwtT);
    public static final HistoryOrderStatus FAILED = new HistoryOrderStatus(CardSyncResponse.FAILED, 2, 2, C31351lsQ.Activity.cBPFI);
    public static final HistoryOrderStatus COMPLETED = new HistoryOrderStatus("COMPLETED", 3, 3, C31351lsQ.Activity.QfJbVf);
    public static final HistoryOrderStatus REFUNDED = new HistoryOrderStatus("REFUNDED", 4, 4, C31351lsQ.Activity.iCPUKe);
    public static final HistoryOrderStatus IN_QUEUE = new HistoryOrderStatus("IN_QUEUE", 5, 5, C31351lsQ.Activity.gwwfep);
    public static final HistoryOrderStatus EXPIRED = new HistoryOrderStatus("EXPIRED", 6, 9, C31351lsQ.Activity.gtdfxv);
    public static final HistoryOrderStatus CANCELLED = new HistoryOrderStatus("CANCELLED", 7, 10, C31351lsQ.Activity.gtdfxv);
    public static final HistoryOrderStatus REVERSING = new HistoryOrderStatus("REVERSING", 8, 14, C31351lsQ.Activity.hrjNmC);
    public static final HistoryOrderStatus REVERSED = new HistoryOrderStatus("REVERSED", 9, 15, C31351lsQ.Activity.fGQ);
    public static final HistoryOrderStatus UNKNOWN = new HistoryOrderStatus("UNKNOWN", 10, -999, C31351lsQ.Activity.cBPFI);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ HistoryOrderStatus[] $values() {
        return new HistoryOrderStatus[]{PENDING, PROCESSING, FAILED, COMPLETED, REFUNDED, IN_QUEUE, EXPIRED, CANCELLED, REVERSING, REVERSED, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<HistoryOrderStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDisplayName() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private HistoryOrderStatus(String str, int i, int i2, int i3) {
        this.value = i2;
        this.displayName = i3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 int)
  (r3v0 int)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r4v0 int))
 A[MD:(java.lang.String, int, int, int):void (m)] (LINE:5) call: com.okinc.buysell.common.HistoryOrderStatus.<init>(java.lang.String, int, int, int):void type: THIS */
    public /* synthetic */ HistoryOrderStatus(String str, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, (i4 & 2) != 0 ? -1 : i3);
    }

    static {
        HistoryOrderStatus[] historyOrderStatusArr$values = $values();
        $VALUES = historyOrderStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(historyOrderStatusArr$values);
    }

    public static HistoryOrderStatus valueOf(String str) {
        return (HistoryOrderStatus) Enum.valueOf(HistoryOrderStatus.class, str);
    }

    public static HistoryOrderStatus[] values() {
        return (HistoryOrderStatus[]) $VALUES.clone();
    }
}
