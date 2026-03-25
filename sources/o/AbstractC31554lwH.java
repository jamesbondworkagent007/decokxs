package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.banner.OKAlertBanner;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lwH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC31554lwH extends ViewDataBinding {
    public final mIW AEQbTJ;
    public final C55249xgQ AYXKKw;
    public final androidx.appcompat.widget.Toolbar AhwBna;
    public final ConstraintLayout EZpvd;
    public final OKAlertBanner KWHzl;
    public final ComposeView OLrzqt;
    public final android.widget.ImageView copydefault;
    public final AppCompatTextView djBIcL;
    public final AppCompatTextView gEmmrt;
    public final android.widget.ImageView valueOf;

    public AbstractC31554lwH(java.lang.Object obj, android.view.View view, int i, OKAlertBanner oKAlertBanner, ComposeView composeView, mIW miw, android.widget.ImageView imageView, ConstraintLayout constraintLayout, android.widget.ImageView imageView2, C55249xgQ c55249xgQ, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, androidx.appcompat.widget.Toolbar toolbar) {
        super(obj, view, i);
        this.KWHzl = oKAlertBanner;
        this.OLrzqt = composeView;
        this.AEQbTJ = miw;
        this.copydefault = imageView;
        this.EZpvd = constraintLayout;
        this.valueOf = imageView2;
        this.AYXKKw = c55249xgQ;
        this.djBIcL = appCompatTextView;
        this.gEmmrt = appCompatTextView2;
        this.AhwBna = toolbar;
    }

    public static AbstractC31554lwH AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC31554lwH OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC31554lwH) ViewDataBinding.inflateInternal(layoutInflater, C31351lsQ.ActionBar.ffGIBT, viewGroup, z, obj);
    }
}
