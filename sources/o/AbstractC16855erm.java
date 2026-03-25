package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.okinc.business.defi.wallet.home.escapebind.model.EscapeBindAccountListUIBean;

/* JADX INFO: renamed from: o.erm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16855erm extends ViewDataBinding {
    public final AppCompatImageView AEQbTJ;
    public final AppCompatTextView EZpvd;

    @Bindable
    public EscapeBindAccountListUIBean KWHzl;
    public final C55251xgS OLrzqt;
    public final AppCompatTextView copydefault;

    public AbstractC16855erm(java.lang.Object obj, android.view.View view, int i, C55251xgS c55251xgS, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        super(obj, view, i);
        this.OLrzqt = c55251xgS;
        this.AEQbTJ = appCompatImageView;
        this.copydefault = appCompatTextView;
        this.EZpvd = appCompatTextView2;
    }
}
