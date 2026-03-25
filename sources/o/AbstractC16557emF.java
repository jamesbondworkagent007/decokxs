package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.emF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16557emF extends ViewDataBinding {
    public final AppCompatImageView AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final android.widget.ImageView OLrzqt;
    public final android.widget.TextView copydefault;

    public AbstractC16557emF(java.lang.Object obj, android.view.View view, int i, AppCompatImageView appCompatImageView, android.widget.ImageView imageView, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.AEQbTJ = appCompatImageView;
        this.OLrzqt = imageView;
        this.EZpvd = textView;
        this.copydefault = textView2;
    }

    public static AbstractC16557emF EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16557emF OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16557emF) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.geLlBI, viewGroup, z, obj);
    }
}
