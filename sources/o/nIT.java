package o;

import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class nIT extends ViewDataBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final androidx.appcompat.widget.Toolbar KWHzl;
    public final FragmentContainerView OLrzqt;
    public final wYC copydefault;
    public final android.widget.TextView djBIcL;

    public nIT(java.lang.Object obj, android.view.View view, int i, FragmentContainerView fragmentContainerView, wYC wyc, android.widget.ImageView imageView, androidx.appcompat.widget.Toolbar toolbar, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.OLrzqt = fragmentContainerView;
        this.copydefault = wyc;
        this.AEQbTJ = imageView;
        this.KWHzl = toolbar;
        this.EZpvd = textView;
        this.djBIcL = textView2;
    }
}
