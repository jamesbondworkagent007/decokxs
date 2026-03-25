package o;

import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.erp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16858erp extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final C15509eKz AYXKKw;
    public final android.widget.TextView EZpvd;
    public final Guideline KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.ImageView copydefault;

    @Bindable
    public C15488eKe djBIcL;
    public final C15503eKt gEmmrt;
    public final AbstractC16867ery valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C15488eKe AEQbTJ() {
        return this.djBIcL;
    }

    public abstract void EZpvd(@androidx.annotation.Nullable C15488eKe c15488eKe);

    public AbstractC16858erp(java.lang.Object obj, android.view.View view, int i, Guideline guideline, android.widget.ImageView imageView, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3, AbstractC16867ery abstractC16867ery, C15503eKt c15503eKt, C15509eKz c15509eKz) {
        super(obj, view, i);
        this.KWHzl = guideline;
        this.copydefault = imageView;
        this.AEQbTJ = textView;
        this.OLrzqt = textView2;
        this.EZpvd = textView3;
        this.valueOf = abstractC16867ery;
        this.gEmmrt = c15503eKt;
        this.AYXKKw = c15509eKz;
    }

    public static AbstractC16858erp OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return EZpvd(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16858erp EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16858erp) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.ORWKdN, viewGroup, z, obj);
    }
}
