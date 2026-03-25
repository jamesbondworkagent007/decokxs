package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lur, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC31484lur extends ViewDataBinding {
    public final android.widget.ImageView AEQbTJ;
    public final C55030xcJ AYXKKw;
    public final android.widget.TextView AhwBna;
    public final ConstraintLayout DbNXlk;
    public final ConstraintLayout EZpvd;
    public final C52794wYp KWHzl;
    public final C31562lwP OLrzqt;
    public final lQY copydefault;
    public final android.widget.TextView djBIcL;
    public final ConstraintLayout gEmmrt;
    public final ConstraintLayout valueOf;
    public final android.widget.TextView values;

    public AbstractC31484lur(java.lang.Object obj, android.view.View view, int i, ConstraintLayout constraintLayout, android.widget.ImageView imageView, C52794wYp c52794wYp, lQY lqy, C31562lwP c31562lwP, ConstraintLayout constraintLayout2, C55030xcJ c55030xcJ, ConstraintLayout constraintLayout3, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3, ConstraintLayout constraintLayout4) {
        super(obj, view, i);
        this.EZpvd = constraintLayout;
        this.AEQbTJ = imageView;
        this.KWHzl = c52794wYp;
        this.copydefault = lqy;
        this.OLrzqt = c31562lwP;
        this.valueOf = constraintLayout2;
        this.AYXKKw = c55030xcJ;
        this.gEmmrt = constraintLayout3;
        this.djBIcL = textView;
        this.AhwBna = textView2;
        this.values = textView3;
        this.DbNXlk = constraintLayout4;
    }

    public static AbstractC31484lur copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return AEQbTJ(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC31484lur AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC31484lur) ViewDataBinding.inflateInternal(layoutInflater, C31351lsQ.ActionBar.ejfBZ, null, false, obj);
    }
}
