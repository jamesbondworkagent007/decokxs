package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.list.OKAnchorSelection;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ejY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16417ejY extends ViewDataBinding {
    public final OKAnchorSelection EZpvd;

    public AbstractC16417ejY(java.lang.Object obj, android.view.View view, int i, OKAnchorSelection oKAnchorSelection) {
        super(obj, view, i);
        this.EZpvd = oKAnchorSelection;
    }

    public static AbstractC16417ejY AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16417ejY OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16417ejY) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.spnCvw, viewGroup, z, obj);
    }
}
