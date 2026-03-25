package o;

import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class dMH extends ViewDataBinding {
    public final android.widget.FrameLayout EZpvd;
    public final RecyclerView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final dMP copydefault;

    public dMH(java.lang.Object obj, android.view.View view, int i, RecyclerView recyclerView, dMP dmp, android.widget.FrameLayout frameLayout, android.widget.TextView textView) {
        super(obj, view, i);
        this.KWHzl = recyclerView;
        this.copydefault = dmp;
        this.EZpvd = frameLayout;
        this.OLrzqt = textView;
    }
}
