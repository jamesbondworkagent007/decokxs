package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oMt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36032oMt implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.ImageView AYXKKw;
    public final android.widget.ImageView AhwBna;
    public final android.widget.LinearLayout DbNXlk;
    public final RecyclerView EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;
    public final C55173xeu djBIcL;
    public final C55173xeu gEmmrt;
    public final android.widget.LinearLayout valueOf;
    public final android.widget.LinearLayout values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.DbNXlk;
    }

    public C36032oMt(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55173xeu c55173xeu2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout3) {
        this.DbNXlk = linearLayout;
        this.EZpvd = recyclerView;
        this.AEQbTJ = textView;
        this.KWHzl = textView2;
        this.copydefault = textView3;
        this.OLrzqt = textView4;
        this.gEmmrt = c55173xeu;
        this.djBIcL = c55173xeu2;
        this.AhwBna = imageView;
        this.AYXKKw = imageView2;
        this.valueOf = linearLayout2;
        this.values = linearLayout3;
    }

    public static C36032oMt EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.QSBOWP;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C35964oKf.StateListAnimator.RdAHlO;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C35964oKf.StateListAnimator.hBpjJd;
                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = C35964oKf.StateListAnimator.gwTjWJ;
                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = C35964oKf.StateListAnimator.dHguZz;
                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView4 != null) {
                            i = C35964oKf.StateListAnimator.invokespecialaKhcqp;
                            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                            if (c55173xeu != null) {
                                i = C35964oKf.StateListAnimator.invokespecialRuDPQV;
                                C55173xeu c55173xeu2 = (C55173xeu) ViewBindings.findChildViewById(view, i);
                                if (c55173xeu2 != null) {
                                    i = C35964oKf.StateListAnimator.siEkQe;
                                    android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView != null) {
                                        i = C35964oKf.StateListAnimator.registerUser;
                                        android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView2 != null) {
                                            i = C35964oKf.StateListAnimator.profile;
                                            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout != null) {
                                                i = C35964oKf.StateListAnimator.HJWChPdIKEqB;
                                                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout2 != null) {
                                                    return new C36032oMt((android.widget.LinearLayout) view, recyclerView, textView, textView2, textView3, textView4, c55173xeu, c55173xeu2, imageView, imageView2, linearLayout, linearLayout2);
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
