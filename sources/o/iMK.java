package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C25493ixk;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iMK extends ViewDataBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final C55258xgZ copydefault;

    public iMK(java.lang.Object obj, android.view.View view, int i, android.widget.LinearLayout linearLayout, C55258xgZ c55258xgZ) {
        super(obj, view, i);
        this.AEQbTJ = linearLayout;
        this.copydefault = c55258xgZ;
    }

    public static iMK AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static iMK KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (iMK) ViewDataBinding.inflateInternal(layoutInflater, C25493ixk.Activity.invokespecialODCBUN, viewGroup, z, obj);
    }
}
