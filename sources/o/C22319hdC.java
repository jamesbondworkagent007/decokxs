package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import o.C22366hdx;

/* JADX INFO: renamed from: o.hdC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22319hdC implements ViewBinding {
    public final C55230xfy AEQbTJ;
    public final C55173xeu EZpvd;
    public final TabLayout KWHzl;
    public final ConstraintLayout OLrzqt;
    public final AppCompatImageView copydefault;
    public final android.view.View gEmmrt;
    public final ViewPager2 valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public C22319hdC(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull C55230xfy c55230xfy, @androidx.annotation.NonNull TabLayout tabLayout, @androidx.annotation.NonNull ViewPager2 viewPager2, @androidx.annotation.NonNull android.view.View view) {
        this.OLrzqt = constraintLayout;
        this.EZpvd = c55173xeu;
        this.copydefault = appCompatImageView;
        this.AEQbTJ = c55230xfy;
        this.KWHzl = tabLayout;
        this.valueOf = viewPager2;
        this.gEmmrt = view;
    }

    public static C22319hdC EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C22366hdx.Activity.EZpvd, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C22319hdC EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C22366hdx.ActionBar.zsXlph;
        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
        if (c55173xeu != null) {
            i = C22366hdx.ActionBar.dNCPSb;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = C22366hdx.ActionBar.ODXsMY;
                C55230xfy c55230xfy = (C55230xfy) ViewBindings.findChildViewById(view, i);
                if (c55230xfy != null) {
                    i = C22366hdx.ActionBar.USBtdM;
                    TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, i);
                    if (tabLayout != null) {
                        i = C22366hdx.ActionBar.fdOvFl;
                        ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                        if (viewPager2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C22366hdx.ActionBar.DGUQLIOvDItG))) != null) {
                            return new C22319hdC((ConstraintLayout) view, c55173xeu, appCompatImageView, c55230xfy, tabLayout, viewPager2, viewFindChildViewById);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
