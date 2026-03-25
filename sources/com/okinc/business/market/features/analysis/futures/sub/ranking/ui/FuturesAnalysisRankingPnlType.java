package com.okinc.business.market.features.analysis.futures.sub.ranking.ui;

import android.content.Context;
import androidx.annotation.StringRes;
import com.okinc.business.market.features.analysis.futures.sub.ranking.data.datasource.IFuturesRankingDataSource;
import kotlin.jvm.internal.Intrinsics;
import o.C40525qZb;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class FuturesAnalysisRankingPnlType implements C40525qZb.ActionBar {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FuturesAnalysisRankingPnlType[] $VALUES;
    private final IFuturesRankingDataSource.PayloadPnlType payload;
    private final int titleRes;
    public static final FuturesAnalysisRankingPnlType NET_PNL = new FuturesAnalysisRankingPnlType("NET_PNL", 0, qZH.PendingIntent.zXhzOT, IFuturesRankingDataSource.PayloadPnlType.NET_PNL);
    public static final FuturesAnalysisRankingPnlType LONG_PNL = new FuturesAnalysisRankingPnlType("LONG_PNL", 1, qZH.PendingIntent.hgxRZI, IFuturesRankingDataSource.PayloadPnlType.LONG_PNL);
    public static final FuturesAnalysisRankingPnlType SHORT_PNL = new FuturesAnalysisRankingPnlType("SHORT_PNL", 2, qZH.PendingIntent.OmJATG, IFuturesRankingDataSource.PayloadPnlType.SHORT_PNL);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FuturesAnalysisRankingPnlType[] $values() {
        return new FuturesAnalysisRankingPnlType[]{NET_PNL, LONG_PNL, SHORT_PNL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FuturesAnalysisRankingPnlType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IFuturesRankingDataSource.PayloadPnlType getPayload() {
        return this.payload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitleRes() {
        return this.titleRes;
    }

    private FuturesAnalysisRankingPnlType(@StringRes String str, int i, int i2, IFuturesRankingDataSource.PayloadPnlType payloadPnlType) {
        this.titleRes = i2;
        this.payload = payloadPnlType;
    }

    static {
        FuturesAnalysisRankingPnlType[] futuresAnalysisRankingPnlTypeArr$values = $values();
        $VALUES = futuresAnalysisRankingPnlTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(futuresAnalysisRankingPnlTypeArr$values);
    }

    @Override // o.C40525qZb.ActionBar
    public CharSequence onGetTitle(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        String string = context.getString(this.titleRes);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static FuturesAnalysisRankingPnlType valueOf(String str) {
        return (FuturesAnalysisRankingPnlType) Enum.valueOf(FuturesAnalysisRankingPnlType.class, str);
    }

    public static FuturesAnalysisRankingPnlType[] values() {
        return (FuturesAnalysisRankingPnlType[]) $VALUES.clone();
    }
}
