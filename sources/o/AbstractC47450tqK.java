package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;
import o.C47315tni;

/* JADX INFO: renamed from: o.tqK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47450tqK extends ViewDataBinding {
    public final ViewStubProxy EZpvd;

    public AbstractC47450tqK(java.lang.Object obj, android.view.View view, int i, ViewStubProxy viewStubProxy) {
        super(obj, view, i);
        this.EZpvd = viewStubProxy;
    }

    public static AbstractC47450tqK KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47450tqK KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47450tqK) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.dUDNAs, viewGroup, z, obj);
    }
}
