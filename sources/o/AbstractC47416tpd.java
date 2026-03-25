package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C47315tni;

/* JADX INFO: renamed from: o.tpd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47416tpd extends ViewDataBinding {
    public final RecyclerView EZpvd;
    public final C45146skL KWHzl;
    public final android.widget.TextView copydefault;

    public AbstractC47416tpd(java.lang.Object obj, android.view.View view, int i, C45146skL c45146skL, RecyclerView recyclerView, android.widget.TextView textView) {
        super(obj, view, i);
        this.KWHzl = c45146skL;
        this.EZpvd = recyclerView;
        this.copydefault = textView;
    }

    public static AbstractC47416tpd AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        return copydefault(view, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47416tpd copydefault(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47416tpd) ViewDataBinding.bind(obj, view, C47315tni.ActionBar.fFgQHt);
    }
}
