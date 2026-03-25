package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.okinc.business.defi.dapp.view.DappBrowserMultiModeToolbar;

/* JADX INFO: renamed from: o.dMh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13464dMh extends ViewDataBinding {
    public final android.view.View AEQbTJ;
    public final DappBrowserMultiModeToolbar AhwBna;
    public final ConstraintLayout EZpvd;
    public final ConstraintLayout KWHzl;
    public final ConstraintLayout OLrzqt;
    public final android.widget.ProgressBar copydefault;

    public AbstractC13464dMh(java.lang.Object obj, android.view.View view, int i, ConstraintLayout constraintLayout, android.view.View view2, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, android.widget.ProgressBar progressBar, DappBrowserMultiModeToolbar dappBrowserMultiModeToolbar) {
        super(obj, view, i);
        this.KWHzl = constraintLayout;
        this.AEQbTJ = view2;
        this.EZpvd = constraintLayout2;
        this.OLrzqt = constraintLayout3;
        this.copydefault = progressBar;
        this.AhwBna = dappBrowserMultiModeToolbar;
    }
}
