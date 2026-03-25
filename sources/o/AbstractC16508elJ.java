package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.elJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16508elJ extends ViewDataBinding {
    public final RecyclerView AEQbTJ;
    public final wYF EZpvd;
    public final android.widget.TextView KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final android.widget.FrameLayout copydefault;

    public AbstractC16508elJ(java.lang.Object obj, android.view.View view, int i, wYF wyf, android.widget.TextView textView, LinearLayoutCompat linearLayoutCompat, android.widget.FrameLayout frameLayout, RecyclerView recyclerView) {
        super(obj, view, i);
        this.EZpvd = wyf;
        this.KWHzl = textView;
        this.OLrzqt = linearLayoutCompat;
        this.copydefault = frameLayout;
        this.AEQbTJ = recyclerView;
    }

    public static AbstractC16508elJ KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16508elJ KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16508elJ) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.getPriority, viewGroup, z, obj);
    }
}
