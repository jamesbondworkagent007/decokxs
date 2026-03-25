package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hGg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21624hGg implements ViewBinding {
    public final C31222lpu AEQbTJ;
    public final ConstraintLayout AYXKKw;
    public final ConstraintLayout AhwBna;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.ImageView djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AhwBna;
    }

    public C21624hGg(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C31222lpu c31222lpu, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.ImageView imageView) {
        this.AhwBna = constraintLayout;
        this.AEQbTJ = c31222lpu;
        this.OLrzqt = textView;
        this.copydefault = textView2;
        this.EZpvd = textView3;
        this.KWHzl = textView4;
        this.AYXKKw = constraintLayout2;
        this.djBIcL = imageView;
    }

    public static C21624hGg KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, null, false);
    }

    public static C21624hGg OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.iWlNch, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C21624hGg copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.aVhqwO;
        C31222lpu c31222lpu = (C31222lpu) ViewBindings.findChildViewById(view, i);
        if (c31222lpu != null) {
            i = C23274hvD.Application.FQNKFG;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C23274hvD.Application.v;
                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = C23274hvD.Application.fromCustomAction;
                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = C23274hvD.Application.getCustomAction;
                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView4 != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            i = C23274hvD.Application.hasEnabledCallbacks;
                            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                return new C21624hGg(constraintLayout, c31222lpu, textView, textView2, textView3, textView4, constraintLayout, imageView);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
