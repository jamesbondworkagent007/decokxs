package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.list.OKAnchorSelection;
import o.dLX;

/* JADX INFO: loaded from: classes4.dex */
public abstract class dMC extends ViewDataBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final android.view.View KWHzl;
    public final wYC OLrzqt;
    public final OKAnchorSelection copydefault;

    public dMC(java.lang.Object obj, android.view.View view, int i, OKAnchorSelection oKAnchorSelection, android.view.View view2, wYC wyc, android.widget.LinearLayout linearLayout, android.widget.TextView textView) {
        super(obj, view, i);
        this.copydefault = oKAnchorSelection;
        this.KWHzl = view2;
        this.OLrzqt = wyc;
        this.AEQbTJ = linearLayout;
        this.EZpvd = textView;
    }

    public static dMC KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return EZpvd(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static dMC EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (dMC) ViewDataBinding.inflateInternal(layoutInflater, dLX.Fragment.getFieldNames, viewGroup, z, obj);
    }
}
