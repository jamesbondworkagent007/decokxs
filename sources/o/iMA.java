package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: loaded from: classes15.dex */
public final class iMA implements ViewBinding {
    public final C27212jqt AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final C27212jqt AhwBna;
    public final android.widget.ImageView EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.widget.ImageView copydefault;
    public final LinearLayoutCompat djBIcL;
    public final ConstraintLayout gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.gEmmrt;
    }

    public iMA(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.ImageView imageView3, @androidx.annotation.NonNull android.widget.ImageView imageView4, @androidx.annotation.NonNull C27212jqt c27212jqt, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C27212jqt c27212jqt2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.gEmmrt = constraintLayout;
        this.KWHzl = imageView;
        this.OLrzqt = imageView2;
        this.EZpvd = imageView3;
        this.copydefault = imageView4;
        this.AEQbTJ = c27212jqt;
        this.djBIcL = linearLayoutCompat;
        this.AhwBna = c27212jqt2;
        this.valueOf = textView;
        this.AYXKKw = textView2;
    }

    public static iMA AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.iHkeWl, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static iMA EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.UscePu;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C25493ixk.ActionBar.invokespecialODCBUN;
            android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = C25493ixk.ActionBar.getSessionID;
                android.widget.ImageView imageView3 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView3 != null) {
                    i = C25493ixk.ActionBar.getSerial;
                    android.widget.ImageView imageView4 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView4 != null) {
                        i = C25493ixk.ActionBar.ardYFU;
                        C27212jqt c27212jqt = (C27212jqt) ViewBindings.findChildViewById(view, i);
                        if (c27212jqt != null) {
                            i = C25493ixk.ActionBar.OqhRBMiKdSzF;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat != null) {
                                i = C25493ixk.ActionBar.dTTfOR;
                                C27212jqt c27212jqt2 = (C27212jqt) ViewBindings.findChildViewById(view, i);
                                if (c27212jqt2 != null) {
                                    i = C25493ixk.ActionBar.MediaBrowserCompatMediaBrowserImplBase3;
                                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null) {
                                        i = C25493ixk.ActionBar.postOrRun;
                                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView2 != null) {
                                            return new iMA((ConstraintLayout) view, imageView, imageView2, imageView3, imageView4, c27212jqt, linearLayoutCompat, c27212jqt2, textView, textView2);
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
