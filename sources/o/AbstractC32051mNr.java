package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C31976mKx;

/* JADX INFO: renamed from: o.mNr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC32051mNr extends ViewDataBinding {
    public final android.widget.ImageView AEQbTJ;
    public final C55249xgQ AYXKKw;
    public final android.widget.TextView AhwBna;
    public final RecyclerView EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.widget.ImageView copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView valueOf;

    public AbstractC32051mNr(java.lang.Object obj, android.view.View view, int i, RecyclerView recyclerView, android.widget.ImageView imageView, android.widget.ImageView imageView2, android.widget.ImageView imageView3, android.widget.ImageView imageView4, C55249xgQ c55249xgQ, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3, android.widget.TextView textView4) {
        super(obj, view, i);
        this.EZpvd = recyclerView;
        this.KWHzl = imageView;
        this.copydefault = imageView2;
        this.AEQbTJ = imageView3;
        this.OLrzqt = imageView4;
        this.AYXKKw = c55249xgQ;
        this.gEmmrt = textView;
        this.djBIcL = textView2;
        this.valueOf = textView3;
        this.AhwBna = textView4;
    }

    public static AbstractC32051mNr KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC32051mNr KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC32051mNr) ViewDataBinding.inflateInternal(layoutInflater, C31976mKx.Application.ORxRYg, viewGroup, z, obj);
    }
}
