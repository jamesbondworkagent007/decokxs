package o;

import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.pKK;

/* JADX INFO: renamed from: o.pLj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC38077pLj extends ViewDataBinding {
    public final RecyclerView AEQbTJ;
    public final ComposeView EZpvd;
    public final android.widget.TextView KWHzl;

    public AbstractC38077pLj(java.lang.Object obj, android.view.View view, int i, ComposeView composeView, RecyclerView recyclerView, android.widget.TextView textView) {
        super(obj, view, i);
        this.EZpvd = composeView;
        this.AEQbTJ = recyclerView;
        this.KWHzl = textView;
    }

    public static AbstractC38077pLj KWHzl(@androidx.annotation.NonNull android.view.View view) {
        return EZpvd(view, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC38077pLj EZpvd(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC38077pLj) ViewDataBinding.bind(obj, view, pKK.ActionBar.OLrzqt);
    }
}
