package o;

import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.esj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16905esj extends ViewDataBinding {
    public final AbstractC16746epj AEQbTJ;
    public final AbstractC16867ery OLrzqt;

    @Bindable
    public C15489eKf copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C15489eKf KWHzl() {
        return this.copydefault;
    }

    public abstract void copydefault(@androidx.annotation.Nullable C15489eKf c15489eKf);

    public AbstractC16905esj(java.lang.Object obj, android.view.View view, int i, AbstractC16746epj abstractC16746epj, AbstractC16867ery abstractC16867ery) {
        super(obj, view, i);
        this.AEQbTJ = abstractC16746epj;
        this.OLrzqt = abstractC16867ery;
    }

    public static AbstractC16905esj copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16905esj AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16905esj) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.hKJZrr, viewGroup, z, obj);
    }
}
