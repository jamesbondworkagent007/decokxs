package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.github.mmin18.widget.RealtimeBlurView;
import o.qZH;

/* JADX INFO: renamed from: o.rdx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42840rdx implements ViewBinding {
    public final RealtimeBlurView AEQbTJ;
    public final C43000rgy EZpvd;
    public final C43000rgy KWHzl;
    public final android.widget.TextView OLrzqt;
    public final ConstraintLayout copydefault;
    public final ViewPager2 gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C43000rgy getRoot() {
        return this.KWHzl;
    }

    public C42840rdx(@androidx.annotation.NonNull C43000rgy c43000rgy, @androidx.annotation.NonNull RealtimeBlurView realtimeBlurView, @androidx.annotation.NonNull C43000rgy c43000rgy2, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.KWHzl = c43000rgy;
        this.AEQbTJ = realtimeBlurView;
        this.EZpvd = c43000rgy2;
        this.copydefault = constraintLayout;
        this.OLrzqt = textView;
        this.gEmmrt = viewPager2;
    }

    public static C42840rdx AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.aKErDB;
        RealtimeBlurView realtimeBlurView = (RealtimeBlurView) ViewBindings.findChildViewById(view, i);
        if (realtimeBlurView != null) {
            C43000rgy c43000rgy = (C43000rgy) view;
            i = qZH.StateListAnimator.fbC;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = qZH.StateListAnimator.DXTac;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = qZH.StateListAnimator.toString;
                    ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                    if (viewPager2 != null) {
                        return new C42840rdx(c43000rgy, realtimeBlurView, c43000rgy, constraintLayout, textView, viewPager2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
