package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.okinc.business.invest_biz.ui.widget.filter.InvestBaseFilterItem;
import o.C25493ixk;

/* JADX INFO: loaded from: classes6.dex */
public class iII extends iIG {
    public static final ViewDataBinding.IncludedLayouts EZpvd = null;
    public static final android.util.SparseIntArray valueOf;
    public long AYXKKw;
    public final ConstraintLayout djBIcL;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        valueOf = sparseIntArray;
        sparseIntArray.put(C25493ixk.ActionBar.GCXiNH, 3);
    }

    public iII(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, EZpvd, valueOf));
    }

    public iII(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatImageView) objArr[3], (AppCompatImageView) objArr[2], (AppCompatTextView) objArr[1]);
        this.AYXKKw = -1L;
        this.OLrzqt.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.djBIcL = constraintLayout;
        constraintLayout.setTag(null);
        this.AEQbTJ.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AYXKKw = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AYXKKw != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C25488ixf.OLrzqt != i) {
            return false;
        }
        KWHzl((InvestBaseFilterItem) obj);
        return true;
    }

    public void KWHzl(@androidx.annotation.Nullable InvestBaseFilterItem investBaseFilterItem) {
        this.KWHzl = investBaseFilterItem;
        synchronized (this) {
            this.AYXKKw |= 1;
        }
        notifyPropertyChanged(C25488ixf.OLrzqt);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        boolean selected;
        synchronized (this) {
            j = this.AYXKKw;
            this.AYXKKw = 0L;
        }
        InvestBaseFilterItem investBaseFilterItem = this.KWHzl;
        long j2 = j & 3;
        java.lang.String name = null;
        int i = 0;
        if (j2 != 0) {
            if (investBaseFilterItem != null) {
                name = investBaseFilterItem.getName();
                selected = investBaseFilterItem.getSelected();
            } else {
                selected = false;
            }
            if (j2 != 0) {
                j |= selected ? 8L : 4L;
            }
            if (!selected) {
                i = 8;
            }
        }
        if ((j & 3) != 0) {
            this.OLrzqt.setVisibility(i);
            TextViewBindingAdapter.setText(this.AEQbTJ, name);
        }
    }
}
