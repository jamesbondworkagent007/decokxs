package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eqI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16772eqI extends ViewDataBinding {
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView OLrzqt;

    public AbstractC16772eqI(java.lang.Object obj, android.view.View view, int i, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.OLrzqt = textView;
        this.EZpvd = textView2;
    }

    public static AbstractC16772eqI AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return copydefault(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16772eqI copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16772eqI) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.sIqKDg, null, false, obj);
    }
}
