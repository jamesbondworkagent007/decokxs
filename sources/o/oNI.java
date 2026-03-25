package o;

import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: loaded from: classes18.dex */
public final class oNI implements ViewBinding {
    public final C55113xdn AEQbTJ;
    public final android.widget.FrameLayout AYXKKw;
    public final C33546myW AhwBna;
    public final FragmentContainerView EZpvd;
    public final C55173xeu KWHzl;
    public final FragmentContainerView OLrzqt;
    public final NestedScrollView copydefault;
    public final android.widget.ScrollView djBIcL;
    public final C33603mza valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.AYXKKw;
    }

    public oNI(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView2, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull android.widget.ScrollView scrollView, @androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull C33603mza c33603mza) {
        this.AYXKKw = frameLayout;
        this.copydefault = nestedScrollView;
        this.KWHzl = c55173xeu;
        this.OLrzqt = fragmentContainerView;
        this.EZpvd = fragmentContainerView2;
        this.AEQbTJ = c55113xdn;
        this.djBIcL = scrollView;
        this.AhwBna = c33546myW;
        this.valueOf = c33603mza;
    }

    public static oNI copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.DsrFlB, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static oNI AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.swzYdv;
        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
        if (nestedScrollView != null) {
            i = C35964oKf.StateListAnimator.invokespecialhlXVux;
            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
            if (c55173xeu != null) {
                i = C35964oKf.StateListAnimator.stopBehavioSecDataCollection;
                FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                if (fragmentContainerView != null) {
                    i = C35964oKf.StateListAnimator.sendBehavioSecData;
                    FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                    if (fragmentContainerView2 != null) {
                        i = C35964oKf.StateListAnimator.OmYuqg;
                        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                        if (c55113xdn != null) {
                            i = C35964oKf.StateListAnimator.OhcwxsRkSIEV;
                            android.widget.ScrollView scrollView = (android.widget.ScrollView) ViewBindings.findChildViewById(view, i);
                            if (scrollView != null) {
                                i = C35964oKf.StateListAnimator.zLnOGN;
                                C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                                if (c33546myW != null) {
                                    i = C35964oKf.StateListAnimator.ICustomTabsCallback;
                                    C33603mza c33603mza = (C33603mza) ViewBindings.findChildViewById(view, i);
                                    if (c33603mza != null) {
                                        return new oNI((android.widget.FrameLayout) view, nestedScrollView, c55173xeu, fragmentContainerView, fragmentContainerView2, c55113xdn, scrollView, c33546myW, c33603mza);
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
