package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uSi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48463uSi extends AbstractC48455uSa {
    public static final android.util.SparseIntArray fIwbmz;
    public static final ViewDataBinding.IncludedLayouts values = null;
    public final LinearLayoutCompat AuCTel;
    public long ejfBZ;

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
        fIwbmz = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.FQMcgEfQMcgE, 1);
        sparseIntArray.put(C48033uCm.Application.ActivityResultContractsOpenMultipleDocuments, 2);
        sparseIntArray.put(C48033uCm.Application.ActivityResultContractsPickMultipleVisualMedia, 3);
        sparseIntArray.put(C48033uCm.Application.QOjuYg, 4);
        sparseIntArray.put(C48033uCm.Application.ActivityResultContractsPickContact, 5);
        sparseIntArray.put(C48033uCm.Application.isDrawerSlideAnimationEnabled, 6);
        sparseIntArray.put(C48033uCm.Application.ActivityResultContractsPickVisualMedia, 7);
        sparseIntArray.put(C48033uCm.Application.sendExtras, 8);
        sparseIntArray.put(C48033uCm.Application.RequiresApi, 9);
        sparseIntArray.put(C48033uCm.Application.ReportDrawnKtReportDrawnWhen1, 10);
        sparseIntArray.put(C48033uCm.Application.getItem, 11);
        sparseIntArray.put(C48033uCm.Application.getSystemFallbackPickeractivity_release, 12);
        sparseIntArray.put(C48033uCm.Application.getRoot, 13);
        sparseIntArray.put(C48033uCm.Application.aLnfMH, 14);
    }

    public C48463uSi(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 15, values, fIwbmz));
    }

    public C48463uSi(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayoutCompat) objArr[1], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[14], (LinearLayoutCompat) objArr[11], (AppCompatTextView) objArr[13], (AppCompatTextView) objArr[8], (C53573wnz) objArr[10], (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[5], (LinearLayoutCompat) objArr[7], (AppCompatTextView) objArr[12], (android.view.View) objArr[9], (AppCompatTextView) objArr[6]);
        this.ejfBZ = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.AuCTel = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
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
    }
}
