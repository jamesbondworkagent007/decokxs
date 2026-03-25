package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: loaded from: classes18.dex */
public final class iKD implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final RecyclerView AhwBna;
    public final C55173xeu EZpvd;
    public final C55113xdn KWHzl;
    public final C55173xeu OLrzqt;
    public final android.widget.FrameLayout copydefault;
    public final C55230xfy djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.copydefault;
    }

    public iKD(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55173xeu c55173xeu2, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C55230xfy c55230xfy, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.copydefault = frameLayout;
        this.AEQbTJ = linearLayoutCompat;
        this.OLrzqt = c55173xeu;
        this.EZpvd = c55173xeu2;
        this.KWHzl = c55113xdn;
        this.djBIcL = c55230xfy;
        this.AhwBna = recyclerView;
    }

    public static iKD AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return KWHzl(layoutInflater, null, false);
    }

    public static iKD KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.sVXHln, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static iKD EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.TarCU;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = C25493ixk.ActionBar.cBPFI;
            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
            if (c55173xeu != null) {
                i = C25493ixk.ActionBar.DLGVGj;
                C55173xeu c55173xeu2 = (C55173xeu) ViewBindings.findChildViewById(view, i);
                if (c55173xeu2 != null) {
                    i = C25493ixk.ActionBar.HJWChPRAkuRW;
                    C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                    if (c55113xdn != null) {
                        i = C25493ixk.ActionBar.kcQGz;
                        C55230xfy c55230xfy = (C55230xfy) ViewBindings.findChildViewById(view, i);
                        if (c55230xfy != null) {
                            i = C25493ixk.ActionBar.gRtANS;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView != null) {
                                return new iKD((android.widget.FrameLayout) view, linearLayoutCompat, c55173xeu, c55173xeu2, c55113xdn, c55230xfy, recyclerView);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
