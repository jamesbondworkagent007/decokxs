package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public abstract class uWF extends ViewDataBinding {
    public final AppCompatImageView AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final LinearLayoutCompat EZpvd;
    public final ConstraintLayout KWHzl;
    public final ConstraintLayout OLrzqt;
    public final C51648vqw copydefault;
    public final android.widget.TextView gEmmrt;

    public uWF(java.lang.Object obj, android.view.View view, int i, C51648vqw c51648vqw, LinearLayoutCompat linearLayoutCompat, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2, android.widget.TextView textView, AppCompatTextView appCompatTextView) {
        super(obj, view, i);
        this.copydefault = c51648vqw;
        this.EZpvd = linearLayoutCompat;
        this.OLrzqt = constraintLayout;
        this.AEQbTJ = appCompatImageView;
        this.KWHzl = constraintLayout2;
        this.gEmmrt = textView;
        this.AYXKKw = appCompatTextView;
    }

    public static uWF EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static uWF KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (uWF) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.setPageName, viewGroup, z, obj);
    }
}
