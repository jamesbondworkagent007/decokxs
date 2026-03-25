package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eoY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16682eoY extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final ConstraintLayout EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.ImageView copydefault;

    public AbstractC16682eoY(java.lang.Object obj, android.view.View view, int i, ConstraintLayout constraintLayout, android.widget.ImageView imageView, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.EZpvd = constraintLayout;
        this.copydefault = imageView;
        this.AEQbTJ = textView;
        this.KWHzl = textView2;
    }

    public static AbstractC16682eoY OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return EZpvd(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16682eoY EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16682eoY) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.sendBehavioSecData, viewGroup, z, obj);
    }
}
