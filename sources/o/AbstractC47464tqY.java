package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.tqY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47464tqY extends ViewDataBinding {
    public final wYS EZpvd;

    public AbstractC47464tqY(java.lang.Object obj, android.view.View view, int i, wYS wys) {
        super(obj, view, i);
        this.EZpvd = wys;
    }

    public static AbstractC47464tqY KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return copydefault(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47464tqY copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47464tqY) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.spnCvw, viewGroup, z, obj);
    }
}
