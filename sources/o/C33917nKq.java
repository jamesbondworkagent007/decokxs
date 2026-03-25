package o;

import androidx.viewbinding.ViewBinding;
import com.okinc.uilab.banner.OKAlertBanner;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nKq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33917nKq implements ViewBinding {
    public final OKAlertBanner EZpvd;
    public final OKAlertBanner KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public OKAlertBanner getRoot() {
        return this.EZpvd;
    }

    public C33917nKq(@androidx.annotation.NonNull OKAlertBanner oKAlertBanner, @androidx.annotation.NonNull OKAlertBanner oKAlertBanner2) {
        this.EZpvd = oKAlertBanner;
        this.KWHzl = oKAlertBanner2;
    }

    public static C33917nKq AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.fdOvFl, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C33917nKq EZpvd(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        OKAlertBanner oKAlertBanner = (OKAlertBanner) view;
        return new C33917nKq(oKAlertBanner, oKAlertBanner);
    }
}
