package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uPs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC48390uPs extends ViewDataBinding {
    public final C51609vqJ OLrzqt;

    public AbstractC48390uPs(java.lang.Object obj, android.view.View view, int i, C51609vqJ c51609vqJ) {
        super(obj, view, i);
        this.OLrzqt = c51609vqJ;
    }

    public static AbstractC48390uPs copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC48390uPs AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC48390uPs) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.DcqEDu, viewGroup, z, obj);
    }
}
