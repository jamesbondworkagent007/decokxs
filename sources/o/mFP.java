package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class mFP extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.ProgressBar EZpvd;
    public final ConstraintLayout OLrzqt;

    public mFP(java.lang.Object obj, android.view.View view, int i, ConstraintLayout constraintLayout, android.widget.ProgressBar progressBar, android.widget.TextView textView) {
        super(obj, view, i);
        this.OLrzqt = constraintLayout;
        this.EZpvd = progressBar;
        this.AEQbTJ = textView;
    }
}
