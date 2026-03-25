package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nKm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC33913nKm extends ViewDataBinding {
    public final C35887oHj AEQbTJ;
    public final C55173xeu EZpvd;
    public final C33546myW KWHzl;
    public final RecyclerView OLrzqt;
    public final C55113xdn copydefault;

    public AbstractC33913nKm(java.lang.Object obj, android.view.View view, int i, C55173xeu c55173xeu, RecyclerView recyclerView, C35887oHj c35887oHj, C33546myW c33546myW, C55113xdn c55113xdn) {
        super(obj, view, i);
        this.EZpvd = c55173xeu;
        this.OLrzqt = recyclerView;
        this.AEQbTJ = c35887oHj;
        this.KWHzl = c33546myW;
        this.copydefault = c55113xdn;
    }

    public static AbstractC33913nKm KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return EZpvd(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC33913nKm EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC33913nKm) ViewDataBinding.inflateInternal(layoutInflater, C35399nuc.Dialog.UlJrfe, viewGroup, z, obj);
    }
}
