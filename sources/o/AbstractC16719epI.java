package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.epI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16719epI extends ViewDataBinding {
    public final ShapeableImageView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView EZpvd;
    public final AppCompatTextView KWHzl;
    public final AppCompatImageView OLrzqt;
    public final ShapeableImageView copydefault;

    public AbstractC16719epI(java.lang.Object obj, android.view.View view, int i, AppCompatTextView appCompatTextView, ShapeableImageView shapeableImageView, ShapeableImageView shapeableImageView2, AppCompatImageView appCompatImageView, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.KWHzl = appCompatTextView;
        this.AEQbTJ = shapeableImageView;
        this.copydefault = shapeableImageView2;
        this.OLrzqt = appCompatImageView;
        this.EZpvd = textView;
        this.AYXKKw = textView2;
    }

    public static AbstractC16719epI copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16719epI AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16719epI) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.abAflu, viewGroup, z, obj);
    }
}
