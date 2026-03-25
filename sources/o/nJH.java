package o;

import androidx.viewbinding.ViewBinding;
import com.okinc.uilab.banner.OKAlertBanner;
import o.C35399nuc;

/* JADX INFO: loaded from: classes18.dex */
public final class nJH implements ViewBinding {
    public final OKAlertBanner KWHzl;
    public final OKAlertBanner copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public OKAlertBanner getRoot() {
        return this.KWHzl;
    }

    public nJH(@androidx.annotation.NonNull OKAlertBanner oKAlertBanner, @androidx.annotation.NonNull OKAlertBanner oKAlertBanner2) {
        this.KWHzl = oKAlertBanner;
        this.copydefault = oKAlertBanner2;
    }

    public static nJH EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.DCUTEI, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static nJH EZpvd(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        OKAlertBanner oKAlertBanner = (OKAlertBanner) view;
        return new nJH(oKAlertBanner, oKAlertBanner);
    }
}
