package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.code.OKCodeInput;
import o.C8206ayP;

/* JADX INFO: renamed from: o.aAA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C5629aAA implements ViewBinding {
    public final OKCodeInput AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final C52794wYp KWHzl;
    public final ConstraintLayout OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public C5629aAA(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull OKCodeInput oKCodeInput, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4) {
        this.OLrzqt = constraintLayout;
        this.AEQbTJ = oKCodeInput;
        this.KWHzl = c52794wYp;
        this.copydefault = textView;
        this.EZpvd = textView2;
        this.gEmmrt = textView3;
        this.djBIcL = textView4;
    }

    public static C5629aAA copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C8206ayP.Application.DarRvM, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C5629aAA OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C8206ayP.StateListAnimator.QbewEr;
        OKCodeInput oKCodeInput = (OKCodeInput) ViewBindings.findChildViewById(view, i);
        if (oKCodeInput != null) {
            i = C8206ayP.StateListAnimator.QVAiDq;
            C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp != null) {
                i = C8206ayP.StateListAnimator.zAEkPU;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C8206ayP.StateListAnimator.DKtBnz;
                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = C8206ayP.StateListAnimator.isReflectionWorking;
                        android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            i = C8206ayP.StateListAnimator.UccSpe;
                            android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView4 != null) {
                                return new C5629aAA((ConstraintLayout) view, oKCodeInput, c52794wYp, textView, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
