package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C52761wXj;

/* JADX INFO: loaded from: classes11.dex */
public abstract class wZY extends ViewDataBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;

    public wZY(java.lang.Object obj, android.view.View view, int i, android.widget.TextView textView, android.widget.LinearLayout linearLayout, android.widget.TextView textView2, android.widget.TextView textView3, android.widget.TextView textView4) {
        super(obj, view, i);
        this.OLrzqt = textView;
        this.AEQbTJ = linearLayout;
        this.EZpvd = textView2;
        this.copydefault = textView3;
        this.KWHzl = textView4;
    }

    public static wZY AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return AEQbTJ(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static wZY AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (wZY) ViewDataBinding.inflateInternal(layoutInflater, C52761wXj.Fragment.AuCTel, null, false, obj);
    }
}
