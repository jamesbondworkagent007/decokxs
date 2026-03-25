package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uTb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC48483uTb extends ViewDataBinding {
    public final AppCompatImageView EZpvd;
    public final android.widget.TextView KWHzl;
    public final C55258xgZ OLrzqt;
    public final AppCompatImageView copydefault;

    public AbstractC48483uTb(java.lang.Object obj, android.view.View view, int i, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, android.widget.TextView textView, C55258xgZ c55258xgZ) {
        super(obj, view, i);
        this.copydefault = appCompatImageView;
        this.EZpvd = appCompatImageView2;
        this.KWHzl = textView;
        this.OLrzqt = c55258xgZ;
    }

    public static AbstractC48483uTb copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC48483uTb KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC48483uTb) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.aGOrKO, viewGroup, z, obj);
    }
}
