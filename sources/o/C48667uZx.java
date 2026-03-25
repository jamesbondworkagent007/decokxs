package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uZx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48667uZx extends AbstractC48665uZv {
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public static final android.util.SparseIntArray values;
    public long DbNXlk;
    public final ConstraintLayout isConnected;

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
        values = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.allOf, 1);
        sparseIntArray.put(C48033uCm.Application.QAQCdZ, 2);
        sparseIntArray.put(C48033uCm.Application.apHBvG, 3);
        sparseIntArray.put(C48033uCm.Application.MediaBrowserCompatMediaBrowserImplBase2, 4);
        sparseIntArray.put(C48033uCm.Application.WindowDecorActionBar3, 5);
        sparseIntArray.put(C48033uCm.Application.apAOXX, 6);
        sparseIntArray.put(C48033uCm.Application.hide, 7);
        sparseIntArray.put(C48033uCm.Application.isTitleTruncated, 8);
        sparseIntArray.put(C48033uCm.Application.QnnRaN, 9);
    }

    public C48667uZx(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, djBIcL, values));
    }

    public C48667uZx(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[6], (C52794wYp) objArr[9], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[1], (C47988uAv) objArr[7], (android.widget.TextView) objArr[8], (android.view.View) objArr[5]);
        this.DbNXlk = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.isConnected = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.DbNXlk = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.DbNXlk != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.DbNXlk = 0L;
        }
    }
}
