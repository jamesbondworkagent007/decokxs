package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iIc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C23755iIc implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.LinearLayout AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.ImageView EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final ConstraintLayout copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.KWHzl;
    }

    public C23755iIc(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2) {
        this.KWHzl = linearLayout;
        this.EZpvd = imageView;
        this.copydefault = constraintLayout;
        this.OLrzqt = linearLayoutCompat;
        this.AEQbTJ = textView;
        this.gEmmrt = textView2;
        this.valueOf = textView3;
        this.AhwBna = textView4;
        this.djBIcL = textView5;
        this.AYXKKw = linearLayout2;
    }

    public static C23755iIc OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.finit, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C23755iIc KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.Dfv;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C25493ixk.ActionBar.apHBvG;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = C25493ixk.ActionBar.OFQuKP;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat != null) {
                    i = C25493ixk.ActionBar.MediaBrowserCompatItemReceiver;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = C25493ixk.ActionBar.MediaBrowserCompatMediaBrowserImplApi213;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = C25493ixk.ActionBar.MediaBrowserCompatMediaBrowserImplApi216;
                            android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                i = C25493ixk.ActionBar.sendRequest;
                                android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView4 != null) {
                                    i = C25493ixk.ActionBar.RbMRq;
                                    android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView5 != null) {
                                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view;
                                        return new C23755iIc(linearLayout, imageView, constraintLayout, linearLayoutCompat, textView, textView2, textView3, textView4, textView5, linearLayout);
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
