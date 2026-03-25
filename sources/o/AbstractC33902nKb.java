package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nKb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC33902nKb extends ViewDataBinding {
    public final C35887oHj AEQbTJ;
    public final C33546myW EZpvd;
    public final RecyclerView KWHzl;
    public final C33603mza OLrzqt;
    public final android.widget.FrameLayout copydefault;

    public AbstractC33902nKb(java.lang.Object obj, android.view.View view, int i, android.widget.FrameLayout frameLayout, RecyclerView recyclerView, C35887oHj c35887oHj, C33603mza c33603mza, C33546myW c33546myW) {
        super(obj, view, i);
        this.copydefault = frameLayout;
        this.KWHzl = recyclerView;
        this.AEQbTJ = c35887oHj;
        this.OLrzqt = c33603mza;
        this.EZpvd = c33546myW;
    }

    public static AbstractC33902nKb copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return copydefault(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC33902nKb copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC33902nKb) ViewDataBinding.inflateInternal(layoutInflater, C35399nuc.Dialog.OFhtUX, viewGroup, z, obj);
    }
}
