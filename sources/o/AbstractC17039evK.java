package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.evK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17039evK extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final C55008xbo EZpvd;
    public final android.widget.TextView KWHzl;
    public final C55008xbo OLrzqt;

    public AbstractC17039evK(java.lang.Object obj, android.view.View view, int i, C55008xbo c55008xbo, C55008xbo c55008xbo2, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.OLrzqt = c55008xbo;
        this.EZpvd = c55008xbo2;
        this.KWHzl = textView;
        this.AEQbTJ = textView2;
    }

    public static AbstractC17039evK KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC17039evK OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC17039evK) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.OCdtug, null, false, obj);
    }
}
