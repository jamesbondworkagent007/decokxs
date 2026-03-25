package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.trr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47533trr extends ViewDataBinding {
    public final ConstraintLayout AEQbTJ;
    public final C47532trq AYXKKw;
    public final C47532trq AhwBna;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final C47532trq copydefault;
    public final ConstraintLayout djBIcL;
    public final C47532trq gEmmrt;
    public final C47532trq valueOf;

    public AbstractC47533trr(java.lang.Object obj, android.view.View view, int i, android.widget.TextView textView, android.widget.TextView textView2, ConstraintLayout constraintLayout, android.widget.TextView textView3, C47532trq c47532trq, C47532trq c47532trq2, C47532trq c47532trq3, C47532trq c47532trq4, C47532trq c47532trq5, ConstraintLayout constraintLayout2) {
        super(obj, view, i);
        this.EZpvd = textView;
        this.OLrzqt = textView2;
        this.AEQbTJ = constraintLayout;
        this.KWHzl = textView3;
        this.copydefault = c47532trq;
        this.AYXKKw = c47532trq2;
        this.AhwBna = c47532trq3;
        this.valueOf = c47532trq4;
        this.gEmmrt = c47532trq5;
        this.djBIcL = constraintLayout2;
    }

    public static AbstractC47533trr OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47533trr AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47533trr) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.DcqEDu, viewGroup, z, obj);
    }
}
