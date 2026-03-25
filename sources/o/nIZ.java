package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import o.C35399nuc;

/* JADX INFO: loaded from: classes8.dex */
public abstract class nIZ extends ViewDataBinding {
    public final android.widget.ImageView AEQbTJ;
    public final LottieAnimationView EZpvd;
    public final wYC KWHzl;
    public final C55173xeu OLrzqt;
    public final RecyclerView copydefault;
    public final android.widget.TextView djBIcL;
    public final androidx.appcompat.widget.Toolbar valueOf;

    public nIZ(java.lang.Object obj, android.view.View view, int i, android.widget.ImageView imageView, C55173xeu c55173xeu, wYC wyc, RecyclerView recyclerView, LottieAnimationView lottieAnimationView, androidx.appcompat.widget.Toolbar toolbar, android.widget.TextView textView) {
        super(obj, view, i);
        this.AEQbTJ = imageView;
        this.OLrzqt = c55173xeu;
        this.KWHzl = wyc;
        this.copydefault = recyclerView;
        this.EZpvd = lottieAnimationView;
        this.valueOf = toolbar;
        this.djBIcL = textView;
    }

    public static nIZ copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return copydefault(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static nIZ copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (nIZ) ViewDataBinding.inflateInternal(layoutInflater, C35399nuc.Dialog.QfsBiF, null, false, obj);
    }
}
