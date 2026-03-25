package o;

import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: o.emp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16593emp extends ViewDataBinding {
    public final ViewPager2 AEQbTJ;
    public final android.widget.LinearLayout EZpvd;
    public final TabLayout OLrzqt;

    public AbstractC16593emp(java.lang.Object obj, android.view.View view, int i, android.widget.LinearLayout linearLayout, TabLayout tabLayout, ViewPager2 viewPager2) {
        super(obj, view, i);
        this.EZpvd = linearLayout;
        this.OLrzqt = tabLayout;
        this.AEQbTJ = viewPager2;
    }
}
