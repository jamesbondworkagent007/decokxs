package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48931uew;

/* JADX INFO: renamed from: o.ugd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49018ugd implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final C55113xdn EZpvd;
    public final ConstraintLayout KWHzl;
    public final C55064xcr OLrzqt;
    public final android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.KWHzl;
    }

    public C49018ugd(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55064xcr c55064xcr, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.KWHzl = constraintLayout;
        this.OLrzqt = c55064xcr;
        this.AEQbTJ = constraintLayout2;
        this.EZpvd = c55113xdn;
        this.copydefault = textView;
    }

    public static C49018ugd AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C48931uew.StateListAnimator.UeEOUB;
        C55064xcr c55064xcr = (C55064xcr) ViewBindings.findChildViewById(view, i);
        if (c55064xcr != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = C48931uew.StateListAnimator.fFgQHt;
            C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
            if (c55113xdn != null) {
                i = C48931uew.StateListAnimator.accept;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new C49018ugd(constraintLayout, c55064xcr, constraintLayout, c55113xdn, textView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
