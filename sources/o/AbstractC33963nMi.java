package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nMi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC33963nMi extends ViewDataBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.widget.TextView copydefault;

    public AbstractC33963nMi(java.lang.Object obj, android.view.View view, int i, android.widget.LinearLayout linearLayout, android.widget.ImageView imageView, android.widget.ImageView imageView2, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.EZpvd = linearLayout;
        this.AEQbTJ = imageView;
        this.OLrzqt = imageView2;
        this.KWHzl = textView;
        this.copydefault = textView2;
    }

    public static AbstractC33963nMi EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return EZpvd(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC33963nMi EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC33963nMi) ViewDataBinding.inflateInternal(layoutInflater, C35399nuc.Dialog.vLaW, viewGroup, z, obj);
    }

    public static AbstractC33963nMi OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        return KWHzl(view, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC33963nMi KWHzl(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC33963nMi) ViewDataBinding.bind(obj, view, C35399nuc.Dialog.vLaW);
    }
}
