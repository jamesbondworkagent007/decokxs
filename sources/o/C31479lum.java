package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lum, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31479lum implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final wYC AYXKKw;
    public final RecyclerView EZpvd;
    public final RecyclerView KWHzl;
    public final ConstraintLayout OLrzqt;
    public final android.widget.TextView copydefault;
    public final RecyclerView gEmmrt;
    public final CoordinatorLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.valueOf;
    }

    public C31479lum(@androidx.annotation.NonNull CoordinatorLayout coordinatorLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull RecyclerView recyclerView2, @androidx.annotation.NonNull wYC wyc, @androidx.annotation.NonNull RecyclerView recyclerView3) {
        this.valueOf = coordinatorLayout;
        this.OLrzqt = constraintLayout;
        this.copydefault = textView;
        this.KWHzl = recyclerView;
        this.AEQbTJ = textView2;
        this.EZpvd = recyclerView2;
        this.AYXKKw = wyc;
        this.gEmmrt = recyclerView3;
    }

    public static C31479lum EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C31351lsQ.Application.DWgRXt;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C31351lsQ.Application.heceqZ;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C31351lsQ.Application.DGOPHZDGOPHZ;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C31351lsQ.Application.DBxZfM;
                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = C31351lsQ.Application.DQzvGN;
                        RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView2 != null) {
                            i = C31351lsQ.Application.iHkeWl;
                            wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
                            if (wyc != null) {
                                i = C31351lsQ.Application.QnnRaN;
                                RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView3 != null) {
                                    return new C31479lum((CoordinatorLayout) view, constraintLayout, textView, recyclerView, textView2, recyclerView2, wyc, recyclerView3);
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
