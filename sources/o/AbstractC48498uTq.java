package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uTq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC48498uTq extends ViewDataBinding {
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.LinearLayout KWHzl;

    public AbstractC48498uTq(java.lang.Object obj, android.view.View view, int i, android.widget.LinearLayout linearLayout, android.widget.LinearLayout linearLayout2) {
        super(obj, view, i);
        this.KWHzl = linearLayout;
        this.EZpvd = linearLayout2;
    }

    public static AbstractC48498uTq OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return EZpvd(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC48498uTq EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC48498uTq) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.hOMIpD, viewGroup, z, obj);
    }
}
