package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C47315tni;

/* JADX INFO: renamed from: o.tok, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47370tok extends ViewDataBinding {
    public final C55018xby AEQbTJ;
    public final RecyclerView OLrzqt;

    public AbstractC47370tok(java.lang.Object obj, android.view.View view, int i, RecyclerView recyclerView, C55018xby c55018xby) {
        super(obj, view, i);
        this.OLrzqt = recyclerView;
        this.AEQbTJ = c55018xby;
    }

    public static AbstractC47370tok AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47370tok KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47370tok) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.zLjUOn, viewGroup, z, obj);
    }
}
