package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eqU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16784eqU extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final AppCompatImageView EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final wYC copydefault;
    public final wYC gEmmrt;
    public final ConstraintLayout valueOf;

    public AbstractC16784eqU(java.lang.Object obj, android.view.View view, int i, AppCompatImageView appCompatImageView, android.widget.TextView textView, android.widget.TextView textView2, android.widget.LinearLayout linearLayout, wYC wyc, android.widget.TextView textView3, ConstraintLayout constraintLayout, wYC wyc2) {
        super(obj, view, i);
        this.EZpvd = appCompatImageView;
        this.AEQbTJ = textView;
        this.KWHzl = textView2;
        this.OLrzqt = linearLayout;
        this.copydefault = wyc;
        this.AYXKKw = textView3;
        this.valueOf = constraintLayout;
        this.gEmmrt = wyc2;
    }

    public static AbstractC16784eqU OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16784eqU KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16784eqU) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.DuXjdv, viewGroup, z, obj);
    }
}
