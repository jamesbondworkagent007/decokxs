package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oSz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36200oSz extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public oOL AEQbTJ;

    /* JADX INFO: renamed from: o.oSz$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oSz.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.setTitle(C33070mpX.AYXKKw(C35964oKf.Fragment.heceqZ));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.AEQbTJ = oOL.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        oOL ool = this.AEQbTJ;
        if (ool != null) {
            copydefault(ool);
        }
        C36234oUf.EZpvd.EZpvd("bottom_settings_tutorial", "historical_orders");
    }

    public final void copydefault(oOL ool) {
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        int iTradeRiseGraph$default = C33512mxp.tradeRiseGraph$default(c33512mxp, context, 0.0f, 2, null);
        int iTradeFallGraph$default = C33512mxp.tradeFallGraph$default(c33512mxp, context, 0.0f, 2, null);
        pFZ pfz = pFZ.KWHzl;
        AppCompatImageView appCompatImageView = ool.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        pfz.OLrzqt(appCompatImageView, C35964oKf.Activity.QKVWgx, iTradeRiseGraph$default);
        AppCompatImageView appCompatImageView2 = ool.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
        pfz.OLrzqt(appCompatImageView2, C35964oKf.Activity.ORxRYg, iTradeFallGraph$default);
        AppCompatImageView appCompatImageView3 = ool.djBIcL;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "");
        pfz.OLrzqt(appCompatImageView3, C35964oKf.Activity.OcIXYQ, iTradeRiseGraph$default);
        AppCompatImageView appCompatImageView4 = ool.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView4, "");
        pfz.OLrzqt(appCompatImageView4, C35964oKf.Activity.DTwDnp, iTradeFallGraph$default);
        AppCompatTextView appCompatTextView = ool.valueOf;
        xMR xmr = xMR.copydefault;
        appCompatTextView.setText(xMR.formatLocalizedWithMinPrecision$default(xmr, "21762.00", 0, 2, null));
        ool.EZpvd.setText(xMR.formatLocalizedWithMinPrecision$default(xmr, "20862.00", 0, 2, null));
        ool.OLrzqt.setText(xMR.formatLocalizedWithMinPrecision$default(xmr, "19962.00", 0, 2, null));
        if (Intrinsics.EZpvd((java.lang.Object) C36246oUr.copydefault().fZBcTu(), (java.lang.Object) "defi_mode_dex")) {
            ool.AEQbTJ.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.HJWChPOKBmQN));
        }
    }
}
