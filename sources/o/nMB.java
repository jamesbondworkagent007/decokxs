package o;

import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C35399nuc;

/* JADX INFO: loaded from: classes8.dex */
public abstract class nMB extends ViewDataBinding {
    public final android.widget.LinearLayout AEQbTJ;

    @Bindable
    public C37741ozZ KWHzl;
    public final android.widget.TextView OLrzqt;

    public nMB(java.lang.Object obj, android.view.View view, int i, android.widget.LinearLayout linearLayout, android.widget.TextView textView) {
        super(obj, view, i);
        this.AEQbTJ = linearLayout;
        this.OLrzqt = textView;
    }

    public static nMB copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return EZpvd(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static nMB EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (nMB) ViewDataBinding.inflateInternal(layoutInflater, C35399nuc.Dialog.DGUQLIOvDItG, viewGroup, z, obj);
    }
}
