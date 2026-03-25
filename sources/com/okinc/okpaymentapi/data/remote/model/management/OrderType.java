package com.okinc.okpaymentapi.data.remote.model.management;

import android.content.Context;
import androidx.annotation.StringRes;
import kotlin.jvm.internal.Intrinsics;
import o.C43246rlf;
import o.C47244tmQ;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class OrderType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OrderType[] $VALUES;
    private final int descriptionTextResId;
    private final int titleTextResId;
    private final String txt;
    public static final OrderType OTHERS = new OrderType("OTHERS", 0, "Trade", C47244tmQ.Activity.KWHzl, C47244tmQ.Activity.OLrzqt);
    public static final OrderType NONE = new OrderType("NONE", 1, "Trade", C47244tmQ.Activity.EZpvd, C47244tmQ.Activity.OLrzqt);
    public static final OrderType ONE_TIME = new OrderType("ONE_TIME", 2, "one_time", C47244tmQ.Activity.KWHzl, C47244tmQ.Activity.OLrzqt);
    public static final OrderType RECURRING = new OrderType("RECURRING", 3, "recurring", C47244tmQ.Activity.AEQbTJ, C47244tmQ.Activity.copydefault);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OrderType[] $values() {
        return new OrderType[]{OTHERS, NONE, ONE_TIME, RECURRING};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OrderType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDescriptionTextResId() {
        return this.descriptionTextResId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitleTextResId() {
        return this.titleTextResId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxt() {
        return this.txt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isRecurringType() {
        return this == RECURRING;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Enum
    public String toString() {
        return this.txt;
    }

    private OrderType(String str, @StringRes int i, @StringRes String str2, int i2, int i3) {
        this.txt = str2;
        this.titleTextResId = i2;
        this.descriptionTextResId = i3;
    }

    static {
        OrderType[] orderTypeArr$values = $values();
        $VALUES = orderTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(orderTypeArr$values);
    }

    public static /* synthetic */ String descriptionText$default(OrderType orderType, Context context, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: descriptionText");
        }
        if ((i & 1) != 0) {
            context = C43246rlf.OLrzqt.valueOf().getApplicationContext();
        }
        return orderType.descriptionText(context);
    }

    public final String descriptionText(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        String string = context.getString(this.descriptionTextResId);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static /* synthetic */ String titleText$default(OrderType orderType, Context context, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: titleText");
        }
        if ((i & 1) != 0) {
            context = C43246rlf.OLrzqt.valueOf().getApplicationContext();
        }
        return orderType.titleText(context);
    }

    public final String titleText(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        String string = context.getString(this.titleTextResId);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static OrderType valueOf(String str) {
        return (OrderType) Enum.valueOf(OrderType.class, str);
    }

    public static OrderType[] values() {
        return (OrderType[]) $VALUES.clone();
    }
}
