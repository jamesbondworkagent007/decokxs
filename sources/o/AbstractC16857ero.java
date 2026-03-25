package o;

import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ero, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16857ero extends ViewDataBinding {

    @Bindable
    public C15489eKf AEQbTJ;
    public final AbstractC16867ery EZpvd;
    public final RecyclerView KWHzl;
    public final AbstractC16746epj OLrzqt;

    public abstract void KWHzl(@androidx.annotation.Nullable C15489eKf c15489eKf);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C15489eKf OLrzqt() {
        return this.AEQbTJ;
    }

    public AbstractC16857ero(java.lang.Object obj, android.view.View view, int i, RecyclerView recyclerView, AbstractC16746epj abstractC16746epj, AbstractC16867ery abstractC16867ery) {
        super(obj, view, i);
        this.KWHzl = recyclerView;
        this.OLrzqt = abstractC16746epj;
        this.EZpvd = abstractC16867ery;
    }

    public static AbstractC16857ero EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16857ero KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16857ero) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.GCXiNH, viewGroup, z, obj);
    }
}
