package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C47315tni;

/* JADX INFO: renamed from: o.toZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47359toZ extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final C45146skL EZpvd;
    public final RecyclerView copydefault;

    public AbstractC47359toZ(java.lang.Object obj, android.view.View view, int i, C45146skL c45146skL, RecyclerView recyclerView, android.widget.TextView textView) {
        super(obj, view, i);
        this.EZpvd = c45146skL;
        this.copydefault = recyclerView;
        this.AEQbTJ = textView;
    }

    public static AbstractC47359toZ copydefault(@androidx.annotation.NonNull android.view.View view) {
        return copydefault(view, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47359toZ copydefault(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47359toZ) ViewDataBinding.bind(obj, view, C47315tni.ActionBar.aKErDB);
    }
}
