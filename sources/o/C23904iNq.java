package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iNq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C23904iNq implements ViewBinding {
    public final C27308jsj AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final C55033xcM EZpvd;
    public final android.widget.TextView KWHzl;
    public final ConstraintLayout OLrzqt;
    public final LinearLayoutCompat copydefault;
    public final NestedScrollView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public C23904iNq(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C55033xcM c55033xcM, @androidx.annotation.NonNull C27308jsj c27308jsj, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.OLrzqt = constraintLayout;
        this.KWHzl = textView;
        this.EZpvd = c55033xcM;
        this.AEQbTJ = c27308jsj;
        this.copydefault = linearLayoutCompat;
        this.valueOf = nestedScrollView;
        this.AYXKKw = textView2;
    }

    public static C23904iNq EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.dzkkkq, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C23904iNq copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.DcMfJKfNLfdT;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C25493ixk.ActionBar.gkZNMa;
            C55033xcM c55033xcM = (C55033xcM) ViewBindings.findChildViewById(view, i);
            if (c55033xcM != null) {
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
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                return new C23904iNq((ConstraintLayout) view, textView, c55033xcM, c27308jsj, linearLayoutCompat, nestedScrollView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
