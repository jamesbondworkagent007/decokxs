package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.tpj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47422tpj extends ViewDataBinding {
    public final android.widget.ImageView AEQbTJ;
    public final C52794wYp EZpvd;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;

    public AbstractC47422tpj(java.lang.Object obj, android.view.View view, int i, android.widget.ImageView imageView, C52794wYp c52794wYp, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.AEQbTJ = imageView;
        this.EZpvd = c52794wYp;
        this.copydefault = textView;
        this.OLrzqt = textView2;
    }

    public static AbstractC47422tpj AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47422tpj OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47422tpj) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.dvKsVJ, viewGroup, z, obj);
    }
}
