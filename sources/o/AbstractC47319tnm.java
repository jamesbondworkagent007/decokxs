package o;

import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: o.tnm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47319tnm extends ViewDataBinding {
    public final C33537myN AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.LinearLayout EZpvd;

    @Bindable
    public java.lang.String KWHzl;
    public final android.widget.FrameLayout OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final C55237xgE djBIcL;
    public final android.widget.TextView gEmmrt;
    public final RecyclerView valueOf;

    public abstract void KWHzl(@androidx.annotation.Nullable java.lang.String str);

    public AbstractC47319tnm(java.lang.Object obj, android.view.View view, int i, C33537myN c33537myN, android.widget.FrameLayout frameLayout, android.widget.LinearLayout linearLayout, android.widget.LinearLayout linearLayout2, RecyclerView recyclerView, C55237xgE c55237xgE, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3) {
        super(obj, view, i);
        this.AEQbTJ = c33537myN;
        this.OLrzqt = frameLayout;
        this.copydefault = linearLayout;
        this.EZpvd = linearLayout2;
        this.valueOf = recyclerView;
        this.djBIcL = c55237xgE;
        this.AYXKKw = textView;
        this.AhwBna = textView2;
        this.gEmmrt = textView3;
    }
}
