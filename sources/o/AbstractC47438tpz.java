package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.tpz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47438tpz extends ViewDataBinding {
    public final C45862szb EZpvd;

    public AbstractC47438tpz(java.lang.Object obj, android.view.View view, int i, C45862szb c45862szb) {
        super(obj, view, i);
        this.EZpvd = c45862szb;
    }

    public static AbstractC47438tpz AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return EZpvd(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47438tpz EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47438tpz) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.iZzfmt, viewGroup, z, obj);
    }
}
