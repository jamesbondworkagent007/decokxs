package o;

import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ymq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC57674ymq extends C33003moJ implements InterfaceC33075mpc {
    public mPF AubY;
    public boolean fIwbmz;

    public abstract android.view.View AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater);

    public abstract android.view.View AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle);

    public abstract boolean KWHzl();

    public abstract java.lang.Float OLrzqt();

    @Override // o.InterfaceC33075mpc
    public void dismissLoading() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean djBIcL() {
        return this.fIwbmz;
    }

    @Override // o.InterfaceC33075mpc
    public void releaseLoading() {
    }

    @Override // o.InterfaceC33075mpc
    public void showLoading() {
    }

    @Override // o.C33003moJ
    public void AEQbTJ() {
        if (djBIcL()) {
            setStyle(0, C32113mPz.Dialog.copydefault);
        } else if (KWHzl()) {
            setStyle(0, C32113mPz.Dialog.KWHzl);
        } else {
            setStyle(0, C32113mPz.Dialog.EZpvd);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.AubY = (mPF) DataBindingUtil.inflate(layoutInflater, C32113mPz.Fragment.OLrzqt, viewGroup, false);
        android.view.View viewAEQbTJ = AEQbTJ(layoutInflater);
        int iFloatValue = -2;
        mPF mpf = null;
        if (viewAEQbTJ != null) {
            if (viewAEQbTJ.getLayoutParams() == null) {
                viewAEQbTJ.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            }
            mPF mpf2 = this.AubY;
            if (mpf2 == null) {
                Intrinsics.gEmmrt("");
                mpf2 = null;
            }
            mpf2.AEQbTJ.addView(viewAEQbTJ, 0);
        }
        mPF mpf3 = this.AubY;
        if (mpf3 == null) {
            Intrinsics.gEmmrt("");
            mpf3 = null;
        }
        android.view.View viewAEQbTJ2 = AEQbTJ(layoutInflater, mpf3.OLrzqt, bundle);
        if (viewAEQbTJ2 != null) {
            mPF mpf4 = this.AubY;
            if (mpf4 == null) {
                Intrinsics.gEmmrt("");
                mpf4 = null;
            }
            mpf4.OLrzqt.addView(viewAEQbTJ2);
        }
        if (OLrzqt() != null) {
            java.lang.Float fOLrzqt = OLrzqt();
            if ((fOLrzqt != null ? fOLrzqt.floatValue() : 0.0f) > 0.0f) {
                java.lang.Float fOLrzqt2 = OLrzqt();
                if ((fOLrzqt2 != null ? fOLrzqt2.floatValue() : 0.0f) <= 1.0f) {
                    float fKWHzl = C57676yms.KWHzl(requireContext());
                    java.lang.Float fOLrzqt3 = OLrzqt();
                    Intrinsics.copydefault(fOLrzqt3);
                    iFloatValue = (int) (fKWHzl * fOLrzqt3.floatValue());
                }
            }
        }
        mPF mpf5 = this.AubY;
        if (mpf5 == null) {
            Intrinsics.gEmmrt("");
            mpf5 = null;
        }
        ViewGroup.LayoutParams layoutParams = mpf5.AEQbTJ.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, iFloatValue);
        } else {
            layoutParams.height = iFloatValue;
        }
        mPF mpf6 = this.AubY;
        if (mpf6 == null) {
            Intrinsics.gEmmrt("");
            mpf6 = null;
        }
        mpf6.AEQbTJ.setLayoutParams(layoutParams);
        mPF mpf7 = this.AubY;
        if (mpf7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            mpf = mpf7;
        }
        return mpf.getRoot();
    }

    public final void KWHzl(int i) {
        mPF mpf = this.AubY;
        if (mpf == null) {
            Intrinsics.gEmmrt("");
            mpf = null;
        }
        android.widget.FrameLayout frameLayout = mpf.OLrzqt;
        if (frameLayout != null) {
            frameLayout.setBackgroundResource(i);
        }
    }
}
