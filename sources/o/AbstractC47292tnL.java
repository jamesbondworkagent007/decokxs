package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C47315tni;

/* JADX INFO: renamed from: o.tnL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47292tnL extends ViewDataBinding {
    public final RecyclerView copydefault;

    public AbstractC47292tnL(java.lang.Object obj, android.view.View view, int i, RecyclerView recyclerView) {
        super(obj, view, i);
        this.copydefault = recyclerView;
    }

    public static AbstractC47292tnL copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return EZpvd(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47292tnL EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47292tnL) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.isConnected, null, false, obj);
    }
}
