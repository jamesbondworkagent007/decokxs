package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C35399nuc;

/* JADX INFO: loaded from: classes8.dex */
public abstract class nKA extends ViewDataBinding {
    public final RecyclerView KWHzl;
    public final C33546myW OLrzqt;
    public final C33604mzb copydefault;

    public nKA(java.lang.Object obj, android.view.View view, int i, C33604mzb c33604mzb, RecyclerView recyclerView, C33546myW c33546myW) {
        super(obj, view, i);
        this.copydefault = c33604mzb;
        this.KWHzl = recyclerView;
        this.OLrzqt = c33546myW;
    }

    public static nKA copydefault(@androidx.annotation.NonNull android.view.View view) {
        return KWHzl(view, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static nKA KWHzl(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.Nullable java.lang.Object obj) {
        return (nKA) ViewDataBinding.bind(obj, view, C35399nuc.Dialog.Dmq);
    }
}
