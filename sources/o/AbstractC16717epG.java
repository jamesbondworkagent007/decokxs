package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.epG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16717epG extends ViewDataBinding {
    public final ConstraintLayout KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.widget.TextView copydefault;

    public AbstractC16717epG(java.lang.Object obj, android.view.View view, int i, android.widget.ImageView imageView, ConstraintLayout constraintLayout, android.widget.TextView textView) {
        super(obj, view, i);
        this.OLrzqt = imageView;
        this.KWHzl = constraintLayout;
        this.copydefault = textView;
    }

    public static AbstractC16717epG OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16717epG OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16717epG) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.getAdvertisingId, viewGroup, z, obj);
    }
}
