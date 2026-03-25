package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.reminder.OKReminder;
import o.C8206ayP;

/* JADX INFO: renamed from: o.aAy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C5679aAy implements ViewBinding {
    public final C52794wYp AEQbTJ;
    public final ConstraintLayout AYXKKw;
    public final android.widget.LinearLayout AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.widget.TextView DbNXlk;
    public final OKReminder EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.ImageView copydefault;
    public final android.widget.TextView djBIcL;
    public final wYK gEmmrt;
    public final android.widget.LinearLayout valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.valueOf;
    }

    public C5679aAy(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull OKReminder oKReminder, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull wYK wyk, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6) {
        this.valueOf = linearLayout;
        this.AEQbTJ = c52794wYp;
        this.OLrzqt = textView;
        this.copydefault = imageView;
        this.EZpvd = oKReminder;
        this.KWHzl = textView2;
        this.djBIcL = textView3;
        this.AhwBna = linearLayout2;
        this.gEmmrt = wyk;
        this.AYXKKw = constraintLayout;
        this.DbNXlk = textView4;
        this.values = textView5;
        this.AkhnZx = textView6;
    }

    public static C5679aAy OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C8206ayP.StateListAnimator.KWHzl;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C8206ayP.StateListAnimator.AxsJAYsNCnLh;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C8206ayP.StateListAnimator.aUsmxb;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C8206ayP.StateListAnimator.htlTjW;
                    OKReminder oKReminder = (OKReminder) ViewBindings.findChildViewById(view, i);
                    if (oKReminder != null) {
                        i = C8206ayP.StateListAnimator.DCUTEIdCUTEI;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = C8206ayP.StateListAnimator.hCLrkq;
                            android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view;
                                i = C8206ayP.StateListAnimator.RAQtXZ;
                                wYK wyk = (wYK) ViewBindings.findChildViewById(view, i);
                                if (wyk != null) {
                                    i = C8206ayP.StateListAnimator.geLlBI;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout != null) {
                                        i = C8206ayP.StateListAnimator.reset;
                                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView4 != null) {
                                            i = C8206ayP.StateListAnimator.Th;
                                            android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView5 != null) {
                                                i = C8206ayP.StateListAnimator.isReflectionWorking;
                                                android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView6 != null) {
                                                    return new C5679aAy(linearLayout, c52794wYp, textView, imageView, oKReminder, textView2, textView3, linearLayout, wyk, constraintLayout, textView4, textView5, textView6);
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
