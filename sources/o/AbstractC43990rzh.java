package o;

import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: renamed from: o.rzh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC43990rzh extends ViewDataBinding {

    @Bindable
    public java.lang.Boolean AEQbTJ;
    public final rQQ EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.view.View OLrzqt;

    @Bindable
    public java.lang.String copydefault;

    public abstract void KWHzl(@androidx.annotation.Nullable java.lang.Boolean bool);

    public abstract void KWHzl(@androidx.annotation.Nullable java.lang.String str);

    public AbstractC43990rzh(java.lang.Object obj, android.view.View view, int i, android.view.View view2, rQQ rqq, android.widget.TextView textView) {
        super(obj, view, i);
        this.OLrzqt = view2;
        this.EZpvd = rqq;
        this.KWHzl = textView;
    }
}
