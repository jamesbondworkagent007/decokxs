package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hBi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21491hBi implements ViewBinding {
    public final C30567ldb AEQbTJ;
    public final C25325iub AYXKKw;
    public final C24453ieC AhwBna;
    public final android.view.View EZpvd;
    public final C55113xdn KWHzl;
    public final android.widget.FrameLayout OLrzqt;
    public final C24375ice copydefault;
    public final C25265itU djBIcL;
    public final C25324iua gEmmrt;
    public final C31127loE valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.OLrzqt;
    }

    public C21491hBi(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C24375ice c24375ice, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C30567ldb c30567ldb, @androidx.annotation.NonNull C24453ieC c24453ieC, @androidx.annotation.NonNull C25324iua c25324iua, @androidx.annotation.NonNull C25265itU c25265itU, @androidx.annotation.NonNull C25325iub c25325iub, @androidx.annotation.NonNull C31127loE c31127loE) {
        this.OLrzqt = frameLayout;
        this.copydefault = c24375ice;
        this.KWHzl = c55113xdn;
        this.EZpvd = view;
        this.AEQbTJ = c30567ldb;
        this.AhwBna = c24453ieC;
        this.gEmmrt = c25324iua;
        this.djBIcL = c25265itU;
        this.AYXKKw = c25325iub;
        this.valueOf = c31127loE;
    }

    public static C21491hBi KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.zzQwtT, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C21491hBi AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C23274hvD.Application.dvImUD;
        C24375ice c24375ice = (C24375ice) ViewBindings.findChildViewById(view, i);
        if (c24375ice != null) {
            i = C23274hvD.Application.MediaControllerCompatApi24TransportControls;
            C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
            if (c55113xdn != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.addItem))) != null) {
                i = C23274hvD.Application.hasAddedItem;
                C30567ldb c30567ldb = (C30567ldb) ViewBindings.findChildViewById(view, i);
                if (c30567ldb != null) {
                    i = C23274hvD.Application.onSearchRequested;
                    C24453ieC c24453ieC = (C24453ieC) ViewBindings.findChildViewById(view, i);
                    if (c24453ieC != null) {
                        i = C23274hvD.Application.getIconTintMode;
                        C25324iua c25324iua = (C25324iua) ViewBindings.findChildViewById(view, i);
                        if (c25324iua != null) {
                            i = C23274hvD.Application.getOrder;
                            C25265itU c25265itU = (C25265itU) ViewBindings.findChildViewById(view, i);
                            if (c25265itU != null) {
                                i = C23274hvD.Application.hasSubMenu;
                                C25325iub c25325iub = (C25325iub) ViewBindings.findChildViewById(view, i);
                                if (c25325iub != null) {
                                    i = C23274hvD.Application.setOnActionExpandListener;
                                    C31127loE c31127loE = (C31127loE) ViewBindings.findChildViewById(view, i);
                                    if (c31127loE != null) {
                                        return new C21491hBi((android.widget.FrameLayout) view, c24375ice, c55113xdn, viewFindChildViewById, c30567ldb, c24453ieC, c25324iua, c25265itU, c25325iub, c31127loE);
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
