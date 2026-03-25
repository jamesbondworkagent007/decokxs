package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uNs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC48336uNs extends ViewDataBinding {
    public final C52705wVh AEQbTJ;
    public final C52705wVh EZpvd;
    public final C52794wYp KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final C52705wVh copydefault;

    public AbstractC48336uNs(java.lang.Object obj, android.view.View view, int i, C52794wYp c52794wYp, C52705wVh c52705wVh, android.widget.LinearLayout linearLayout, C52705wVh c52705wVh2, C52705wVh c52705wVh3) {
        super(obj, view, i);
        this.KWHzl = c52794wYp;
        this.EZpvd = c52705wVh;
        this.OLrzqt = linearLayout;
        this.AEQbTJ = c52705wVh2;
        this.copydefault = c52705wVh3;
    }

    public static AbstractC48336uNs AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC48336uNs OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC48336uNs) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.dvKsVJ, viewGroup, z, obj);
    }
}
