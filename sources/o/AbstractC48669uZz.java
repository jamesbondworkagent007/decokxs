package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uZz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC48669uZz extends ViewDataBinding {
    public final AppCompatTextView EZpvd;

    public AbstractC48669uZz(java.lang.Object obj, android.view.View view, int i, AppCompatTextView appCompatTextView) {
        super(obj, view, i);
        this.EZpvd = appCompatTextView;
    }

    public static AbstractC48669uZz KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return copydefault(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC48669uZz copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC48669uZz) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.iLWfRf, viewGroup, z, obj);
    }
}
