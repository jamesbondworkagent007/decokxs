package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.buysell.ui.quickconvert.QuickConvertViewModel;

/* JADX INFO: renamed from: o.lvu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC31540lvu extends ViewDataBinding {
    public final C52794wYp AEQbTJ;
    public final ConstraintLayout EZpvd;

    @Bindable
    public QuickConvertViewModel KWHzl;
    public final android.widget.FrameLayout OLrzqt;
    public final LottieAnimationView copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView valueOf;

    public AbstractC31540lvu(java.lang.Object obj, android.view.View view, int i, android.widget.FrameLayout frameLayout, ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, C52794wYp c52794wYp, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.OLrzqt = frameLayout;
        this.EZpvd = constraintLayout;
        this.copydefault = lottieAnimationView;
        this.AEQbTJ = c52794wYp;
        this.valueOf = textView;
        this.djBIcL = textView2;
    }
}
