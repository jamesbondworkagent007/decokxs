package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.auth.impl.widget.SimpleToolBar;
import o.C8206ayP;

/* JADX INFO: renamed from: o.aAl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5666aAl extends ViewDataBinding {
    public final C52794wYp AEQbTJ;
    public final LottieAnimationView EZpvd;
    public final SimpleToolBar KWHzl;
    public final android.widget.TextView OLrzqt;
    public final C52794wYp copydefault;
    public final android.widget.TextView gEmmrt;

    public AbstractC5666aAl(java.lang.Object obj, android.view.View view, int i, LottieAnimationView lottieAnimationView, SimpleToolBar simpleToolBar, C52794wYp c52794wYp, C52794wYp c52794wYp2, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.EZpvd = lottieAnimationView;
        this.KWHzl = simpleToolBar;
        this.copydefault = c52794wYp;
        this.AEQbTJ = c52794wYp2;
        this.OLrzqt = textView;
        this.gEmmrt = textView2;
    }

    public static AbstractC5666aAl OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return EZpvd(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC5666aAl EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC5666aAl) ViewDataBinding.inflateInternal(layoutInflater, C8206ayP.Application.gGvvIC, viewGroup, z, obj);
    }
}
