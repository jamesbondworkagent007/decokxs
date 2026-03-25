package o;

import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class nIP extends ViewDataBinding {
    public final FragmentContainerView AEQbTJ;
    public final wYC EZpvd;
    public final android.widget.ImageView KWHzl;
    public final androidx.appcompat.widget.Toolbar OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.TextView valueOf;

    public nIP(java.lang.Object obj, android.view.View view, int i, wYC wyc, android.widget.ImageView imageView, FragmentContainerView fragmentContainerView, androidx.appcompat.widget.Toolbar toolbar, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.EZpvd = wyc;
        this.KWHzl = imageView;
        this.AEQbTJ = fragmentContainerView;
        this.OLrzqt = toolbar;
        this.copydefault = textView;
        this.valueOf = textView2;
    }
}
