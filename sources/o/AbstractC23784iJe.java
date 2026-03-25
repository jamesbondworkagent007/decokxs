package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.okinc.business.invest_biz.ui.page.InvestPoolTypeChooseFragment;

/* JADX INFO: renamed from: o.iJe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC23784iJe extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;

    @Bindable
    public InvestPoolTypeChooseFragment.PoolDialogDataItem EZpvd;
    public final ConstraintLayout KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;

    public AbstractC23784iJe(java.lang.Object obj, android.view.View view, int i, ConstraintLayout constraintLayout, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3) {
        super(obj, view, i);
        this.KWHzl = constraintLayout;
        this.AEQbTJ = textView;
        this.OLrzqt = textView2;
        this.copydefault = textView3;
    }
}
