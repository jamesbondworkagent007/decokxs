package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C8206ayP;

/* JADX INFO: renamed from: o.azk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C8280azk implements ViewBinding {
    public final wYC AEQbTJ;
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.ImageView OLrzqt;
    public final C52794wYp copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.EZpvd;
    }

    public C8280azk(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull wYC wyc, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull C52794wYp c52794wYp) {
        this.EZpvd = linearLayout;
        this.AEQbTJ = wyc;
        this.OLrzqt = imageView;
        this.copydefault = c52794wYp;
    }

    public static C8280azk KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C8206ayP.StateListAnimator.DbNXlk;
        wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
        if (wyc != null) {
            i = C8206ayP.StateListAnimator.finit;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C8206ayP.StateListAnimator.zOIQXb;
                C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                if (c52794wYp != null) {
                    return new C8280azk((android.widget.LinearLayout) view, wyc, imageView, c52794wYp);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
