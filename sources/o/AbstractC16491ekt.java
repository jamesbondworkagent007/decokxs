package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.okinc.business.defi.biz.core.segwit.bean.AddressData;

/* JADX INFO: renamed from: o.ekt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16491ekt extends ViewDataBinding {
    public final AppCompatImageView AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final ConstraintLayout KWHzl;

    @Bindable
    public AddressData OLrzqt;
    public final android.widget.TextView copydefault;
    public final C55251xgS gEmmrt;

    public AbstractC16491ekt(java.lang.Object obj, android.view.View view, int i, AppCompatImageView appCompatImageView, android.widget.TextView textView, android.widget.TextView textView2, ConstraintLayout constraintLayout, C55251xgS c55251xgS) {
        super(obj, view, i);
        this.AEQbTJ = appCompatImageView;
        this.copydefault = textView;
        this.EZpvd = textView2;
        this.KWHzl = constraintLayout;
        this.gEmmrt = c55251xgS;
    }
}
