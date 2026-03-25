package com.okinc.unify_trade.manager;

import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class QuickOrderStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ QuickOrderStatus[] $VALUES;
    private final int step;
    public static final QuickOrderStatus NONE = new QuickOrderStatus("NONE", 0, 0);
    public static final QuickOrderStatus CLICK_ORDER = new QuickOrderStatus("CLICK_ORDER", 1, 1);
    public static final QuickOrderStatus ORDER_CHECK_PASS = new QuickOrderStatus("ORDER_CHECK_PASS", 2, 2);
    public static final QuickOrderStatus CANCEL_CONFIRM = new QuickOrderStatus("CANCEL_CONFIRM", 3, 3);
    public static final QuickOrderStatus MAKE_CONFIRM = new QuickOrderStatus("MAKE_CONFIRM", 4, 4);
    public static final QuickOrderStatus ORDER_SUCCESS = new QuickOrderStatus("ORDER_SUCCESS", 5, 5);
    public static final QuickOrderStatus ORDER_FAIL = new QuickOrderStatus("ORDER_FAIL", 6, 6);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ QuickOrderStatus[] $values() {
        return new QuickOrderStatus[]{NONE, CLICK_ORDER, ORDER_CHECK_PASS, CANCEL_CONFIRM, MAKE_CONFIRM, ORDER_SUCCESS, ORDER_FAIL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<QuickOrderStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStep() {
        return this.step;
    }

    private QuickOrderStatus(String str, int i, int i2) {
        this.step = i2;
    }

    static {
        QuickOrderStatus[] quickOrderStatusArr$values = $values();
        $VALUES = quickOrderStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(quickOrderStatusArr$values);
    }

    public final QuickOrderStatus nextStep(@NotNull QuickOrderStatus quickOrderStatus) {
        Intrinsics.checkNotNullParameter(quickOrderStatus, "");
        return C33129mqd.AEQbTJ(Integer.valueOf(quickOrderStatus.step), Integer.valueOf(this.step)) ? quickOrderStatus : this;
    }

    public static QuickOrderStatus valueOf(String str) {
        return (QuickOrderStatus) Enum.valueOf(QuickOrderStatus.class, str);
    }

    public static QuickOrderStatus[] values() {
        return (QuickOrderStatus[]) $VALUES.clone();
    }
}
