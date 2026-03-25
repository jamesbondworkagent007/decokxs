package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.okinc.auth.impl.widget.SimpleToolBar;
import o.C8206ayP;

/* JADX INFO: renamed from: o.aAt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C5674aAt implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final ViewPager2 AYXKKw;
    public final AppBarLayout EZpvd;
    public final SimpleToolBar KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final C55254xgV copydefault;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.OLrzqt;
    }

    public C5674aAt(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull SimpleToolBar simpleToolBar, @androidx.annotation.NonNull AppBarLayout appBarLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C55254xgV c55254xgV, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.OLrzqt = linearLayout;
        this.KWHzl = simpleToolBar;
        this.EZpvd = appBarLayout;
        this.AEQbTJ = textView;
        this.copydefault = c55254xgV;
        this.valueOf = textView2;
        this.AYXKKw = viewPager2;
    }

    public static C5674aAt OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C8206ayP.Application.DAIeex, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C5674aAt EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C8206ayP.StateListAnimator.AEQbTJ;
        SimpleToolBar simpleToolBar = (SimpleToolBar) ViewBindings.findChildViewById(view, i);
        if (simpleToolBar != null) {
            i = C8206ayP.StateListAnimator.OLrzqt;
            AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i);
            if (appBarLayout != null) {
                i = C8206ayP.StateListAnimator.QSLkRj;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C8206ayP.StateListAnimator.ihnvzI;
                    C55254xgV c55254xgV = (C55254xgV) ViewBindings.findChildViewById(view, i);
                    if (c55254xgV != null) {
                        i = C8206ayP.StateListAnimator.isReflectionWorking;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = C8206ayP.StateListAnimator.invokespecialROgMPW;
                            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                            if (viewPager2 != null) {
                                return new C5674aAt((android.widget.LinearLayout) view, simpleToolBar, appBarLayout, textView, c55254xgV, textView2, viewPager2);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
