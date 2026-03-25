package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uUf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC48514uUf extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final ConstraintLayout EZpvd;
    public final android.widget.TextView KWHzl;
    public final AppCompatImageView OLrzqt;
    public final ConstraintLayout copydefault;
    public final android.widget.TextView djBIcL;
    public final AppCompatImageView gEmmrt;

    public AbstractC48514uUf(java.lang.Object obj, android.view.View view, int i, ConstraintLayout constraintLayout, android.widget.TextView textView, AppCompatImageView appCompatImageView, android.widget.TextView textView2, ConstraintLayout constraintLayout2, android.widget.TextView textView3, AppCompatImageView appCompatImageView2, android.widget.TextView textView4) {
        super(obj, view, i);
        this.EZpvd = constraintLayout;
        this.KWHzl = textView;
        this.OLrzqt = appCompatImageView;
        this.AEQbTJ = textView2;
        this.copydefault = constraintLayout2;
        this.djBIcL = textView3;
        this.gEmmrt = appCompatImageView2;
        this.AhwBna = textView4;
    }

    public static AbstractC48514uUf AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC48514uUf KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC48514uUf) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.getSessionID, viewGroup, z, obj);
    }
}
