package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.tqr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47483tqr extends ViewDataBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final ConstraintLayout OLrzqt;
    public final android.widget.TextView copydefault;

    public AbstractC47483tqr(java.lang.Object obj, android.view.View view, int i, ConstraintLayout constraintLayout, android.widget.ImageView imageView, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.OLrzqt = constraintLayout;
        this.AEQbTJ = imageView;
        this.EZpvd = textView;
        this.copydefault = textView2;
    }

    public static AbstractC47483tqr OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47483tqr AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47483tqr) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.DLWbHP, viewGroup, z, obj);
    }
}
