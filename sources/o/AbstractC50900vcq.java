package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vcq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC50900vcq extends ViewDataBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final ConstraintLayout AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.widget.TextView DbNXlk;
    public final C55052xcf EZpvd;
    public final android.view.View KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final LinearLayoutCompat copydefault;
    public final ConstraintLayout djBIcL;
    public final android.widget.TextView fJNWhG;
    public final android.widget.TextView fetchVPNInfo;
    public final C55258xgZ gEmmrt;
    public final C55258xgZ isConnected;
    public final ConstraintLayout valueOf;
    public final C55258xgZ values;

    public AbstractC50900vcq(java.lang.Object obj, android.view.View view, int i, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, LinearLayoutCompat linearLayoutCompat3, C55052xcf c55052xcf, android.view.View view2, C55258xgZ c55258xgZ, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, android.widget.TextView textView, C55258xgZ c55258xgZ2, android.widget.TextView textView2, C55258xgZ c55258xgZ3, android.widget.TextView textView3, android.widget.TextView textView4, android.widget.TextView textView5) {
        super(obj, view, i);
        this.AEQbTJ = linearLayoutCompat;
        this.OLrzqt = linearLayoutCompat2;
        this.copydefault = linearLayoutCompat3;
        this.EZpvd = c55052xcf;
        this.KWHzl = view2;
        this.gEmmrt = c55258xgZ;
        this.valueOf = constraintLayout;
        this.AhwBna = constraintLayout2;
        this.djBIcL = constraintLayout3;
        this.AYXKKw = textView;
        this.values = c55258xgZ2;
        this.AkhnZx = textView2;
        this.isConnected = c55258xgZ3;
        this.DbNXlk = textView3;
        this.fetchVPNInfo = textView4;
        this.fJNWhG = textView5;
    }

    public static AbstractC50900vcq KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return copydefault(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC50900vcq copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC50900vcq) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.aWuQzD, viewGroup, z, obj);
    }
}
