package o;

import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.erY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16841erY extends ViewDataBinding {

    @Bindable
    public C15489eKf AEQbTJ;
    public final AbstractC16867ery KWHzl;
    public final AbstractC16746epj copydefault;

    public abstract void KWHzl(@androidx.annotation.Nullable C15489eKf c15489eKf);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C15489eKf copydefault() {
        return this.AEQbTJ;
    }

    public AbstractC16841erY(java.lang.Object obj, android.view.View view, int i, AbstractC16746epj abstractC16746epj, AbstractC16867ery abstractC16867ery) {
        super(obj, view, i);
        this.copydefault = abstractC16746epj;
        this.KWHzl = abstractC16867ery;
    }

    public static AbstractC16841erY AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return EZpvd(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16841erY EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16841erY) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.zXhzOT, viewGroup, z, obj);
    }
}
