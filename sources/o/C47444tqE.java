package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import o.C47315tni;

/* JADX INFO: renamed from: o.tqE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C47444tqE extends AbstractC47447tqH {
    public static final android.util.SparseIntArray DbNXlk;
    public static final ViewDataBinding.IncludedLayouts isConnected;
    public long fARcdN;
    public final AbstractC47460tqU fIwbmz;
    public final android.widget.LinearLayout fJNWhG;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(15);
        isConnected = includedLayouts;
        includedLayouts.setIncludes(1, new java.lang.String[]{"layout_txn_banner"}, new int[]{2}, new int[]{C47315tni.ActionBar.zblBkD});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        DbNXlk = sparseIntArray;
        sparseIntArray.put(C47315tni.TaskDescription.UscePu, 3);
        sparseIntArray.put(C47315tni.TaskDescription.DcMfJKffREWX, 4);
        sparseIntArray.put(C47315tni.TaskDescription.invokespecialsiEkQe, 5);
        sparseIntArray.put(C47315tni.TaskDescription.dNCPSb, 6);
        sparseIntArray.put(C47315tni.TaskDescription.fLIjIY, 7);
        sparseIntArray.put(C47315tni.TaskDescription.DfrfUJ, 8);
        sparseIntArray.put(C47315tni.TaskDescription.gmHjFq, 9);
        sparseIntArray.put(C47315tni.TaskDescription.DxnCrt, 10);
        sparseIntArray.put(C47315tni.TaskDescription.fsSxsn, 11);
        sparseIntArray.put(C47315tni.TaskDescription.DwQSDd, 12);
        sparseIntArray.put(C47315tni.TaskDescription.QOLQEE, 13);
        sparseIntArray.put(C47315tni.TaskDescription.QKDJJA, 14);
    }

    public C47444tqE(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 15, isConnected, DbNXlk));
    }

    public C47444tqE(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[13], (ConstraintLayout) objArr[6], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[9], (android.widget.LinearLayout) objArr[1], (C55251xgS) objArr[5], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[12], (android.widget.TextView) objArr[10], (android.view.View) objArr[14]);
        this.fARcdN = -1L;
        this.AhwBna.setTag(null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.fJNWhG = linearLayout;
        linearLayout.setTag(null);
        AbstractC47460tqU abstractC47460tqU = (AbstractC47460tqU) objArr[2];
        this.fIwbmz = abstractC47460tqU;
        setContainedBinding(abstractC47460tqU);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fARcdN = 1L;
        }
        this.fIwbmz.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.fARcdN != 0) {
                return true;
            }
            return this.fIwbmz.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.fIwbmz.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fARcdN = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.fIwbmz);
    }
}
