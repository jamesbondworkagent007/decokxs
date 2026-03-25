package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.mDC;

/* JADX INFO: loaded from: classes8.dex */
public abstract class mGD extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.ImageView EZpvd;
    public final android.view.View KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final ConstraintLayout copydefault;

    public mGD(java.lang.Object obj, android.view.View view, int i, ConstraintLayout constraintLayout, android.widget.ImageView imageView, android.widget.ImageView imageView2, android.widget.TextView textView, android.view.View view2) {
        super(obj, view, i);
        this.copydefault = constraintLayout;
        this.OLrzqt = imageView;
        this.EZpvd = imageView2;
        this.AEQbTJ = textView;
        this.KWHzl = view2;
    }

    public static mGD OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static mGD KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (mGD) ViewDataBinding.inflateInternal(layoutInflater, mDC.TaskDescription.AuCTelauCTel, viewGroup, z, obj);
    }
}
