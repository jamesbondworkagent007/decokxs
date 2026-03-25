package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.collection.ArrayMapKt;
import com.okinc.business.dexlogic.txs.TxType;
import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class hTG extends android.widget.LinearLayout {
    public final hHM EZpvd;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hTG(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:28) call: o.hTG.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ hTG(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hTG(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        hHM hhmAEQbTJ = hHM.AEQbTJ(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(hhmAEQbTJ, "");
        this.EZpvd = hhmAEQbTJ;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hTG.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final void setTransactionValueData(@NotNull java.lang.String str, @NotNull C25630jAn c25630jAn) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c25630jAn, "");
        hHM hhm = this.EZpvd;
        LinearLayoutCompat linearLayoutCompat = hhm.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "HOLDERS_HISTORY") ^ true ? 0 : 8);
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        android.content.Context contextCopydefault = C25382ivf.copydefault(context);
        java.lang.String strKWHzl = c25630jAn.KWHzl();
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        int iEZpvd = EZpvd(strKWHzl, C33512mxp.tradeRiseDefault$default(c33512mxp, contextCopydefault, 0.0f, 2, null), C25382ivf.copydefault(C52761wXj.ActionBar.getPostValueLengthLimit, contextCopydefault));
        int iEZpvd2 = EZpvd(c25630jAn.AEQbTJ(), C33512mxp.tradeFallDefault$default(c33512mxp, contextCopydefault, 0.0f, 2, null), C25382ivf.copydefault(C52761wXj.ActionBar.getPostValueLengthLimit, contextCopydefault));
        hhm.OLrzqt.setTextColor(iEZpvd);
        hhm.EZpvd.setTextColor(iEZpvd);
        hhm.gEmmrt.setTextColor(iEZpvd2);
        hhm.AYXKKw.setTextColor(iEZpvd2);
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "TURN_OVER")) {
            hHM hhm2 = this.EZpvd;
            C23272hvB c23272hvB = C23272hvB.KWHzl;
            java.lang.String strOLrzqt = c25630jAn.OLrzqt();
            RoundingMode roundingMode = RoundingMode.DOWN;
            hhm2.valueOf.setText(C23272hvB.formatScientificCurrency$default(c23272hvB, strOLrzqt, true, roundingMode, true, false, false, false, null, false, false, 496, null));
            hhm2.EZpvd.setText(C23272hvB.formatScientificCurrency$default(c23272hvB, c25630jAn.KWHzl(), true, roundingMode, true, false, false, false, null, false, false, 496, null));
            hhm2.AYXKKw.setText(C23272hvB.formatScientificCurrency$default(c23272hvB, c25630jAn.AEQbTJ(), true, roundingMode, true, false, false, false, null, false, false, 496, null));
            hhm2.AhwBna.copydefault(C33129mqd.AEQbTJ(c25630jAn.KWHzl()), C33129mqd.AEQbTJ(c25630jAn.AEQbTJ()));
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "HOLDERS_HISTORY")) {
            hHM hhm3 = this.EZpvd;
            AppCompatTextView appCompatTextView = hhm3.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            C31258lqd.copydefault(appCompatTextView, TxType.BUY);
            AppCompatTextView appCompatTextView2 = hhm3.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
            C31258lqd.copydefault(appCompatTextView2, TxType.SELL);
            java.lang.String numberICU$default = c25630jAn.KWHzl().length() == 0 ? "--" : C23319hvw.getNumberICU$default(c25630jAn.KWHzl(), RoundingMode.HALF_DOWN, null, null, null, 14, null);
            java.lang.String numberICU$default2 = c25630jAn.AEQbTJ().length() != 0 ? C23319hvw.getNumberICU$default(c25630jAn.AEQbTJ(), RoundingMode.HALF_DOWN, null, null, null, 14, null) : "--";
            AppCompatTextView appCompatTextView3 = hhm3.EZpvd;
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            appCompatTextView3.setText(pTD.EZpvd(context2, C23274hvD.FragmentManager.getFieldNames, C33129mqd.AhwBna(c25630jAn.KWHzl()), ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("num", numberICU$default))));
            AppCompatTextView appCompatTextView4 = hhm3.AYXKKw;
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            appCompatTextView4.setText(pTD.EZpvd(context3, C23274hvD.FragmentManager.getFieldNames, C33129mqd.AhwBna(c25630jAn.AEQbTJ()), ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("num", numberICU$default2))));
            hhm3.AhwBna.copydefault(C33129mqd.AEQbTJ(c25630jAn.KWHzl()), C33129mqd.AEQbTJ(c25630jAn.AEQbTJ()));
        } else {
            hHM hhm4 = this.EZpvd;
            java.lang.String numberICU$default3 = c25630jAn.OLrzqt().length() == 0 ? "0" : C23319hvw.getNumberICU$default(c25630jAn.OLrzqt(), RoundingMode.HALF_DOWN, null, null, null, 14, null);
            java.lang.String numberICU$default4 = c25630jAn.KWHzl().length() == 0 ? "0" : C23319hvw.getNumberICU$default(c25630jAn.KWHzl(), RoundingMode.HALF_DOWN, null, null, null, 14, null);
            java.lang.String numberICU$default5 = c25630jAn.AEQbTJ().length() != 0 ? C23319hvw.getNumberICU$default(c25630jAn.AEQbTJ(), RoundingMode.HALF_DOWN, null, null, null, 14, null) : "0";
            hhm4.valueOf.setText(numberICU$default3);
            hhm4.EZpvd.setText(numberICU$default4);
            hhm4.AYXKKw.setText(numberICU$default5);
            hhm4.AhwBna.copydefault(C33129mqd.AEQbTJ(c25630jAn.KWHzl()), C33129mqd.AEQbTJ(c25630jAn.AEQbTJ()));
        }
        invalidate();
    }

    public final int EZpvd(java.lang.String str, int i, int i2) {
        return str.length() == 0 ? i2 : i;
    }
}
