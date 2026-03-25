package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lvr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC31537lvr extends ViewDataBinding {
    public final ConstraintLayout AEQbTJ;
    public final ConstraintLayout AYXKKw;
    public final C52794wYp AhwBna;
    public final ConstraintLayout EZpvd;
    public final androidx.appcompat.widget.Toolbar KWHzl;
    public final ConstraintLayout OLrzqt;
    public final android.widget.ImageView copydefault;
    public final wYC djBIcL;
    public final android.widget.ScrollView gEmmrt;
    public final android.widget.TextView isConnected;
    public final android.widget.TextView valueOf;
    public final android.widget.TextView values;

    public AbstractC31537lvr(java.lang.Object obj, android.view.View view, int i, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, androidx.appcompat.widget.Toolbar toolbar, ConstraintLayout constraintLayout3, android.widget.ImageView imageView, ConstraintLayout constraintLayout4, C52794wYp c52794wYp, wYC wyc, android.widget.ScrollView scrollView, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3) {
        super(obj, view, i);
        this.AEQbTJ = constraintLayout;
        this.EZpvd = constraintLayout2;
        this.KWHzl = toolbar;
        this.OLrzqt = constraintLayout3;
        this.copydefault = imageView;
        this.AYXKKw = constraintLayout4;
        this.AhwBna = c52794wYp;
        this.djBIcL = wyc;
        this.gEmmrt = scrollView;
        this.valueOf = textView;
        this.values = textView2;
        this.isConnected = textView3;
    }

    public static AbstractC31537lvr AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC31537lvr KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC31537lvr) ViewDataBinding.inflateInternal(layoutInflater, C31351lsQ.ActionBar.dNCPSb, viewGroup, z, obj);
    }
}
