package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.auth.impl.widget.SimpleToolBar;
import o.C8206ayP;

/* JADX INFO: renamed from: o.azb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8271azb extends ViewDataBinding {
    public final SimpleToolBar AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final android.widget.ImageView KWHzl;
    public final C52794wYp OLrzqt;
    public final C52794wYp copydefault;
    public final android.widget.TextView gEmmrt;

    public AbstractC8271azb(java.lang.Object obj, android.view.View view, int i, SimpleToolBar simpleToolBar, android.widget.ImageView imageView, C52794wYp c52794wYp, android.widget.TextView textView, C52794wYp c52794wYp2, android.widget.TextView textView2) {
        super(obj, view, i);
        this.AEQbTJ = simpleToolBar;
        this.KWHzl = imageView;
        this.OLrzqt = c52794wYp;
        this.EZpvd = textView;
        this.copydefault = c52794wYp2;
        this.gEmmrt = textView2;
    }

    public static AbstractC8271azb EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return EZpvd(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC8271azb EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC8271azb) ViewDataBinding.inflateInternal(layoutInflater, C8206ayP.Application.valueOf, null, false, obj);
    }
}
