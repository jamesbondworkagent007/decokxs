package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import com.okinc.tradeuilib.imgs.OKRemoteImageResource;
import com.okinc.tradeuilib.imgs.RemoteSupportedScaleType;
import com.okinc.unify_trade.bot.presenter.EmptyPresenter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class vNJ extends AbstractC54505xKx<uPI, EmptyPresenter> {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public java.lang.String EZpvd;
    public final int OLrzqt = C48033uCm.Activity.hCLrkq;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.OLrzqt;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vNJ.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final vNJ OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            vNJ vnj = new vNJ();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("explain_type", str);
            vnj.setArguments(bundle);
            return vnj;
        }
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        android.os.Bundle arguments = getArguments();
        this.EZpvd = arguments != null ? arguments.getString("explain_type") : null;
        AEQbTJ();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [55=5] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void AEQbTJ() {
        java.lang.Integer numValueOf;
        java.lang.String str = this.EZpvd;
        if (str != null) {
            switch (str.hashCode()) {
                case -1248340599:
                    numValueOf = !str.equals("trailing_grid") ? null : java.lang.Integer.valueOf(C48033uCm.Activity.DcMfJKsfEqpH);
                    break;
                case -580933545:
                    numValueOf = !str.equals("stop_and_sell") ? null : java.lang.Integer.valueOf(C48033uCm.Activity.GGlJim);
                    break;
                case 110559996:
                    numValueOf = !str.equals("tp_sl") ? null : java.lang.Integer.valueOf(C48033uCm.Activity.DcMfJKfNUfqk);
                    break;
                case 559448353:
                    numValueOf = !str.equals("SmartEarn") ? null : java.lang.Integer.valueOf(C48033uCm.Activity.RJOkX);
                    break;
                case 2092431188:
                    numValueOf = !str.equals("trigger_condition") ? null : java.lang.Integer.valueOf(C48033uCm.Activity.DcMfJKgMxgjU);
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
            java.lang.String str2 = this.EZpvd;
            if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "trailing_grid")) {
                Intrinsics.copydefault(viewInflate);
                AEQbTJ(viewInflate);
            } else if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "trigger_condition")) {
                Intrinsics.copydefault(viewInflate);
                EZpvd(viewInflate);
            }
            gGvvIC().copydefault.addView(viewInflate);
        }
    }

    public final void AEQbTJ(android.view.View view) {
        uUL uul;
        AppCompatImageView appCompatImageView;
        uUO uuo;
        AppCompatImageView appCompatImageView2;
        AppCompatImageView appCompatImageView3;
        AppCompatImageView appCompatImageView4;
        AppCompatImageView appCompatImageView5;
        AppCompatImageView appCompatImageView6;
        AppCompatImageView appCompatImageView7;
        AppCompatImageView appCompatImageView8;
        final uUN uun = (uUN) DataBindingUtil.bind(view);
        if (uun != null && (appCompatImageView8 = uun.AEQbTJ) != null) {
            appCompatImageView8.setSelected(false);
        }
        if (uun != null && (appCompatImageView7 = uun.AEQbTJ) != null) {
            appCompatImageView7.setOnClickListener(new View.OnClickListener() { // from class: o.vNO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    vNJ.AEQbTJ(uun, view2);
                }
            });
        }
        if (uun != null && (appCompatImageView6 = uun.AYXKKw) != null) {
            appCompatImageView6.setSelected(false);
        }
        if (uun != null && (appCompatImageView5 = uun.AYXKKw) != null) {
            appCompatImageView5.setOnClickListener(new View.OnClickListener() { // from class: o.vNM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    vNJ.copydefault(uun, view2);
                }
            });
        }
        if (uun != null && (appCompatImageView4 = uun.KWHzl) != null) {
            appCompatImageView4.setSelected(false);
        }
        if (uun != null && (appCompatImageView3 = uun.KWHzl) != null) {
            appCompatImageView3.setOnClickListener(new View.OnClickListener() { // from class: o.vNK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    vNJ.AhwBna(uun, view2);
                }
            });
        }
        if (uun != null && (uuo = uun.AhwBna) != null && (appCompatImageView2 = uuo.fetchVPNInfo) != null) {
            C49721utr.OLrzqt(appCompatImageView2, OKRemoteImageResource.Resource.TRADE_IMPL_TRAILING_UP_CHART, getContext(), (2044 & 4) != 0 ? 0 : 0, (2044 & 8) != 0 ? RemoteSupportedScaleType.CENTER_INSIDE : null, (2044 & 16) != 0 ? null : null, (2044 & 32) != 0 ? -1 : 0, (2044 & 64) != 0 ? -1 : 0, (2044 & 128) != 0 ? null : null, (2044 & 256) != 0 ? null : null, (2044 & 512) != 0 ? false : false, (2044 & 1024) != 0 ? OKRemoteImageResource.EZpvd.getClass().getSimpleName() : getTAG());
        }
        if (uun == null || (uul = uun.EZpvd) == null || (appCompatImageView = uul.DbNXlk) == null) {
            return;
        }
        C49721utr.OLrzqt(appCompatImageView, OKRemoteImageResource.Resource.TRADE_IMPL_TRAILING_DOWN_CHART, getContext(), (2044 & 4) != 0 ? 0 : 0, (2044 & 8) != 0 ? RemoteSupportedScaleType.CENTER_INSIDE : null, (2044 & 16) != 0 ? null : null, (2044 & 32) != 0 ? -1 : 0, (2044 & 64) != 0 ? -1 : 0, (2044 & 128) != 0 ? null : null, (2044 & 256) != 0 ? null : null, (2044 & 512) != 0 ? false : false, (2044 & 1024) != 0 ? OKRemoteImageResource.EZpvd.getClass().getSimpleName() : getTAG());
    }

    public static final void AEQbTJ(uUN uun, android.view.View view) {
        AppCompatTextView appCompatTextView = uun.djBIcL;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        boolean z = appCompatTextView.getVisibility() == 0;
        view.setSelected(z);
        AppCompatTextView appCompatTextView2 = uun.djBIcL;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        appCompatTextView2.setVisibility(z ^ true ? 0 : 8);
    }

    public static final void copydefault(uUN uun, android.view.View view) {
        AppCompatTextView appCompatTextView = uun.valueOf;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        boolean z = appCompatTextView.getVisibility() == 0;
        view.setSelected(z);
        AppCompatTextView appCompatTextView2 = uun.valueOf;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        boolean z2 = !z;
        appCompatTextView2.setVisibility(z2 ? 0 : 8);
        android.view.View root = uun.AhwBna.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        root.setVisibility(z2 ? 0 : 8);
    }

    public static final void AhwBna(uUN uun, android.view.View view) {
        AppCompatTextView appCompatTextView = uun.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        boolean z = appCompatTextView.getVisibility() == 0;
        view.setSelected(z);
        AppCompatTextView appCompatTextView2 = uun.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        boolean z2 = !z;
        appCompatTextView2.setVisibility(z2 ? 0 : 8);
        android.view.View root = uun.EZpvd.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        root.setVisibility(z2 ? 0 : 8);
    }

    private final void EZpvd(android.view.View view) {
        java.lang.String strAYXKKw;
        java.lang.String strAYXKKw2;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        uUP uup = (uUP) DataBindingUtil.bind(view);
        if (C56071xvr.gEmmrt.uzCIH()) {
            strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.iOIMNp);
            strAYXKKw2 = C33070mpX.AYXKKw(C48033uCm.Fragment.putInt);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.HJWChPfvRMlC);
            strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.MediaBrowserCompatMediaItemFlags);
        }
        if (uup != null && (appCompatTextView2 = uup.KWHzl) != null) {
            appCompatTextView2.setText(strAYXKKw);
        }
        if (uup == null || (appCompatTextView = uup.EZpvd) == null) {
            return;
        }
        appCompatTextView.setText(strAYXKKw2);
    }
}
