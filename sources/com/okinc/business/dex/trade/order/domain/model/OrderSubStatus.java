package com.okinc.business.dex.trade.order.domain.model;

import com.okinc.liveness.lca.EopTrackEvent;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C23274hvD;
import o.C31200lpY;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class OrderSubStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OrderSubStatus[] $VALUES;
    public static final Activity Companion;
    public static final OrderSubStatus Creating;
    public static final OrderSubStatus Open;
    public static final OrderSubStatus Suspended;
    private final int filterTextRes;
    private final boolean isTerminalState;
    private final int status;
    private final int textRes;
    private final String trackValue;
    public static final OrderSubStatus Expired = new OrderSubStatus("Expired", 0, -7, true, C23274hvD.Fragment.PlaybackStateCompatCustomActionBuilder, C23274hvD.Fragment.getLastPositionUpdateTime, "expired");
    public static final OrderSubStatus Cancelling = new OrderSubStatus("Cancelling", 1, -3, false, C23274hvD.Fragment.PlaybackStateCompatCustomAction, C23274hvD.Fragment.getActions, "canceling");
    public static final OrderSubStatus Cancelled = new OrderSubStatus("Cancelled", 2, -2, true, C23274hvD.Fragment.getAction, C23274hvD.Fragment.getActiveQueueItemId, "canceled");
    public static final OrderSubStatus Failed = new OrderSubStatus("Failed", 3, -1, true, C23274hvD.Fragment.getIcon, C23274hvD.Fragment.AwvSrB, EopTrackEvent.KEY_RESULT_FAILED);
    public static final OrderSubStatus Pending = new OrderSubStatus("Pending", 4, 0, false, C23274hvD.Fragment.PlaybackStateCompatShuffleMode, C23274hvD.Fragment.PlaybackStateCompatBuilder, "processing");
    public static final OrderSubStatus Completed = new OrderSubStatus("Completed", 5, 1, true, C23274hvD.Fragment.PlaybackStateCompatCustomAction1, C23274hvD.Fragment.getCustomActions, "completed");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OrderSubStatus[] $values() {
        return new OrderSubStatus[]{Expired, Cancelling, Cancelled, Failed, Pending, Completed, Creating, Open, Suspended};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OrderSubStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFilterTextRes() {
        return this.filterTextRes;
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

    private OrderSubStatus(String str, int i, int i2, boolean z, int i3, int i4, String str2) {
        this.status = i2;
        this.isTerminalState = z;
        this.textRes = i3;
        this.filterTextRes = i4;
        this.trackValue = str2;
    }

    static {
        int i = C23274hvD.Fragment.getCustomAction;
        Creating = new OrderSubStatus("Creating", 6, 2, false, i, i, "creating");
        int i2 = C23274hvD.Fragment.getCurrentPosition;
        Open = new OrderSubStatus("Open", 7, 3, false, i2, i2, "active");
        Suspended = new OrderSubStatus("Suspended", 8, 4, false, C23274hvD.Fragment.IResultReceiver, C23274hvD.Fragment.getErrorCode, "suspended");
        OrderSubStatus[] orderSubStatusArr$values = $values();
        $VALUES = orderSubStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(orderSubStatusArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.order.domain.model.OrderSubStatus.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final OrderSubStatus KWHzl(int i) {
            OrderSubStatus next;
            Iterator<OrderSubStatus> it = OrderSubStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.getStatus() == i) {
                    break;
                }
            }
            OrderSubStatus orderSubStatus = next;
            if (orderSubStatus != null) {
                return orderSubStatus;
            }
            return (OrderSubStatus) C31200lpY.copydefault(OrderSubStatus.Open, "Unsupported OrderSubStatus status:" + i);
        }
    }

    public static OrderSubStatus valueOf(String str) {
        return (OrderSubStatus) Enum.valueOf(OrderSubStatus.class, str);
    }

    public static OrderSubStatus[] values() {
        return (OrderSubStatus[]) $VALUES.clone();
    }
}
