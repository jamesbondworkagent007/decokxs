package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eiM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16352eiM extends ViewDataBinding {
    public final C55178xez KWHzl;

    public AbstractC16352eiM(java.lang.Object obj, android.view.View view, int i, C55178xez c55178xez) {
        super(obj, view, i);
        this.KWHzl = c55178xez;
    }

    public static AbstractC16352eiM KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return KWHzl(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16352eiM KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16352eiM) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.ffGIBT, null, false, obj);
    }
}
