package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public abstract class uXO extends ViewDataBinding {
    public final C55353xiO AEQbTJ;
    public final AppCompatTextView EZpvd;
    public final AppCompatImageView KWHzl;
    public final AppCompatTextView OLrzqt;
    public final ConstraintLayout copydefault;

    public uXO(java.lang.Object obj, android.view.View view, int i, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, C55353xiO c55353xiO, AppCompatTextView appCompatTextView2) {
        super(obj, view, i);
        this.copydefault = constraintLayout;
        this.OLrzqt = appCompatTextView;
        this.KWHzl = appCompatImageView;
        this.AEQbTJ = c55353xiO;
        this.EZpvd = appCompatTextView2;
    }

    public static uXO AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static uXO KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (uXO) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.DBAlnt, viewGroup, z, obj);
    }
}
