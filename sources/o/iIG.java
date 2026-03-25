package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.okinc.business.invest_biz.ui.widget.filter.InvestBaseFilterItem;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iIG extends ViewDataBinding {
    public final AppCompatTextView AEQbTJ;

    @Bindable
    public InvestBaseFilterItem KWHzl;
    public final AppCompatImageView OLrzqt;
    public final AppCompatImageView copydefault;

    public iIG(java.lang.Object obj, android.view.View view, int i, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView) {
        super(obj, view, i);
        this.copydefault = appCompatImageView;
        this.OLrzqt = appCompatImageView2;
        this.AEQbTJ = appCompatTextView;
    }
}
