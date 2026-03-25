package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public abstract class uRR extends ViewDataBinding {
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;

    public uRR(java.lang.Object obj, android.view.View view, int i, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.OLrzqt = textView;
        this.copydefault = textView2;
    }

    public static uRR copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return copydefault(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static uRR copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (uRR) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.DPHNDa, viewGroup, z, obj);
    }
}
