package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.okinc.okex.center.view.TransformableFloatingUnReadMsgActionButton;
import com.okinc.uilab.banner.OKAlertBanner;
import o.C47315tni;

/* JADX INFO: renamed from: o.tnC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47283tnC extends ViewDataBinding {
    public final OKAlertBanner AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final android.widget.FrameLayout AhwBna;
    public final android.widget.RelativeLayout AkhnZx;
    public final android.view.View AuCTel;
    public final C55173xeu DbNXlk;
    public final android.widget.ImageView EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final AppBarLayout copydefault;
    public final android.widget.FrameLayout djBIcL;
    public final C55113xdn fJNWhG;
    public final android.widget.ImageView fetchVPNInfo;
    public final CollapsingToolbarLayout gEmmrt;
    public final android.widget.TextView isConnected;
    public final TransformableFloatingUnReadMsgActionButton valueOf;
    public final android.widget.TextView values;

    public AbstractC47283tnC(java.lang.Object obj, android.view.View view, int i, OKAlertBanner oKAlertBanner, AppBarLayout appBarLayout, android.widget.LinearLayout linearLayout, android.widget.ImageView imageView, android.widget.ImageView imageView2, AppCompatTextView appCompatTextView, android.widget.FrameLayout frameLayout, CollapsingToolbarLayout collapsingToolbarLayout, TransformableFloatingUnReadMsgActionButton transformableFloatingUnReadMsgActionButton, android.widget.FrameLayout frameLayout2, android.widget.ImageView imageView3, android.widget.RelativeLayout relativeLayout, android.widget.TextView textView, android.widget.TextView textView2, C55173xeu c55173xeu, C55113xdn c55113xdn, android.view.View view2) {
        super(obj, view, i);
        this.AEQbTJ = oKAlertBanner;
        this.copydefault = appBarLayout;
        this.KWHzl = linearLayout;
        this.OLrzqt = imageView;
        this.EZpvd = imageView2;
        this.AYXKKw = appCompatTextView;
        this.AhwBna = frameLayout;
        this.gEmmrt = collapsingToolbarLayout;
        this.valueOf = transformableFloatingUnReadMsgActionButton;
        this.djBIcL = frameLayout2;
        this.fetchVPNInfo = imageView3;
        this.AkhnZx = relativeLayout;
        this.values = textView;
        this.isConnected = textView2;
        this.DbNXlk = c55173xeu;
        this.fJNWhG = c55113xdn;
        this.AuCTel = view2;
    }

    public static AbstractC47283tnC copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return AEQbTJ(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47283tnC AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47283tnC) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.values, null, false, obj);
    }
}
