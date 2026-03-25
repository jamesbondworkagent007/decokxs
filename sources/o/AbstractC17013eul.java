package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eul, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17013eul extends ViewDataBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final ConstraintLayout EZpvd;
    public final C55173xeu KWHzl;
    public final C33537myN OLrzqt;
    public final C52794wYp copydefault;
    public final C55113xdn djBIcL;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView valueOf;

    public AbstractC17013eul(java.lang.Object obj, android.view.View view, int i, C33537myN c33537myN, C52794wYp c52794wYp, ConstraintLayout constraintLayout, C55173xeu c55173xeu, android.widget.ImageView imageView, C55113xdn c55113xdn, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3) {
        super(obj, view, i);
        this.OLrzqt = c33537myN;
        this.copydefault = c52794wYp;
        this.EZpvd = constraintLayout;
        this.KWHzl = c55173xeu;
        this.AEQbTJ = imageView;
        this.djBIcL = c55113xdn;
        this.gEmmrt = textView;
        this.AYXKKw = textView2;
        this.valueOf = textView3;
    }

    public static AbstractC17013eul AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return AEQbTJ(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC17013eul AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC17013eul) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.QSAYLr, null, false, obj);
    }
}
