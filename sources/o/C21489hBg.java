package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.tabs.TabLayout;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hBg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21489hBg implements ViewBinding {
    public final TabLayout AEQbTJ;
    public final AppCompatImageView EZpvd;
    public final AppCompatImageView KWHzl;
    public final ConstraintLayout OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public C21489hBg(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull TabLayout tabLayout) {
        this.OLrzqt = constraintLayout;
        this.KWHzl = appCompatImageView;
        this.EZpvd = appCompatImageView2;
        this.AEQbTJ = tabLayout;
    }

    public static C21489hBg EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.frkDMe, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C21489hBg OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.hijVBL;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = C23274hvD.Application.ITrustedWebActivityServiceStubProxy;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView2 != null) {
                i = C23274hvD.Application.withContextAvailable;
                TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, i);
                if (tabLayout != null) {
                    return new C21489hBg((ConstraintLayout) view, appCompatImageView, appCompatImageView2, tabLayout);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
