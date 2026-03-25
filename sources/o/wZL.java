package o;

import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C52761wXj;

/* JADX INFO: loaded from: classes11.dex */
public final class wZL implements ViewBinding {
    public final android.widget.LinearLayout EZpvd;
    public final NestedScrollView KWHzl;
    public final C55118xds OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C55118xds getRoot() {
        return this.OLrzqt;
    }

    public wZL(@androidx.annotation.NonNull C55118xds c55118xds, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull NestedScrollView nestedScrollView) {
        this.OLrzqt = c55118xds;
        this.EZpvd = linearLayout;
        this.KWHzl = nestedScrollView;
    }

    public static wZL AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return EZpvd(layoutInflater, null, false);
    }

    public static wZL EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C52761wXj.Fragment.AEQbTJ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static wZL copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C52761wXj.FragmentManager.DTwDnp;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C52761wXj.FragmentManager.gmHjFq;
            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
            if (nestedScrollView != null) {
                return new wZL((C55118xds) view, linearLayout, nestedScrollView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
