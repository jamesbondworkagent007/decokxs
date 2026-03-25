package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.erg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16849erg extends ViewDataBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.view.View OLrzqt;
    public final android.widget.ImageView copydefault;

    public AbstractC16849erg(java.lang.Object obj, android.view.View view, int i, android.widget.ImageView imageView, android.widget.ImageView imageView2, android.widget.ImageView imageView3, android.view.View view2, android.widget.LinearLayout linearLayout) {
        super(obj, view, i);
        this.copydefault = imageView;
        this.KWHzl = imageView2;
        this.AEQbTJ = imageView3;
        this.OLrzqt = view2;
        this.EZpvd = linearLayout;
    }

    public static AbstractC16849erg OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return EZpvd(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16849erg EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16849erg) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.sYcwUD, viewGroup, z, obj);
    }
}
