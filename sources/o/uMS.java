package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public final class uMS implements ViewBinding {
    public final ConstraintLayout EZpvd;
    public final ViewPager2 KWHzl;
    public final C55249xgQ OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public uMS(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55249xgQ c55249xgQ, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.EZpvd = constraintLayout;
        this.OLrzqt = c55249xgQ;
        this.KWHzl = viewPager2;
    }

    public static uMS EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.AubY, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static uMS KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.OnBackPressedDispatcher;
        C55249xgQ c55249xgQ = (C55249xgQ) ViewBindings.findChildViewById(view, i);
        if (c55249xgQ != null) {
            i = C48033uCm.Application.selectTransition;
            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
            if (viewPager2 != null) {
                return new uMS((ConstraintLayout) view, c55249xgQ, viewPager2);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
