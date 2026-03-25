package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eju, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16439eju extends AbstractC16437ejs {
    public static final android.util.SparseIntArray AhwBna;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public final android.widget.LinearLayout DbNXlk;
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
        AhwBna = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.accept, 1);
        sparseIntArray.put(C13754dXa.ActionBar.extraCallbackWithResult, 2);
        sparseIntArray.put(C13754dXa.ActionBar.DzCpqu, 3);
        sparseIntArray.put(C13754dXa.ActionBar.getDescription, 4);
        sparseIntArray.put(C13754dXa.ActionBar.hNurIN, 5);
        sparseIntArray.put(C13754dXa.ActionBar.fkESqH, 6);
        sparseIntArray.put(C13754dXa.ActionBar.gFTCsA, 7);
        sparseIntArray.put(C13754dXa.ActionBar.RihMUf, 8);
    }

    public C16439eju(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, valueOf, AhwBna));
    }

    public C16439eju(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C33537myN) objArr[1], (C57468yiw) objArr[6], (C57471yiz) objArr[5], (C55173xeu) objArr[8], (android.widget.FrameLayout) objArr[7], (C57422yiC) objArr[3], (android.widget.LinearLayout) objArr[2], (C57471yiz) objArr[4]);
        this.fetchVPNInfo = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.DbNXlk = linearLayout;
        linearLayout.setTag(null);
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
