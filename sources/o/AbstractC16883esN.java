package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.esN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16883esN extends ViewDataBinding {
    public final C52794wYp EZpvd;
    public final android.widget.TextView KWHzl;

    public AbstractC16883esN(java.lang.Object obj, android.view.View view, int i, C52794wYp c52794wYp, android.widget.TextView textView) {
        super(obj, view, i);
        this.EZpvd = c52794wYp;
        this.KWHzl = textView;
    }

    public static AbstractC16883esN copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16883esN KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16883esN) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.DeEinT, viewGroup, z, obj);
    }
}
