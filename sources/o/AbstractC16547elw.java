package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.elw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16547elw extends ViewDataBinding {
    public final C21286gwr copydefault;

    public AbstractC16547elw(java.lang.Object obj, android.view.View view, int i, C21286gwr c21286gwr) {
        super(obj, view, i);
        this.copydefault = c21286gwr;
    }

    public static AbstractC16547elw AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16547elw AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16547elw) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.zOIQXb, viewGroup, z, obj);
    }
}
