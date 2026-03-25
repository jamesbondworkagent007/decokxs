package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C35399nuc;

/* JADX INFO: loaded from: classes8.dex */
public abstract class nJS extends ViewDataBinding {
    public final C55230xfy AEQbTJ;
    public final C33546myW EZpvd;
    public final C33604mzb KWHzl;
    public final RecyclerView OLrzqt;
    public final C55173xeu copydefault;

    public nJS(java.lang.Object obj, android.view.View view, int i, C55173xeu c55173xeu, C55230xfy c55230xfy, RecyclerView recyclerView, C33604mzb c33604mzb, C33546myW c33546myW) {
        super(obj, view, i);
        this.copydefault = c55173xeu;
        this.AEQbTJ = c55230xfy;
        this.OLrzqt = recyclerView;
        this.KWHzl = c33604mzb;
        this.EZpvd = c33546myW;
    }

    public static nJS copydefault(@androidx.annotation.NonNull android.view.View view) {
        return OLrzqt(view, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static nJS OLrzqt(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.Nullable java.lang.Object obj) {
        return (nJS) ViewDataBinding.bind(obj, view, C35399nuc.Dialog.dHguZz);
    }
}
