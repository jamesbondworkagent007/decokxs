package com.okinc.business.market.features.analysis.common.ui.model;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.StringRes;
import com.okinc.market.common.bean.PayloadPeriod;
import com.okinc.market.widget.FlowedChipsView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C43246rlf;
import o.C56390yDp;
import o.C56423yEv;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.pTD;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class AnalysisOverviewPeriod implements FlowedChipsView.Application.Activity {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AnalysisOverviewPeriod[] $VALUES;
    public static final ActionBar Companion;
    private final String eventTrackingValue;
    private final int num;
    private final PayloadPeriod payload;
    private final int periodTextResId;
    public static final AnalysisOverviewPeriod PERIOD_7D = new AnalysisOverviewPeriod("PERIOD_7D", 0, qZH.PendingIntent.RXzakW, "seven_day", PayloadPeriod.PERIOD_7D, 7);
    public static final AnalysisOverviewPeriod PERIOD_30D = new AnalysisOverviewPeriod("PERIOD_30D", 1, qZH.PendingIntent.TarCU, "one_month", PayloadPeriod.PERIOD_30D, 30);
    public static final AnalysisOverviewPeriod PERIOD_90D = new AnalysisOverviewPeriod("PERIOD_90D", 2, qZH.PendingIntent.Ufzxmz, "three_month", PayloadPeriod.PERIOD_90D, 90);
    public static final AnalysisOverviewPeriod PERIOD_ALL = new AnalysisOverviewPeriod("PERIOD_ALL", 3, qZH.PendingIntent.AkhnZx, "all", PayloadPeriod.ALL, 0);

    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AnalysisOverviewPeriod.values().length];
            try {
                iArr[AnalysisOverviewPeriod.PERIOD_ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnalysisOverviewPeriod.PERIOD_7D.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnalysisOverviewPeriod.PERIOD_30D.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AnalysisOverviewPeriod.PERIOD_90D.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AnalysisOverviewPeriod[] $values() {
        return new AnalysisOverviewPeriod[]{PERIOD_7D, PERIOD_30D, PERIOD_90D, PERIOD_ALL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AnalysisOverviewPeriod> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEventTrackingValue() {
        return this.eventTrackingValue;
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
    public final int getPeriodTextResId() {
        return this.periodTextResId;
    }

    private AnalysisOverviewPeriod(@StringRes String str, int i, int i2, String str2, PayloadPeriod payloadPeriod, int i3) {
        this.periodTextResId = i2;
        this.eventTrackingValue = str2;
        this.payload = payloadPeriod;
        this.num = i3;
    }

    static {
        AnalysisOverviewPeriod[] analysisOverviewPeriodArr$values = $values();
        $VALUES = analysisOverviewPeriodArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(analysisOverviewPeriodArr$values);
        Companion = new ActionBar(null);
    }

    @Override // com.okinc.market.widget.FlowedChipsView.Application.Activity
    public CharSequence getItemText(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        String string = context.getString(this.periodTextResId);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final String getPnlTitle() {
        int i = Activity.KWHzl[ordinal()];
        if (i == 1) {
            return C33070mpX.AYXKKw(qZH.PendingIntent.RXdAnZ);
        }
        if (i == 2) {
            Resources resources = C43246rlf.OLrzqt.valueOf().getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            return pTD.copydefault(resources, qZH.Dialog.KWHzl, 7, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", 7)));
        }
        if (i == 3) {
            Resources resources2 = C43246rlf.OLrzqt.valueOf().getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "");
            return pTD.copydefault(resources2, qZH.Dialog.KWHzl, 30, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", 30)));
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        Resources resources3 = C43246rlf.OLrzqt.valueOf().getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "");
        return pTD.copydefault(resources3, qZH.Dialog.KWHzl, 90, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", 90)));
    }

    public static final class ActionBar {

        /* JADX INFO: loaded from: classes15.dex */
        public final /* synthetic */ class StateListAnimator {
            public static final /* synthetic */ int[] copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[PayloadPeriod.values().length];
                try {
                    iArr[PayloadPeriod.PERIOD_7D.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PayloadPeriod.PERIOD_30D.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PayloadPeriod.PERIOD_90D.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                copydefault = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.analysis.common.ui.model.AnalysisOverviewPeriod.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final AnalysisOverviewPeriod copydefault(@NotNull PayloadPeriod payloadPeriod) {
            Intrinsics.checkNotNullParameter(payloadPeriod, "");
            int i = StateListAnimator.copydefault[payloadPeriod.ordinal()];
            if (i == 1) {
                return AnalysisOverviewPeriod.PERIOD_7D;
            }
            if (i == 2) {
                return AnalysisOverviewPeriod.PERIOD_30D;
            }
            if (i != 3) {
                return null;
            }
            return AnalysisOverviewPeriod.PERIOD_90D;
        }
    }

    public static AnalysisOverviewPeriod valueOf(String str) {
        return (AnalysisOverviewPeriod) Enum.valueOf(AnalysisOverviewPeriod.class, str);
    }

    public static AnalysisOverviewPeriod[] values() {
        return (AnalysisOverviewPeriod[]) $VALUES.clone();
    }
}
