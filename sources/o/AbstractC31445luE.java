package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.luE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC31445luE extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final ConstraintLayout KWHzl;
    public final RecyclerView OLrzqt;

    public AbstractC31445luE(java.lang.Object obj, android.view.View view, int i, ConstraintLayout constraintLayout, RecyclerView recyclerView, android.widget.TextView textView) {
        super(obj, view, i);
        this.KWHzl = constraintLayout;
        this.OLrzqt = recyclerView;
        this.AEQbTJ = textView;
    }

    public static AbstractC31445luE AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return EZpvd(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC31445luE EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC31445luE) ViewDataBinding.inflateInternal(layoutInflater, C31351lsQ.ActionBar.hDKMBd, viewGroup, z, obj);
    }
}
