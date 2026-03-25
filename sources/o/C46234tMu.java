package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import o.C47501trL;

/* JADX INFO: renamed from: o.tMu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46234tMu implements ViewBinding {
    public final wXO AEQbTJ;
    public final ViewPager2 AYXKKw;
    public final C55113xdn EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final wYF copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.KWHzl;
    }

    public C46234tMu(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull wYF wyf, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull wXO wxo, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.KWHzl = frameLayout;
        this.copydefault = wyf;
        this.EZpvd = c55113xdn;
        this.OLrzqt = linearLayout;
        this.AEQbTJ = wxo;
        this.AYXKKw = viewPager2;
    }

    public static C46234tMu KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return KWHzl(layoutInflater, null, false);
    }

    public static C46234tMu KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C47501trL.Application.gEmmrt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C46234tMu EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.copydefault;
        wYF wyf = (wYF) ViewBindings.findChildViewById(view, i);
        if (wyf != null) {
            i = C47501trL.TaskDescription.AYXKKw;
            C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
            if (c55113xdn != null) {
                i = C47501trL.TaskDescription.sbu;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = C47501trL.TaskDescription.sILrnl;
                    wXO wxo = (wXO) ViewBindings.findChildViewById(view, i);
                    if (wxo != null) {
                        i = C47501trL.TaskDescription.Ohcwxs;
                        ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                        if (viewPager2 != null) {
                            return new C46234tMu((android.widget.FrameLayout) view, wyf, c55113xdn, linearLayout, wxo, viewPager2);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
