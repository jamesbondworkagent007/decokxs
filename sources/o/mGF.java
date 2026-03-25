package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.mDC;

/* JADX INFO: loaded from: classes8.dex */
public abstract class mGF extends ViewDataBinding {
    public final android.widget.ImageView EZpvd;
    public final ConstraintLayout KWHzl;
    public final ConstraintLayout OLrzqt;
    public final android.widget.TextView copydefault;

    public mGF(java.lang.Object obj, android.view.View view, int i, ConstraintLayout constraintLayout, android.widget.ImageView imageView, ConstraintLayout constraintLayout2, android.widget.TextView textView) {
        super(obj, view, i);
        this.OLrzqt = constraintLayout;
        this.EZpvd = imageView;
        this.KWHzl = constraintLayout2;
        this.copydefault = textView;
    }

    public static mGF AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return EZpvd(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static mGF EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (mGF) ViewDataBinding.inflateInternal(layoutInflater, mDC.TaskDescription.zsXlph, viewGroup, z, obj);
    }
}
