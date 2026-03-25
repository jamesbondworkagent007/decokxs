package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C47315tni;

/* JADX INFO: renamed from: o.tnK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47291tnK extends ViewDataBinding {
    public final RecyclerView copydefault;

    public AbstractC47291tnK(java.lang.Object obj, android.view.View view, int i, RecyclerView recyclerView) {
        super(obj, view, i);
        this.copydefault = recyclerView;
    }

    public static AbstractC47291tnK OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return EZpvd(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47291tnK EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47291tnK) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.fetchVPNInfo, null, false, obj);
    }
}
