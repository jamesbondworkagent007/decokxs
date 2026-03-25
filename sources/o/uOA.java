package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public abstract class uOA extends ViewDataBinding {
    public final C33546myW KWHzl;
    public final RecyclerView OLrzqt;

    public uOA(java.lang.Object obj, android.view.View view, int i, RecyclerView recyclerView, C33546myW c33546myW) {
        super(obj, view, i);
        this.OLrzqt = recyclerView;
        this.KWHzl = c33546myW;
    }

    public static uOA KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return EZpvd(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static uOA EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (uOA) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.OJuSTm, viewGroup, z, obj);
    }
}
