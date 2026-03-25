package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oOr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C36084oOr implements ViewBinding {
    public final C32243mUu AEQbTJ;
    public final android.widget.ImageView AYXKKw;
    public final LinearLayoutCompat AhwBna;
    public final android.widget.TextView AkhnZx;
    public final mXE EZpvd;
    public final C34611nfP KWHzl;
    public final C55251xgS OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.view.View djBIcL;
    public final Flow fetchVPNInfo;
    public final android.widget.TextView gEmmrt;
    public final ConstraintLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.djBIcL;
    }

    public C36084oOr(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C34611nfP c34611nfP, @androidx.annotation.NonNull mXE mxe, @androidx.annotation.NonNull C32243mUu c32243mUu, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull Flow flow, @androidx.annotation.NonNull android.widget.TextView textView3) {
        this.djBIcL = view;
        this.KWHzl = c34611nfP;
        this.EZpvd = mxe;
        this.AEQbTJ = c32243mUu;
        this.OLrzqt = c55251xgS;
        this.copydefault = textView;
        this.gEmmrt = textView2;
        this.AYXKKw = imageView;
        this.valueOf = constraintLayout;
        this.AhwBna = linearLayoutCompat;
        this.fetchVPNInfo = flow;
        this.AkhnZx = textView3;
    }

    public static C36084oOr KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C35964oKf.Application.vLaW, viewGroup);
        return AEQbTJ(viewGroup);
    }

    public static C36084oOr AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.dIjzlO;
        C34611nfP c34611nfP = (C34611nfP) ViewBindings.findChildViewById(view, i);
        if (c34611nfP != null) {
            i = C35964oKf.StateListAnimator.init;
            mXE mxe = (mXE) ViewBindings.findChildViewById(view, i);
            if (mxe != null) {
                i = C35964oKf.StateListAnimator.v;
                C32243mUu c32243mUu = (C32243mUu) ViewBindings.findChildViewById(view, i);
                if (c32243mUu != null) {
                    i = C35964oKf.StateListAnimator.clearRegistrations;
                    C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
                    if (c55251xgS != null) {
                        i = C35964oKf.StateListAnimator.FQNKFG;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = C35964oKf.StateListAnimator.FSMca;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = C35964oKf.StateListAnimator.GiPPlL;
                                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView != null) {
                                    i = C35964oKf.StateListAnimator.RWIpjU;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout != null) {
                                        i = C35964oKf.StateListAnimator.openFileOutput;
                                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                        if (linearLayoutCompat != null) {
                                            i = C35964oKf.StateListAnimator.onProgressUpdate;
                                            Flow flow = (Flow) ViewBindings.findChildViewById(view, i);
                                            if (flow != null) {
                                                i = C35964oKf.StateListAnimator.getRating;
                                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView3 != null) {
                                                    return new C36084oOr(view, c34611nfP, mxe, c32243mUu, c55251xgS, textView, textView2, imageView, constraintLayout, linearLayoutCompat, flow, textView3);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
