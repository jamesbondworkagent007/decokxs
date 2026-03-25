package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;
import o.C44105sDn;

/* JADX INFO: renamed from: o.sDs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C44110sDs extends AbstractC44112sDu {
    public static final ViewDataBinding.IncludedLayouts AuCTel = null;
    public static final android.util.SparseIntArray getFieldNames;
    public long iwGUEr;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@androidx.annotation.Nullable C35254nrp c35254nrp) {
        this.djBIcL = c35254nrp;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        getFieldNames = sparseIntArray;
        sparseIntArray.put(C44105sDn.ActionBar.dNCPSb, 1);
        sparseIntArray.put(C44105sDn.ActionBar.dvKsVJ, 2);
        sparseIntArray.put(C44105sDn.ActionBar.AuCTelauCTel, 3);
        sparseIntArray.put(C44105sDn.ActionBar.getNewProxyInstance, 4);
        sparseIntArray.put(C44105sDn.ActionBar.wlaJM, 5);
        sparseIntArray.put(C44105sDn.ActionBar.RJOkX, 6);
        sparseIntArray.put(C44105sDn.ActionBar.hDKMBd, 7);
        sparseIntArray.put(C44105sDn.ActionBar.zLjUOn, 8);
        sparseIntArray.put(C44105sDn.ActionBar.fetchVPNInfo, 9);
        sparseIntArray.put(C44105sDn.ActionBar.AxsJAY, 10);
        sparseIntArray.put(C44105sDn.ActionBar.fIwbmz, 11);
        sparseIntArray.put(C44105sDn.ActionBar.fZBcTu, 12);
        sparseIntArray.put(C44105sDn.ActionBar.QfsBiF, 13);
        sparseIntArray.put(C44105sDn.ActionBar.iwGUEr, 14);
        sparseIntArray.put(C44105sDn.ActionBar.AEQbTJ, 15);
        sparseIntArray.put(C44105sDn.ActionBar.fFgQHt, 16);
        sparseIntArray.put(C44105sDn.ActionBar.copydefault, 17);
    }

    public C44110sDs(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 18, AuCTel, getFieldNames));
    }

    public C44110sDs(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[17], (android.widget.ImageView) objArr[15], new ViewStubProxy((android.view.ViewStub) objArr[9]), (C35893oHp) objArr[11], (android.widget.LinearLayout) objArr[14], new ViewStubProxy((android.view.ViewStub) objArr[7]), (C55113xdn) objArr[4], (LinearLayoutCompat) objArr[5], (LinearLayoutCompat) objArr[8], (android.view.View) objArr[3], new ViewStubProxy((android.view.ViewStub) objArr[10]), (android.widget.LinearLayout) objArr[0], (android.widget.TextView) objArr[13], (C35888oHk) objArr[6], (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[16], (android.widget.TextView) objArr[12]);
        this.iwGUEr = -1L;
        this.AEQbTJ.setContainingBinding(this);
        this.gEmmrt.setContainingBinding(this);
        this.values.setContainingBinding(this);
        this.DbNXlk.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.iwGUEr = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.iwGUEr != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C44108sDq.OLrzqt != i) {
            return false;
        }
        OLrzqt((C35254nrp) obj);
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.iwGUEr = 0L;
        }
        if (this.AEQbTJ.getBinding() != null) {
            ViewDataBinding.executeBindingsOn(this.AEQbTJ.getBinding());
        }
        if (this.gEmmrt.getBinding() != null) {
            ViewDataBinding.executeBindingsOn(this.gEmmrt.getBinding());
        }
        if (this.values.getBinding() != null) {
            ViewDataBinding.executeBindingsOn(this.values.getBinding());
        }
    }
}
