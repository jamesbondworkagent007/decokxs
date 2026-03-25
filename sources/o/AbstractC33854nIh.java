package o;

import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;

/* JADX INFO: renamed from: o.nIh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC33854nIh extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final androidx.appcompat.widget.Toolbar EZpvd;
    public final android.widget.ImageView KWHzl;
    public final wYC OLrzqt;
    public final FragmentContainerView copydefault;

    public AbstractC33854nIh(java.lang.Object obj, android.view.View view, int i, android.widget.ImageView imageView, FragmentContainerView fragmentContainerView, wYC wyc, androidx.appcompat.widget.Toolbar toolbar, android.widget.TextView textView) {
        super(obj, view, i);
        this.KWHzl = imageView;
        this.copydefault = fragmentContainerView;
        this.OLrzqt = wyc;
        this.EZpvd = toolbar;
        this.AEQbTJ = textView;
    }
}
