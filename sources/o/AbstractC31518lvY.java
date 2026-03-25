package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lvY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC31518lvY extends ViewDataBinding {
    public final ConstraintLayout AEQbTJ;
    public final ConstraintLayout AYXKKw;
    public final android.widget.TextView AhwBna;
    public final ConstraintLayout EZpvd;
    public final ConstraintLayout KWHzl;
    public final ConstraintLayout OLrzqt;
    public final android.widget.ImageView copydefault;
    public final C55033xcM djBIcL;
    public final android.widget.TextView gEmmrt;
    public final android.widget.ImageView valueOf;

    public AbstractC31518lvY(java.lang.Object obj, android.view.View view, int i, ConstraintLayout constraintLayout, android.widget.ImageView imageView, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, C55033xcM c55033xcM, android.widget.TextView textView, android.widget.TextView textView2, android.widget.ImageView imageView2, ConstraintLayout constraintLayout5) {
        super(obj, view, i);
        this.KWHzl = constraintLayout;
        this.copydefault = imageView;
        this.AEQbTJ = constraintLayout2;
        this.EZpvd = constraintLayout3;
        this.OLrzqt = constraintLayout4;
        this.djBIcL = c55033xcM;
        this.gEmmrt = textView;
        this.AhwBna = textView2;
        this.valueOf = imageView2;
        this.AYXKKw = constraintLayout5;
    }

    public static AbstractC31518lvY copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC31518lvY AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC31518lvY) ViewDataBinding.inflateInternal(layoutInflater, C31351lsQ.ActionBar.iZzfmt, viewGroup, z, obj);
    }
}
