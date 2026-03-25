package o;

import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class nIC extends ViewDataBinding {
    public final FragmentContainerView AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final androidx.appcompat.widget.Toolbar KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final wYC copydefault;

    public nIC(java.lang.Object obj, android.view.View view, int i, android.widget.ImageView imageView, FragmentContainerView fragmentContainerView, wYC wyc, androidx.appcompat.widget.Toolbar toolbar, android.widget.TextView textView) {
        super(obj, view, i);
        this.OLrzqt = imageView;
        this.AEQbTJ = fragmentContainerView;
        this.copydefault = wyc;
        this.KWHzl = toolbar;
        this.EZpvd = textView;
    }
}
