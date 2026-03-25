package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.luz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC31492luz extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final AbstractC31595lwx AYXKKw;
    public final android.widget.TextView EZpvd;
    public final ConstraintLayout KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.TextView djBIcL;
    public final C55173xeu gEmmrt;
    public final ConstraintLayout valueOf;

    public AbstractC31492luz(java.lang.Object obj, android.view.View view, int i, ConstraintLayout constraintLayout, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3, android.widget.TextView textView4, android.widget.TextView textView5, C55173xeu c55173xeu, ConstraintLayout constraintLayout2, AbstractC31595lwx abstractC31595lwx) {
        super(obj, view, i);
        this.KWHzl = constraintLayout;
        this.AEQbTJ = textView;
        this.OLrzqt = textView2;
        this.EZpvd = textView3;
        this.copydefault = textView4;
        this.djBIcL = textView5;
        this.gEmmrt = c55173xeu;
        this.valueOf = constraintLayout2;
        this.AYXKKw = abstractC31595lwx;
    }

    public static AbstractC31492luz EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return copydefault(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC31492luz copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC31492luz) ViewDataBinding.inflateInternal(layoutInflater, C31351lsQ.ActionBar.uzCIH, viewGroup, z, obj);
    }
}
