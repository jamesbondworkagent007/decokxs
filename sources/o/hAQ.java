package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.business.dexui.main.market.detail.widget.KLineSimpleView;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hAQ implements ViewBinding {
    public final android.widget.FrameLayout KWHzl;
    public final KLineSimpleView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.KWHzl;
    }

    public hAQ(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull KLineSimpleView kLineSimpleView) {
        this.KWHzl = frameLayout;
        this.copydefault = kLineSimpleView;
    }

    public static hAQ OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DGUQLIdZmdUa, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static hAQ KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.WindowCallbackWrapperApi23Impl;
        KLineSimpleView kLineSimpleView = (KLineSimpleView) ViewBindings.findChildViewById(view, i);
        if (kLineSimpleView != null) {
            return new hAQ((android.widget.FrameLayout) view, kLineSimpleView);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
