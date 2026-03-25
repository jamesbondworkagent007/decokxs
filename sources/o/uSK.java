package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public abstract class uSK extends ViewDataBinding {
    public final RecyclerView EZpvd;
    public final wYF KWHzl;

    public uSK(java.lang.Object obj, android.view.View view, int i, wYF wyf, RecyclerView recyclerView) {
        super(obj, view, i);
        this.KWHzl = wyf;
        this.EZpvd = recyclerView;
    }

    public static uSK copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return copydefault(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static uSK copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (uSK) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.invokespecialgBtXYZ, viewGroup, z, obj);
    }
}
