package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iLW extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final ConstraintLayout OLrzqt;
    public final android.widget.ImageView copydefault;

    public iLW(java.lang.Object obj, android.view.View view, int i, android.widget.ImageView imageView, ConstraintLayout constraintLayout, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3) {
        super(obj, view, i);
        this.copydefault = imageView;
        this.OLrzqt = constraintLayout;
        this.EZpvd = textView;
        this.AEQbTJ = textView2;
        this.KWHzl = textView3;
    }
}
