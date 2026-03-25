package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eux, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17025eux extends ViewDataBinding {
    public final AbstractC17023euv AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final RecyclerView AhwBna;
    public final AbstractC17023euv EZpvd;
    public final ConstraintLayout KWHzl;
    public final ConstraintLayout OLrzqt;
    public final android.view.View copydefault;
    public final RecyclerView djBIcL;
    public final android.widget.TextView valueOf;

    public AbstractC17025eux(java.lang.Object obj, android.view.View view, int i, ConstraintLayout constraintLayout, AbstractC17023euv abstractC17023euv, AbstractC17023euv abstractC17023euv2, ConstraintLayout constraintLayout2, android.view.View view2, RecyclerView recyclerView, RecyclerView recyclerView2, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.OLrzqt = constraintLayout;
        this.EZpvd = abstractC17023euv;
        this.AEQbTJ = abstractC17023euv2;
        this.KWHzl = constraintLayout2;
        this.copydefault = view2;
        this.AhwBna = recyclerView;
        this.djBIcL = recyclerView2;
        this.AYXKKw = textView;
        this.valueOf = textView2;
    }

    public static AbstractC17025eux KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC17025eux OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC17025eux) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.HJWChPfvRMlC, viewGroup, z, obj);
    }
}
