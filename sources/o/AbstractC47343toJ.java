package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C47315tni;

/* JADX INFO: renamed from: o.toJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47343toJ extends ViewDataBinding {
    public final RecyclerView KWHzl;
    public final android.widget.TextView copydefault;

    public AbstractC47343toJ(java.lang.Object obj, android.view.View view, int i, android.widget.TextView textView, RecyclerView recyclerView) {
        super(obj, view, i);
        this.copydefault = textView;
        this.KWHzl = recyclerView;
    }

    public static AbstractC47343toJ KWHzl(@androidx.annotation.NonNull android.view.View view) {
        return copydefault(view, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47343toJ copydefault(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47343toJ) ViewDataBinding.bind(obj, view, C47315tni.ActionBar.QfsBiF);
    }
}
