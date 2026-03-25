package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.esM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16882esM extends AbstractC16879esJ {
    public static final android.util.SparseIntArray DbNXlk;
    public static final ViewDataBinding.IncludedLayouts fetchVPNInfo = null;
    public final android.widget.LinearLayout fARcdN;
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
        DbNXlk = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.ICustomTabsServiceStub, 1);
        sparseIntArray.put(C13754dXa.ActionBar.stop, 2);
        sparseIntArray.put(C13754dXa.ActionBar.validateCustomAction, 3);
        sparseIntArray.put(C13754dXa.ActionBar.getMediaController, 4);
        sparseIntArray.put(C13754dXa.ActionBar.ActivityResultContractsGetMultipleContentsCompanion, 5);
        sparseIntArray.put(C13754dXa.ActionBar.StyleableRes, 6);
        sparseIntArray.put(C13754dXa.ActionBar.onPrepareFromMediaId, 7);
        sparseIntArray.put(C13754dXa.ActionBar.generateRandomNumber, 8);
        sparseIntArray.put(C13754dXa.ActionBar.RAQtXZ, 9);
        sparseIntArray.put(C13754dXa.ActionBar.DrqXHJ, 10);
        sparseIntArray.put(C13754dXa.ActionBar.iCPUKe, 11);
        sparseIntArray.put(C13754dXa.ActionBar.cBPFI, 12);
        sparseIntArray.put(C13754dXa.ActionBar.geLlBI, 13);
    }

    public C16882esM(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, fetchVPNInfo, DbNXlk));
    }

    public C16882esM(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[10], (C52794wYp) objArr[12], (android.view.View) objArr[11], (C57468yiw) objArr[13], (android.widget.LinearLayout) objArr[9], (android.widget.LinearLayout) objArr[1], (AppCompatImageView) objArr[2], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[3], (RecyclerView) objArr[7], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[5], (android.view.View) objArr[6]);
        this.fIwbmz = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.fARcdN = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
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
