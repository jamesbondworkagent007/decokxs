package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.auth.impl.widget.SimpleToolBar;
import com.okinc.uilab.reminder.OKReminder;
import o.C8206ayP;

/* JADX INFO: renamed from: o.aAd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5658aAd extends ViewDataBinding {
    public final SimpleToolBar AEQbTJ;
    public final android.widget.ImageView EZpvd;
    public final android.widget.TextView KWHzl;
    public final OKReminder OLrzqt;
    public final C52794wYp copydefault;

    public AbstractC5658aAd(java.lang.Object obj, android.view.View view, int i, SimpleToolBar simpleToolBar, C52794wYp c52794wYp, android.widget.ImageView imageView, OKReminder oKReminder, android.widget.TextView textView) {
        super(obj, view, i);
        this.AEQbTJ = simpleToolBar;
        this.copydefault = c52794wYp;
        this.EZpvd = imageView;
        this.OLrzqt = oKReminder;
        this.KWHzl = textView;
    }

    public static AbstractC5658aAd KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC5658aAd OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC5658aAd) ViewDataBinding.inflateInternal(layoutInflater, C8206ayP.Application.flVtFt, viewGroup, z, obj);
    }
}
