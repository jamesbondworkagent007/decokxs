package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vcj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC50893vcj extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final C47988uAv KWHzl;
    public final C53539wnR copydefault;

    public AbstractC50893vcj(java.lang.Object obj, android.view.View view, int i, C53539wnR c53539wnR, android.widget.TextView textView, C47988uAv c47988uAv) {
        super(obj, view, i);
        this.copydefault = c53539wnR;
        this.AEQbTJ = textView;
        this.KWHzl = c47988uAv;
    }

    public static AbstractC50893vcj KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return EZpvd(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC50893vcj EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC50893vcj) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.jFiva, viewGroup, z, obj);
    }
}
