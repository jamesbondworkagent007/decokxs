package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C25493ixk;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iKV extends ViewDataBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.FrameLayout EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final C27343jtR copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView valueOf;

    public iKV(java.lang.Object obj, android.view.View view, int i, android.widget.ImageView imageView, android.widget.TextView textView, android.widget.ImageView imageView2, C27343jtR c27343jtR, android.widget.FrameLayout frameLayout, android.widget.TextView textView2, android.widget.TextView textView3, android.widget.TextView textView4) {
        super(obj, view, i);
        this.AEQbTJ = imageView;
        this.KWHzl = textView;
        this.OLrzqt = imageView2;
        this.copydefault = c27343jtR;
        this.EZpvd = frameLayout;
        this.valueOf = textView2;
        this.AYXKKw = textView3;
        this.djBIcL = textView4;
    }

    public static iKV OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return copydefault(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static iKV copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (iKV) ViewDataBinding.inflateInternal(layoutInflater, C25493ixk.Activity.DGUQLIOvDItG, viewGroup, z, obj);
    }
}
