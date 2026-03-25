package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rci, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42772rci implements ViewBinding {
    public final C52794wYp AEQbTJ;
    public final C55230xfy AhwBna;
    public final C55113xdn EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final qXN OLrzqt;
    public final android.widget.Space copydefault;
    public final android.widget.TextView djBIcL;
    public final C40499qYc valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C40499qYc getRoot() {
        return this.valueOf;
    }

    public C42772rci(@androidx.annotation.NonNull C40499qYc c40499qYc, @androidx.annotation.NonNull android.widget.Space space, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull qXN qxn, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C55230xfy c55230xfy, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.valueOf = c40499qYc;
        this.copydefault = space;
        this.AEQbTJ = c52794wYp;
        this.KWHzl = frameLayout;
        this.OLrzqt = qxn;
        this.EZpvd = c55113xdn;
        this.AhwBna = c55230xfy;
        this.djBIcL = textView;
    }

    public static C42772rci KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.djBIcL;
        android.widget.Space space = (android.widget.Space) ViewBindings.findChildViewById(view, i);
        if (space != null) {
            i = qZH.StateListAnimator.RXzakW;
            C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp != null) {
                i = qZH.StateListAnimator.akftKQ;
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = qZH.StateListAnimator.dzkkkq;
                    qXN qxn = (qXN) ViewBindings.findChildViewById(view, i);
                    if (qxn != null) {
                        i = qZH.StateListAnimator.pXZxY;
                        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                        if (c55113xdn != null) {
                            i = qZH.StateListAnimator.QzqeNH;
                            C55230xfy c55230xfy = (C55230xfy) ViewBindings.findChildViewById(view, i);
                            if (c55230xfy != null) {
                                i = qZH.StateListAnimator.onServiceDisconnected;
                                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    return new C42772rci((C40499qYc) view, space, c52794wYp, frameLayout, qxn, c55113xdn, c55230xfy, textView);
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
