package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public abstract class uSX extends ViewDataBinding {
    public final C53573wnz AEQbTJ;
    public final AppCompatImageView EZpvd;
    public final LinearLayoutCompat OLrzqt;
    public final LinearLayoutCompat copydefault;

    public uSX(java.lang.Object obj, android.view.View view, int i, LinearLayoutCompat linearLayoutCompat, AppCompatImageView appCompatImageView, LinearLayoutCompat linearLayoutCompat2, C53573wnz c53573wnz) {
        super(obj, view, i);
        this.OLrzqt = linearLayoutCompat;
        this.EZpvd = appCompatImageView;
        this.copydefault = linearLayoutCompat2;
        this.AEQbTJ = c53573wnz;
    }

    public static uSX KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static uSX KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (uSX) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.DaTmkG, viewGroup, z, obj);
    }
}
