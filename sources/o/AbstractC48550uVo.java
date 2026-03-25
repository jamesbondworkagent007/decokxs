package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: o.uVo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC48550uVo extends ViewDataBinding {
    public final RecyclerView AEQbTJ;
    public final AppCompatImageView AYXKKw;
    public final C33604mzb EZpvd;
    public final AppCompatTextView KWHzl;
    public final AppCompatImageView OLrzqt;
    public final AppCompatTextView copydefault;
    public final Group djBIcL;
    public final C55113xdn gEmmrt;
    public final C33546myW valueOf;

    public AbstractC48550uVo(java.lang.Object obj, android.view.View view, int i, RecyclerView recyclerView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView, C33604mzb c33604mzb, AppCompatImageView appCompatImageView2, C33546myW c33546myW, Group group, C55113xdn c55113xdn) {
        super(obj, view, i);
        this.AEQbTJ = recyclerView;
        this.copydefault = appCompatTextView;
        this.KWHzl = appCompatTextView2;
        this.OLrzqt = appCompatImageView;
        this.EZpvd = c33604mzb;
        this.AYXKKw = appCompatImageView2;
        this.valueOf = c33546myW;
        this.djBIcL = group;
        this.gEmmrt = c55113xdn;
    }
}
