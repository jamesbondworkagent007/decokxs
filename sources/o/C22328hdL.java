package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C22366hdx;

/* JADX INFO: renamed from: o.hdL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C22328hdL implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final C55239xgG AhwBna;
    public final ConstraintLayout EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.view.View djBIcL;
    public final C55109xdj gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C55109xdj getRoot() {
        return this.gEmmrt;
    }

    public C22328hdL(@androidx.annotation.NonNull C55109xdj c55109xdj, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C55239xgG c55239xgG, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3) {
        this.gEmmrt = c55109xdj;
        this.EZpvd = constraintLayout;
        this.copydefault = textView;
        this.AEQbTJ = imageView;
        this.KWHzl = imageView2;
        this.OLrzqt = linearLayout;
        this.djBIcL = view;
        this.AhwBna = c55239xgG;
        this.AYXKKw = textView2;
        this.valueOf = textView3;
    }

    public static C22328hdL AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C22366hdx.Activity.values, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C22328hdL copydefault(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C22366hdx.ActionBar.fIwbmz;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C22366hdx.ActionBar.wlaJM;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C22366hdx.ActionBar.ORxRYg;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C22366hdx.ActionBar.UeEOUB;
                    android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = C22366hdx.ActionBar.gasjUx;
                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C22366hdx.ActionBar.QSBOWP))) != null) {
                            i = C22366hdx.ActionBar.QwvEab;
                            C55239xgG c55239xgG = (C55239xgG) ViewBindings.findChildViewById(view, i);
                            if (c55239xgG != null) {
                                i = C22366hdx.ActionBar.DCUTEIdCUTEI;
                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = C22366hdx.ActionBar.Dmq;
                                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        return new C22328hdL((C55109xdj) view, constraintLayout, textView, imageView, imageView2, linearLayout, viewFindChildViewById, c55239xgG, textView2, textView3);
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
