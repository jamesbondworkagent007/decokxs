package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.evj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17064evj extends ViewDataBinding {
    public final android.widget.ImageView AEQbTJ;
    public final C57299yfm EZpvd;
    public final C55251xgS KWHzl;
    public final AppCompatTextView OLrzqt;
    public final android.widget.ImageView copydefault;

    public AbstractC17064evj(java.lang.Object obj, android.view.View view, int i, C57299yfm c57299yfm, android.widget.ImageView imageView, android.widget.ImageView imageView2, AppCompatTextView appCompatTextView, C55251xgS c55251xgS) {
        super(obj, view, i);
        this.EZpvd = c57299yfm;
        this.copydefault = imageView;
        this.AEQbTJ = imageView2;
        this.OLrzqt = appCompatTextView;
        this.KWHzl = c55251xgS;
    }

    public static AbstractC17064evj copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC17064evj AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC17064evj) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.onLocationChanged, viewGroup, z, obj);
    }
}
