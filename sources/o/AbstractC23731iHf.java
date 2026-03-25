package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iHf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC23731iHf extends ViewDataBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final C55008xbo AhwBna;
    public final C52794wYp EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final C33537myN OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final android.widget.TextView djBIcL;
    public final C55258xgZ valueOf;

    public AbstractC23731iHf(java.lang.Object obj, android.view.View view, int i, C33537myN c33537myN, C52794wYp c52794wYp, android.widget.ImageView imageView, android.widget.LinearLayout linearLayout, android.widget.LinearLayout linearLayout2, C55008xbo c55008xbo, android.widget.TextView textView, C55258xgZ c55258xgZ, android.widget.TextView textView2) {
        super(obj, view, i);
        this.OLrzqt = c33537myN;
        this.EZpvd = c52794wYp;
        this.AEQbTJ = imageView;
        this.KWHzl = linearLayout;
        this.copydefault = linearLayout2;
        this.AhwBna = c55008xbo;
        this.djBIcL = textView;
        this.valueOf = c55258xgZ;
        this.AYXKKw = textView2;
    }

    public static AbstractC23731iHf EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return AEQbTJ(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC23731iHf AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC23731iHf) ViewDataBinding.inflateInternal(layoutInflater, C25493ixk.Activity.AkhnZx, null, false, obj);
    }
}
