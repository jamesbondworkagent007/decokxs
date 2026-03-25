package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.tqn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47479tqn extends ViewDataBinding {
    public final C52794wYp EZpvd;

    public AbstractC47479tqn(java.lang.Object obj, android.view.View view, int i, C52794wYp c52794wYp) {
        super(obj, view, i);
        this.EZpvd = c52794wYp;
    }

    public static AbstractC47479tqn EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47479tqn AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47479tqn) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.gwTjWJ, viewGroup, z, obj);
    }
}
