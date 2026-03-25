package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uPx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC48395uPx extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final C55239xgG EZpvd;

    public AbstractC48395uPx(java.lang.Object obj, android.view.View view, int i, C55239xgG c55239xgG, android.widget.TextView textView) {
        super(obj, view, i);
        this.EZpvd = c55239xgG;
        this.AEQbTJ = textView;
    }

    public static AbstractC48395uPx copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return copydefault(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC48395uPx copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC48395uPx) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.KDccX, viewGroup, z, obj);
    }
}
