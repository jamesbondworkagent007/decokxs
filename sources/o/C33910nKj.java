package o;

import androidx.viewbinding.ViewBinding;
import com.okinc.uilab.banner.OKAlertBanner;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nKj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33910nKj implements ViewBinding {
    public final OKAlertBanner AEQbTJ;
    public final OKAlertBanner copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public OKAlertBanner getRoot() {
        return this.copydefault;
    }

    public C33910nKj(@androidx.annotation.NonNull OKAlertBanner oKAlertBanner, @androidx.annotation.NonNull OKAlertBanner oKAlertBanner2) {
        this.copydefault = oKAlertBanner;
        this.AEQbTJ = oKAlertBanner2;
    }

    public static C33910nKj OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.USBtdM, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C33910nKj OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        OKAlertBanner oKAlertBanner = (OKAlertBanner) view;
        return new C33910nKj(oKAlertBanner, oKAlertBanner);
    }
}
