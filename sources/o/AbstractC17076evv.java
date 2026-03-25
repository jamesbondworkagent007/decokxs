package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.evv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17076evv extends ViewDataBinding {
    public final android.widget.TextView KWHzl;
    public final RecyclerView OLrzqt;

    public AbstractC17076evv(java.lang.Object obj, android.view.View view, int i, RecyclerView recyclerView, android.widget.TextView textView) {
        super(obj, view, i);
        this.OLrzqt = recyclerView;
        this.KWHzl = textView;
    }

    public static AbstractC17076evv AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return EZpvd(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC17076evv EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC17076evv) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.DzOuPm, null, false, obj);
    }
}
