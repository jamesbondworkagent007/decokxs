package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uYw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC48639uYw extends ViewDataBinding {
    public final wYK KWHzl;
    public final AppCompatTextView copydefault;

    public AbstractC48639uYw(java.lang.Object obj, android.view.View view, int i, wYK wyk, AppCompatTextView appCompatTextView) {
        super(obj, view, i);
        this.KWHzl = wyk;
        this.copydefault = appCompatTextView;
    }

    public static AbstractC48639uYw KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return EZpvd(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC48639uYw EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC48639uYw) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.zXhzOT, viewGroup, z, obj);
    }
}
