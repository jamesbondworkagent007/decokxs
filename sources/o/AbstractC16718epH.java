package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.epH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16718epH extends ViewDataBinding {
    public final C55113xdn AEQbTJ;
    public final android.widget.FrameLayout EZpvd;
    public final android.widget.TextView KWHzl;
    public final ShapeableImageView copydefault;

    public AbstractC16718epH(java.lang.Object obj, android.view.View view, int i, android.widget.FrameLayout frameLayout, ShapeableImageView shapeableImageView, C55113xdn c55113xdn, android.widget.TextView textView) {
        super(obj, view, i);
        this.EZpvd = frameLayout;
        this.copydefault = shapeableImageView;
        this.AEQbTJ = c55113xdn;
        this.KWHzl = textView;
    }

    public static AbstractC16718epH EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16718epH KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16718epH) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.DlABUU, viewGroup, z, obj);
    }
}
