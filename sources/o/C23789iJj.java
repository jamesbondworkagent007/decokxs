package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.okinc.business.invest_biz.data.bean.InvestChip;

/* JADX INFO: renamed from: o.iJj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C23789iJj extends AbstractC23791iJl {
    public static final ViewDataBinding.IncludedLayouts AEQbTJ = null;
    public static final android.util.SparseIntArray OLrzqt = null;
    public long djBIcL;
    public final ConstraintLayout valueOf;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    public C23789iJj(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, AEQbTJ, OLrzqt));
    }

    public C23789iJj(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[1]);
        this.djBIcL = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.valueOf = constraintLayout;
        constraintLayout.setTag(null);
        this.EZpvd.setTag(null);
        this.KWHzl.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.djBIcL = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.djBIcL != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C25488ixf.OLrzqt != i) {
            return false;
        }
        copydefault((InvestChip) obj);
        return true;
    }

    public void copydefault(@androidx.annotation.Nullable InvestChip investChip) {
        this.copydefault = investChip;
        synchronized (this) {
            this.djBIcL |= 1;
        }
        notifyPropertyChanged(C25488ixf.OLrzqt);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        java.lang.String strEZpvd;
        java.lang.String strKWHzl;
        synchronized (this) {
            j = this.djBIcL;
            this.djBIcL = 0L;
        }
        InvestChip investChip = this.copydefault;
        long j2 = j & 3;
        if (j2 == 0 || investChip == null) {
            strEZpvd = null;
            strKWHzl = null;
        } else {
            strEZpvd = investChip.EZpvd();
            strKWHzl = investChip.KWHzl();
        }
        if (j2 != 0) {
            TextViewBindingAdapter.setText(this.EZpvd, strEZpvd);
            TextViewBindingAdapter.setText(this.KWHzl, strKWHzl);
        }
    }
}
