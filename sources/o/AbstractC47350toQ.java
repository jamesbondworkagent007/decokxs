package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C47315tni;

/* JADX INFO: renamed from: o.toQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47350toQ extends ViewDataBinding {
    public final RecyclerView OLrzqt;

    public AbstractC47350toQ(java.lang.Object obj, android.view.View view, int i, RecyclerView recyclerView) {
        super(obj, view, i);
        this.OLrzqt = recyclerView;
    }

    public static AbstractC47350toQ OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        return EZpvd(view, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47350toQ EZpvd(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47350toQ) ViewDataBinding.bind(obj, view, C47315tni.ActionBar.djSkpj);
    }
}
