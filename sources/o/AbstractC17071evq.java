package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.evq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17071evq extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final wYC EZpvd;
    public final android.widget.LinearLayout OLrzqt;
    public final AppCompatImageView copydefault;

    public AbstractC17071evq(java.lang.Object obj, android.view.View view, int i, wYC wyc, AppCompatImageView appCompatImageView, android.widget.LinearLayout linearLayout, android.widget.TextView textView) {
        super(obj, view, i);
        this.EZpvd = wyc;
        this.copydefault = appCompatImageView;
        this.OLrzqt = linearLayout;
        this.AEQbTJ = textView;
    }

    public static AbstractC17071evq EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC17071evq OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC17071evq) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.onProviderDisabled, viewGroup, z, obj);
    }
}
