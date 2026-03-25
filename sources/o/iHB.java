package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: loaded from: classes6.dex */
public final class iHB implements ViewBinding {
    public final iJM AEQbTJ;
    public final C33546myW AYXKKw;
    public final C33603mza AhwBna;
    public final C55230xfy DbNXlk;
    public final iJN EZpvd;
    public final iJJ KWHzl;
    public final iJI OLrzqt;
    public final C55173xeu copydefault;
    public final ConstraintLayout djBIcL;
    public final NestedScrollView gEmmrt;
    public final android.widget.FrameLayout isConnected;
    public final C55113xdn valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.isConnected;
    }

    public iHB(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull iJJ ijj, @androidx.annotation.NonNull iJI iji, @androidx.annotation.NonNull iJM ijm, @androidx.annotation.NonNull iJN ijn, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C33603mza c33603mza, @androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull C55230xfy c55230xfy) {
        this.isConnected = frameLayout;
        this.copydefault = c55173xeu;
        this.KWHzl = ijj;
        this.OLrzqt = iji;
        this.AEQbTJ = ijm;
        this.EZpvd = ijn;
        this.valueOf = c55113xdn;
        this.gEmmrt = nestedScrollView;
        this.djBIcL = constraintLayout;
        this.AhwBna = c33603mza;
        this.AYXKKw = c33546myW;
        this.DbNXlk = c55230xfy;
    }

    public static iHB copydefault(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C25493ixk.ActionBar.DLGVGj;
        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
        if (c55173xeu != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C25493ixk.ActionBar.zpGcln))) != null) {
            iJJ ijjAEQbTJ = iJJ.AEQbTJ(viewFindChildViewById);
            i = C25493ixk.ActionBar.onComplete;
            android.view.View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i);
            if (viewFindChildViewById2 != null) {
                iJI ijiAEQbTJ = iJI.AEQbTJ(viewFindChildViewById2);
                i = C25493ixk.ActionBar.DcMfJKDDUqPf;
                android.view.View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i);
                if (viewFindChildViewById3 != null) {
                    iJM ijmOLrzqt = iJM.OLrzqt(viewFindChildViewById3);
                    i = C25493ixk.ActionBar.GiPPlLRPuVlr;
                    android.view.View viewFindChildViewById4 = ViewBindings.findChildViewById(view, i);
                    if (viewFindChildViewById4 != null) {
                        iJN ijnKWHzl = iJN.KWHzl(viewFindChildViewById4);
                        i = C25493ixk.ActionBar.gCNefq;
                        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                        if (c55113xdn != null) {
                            i = C25493ixk.ActionBar.HJWChPfrwjPh;
                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                            if (nestedScrollView != null) {
                                i = C25493ixk.ActionBar.dpErvT;
                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                if (constraintLayout != null) {
                                    i = C25493ixk.ActionBar.sEcTXd;
                                    C33603mza c33603mza = (C33603mza) ViewBindings.findChildViewById(view, i);
                                    if (c33603mza != null) {
                                        i = C25493ixk.ActionBar.sJPPOI;
                                        C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                                        if (c33546myW != null) {
                                            i = C25493ixk.ActionBar.onSearchResult;
                                            C55230xfy c55230xfy = (C55230xfy) ViewBindings.findChildViewById(view, i);
                                            if (c55230xfy != null) {
                                                return new iHB((android.widget.FrameLayout) view, c55173xeu, ijjAEQbTJ, ijiAEQbTJ, ijmOLrzqt, ijnKWHzl, c55113xdn, nestedScrollView, constraintLayout, c33603mza, c33546myW, c55230xfy);
                                            }
                                        }
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
