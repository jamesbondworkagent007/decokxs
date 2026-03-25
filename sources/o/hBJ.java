package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.business.dexui.main.swap.trade.status.widget.ErrorNoticeView;
import com.okinc.business.trade.features.home.ui.advanced.limit.widget.LimitOrderRateView;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hBJ implements ViewBinding {
    public final LimitOrderRateView AEQbTJ;
    public final C21831hNy AYXKKw;
    public final C24805ikk AhwBna;
    public final hNK EZpvd;
    public final ErrorNoticeView KWHzl;
    public final C21828hNv OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final C24805ikk gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C24805ikk getRoot() {
        return this.AhwBna;
    }

    public hBJ(@androidx.annotation.NonNull C24805ikk c24805ikk, @androidx.annotation.NonNull C21828hNv c21828hNv, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull ErrorNoticeView errorNoticeView, @androidx.annotation.NonNull hNK hnk, @androidx.annotation.NonNull LimitOrderRateView limitOrderRateView, @androidx.annotation.NonNull C24805ikk c24805ikk2, @androidx.annotation.NonNull C21831hNy c21831hNy) {
        this.AhwBna = c24805ikk;
        this.OLrzqt = c21828hNv;
        this.copydefault = linearLayout;
        this.KWHzl = errorNoticeView;
        this.EZpvd = hnk;
        this.AEQbTJ = limitOrderRateView;
        this.gEmmrt = c24805ikk2;
        this.AYXKKw = c21831hNy;
    }

    public static hBJ OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.RbVjfb, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static hBJ OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.hvKCwS;
        C21828hNv c21828hNv = (C21828hNv) ViewBindings.findChildViewById(view, i);
        if (c21828hNv != null) {
            i = C23274hvD.Application.dPkBzA;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C23274hvD.Application.fDu;
                ErrorNoticeView errorNoticeView = (ErrorNoticeView) ViewBindings.findChildViewById(view, i);
                if (errorNoticeView != null) {
                    i = C23274hvD.Application.aVPvww;
                    hNK hnk = (hNK) ViewBindings.findChildViewById(view, i);
                    if (hnk != null) {
                        i = C23274hvD.Application.ActivityViewModelLazyKtviewModels2;
                        LimitOrderRateView limitOrderRateView = (LimitOrderRateView) ViewBindings.findChildViewById(view, i);
                        if (limitOrderRateView != null) {
                            C24805ikk c24805ikk = (C24805ikk) view;
                            i = C23274hvD.Application.onWindowFocusChanged;
                            C21831hNy c21831hNy = (C21831hNy) ViewBindings.findChildViewById(view, i);
                            if (c21831hNy != null) {
                                return new hBJ(c24805ikk, c21828hNv, linearLayout, errorNoticeView, hnk, limitOrderRateView, c24805ikk, c21831hNy);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
