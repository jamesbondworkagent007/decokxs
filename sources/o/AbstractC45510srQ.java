package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import o.C45508srO;

/* JADX INFO: renamed from: o.srQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC45510srQ extends ViewDataBinding {
    public final C52794wYp AEQbTJ;
    public final C55113xdn AYXKKw;
    public final android.widget.LinearLayout AhwBna;
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.ImageView KWHzl;
    public final C33537myN OLrzqt;
    public final android.widget.FrameLayout copydefault;
    public final C55317xhf djBIcL;
    public final android.widget.LinearLayout gEmmrt;
    public final android.widget.TextView isConnected;
    public final LottieAnimationView valueOf;
    public final android.widget.TextView values;

    public AbstractC45510srQ(java.lang.Object obj, android.view.View view, int i, C33537myN c33537myN, C52794wYp c52794wYp, android.widget.FrameLayout frameLayout, android.widget.ImageView imageView, android.widget.LinearLayout linearLayout, LottieAnimationView lottieAnimationView, android.widget.LinearLayout linearLayout2, android.widget.LinearLayout linearLayout3, C55113xdn c55113xdn, C55317xhf c55317xhf, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.OLrzqt = c33537myN;
        this.AEQbTJ = c52794wYp;
        this.copydefault = frameLayout;
        this.KWHzl = imageView;
        this.EZpvd = linearLayout;
        this.valueOf = lottieAnimationView;
        this.gEmmrt = linearLayout2;
        this.AhwBna = linearLayout3;
        this.AYXKKw = c55113xdn;
        this.djBIcL = c55317xhf;
        this.values = textView;
        this.isConnected = textView2;
    }

    public static AbstractC45510srQ KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC45510srQ KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC45510srQ) ViewDataBinding.inflateInternal(layoutInflater, C45508srO.Activity.EZpvd, viewGroup, z, obj);
    }
}
