package o;

import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C49511upt;

/* JADX INFO: renamed from: o.uqU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C49539uqU implements ViewBinding {
    public final wYK KWHzl;
    public final NestedScrollView OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.OLrzqt;
    }

    public C49539uqU(@androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull wYK wyk) {
        this.OLrzqt = nestedScrollView;
        this.KWHzl = wyk;
    }

    public static C49539uqU OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C49511upt.StateListAnimator.fIwbmz, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C49539uqU KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C49511upt.Application.hvKCwS;
        wYK wyk = (wYK) ViewBindings.findChildViewById(view, i);
        if (wyk != null) {
            return new C49539uqU((NestedScrollView) view, wyk);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
