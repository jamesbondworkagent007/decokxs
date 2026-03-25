package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import o.C47501trL;

/* JADX INFO: renamed from: o.tMs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C46232tMs implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final C33537myN EZpvd;
    public final ViewPager KWHzl;
    public final C55244xgL OLrzqt;
    public final android.widget.LinearLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AEQbTJ;
    }

    public C46232tMs(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull C55244xgL c55244xgL, @androidx.annotation.NonNull ViewPager viewPager) {
        this.AEQbTJ = linearLayout;
        this.copydefault = linearLayout2;
        this.EZpvd = c33537myN;
        this.OLrzqt = c55244xgL;
        this.KWHzl = viewPager;
    }

    public static C46232tMs EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return KWHzl(layoutInflater, null, false);
    }

    public static C46232tMs KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C47501trL.Application.djBIcL, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C46232tMs copydefault(@androidx.annotation.NonNull android.view.View view) {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view;
        int i = C47501trL.TaskDescription.djBIcL;
        C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
        if (c33537myN != null) {
            i = C47501trL.TaskDescription.GQzpsZsQwTVT;
            C55244xgL c55244xgL = (C55244xgL) ViewBindings.findChildViewById(view, i);
            if (c55244xgL != null) {
                i = C47501trL.TaskDescription.UJpkuA;
                ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, i);
                if (viewPager != null) {
                    return new C46232tMs(linearLayout, linearLayout, c33537myN, c55244xgL, viewPager);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
