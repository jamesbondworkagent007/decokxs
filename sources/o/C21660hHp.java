package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hHp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C21660hHp implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final android.widget.HorizontalScrollView AhwBna;
    public final LinearLayoutCompat EZpvd;
    public final android.view.View KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.view.View copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AEQbTJ;
    }

    public C21660hHp(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.HorizontalScrollView horizontalScrollView) {
        this.AEQbTJ = constraintLayout;
        this.EZpvd = linearLayoutCompat;
        this.copydefault = view;
        this.KWHzl = view2;
        this.OLrzqt = imageView;
        this.AhwBna = horizontalScrollView;
    }

    public static C21660hHp copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.OAjjVP, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C21660hHp OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        int i = C23274hvD.Application.fVjYLc;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.dNxZaP))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.HJWChPdIKEqB))) != null) {
            i = C23274hvD.Application.IPostMessageServiceStubProxy;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C23274hvD.Application.addCallback;
                android.widget.HorizontalScrollView horizontalScrollView = (android.widget.HorizontalScrollView) ViewBindings.findChildViewById(view, i);
                if (horizontalScrollView != null) {
                    return new C21660hHp((ConstraintLayout) view, linearLayoutCompat, viewFindChildViewById, viewFindChildViewById2, imageView, horizontalScrollView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
