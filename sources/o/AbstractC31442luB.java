package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.reminder.OKReminder;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.luB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC31442luB extends ViewDataBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final C52794wYp EZpvd;
    public final C52794wYp KWHzl;
    public final ConstraintLayout OLrzqt;
    public final ConstraintLayout copydefault;
    public final OKReminder djBIcL;
    public final android.widget.TextView gEmmrt;

    public AbstractC31442luB(java.lang.Object obj, android.view.View view, int i, C52794wYp c52794wYp, ConstraintLayout constraintLayout, C52794wYp c52794wYp2, ConstraintLayout constraintLayout2, android.widget.ImageView imageView, OKReminder oKReminder, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.KWHzl = c52794wYp;
        this.OLrzqt = constraintLayout;
        this.EZpvd = c52794wYp2;
        this.copydefault = constraintLayout2;
        this.AEQbTJ = imageView;
        this.djBIcL = oKReminder;
        this.AYXKKw = textView;
        this.gEmmrt = textView2;
    }

    public static AbstractC31442luB OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC31442luB OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC31442luB) ViewDataBinding.inflateInternal(layoutInflater, C31351lsQ.ActionBar.AubY, viewGroup, z, obj);
    }
}
