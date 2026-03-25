package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C35964oKf;

/* JADX INFO: loaded from: classes8.dex */
public abstract class oMF extends ViewDataBinding {
    public final C52794wYp EZpvd;
    public final RecyclerView KWHzl;
    public final android.widget.LinearLayout copydefault;

    public oMF(java.lang.Object obj, android.view.View view, int i, C52794wYp c52794wYp, android.widget.LinearLayout linearLayout, RecyclerView recyclerView) {
        super(obj, view, i);
        this.EZpvd = c52794wYp;
        this.copydefault = linearLayout;
        this.KWHzl = recyclerView;
    }

    public static oMF copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return copydefault(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static oMF copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (oMF) ViewDataBinding.inflateInternal(layoutInflater, C35964oKf.Application.QfsBiF, viewGroup, z, obj);
    }
}
