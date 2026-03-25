package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.auth.impl.widget.SimpleToolBar;
import o.C8206ayP;

/* JADX INFO: renamed from: o.aAm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5667aAm extends ViewDataBinding {
    public final C55178xez KWHzl;
    public final SimpleToolBar copydefault;

    public AbstractC5667aAm(java.lang.Object obj, android.view.View view, int i, SimpleToolBar simpleToolBar, C55178xez c55178xez) {
        super(obj, view, i);
        this.copydefault = simpleToolBar;
        this.KWHzl = c55178xez;
    }

    public static AbstractC5667aAm EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return AEQbTJ(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC5667aAm AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC5667aAm) ViewDataBinding.inflateInternal(layoutInflater, C8206ayP.Application.QKudOq, null, false, obj);
    }
}
