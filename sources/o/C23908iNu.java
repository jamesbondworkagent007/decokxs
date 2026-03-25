package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iNu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23908iNu implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final C55258xgZ AhwBna;
    public final android.widget.ImageView EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final android.widget.ImageView copydefault;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.OLrzqt;
    }

    public C23908iNu(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout3, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull C55258xgZ c55258xgZ) {
        this.OLrzqt = linearLayout;
        this.AEQbTJ = linearLayout2;
        this.EZpvd = imageView;
        this.copydefault = imageView2;
        this.KWHzl = linearLayout3;
        this.gEmmrt = textView;
        this.valueOf = textView2;
        this.AhwBna = c55258xgZ;
    }

    public static C23908iNu OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.init, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C23908iNu EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.RbVjfb;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C25493ixk.ActionBar.v;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C25493ixk.ActionBar.aeJQwa;
                android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = C25493ixk.ActionBar.QhsCdE;
                    android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout2 != null) {
                        i = C25493ixk.ActionBar.openFileOutput;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = C25493ixk.ActionBar.sendSocketRequest;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = C25493ixk.ActionBar.getDefaultCipherSuites;
                                C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                                if (c55258xgZ != null) {
                                    return new C23908iNu((android.widget.LinearLayout) view, linearLayout, imageView, imageView2, linearLayout2, textView, textView2, c55258xgZ);
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
