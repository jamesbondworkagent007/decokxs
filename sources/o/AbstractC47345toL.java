package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C47315tni;

/* JADX INFO: renamed from: o.toL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47345toL extends ViewDataBinding {
    public final C33546myW AEQbTJ;
    public final C55173xeu EZpvd;
    public final RecyclerView KWHzl;
    public final C33604mzb OLrzqt;
    public final C55113xdn copydefault;

    public AbstractC47345toL(java.lang.Object obj, android.view.View view, int i, C55173xeu c55173xeu, C55113xdn c55113xdn, RecyclerView recyclerView, C33604mzb c33604mzb, C33546myW c33546myW) {
        super(obj, view, i);
        this.EZpvd = c55173xeu;
        this.copydefault = c55113xdn;
        this.KWHzl = recyclerView;
        this.OLrzqt = c33604mzb;
        this.AEQbTJ = c33546myW;
    }

    public static AbstractC47345toL copydefault(@androidx.annotation.NonNull android.view.View view) {
        return KWHzl(view, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47345toL KWHzl(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47345toL) ViewDataBinding.bind(obj, view, C47315tni.ActionBar.QbewEr);
    }
}
