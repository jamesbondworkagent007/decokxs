package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vcO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC50872vcO extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final C55258xgZ KWHzl;
    public final C55052xcf OLrzqt;
    public final C47988uAv copydefault;

    public AbstractC50872vcO(java.lang.Object obj, android.view.View view, int i, C47988uAv c47988uAv, C55052xcf c55052xcf, android.widget.TextView textView, android.widget.TextView textView2, C55258xgZ c55258xgZ) {
        super(obj, view, i);
        this.copydefault = c47988uAv;
        this.OLrzqt = c55052xcf;
        this.AEQbTJ = textView;
        this.EZpvd = textView2;
        this.KWHzl = c55258xgZ;
    }

    public static AbstractC50872vcO copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return EZpvd(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC50872vcO EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC50872vcO) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.FF, viewGroup, z, obj);
    }
}
