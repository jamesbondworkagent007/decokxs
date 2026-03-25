package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iIi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23761iIi implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final ConstraintLayout EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final C27212jqt OLrzqt;
    public final C27127jpN copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public C23761iIi(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C27127jpN c27127jpN, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C27212jqt c27212jqt, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4) {
        this.EZpvd = constraintLayout;
        this.copydefault = c27127jpN;
        this.AEQbTJ = linearLayout;
        this.OLrzqt = c27212jqt;
        this.KWHzl = linearLayout2;
        this.gEmmrt = textView;
        this.AhwBna = textView2;
        this.AYXKKw = textView3;
        this.djBIcL = textView4;
    }

    public static C23761iIi EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.giSNqX, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C23761iIi AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.init;
        C27127jpN c27127jpN = (C27127jpN) ViewBindings.findChildViewById(view, i);
        if (c27127jpN != null) {
            i = C25493ixk.ActionBar.fDu;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C25493ixk.ActionBar.fhwtiV;
                C27212jqt c27212jqt = (C27212jqt) ViewBindings.findChildViewById(view, i);
                if (c27212jqt != null) {
                    i = C25493ixk.ActionBar.gISBfG;
                    android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout2 != null) {
                        i = C25493ixk.ActionBar.iFnJKK;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = C25493ixk.ActionBar.GVpNrs;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = C25493ixk.ActionBar.MediaBrowserCompatMediaBrowserImplBase2;
                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    i = C25493ixk.ActionBar.getIconUri;
                                    android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView4 != null) {
                                        return new C23761iIi((ConstraintLayout) view, c27127jpN, linearLayout, c27212jqt, linearLayout2, textView, textView2, textView3, textView4);
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
