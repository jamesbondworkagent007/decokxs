package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import o.C47315tni;

/* JADX INFO: renamed from: o.toN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47347toN extends ViewDataBinding {
    public final AppBarLayout AEQbTJ;
    public final android.widget.FrameLayout EZpvd;
    public final android.widget.FrameLayout copydefault;

    public AbstractC47347toN(java.lang.Object obj, android.view.View view, int i, AppBarLayout appBarLayout, android.widget.FrameLayout frameLayout, android.widget.FrameLayout frameLayout2) {
        super(obj, view, i);
        this.AEQbTJ = appBarLayout;
        this.copydefault = frameLayout;
        this.EZpvd = frameLayout2;
    }

    public static AbstractC47347toN KWHzl(@androidx.annotation.NonNull android.view.View view) {
        return AEQbTJ(view, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47347toN AEQbTJ(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47347toN) ViewDataBinding.bind(obj, view, C47315tni.ActionBar.RJOkX);
    }
}
