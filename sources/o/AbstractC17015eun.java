package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eun, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17015eun extends ViewDataBinding {
    public final C33603mza AEQbTJ;
    public final C33546myW AYXKKw;
    public final C33537myN EZpvd;
    public final RecyclerView KWHzl;
    public final C55173xeu OLrzqt;
    public final C55113xdn copydefault;

    public AbstractC17015eun(java.lang.Object obj, android.view.View view, int i, C33537myN c33537myN, C55173xeu c55173xeu, C55113xdn c55113xdn, RecyclerView recyclerView, C33603mza c33603mza, C33546myW c33546myW) {
        super(obj, view, i);
        this.EZpvd = c33537myN;
        this.OLrzqt = c55173xeu;
        this.copydefault = c55113xdn;
        this.KWHzl = recyclerView;
        this.AEQbTJ = c33603mza;
        this.AYXKKw = c33546myW;
    }

    public static AbstractC17015eun AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return EZpvd(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC17015eun EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC17015eun) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.dNxZaP, null, false, obj);
    }
}
