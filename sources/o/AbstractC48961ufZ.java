package o;

import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: o.ufZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC48961ufZ extends ViewDataBinding {
    public final androidx.appcompat.widget.Toolbar AEQbTJ;
    public final ViewPager EZpvd;
    public final AppBarLayout KWHzl;
    public final TabLayout OLrzqt;

    public AbstractC48961ufZ(java.lang.Object obj, android.view.View view, int i, AppBarLayout appBarLayout, TabLayout tabLayout, androidx.appcompat.widget.Toolbar toolbar, ViewPager viewPager) {
        super(obj, view, i);
        this.KWHzl = appBarLayout;
        this.OLrzqt = tabLayout;
        this.AEQbTJ = toolbar;
        this.EZpvd = viewPager;
    }
}
