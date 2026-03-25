package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes7.dex */
public abstract class lxN extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final ConstraintLayout OLrzqt;
    public final android.view.View copydefault;

    public lxN(java.lang.Object obj, android.view.View view, int i, android.view.View view2, ConstraintLayout constraintLayout, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3) {
        super(obj, view, i);
        this.copydefault = view2;
        this.OLrzqt = constraintLayout;
        this.EZpvd = textView;
        this.KWHzl = textView2;
        this.AEQbTJ = textView3;
    }
}
