package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hxQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23393hxQ implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final android.view.View AhwBna;
    public final C55008xbo EZpvd;
    public final C55008xbo KWHzl;
    public final wYF OLrzqt;
    public final C55018xby copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.AEQbTJ;
    }

    public C23393hxQ(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull wYF wyf, @androidx.annotation.NonNull C55008xbo c55008xbo, @androidx.annotation.NonNull C55008xbo c55008xbo2, @androidx.annotation.NonNull C55018xby c55018xby, @androidx.annotation.NonNull android.view.View view) {
        this.AEQbTJ = linearLayoutCompat;
        this.OLrzqt = wyf;
        this.KWHzl = c55008xbo;
        this.EZpvd = c55008xbo2;
        this.copydefault = c55018xby;
        this.AhwBna = view;
    }

    public static C23393hxQ OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.QOLQEE, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C23393hxQ copydefault(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C23274hvD.Application.DGUQLIOvDItG;
        wYF wyf = (wYF) ViewBindings.findChildViewById(view, i);
        if (wyf != null) {
            i = C23274hvD.Application.RAaltf;
            C55008xbo c55008xbo = (C55008xbo) ViewBindings.findChildViewById(view, i);
            if (c55008xbo != null) {
                i = C23274hvD.Application.ikEgkI;
                C55008xbo c55008xbo2 = (C55008xbo) ViewBindings.findChildViewById(view, i);
                if (c55008xbo2 != null) {
                    i = C23274hvD.Application.onBackInvoked;
                    C55018xby c55018xby = (C55018xby) ViewBindings.findChildViewById(view, i);
                    if (c55018xby != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.dispatchPopulateAccessibilityEvent))) != null) {
                        return new C23393hxQ((LinearLayoutCompat) view, wyf, c55008xbo, c55008xbo2, c55018xby, viewFindChildViewById);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
