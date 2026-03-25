package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nNs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC34000nNs extends ViewDataBinding {
    public final ConstraintLayout AEQbTJ;
    public final nKZ copydefault;

    public AbstractC34000nNs(java.lang.Object obj, android.view.View view, int i, ConstraintLayout constraintLayout, nKZ nkz) {
        super(obj, view, i);
        this.AEQbTJ = constraintLayout;
        this.copydefault = nkz;
    }

    public static AbstractC34000nNs copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC34000nNs AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC34000nNs) ViewDataBinding.inflateInternal(layoutInflater, C35399nuc.Dialog.zzQwtT, viewGroup, z, obj);
    }
}
