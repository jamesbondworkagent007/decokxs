package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lws, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC31590lws extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final wYK EZpvd;
    public final android.widget.TextView KWHzl;
    public final C52794wYp OLrzqt;
    public final ConstraintLayout copydefault;
    public final android.widget.TextView djBIcL;

    public AbstractC31590lws(java.lang.Object obj, android.view.View view, int i, C52794wYp c52794wYp, wYK wyk, ConstraintLayout constraintLayout, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3) {
        super(obj, view, i);
        this.OLrzqt = c52794wYp;
        this.EZpvd = wyk;
        this.copydefault = constraintLayout;
        this.KWHzl = textView;
        this.AEQbTJ = textView2;
        this.djBIcL = textView3;
    }

    public static AbstractC31590lws KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return KWHzl(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC31590lws KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC31590lws) ViewDataBinding.inflateInternal(layoutInflater, C31351lsQ.ActionBar.DCJXGO, null, false, obj);
    }
}
