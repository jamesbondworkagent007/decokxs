package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hxB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23378hxB implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final C55173xeu AhwBna;
    public final C22280hcQ EZpvd;
    public final FragmentContainerView KWHzl;
    public final C22281hcR OLrzqt;
    public final C33537myN copydefault;
    public final ViewPager2 djBIcL;
    public final C55244xgL gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AEQbTJ;
    }

    public C23378hxB(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull C22280hcQ c22280hcQ, @androidx.annotation.NonNull C22281hcR c22281hcR, @androidx.annotation.NonNull C55244xgL c55244xgL, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.AEQbTJ = constraintLayout;
        this.copydefault = c33537myN;
        this.KWHzl = fragmentContainerView;
        this.EZpvd = c22280hcQ;
        this.OLrzqt = c22281hcR;
        this.gEmmrt = c55244xgL;
        this.AhwBna = c55173xeu;
        this.djBIcL = viewPager2;
    }

    public static C23378hxB KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, null, false);
    }

    public static C23378hxB OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.wlaJM, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C23378hxB copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.dxcTrN;
        C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
        if (c33537myN != null) {
            i = C23274hvD.Application.DcMfJKDDUqPf;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
            if (fragmentContainerView != null) {
                i = C23274hvD.Application.invokeSuspendlambda1;
                C22280hcQ c22280hcQ = (C22280hcQ) ViewBindings.findChildViewById(view, i);
                if (c22280hcQ != null) {
                    i = C23274hvD.Application.getCurrent;
                    C22281hcR c22281hcR = (C22281hcR) ViewBindings.findChildViewById(view, i);
                    if (c22281hcR != null) {
                        i = C23274hvD.Application.ActivityResultCaller;
                        C55244xgL c55244xgL = (C55244xgL) ViewBindings.findChildViewById(view, i);
                        if (c55244xgL != null) {
                            i = C23274hvD.Application.getIconTintList;
                            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                            if (c55173xeu != null) {
                                i = C23274hvD.Application.hasText;
                                ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                                if (viewPager2 != null) {
                                    return new C23378hxB((ConstraintLayout) view, c33537myN, fragmentContainerView, c22280hcQ, c22281hcR, c55244xgL, c55173xeu, viewPager2);
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
