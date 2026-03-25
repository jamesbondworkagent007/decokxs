package o;

import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.okinc.dapp.bean.DappSearchResultBean;

/* JADX INFO: renamed from: o.dMz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13482dMz extends ViewDataBinding {
    public final android.widget.ImageView AEQbTJ;
    public final wYC EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;

    @Bindable
    public DappSearchResultBean copydefault;

    public AbstractC13482dMz(java.lang.Object obj, android.view.View view, int i, wYC wyc, android.widget.ImageView imageView, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.EZpvd = wyc;
        this.AEQbTJ = imageView;
        this.KWHzl = textView;
        this.OLrzqt = textView2;
    }
}
