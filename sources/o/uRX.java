package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public abstract class uRX extends ViewDataBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final C52794wYp EZpvd;

    public uRX(java.lang.Object obj, android.view.View view, int i, android.widget.LinearLayout linearLayout, C52794wYp c52794wYp) {
        super(obj, view, i);
        this.AEQbTJ = linearLayout;
        this.EZpvd = c52794wYp;
    }

    public static uRX KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return copydefault(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static uRX copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (uRX) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.DPHsZd, viewGroup, z, obj);
    }
}
