package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.toC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47336toC extends ViewDataBinding {
    public final android.widget.FrameLayout copydefault;

    public AbstractC47336toC(java.lang.Object obj, android.view.View view, int i, android.widget.FrameLayout frameLayout) {
        super(obj, view, i);
        this.copydefault = frameLayout;
    }

    public static AbstractC47336toC OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47336toC KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47336toC) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.QOLQEE, viewGroup, z, obj);
    }
}
