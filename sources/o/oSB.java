package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32392mcI;
import o.C35964oKf;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oSB extends wXX {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public oOO copydefault;

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oSB.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.setTitle(C33070mpX.AYXKKw(C32392mcI.Dialog.call));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.copydefault = oOO.EZpvd(getCustomLayoutInflater(), constraintLayout);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        ConstraintLayout constraintLayout;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C54946xaf binding = getBinding();
        if (binding != null && (constraintLayout = binding.AEQbTJ) != null) {
            constraintLayout.setPaddingRelative(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(48, (android.content.Context) null, 1, (java.lang.Object) null));
        }
        oOO ooo = this.copydefault;
        if (ooo != null) {
            OLrzqt(ooo);
        }
        C36234oUf.EZpvd.EZpvd("bottom_settings_tutorial", "liquidation_price");
    }

    public final void OLrzqt(oOO ooo) {
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        int iTradeRiseGraph$default = C33512mxp.tradeRiseGraph$default(c33512mxp, context, 0.0f, 2, null);
        int iTradeFallGraph$default = C33512mxp.tradeFallGraph$default(c33512mxp, context, 0.0f, 2, null);
        pFZ pfz = pFZ.KWHzl;
        AppCompatImageView appCompatImageView = ooo.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        pfz.OLrzqt(appCompatImageView, C35964oKf.Activity.QKVWgx, iTradeRiseGraph$default);
        AppCompatImageView appCompatImageView2 = ooo.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
        pfz.OLrzqt(appCompatImageView2, C35964oKf.Activity.ORxRYg, iTradeFallGraph$default);
        AppCompatTextView appCompatTextView = ooo.AhwBna;
        xMR xmr = xMR.copydefault;
        appCompatTextView.setText(xMR.formatLocalizedWithMinPrecision$default(xmr, "21762.00", 0, 2, null));
        ooo.AYXKKw.setText(xMR.formatLocalizedWithMinPrecision$default(xmr, "20862.00", 0, 2, null));
        ooo.copydefault.setText(xMR.formatLocalizedWithMinPrecision$default(xmr, "19962.00", 0, 2, null));
        ooo.AEQbTJ.setText(xMR.formatLocalizedWithMinPrecision$default(xmr, "20007.00", 0, 2, null));
        int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.gdmIOq);
        ooo.EZpvd.OLrzqt(iCopydefault);
        ooo.AEQbTJ.AEQbTJ(iCopydefault);
        ooo.valueOf.AEQbTJ(iCopydefault);
    }
}
