package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.reminder.OKReminder;
import o.C8206ayP;

/* JADX INFO: renamed from: o.azj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C8279azj implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final OKReminder AYXKKw;
    public final C52794wYp AhwBna;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final wYC OLrzqt;
    public final C52794wYp copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.LinearLayout gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.gEmmrt;
    }

    public C8279azj(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull wYC wyc, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull C52794wYp c52794wYp2, @androidx.annotation.NonNull OKReminder oKReminder, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5) {
        this.gEmmrt = linearLayout;
        this.copydefault = c52794wYp;
        this.OLrzqt = wyc;
        this.AEQbTJ = textView;
        this.EZpvd = textView2;
        this.KWHzl = textView3;
        this.AhwBna = c52794wYp2;
        this.AYXKKw = oKReminder;
        this.djBIcL = textView4;
        this.valueOf = textView5;
    }

    public static C8279azj copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C8206ayP.StateListAnimator.KWHzl;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C8206ayP.StateListAnimator.ORxRYg;
            wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
            if (wyc != null) {
                i = C8206ayP.StateListAnimator.AxsJAYaxsJAY;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C8206ayP.StateListAnimator.igXuih;
                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = C8206ayP.StateListAnimator.KDccX;
                        android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            i = C8206ayP.StateListAnimator.iPSTqm;
                            C52794wYp c52794wYp2 = (C52794wYp) ViewBindings.findChildViewById(view, i);
                            if (c52794wYp2 != null) {
                                i = C8206ayP.StateListAnimator.swzYdv;
                                OKReminder oKReminder = (OKReminder) ViewBindings.findChildViewById(view, i);
                                if (oKReminder != null) {
                                    i = C8206ayP.StateListAnimator.fXYAwm;
                                    android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView4 != null) {
                                        i = C8206ayP.StateListAnimator.isReflectionWorking;
                                        android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView5 != null) {
                                            return new C8279azj((android.widget.LinearLayout) view, c52794wYp, wyc, textView, textView2, textView3, c52794wYp2, oKReminder, textView4, textView5);
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
