package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vdL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC50922vdL extends ViewDataBinding {
    public final C50031uzj AEQbTJ;
    public final C50031uzj EZpvd;
    public final C50031uzj KWHzl;

    public AbstractC50922vdL(java.lang.Object obj, android.view.View view, int i, C50031uzj c50031uzj, C50031uzj c50031uzj2, C50031uzj c50031uzj3) {
        super(obj, view, i);
        this.AEQbTJ = c50031uzj;
        this.EZpvd = c50031uzj2;
        this.KWHzl = c50031uzj3;
    }

    public static AbstractC50922vdL KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return EZpvd(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC50922vdL EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC50922vdL) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.dtVxwd, viewGroup, z, obj);
    }
}
