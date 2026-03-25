package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C35399nuc;

/* JADX INFO: loaded from: classes8.dex */
public abstract class nNO extends ViewDataBinding {
    public final ConstraintLayout AEQbTJ;
    public final C33933nLf EZpvd;

    public nNO(java.lang.Object obj, android.view.View view, int i, ConstraintLayout constraintLayout, C33933nLf c33933nLf) {
        super(obj, view, i);
        this.AEQbTJ = constraintLayout;
        this.EZpvd = c33933nLf;
    }

    public static nNO KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return copydefault(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static nNO copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (nNO) ViewDataBinding.inflateInternal(layoutInflater, C35399nuc.Dialog.RAQtXZ, viewGroup, z, obj);
    }
}
