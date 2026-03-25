package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C47315tni;

/* JADX INFO: renamed from: o.toV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47355toV extends ViewDataBinding {
    public final RecyclerView AEQbTJ;
    public final C55251xgS AYXKKw;
    public final android.widget.TextView AhwBna;
    public final C54979xbL EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.FrameLayout OLrzqt;
    public final ConstraintLayout copydefault;
    public final C47445tqF djBIcL;
    public final RecyclerView gEmmrt;
    public final android.view.View valueOf;

    public AbstractC47355toV(java.lang.Object obj, android.view.View view, int i, android.widget.FrameLayout frameLayout, ConstraintLayout constraintLayout, C54979xbL c54979xbL, android.widget.TextView textView, RecyclerView recyclerView, RecyclerView recyclerView2, C47445tqF c47445tqF, C55251xgS c55251xgS, android.widget.TextView textView2, android.view.View view2) {
        super(obj, view, i);
        this.OLrzqt = frameLayout;
        this.copydefault = constraintLayout;
        this.EZpvd = c54979xbL;
        this.KWHzl = textView;
        this.AEQbTJ = recyclerView;
        this.gEmmrt = recyclerView2;
        this.djBIcL = c47445tqF;
        this.AYXKKw = c55251xgS;
        this.AhwBna = textView2;
        this.valueOf = view2;
    }

    public static AbstractC47355toV KWHzl(@androidx.annotation.NonNull android.view.View view) {
        return KWHzl(view, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47355toV KWHzl(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47355toV) ViewDataBinding.bind(obj, view, C47315tni.ActionBar.dNCPSb);
    }
}
