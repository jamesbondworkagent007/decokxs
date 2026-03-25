package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.auth.impl.widget.SimpleToolBar;
import o.C8206ayP;

/* JADX INFO: renamed from: o.aAj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C5664aAj implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView AkhnZx;
    public final ConstraintLayout EZpvd;
    public final C52794wYp KWHzl;
    public final ConstraintLayout OLrzqt;
    public final SimpleToolBar copydefault;
    public final ConstraintLayout djBIcL;
    public final android.widget.TextView fetchVPNInfo;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView isConnected;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public C5664aAj(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull SimpleToolBar simpleToolBar, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull ConstraintLayout constraintLayout3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull android.widget.TextView textView7) {
        this.EZpvd = constraintLayout;
        this.copydefault = simpleToolBar;
        this.AEQbTJ = linearLayout;
        this.KWHzl = c52794wYp;
        this.OLrzqt = constraintLayout2;
        this.valueOf = textView;
        this.AhwBna = textView2;
        this.AYXKKw = textView3;
        this.djBIcL = constraintLayout3;
        this.gEmmrt = textView4;
        this.isConnected = textView5;
        this.AkhnZx = textView6;
        this.fetchVPNInfo = textView7;
    }

    public static C5664aAj copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C8206ayP.StateListAnimator.AEQbTJ;
        SimpleToolBar simpleToolBar = (SimpleToolBar) ViewBindings.findChildViewById(view, i);
        if (simpleToolBar != null) {
            i = C8206ayP.StateListAnimator.iZzfmt;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C8206ayP.StateListAnimator.DarRvM;
                C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                if (c52794wYp != null) {
                    i = C8206ayP.StateListAnimator.QfJbVf;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = C8206ayP.StateListAnimator.dzCpvv;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = C8206ayP.StateListAnimator.gwwfep;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = C8206ayP.StateListAnimator.zzQwtT;
                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    i = C8206ayP.StateListAnimator.hrjNmC;
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout2 != null) {
                                        i = C8206ayP.StateListAnimator.gtdfxv;
                                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView4 != null) {
                                            i = C8206ayP.StateListAnimator.cBPFI;
                                            android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView5 != null) {
                                                i = C8206ayP.StateListAnimator.DLGVGj;
                                                android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView6 != null) {
                                                    i = C8206ayP.StateListAnimator.isReflectionWorking;
                                                    android.widget.TextView textView7 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView7 != null) {
                                                        return new C5664aAj((ConstraintLayout) view, simpleToolBar, linearLayout, c52794wYp, constraintLayout, textView, textView2, textView3, constraintLayout2, textView4, textView5, textView6, textView7);
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
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
