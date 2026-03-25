package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: o.ehB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16288ehB extends ViewDataBinding {
    public final RecyclerView EZpvd;
    public final C52794wYp KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final C33537myN copydefault;

    public AbstractC16288ehB(java.lang.Object obj, android.view.View view, int i, C33537myN c33537myN, C52794wYp c52794wYp, LinearLayoutCompat linearLayoutCompat, RecyclerView recyclerView) {
        super(obj, view, i);
        this.copydefault = c33537myN;
        this.KWHzl = c52794wYp;
        this.OLrzqt = linearLayoutCompat;
        this.EZpvd = recyclerView;
    }
}
