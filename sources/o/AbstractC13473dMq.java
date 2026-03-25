package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.okinc.business.defi.dapp.webview.DappTabData;

/* JADX INFO: renamed from: o.dMq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13473dMq extends ViewDataBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final ConstraintLayout EZpvd;
    public final C55064xcr KWHzl;
    public final android.widget.ImageView OLrzqt;

    @Bindable
    public DappTabData copydefault;
    public final android.widget.RelativeLayout valueOf;

    public AbstractC13473dMq(java.lang.Object obj, android.view.View view, int i, android.widget.ImageView imageView, android.widget.ImageView imageView2, ConstraintLayout constraintLayout, C55064xcr c55064xcr, android.widget.TextView textView, android.widget.RelativeLayout relativeLayout) {
        super(obj, view, i);
        this.OLrzqt = imageView;
        this.AEQbTJ = imageView2;
        this.EZpvd = constraintLayout;
        this.KWHzl = c55064xcr;
        this.AhwBna = textView;
        this.valueOf = relativeLayout;
    }
}
