package o;

import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ymn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC57671ymn extends C33003moJ implements InterfaceC33075mpc {
    public mPB AuCTelauCTel;

    public abstract android.view.View AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup, android.os.Bundle bundle);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull mPB mpb) {
        Intrinsics.checkNotNullParameter(mpb, "");
        this.AuCTelauCTel = mpb;
    }

    public abstract android.view.View EZpvd(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup);

    public abstract java.lang.Float OLrzqt();

    @Override // o.InterfaceC33075mpc
    public void dismissLoading() {
    }

    public abstract boolean isConnected();

    @Override // o.InterfaceC33075mpc
    public void releaseLoading() {
    }

    @Override // o.InterfaceC33075mpc
    public void showLoading() {
    }

    public final mPB fARcdN() {
        mPB mpb = this.AuCTelauCTel;
        if (mpb != null) {
            return mpb;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.C33003moJ
    public void AEQbTJ() {
        if (isConnected()) {
            setStyle(0, C32113mPz.Dialog.KWHzl);
        } else {
            setStyle(0, C32113mPz.Dialog.EZpvd);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AEQbTJ((mPB) DataBindingUtil.inflate(layoutInflater, C32113mPz.Fragment.EZpvd, viewGroup, false));
        android.widget.LinearLayout linearLayout = fARcdN().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        android.view.View viewEZpvd = EZpvd(layoutInflater, linearLayout);
        int iCopydefault = -2;
        if (viewEZpvd != null) {
            if (viewEZpvd.getLayoutParams() == null) {
                viewEZpvd.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            }
            fARcdN().AEQbTJ.addView(viewEZpvd, 0);
        }
        android.widget.LinearLayout linearLayout2 = fARcdN().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
        android.view.View viewAEQbTJ = AEQbTJ(layoutInflater, linearLayout2, bundle);
        if (viewAEQbTJ != null) {
            if (viewAEQbTJ.getLayoutParams() == null) {
                viewAEQbTJ.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            }
            fARcdN().AEQbTJ.addView(viewAEQbTJ, viewEZpvd != null ? 1 : 0);
        }
        if (OLrzqt() == null) {
            java.lang.Float fOLrzqt = OLrzqt();
            if ((fOLrzqt != null ? fOLrzqt.floatValue() : 0.0f) == 1.0f) {
                iCopydefault = C57676yms.copydefault(requireContext()) - C57676yms.AYXKKw(requireContext());
            }
        } else {
            java.lang.Float fOLrzqt2 = OLrzqt();
            if ((fOLrzqt2 != null ? fOLrzqt2.floatValue() : 0.0f) > 0.0f) {
                java.lang.Float fOLrzqt3 = OLrzqt();
                if ((fOLrzqt3 != null ? fOLrzqt3.floatValue() : 0.0f) < 1.0f) {
                    float fCopydefault = C57676yms.copydefault(requireContext());
                    java.lang.Float fOLrzqt4 = OLrzqt();
                    Intrinsics.copydefault(fOLrzqt4);
                    iCopydefault = (int) (fCopydefault * fOLrzqt4.floatValue());
                }
            }
        }
        ViewGroup.LayoutParams layoutParams = fARcdN().AEQbTJ.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, iCopydefault);
        } else {
            layoutParams.height = iCopydefault;
        }
        fARcdN().AEQbTJ.setLayoutParams(layoutParams);
        return fARcdN().getRoot();
    }

    public final void EZpvd(int i) {
        android.widget.LinearLayout linearLayout;
        mPB mpbFARcdN = fARcdN();
        if (mpbFARcdN == null || (linearLayout = mpbFARcdN.AEQbTJ) == null) {
            return;
        }
        linearLayout.setBackgroundResource(i);
    }
}
