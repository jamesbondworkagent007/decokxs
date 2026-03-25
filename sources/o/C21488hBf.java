package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hBf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21488hBf implements ViewBinding {
    public final C22227hbQ AEQbTJ;
    public final ConstraintLayout EZpvd;
    public final C55113xdn KWHzl;
    public final wYK OLrzqt;
    public final RecyclerView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public C21488hBf(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C22227hbQ c22227hbQ, @androidx.annotation.NonNull wYK wyk, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.EZpvd = constraintLayout;
        this.AEQbTJ = c22227hbQ;
        this.OLrzqt = wyk;
        this.KWHzl = c55113xdn;
        this.copydefault = recyclerView;
    }

    public static C21488hBf OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.dzCpvv, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C21488hBf OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.zKcAg;
        C22227hbQ c22227hbQ = (C22227hbQ) ViewBindings.findChildViewById(view, i);
        if (c22227hbQ != null) {
            i = C23274hvD.Application.gtdfxv;
            wYK wyk = (wYK) ViewBindings.findChildViewById(view, i);
            if (wyk != null) {
                i = C23274hvD.Application.MediaControllerCompatApi24TransportControls;
                C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                if (c55113xdn != null) {
                    i = C23274hvD.Application.onStart;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        return new C21488hBf((ConstraintLayout) view, c22227hbQ, wyk, c55113xdn, recyclerView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
