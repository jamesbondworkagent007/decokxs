package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.luG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC31447luG extends ViewDataBinding {
    public final ConstraintLayout AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final ConstraintLayout AkhnZx;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;
    public final ConstraintLayout djBIcL;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView valueOf;

    public AbstractC31447luG(java.lang.Object obj, android.view.View view, int i, android.widget.TextView textView, ConstraintLayout constraintLayout, android.widget.TextView textView2, android.widget.TextView textView3, android.widget.TextView textView4, ConstraintLayout constraintLayout2, android.widget.TextView textView5, android.widget.TextView textView6, android.widget.TextView textView7, android.widget.TextView textView8, ConstraintLayout constraintLayout3) {
        super(obj, view, i);
        this.KWHzl = textView;
        this.AEQbTJ = constraintLayout;
        this.EZpvd = textView2;
        this.OLrzqt = textView3;
        this.copydefault = textView4;
        this.djBIcL = constraintLayout2;
        this.AhwBna = textView5;
        this.valueOf = textView6;
        this.gEmmrt = textView7;
        this.AYXKKw = textView8;
        this.AkhnZx = constraintLayout3;
    }

    public static AbstractC31447luG OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return copydefault(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC31447luG copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC31447luG) ViewDataBinding.inflateInternal(layoutInflater, C31351lsQ.ActionBar.AuCTelauCTel, null, false, obj);
    }
}
