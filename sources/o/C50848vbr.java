package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;
import com.robinhood.ticker.TickerView;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vbr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50848vbr extends AbstractC50850vbt {
    public static final android.util.SparseIntArray fetchVPNInfo;
    public static final ViewDataBinding.IncludedLayouts values = null;
    public long ejfBZ;
    public final ConstraintLayout fIwbmz;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        fetchVPNInfo = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.gkZNMa, 1);
        sparseIntArray.put(C48033uCm.Application.getNavigationItemCount, 2);
        sparseIntArray.put(C48033uCm.Application.getHideOffset, 3);
        sparseIntArray.put(C48033uCm.Application.closeOptionsMenu, 4);
        sparseIntArray.put(C48033uCm.Application.fERRXa, 5);
        sparseIntArray.put(C48033uCm.Application.getHeight, 6);
        sparseIntArray.put(C48033uCm.Application.UlJrfe, 7);
        sparseIntArray.put(C48033uCm.Application.USBtdM, 8);
        sparseIntArray.put(C48033uCm.Application.PlaybackStateCompatErrorCode, 9);
        sparseIntArray.put(C48033uCm.Application.QwvEab, 10);
        sparseIntArray.put(C48033uCm.Application.DsfknC, 11);
        sparseIntArray.put(C48033uCm.Application.isStateful, 12);
        sparseIntArray.put(C48033uCm.Application.QYvkLl, 13);
    }

    public C50848vbr(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, values, fetchVPNInfo));
    }

    public C50848vbr(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatTextView) objArr[8], (Flow) objArr[10], (ConstraintLayout) objArr[7], (AppCompatTextView) objArr[5], (android.view.View) objArr[1], (Barrier) objArr[11], (C52705wVh) objArr[13], (C55320xhi) objArr[9], (TickerView) objArr[4], (AppCompatImageView) objArr[3], (Flow) objArr[6], (AppCompatTextView) objArr[2], new ViewStubProxy((android.view.ViewStub) objArr[12]));
        this.ejfBZ = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fIwbmz = constraintLayout;
        constraintLayout.setTag(null);
        this.DbNXlk.setContainingBinding(this);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.ejfBZ = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.ejfBZ != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.ejfBZ = 0L;
        }
        if (this.DbNXlk.getBinding() != null) {
            ViewDataBinding.executeBindingsOn(this.DbNXlk.getBinding());
        }
    }
}
