package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vbq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC50847vbq extends ViewDataBinding {
    public final AppCompatTextView OLrzqt;

    public AbstractC50847vbq(java.lang.Object obj, android.view.View view, int i, AppCompatTextView appCompatTextView) {
        super(obj, view, i);
        this.OLrzqt = appCompatTextView;
    }

    public static AbstractC50847vbq KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC50847vbq AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC50847vbq) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.gLWkOL, viewGroup, z, obj);
    }
}
