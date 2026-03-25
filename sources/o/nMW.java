package o;

import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C35399nuc;

/* JADX INFO: loaded from: classes8.dex */
public abstract class nMW extends ViewDataBinding {
    public final android.widget.FrameLayout EZpvd;
    public final android.widget.TextView KWHzl;

    @Bindable
    public C35694oAf copydefault;

    public nMW(java.lang.Object obj, android.view.View view, int i, android.widget.FrameLayout frameLayout, android.widget.TextView textView) {
        super(obj, view, i);
        this.EZpvd = frameLayout;
        this.KWHzl = textView;
    }

    public static nMW EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static nMW KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (nMW) ViewDataBinding.inflateInternal(layoutInflater, C35399nuc.Dialog.DUUtXg, viewGroup, z, obj);
    }
}
