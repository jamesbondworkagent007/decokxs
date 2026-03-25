package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C25493ixk;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iLV extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final C55251xgS AhwBna;
    public final android.widget.TextView EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final ConstraintLayout copydefault;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView valueOf;

    public iLV(java.lang.Object obj, android.view.View view, int i, ConstraintLayout constraintLayout, android.widget.ImageView imageView, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3, C55251xgS c55251xgS, android.widget.TextView textView4, android.widget.TextView textView5) {
        super(obj, view, i);
        this.copydefault = constraintLayout;
        this.KWHzl = imageView;
        this.AEQbTJ = textView;
        this.EZpvd = textView2;
        this.OLrzqt = textView3;
        this.AhwBna = c55251xgS;
        this.gEmmrt = textView4;
        this.valueOf = textView5;
    }

    public static iLV AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return copydefault(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static iLV copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (iLV) ViewDataBinding.inflateInternal(layoutInflater, C25493ixk.Activity.DQYQgr, viewGroup, z, obj);
    }
}
