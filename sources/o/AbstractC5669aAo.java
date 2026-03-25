package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.uilab.reminder.OKReminder;
import o.C8206ayP;

/* JADX INFO: renamed from: o.aAo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5669aAo extends ViewDataBinding {
    public final C55173xeu AEQbTJ;
    public final android.widget.Space AYXKKw;
    public final android.widget.LinearLayout AhwBna;
    public final android.widget.Space AkhnZx;
    public final OKReminder DbNXlk;
    public final OKReminder EZpvd;
    public final RecyclerView KWHzl;
    public final android.widget.Space OLrzqt;
    public final C52794wYp copydefault;
    public final C55239xgG djBIcL;
    public final OKReminder fetchVPNInfo;
    public final android.widget.TextView gEmmrt;
    public final C52794wYp isConnected;
    public final android.widget.LinearLayout valueOf;
    public final android.widget.FrameLayout values;

    public AbstractC5669aAo(java.lang.Object obj, android.view.View view, int i, RecyclerView recyclerView, C52794wYp c52794wYp, C55173xeu c55173xeu, OKReminder oKReminder, android.widget.Space space, android.widget.Space space2, android.widget.TextView textView, C55239xgG c55239xgG, android.widget.LinearLayout linearLayout, android.widget.LinearLayout linearLayout2, OKReminder oKReminder2, C52794wYp c52794wYp2, android.widget.FrameLayout frameLayout, OKReminder oKReminder3, android.widget.Space space3) {
        super(obj, view, i);
        this.KWHzl = recyclerView;
        this.copydefault = c52794wYp;
        this.AEQbTJ = c55173xeu;
        this.EZpvd = oKReminder;
        this.OLrzqt = space;
        this.AYXKKw = space2;
        this.gEmmrt = textView;
        this.djBIcL = c55239xgG;
        this.AhwBna = linearLayout;
        this.valueOf = linearLayout2;
        this.DbNXlk = oKReminder2;
        this.isConnected = c52794wYp2;
        this.values = frameLayout;
        this.fetchVPNInfo = oKReminder3;
        this.AkhnZx = space3;
    }

    public static AbstractC5669aAo copydefault(@androidx.annotation.NonNull android.view.View view) {
        return OLrzqt(view, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC5669aAo OLrzqt(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC5669aAo) ViewDataBinding.bind(obj, view, C8206ayP.Application.AxsJAYsNCnLh);
    }
}
