package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uSw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC48477uSw extends ViewDataBinding {
    public final C55258xgZ EZpvd;
    public final C55258xgZ copydefault;

    public AbstractC48477uSw(java.lang.Object obj, android.view.View view, int i, C55258xgZ c55258xgZ, C55258xgZ c55258xgZ2) {
        super(obj, view, i);
        this.EZpvd = c55258xgZ;
        this.copydefault = c55258xgZ2;
    }

    public static AbstractC48477uSw KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC48477uSw KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC48477uSw) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.RTWSvT, viewGroup, z, obj);
    }
}
