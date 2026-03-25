package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.emY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16576emY extends AbstractC16631ena {
    public static final ViewDataBinding.IncludedLayouts DbNXlk = null;
    public static final android.util.SparseIntArray isConnected;
    public long AkhnZx;
    public final android.widget.LinearLayout fetchVPNInfo;

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
        sparseIntArray.put(C13754dXa.ActionBar.CheckResult, 1);
        sparseIntArray.put(C13754dXa.ActionBar.get, 2);
        sparseIntArray.put(C13754dXa.ActionBar.ReportDrawnKtReportDrawn2, 3);
        sparseIntArray.put(C13754dXa.ActionBar.getResultContract, 4);
        sparseIntArray.put(C13754dXa.ActionBar.QfgJNx, 5);
        sparseIntArray.put(C13754dXa.ActionBar.isTimeProfileEmpty, 6);
        sparseIntArray.put(C13754dXa.ActionBar.GVpNrsfQMcgE, 7);
        sparseIntArray.put(C13754dXa.ActionBar.OeawrHOeawrH, 8);
        sparseIntArray.put(C13754dXa.ActionBar.ActivityResultRegistryKt, 9);
        sparseIntArray.put(C13754dXa.ActionBar.DUUtXg, 10);
    }

    public C16576emY(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, DbNXlk, isConnected));
    }

    public C16576emY(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[10], (C55008xbo) objArr[8], (C55008xbo) objArr[6], (AppCompatImageView) objArr[5], (android.view.View) objArr[7], (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[9], (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[1]);
        this.AkhnZx = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.fetchVPNInfo = linearLayout;
        linearLayout.setTag(null);
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
        synchronized (this) {
            this.AkhnZx = 0L;
        }
    }
}
