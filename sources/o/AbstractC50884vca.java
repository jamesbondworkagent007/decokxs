package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vca, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC50884vca extends ViewDataBinding {
    public final C53518wmx EZpvd;
    public final C55317xhf KWHzl;

    public AbstractC50884vca(java.lang.Object obj, android.view.View view, int i, C53518wmx c53518wmx, C55317xhf c55317xhf) {
        super(obj, view, i);
        this.EZpvd = c53518wmx;
        this.KWHzl = c55317xhf;
    }

    public static AbstractC50884vca AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC50884vca AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC50884vca) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.iMXFZQ, viewGroup, z, obj);
    }
}
