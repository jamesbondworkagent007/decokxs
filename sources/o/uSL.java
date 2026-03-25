package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public final class uSL implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final android.view.View AYXKKw;
    public final android.view.View AhwBna;
    public final android.view.View EZpvd;
    public final android.view.View KWHzl;
    public final ConstraintLayout OLrzqt;
    public final android.view.View copydefault;
    public final android.view.View djBIcL;
    public final android.view.View gEmmrt;
    public final android.view.View isConnected;
    public final android.view.View valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public uSL(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull android.view.View view3, @androidx.annotation.NonNull android.view.View view4, @androidx.annotation.NonNull android.view.View view5, @androidx.annotation.NonNull android.view.View view6, @androidx.annotation.NonNull android.view.View view7, @androidx.annotation.NonNull android.view.View view8, @androidx.annotation.NonNull android.view.View view9, @androidx.annotation.NonNull android.view.View view10) {
        this.OLrzqt = constraintLayout;
        this.copydefault = view;
        this.KWHzl = view2;
        this.EZpvd = view3;
        this.AEQbTJ = view4;
        this.djBIcL = view5;
        this.valueOf = view6;
        this.AhwBna = view7;
        this.gEmmrt = view8;
        this.AYXKKw = view9;
        this.isConnected = view10;
    }

    public static uSL KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, null, false);
    }

    public static uSL OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.invokespecialaGOrKO, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static uSL KWHzl(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        android.view.View viewFindChildViewById3;
        android.view.View viewFindChildViewById4;
        android.view.View viewFindChildViewById5;
        android.view.View viewFindChildViewById6;
        android.view.View viewFindChildViewById7;
        android.view.View viewFindChildViewById8;
        android.view.View viewFindChildViewById9;
        int i = C48033uCm.Application.gBtXYZ;
        android.view.View viewFindChildViewById10 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById10 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C48033uCm.Application.fupbxE))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C48033uCm.Application.deregisterUser))) != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = C48033uCm.Application.dTTfOR))) != null && (viewFindChildViewById4 = ViewBindings.findChildViewById(view, (i = C48033uCm.Application.getOnBackInvokedDispatcher))) != null && (viewFindChildViewById5 = ViewBindings.findChildViewById(view, (i = C48033uCm.Application.cancelPendingInputEvents))) != null && (viewFindChildViewById6 = ViewBindings.findChildViewById(view, (i = C48033uCm.Application.ComponentActivityReportFullyDrawnExecutorApi1))) != null && (viewFindChildViewById7 = ViewBindings.findChildViewById(view, (i = C48033uCm.Application.execute))) != null && (viewFindChildViewById8 = ViewBindings.findChildViewById(view, (i = C48033uCm.Application.ComponentActivityReportFullyDrawnExecutorApi16ImplExternalSyntheticLambda0))) != null && (viewFindChildViewById9 = ViewBindings.findChildViewById(view, (i = C48033uCm.Application.lambdaexecute0))) != null) {
            return new uSL((ConstraintLayout) view, viewFindChildViewById10, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, viewFindChildViewById5, viewFindChildViewById6, viewFindChildViewById7, viewFindChildViewById8, viewFindChildViewById9);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
