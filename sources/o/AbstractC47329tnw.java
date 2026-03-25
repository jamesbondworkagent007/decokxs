package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;
import o.C47315tni;

/* JADX INFO: renamed from: o.tnw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47329tnw extends ViewDataBinding {
    public final MaterialToolbar AEQbTJ;
    public final ViewPager2 KWHzl;
    public final TabLayout copydefault;

    public AbstractC47329tnw(java.lang.Object obj, android.view.View view, int i, ViewPager2 viewPager2, TabLayout tabLayout, MaterialToolbar materialToolbar) {
        super(obj, view, i);
        this.KWHzl = viewPager2;
        this.copydefault = tabLayout;
        this.AEQbTJ = materialToolbar;
    }

    public static AbstractC47329tnw OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return KWHzl(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47329tnw KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47329tnw) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.AhwBna, null, false, obj);
    }
}
