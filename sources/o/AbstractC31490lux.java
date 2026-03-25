package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lux, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC31490lux extends ViewDataBinding {
    public final RecyclerView AEQbTJ;
    public final C52794wYp EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final ConstraintLayout copydefault;
    public final ConstraintLayout gEmmrt;

    public AbstractC31490lux(java.lang.Object obj, android.view.View view, int i, android.widget.ImageView imageView, C52794wYp c52794wYp, ConstraintLayout constraintLayout, RecyclerView recyclerView, android.widget.TextView textView, ConstraintLayout constraintLayout2) {
        super(obj, view, i);
        this.OLrzqt = imageView;
        this.EZpvd = c52794wYp;
        this.copydefault = constraintLayout;
        this.AEQbTJ = recyclerView;
        this.KWHzl = textView;
        this.gEmmrt = constraintLayout2;
    }

    public static AbstractC31490lux KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC31490lux OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC31490lux) ViewDataBinding.inflateInternal(layoutInflater, C31351lsQ.ActionBar.getFieldNames, null, false, obj);
    }
}
