package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uZt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC48663uZt extends ViewDataBinding {
    public final wYF AEQbTJ;
    public final wYC EZpvd;
    public final C55172xet KWHzl;
    public final ViewPager2 OLrzqt;

    public AbstractC48663uZt(java.lang.Object obj, android.view.View view, int i, wYF wyf, wYC wyc, C55172xet c55172xet, ViewPager2 viewPager2) {
        super(obj, view, i);
        this.AEQbTJ = wyf;
        this.EZpvd = wyc;
        this.KWHzl = c55172xet;
        this.OLrzqt = viewPager2;
    }

    public static AbstractC48663uZt EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return copydefault(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC48663uZt copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC48663uZt) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.RhjxDW, viewGroup, z, obj);
    }
}
