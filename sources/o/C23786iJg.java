package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.okinc.business.invest_biz.ui.page.InvestPoolTypeChooseFragment;

/* JADX INFO: renamed from: o.iJg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C23786iJg extends AbstractC23784iJe {
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public static final android.util.SparseIntArray djBIcL = null;
    public long gEmmrt;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    public C23786iJg(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, AhwBna, djBIcL));
    }

    public C23786iJg(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[0], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[1]);
        this.gEmmrt = -1L;
        this.KWHzl.setTag(null);
        this.AEQbTJ.setTag(null);
        this.OLrzqt.setTag(null);
        this.copydefault.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.gEmmrt = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.gEmmrt != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C25488ixf.OLrzqt != i) {
            return false;
        }
        AEQbTJ((InvestPoolTypeChooseFragment.PoolDialogDataItem) obj);
        return true;
    }

    public void AEQbTJ(@androidx.annotation.Nullable InvestPoolTypeChooseFragment.PoolDialogDataItem poolDialogDataItem) {
        this.EZpvd = poolDialogDataItem;
        synchronized (this) {
            this.gEmmrt |= 1;
        }
        notifyPropertyChanged(C25488ixf.OLrzqt);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        java.lang.String title;
        java.lang.String tag;
        java.lang.String content;
        synchronized (this) {
            j = this.gEmmrt;
            this.gEmmrt = 0L;
        }
        InvestPoolTypeChooseFragment.PoolDialogDataItem poolDialogDataItem = this.EZpvd;
        long j2 = j & 3;
        if (j2 == 0 || poolDialogDataItem == null) {
            title = null;
            tag = null;
            content = null;
        } else {
            title = poolDialogDataItem.getTitle();
            tag = poolDialogDataItem.getTag();
            content = poolDialogDataItem.getContent();
        }
        if (j2 != 0) {
            TextViewBindingAdapter.setText(this.AEQbTJ, content);
            TextViewBindingAdapter.setText(this.OLrzqt, tag);
            TextViewBindingAdapter.setText(this.copydefault, title);
        }
    }
}
