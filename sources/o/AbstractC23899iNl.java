package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iNl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC23899iNl extends ViewDataBinding {
    public final C27516jwf AEQbTJ;
    public final android.widget.ImageView EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.ImageView copydefault;
    public final android.widget.TextView gEmmrt;
    public final C27516jwf valueOf;

    public AbstractC23899iNl(java.lang.Object obj, android.view.View view, int i, android.widget.ImageView imageView, android.widget.ImageView imageView2, C27516jwf c27516jwf, android.widget.TextView textView, android.widget.ImageView imageView3, C27516jwf c27516jwf2, android.widget.TextView textView2) {
        super(obj, view, i);
        this.copydefault = imageView;
        this.KWHzl = imageView2;
        this.AEQbTJ = c27516jwf;
        this.OLrzqt = textView;
        this.EZpvd = imageView3;
        this.valueOf = c27516jwf2;
        this.gEmmrt = textView2;
    }

    public static AbstractC23899iNl EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC23899iNl OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC23899iNl) ViewDataBinding.inflateInternal(layoutInflater, C25493ixk.Activity.gBtXYZ, viewGroup, z, obj);
    }
}
