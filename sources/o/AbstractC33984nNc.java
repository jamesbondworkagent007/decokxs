package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nNc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC33984nNc extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView KWHzl;
    public final ConstraintLayout OLrzqt;
    public final C55239xgG copydefault;

    public AbstractC33984nNc(java.lang.Object obj, android.view.View view, int i, ConstraintLayout constraintLayout, C55239xgG c55239xgG, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.OLrzqt = constraintLayout;
        this.copydefault = c55239xgG;
        this.KWHzl = textView;
        this.AEQbTJ = textView2;
    }

    public static AbstractC33984nNc OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC33984nNc AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC33984nNc) ViewDataBinding.inflateInternal(layoutInflater, C35399nuc.Dialog.DrqXHJ, viewGroup, z, obj);
    }
}
