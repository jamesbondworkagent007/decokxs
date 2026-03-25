package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import o.C35964oKf;

/* JADX INFO: loaded from: classes23.dex */
public final class oOU implements ViewBinding {
    public final ViewPager AEQbTJ;
    public final android.widget.LinearLayout EZpvd;
    public final C55249xgQ KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.EZpvd;
    }

    public oOU(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C55249xgQ c55249xgQ, @androidx.annotation.NonNull ViewPager viewPager) {
        this.EZpvd = linearLayout;
        this.KWHzl = c55249xgQ;
        this.AEQbTJ = viewPager;
    }

    public static oOU KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.gtdfxv, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static oOU copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.ITrustedWebActivityServiceStubProxy;
        C55249xgQ c55249xgQ = (C55249xgQ) ViewBindings.findChildViewById(view, i);
        if (c55249xgQ != null) {
            i = C35964oKf.StateListAnimator.MediaSessionCompatMediaSessionImplApi18;
            ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, i);
            if (viewPager != null) {
                return new oOU((android.widget.LinearLayout) view, c55249xgQ, viewPager);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
