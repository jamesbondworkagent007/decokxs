package o;

import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.enc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16633enc extends ViewDataBinding {
    public final AbstractC16843era AEQbTJ;
    public final AbstractC16843era AhwBna;
    public final AbstractC16844erb EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final NestedScrollView OLrzqt;
    public final AbstractC16843era copydefault;

    public AbstractC16633enc(java.lang.Object obj, android.view.View view, int i, AbstractC16844erb abstractC16844erb, AbstractC16843era abstractC16843era, android.widget.LinearLayout linearLayout, NestedScrollView nestedScrollView, AbstractC16843era abstractC16843era2, AbstractC16843era abstractC16843era3) {
        super(obj, view, i);
        this.EZpvd = abstractC16844erb;
        this.copydefault = abstractC16843era;
        this.KWHzl = linearLayout;
        this.OLrzqt = nestedScrollView;
        this.AEQbTJ = abstractC16843era2;
        this.AhwBna = abstractC16843era3;
    }

    public static AbstractC16633enc OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return copydefault(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16633enc copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16633enc) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.fXYAwm, viewGroup, z, obj);
    }
}
