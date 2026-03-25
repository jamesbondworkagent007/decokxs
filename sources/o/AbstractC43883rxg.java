package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: renamed from: o.rxg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC43883rxg extends ViewDataBinding {

    @Bindable
    public java.lang.Boolean EZpvd;

    @Bindable
    public rIB KWHzl;
    public final wYK OLrzqt;
    public final ConstraintLayout copydefault;

    public abstract void OLrzqt(@androidx.annotation.Nullable java.lang.Boolean bool);

    public AbstractC43883rxg(java.lang.Object obj, android.view.View view, int i, wYK wyk, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.OLrzqt = wyk;
        this.copydefault = constraintLayout;
    }
}
