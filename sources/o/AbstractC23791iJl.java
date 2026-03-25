package o;

import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.okinc.business.invest_biz.data.bean.InvestChip;

/* JADX INFO: renamed from: o.iJl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC23791iJl extends ViewDataBinding {
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;

    @Bindable
    public InvestChip copydefault;

    public AbstractC23791iJl(java.lang.Object obj, android.view.View view, int i, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.EZpvd = textView;
        this.KWHzl = textView2;
    }
}
