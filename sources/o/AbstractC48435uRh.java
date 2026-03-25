package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uRh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC48435uRh extends ViewDataBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final android.view.View EZpvd;
    public final android.widget.TextView KWHzl;
    public final C52794wYp OLrzqt;
    public final android.widget.TextView copydefault;

    public AbstractC48435uRh(java.lang.Object obj, android.view.View view, int i, C52794wYp c52794wYp, android.widget.TextView textView, android.widget.ImageView imageView, android.view.View view2, android.widget.TextView textView2, android.widget.TextView textView3) {
        super(obj, view, i);
        this.OLrzqt = c52794wYp;
        this.copydefault = textView;
        this.AEQbTJ = imageView;
        this.EZpvd = view2;
        this.KWHzl = textView2;
        this.AhwBna = textView3;
    }

    public static AbstractC48435uRh OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC48435uRh AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC48435uRh) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.DGUQLIDGUQLI, viewGroup, z, obj);
    }
}
