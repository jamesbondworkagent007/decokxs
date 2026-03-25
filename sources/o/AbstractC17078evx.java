package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.card.MaterialCardView;
import com.okinc.uilab.reminder.OKReminder;
import o.C13754dXa;

/* JADX INFO: renamed from: o.evx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17078evx extends ViewDataBinding {
    public final C55173xeu AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final C33537myN EZpvd;
    public final C52794wYp KWHzl;
    public final MaterialCardView OLrzqt;
    public final OKReminder copydefault;
    public final C55113xdn djBIcL;
    public final OKReminder gEmmrt;

    public AbstractC17078evx(java.lang.Object obj, android.view.View view, int i, C33537myN c33537myN, C52794wYp c52794wYp, MaterialCardView materialCardView, C55173xeu c55173xeu, OKReminder oKReminder, OKReminder oKReminder2, C55113xdn c55113xdn, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.EZpvd = c33537myN;
        this.KWHzl = c52794wYp;
        this.OLrzqt = materialCardView;
        this.AEQbTJ = c55173xeu;
        this.copydefault = oKReminder;
        this.gEmmrt = oKReminder2;
        this.djBIcL = c55113xdn;
        this.AhwBna = textView;
        this.AYXKKw = textView2;
    }

    public static AbstractC17078evx KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return EZpvd(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC17078evx EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC17078evx) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.adwzgZ, null, false, obj);
    }
}
