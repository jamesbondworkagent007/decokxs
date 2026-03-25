package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.auth.impl.widget.SimpleToolBar;
import o.C8206ayP;

/* JADX INFO: renamed from: o.aAf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5660aAf extends ViewDataBinding {
    public final C52794wYp AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView AkhnZx;
    public final ConstraintLayout EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final SimpleToolBar copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;
    public final ConstraintLayout valueOf;

    public AbstractC5660aAf(java.lang.Object obj, android.view.View view, int i, SimpleToolBar simpleToolBar, C52794wYp c52794wYp, ConstraintLayout constraintLayout, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3, ConstraintLayout constraintLayout2, android.widget.TextView textView4, android.widget.TextView textView5, android.widget.TextView textView6, android.widget.TextView textView7) {
        super(obj, view, i);
        this.copydefault = simpleToolBar;
        this.AEQbTJ = c52794wYp;
        this.EZpvd = constraintLayout;
        this.KWHzl = textView;
        this.OLrzqt = textView2;
        this.AYXKKw = textView3;
        this.valueOf = constraintLayout2;
        this.djBIcL = textView4;
        this.gEmmrt = textView5;
        this.AhwBna = textView6;
        this.AkhnZx = textView7;
    }

    public static AbstractC5660aAf copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return EZpvd(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC5660aAf EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC5660aAf) ViewDataBinding.inflateInternal(layoutInflater, C8206ayP.Application.fvQaOB, viewGroup, z, obj);
    }
}
