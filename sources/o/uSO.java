package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.FragmentContainerView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public final class uSO implements ViewBinding {
    public final C55113xdn AEQbTJ;
    public final LinearLayoutCompat AYXKKw;
    public final RecyclerView AhwBna;
    public final C55173xeu EZpvd;
    public final android.widget.TextView KWHzl;
    public final FragmentContainerView OLrzqt;
    public final android.widget.ImageView copydefault;
    public final android.widget.FrameLayout djBIcL;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.djBIcL;
    }

    public uSO(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.TextView textView3) {
        this.djBIcL = frameLayout;
        this.OLrzqt = fragmentContainerView;
        this.EZpvd = c55173xeu;
        this.copydefault = imageView;
        this.KWHzl = textView;
        this.AEQbTJ = c55113xdn;
        this.AYXKKw = linearLayoutCompat;
        this.gEmmrt = textView2;
        this.AhwBna = recyclerView;
        this.valueOf = textView3;
    }

    public static uSO KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.dUDNAs;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
        if (fragmentContainerView != null) {
            i = C48033uCm.Application.aWJMta;
            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
            if (c55173xeu != null) {
                i = C48033uCm.Application.zLnOGN;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C48033uCm.Application.extraCallback;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = C48033uCm.Application.getString;
                        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                        if (c55113xdn != null) {
                            i = C48033uCm.Application.onSessionDestroyed;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat != null) {
                                i = C48033uCm.Application.isSessionReady;
                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = C48033uCm.Application.ActivityViewModelLazyKtviewModels1;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                    if (recyclerView != null) {
                                        i = C48033uCm.Application.mask;
                                        android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView3 != null) {
                                            return new uSO((android.widget.FrameLayout) view, fragmentContainerView, c55173xeu, imageView, textView, c55113xdn, linearLayoutCompat, textView2, recyclerView, textView3);
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
