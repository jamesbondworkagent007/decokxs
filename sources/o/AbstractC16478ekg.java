package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ekg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16478ekg extends ViewDataBinding {
    public final android.widget.LinearLayout OLrzqt;

    public AbstractC16478ekg(java.lang.Object obj, android.view.View view, int i, android.widget.LinearLayout linearLayout) {
        super(obj, view, i);
        this.OLrzqt = linearLayout;
    }

    public static AbstractC16478ekg OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return copydefault(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16478ekg copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16478ekg) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.DcqEDu, viewGroup, z, obj);
    }
}
