package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hEj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C21573hEj implements ViewBinding {
    public final NestedScrollView AEQbTJ;
    public final LinearLayoutCompat EZpvd;
    public final ViewPager2 KWHzl;
    public final NestedScrollView OLrzqt;
    public final C55249xgQ copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.AEQbTJ;
    }

    public C21573hEj(@androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull NestedScrollView nestedScrollView2, @androidx.annotation.NonNull ViewPager2 viewPager2, @androidx.annotation.NonNull C55249xgQ c55249xgQ) {
        this.AEQbTJ = nestedScrollView;
        this.EZpvd = linearLayoutCompat;
        this.OLrzqt = nestedScrollView2;
        this.KWHzl = viewPager2;
        this.copydefault = c55249xgQ;
    }

    public static C21573hEj KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.getAdvertisingId;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            i = C23274hvD.Application.hashCode;
            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
            if (viewPager2 != null) {
                i = C23274hvD.Application.OnBackPressedDispatcher1;
                C55249xgQ c55249xgQ = (C55249xgQ) ViewBindings.findChildViewById(view, i);
                if (c55249xgQ != null) {
                    return new C21573hEj(nestedScrollView, linearLayoutCompat, nestedScrollView, viewPager2, c55249xgQ);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
