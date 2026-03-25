package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C25493ixk;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iLY extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;

    public iLY(java.lang.Object obj, android.view.View view, int i, android.widget.LinearLayout linearLayout, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3) {
        super(obj, view, i);
        this.EZpvd = linearLayout;
        this.AEQbTJ = textView;
        this.copydefault = textView2;
        this.OLrzqt = textView3;
    }

    public static iLY AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static iLY KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (iLY) ViewDataBinding.inflateInternal(layoutInflater, C25493ixk.Activity.DQzvGNdrmXxu, viewGroup, z, obj);
    }
}
