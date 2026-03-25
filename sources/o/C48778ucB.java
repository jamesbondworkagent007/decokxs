package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48824ucv;

/* JADX INFO: renamed from: o.ucB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48778ucB implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.view.View AhwBna;
    public final ConstraintLayout EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final android.widget.ImageView copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView valueOf;
    public final android.view.View values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.OLrzqt;
    }

    public C48778ucB(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.view.View view2) {
        this.OLrzqt = linearLayout;
        this.EZpvd = constraintLayout;
        this.KWHzl = imageView;
        this.copydefault = imageView2;
        this.AEQbTJ = constraintLayout2;
        this.gEmmrt = textView;
        this.AYXKKw = textView2;
        this.djBIcL = textView3;
        this.valueOf = textView4;
        this.AhwBna = view;
        this.values = view2;
    }

    public static C48778ucB OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        int i = C48824ucv.ActionBar.AEQbTJ;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C48824ucv.ActionBar.KWHzl;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C48824ucv.ActionBar.OLrzqt;
                android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = C48824ucv.ActionBar.EZpvd;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout2 != null) {
                        i = C48824ucv.ActionBar.copydefault;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = C48824ucv.ActionBar.djBIcL;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = C48824ucv.ActionBar.AYXKKw;
                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    i = C48824ucv.ActionBar.valueOf;
                                    android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView4 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C48824ucv.ActionBar.AhwBna))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C48824ucv.ActionBar.gEmmrt))) != null) {
                                        return new C48778ucB((android.widget.LinearLayout) view, constraintLayout, imageView, imageView2, constraintLayout2, textView, textView2, textView3, textView4, viewFindChildViewById, viewFindChildViewById2);
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
