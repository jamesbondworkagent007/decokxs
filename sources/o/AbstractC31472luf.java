package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.reminder.OKReminder;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.luf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC31472luf extends ViewDataBinding {
    public final ConstraintLayout AEQbTJ;
    public final ConstraintLayout AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView AkhnZx;
    public final ConstraintLayout EZpvd;
    public final ConstraintLayout KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;
    public final ConstraintLayout isConnected;
    public final android.widget.TextView valueOf;
    public final OKReminder values;

    public AbstractC31472luf(java.lang.Object obj, android.view.View view, int i, android.widget.TextView textView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, android.widget.TextView textView2, android.widget.TextView textView3, android.widget.TextView textView4, ConstraintLayout constraintLayout4, android.widget.TextView textView5, android.widget.TextView textView6, ConstraintLayout constraintLayout5, android.widget.TextView textView7, OKReminder oKReminder) {
        super(obj, view, i);
        this.OLrzqt = textView;
        this.EZpvd = constraintLayout;
        this.KWHzl = constraintLayout2;
        this.AEQbTJ = constraintLayout3;
        this.copydefault = textView2;
        this.valueOf = textView3;
        this.AhwBna = textView4;
        this.AYXKKw = constraintLayout4;
        this.gEmmrt = textView5;
        this.djBIcL = textView6;
        this.isConnected = constraintLayout5;
        this.AkhnZx = textView7;
        this.values = oKReminder;
    }

    public static AbstractC31472luf EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return EZpvd(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC31472luf EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC31472luf) ViewDataBinding.inflateInternal(layoutInflater, C31351lsQ.ActionBar.DbNXlk, null, false, obj);
    }
}
