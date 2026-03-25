package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.tqh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47473tqh extends ViewDataBinding {
    public final sCX OLrzqt;

    public AbstractC47473tqh(java.lang.Object obj, android.view.View view, int i, sCX scx) {
        super(obj, view, i);
        this.OLrzqt = scx;
    }

    public static AbstractC47473tqh OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47473tqh AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47473tqh) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.dmfpNf, viewGroup, z, obj);
    }
}
