package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hGd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21621hGd implements ViewBinding {
    public final RecyclerView AEQbTJ;
    public final C52794wYp AYXKKw;
    public final ConstraintLayout EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final RecyclerView copydefault;
    public final NestedScrollView djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public C21621hGd(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull RecyclerView recyclerView2, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull NestedScrollView nestedScrollView) {
        this.EZpvd = constraintLayout;
        this.OLrzqt = textView;
        this.KWHzl = textView2;
        this.AEQbTJ = recyclerView;
        this.copydefault = recyclerView2;
        this.AYXKKw = c52794wYp;
        this.djBIcL = nestedScrollView;
    }

    public static C21621hGd KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.QOjuYg, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C21621hGd AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.seuMaA;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C23274hvD.Application.ActivityViewModelLazyKtviewModelsfactoryPromise1;
            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = C23274hvD.Application.r8lambdaKrBLxNpMJdSxVU3Lsj65hn0UyA;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C23274hvD.Application.fullyDrawnReported;
                    RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView2 != null) {
                        i = C23274hvD.Application.initializeReflectiveFields;
                        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                        if (c52794wYp != null) {
                            i = C23274hvD.Application.accessgetOnBackPressedCallbacksp;
                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                            if (nestedScrollView != null) {
                                return new C21621hGd((ConstraintLayout) view, textView, textView2, recyclerView, recyclerView2, c52794wYp, nestedScrollView);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
