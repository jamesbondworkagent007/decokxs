package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eva, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17055eva extends ViewDataBinding {
    public final C55251xgS AEQbTJ;
    public final C57299yfm EZpvd;
    public final AppCompatTextView OLrzqt;
    public final android.widget.ImageView copydefault;

    public AbstractC17055eva(java.lang.Object obj, android.view.View view, int i, C57299yfm c57299yfm, android.widget.ImageView imageView, AppCompatTextView appCompatTextView, C55251xgS c55251xgS) {
        super(obj, view, i);
        this.EZpvd = c57299yfm;
        this.copydefault = imageView;
        this.OLrzqt = appCompatTextView;
        this.AEQbTJ = c55251xgS;
    }

    public static AbstractC17055eva OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC17055eva OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC17055eva) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.DGgkXd, viewGroup, z, obj);
    }
}
