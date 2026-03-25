package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ekh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16479ekh extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final ShapeableImageView KWHzl;
    public final ShapeableImageView copydefault;

    public AbstractC16479ekh(java.lang.Object obj, android.view.View view, int i, android.widget.TextView textView, android.widget.TextView textView2, ShapeableImageView shapeableImageView, ShapeableImageView shapeableImageView2) {
        super(obj, view, i);
        this.AEQbTJ = textView;
        this.EZpvd = textView2;
        this.copydefault = shapeableImageView;
        this.KWHzl = shapeableImageView2;
    }

    public static AbstractC16479ekh AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16479ekh OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16479ekh) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.DWgRXt, viewGroup, z, obj);
    }
}
