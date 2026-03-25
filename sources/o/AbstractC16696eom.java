package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eom, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16696eom extends ViewDataBinding {
    public final C17114ewg AEQbTJ;
    public final RecyclerView EZpvd;
    public final C54989xbV KWHzl;
    public final C33603mza OLrzqt;
    public final C33546myW copydefault;

    public AbstractC16696eom(java.lang.Object obj, android.view.View view, int i, C54989xbV c54989xbV, RecyclerView recyclerView, C17114ewg c17114ewg, C33603mza c33603mza, C33546myW c33546myW) {
        super(obj, view, i);
        this.KWHzl = c54989xbV;
        this.EZpvd = recyclerView;
        this.AEQbTJ = c17114ewg;
        this.OLrzqt = c33603mza;
        this.copydefault = c33546myW;
    }

    public static AbstractC16696eom copydefault(@androidx.annotation.NonNull android.view.View view) {
        return AEQbTJ(view, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16696eom AEQbTJ(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16696eom) ViewDataBinding.bind(obj, view, C13754dXa.TaskDescription.dIjzlO);
    }
}
