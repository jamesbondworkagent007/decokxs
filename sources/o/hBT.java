package o;

import androidx.fragment.app.FragmentContainerView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hBT implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final FragmentContainerView AYXKKw;
    public final C55173xeu EZpvd;
    public final C55113xdn KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final RecyclerView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.OLrzqt;
    }

    public hBT(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView) {
        this.OLrzqt = linearLayout;
        this.EZpvd = c55173xeu;
        this.AEQbTJ = linearLayout2;
        this.KWHzl = c55113xdn;
        this.copydefault = recyclerView;
        this.AYXKKw = fragmentContainerView;
    }

    public static hBT AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.RqmePg, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static hBT OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.QOjuYg;
        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
        if (c55173xeu != null) {
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view;
            i = C23274hvD.Application.MediaControllerCompatApi24TransportControls;
            C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
            if (c55113xdn != null) {
                i = C23274hvD.Application.invokeSuspend;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C23274hvD.Application.parameter;
                    FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                    if (fragmentContainerView != null) {
                        return new hBT(linearLayout, c55173xeu, linearLayout, c55113xdn, recyclerView, fragmentContainerView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
