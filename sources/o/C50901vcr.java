package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vcr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50901vcr extends AbstractC50900vcq {
    public static final ViewDataBinding.IncludedLayouts AuCTel = null;
    public static final android.util.SparseIntArray fARcdN;
    public long fIwbmz;

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
        fARcdN = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.allOf, 2);
        sparseIntArray.put(C48033uCm.Application.DDjgSw, 3);
        sparseIntArray.put(C48033uCm.Application.UiThread, 4);
        sparseIntArray.put(C48033uCm.Application.getSupportParentActivityIntent, 5);
        sparseIntArray.put(C48033uCm.Application.getResources, 6);
        sparseIntArray.put(C48033uCm.Application.RequiresApi, 7);
        sparseIntArray.put(C48033uCm.Application.DarRvM, 8);
        sparseIntArray.put(C48033uCm.Application.onCreateSupportNavigateUpTaskStack, 9);
        sparseIntArray.put(C48033uCm.Application.DCJXGO, 10);
        sparseIntArray.put(C48033uCm.Application.getDelegate, 11);
        sparseIntArray.put(C48033uCm.Application.getMenuInflater, 12);
        sparseIntArray.put(C48033uCm.Application.DXXBbs, 13);
        sparseIntArray.put(C48033uCm.Application.onContentChanged, 14);
        sparseIntArray.put(C48033uCm.Application.findViewById, 15);
    }

    public C50901vcr(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 16, AuCTel, fARcdN));
    }

    public C50901vcr(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (LinearLayoutCompat) objArr[8], (LinearLayoutCompat) objArr[10], (LinearLayoutCompat) objArr[13], (C55052xcf) objArr[3], (android.view.View) objArr[7], (C55258xgZ) objArr[2], (ConstraintLayout) objArr[0], (ConstraintLayout) objArr[4], (ConstraintLayout) objArr[1], (android.widget.TextView) objArr[12], (C55258xgZ) objArr[11], (android.widget.TextView) objArr[15], (C55258xgZ) objArr[14], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[5]);
        this.fIwbmz = -1L;
        this.valueOf.setTag(null);
        this.djBIcL.setTag(null);
        setRootTag(viewArr);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fIwbmz = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fIwbmz != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fIwbmz = 0L;
        }
    }
}
