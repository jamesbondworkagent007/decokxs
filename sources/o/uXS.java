package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public abstract class uXS extends ViewDataBinding {
    public final C55258xgZ AEQbTJ;
    public final RecyclerView copydefault;

    public uXS(java.lang.Object obj, android.view.View view, int i, C55258xgZ c55258xgZ, RecyclerView recyclerView) {
        super(obj, view, i);
        this.AEQbTJ = c55258xgZ;
        this.copydefault = recyclerView;
    }

    public static uXS OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static uXS KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (uXS) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.QnnRaN, viewGroup, z, obj);
    }
}
