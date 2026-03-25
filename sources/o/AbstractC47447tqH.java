package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.tqH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47447tqH extends ViewDataBinding {
    public final ConstraintLayout AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.LinearLayout AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;
    public final C55251xgS djBIcL;
    public final android.view.View fetchVPNInfo;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView valueOf;
    public final android.widget.TextView values;

    public AbstractC47447tqH(java.lang.Object obj, android.view.View view, int i, android.widget.TextView textView, ConstraintLayout constraintLayout, android.widget.TextView textView2, android.widget.TextView textView3, android.widget.TextView textView4, android.widget.TextView textView5, android.widget.LinearLayout linearLayout, C55251xgS c55251xgS, android.widget.TextView textView6, android.widget.TextView textView7, android.widget.TextView textView8, android.widget.TextView textView9, android.view.View view2) {
        super(obj, view, i);
        this.copydefault = textView;
        this.AEQbTJ = constraintLayout;
        this.KWHzl = textView2;
        this.OLrzqt = textView3;
        this.EZpvd = textView4;
        this.AYXKKw = textView5;
        this.AhwBna = linearLayout;
        this.djBIcL = c55251xgS;
        this.gEmmrt = textView6;
        this.valueOf = textView7;
        this.values = textView8;
        this.AkhnZx = textView9;
        this.fetchVPNInfo = view2;
    }

    public static AbstractC47447tqH KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47447tqH KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47447tqH) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.aUsmxb, viewGroup, z, obj);
    }
}
