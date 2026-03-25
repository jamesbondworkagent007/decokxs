package o;

import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ers, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16861ers extends ViewDataBinding {

    @Bindable
    public C15489eKf AEQbTJ;
    public final AbstractC16746epj EZpvd;
    public final AbstractC16867ery copydefault;

    public abstract void EZpvd(@androidx.annotation.Nullable C15489eKf c15489eKf);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C15489eKf OLrzqt() {
        return this.AEQbTJ;
    }

    public AbstractC16861ers(java.lang.Object obj, android.view.View view, int i, AbstractC16746epj abstractC16746epj, AbstractC16867ery abstractC16867ery) {
        super(obj, view, i);
        this.EZpvd = abstractC16746epj;
        this.copydefault = abstractC16867ery;
    }

    public static AbstractC16861ers AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16861ers AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16861ers) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.Dfv, viewGroup, z, obj);
    }
}
