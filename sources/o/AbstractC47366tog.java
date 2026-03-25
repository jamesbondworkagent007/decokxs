package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C47315tni;

/* JADX INFO: renamed from: o.tog, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47366tog extends ViewDataBinding {
    public final RecyclerView KWHzl;

    public AbstractC47366tog(java.lang.Object obj, android.view.View view, int i, RecyclerView recyclerView) {
        super(obj, view, i);
        this.KWHzl = recyclerView;
    }

    public static AbstractC47366tog OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47366tog KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47366tog) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.zsXlph, viewGroup, z, obj);
    }
}
