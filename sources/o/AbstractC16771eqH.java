package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.okinc.business.defi.wallet.hardware.keystone.KeystoneSelectAccountViewModel;

/* JADX INFO: renamed from: o.eqH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16771eqH extends ViewDataBinding {
    public final C55251xgS AEQbTJ;
    public final ConstraintLayout AYXKKw;
    public final AppCompatTextView AhwBna;
    public final C55251xgS EZpvd;
    public final AppCompatTextView KWHzl;
    public final AppCompatTextView OLrzqt;
    public final android.widget.ImageView copydefault;
    public final AppCompatTextView djBIcL;

    @Bindable
    public KeystoneSelectAccountViewModel.KeystoneAccountInfo gEmmrt;
    public final AppCompatImageView valueOf;

    public AbstractC16771eqH(java.lang.Object obj, android.view.View view, int i, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, C55251xgS c55251xgS, C55251xgS c55251xgS2, android.widget.ImageView imageView, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4) {
        super(obj, view, i);
        this.OLrzqt = appCompatTextView;
        this.KWHzl = appCompatTextView2;
        this.AEQbTJ = c55251xgS;
        this.EZpvd = c55251xgS2;
        this.copydefault = imageView;
        this.valueOf = appCompatImageView;
        this.AYXKKw = constraintLayout;
        this.AhwBna = appCompatTextView3;
        this.djBIcL = appCompatTextView4;
    }
}
