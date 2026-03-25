package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: loaded from: classes15.dex */
public final class iMP implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.ImageView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.ImageView EZpvd;
    public final ConstraintLayout KWHzl;
    public final C27212jqt OLrzqt;
    public final android.widget.ImageView copydefault;
    public final C27212jqt djBIcL;
    public final LinearLayoutCompat gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.KWHzl;
    }

    public iMP(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull C27212jqt c27212jqt, @androidx.annotation.NonNull android.widget.ImageView imageView3, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C27212jqt c27212jqt2, @androidx.annotation.NonNull android.widget.ImageView imageView4, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.KWHzl = constraintLayout;
        this.EZpvd = imageView;
        this.AEQbTJ = imageView2;
        this.OLrzqt = c27212jqt;
        this.copydefault = imageView3;
        this.gEmmrt = linearLayoutCompat;
        this.djBIcL = c27212jqt2;
        this.AYXKKw = imageView4;
        this.AhwBna = textView;
        this.valueOf = textView2;
    }

    public static iMP AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.invokespecialaVhqwO, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static iMP KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.UscePu;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C25493ixk.ActionBar.getSessionID;
            android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = C25493ixk.ActionBar.hdpuIA;
                C27212jqt c27212jqt = (C27212jqt) ViewBindings.findChildViewById(view, i);
                if (c27212jqt != null) {
                    i = C25493ixk.ActionBar.getSerial;
                    android.widget.ImageView imageView3 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView3 != null) {
                        i = C25493ixk.ActionBar.OqhRBMiKdSzF;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                        if (linearLayoutCompat != null) {
                            i = C25493ixk.ActionBar.dTTfOR;
                            C27212jqt c27212jqt2 = (C27212jqt) ViewBindings.findChildViewById(view, i);
                            if (c27212jqt2 != null) {
                                i = C25493ixk.ActionBar.QqiRNA;
                                android.widget.ImageView imageView4 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView4 != null) {
                                    i = C25493ixk.ActionBar.MediaBrowserCompatMediaBrowserImplBase3;
                                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null) {
                                        i = C25493ixk.ActionBar.postOrRun;
                                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView2 != null) {
                                            return new iMP((ConstraintLayout) view, imageView, imageView2, c27212jqt, imageView3, linearLayoutCompat, c27212jqt2, imageView4, textView, textView2);
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
