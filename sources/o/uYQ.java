package o;

import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.uilab.view.OKSortTextView;

/* JADX INFO: loaded from: classes11.dex */
public abstract class uYQ extends ViewDataBinding {
    public final Guideline AEQbTJ;
    public final RecyclerView AYXKKw;
    public final C33537myN EZpvd;
    public final OKSortTextView KWHzl;
    public final OKSortTextView OLrzqt;
    public final OKSortTextView copydefault;

    public uYQ(java.lang.Object obj, android.view.View view, int i, C33537myN c33537myN, OKSortTextView oKSortTextView, OKSortTextView oKSortTextView2, OKSortTextView oKSortTextView3, Guideline guideline, RecyclerView recyclerView) {
        super(obj, view, i);
        this.EZpvd = c33537myN;
        this.OLrzqt = oKSortTextView;
        this.copydefault = oKSortTextView2;
        this.KWHzl = oKSortTextView3;
        this.AEQbTJ = guideline;
        this.AYXKKw = recyclerView;
    }
}
