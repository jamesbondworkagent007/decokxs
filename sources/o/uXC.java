package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uXC extends AbstractC48611uXv {
    public static final android.util.SparseIntArray isConnected;
    public static final ViewDataBinding.IncludedLayouts values = null;
    public final NestedScrollView DbNXlk;
    public long fetchVPNInfo;

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
        isConnected = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.isStateValid, 1);
        sparseIntArray.put(C48033uCm.Application.removeTabAt, 2);
        sparseIntArray.put(C48033uCm.Application.ReportDrawnKtReportDrawnWhen2, 3);
        sparseIntArray.put(C48033uCm.Application.PlaybackStateCompatBuilder, 4);
        sparseIntArray.put(C48033uCm.Application.selectTab, 5);
        sparseIntArray.put(C48033uCm.Application.getState, 6);
        sparseIntArray.put(C48033uCm.Application.PlaybackStateCompat1, 7);
        sparseIntArray.put(C48033uCm.Application.getLastPositionUpdateTime, 8);
        sparseIntArray.put(C48033uCm.Application.getPlaybackSpeed, 9);
        sparseIntArray.put(C48033uCm.Application.setTag, 10);
    }

    public uXC(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, values, isConnected));
    }

    public uXC(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C47988uAv) objArr[9], (wYK) objArr[8], (C53560wnm) objArr[4], (C47988uAv) objArr[7], (wYK) objArr[6], (C53560wnm) objArr[3], (C53560wnm) objArr[2], (Group) objArr[5], (AppCompatTextView) objArr[10], (C53560wnm) objArr[1]);
        this.fetchVPNInfo = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.DbNXlk = nestedScrollView;
        nestedScrollView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fetchVPNInfo = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fetchVPNInfo != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fetchVPNInfo = 0L;
        }
    }
}
