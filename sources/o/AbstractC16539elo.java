package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.elo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16539elo extends ViewDataBinding {
    public final RecyclerView AEQbTJ;
    public final C55230xfy EZpvd;
    public final C55113xdn KWHzl;
    public final C55173xeu OLrzqt;
    public final C55173xeu copydefault;

    public AbstractC16539elo(java.lang.Object obj, android.view.View view, int i, C55173xeu c55173xeu, C55173xeu c55173xeu2, C55113xdn c55113xdn, RecyclerView recyclerView, C55230xfy c55230xfy) {
        super(obj, view, i);
        this.OLrzqt = c55173xeu;
        this.copydefault = c55173xeu2;
        this.KWHzl = c55113xdn;
        this.AEQbTJ = recyclerView;
        this.EZpvd = c55230xfy;
    }

    public static AbstractC16539elo AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16539elo KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16539elo) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.sVXHln, viewGroup, z, obj);
    }
}
