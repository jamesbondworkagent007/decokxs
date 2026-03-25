package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.dexui.main.market.base.TokenDetailButtonName;
import com.okinc.business.dexui.main.market.base.TokenDetailClickLayer;
import com.okinc.business.dexui.main.market.base.TokenDetailEventTrackingInfo;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.transactionhistory.FilterTimeDuration;
import com.okinc.business.market.features.coindetail.domain.type.CoinDetailTabType;
import com.okinc.business.market.features.overview.domain.TransactionInfo;
import com.okinc.business.market.features.overview.domain.TransactionStatistic;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kmM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29049kmM extends ConstraintLayout {
    public final InterfaceC56387yDm AEQbTJ;
    public Function1<? super FilterTimeDuration, Unit> KWHzl;
    public TokenDetailEventTrackingInfo copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C29049kmM(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C29049kmM(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt() {
        this.KWHzl = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEventTrackingInfo(TokenDetailEventTrackingInfo tokenDetailEventTrackingInfo) {
        this.copydefault = tokenDetailEventTrackingInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnTimeClick(@NotNull Function1<? super FilterTimeDuration, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:36) call: o.kmM.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C29049kmM(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29049kmM(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.kmL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29049kmM.EZpvd(context, this);
            }
        });
        setupTimeClickListener();
    }

    private final C21458hAc KWHzl() {
        return (C21458hAc) this.AEQbTJ.getValue();
    }

    public static final C21458hAc EZpvd(android.content.Context context, C29049kmM c29049kmM) {
        return C21458hAc.AEQbTJ(android.view.LayoutInflater.from(context), c29049kmM);
    }

    public final void setupTimeClickListener() {
        C21458hAc c21458hAcKWHzl = KWHzl();
        c21458hAcKWHzl.KWHzl.setSelected(true);
        final java.util.List<Triple> listGEmmrt = yDY.gEmmrt(new Triple(c21458hAcKWHzl.AEQbTJ, FilterTimeDuration.FIVE_MIN_CHANGE, "chart_5m"), new Triple(c21458hAcKWHzl.EZpvd, FilterTimeDuration.ONE_HOUR_SELECTION, "chart_1h"), new Triple(c21458hAcKWHzl.copydefault, FilterTimeDuration.FOUR_HOUR_SELECTION, "chart_4h"), new Triple(c21458hAcKWHzl.KWHzl, FilterTimeDuration.TWENTY_FOUR_HOURS_SELECTION, "chart_24h"));
        for (Triple triple : listGEmmrt) {
            java.lang.Object objComponent1 = triple.component1();
            Intrinsics.checkNotNullExpressionValue(objComponent1, "");
            final android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objComponent1;
            final FilterTimeDuration filterTimeDuration = (FilterTimeDuration) triple.component2();
            final java.lang.String str = (java.lang.String) triple.component3();
            C25352ivB.setOnDoubleCheckClickListener$default(linearLayout, 0L, new Function1() { // from class: o.kmK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C29049kmM.OLrzqt(listGEmmrt, linearLayout, this, filterTimeDuration, str, (android.view.View) obj);
                }
            }, 1, null);
        }
    }

    public final void KWHzl(TransactionInfo transactionInfo) {
        TransactionStatistic transactionStatisticEZpvd;
        C21458hAc c21458hAcKWHzl = KWHzl();
        AppCompatTextView appCompatTextView = c21458hAcKWHzl.getNewProxyInstance;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        kLY.formatPercentage$default(appCompatTextView, transactionInfo != null ? transactionInfo.OLrzqt() : null, null, java.lang.Float.valueOf(-99.999f), java.lang.Float.valueOf(99999.0f), null, 18, null);
        AppCompatTextView appCompatTextView2 = c21458hAcKWHzl.fIwbmz;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        kLY.formatPercentage$default(appCompatTextView2, transactionInfo != null ? transactionInfo.AEQbTJ() : null, null, java.lang.Float.valueOf(-99.999f), java.lang.Float.valueOf(99999.0f), null, 18, null);
        AppCompatTextView appCompatTextView3 = c21458hAcKWHzl.getFieldNames;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
        kLY.formatPercentage$default(appCompatTextView3, transactionInfo != null ? transactionInfo.KWHzl() : null, null, java.lang.Float.valueOf(-99.999f), java.lang.Float.valueOf(99999.0f), null, 18, null);
        AppCompatTextView appCompatTextView4 = c21458hAcKWHzl.fARcdN;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView4, "");
        kLY.formatPercentage$default(appCompatTextView4, transactionInfo != null ? transactionInfo.copydefault() : null, null, java.lang.Float.valueOf(-99.999f), java.lang.Float.valueOf(99999.0f), null, 18, null);
        if (transactionInfo == null || (transactionStatisticEZpvd = transactionInfo.EZpvd()) == null) {
            return;
        }
        EZpvd(transactionStatisticEZpvd);
    }

    public final void EZpvd(@NotNull TransactionStatistic transactionStatistic) {
        Intrinsics.checkNotNullParameter(transactionStatistic, "");
        C21458hAc c21458hAcKWHzl = KWHzl();
        android.widget.TextView textView = c21458hAcKWHzl.iwGUEr;
        C23272hvB c23272hvB = C23272hvB.KWHzl;
        java.lang.String strAYXKKw = transactionStatistic.AYXKKw();
        RoundingMode roundingMode = RoundingMode.DOWN;
        textView.setText(C23272hvB.formatScientificCurrency$default(c23272hvB, strAYXKKw, true, roundingMode, true, false, false, false, null, false, false, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null));
        android.widget.TextView textView2 = c21458hAcKWHzl.iwGUEr;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        kLY.AEQbTJ(textView2, transactionStatistic.AYXKKw(), java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl));
        c21458hAcKWHzl.isConnected.setText(C23272hvB.formatScientificCurrency$default(c23272hvB, transactionStatistic.AEQbTJ(), true, roundingMode, true, false, false, false, DisplaySign.EXCEPT_ZERO, false, false, 440, null));
        android.widget.TextView textView3 = c21458hAcKWHzl.isConnected;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        kLY.updateColorByValue$default(textView3, transactionStatistic.AEQbTJ(), null, 2, null);
        c21458hAcKWHzl.hDKMBd.copydefault(C33129mqd.AEQbTJ(transactionStatistic.copydefault()), C33129mqd.AEQbTJ(transactionStatistic.EZpvd()));
        android.widget.TextView textView4 = c21458hAcKWHzl.fetchVPNInfo;
        java.lang.String strKWHzl = transactionStatistic.KWHzl();
        java.lang.String strCopydefault = transactionStatistic.copydefault();
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView4.setText(copydefault(strKWHzl, strCopydefault, C33512mxp.tradeRiseDefault$default(c33512mxp, context, 0.0f, 2, null)));
        android.widget.TextView textView5 = c21458hAcKWHzl.DbNXlk;
        java.lang.String strOLrzqt = transactionStatistic.OLrzqt();
        java.lang.String strEZpvd = transactionStatistic.EZpvd();
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        textView5.setText(copydefault(strOLrzqt, strEZpvd, C33512mxp.tradeFallDefault$default(c33512mxp, context2, 0.0f, 2, null)));
    }

    public final android.text.SpannableString copydefault(java.lang.String str, java.lang.String str2, int i) {
        java.lang.String numberICU$default = C23319hvw.getNumberICU$default(str, null, null, null, null, 15, null);
        java.lang.String scientificCurrency$default = C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str2, true, RoundingMode.DOWN, true, false, false, false, null, false, false, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null);
        int iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.QwvEab);
        if (Intrinsics.EZpvd((java.lang.Object) numberICU$default, (java.lang.Object) "--") && Intrinsics.EZpvd((java.lang.Object) scientificCurrency$default, (java.lang.Object) "--")) {
            android.text.SpannableString spannableString = new android.text.SpannableString("--");
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(iKWHzl), 0, str.length(), 33);
            return spannableString;
        }
        java.lang.String str3 = numberICU$default + " / " + scientificCurrency$default;
        android.text.SpannableString spannableString2 = new android.text.SpannableString(str3);
        spannableString2.setSpan(new android.text.style.ForegroundColorSpan(C33129mqd.djBIcL(str) == 0.0f ? iKWHzl : i), 0, numberICU$default.length(), 33);
        spannableString2.setSpan(new android.text.style.ForegroundColorSpan(iKWHzl), numberICU$default.length(), numberICU$default.length() + 3, 33);
        if (C33129mqd.djBIcL(str2) != 0.0f) {
            iKWHzl = i;
        }
        spannableString2.setSpan(new android.text.style.ForegroundColorSpan(iKWHzl), numberICU$default.length() + 3, str3.length(), 33);
        return spannableString2;
    }

    public static final Unit OLrzqt(java.util.List list, android.widget.LinearLayout linearLayout, C29049kmM c29049kmM, FilterTimeDuration filterTimeDuration, java.lang.String str, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.Object objComponent1 = ((Triple) it.next()).component1();
            Intrinsics.checkNotNullExpressionValue(objComponent1, "");
            ((android.widget.LinearLayout) objComponent1).setSelected(false);
        }
        linearLayout.setSelected(true);
        Function1<? super FilterTimeDuration, Unit> function1 = c29049kmM.KWHzl;
        if (function1 != null) {
            function1.invoke(filterTimeDuration);
        }
        C21847hOn.AEQbTJ(str);
        TokenDetailEventTrackingInfo tokenDetailEventTrackingInfo = c29049kmM.copydefault;
        if (tokenDetailEventTrackingInfo != null) {
            C21847hOn.EZpvd(tokenDetailEventTrackingInfo, TokenDetailClickLayer.COMPONENTS, TokenDetailButtonName.Companion.OLrzqt(filterTimeDuration), CoinDetailTabType.INFO);
        }
        return Unit.INSTANCE;
    }
}
