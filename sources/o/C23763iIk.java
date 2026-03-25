package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iIk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23763iIk implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final ConstraintLayout OLrzqt;
    public final C27127jpN copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.EZpvd;
    }

    public C23763iIk(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C27127jpN c27127jpN, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout3, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4) {
        this.EZpvd = linearLayout;
        this.copydefault = c27127jpN;
        this.AEQbTJ = linearLayout2;
        this.KWHzl = linearLayout3;
        this.OLrzqt = constraintLayout;
        this.AhwBna = textView;
        this.AYXKKw = textView2;
        this.djBIcL = textView3;
        this.gEmmrt = textView4;
    }

    public static C23763iIk KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.gkJEwt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C23763iIk copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.init;
        C27127jpN c27127jpN = (C27127jpN) ViewBindings.findChildViewById(view, i);
        if (c27127jpN != null) {
            i = C25493ixk.ActionBar.fDu;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C25493ixk.ActionBar.HJWChPOZOJIj;
                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout2 != null) {
                    i = C25493ixk.ActionBar.gISBfG;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = C25493ixk.ActionBar.dbAction;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = C25493ixk.ActionBar.DhEJvI;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = C25493ixk.ActionBar.dxTXDv;
                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    i = C25493ixk.ActionBar.GVpNrs;
                                    android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView4 != null) {
                                        return new C23763iIk((android.widget.LinearLayout) view, c27127jpN, linearLayout, linearLayout2, constraintLayout, textView, textView2, textView3, textView4);
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
