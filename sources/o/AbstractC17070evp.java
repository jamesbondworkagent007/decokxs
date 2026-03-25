package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.evp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17070evp extends ViewDataBinding {
    public final RecyclerView OLrzqt;
    public final android.widget.TextView copydefault;

    public AbstractC17070evp(java.lang.Object obj, android.view.View view, int i, RecyclerView recyclerView, android.widget.TextView textView) {
        super(obj, view, i);
        this.OLrzqt = recyclerView;
        this.copydefault = textView;
    }

    public static AbstractC17070evp OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return copydefault(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC17070evp copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC17070evp) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.onStatusChanged, viewGroup, z, obj);
    }
}
