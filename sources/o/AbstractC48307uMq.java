package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: renamed from: o.uMq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC48307uMq extends ViewDataBinding {
    public final AppCompatTextView AEQbTJ;
    public final AppCompatImageView AYXKKw;
    public final ViewPager2 AhwBna;
    public final C33546myW AkhnZx;
    public final FragmentContainerView EZpvd;

    @Bindable
    public boolean KWHzl;

    @Bindable
    public boolean OLrzqt;
    public final AppBarLayout copydefault;

    @Bindable
    public boolean djBIcL;
    public final C55173xeu fetchVPNInfo;
    public final C55254xgV gEmmrt;

    @Bindable
    public boolean valueOf;

    public abstract void EZpvd(boolean z);

    public abstract void KWHzl(boolean z);

    public abstract void OLrzqt(boolean z);

    public abstract void copydefault(boolean z);

    public AbstractC48307uMq(java.lang.Object obj, android.view.View view, int i, AppBarLayout appBarLayout, FragmentContainerView fragmentContainerView, AppCompatTextView appCompatTextView, C55254xgV c55254xgV, ViewPager2 viewPager2, AppCompatImageView appCompatImageView, C33546myW c33546myW, C55173xeu c55173xeu) {
        super(obj, view, i);
        this.copydefault = appBarLayout;
        this.EZpvd = fragmentContainerView;
        this.AEQbTJ = appCompatTextView;
        this.gEmmrt = c55254xgV;
        this.AhwBna = viewPager2;
        this.AYXKKw = appCompatImageView;
        this.AkhnZx = c33546myW;
        this.fetchVPNInfo = c55173xeu;
    }
}
