package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.edit.OKEditText;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nPf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34041nPf implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final OKEditText EZpvd;
    public final C55113xdn KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final ConstraintLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public C34041nPf(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull OKEditText oKEditText) {
        this.copydefault = constraintLayout;
        this.AEQbTJ = imageView;
        this.KWHzl = c55113xdn;
        this.OLrzqt = linearLayoutCompat;
        this.EZpvd = oKEditText;
    }

    public static C34041nPf KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.gGvvIC;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C35399nuc.StateListAnimator.flVtFt;
            C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
            if (c55113xdn != null) {
                i = C35399nuc.StateListAnimator.RlQdEF;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat != null) {
                    i = C35399nuc.StateListAnimator.hlkKmr;
                    OKEditText oKEditText = (OKEditText) ViewBindings.findChildViewById(view, i);
                    if (oKEditText != null) {
                        return new C34041nPf((ConstraintLayout) view, imageView, c55113xdn, linearLayoutCompat, oKEditText);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
