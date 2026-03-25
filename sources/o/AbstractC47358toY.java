package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import o.C47315tni;

/* JADX INFO: renamed from: o.toY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47358toY extends ViewDataBinding {
    public final android.view.View EZpvd;
    public final ViewPager2 KWHzl;
    public final C55254xgV OLrzqt;

    public AbstractC47358toY(java.lang.Object obj, android.view.View view, int i, ViewPager2 viewPager2, C55254xgV c55254xgV, android.view.View view2) {
        super(obj, view, i);
        this.KWHzl = viewPager2;
        this.OLrzqt = c55254xgV;
        this.EZpvd = view2;
    }

    public static AbstractC47358toY copydefault(@androidx.annotation.NonNull android.view.View view) {
        return EZpvd(view, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47358toY EZpvd(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47358toY) ViewDataBinding.bind(obj, view, C47315tni.ActionBar.fZBcTu);
    }
}
