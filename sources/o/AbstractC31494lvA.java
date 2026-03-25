package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.banner.OKAlertBanner;

/* JADX INFO: renamed from: o.lvA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC31494lvA extends ViewDataBinding {
    public final OKAlertBanner AEQbTJ;
    public final android.widget.RelativeLayout EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final mIW OLrzqt;
    public final ComposeView copydefault;
    public final AppCompatTextView valueOf;

    public AbstractC31494lvA(java.lang.Object obj, android.view.View view, int i, mIW miw, OKAlertBanner oKAlertBanner, ComposeView composeView, android.widget.LinearLayout linearLayout, android.widget.RelativeLayout relativeLayout, AppCompatTextView appCompatTextView) {
        super(obj, view, i);
        this.OLrzqt = miw;
        this.AEQbTJ = oKAlertBanner;
        this.copydefault = composeView;
        this.KWHzl = linearLayout;
        this.EZpvd = relativeLayout;
        this.valueOf = appCompatTextView;
    }
}
