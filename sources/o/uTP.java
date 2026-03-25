package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public abstract class uTP extends ViewDataBinding {
    public final C33546myW AEQbTJ;
    public final AppCompatTextView AhwBna;
    public final Group EZpvd;
    public final C55173xeu KWHzl;
    public final RecyclerView OLrzqt;
    public final AppCompatImageView copydefault;

    public uTP(java.lang.Object obj, android.view.View view, int i, Group group, C55173xeu c55173xeu, C33546myW c33546myW, AppCompatImageView appCompatImageView, RecyclerView recyclerView, AppCompatTextView appCompatTextView) {
        super(obj, view, i);
        this.EZpvd = group;
        this.KWHzl = c55173xeu;
        this.AEQbTJ = c33546myW;
        this.copydefault = appCompatImageView;
        this.OLrzqt = recyclerView;
        this.AhwBna = appCompatTextView;
    }
}
