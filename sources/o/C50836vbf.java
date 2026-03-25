package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vbf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50836vbf extends AbstractC50776vaY {
    public static final android.util.SparseIntArray AuCTel;
    public static final ViewDataBinding.IncludedLayouts DbNXlk = null;
    public long fARcdN;
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
        AuCTel = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.findOwner, 1);
        sparseIntArray.put(C48033uCm.Application.getLauncher, 2);
        sparseIntArray.put(C48033uCm.Application.ActivityResultRegistryKtrememberLauncherForActivityResult11, 3);
        sparseIntArray.put(C48033uCm.Application.flag, 4);
        sparseIntArray.put(C48033uCm.Application.launch, 5);
        sparseIntArray.put(C48033uCm.Application.ViewTreeFullyDrawnReporterOwner, 6);
        sparseIntArray.put(C48033uCm.Application.fqaWRL, 7);
        sparseIntArray.put(C48033uCm.Application.dhOYXF, 8);
        sparseIntArray.put(C48033uCm.Application.createSocket, 9);
        sparseIntArray.put(C48033uCm.Application.ActivityResultContractsPickVisualMediaVideoOnly, 10);
        sparseIntArray.put(C48033uCm.Application.getMimeType, 11);
        sparseIntArray.put(C48033uCm.Application.getFlags, 12);
        sparseIntArray.put(C48033uCm.Application.DcMfJKfwDlxl, 13);
        sparseIntArray.put(C48033uCm.Application.ActivityResultRegistryKtrememberLauncherForActivityResult1invokeinlinedonDispose1, 14);
    }

    public C50836vbf(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 15, DbNXlk, AuCTel));
    }

    public C50836vbf(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[13], (android.widget.ImageView) objArr[9], (android.widget.LinearLayout) objArr[7], (C51601vqB) objArr[8], (android.view.View) objArr[12], (android.widget.TextView) objArr[6], (C52794wYp) objArr[5], (android.widget.ImageView) objArr[1], (C55372xih) objArr[2], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[14], (android.widget.LinearLayout) objArr[10], (android.widget.TextView) objArr[11], (C55251xgS) objArr[4]);
        this.fARcdN = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fIwbmz = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fARcdN = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fARcdN != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fARcdN = 0L;
        }
    }
}
