package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fwH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19169fwH extends RecyclerView.ViewHolder {
    public final Function1<C18952fsC, Unit> AEQbTJ;
    public final C17176exp copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.fsC, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C19169fwH(@NotNull C17176exp c17176exp, @NotNull Function1<? super C18952fsC, Unit> function1) {
        super(c17176exp.getRoot());
        Intrinsics.checkNotNullParameter(c17176exp, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = c17176exp;
        this.AEQbTJ = function1;
    }

    private final android.content.Context OLrzqt() {
        android.content.Context context = this.copydefault.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return context;
    }

    public final void OLrzqt(@NotNull C18952fsC c18952fsC) {
        int iTradeRiseDefault$default;
        Intrinsics.checkNotNullParameter(c18952fsC, "");
        C17176exp c17176exp = this.copydefault;
        ShapeableImageView shapeableImageView = c17176exp.valueOf;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
        java.lang.String strDjBIcL = c18952fsC.djBIcL();
        int i = C52761wXj.TaskDescription.aHXSQp;
        int i2 = C52761wXj.Activity.zuBGHE;
        android.content.Context context = c17176exp.valueOf.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C14725dqq.loadFixSizeBorderImage$default(shapeableImageView, strDjBIcL, i, 1.0f, 32.0f, C33070mpX.OLrzqt(i2, context), false, 32, null);
        ShapeableImageView shapeableImageView2 = c17176exp.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView2, "");
        java.lang.String strCopydefault = c18952fsC.copydefault();
        int i3 = C52761wXj.TaskDescription.aHXSQp;
        int i4 = C52761wXj.Activity.zuBGHE;
        android.content.Context context2 = c17176exp.OLrzqt.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        C14725dqq.loadFixSizeBorderImage$default(shapeableImageView2, strCopydefault, i3, 1.0f, 16.0f, C33070mpX.OLrzqt(i4, context2), false, 32, null);
        c17176exp.AYXKKw.setText(c18952fsC.DbNXlk());
        c18952fsC.DbNXlk();
        android.widget.ImageView imageView = c17176exp.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(c18952fsC.KWHzl() ? 0 : 8);
        c17176exp.AhwBna.setText(C54880xYt.formatValuationFromAsset$default(c18952fsC.gEmmrt(), null, false, 0, false, 15, null));
        if (c18952fsC.AYXKKw() == 1) {
            android.widget.TextView textView = c17176exp.gEmmrt;
            java.lang.String strEZpvd = c18952fsC.EZpvd();
            if (strEZpvd == null) {
                strEZpvd = "";
            }
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ExperimentalLevel);
            java.lang.String strEZpvd2 = c18952fsC.EZpvd();
            textView.setText(KWHzl(strEZpvd, C33069mpW.OLrzqt(strAYXKKw, C56423yEv.EZpvd(C56390yDp.OLrzqt("count", strEZpvd2 != null ? strEZpvd2 : "")))));
        } else {
            C54864xYd c54864xYd = C54864xYd.AEQbTJ;
            java.lang.String str = c54864xYd.AhwBna() + C54873xYm.formatLargeValue$default(C33129mqd.EZpvd(C54862xYb.OLrzqt(c18952fsC.AhwBna(), java.lang.Double.valueOf(c54864xYd.OLrzqt()))), null, null, CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY, null, false, 25, null);
            c17176exp.gEmmrt.setText(KWHzl(str, C33069mpW.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.Experimental), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", str)))));
        }
        java.lang.String strValueOf = c18952fsC.valueOf();
        if (Intrinsics.EZpvd((java.lang.Object) strValueOf, (java.lang.Object) "--")) {
            iTradeRiseDefault$default = ContextCompat.getColor(OLrzqt(), C52761wXj.Activity.QwvEab);
        } else if (C33129mqd.OLrzqt((java.lang.Object) strValueOf, (java.lang.Object) 0)) {
            iTradeRiseDefault$default = ContextCompat.getColor(OLrzqt(), C52761wXj.Activity.fdOvFl);
        } else {
            iTradeRiseDefault$default = C33129mqd.AEQbTJ(strValueOf, 0) ? C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, OLrzqt(), 0.0f, 2, null) : C33512mxp.tradeFallDefault$default(C33512mxp.AEQbTJ, OLrzqt(), 0.0f, 2, null);
        }
        c17176exp.djBIcL.setTextColor(iTradeRiseDefault$default);
        if (Intrinsics.EZpvd((java.lang.Object) strValueOf, (java.lang.Object) "--")) {
            c17176exp.djBIcL.setText("--");
        } else {
            c17176exp.djBIcL.setText(pTB.formatICUPercent$default(C33129mqd.copydefault(strValueOf), RoundingMode.DOWN, null, DisplaySign.EXCEPT_ZERO, null, null, 26, null));
        }
        ConstraintLayout root = c17176exp.getRoot();
        root.setOnClickListener(new StateListAnimator(root, 1000L, this, c18952fsC));
    }

    public final java.lang.CharSequence KWHzl(java.lang.String str, java.lang.String str2) {
        return C33061mpO.setupSpanStyles$default(str2, new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.fwG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19169fwH.EZpvd(this.EZpvd, (java.util.List) obj);
            }
        }, 14, null);
    }

    public static final Unit EZpvd(C19169fwH c19169fwH, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(ContextCompat.getColor(c19169fwH.OLrzqt(), C52761wXj.Activity.fdOvFl)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.fwH$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C19169fwH AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C18952fsC OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C19169fwH c19169fwH, C18952fsC c18952fsC) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = c19169fwH;
            this.OLrzqt = c18952fsC;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.AEQbTJ.invoke(this.OLrzqt);
            }
        }
    }
}
