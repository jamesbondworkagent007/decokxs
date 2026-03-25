package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.auth.impl.widget.SimpleToolBar;
import o.C8206ayP;

/* JADX INFO: renamed from: o.azU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8264azU extends ViewDataBinding {
    public final C52794wYp AEQbTJ;
    public final C52794wYp EZpvd;
    public final C5959aGM KWHzl;
    public final android.widget.ScrollView OLrzqt;
    public final SimpleToolBar copydefault;

    public AbstractC8264azU(java.lang.Object obj, android.view.View view, int i, SimpleToolBar simpleToolBar, C5959aGM c5959aGM, android.widget.ScrollView scrollView, C52794wYp c52794wYp, C52794wYp c52794wYp2) {
        super(obj, view, i);
        this.copydefault = simpleToolBar;
        this.KWHzl = c5959aGM;
        this.OLrzqt = scrollView;
        this.EZpvd = c52794wYp;
        this.AEQbTJ = c52794wYp2;
    }

    public static AbstractC8264azU AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return KWHzl(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC8264azU KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC8264azU) ViewDataBinding.inflateInternal(layoutInflater, C8206ayP.Application.UeEOUB, null, false, obj);
    }
}
