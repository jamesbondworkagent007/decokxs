package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.esV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16891esV extends ViewDataBinding {
    public final AbstractC16890esU AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final RecyclerView AhwBna;
    public final android.widget.TextView AkhnZx;
    public final ConstraintLayout EZpvd;
    public final android.widget.ImageView KWHzl;
    public final AbstractC16890esU OLrzqt;
    public final ConstraintLayout copydefault;
    public final RecyclerView djBIcL;
    public final android.widget.TextView fetchVPNInfo;
    public final LinearLayoutCompat gEmmrt;
    public final Group valueOf;

    public AbstractC16891esV(java.lang.Object obj, android.view.View view, int i, android.widget.ImageView imageView, ConstraintLayout constraintLayout, AbstractC16890esU abstractC16890esU, AbstractC16890esU abstractC16890esU2, ConstraintLayout constraintLayout2, LinearLayoutCompat linearLayoutCompat, Group group, RecyclerView recyclerView, RecyclerView recyclerView2, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3) {
        super(obj, view, i);
        this.KWHzl = imageView;
        this.EZpvd = constraintLayout;
        this.OLrzqt = abstractC16890esU;
        this.AEQbTJ = abstractC16890esU2;
        this.copydefault = constraintLayout2;
        this.gEmmrt = linearLayoutCompat;
        this.valueOf = group;
        this.djBIcL = recyclerView;
        this.AhwBna = recyclerView2;
        this.AYXKKw = textView;
        this.AkhnZx = textView2;
        this.fetchVPNInfo = textView3;
    }

    public static AbstractC16891esV KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16891esV AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16891esV) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.Qsauvs, viewGroup, z, obj);
    }
}
