package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public abstract class uTU extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final AppCompatImageView copydefault;

    public uTU(java.lang.Object obj, android.view.View view, int i, android.widget.TextView textView, AppCompatImageView appCompatImageView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.AEQbTJ = textView;
        this.copydefault = appCompatImageView;
        this.EZpvd = textView2;
    }

    public static uTU copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return EZpvd(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static uTU EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (uTU) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.DcMfJKDGTeJD, viewGroup, z, obj);
    }
}
