package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C35399nuc;

/* JADX INFO: loaded from: classes8.dex */
public abstract class nJV extends ViewDataBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final C33546myW AYXKKw;
    public final C33604mzb AhwBna;
    public final ConstraintLayout EZpvd;
    public final wYF KWHzl;
    public final android.widget.CheckBox OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final android.widget.TextView gEmmrt;
    public final RecyclerView valueOf;

    public nJV(java.lang.Object obj, android.view.View view, int i, android.widget.LinearLayout linearLayout, wYF wyf, android.widget.CheckBox checkBox, android.widget.FrameLayout frameLayout, ConstraintLayout constraintLayout, C33604mzb c33604mzb, RecyclerView recyclerView, C33546myW c33546myW, android.widget.TextView textView) {
        super(obj, view, i);
        this.copydefault = linearLayout;
        this.KWHzl = wyf;
        this.OLrzqt = checkBox;
        this.AEQbTJ = frameLayout;
        this.EZpvd = constraintLayout;
        this.AhwBna = c33604mzb;
        this.valueOf = recyclerView;
        this.AYXKKw = c33546myW;
        this.gEmmrt = textView;
    }

    public static nJV EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return copydefault(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static nJV copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (nJV) ViewDataBinding.inflateInternal(layoutInflater, C35399nuc.Dialog.hBpjJd, viewGroup, z, obj);
    }
}
