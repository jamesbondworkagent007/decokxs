package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.etp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16964etp extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final android.widget.ImageView OLrzqt;

    public AbstractC16964etp(java.lang.Object obj, android.view.View view, int i, android.widget.ImageView imageView, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.OLrzqt = imageView;
        this.AEQbTJ = textView;
        this.EZpvd = textView2;
    }

    public static AbstractC16964etp AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16964etp AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16964etp) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.QfZsXX, viewGroup, z, obj);
    }
}
