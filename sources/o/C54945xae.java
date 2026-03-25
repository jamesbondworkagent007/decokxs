package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C52761wXj;

/* JADX INFO: renamed from: o.xae, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54945xae implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final C55187xfH EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final C55230xfy OLrzqt;
    public final android.widget.FrameLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.AEQbTJ;
    }

    public C54945xae(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C55230xfy c55230xfy, @androidx.annotation.NonNull C55187xfH c55187xfH) {
        this.AEQbTJ = frameLayout;
        this.copydefault = frameLayout2;
        this.KWHzl = linearLayout;
        this.OLrzqt = c55230xfy;
        this.EZpvd = c55187xfH;
    }

    public static C54945xae OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C52761wXj.Fragment.fJNWhG, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C54945xae OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C52761wXj.FragmentManager.dNCPSb;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = C52761wXj.FragmentManager.htlTjW;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C52761wXj.FragmentManager.zDUObI;
                C55230xfy c55230xfy = (C55230xfy) ViewBindings.findChildViewById(view, i);
                if (c55230xfy != null) {
                    i = C52761wXj.FragmentManager.sTzBva;
                    C55187xfH c55187xfH = (C55187xfH) ViewBindings.findChildViewById(view, i);
                    if (c55187xfH != null) {
                        return new C54945xae((android.widget.FrameLayout) view, frameLayout, linearLayout, c55230xfy, c55187xfH);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
