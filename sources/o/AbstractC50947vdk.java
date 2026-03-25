package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vdk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC50947vdk extends ViewDataBinding {
    public final android.view.View EZpvd;

    public AbstractC50947vdk(java.lang.Object obj, android.view.View view, int i, android.view.View view2) {
        super(obj, view, i);
        this.EZpvd = view2;
    }

    public static AbstractC50947vdk EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC50947vdk OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC50947vdk) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.fmdvVn, viewGroup, z, obj);
    }
}
