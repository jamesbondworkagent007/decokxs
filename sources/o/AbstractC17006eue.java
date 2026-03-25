package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eue, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17006eue extends ViewDataBinding {
    public final C33537myN AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView DbNXlk;
    public final MaterialCardView EZpvd;
    public final C52794wYp KWHzl;
    public final C52794wYp OLrzqt;
    public final MaterialCardView copydefault;
    public final android.widget.TextView djBIcL;
    public final RecyclerView gEmmrt;
    public final android.widget.TextView valueOf;

    public AbstractC17006eue(java.lang.Object obj, android.view.View view, int i, C33537myN c33537myN, C52794wYp c52794wYp, C52794wYp c52794wYp2, MaterialCardView materialCardView, MaterialCardView materialCardView2, RecyclerView recyclerView, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3, android.widget.TextView textView4, android.widget.TextView textView5) {
        super(obj, view, i);
        this.AEQbTJ = c33537myN;
        this.KWHzl = c52794wYp;
        this.OLrzqt = c52794wYp2;
        this.copydefault = materialCardView;
        this.EZpvd = materialCardView2;
        this.gEmmrt = recyclerView;
        this.AYXKKw = textView;
        this.AhwBna = textView2;
        this.djBIcL = textView3;
        this.valueOf = textView4;
        this.DbNXlk = textView5;
    }

    public static AbstractC17006eue AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return AEQbTJ(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC17006eue AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC17006eue) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.ikIEnW, null, false, obj);
    }
}
