package o;

import androidx.viewbinding.ViewBinding;
import com.okinc.uilab.banner.OKBannerLayout;
import o.C52761wXj;

/* JADX INFO: renamed from: o.xai, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54949xai implements ViewBinding {
    public final OKBannerLayout EZpvd;
    public final OKBannerLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public OKBannerLayout getRoot() {
        return this.EZpvd;
    }

    public C54949xai(@androidx.annotation.NonNull OKBannerLayout oKBannerLayout, @androidx.annotation.NonNull OKBannerLayout oKBannerLayout2) {
        this.EZpvd = oKBannerLayout;
        this.copydefault = oKBannerLayout2;
    }

    public static C54949xai EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C52761wXj.Fragment.AuCTelauCTel, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C54949xai AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        OKBannerLayout oKBannerLayout = (OKBannerLayout) view;
        return new C54949xai(oKBannerLayout, oKBannerLayout);
    }
}
