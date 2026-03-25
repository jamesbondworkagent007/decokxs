package o;

import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rah, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42665rah implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.ImageView KWHzl;
    public final C40499qYc OLrzqt;
    public final C52794wYp copydefault;
    public final NestedScrollView djBIcL;
    public final C33542myS valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C40499qYc getRoot() {
        return this.OLrzqt;
    }

    public C42665rah(@androidx.annotation.NonNull C40499qYc c40499qYc, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull C33542myS c33542myS) {
        this.OLrzqt = c40499qYc;
        this.copydefault = c52794wYp;
        this.KWHzl = imageView;
        this.AEQbTJ = imageView2;
        this.EZpvd = linearLayout;
        this.djBIcL = nestedScrollView;
        this.valueOf = c33542myS;
    }

    public static C42665rah EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.QbewEr, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C42665rah KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.QKudOq;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = qZH.StateListAnimator.DfrfUJ;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = qZH.StateListAnimator.QFTsTN;
                android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = qZH.StateListAnimator.OAhWiU;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = qZH.StateListAnimator.icKaHr;
                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                        if (nestedScrollView != null) {
                            i = qZH.StateListAnimator.writeToParcel;
                            C33542myS c33542myS = (C33542myS) ViewBindings.findChildViewById(view, i);
                            if (c33542myS != null) {
                                return new C42665rah((C40499qYc) view, c52794wYp, imageView, imageView2, linearLayout, nestedScrollView, c33542myS);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
