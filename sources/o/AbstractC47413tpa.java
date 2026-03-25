package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C47315tni;

/* JADX INFO: renamed from: o.tpa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47413tpa extends ViewDataBinding {
    public final C55113xdn AEQbTJ;
    public final android.widget.FrameLayout EZpvd;
    public final RecyclerView KWHzl;
    public final C55173xeu OLrzqt;

    public AbstractC47413tpa(java.lang.Object obj, android.view.View view, int i, android.widget.FrameLayout frameLayout, C55113xdn c55113xdn, RecyclerView recyclerView, C55173xeu c55173xeu) {
        super(obj, view, i);
        this.EZpvd = frameLayout;
        this.AEQbTJ = c55113xdn;
        this.KWHzl = recyclerView;
        this.OLrzqt = c55173xeu;
    }

    public static AbstractC47413tpa copydefault(@androidx.annotation.NonNull android.view.View view) {
        return AEQbTJ(view, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47413tpa AEQbTJ(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47413tpa) ViewDataBinding.bind(obj, view, C47315tni.ActionBar.RcXXUw);
    }
}
