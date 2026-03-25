package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.erc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16845erc extends ViewDataBinding {

    @Bindable
    public C10219bkN AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView AkhnZx;
    public final Guideline EZpvd;
    public final android.widget.TextView KWHzl;

    @Bindable
    public int OLrzqt;

    @Bindable
    public java.lang.Boolean copydefault;

    @Bindable
    public int djBIcL;
    public final AppCompatImageView gEmmrt;
    public final android.widget.TextView valueOf;
    public final android.widget.TextView values;

    public abstract void KWHzl(@androidx.annotation.Nullable java.lang.Boolean bool);

    public abstract void OLrzqt(@androidx.annotation.Nullable C10219bkN c10219bkN);

    public AbstractC16845erc(java.lang.Object obj, android.view.View view, int i, android.widget.TextView textView, Guideline guideline, android.widget.TextView textView2, android.widget.TextView textView3, AppCompatImageView appCompatImageView, android.widget.TextView textView4, android.widget.TextView textView5, android.widget.TextView textView6) {
        super(obj, view, i);
        this.KWHzl = textView;
        this.EZpvd = guideline;
        this.valueOf = textView2;
        this.AYXKKw = textView3;
        this.gEmmrt = appCompatImageView;
        this.AhwBna = textView4;
        this.AkhnZx = textView5;
        this.values = textView6;
    }

    public static AbstractC16845erc copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return EZpvd(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16845erc EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16845erc) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.hbZCHz, viewGroup, z, obj);
    }
}
