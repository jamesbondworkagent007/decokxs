package o;

import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iKn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23820iKn implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.LinearLayout AYXKKw;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final wYK OLrzqt;
    public final android.widget.ImageView copydefault;
    public final android.widget.Space gEmmrt;
    public final NestedScrollView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AYXKKw;
    }

    public C23820iKn(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull wYK wyk, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull android.widget.Space space) {
        this.AYXKKw = linearLayout;
        this.OLrzqt = wyk;
        this.AEQbTJ = imageView;
        this.copydefault = imageView2;
        this.KWHzl = textView;
        this.EZpvd = textView2;
        this.valueOf = nestedScrollView;
        this.gEmmrt = space;
    }

    public static C23820iKn KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return copydefault(layoutInflater, null, false);
    }

    public static C23820iKn copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.hlkKmr, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C23820iKn AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.QVsKAR;
        wYK wyk = (wYK) ViewBindings.findChildViewById(view, i);
        if (wyk != null) {
            i = C25493ixk.ActionBar.DuXjdv;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C25493ixk.ActionBar.GPCHlQ;
                android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = C25493ixk.ActionBar.OWSZPf;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = C25493ixk.ActionBar.QYNZmZ;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = C25493ixk.ActionBar.OVMstZ;
                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                            if (nestedScrollView != null) {
                                i = C25493ixk.ActionBar.dXhJGx;
                                android.widget.Space space = (android.widget.Space) ViewBindings.findChildViewById(view, i);
                                if (space != null) {
                                    return new C23820iKn((android.widget.LinearLayout) view, wyk, imageView, imageView2, textView, textView2, nestedScrollView, space);
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
