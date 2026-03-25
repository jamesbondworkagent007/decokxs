package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ViewBindingAdapter;
import com.okinc.tradingbot.impl.order.strategy.dcd.view.DcdPnlChartView;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uYN extends uYM {
    public static final android.util.SparseIntArray DbNXlk;
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public long AkhnZx;
    public final LinearLayoutCompat values;

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
        DbNXlk = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.anyOf, 1);
        sparseIntArray.put(C48033uCm.Application.RXzakW, 2);
        sparseIntArray.put(C48033uCm.Application.allOf, 3);
        sparseIntArray.put(C48033uCm.Application.removeReporter, 4);
        sparseIntArray.put(C48033uCm.Application.iSpHlg, 5);
        sparseIntArray.put(C48033uCm.Application.hijVBL, 6);
        sparseIntArray.put(C48033uCm.Application.iqeXgQ, 7);
        sparseIntArray.put(C48033uCm.Application.getThemedContext, 8);
        sparseIntArray.put(C48033uCm.Application.sILrnl, 9);
    }

    public uYN(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, gEmmrt, DbNXlk));
    }

    public uYN(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatImageView) objArr[2], (C52794wYp) objArr[9], (DcdPnlChartView) objArr[7], (C50394vMu) objArr[5], (C50392vMs) objArr[6], (NestedScrollView) objArr[4], (AppCompatTextView) objArr[3], (android.widget.RelativeLayout) objArr[1], (C50399vMz) objArr[8]);
        this.AkhnZx = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.values = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AkhnZx = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AkhnZx != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.AkhnZx;
            this.AkhnZx = 0L;
        }
        if ((j & 1) != 0) {
            ViewBindingAdapter.setPaddingTop(this.values, C33570myu.gEmmrt(getRoot().getContext()));
        }
    }
}
