package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C47315tni;

/* JADX INFO: renamed from: o.toW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47356toW extends ViewDataBinding {
    public final C33604mzb AEQbTJ;
    public final C55173xeu AYXKKw;
    public final ConstraintLayout EZpvd;
    public final C45426spa KWHzl;
    public final C33546myW OLrzqt;
    public final C33603mza copydefault;
    public final RecyclerView gEmmrt;
    public final C55173xeu valueOf;

    public AbstractC47356toW(java.lang.Object obj, android.view.View view, int i, C45426spa c45426spa, ConstraintLayout constraintLayout, C33604mzb c33604mzb, C33603mza c33603mza, C33546myW c33546myW, RecyclerView recyclerView, C55173xeu c55173xeu, C55173xeu c55173xeu2) {
        super(obj, view, i);
        this.KWHzl = c45426spa;
        this.EZpvd = constraintLayout;
        this.AEQbTJ = c33604mzb;
        this.copydefault = c33603mza;
        this.OLrzqt = c33546myW;
        this.gEmmrt = recyclerView;
        this.valueOf = c55173xeu;
        this.AYXKKw = c55173xeu2;
    }

    public static AbstractC47356toW copydefault(@androidx.annotation.NonNull android.view.View view) {
        return KWHzl(view, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47356toW KWHzl(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47356toW) ViewDataBinding.bind(obj, view, C47315tni.ActionBar.UeEOUB);
    }
}
