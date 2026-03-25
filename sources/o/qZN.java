package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import o.qZH;

/* JADX INFO: loaded from: classes19.dex */
public final class qZN implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.LinearLayout EZpvd;
    public final C33541myR KWHzl;
    public final C55230xfy OLrzqt;
    public final ViewPager copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AEQbTJ;
    }

    public qZN(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull C55230xfy c55230xfy, @androidx.annotation.NonNull C33541myR c33541myR, @androidx.annotation.NonNull ViewPager viewPager) {
        this.AEQbTJ = linearLayout;
        this.EZpvd = linearLayout2;
        this.OLrzqt = c55230xfy;
        this.KWHzl = c33541myR;
        this.copydefault = viewPager;
    }

    public static qZN AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view;
        int i = qZH.StateListAnimator.jFiva;
        C55230xfy c55230xfy = (C55230xfy) ViewBindings.findChildViewById(view, i);
        if (c55230xfy != null) {
            i = qZH.StateListAnimator.OtRJxF;
            C33541myR c33541myR = (C33541myR) ViewBindings.findChildViewById(view, i);
            if (c33541myR != null) {
                i = qZH.StateListAnimator.getMediaItem;
                ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, i);
                if (viewPager != null) {
                    return new qZN(linearLayout, linearLayout, c55230xfy, c33541myR, viewPager);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
