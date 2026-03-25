package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.elg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16531elg extends AbstractC16529ele {
    public static final ViewDataBinding.IncludedLayouts DbNXlk = null;
    public static final android.util.SparseIntArray isConnected;
    public long values;

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
        sparseIntArray.put(C13754dXa.ActionBar.stopBehavioSecDataCollection, 1);
        sparseIntArray.put(C13754dXa.ActionBar.CheckResult, 2);
        sparseIntArray.put(C13754dXa.ActionBar.ActivityResultContractsPickVisualMediaVideoOnly, 3);
        sparseIntArray.put(C13754dXa.ActionBar.BoolRes, 4);
        sparseIntArray.put(C13754dXa.ActionBar.clearAvailableContext, 5);
        sparseIntArray.put(C13754dXa.ActionBar.adevsa, 6);
        sparseIntArray.put(C13754dXa.ActionBar.ReportDrawnKtReportDrawnWhenfullyDrawnReporter1, 7);
        sparseIntArray.put(C13754dXa.ActionBar.OnBackPressedDispatcher, 8);
        sparseIntArray.put(C13754dXa.ActionBar.OTwTPd, 9);
    }

    public C16531elg(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, DbNXlk, isConnected));
    }

    public C16531elg(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[9], (AppCompatImageView) objArr[1], (ConstraintLayout) objArr[0], (android.widget.ImageView) objArr[6], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[2]);
        this.values = -1L;
        this.copydefault.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.values = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.values != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.values = 0L;
        }
    }
}
