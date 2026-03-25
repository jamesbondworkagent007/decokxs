package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C57406yhn;

/* JADX INFO: renamed from: o.yhI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC57375yhI extends ViewDataBinding {
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.ImageView OLrzqt;
    public final android.widget.TextView copydefault;

    public AbstractC57375yhI(java.lang.Object obj, android.view.View view, int i, android.widget.ImageView imageView, android.widget.LinearLayout linearLayout, android.widget.TextView textView) {
        super(obj, view, i);
        this.OLrzqt = imageView;
        this.EZpvd = linearLayout;
        this.copydefault = textView;
    }

    public static AbstractC57375yhI EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return EZpvd(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC57375yhI EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC57375yhI) ViewDataBinding.inflateInternal(layoutInflater, C57406yhn.TaskDescription.hDKMBd, viewGroup, z, obj);
    }
}
