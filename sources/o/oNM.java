package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: loaded from: classes23.dex */
public final class oNM implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final RecyclerView AYXKKw;
    public final C55113xdn AhwBna;
    public final C32240mUr EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final C55173xeu OLrzqt;
    public final C55173xeu copydefault;
    public final android.widget.LinearLayout djBIcL;
    public final android.widget.TextView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.djBIcL;
    }

    public oNM(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55173xeu c55173xeu2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C32240mUr c32240mUr, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.djBIcL = linearLayout;
        this.OLrzqt = c55173xeu;
        this.copydefault = c55173xeu2;
        this.AEQbTJ = textView;
        this.EZpvd = c32240mUr;
        this.KWHzl = linearLayout2;
        this.AhwBna = c55113xdn;
        this.AYXKKw = recyclerView;
        this.gEmmrt = textView2;
    }

    public static oNM copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.QXDzTk, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static oNM OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.invokespecialRtjmuc;
        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
        if (c55173xeu != null) {
            i = C35964oKf.StateListAnimator.invokespecialhlXVux;
            C55173xeu c55173xeu2 = (C55173xeu) ViewBindings.findChildViewById(view, i);
            if (c55173xeu2 != null) {
                i = C35964oKf.StateListAnimator.ibnZAm;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C35964oKf.StateListAnimator.QSAYLr;
                    C32240mUr c32240mUr = (C32240mUr) ViewBindings.findChildViewById(view, i);
                    if (c32240mUr != null) {
                        i = C35964oKf.StateListAnimator.QOeQqh;
                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = C35964oKf.StateListAnimator.OhcwxsRkSIEV;
                            C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                            if (c55113xdn != null) {
                                i = C35964oKf.StateListAnimator.onExtraCallback;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView != null) {
                                    i = C35964oKf.StateListAnimator.getPercentRating;
                                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        return new oNM((android.widget.LinearLayout) view, c55173xeu, c55173xeu2, textView, c32240mUr, linearLayout, c55113xdn, recyclerView, textView2);
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
