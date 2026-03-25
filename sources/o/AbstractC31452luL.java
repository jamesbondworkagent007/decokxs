package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.luL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC31452luL extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView KWHzl;
    public final C52794wYp OLrzqt;
    public final android.widget.TextView copydefault;

    public AbstractC31452luL(java.lang.Object obj, android.view.View view, int i, C52794wYp c52794wYp, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3) {
        super(obj, view, i);
        this.OLrzqt = c52794wYp;
        this.KWHzl = textView;
        this.copydefault = textView2;
        this.AEQbTJ = textView3;
    }

    public static AbstractC31452luL EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return EZpvd(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC31452luL EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC31452luL) ViewDataBinding.inflateInternal(layoutInflater, C31351lsQ.ActionBar.wlaJM, null, false, obj);
    }
}
