package o;

import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: o.ryK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC43914ryK extends ViewDataBinding {
    public final android.widget.RelativeLayout AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.LinearLayout EZpvd;
    public final RecyclerView KWHzl;

    @Bindable
    public rIB OLrzqt;
    public final C55008xbo copydefault;
    public final android.widget.TextView djBIcL;

    public AbstractC43914ryK(java.lang.Object obj, android.view.View view, int i, C55008xbo c55008xbo, android.widget.LinearLayout linearLayout, RecyclerView recyclerView, android.widget.RelativeLayout relativeLayout, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3) {
        super(obj, view, i);
        this.copydefault = c55008xbo;
        this.EZpvd = linearLayout;
        this.KWHzl = recyclerView;
        this.AEQbTJ = relativeLayout;
        this.djBIcL = textView;
        this.AhwBna = textView2;
        this.AYXKKw = textView3;
    }
}
