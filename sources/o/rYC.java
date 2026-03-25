package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.rXV;

/* JADX INFO: loaded from: classes16.dex */
public final class rYC implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final C55113xdn EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final C33537myN OLrzqt;
    public final C55173xeu copydefault;
    public final RecyclerView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AEQbTJ;
    }

    public rYC(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.AEQbTJ = linearLayout;
        this.OLrzqt = c33537myN;
        this.copydefault = c55173xeu;
        this.EZpvd = c55113xdn;
        this.KWHzl = linearLayout2;
        this.valueOf = recyclerView;
    }

    public static rYC EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, null, false);
    }

    public static rYC OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(rXV.StateListAnimator.EZpvd, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static rYC copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = rXV.ActionBar.OLrzqt;
        C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
        if (c33537myN != null) {
            i = rXV.ActionBar.isConnected;
            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
            if (c55173xeu != null) {
                i = rXV.ActionBar.fIwbmz;
                C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                if (c55113xdn != null) {
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view;
                    i = rXV.ActionBar.AuCTelauCTel;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        return new rYC(linearLayout, c33537myN, c55173xeu, c55113xdn, linearLayout, recyclerView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
