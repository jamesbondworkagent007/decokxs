package o;

import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nMd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC33958nMd extends ViewDataBinding {

    @Bindable
    public C37734ozS AEQbTJ;

    public AbstractC33958nMd(java.lang.Object obj, android.view.View view, int i) {
        super(obj, view, i);
    }

    public static AbstractC33958nMd AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return EZpvd(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC33958nMd EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC33958nMd) ViewDataBinding.inflateInternal(layoutInflater, C35399nuc.Dialog.hvKCwS, viewGroup, z, obj);
    }
}
