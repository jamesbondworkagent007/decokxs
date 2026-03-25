package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C22366hdx;

/* JADX INFO: renamed from: o.hdy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C22367hdy implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final AppCompatImageView EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final C57591ylM gEmmrt;
    public final android.widget.LinearLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.valueOf;
    }

    public C22367hdy(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout3, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull C57591ylM c57591ylM) {
        this.valueOf = linearLayout;
        this.AEQbTJ = textView;
        this.KWHzl = frameLayout;
        this.EZpvd = appCompatImageView;
        this.OLrzqt = linearLayout2;
        this.copydefault = linearLayout3;
        this.AhwBna = textView2;
        this.gEmmrt = c57591ylM;
    }

    public static C22367hdy copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return copydefault(layoutInflater, null, false);
    }

    public static C22367hdy copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C22366hdx.Activity.OLrzqt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C22367hdy KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C22366hdx.ActionBar.gEmmrt;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C22366hdx.ActionBar.AuCTelauCTel;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = C22366hdx.ActionBar.RJOkX;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = C22366hdx.ActionBar.flVtFt;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) view;
                        i = C22366hdx.ActionBar.hBpjJd;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = C22366hdx.ActionBar.QSLkRj;
                            C57591ylM c57591ylM = (C57591ylM) ViewBindings.findChildViewById(view, i);
                            if (c57591ylM != null) {
                                return new C22367hdy(linearLayout2, textView, frameLayout, appCompatImageView, linearLayout, linearLayout2, textView2, c57591ylM);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
