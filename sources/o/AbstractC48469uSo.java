package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uSo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC48469uSo extends ViewDataBinding {
    public final ConstraintLayout AEQbTJ;
    public final RecyclerView EZpvd;
    public final C52794wYp KWHzl;
    public final android.widget.TextView OLrzqt;
    public final C55258xgZ copydefault;
    public final C55372xih djBIcL;

    public AbstractC48469uSo(java.lang.Object obj, android.view.View view, int i, C52794wYp c52794wYp, C55258xgZ c55258xgZ, ConstraintLayout constraintLayout, android.widget.TextView textView, RecyclerView recyclerView, C55372xih c55372xih) {
        super(obj, view, i);
        this.KWHzl = c52794wYp;
        this.copydefault = c55258xgZ;
        this.AEQbTJ = constraintLayout;
        this.OLrzqt = textView;
        this.EZpvd = recyclerView;
        this.djBIcL = c55372xih;
    }

    public static AbstractC48469uSo EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC48469uSo OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC48469uSo) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.ihnvzI, viewGroup, z, obj);
    }
}
