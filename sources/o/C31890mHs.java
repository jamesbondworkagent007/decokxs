package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.mDC;

/* JADX INFO: renamed from: o.mHs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C31890mHs implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final android.widget.ImageView AhwBna;
    public final android.widget.RelativeLayout EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.widget.ImageView copydefault;
    public final ConstraintLayout gEmmrt;
    public final android.widget.ImageView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AEQbTJ;
    }

    public C31890mHs(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout, @androidx.annotation.NonNull android.widget.ImageView imageView3, @androidx.annotation.NonNull android.widget.ImageView imageView4, @androidx.annotation.NonNull ConstraintLayout constraintLayout2) {
        this.AEQbTJ = constraintLayout;
        this.copydefault = imageView;
        this.OLrzqt = imageView2;
        this.KWHzl = textView;
        this.EZpvd = relativeLayout;
        this.AhwBna = imageView3;
        this.valueOf = imageView4;
        this.gEmmrt = constraintLayout2;
    }

    public static C31890mHs EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(mDC.TaskDescription.RcXXUw, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C31890mHs AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = mDC.ActionBar.RcXXUw;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = mDC.ActionBar.gkJEwt;
            android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = mDC.ActionBar.iRxXKY;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = mDC.ActionBar.AxsJAYaxsJAY;
                    android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout != null) {
                        i = mDC.ActionBar.RVsVBY;
                        android.widget.ImageView imageView3 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView3 != null) {
                            i = mDC.ActionBar.hlkKmr;
                            android.widget.ImageView imageView4 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView4 != null) {
                                i = mDC.ActionBar.gmHjFq;
                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                if (constraintLayout != null) {
                                    return new C31890mHs((ConstraintLayout) view, imageView, imageView2, textView, relativeLayout, imageView3, imageView4, constraintLayout);
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
