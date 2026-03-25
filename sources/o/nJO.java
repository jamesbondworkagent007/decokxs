package o;

import androidx.viewbinding.ViewBinding;
import com.okinc.uilab.banner.OKAlertBanner;
import o.C35399nuc;

/* JADX INFO: loaded from: classes18.dex */
public final class nJO implements ViewBinding {
    public final OKAlertBanner AEQbTJ;
    public final OKAlertBanner KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public OKAlertBanner getRoot() {
        return this.AEQbTJ;
    }

    public nJO(@androidx.annotation.NonNull OKAlertBanner oKAlertBanner, @androidx.annotation.NonNull OKAlertBanner oKAlertBanner2) {
        this.AEQbTJ = oKAlertBanner;
        this.KWHzl = oKAlertBanner2;
    }

    public static nJO copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.gwTjWJ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static nJO OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        OKAlertBanner oKAlertBanner = (OKAlertBanner) view;
        return new nJO(oKAlertBanner, oKAlertBanner);
    }
}
