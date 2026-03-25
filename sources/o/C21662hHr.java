package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hHr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21662hHr implements ViewBinding {
    public final C30681lfj AEQbTJ;
    public final ConstraintLayout EZpvd;
    public final C36250oUv KWHzl;
    public final C55173xeu OLrzqt;
    public final hHO copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public C21662hHr(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C30681lfj c30681lfj, @androidx.annotation.NonNull C36250oUv c36250oUv, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull hHO hho) {
        this.EZpvd = constraintLayout;
        this.AEQbTJ = c30681lfj;
        this.KWHzl = c36250oUv;
        this.OLrzqt = c55173xeu;
        this.copydefault = hho;
    }

    public static C21662hHr copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.OFqMGB, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C21662hHr OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C23274hvD.Application.RSDDiY;
        C30681lfj c30681lfj = (C30681lfj) ViewBindings.findChildViewById(view, i);
        if (c30681lfj != null) {
            i = C23274hvD.Application.RbVjfb;
            C36250oUv c36250oUv = (C36250oUv) ViewBindings.findChildViewById(view, i);
            if (c36250oUv != null) {
                i = C23274hvD.Application.dXcUrg;
                C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                if (c55173xeu != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.IMediaControllerCallbackStub))) != null) {
                    return new C21662hHr((ConstraintLayout) view, c30681lfj, c36250oUv, c55173xeu, hHO.EZpvd(viewFindChildViewById));
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
