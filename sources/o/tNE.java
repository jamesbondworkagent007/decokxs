package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47501trL;

/* JADX INFO: loaded from: classes10.dex */
public abstract class tNE extends ViewDataBinding {
    public final android.widget.RelativeLayout AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.TextView djBIcL;

    public tNE(java.lang.Object obj, android.view.View view, int i, android.widget.RelativeLayout relativeLayout, android.widget.ImageView imageView, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3, android.widget.TextView textView4, android.widget.TextView textView5) {
        super(obj, view, i);
        this.AEQbTJ = relativeLayout;
        this.KWHzl = imageView;
        this.EZpvd = textView;
        this.OLrzqt = textView2;
        this.copydefault = textView3;
        this.AhwBna = textView4;
        this.djBIcL = textView5;
    }

    public static tNE EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static tNE OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (tNE) ViewDataBinding.inflateInternal(layoutInflater, C47501trL.Application.iRxXKY, viewGroup, z, obj);
    }
}
