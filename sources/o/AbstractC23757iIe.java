package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iIe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC23757iIe extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final ConstraintLayout AYXKKw;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;

    public AbstractC23757iIe(java.lang.Object obj, android.view.View view, int i, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3, android.widget.TextView textView4, android.widget.TextView textView5, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.OLrzqt = textView;
        this.copydefault = textView2;
        this.EZpvd = textView3;
        this.AEQbTJ = textView4;
        this.KWHzl = textView5;
        this.AYXKKw = constraintLayout;
    }

    public static AbstractC23757iIe AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return copydefault(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC23757iIe copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC23757iIe) ViewDataBinding.inflateInternal(layoutInflater, C25493ixk.Activity.dxcTrN, viewGroup, z, obj);
    }
}
