package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.enC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16607enC extends ViewDataBinding {
    public final AppCompatImageView AEQbTJ;
    public final RecyclerView EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.view.View OLrzqt;
    public final C57468yiw copydefault;

    public AbstractC16607enC(java.lang.Object obj, android.view.View view, int i, C57468yiw c57468yiw, AppCompatImageView appCompatImageView, android.widget.TextView textView, RecyclerView recyclerView, android.view.View view2) {
        super(obj, view, i);
        this.copydefault = c57468yiw;
        this.AEQbTJ = appCompatImageView;
        this.KWHzl = textView;
        this.EZpvd = recyclerView;
        this.OLrzqt = view2;
    }

    public static AbstractC16607enC copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return EZpvd(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16607enC EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16607enC) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.iqMDAV, viewGroup, z, obj);
    }
}
