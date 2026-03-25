package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iNh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C23895iNh implements ViewBinding {
    public final C27349jtX AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final C27349jtX EZpvd;
    public final NestedScrollView KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final ConstraintLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public C23895iNh(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C27349jtX c27349jtX, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull C27349jtX c27349jtX2, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.copydefault = constraintLayout;
        this.AEQbTJ = c27349jtX;
        this.OLrzqt = linearLayoutCompat;
        this.KWHzl = nestedScrollView;
        this.EZpvd = c27349jtX2;
        this.AYXKKw = textView;
    }

    public static C23895iNh copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.dPnHjp, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C23895iNh OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.RZNAhV;
        C27349jtX c27349jtX = (C27349jtX) ViewBindings.findChildViewById(view, i);
        if (c27349jtX != null) {
            i = C25493ixk.ActionBar.QMuEJi;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat != null) {
                i = C25493ixk.ActionBar.ikIEnW;
                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                if (nestedScrollView != null) {
                    i = C25493ixk.ActionBar.addPreRequisiteCollector;
                    C27349jtX c27349jtX2 = (C27349jtX) ViewBindings.findChildViewById(view, i);
                    if (c27349jtX2 != null) {
                        i = C25493ixk.ActionBar.hkDICb;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            return new C23895iNh((ConstraintLayout) view, c27349jtX, linearLayoutCompat, nestedScrollView, c27349jtX2, textView);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
