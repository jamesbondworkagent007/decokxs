package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C47315tni;

/* JADX INFO: renamed from: o.tnX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47304tnX extends ViewDataBinding {
    public final RecyclerView AEQbTJ;
    public final C55173xeu EZpvd;
    public final C33546myW KWHzl;
    public final C55052xcf OLrzqt;
    public final C33604mzb copydefault;

    public AbstractC47304tnX(java.lang.Object obj, android.view.View view, int i, C55173xeu c55173xeu, C55052xcf c55052xcf, RecyclerView recyclerView, C33604mzb c33604mzb, C33546myW c33546myW) {
        super(obj, view, i);
        this.EZpvd = c55173xeu;
        this.OLrzqt = c55052xcf;
        this.AEQbTJ = recyclerView;
        this.copydefault = c33604mzb;
        this.KWHzl = c33546myW;
    }

    public static AbstractC47304tnX AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47304tnX OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47304tnX) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.fARcdN, null, false, obj);
    }
}
