package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.okinc.uilab.banner.OKAlertBanner;
import o.C35964oKf;

/* JADX INFO: loaded from: classes18.dex */
public final class oNW implements ViewBinding {
    public final ViewPager2 AEQbTJ;
    public final C55173xeu AhwBna;
    public final OKAlertBanner EZpvd;
    public final ConstraintLayout KWHzl;
    public final C36059oNt OLrzqt;
    public final C55254xgV copydefault;
    public final C55113xdn gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.KWHzl;
    }

    public oNW(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull OKAlertBanner oKAlertBanner, @androidx.annotation.NonNull C36059oNt c36059oNt, @androidx.annotation.NonNull C55254xgV c55254xgV, @androidx.annotation.NonNull ViewPager2 viewPager2, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55113xdn c55113xdn) {
        this.KWHzl = constraintLayout;
        this.EZpvd = oKAlertBanner;
        this.OLrzqt = c36059oNt;
        this.copydefault = c55254xgV;
        this.AEQbTJ = viewPager2;
        this.AhwBna = c55173xeu;
        this.gEmmrt = c55113xdn;
    }

    public static oNW OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.aHXSQp, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static oNW OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C35964oKf.StateListAnimator.zuBGHE;
        OKAlertBanner oKAlertBanner = (OKAlertBanner) ViewBindings.findChildViewById(view, i);
        if (oKAlertBanner != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C35964oKf.StateListAnimator.apHBvG))) != null) {
            C36059oNt c36059oNtKWHzl = C36059oNt.KWHzl(viewFindChildViewById);
            i = C35964oKf.StateListAnimator.sYOsaF;
            C55254xgV c55254xgV = (C55254xgV) ViewBindings.findChildViewById(view, i);
            if (c55254xgV != null) {
                i = C35964oKf.StateListAnimator.DuQ;
                ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                if (viewPager2 != null) {
                    i = C35964oKf.StateListAnimator.onRewind;
                    C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                    if (c55173xeu != null) {
                        i = C35964oKf.StateListAnimator.buildRccMetadata;
                        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                        if (c55113xdn != null) {
                            return new oNW((ConstraintLayout) view, oKAlertBanner, c36059oNtKWHzl, c55254xgV, viewPager2, c55173xeu, c55113xdn);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
