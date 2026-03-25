package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class mGW extends ViewDataBinding {
    public final wYC AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final ConstraintLayout KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final RecyclerView copydefault;

    public mGW(java.lang.Object obj, android.view.View view, int i, ConstraintLayout constraintLayout, wYC wyc, android.widget.ImageView imageView, RecyclerView recyclerView, android.widget.TextView textView) {
        super(obj, view, i);
        this.KWHzl = constraintLayout;
        this.AEQbTJ = wyc;
        this.OLrzqt = imageView;
        this.copydefault = recyclerView;
        this.EZpvd = textView;
    }
}
