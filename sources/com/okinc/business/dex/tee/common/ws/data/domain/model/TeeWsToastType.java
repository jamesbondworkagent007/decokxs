package com.okinc.business.dex.tee.common.ws.data.domain.model;

import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class TeeWsToastType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TeeWsToastType[] $VALUES;
    public static final Activity Companion;
    private final String type;
    public static final TeeWsToastType None = new TeeWsToastType("None", 0, "");
    public static final TeeWsToastType ApproveSuccess = new TeeWsToastType("ApproveSuccess", 1, "0");
    public static final TeeWsToastType ApproveFailed = new TeeWsToastType("ApproveFailed", 2, "1");
    public static final TeeWsToastType OrderCreated = new TeeWsToastType("OrderCreated", 3, "2");
    public static final TeeWsToastType OrderCreateFailed = new TeeWsToastType("OrderCreateFailed", 4, "3");
    public static final TeeWsToastType TradeSuccess = new TeeWsToastType("TradeSuccess", 5, "4");
    public static final TeeWsToastType TradeFailedWithoutRetry = new TeeWsToastType("TradeFailedWithoutRetry", 6, "5");
    public static final TeeWsToastType TradeFailedWithRetry = new TeeWsToastType("TradeFailedWithRetry", 7, OrderDetailListItem.SLIP_OUT);
    public static final TeeWsToastType TpSlResult = new TeeWsToastType("TpSlResult", 8, "7");
    public static final TeeWsToastType OrderCanceled = new TeeWsToastType("OrderCanceled", 9, "8");
    public static final TeeWsToastType OrderResumed = new TeeWsToastType("OrderResumed", 10, "9");
    public static final TeeWsToastType CancelOrderFailed = new TeeWsToastType("CancelOrderFailed", 11, "10");
    public static final TeeWsToastType ResumeOrderFailed = new TeeWsToastType("ResumeOrderFailed", 12, "11");
    public static final TeeWsToastType CreateStrategyOrderSuccess = new TeeWsToastType("CreateStrategyOrderSuccess", 13, "12");
    public static final TeeWsToastType UpdateStrategyOrderSuccess = new TeeWsToastType("UpdateStrategyOrderSuccess", 14, "14");
    public static final TeeWsToastType TpSlMinAmountNotMet = new TeeWsToastType("TpSlMinAmountNotMet", 15, "22");
    public static final TeeWsToastType CreateBatchOrderSuccess = new TeeWsToastType("CreateBatchOrderSuccess", 16, "23");
    public static final TeeWsToastType CreateBatchOrderFailed = new TeeWsToastType("CreateBatchOrderFailed", 17, "24");
    public static final TeeWsToastType ExceedBatchOrderAmountMinLimit = new TeeWsToastType("ExceedBatchOrderAmountMinLimit", 18, "25");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TeeWsToastType[] $values() {
        return new TeeWsToastType[]{None, ApproveSuccess, ApproveFailed, OrderCreated, OrderCreateFailed, TradeSuccess, TradeFailedWithoutRetry, TradeFailedWithRetry, TpSlResult, OrderCanceled, OrderResumed, CancelOrderFailed, ResumeOrderFailed, CreateStrategyOrderSuccess, UpdateStrategyOrderSuccess, TpSlMinAmountNotMet, CreateBatchOrderSuccess, CreateBatchOrderFailed, ExceedBatchOrderAmountMinLimit};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TeeWsToastType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    private TeeWsToastType(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        TeeWsToastType[] teeWsToastTypeArr$values = $values();
        $VALUES = teeWsToastTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(teeWsToastTypeArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsToastType.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final TeeWsToastType EZpvd(int i) {
            TeeWsToastType next;
            Iterator<TeeWsToastType> it = TeeWsToastType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) next.getType(), (Object) String.valueOf(i))) {
                    break;
                }
            }
            TeeWsToastType teeWsToastType = next;
            return teeWsToastType == null ? TeeWsToastType.None : teeWsToastType;
        }
    }

    public static TeeWsToastType valueOf(String str) {
        return (TeeWsToastType) Enum.valueOf(TeeWsToastType.class, str);
    }

    public static TeeWsToastType[] values() {
        return (TeeWsToastType[]) $VALUES.clone();
    }
}
