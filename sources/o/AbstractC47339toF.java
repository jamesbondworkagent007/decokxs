package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.toF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47339toF extends ViewDataBinding {
    public final C55178xez copydefault;

    public AbstractC47339toF(java.lang.Object obj, android.view.View view, int i, C55178xez c55178xez) {
        super(obj, view, i);
        this.copydefault = c55178xez;
    }

    public static AbstractC47339toF OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47339toF AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47339toF) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.QKVWgx, viewGroup, z, obj);
    }
}
