package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C28102kOz;

/* JADX INFO: loaded from: classes7.dex */
public abstract class kOO extends ViewDataBinding {
    public final android.widget.LinearLayout EZpvd;

    public kOO(java.lang.Object obj, android.view.View view, int i, android.widget.LinearLayout linearLayout) {
        super(obj, view, i);
        this.EZpvd = linearLayout;
    }

    public static kOO copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static kOO KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (kOO) ViewDataBinding.inflateInternal(layoutInflater, C28102kOz.Activity.AEQbTJ, viewGroup, z, obj);
    }
}
