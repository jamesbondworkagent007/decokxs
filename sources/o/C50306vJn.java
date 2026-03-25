package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import com.okinc.unify_trade.bot.presenter.EmptyPresenter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vJn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C50306vJn extends AbstractC54505xKx<uPI, EmptyPresenter> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final int OLrzqt = C48033uCm.Activity.hCLrkq;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.OLrzqt;
    }

    /* JADX INFO: renamed from: o.vJn$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vJn.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C50306vJn OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C50306vJn c50306vJn = new C50306vJn();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("explain_type", str);
            c50306vJn.setArguments(bundle);
            return c50306vJn;
        }
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        android.os.Bundle arguments = getArguments();
        this.copydefault = arguments != null ? arguments.getString("explain_type") : null;
        AEQbTJ();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [49=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void AEQbTJ() {
        java.lang.Integer numValueOf;
        java.lang.String str = this.copydefault;
        if (str != null) {
            switch (str.hashCode()) {
                case -1539138479:
                    numValueOf = !str.equals("start_build") ? null : java.lang.Integer.valueOf(C48033uCm.Activity.DcMfJKfNLfdT);
                    break;
                case -1059891784:
                    numValueOf = !str.equals("trigger") ? null : java.lang.Integer.valueOf(C48033uCm.Activity.DcMfJKgMxgjU);
                    break;
                case 110559996:
                    numValueOf = !str.equals("tp_sl") ? null : java.lang.Integer.valueOf(C48033uCm.Activity.DcMfJKfNUfqk);
                    break;
                case 1630089583:
                    numValueOf = !str.equals("stop_sell") ? null : java.lang.Integer.valueOf(C48033uCm.Activity.DcMfJKffREWX);
                    break;
                default:
                    numValueOf = null;
                    break;
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            android.view.View viewInflate = android.view.LayoutInflater.from(requireContext()).inflate(numValueOf.intValue(), (android.view.ViewGroup) null);
            if (Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) "trigger")) {
                Intrinsics.copydefault(viewInflate);
                OLrzqt(viewInflate);
            }
            gGvvIC().copydefault.addView(viewInflate);
        }
    }

    public final void OLrzqt(android.view.View view) {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        uUP uup = (uUP) DataBindingUtil.bind(view);
        if (uup != null && (appCompatTextView2 = uup.KWHzl) != null) {
            appCompatTextView2.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.ihnvzI));
        }
        if (uup == null || (appCompatTextView = uup.EZpvd) == null) {
            return;
        }
        appCompatTextView.setText(C33070mpX.AYXKKw(C55688xof.Application.MediaBrowserCompatMediaItemFlags));
    }
}
