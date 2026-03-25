package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.reminder.OKReminder;

/* JADX INFO: renamed from: o.ery, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16867ery extends ViewDataBinding {
    public final C52794wYp AEQbTJ;
    public final OKReminder AhwBna;
    public final C52794wYp EZpvd;

    @Bindable
    public C15489eKf KWHzl;
    public final C52794wYp OLrzqt;
    public final ConstraintLayout copydefault;

    public abstract void EZpvd(@androidx.annotation.Nullable C15489eKf c15489eKf);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C15489eKf OLrzqt() {
        return this.KWHzl;
    }

    public AbstractC16867ery(java.lang.Object obj, android.view.View view, int i, C52794wYp c52794wYp, C52794wYp c52794wYp2, C52794wYp c52794wYp3, ConstraintLayout constraintLayout, OKReminder oKReminder) {
        super(obj, view, i);
        this.OLrzqt = c52794wYp;
        this.EZpvd = c52794wYp2;
        this.AEQbTJ = c52794wYp3;
        this.copydefault = constraintLayout;
        this.AhwBna = oKReminder;
    }
}
