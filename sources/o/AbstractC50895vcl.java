package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vcl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC50895vcl extends ViewDataBinding {
    public final C47988uAv AEQbTJ;
    public final C53530wnI EZpvd;
    public final C55258xgZ KWHzl;
    public final C50387vMn OLrzqt;

    public AbstractC50895vcl(java.lang.Object obj, android.view.View view, int i, C47988uAv c47988uAv, C50387vMn c50387vMn, C53530wnI c53530wnI, C55258xgZ c55258xgZ) {
        super(obj, view, i);
        this.AEQbTJ = c47988uAv;
        this.OLrzqt = c50387vMn;
        this.EZpvd = c53530wnI;
        this.KWHzl = c55258xgZ;
    }

    public static AbstractC50895vcl OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC50895vcl OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC50895vcl) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.fJk, viewGroup, z, obj);
    }
}
