package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nKl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC33912nKl extends ViewDataBinding {
    public final C33604mzb AEQbTJ;
    public final C33537myN EZpvd;
    public final C33546myW OLrzqt;
    public final RecyclerView copydefault;

    public AbstractC33912nKl(java.lang.Object obj, android.view.View view, int i, C33537myN c33537myN, C33604mzb c33604mzb, RecyclerView recyclerView, C33546myW c33546myW) {
        super(obj, view, i);
        this.EZpvd = c33537myN;
        this.AEQbTJ = c33604mzb;
        this.copydefault = recyclerView;
        this.OLrzqt = c33546myW;
    }

    public static AbstractC33912nKl OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        return AEQbTJ(view, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC33912nKl AEQbTJ(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC33912nKl) ViewDataBinding.bind(obj, view, C35399nuc.Dialog.QwvEab);
    }
}
