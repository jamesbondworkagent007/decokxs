package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.buysell.ui.result.ConvertResultViewModel;
import com.okinc.convenientbanner.ConvenientBanner;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.ltJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC31397ltJ extends ViewDataBinding {
    public final LottieAnimationView AEQbTJ;

    @Bindable
    public ConvertResultViewModel AYXKKw;
    public final ConstraintLayout AhwBna;
    public final android.widget.ImageView EZpvd;
    public final ConstraintLayout KWHzl;
    public final ConstraintLayout OLrzqt;
    public final ConvenientBanner copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView fetchVPNInfo;
    public final AbstractC31595lwx gEmmrt;
    public final android.widget.TextView isConnected;
    public final android.widget.ScrollView valueOf;
    public final android.widget.TextView values;

    public abstract void EZpvd(@androidx.annotation.Nullable ConvertResultViewModel convertResultViewModel);

    public AbstractC31397ltJ(java.lang.Object obj, android.view.View view, int i, ConvenientBanner convenientBanner, android.widget.ImageView imageView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, LottieAnimationView lottieAnimationView, android.widget.ScrollView scrollView, android.widget.TextView textView, AbstractC31595lwx abstractC31595lwx, ConstraintLayout constraintLayout3, android.widget.TextView textView2, android.widget.TextView textView3, android.widget.TextView textView4) {
        super(obj, view, i);
        this.copydefault = convenientBanner;
        this.EZpvd = imageView;
        this.KWHzl = constraintLayout;
        this.OLrzqt = constraintLayout2;
        this.AEQbTJ = lottieAnimationView;
        this.valueOf = scrollView;
        this.djBIcL = textView;
        this.gEmmrt = abstractC31595lwx;
        this.AhwBna = constraintLayout3;
        this.isConnected = textView2;
        this.values = textView3;
        this.fetchVPNInfo = textView4;
    }

    public static AbstractC31397ltJ OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return KWHzl(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC31397ltJ KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC31397ltJ) ViewDataBinding.inflateInternal(layoutInflater, C31351lsQ.ActionBar.OLrzqt, null, false, obj);
    }
}
