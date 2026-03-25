package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.luC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC31443luC extends ViewDataBinding {
    public final wYK AEQbTJ;
    public final ConstraintLayout EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;
    public final AbstractC31595lwx djBIcL;

    public AbstractC31443luC(java.lang.Object obj, android.view.View view, int i, wYK wyk, android.widget.TextView textView, android.widget.TextView textView2, ConstraintLayout constraintLayout, android.widget.TextView textView3, AbstractC31595lwx abstractC31595lwx) {
        super(obj, view, i);
        this.AEQbTJ = wyk;
        this.OLrzqt = textView;
        this.copydefault = textView2;
        this.EZpvd = constraintLayout;
        this.KWHzl = textView3;
        this.djBIcL = abstractC31595lwx;
    }

    public static AbstractC31443luC KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return KWHzl(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC31443luC KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC31443luC) ViewDataBinding.inflateInternal(layoutInflater, C31351lsQ.ActionBar.getNewProxyInstance, null, false, obj);
    }
}
