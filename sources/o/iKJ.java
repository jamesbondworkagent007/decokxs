package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C25493ixk;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iKJ extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final Barrier AYXKKw;
    public final android.widget.TextView AhwBna;
    public final LinearLayoutCompat EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final C27343jtR copydefault;
    public final android.widget.ImageView djBIcL;
    public final android.widget.ImageView gEmmrt;
    public final android.widget.TextView valueOf;

    public iKJ(java.lang.Object obj, android.view.View view, int i, C27343jtR c27343jtR, android.widget.TextView textView, android.widget.TextView textView2, LinearLayoutCompat linearLayoutCompat, android.widget.ImageView imageView, Barrier barrier, android.widget.ImageView imageView2, android.widget.TextView textView3, android.widget.TextView textView4, android.widget.ImageView imageView3) {
        super(obj, view, i);
        this.copydefault = c27343jtR;
        this.OLrzqt = textView;
        this.AEQbTJ = textView2;
        this.EZpvd = linearLayoutCompat;
        this.KWHzl = imageView;
        this.AYXKKw = barrier;
        this.djBIcL = imageView2;
        this.AhwBna = textView3;
        this.valueOf = textView4;
        this.gEmmrt = imageView3;
    }

    public static iKJ copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static iKJ OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (iKJ) ViewDataBinding.inflateInternal(layoutInflater, C25493ixk.Activity.zDUObI, viewGroup, z, obj);
    }
}
