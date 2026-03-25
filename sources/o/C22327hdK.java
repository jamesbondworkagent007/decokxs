package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C22366hdx;

/* JADX INFO: renamed from: o.hdK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C22327hdK implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final ConstraintLayout EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.widget.ImageView copydefault;
    public final android.widget.ImageView djBIcL;
    public final android.widget.LinearLayout gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.gEmmrt;
    }

    public C22327hdK(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.ImageView imageView3, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.ImageView imageView4, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3) {
        this.gEmmrt = linearLayout;
        this.OLrzqt = imageView;
        this.EZpvd = constraintLayout;
        this.copydefault = imageView2;
        this.KWHzl = imageView3;
        this.AEQbTJ = frameLayout;
        this.djBIcL = imageView4;
        this.AYXKKw = textView;
        this.AhwBna = textView2;
        this.valueOf = textView3;
    }

    public static C22327hdK EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C22366hdx.Activity.isConnected, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C22327hdK copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C22366hdx.ActionBar.DbNXlk;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C22366hdx.ActionBar.fARcdN;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = C22366hdx.ActionBar.QfsBiF;
                android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = C22366hdx.ActionBar.QUSxYX;
                    android.widget.ImageView imageView3 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView3 != null) {
                        i = C22366hdx.ActionBar.DCUTEI;
                        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout != null) {
                            i = C22366hdx.ActionBar.igXuih;
                            android.widget.ImageView imageView4 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView4 != null) {
                                i = C22366hdx.ActionBar.ixgjPv;
                                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    i = C22366hdx.ActionBar.zKcAg;
                                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        i = C22366hdx.ActionBar.zDUObI;
                                        android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView3 != null) {
                                            return new C22327hdK((android.widget.LinearLayout) view, imageView, constraintLayout, imageView2, imageView3, frameLayout, imageView4, textView, textView2, textView3);
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
