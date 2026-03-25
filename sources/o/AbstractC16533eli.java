package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eli, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16533eli extends ViewDataBinding {
    public final C52794wYp EZpvd;
    public final RecyclerView OLrzqt;
    public final android.widget.TextView copydefault;

    public AbstractC16533eli(java.lang.Object obj, android.view.View view, int i, C52794wYp c52794wYp, RecyclerView recyclerView, android.widget.TextView textView) {
        super(obj, view, i);
        this.EZpvd = c52794wYp;
        this.OLrzqt = recyclerView;
        this.copydefault = textView;
    }

    public static AbstractC16533eli AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return EZpvd(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16533eli EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16533eli) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.hlkKmr, viewGroup, z, obj);
    }
}
