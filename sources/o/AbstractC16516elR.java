package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.list.OKAnchorSelection;
import o.C13754dXa;

/* JADX INFO: renamed from: o.elR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16516elR extends ViewDataBinding {
    public final OKAnchorSelection AEQbTJ;
    public final android.widget.FrameLayout OLrzqt;

    public AbstractC16516elR(java.lang.Object obj, android.view.View view, int i, OKAnchorSelection oKAnchorSelection, android.widget.FrameLayout frameLayout) {
        super(obj, view, i);
        this.AEQbTJ = oKAnchorSelection;
        this.OLrzqt = frameLayout;
    }

    public static AbstractC16516elR EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16516elR AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16516elR) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.fBE, viewGroup, z, obj);
    }
}
