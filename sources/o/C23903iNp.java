package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iNp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C23903iNp implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final NestedScrollView EZpvd;
    public final C57461yip KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final C27308jsj copydefault;
    public final android.widget.TextView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AEQbTJ;
    }

    public C23903iNp(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C57461yip c57461yip, @androidx.annotation.NonNull C27308jsj c27308jsj, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.AEQbTJ = constraintLayout;
        this.KWHzl = c57461yip;
        this.copydefault = c27308jsj;
        this.OLrzqt = linearLayoutCompat;
        this.EZpvd = nestedScrollView;
        this.gEmmrt = textView;
    }

    public static C23903iNp EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.deregisterUser, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C23903iNp OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.gkZNMa;
        C57461yip c57461yip = (C57461yip) ViewBindings.findChildViewById(view, i);
        if (c57461yip != null) {
            i = C25493ixk.ActionBar.DztXDE;
            C27308jsj c27308jsj = (C27308jsj) ViewBindings.findChildViewById(view, i);
            if (c27308jsj != null) {
                i = C25493ixk.ActionBar.getLocation;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat != null) {
                    i = C25493ixk.ActionBar.SFHvfS;
                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                    if (nestedScrollView != null) {
                        i = C25493ixk.ActionBar.notifyNotificationWithChannel;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            return new C23903iNp((ConstraintLayout) view, c57461yip, c27308jsj, linearLayoutCompat, nestedScrollView, textView);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
