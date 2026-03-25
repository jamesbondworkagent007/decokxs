package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47501trL;

/* JADX INFO: renamed from: o.tPy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46319tPy implements ViewBinding {
    public final wYC AEQbTJ;
    public final tUE EZpvd;
    public final android.view.View KWHzl;
    public final tLB OLrzqt;
    public final ConstraintLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.KWHzl;
    }

    public C46319tPy(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull wYC wyc, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull tUE tue, @androidx.annotation.NonNull tLB tlb) {
        this.KWHzl = view;
        this.AEQbTJ = wyc;
        this.copydefault = constraintLayout;
        this.EZpvd = tue;
        this.OLrzqt = tlb;
    }

    public static C46319tPy KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C47501trL.Application.hlkKmr, viewGroup);
        return AEQbTJ(viewGroup);
    }

    public static C46319tPy AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.values;
        wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
        if (wyc != null) {
            i = C47501trL.TaskDescription.DCUTEIdCUTEI;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = C47501trL.TaskDescription.aGOrKO;
                tUE tue = (tUE) ViewBindings.findChildViewById(view, i);
                if (tue != null) {
                    i = C47501trL.TaskDescription.zFtALg;
                    tLB tlb = (tLB) ViewBindings.findChildViewById(view, i);
                    if (tlb != null) {
                        return new C46319tPy(view, wyc, constraintLayout, tue, tlb);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
