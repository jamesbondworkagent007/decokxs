package o;

import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rvE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C43749rvE extends AbstractC43751rvG {
    public static final android.util.SparseIntArray fetchVPNInfo;
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public final android.widget.FrameLayout DbNXlk;
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
        fetchVPNInfo = sparseIntArray;
        sparseIntArray.put(C43662rtX.ActionBar.DrNnAm, 1);
        sparseIntArray.put(C43662rtX.ActionBar.Rtjmuc, 2);
        sparseIntArray.put(C43662rtX.ActionBar.OJuSTm, 3);
        sparseIntArray.put(C43662rtX.ActionBar.DTwDnp, 4);
        sparseIntArray.put(C43662rtX.ActionBar.DPHNDa, 5);
        sparseIntArray.put(C43662rtX.ActionBar.fBE, 6);
        sparseIntArray.put(C43662rtX.ActionBar.siEkQe, 7);
        sparseIntArray.put(C43662rtX.ActionBar.gmHjFq, 8);
        sparseIntArray.put(C43662rtX.ActionBar.DPhTBN, 9);
        sparseIntArray.put(C43662rtX.ActionBar.gUEfcq, 10);
        sparseIntArray.put(C43662rtX.ActionBar.cBPFI, 11);
    }

    public C43749rvE(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, isConnected, fetchVPNInfo));
    }

    public C43749rvE(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.LinearLayout) objArr[4], (android.widget.ImageButton) objArr[3], (android.widget.ImageView) objArr[10], (android.widget.ImageView) objArr[8], (android.widget.ImageView) objArr[6], (android.widget.ImageView) objArr[11], (android.widget.LinearLayout) objArr[5], (ConstraintLayout) objArr[1], (android.widget.LinearLayout) objArr[9], (PreviewView) objArr[2], (android.widget.TextView) objArr[7]);
        this.values = -1L;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) objArr[0];
        this.DbNXlk = frameLayout;
        frameLayout.setTag(null);
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
