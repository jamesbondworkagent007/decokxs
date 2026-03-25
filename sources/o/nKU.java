package o;

import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class nKU extends ViewDataBinding {

    @Bindable
    public boolean AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final android.widget.ImageView EZpvd;
    public final android.widget.ImageView KWHzl;

    @Bindable
    public boolean OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.RelativeLayout djBIcL;
    public final android.widget.TextView gEmmrt;

    public abstract void OLrzqt(boolean z);

    public nKU(java.lang.Object obj, android.view.View view, int i, android.widget.ImageView imageView, android.widget.TextView textView, android.widget.ImageView imageView2, android.widget.RelativeLayout relativeLayout, android.widget.TextView textView2, android.widget.TextView textView3) {
        super(obj, view, i);
        this.KWHzl = imageView;
        this.copydefault = textView;
        this.EZpvd = imageView2;
        this.djBIcL = relativeLayout;
        this.AhwBna = textView2;
        this.gEmmrt = textView3;
    }
}
