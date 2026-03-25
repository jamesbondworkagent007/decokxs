package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rap, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42673rap implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final C42934rfl EZpvd;
    public final C27555jxR KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final android.widget.FrameLayout copydefault;
    public final RecyclerView djBIcL;
    public final RecyclerView gEmmrt;
    public final C33546myW valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AEQbTJ;
    }

    public C42673rap(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull C42934rfl c42934rfl, @androidx.annotation.NonNull C27555jxR c27555jxR, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull RecyclerView recyclerView2) {
        this.AEQbTJ = linearLayout;
        this.copydefault = frameLayout;
        this.OLrzqt = linearLayout2;
        this.EZpvd = c42934rfl;
        this.KWHzl = c27555jxR;
        this.gEmmrt = recyclerView;
        this.valueOf = c33546myW;
        this.djBIcL = recyclerView2;
    }

    public static C42673rap AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = qZH.StateListAnimator.DcMfJKdMCrTj;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = qZH.StateListAnimator.GQzpsZ;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = qZH.StateListAnimator.onReceive))) != null) {
                C42934rfl c42934rflOLrzqt = C42934rfl.OLrzqt(viewFindChildViewById);
                i = qZH.StateListAnimator.HJWChPRAkuRW;
                C27555jxR c27555jxR = (C27555jxR) ViewBindings.findChildViewById(view, i);
                if (c27555jxR != null) {
                    i = qZH.StateListAnimator.IKQXqd;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        i = qZH.StateListAnimator.Ohcwxs;
                        C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                        if (c33546myW != null) {
                            i = qZH.StateListAnimator.OVMstZ;
                            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView2 != null) {
                                return new C42673rap((android.widget.LinearLayout) view, frameLayout, linearLayout, c42934rflOLrzqt, c27555jxR, recyclerView, c33546myW, recyclerView2);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
