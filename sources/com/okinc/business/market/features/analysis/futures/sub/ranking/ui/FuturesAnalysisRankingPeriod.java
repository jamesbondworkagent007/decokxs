package com.okinc.business.market.features.analysis.futures.sub.ranking.ui;

import android.content.Context;
import androidx.annotation.StringRes;
import com.okinc.market.common.bean.PayloadPeriod;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C40525qZb;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class FuturesAnalysisRankingPeriod implements C40525qZb.ActionBar {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FuturesAnalysisRankingPeriod[] $VALUES;
    public static final TaskDescription Companion;
    private final int num;
    private final PayloadPeriod payload;
    private final int titleRes;
    public static final FuturesAnalysisRankingPeriod PERIOD_7D = new FuturesAnalysisRankingPeriod("PERIOD_7D", 0, qZH.PendingIntent.gEmmrt, PayloadPeriod.PERIOD_7D, 7);
    public static final FuturesAnalysisRankingPeriod PERIOD_30D = new FuturesAnalysisRankingPeriod("PERIOD_30D", 1, qZH.PendingIntent.EZpvd, PayloadPeriod.PERIOD_30D, 30);
    public static final FuturesAnalysisRankingPeriod PERIOD_90D = new FuturesAnalysisRankingPeriod("PERIOD_90D", 2, qZH.PendingIntent.valueOf, PayloadPeriod.PERIOD_90D, 90);
    public static final FuturesAnalysisRankingPeriod PERIOD_ALL = new FuturesAnalysisRankingPeriod("PERIOD_ALL", 3, qZH.PendingIntent.fsw, PayloadPeriod.ALL, 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FuturesAnalysisRankingPeriod[] $values() {
        return new FuturesAnalysisRankingPeriod[]{PERIOD_7D, PERIOD_30D, PERIOD_90D, PERIOD_ALL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FuturesAnalysisRankingPeriod> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getNum() {
        return this.num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PayloadPeriod getPayload() {
        return this.payload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitleRes() {
        return this.titleRes;
    }

    private FuturesAnalysisRankingPeriod(@StringRes String str, int i, int i2, PayloadPeriod payloadPeriod, int i3) {
        this.titleRes = i2;
        this.payload = payloadPeriod;
        this.num = i3;
    }

    static {
        FuturesAnalysisRankingPeriod[] futuresAnalysisRankingPeriodArr$values = $values();
        $VALUES = futuresAnalysisRankingPeriodArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(futuresAnalysisRankingPeriodArr$values);
        Companion = new TaskDescription(null);
    }

    @Override // o.C40525qZb.ActionBar
    public CharSequence onGetTitle(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        String string = context.getString(this.titleRes);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingPeriod.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static FuturesAnalysisRankingPeriod valueOf(String str) {
        return (FuturesAnalysisRankingPeriod) Enum.valueOf(FuturesAnalysisRankingPeriod.class, str);
    }

    public static FuturesAnalysisRankingPeriod[] values() {
        return (FuturesAnalysisRankingPeriod[]) $VALUES.clone();
    }
}
