package com.okinc.business.market.features.analysis.futures.sub.funding.ui;

import android.content.Context;
import androidx.annotation.StringRes;
import kotlin.jvm.internal.Intrinsics;
import o.C40525qZb;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class FundingFeeSortType implements C40525qZb.ActionBar {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FundingFeeSortType[] $VALUES;
    private final String num;
    private final int title;
    public static final FundingFeeSortType REAL_TIME_UP = new FundingFeeSortType("REAL_TIME_UP", 0, qZH.PendingIntent.OAhWiU, "2");
    public static final FundingFeeSortType REAL_TIME_DOWN = new FundingFeeSortType("REAL_TIME_DOWN", 1, qZH.PendingIntent.dbUqJD, "3");
    public static final FundingFeeSortType ESTIIMATED_UP = new FundingFeeSortType("ESTIIMATED_UP", 2, qZH.PendingIntent.GLcwwN, "0");
    public static final FundingFeeSortType ESTIIMATED_DOWN = new FundingFeeSortType("ESTIIMATED_DOWN", 3, qZH.PendingIntent.GPCHlQ, "1");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FundingFeeSortType[] $values() {
        return new FundingFeeSortType[]{REAL_TIME_UP, REAL_TIME_DOWN, ESTIIMATED_UP, ESTIIMATED_DOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FundingFeeSortType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNum() {
        return this.num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitle() {
        return this.title;
    }

    private FundingFeeSortType(@StringRes String str, int i, int i2, String str2) {
        this.title = i2;
        this.num = str2;
    }

    static {
        FundingFeeSortType[] fundingFeeSortTypeArr$values = $values();
        $VALUES = fundingFeeSortTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(fundingFeeSortTypeArr$values);
    }

    @Override // o.C40525qZb.ActionBar
    public CharSequence onGetTitle(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        String string = context.getString(this.title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static FundingFeeSortType valueOf(String str) {
        return (FundingFeeSortType) Enum.valueOf(FundingFeeSortType.class, str);
    }

    public static FundingFeeSortType[] values() {
        return (FundingFeeSortType[]) $VALUES.clone();
    }
}
