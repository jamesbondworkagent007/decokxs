package o;

import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public abstract class uZM extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final RecyclerView KWHzl;
    public final android.widget.TextView copydefault;

    public uZM(java.lang.Object obj, android.view.View view, int i, android.widget.TextView textView, RecyclerView recyclerView, android.widget.TextView textView2, android.widget.TextView textView3) {
        super(obj, view, i);
        this.copydefault = textView;
        this.KWHzl = recyclerView;
        this.EZpvd = textView2;
        this.AEQbTJ = textView3;
    }
}
