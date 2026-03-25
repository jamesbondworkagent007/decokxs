package o;

import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.dexkline.dexui.main.market.detail.fragment.chart.pooltransactions.transactionhistory.FilterTimeDuration;
import com.okinc.dexkline.market.features.overview.domain.TransactionInfo;
import com.okinc.dexkline.market.features.overview.domain.TransactionStatistic;
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

/* JADX INFO: renamed from: o.nbP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34400nbP extends android.widget.LinearLayout {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public Function1<? super FilterTimeDuration, Unit> AEQbTJ;
    public final InterfaceC56387yDm OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C34400nbP(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C34400nbP(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd() {
        this.AEQbTJ = null;
    }

    public final void setErrorLayout() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnTimeClick(@NotNull Function1<? super FilterTimeDuration, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:31) call: o.nbP.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C34400nbP(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34400nbP(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.nbS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34400nbP.AEQbTJ(context, this);
            }
        });
        setupTimeClickListener();
    }

    /* JADX INFO: renamed from: o.nbP$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nbP.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    private final oNJ KWHzl() {
        return (oNJ) this.OLrzqt.getValue();
    }

    public static final oNJ AEQbTJ(android.content.Context context, C34400nbP c34400nbP) {
        return oNJ.AEQbTJ(android.view.LayoutInflater.from(context), c34400nbP, true);
    }

    public final void setupTimeClickListener() {
        oNJ onjKWHzl = KWHzl();
        onjKWHzl.AEQbTJ.setSelected(true);
        final java.util.List<Triple> listGEmmrt = yDY.gEmmrt(new Triple(onjKWHzl.EZpvd, FilterTimeDuration.FIVE_MIN_CHANGE, "chart_5m"), new Triple(onjKWHzl.copydefault, FilterTimeDuration.ONE_HOUR_SELECTION, "chart_1h"), new Triple(onjKWHzl.KWHzl, FilterTimeDuration.FOUR_HOUR_SELECTION, "chart_4h"), new Triple(onjKWHzl.AEQbTJ, FilterTimeDuration.TWENTY_FOUR_HOURS_SELECTION, "chart_24h"));
        for (Triple triple : listGEmmrt) {
            java.lang.Object objComponent1 = triple.component1();
            Intrinsics.checkNotNullExpressionValue(objComponent1, "");
            final android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objComponent1;
            final FilterTimeDuration filterTimeDuration = (FilterTimeDuration) triple.component2();
            final java.lang.String str = (java.lang.String) triple.component3();
            mUO.setOnDoubleCheckClickListener$default(linearLayout, 0L, new Function1() { // from class: o.nbR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C34400nbP.AEQbTJ(listGEmmrt, linearLayout, this, filterTimeDuration, str, (android.view.View) obj);
                }
            }, 1, null);
        }
    }

    public final void copydefault(TransactionInfo transactionInfo) {
        TransactionStatistic transactionStatisticAEQbTJ;
        oNJ onjKWHzl = KWHzl();
        AppCompatTextView appCompatTextView = onjKWHzl.hDKMBd;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        java.lang.String strOLrzqt = transactionInfo != null ? transactionInfo.OLrzqt() : null;
        DisplaySign displaySign = DisplaySign.ALWAYS;
        C34550neG.formatPercentage$default(appCompatTextView, strOLrzqt, displaySign, null, null, 12, null);
        AppCompatTextView appCompatTextView2 = onjKWHzl.fIwbmz;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        C34550neG.formatPercentage$default(appCompatTextView2, transactionInfo != null ? transactionInfo.KWHzl() : null, displaySign, null, null, 12, null);
        AppCompatTextView appCompatTextView3 = onjKWHzl.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
        C34550neG.formatPercentage$default(appCompatTextView3, transactionInfo != null ? transactionInfo.EZpvd() : null, displaySign, null, null, 12, null);
        AppCompatTextView appCompatTextView4 = onjKWHzl.fJNWhG;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView4, "");
        C34550neG.formatPercentage$default(appCompatTextView4, transactionInfo != null ? transactionInfo.copydefault() : null, displaySign, null, null, 12, null);
        if (transactionInfo == null || (transactionStatisticAEQbTJ = transactionInfo.AEQbTJ()) == null) {
            return;
        }
        copydefault(transactionStatisticAEQbTJ);
    }

    public final void copydefault(@NotNull TransactionStatistic transactionStatistic) {
        java.lang.String strOLrzqt;
        java.lang.String strOLrzqt2;
        java.lang.CharSequence charSequenceOLrzqt;
        Intrinsics.checkNotNullParameter(transactionStatistic, "");
        oNJ onjKWHzl = KWHzl();
        android.widget.TextView textView = onjKWHzl.uzCIH;
        java.lang.CharSequence charSequenceOLrzqt2 = "--";
        if (C33129mqd.OLrzqt((java.lang.Object) transactionStatistic.djBIcL(), (java.lang.Object) 0)) {
            strOLrzqt = "--";
        } else {
            strOLrzqt = mRJ.AEQbTJ.OLrzqt(transactionStatistic.djBIcL(), (252 & 1) != 0 ? false : true, (252 & 2) != 0 ? RoundingMode.HALF_UP : RoundingMode.DOWN, (252 & 4) != 0 ? true : true, (252 & 8) == 0 ? false : true, (252 & 16) != 0 ? false : false, (252 & 32) != 0 ? false : false, (252 & 64) != 0 ? DisplaySign.AUTO : null, (252 & 128) == 0 ? false : false);
        }
        textView.setText(strOLrzqt);
        android.widget.TextView textView2 = onjKWHzl.uzCIH;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        C34550neG.copydefault(textView2, transactionStatistic.djBIcL(), java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl));
        android.widget.TextView textView3 = onjKWHzl.AkhnZx;
        if (C33129mqd.OLrzqt((java.lang.Object) transactionStatistic.KWHzl(), (java.lang.Object) 0)) {
            strOLrzqt2 = "--";
        } else {
            strOLrzqt2 = mRJ.AEQbTJ.OLrzqt(transactionStatistic.KWHzl(), (252 & 1) != 0 ? false : true, (252 & 2) != 0 ? RoundingMode.HALF_UP : RoundingMode.DOWN, (252 & 4) != 0 ? true : true, (252 & 8) == 0 ? false : true, (252 & 16) != 0 ? false : false, (252 & 32) != 0 ? false : false, (252 & 64) != 0 ? DisplaySign.AUTO : DisplaySign.EXCEPT_ZERO, (252 & 128) == 0 ? false : false);
        }
        textView3.setText(strOLrzqt2);
        android.widget.TextView textView4 = onjKWHzl.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        C34550neG.KWHzl(textView4, transactionStatistic.KWHzl());
        onjKWHzl.getFieldNames.KWHzl(C33129mqd.AEQbTJ(transactionStatistic.EZpvd()), C33129mqd.AEQbTJ(transactionStatistic.copydefault()));
        android.widget.TextView textView5 = onjKWHzl.isConnected;
        if (C33129mqd.OLrzqt((java.lang.Object) transactionStatistic.OLrzqt(), (java.lang.Object) 0) && C33129mqd.OLrzqt((java.lang.Object) transactionStatistic.EZpvd(), (java.lang.Object) 0)) {
            charSequenceOLrzqt = "--";
        } else {
            java.lang.String strOLrzqt3 = transactionStatistic.OLrzqt();
            java.lang.String strEZpvd = transactionStatistic.EZpvd();
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            charSequenceOLrzqt = OLrzqt(strOLrzqt3, strEZpvd, C33512mxp.tradeRiseDefault$default(c33512mxp, context, 0.0f, 2, null));
        }
        textView5.setText(charSequenceOLrzqt);
        android.widget.TextView textView6 = onjKWHzl.DbNXlk;
        if (!C33129mqd.OLrzqt((java.lang.Object) transactionStatistic.AEQbTJ(), (java.lang.Object) 0) || !C33129mqd.OLrzqt((java.lang.Object) transactionStatistic.copydefault(), (java.lang.Object) 0)) {
            java.lang.String strAEQbTJ = transactionStatistic.AEQbTJ();
            java.lang.String strCopydefault = transactionStatistic.copydefault();
            C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            charSequenceOLrzqt2 = OLrzqt(strAEQbTJ, strCopydefault, C33512mxp.tradeFallDefault$default(c33512mxp2, context2, 0.0f, 2, null));
        }
        textView6.setText(charSequenceOLrzqt2);
    }

    public final android.text.SpannableString OLrzqt(java.lang.String str, java.lang.String str2, int i) {
        java.lang.String numberICU$default = mRA.getNumberICU$default(str, null, null, null, null, 15, null);
        java.lang.String strOLrzqt = mRJ.AEQbTJ.OLrzqt(str2, (252 & 1) != 0 ? false : true, (252 & 2) != 0 ? RoundingMode.HALF_UP : RoundingMode.DOWN, (252 & 4) != 0 ? true : true, (252 & 8) == 0 ? false : true, (252 & 16) != 0 ? false : false, (252 & 32) != 0 ? false : false, (252 & 64) != 0 ? DisplaySign.AUTO : null, (252 & 128) == 0 ? false : false);
        int iCopydefault = mUM.copydefault(C52761wXj.Activity.QwvEab);
        if (Intrinsics.EZpvd((java.lang.Object) numberICU$default, (java.lang.Object) "--") && Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "--")) {
            android.text.SpannableString spannableString = new android.text.SpannableString("--");
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(iCopydefault), 0, str.length(), 33);
            return spannableString;
        }
        java.lang.String str3 = numberICU$default + " / " + strOLrzqt;
        android.text.SpannableString spannableString2 = new android.text.SpannableString(str3);
        spannableString2.setSpan(new android.text.style.ForegroundColorSpan(C33129mqd.djBIcL(str) == 0.0f ? iCopydefault : i), 0, numberICU$default.length(), 33);
        spannableString2.setSpan(new android.text.style.ForegroundColorSpan(iCopydefault), numberICU$default.length(), numberICU$default.length() + 3, 33);
        if (C33129mqd.djBIcL(str2) != 0.0f) {
            iCopydefault = i;
        }
        spannableString2.setSpan(new android.text.style.ForegroundColorSpan(iCopydefault), numberICU$default.length() + 3, str3.length(), 33);
        return spannableString2;
    }

    public static final Unit AEQbTJ(java.util.List list, android.widget.LinearLayout linearLayout, C34400nbP c34400nbP, FilterTimeDuration filterTimeDuration, java.lang.String str, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.Object objComponent1 = ((Triple) it.next()).component1();
            Intrinsics.checkNotNullExpressionValue(objComponent1, "");
            ((android.widget.LinearLayout) objComponent1).setSelected(false);
        }
        linearLayout.setSelected(true);
        Function1<? super FilterTimeDuration, Unit> function1 = c34400nbP.AEQbTJ;
        if (function1 != null) {
            function1.invoke(filterTimeDuration);
        }
        mRG.OLrzqt(str);
        return Unit.INSTANCE;
    }
}
