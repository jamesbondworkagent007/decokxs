package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;
import o.C44105sDn;
import o.C52761wXj;

/* JADX INFO: renamed from: o.sDw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C44114sDw extends AbstractC44111sDt {
    public static final android.util.SparseIntArray hDKMBd;
    public static final ViewDataBinding.IncludedLayouts iwGUEr = null;
    public long getFieldNames;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@androidx.annotation.Nullable C35254nrp c35254nrp) {
        this.gEmmrt = c35254nrp;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        hDKMBd = sparseIntArray;
        sparseIntArray.put(C44105sDn.ActionBar.uzCIH, 1);
        sparseIntArray.put(C44105sDn.ActionBar.dxcTrN, 2);
        sparseIntArray.put(C44105sDn.ActionBar.dNCPSb, 3);
        sparseIntArray.put(C44105sDn.ActionBar.fIwbmz, 4);
        sparseIntArray.put(C44105sDn.ActionBar.zuBGHE, 5);
        sparseIntArray.put(C44105sDn.ActionBar.djSkpj, 6);
        sparseIntArray.put(C44105sDn.ActionBar.finit, 7);
        sparseIntArray.put(C44105sDn.ActionBar.dvKsVJ, 8);
        sparseIntArray.put(C44105sDn.ActionBar.AuCTelauCTel, 9);
        sparseIntArray.put(C44105sDn.ActionBar.wlaJM, 10);
        sparseIntArray.put(C44105sDn.ActionBar.RJOkX, 11);
        sparseIntArray.put(C44105sDn.ActionBar.hDKMBd, 12);
        sparseIntArray.put(C44105sDn.ActionBar.zLjUOn, 13);
        sparseIntArray.put(C44105sDn.ActionBar.fetchVPNInfo, 14);
        sparseIntArray.put(C44105sDn.ActionBar.AxsJAY, 15);
        sparseIntArray.put(C52761wXj.FragmentManager.iRxXKY, 16);
        sparseIntArray.put(C44105sDn.ActionBar.AEQbTJ, 17);
        sparseIntArray.put(C44105sDn.ActionBar.UeEOUB, 18);
        sparseIntArray.put(C44105sDn.ActionBar.DTwDnp, 19);
        sparseIntArray.put(C44105sDn.ActionBar.QfsBiF, 20);
    }

    public C44114sDw(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 21, iwGUEr, hDKMBd));
    }

    public C44114sDw(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[17], (android.widget.LinearLayout) objArr[16], new ViewStubProxy((android.view.ViewStub) objArr[14]), (C35893oHp) objArr[4], new ViewStubProxy((android.view.ViewStub) objArr[12]), (android.widget.LinearLayout) objArr[1], (LinearLayoutCompat) objArr[10], (android.widget.FrameLayout) objArr[13], (android.view.View) objArr[9], (android.widget.LinearLayout) objArr[5], new ViewStubProxy((android.view.ViewStub) objArr[15]), (android.widget.ProgressBar) objArr[19], (android.widget.LinearLayout) objArr[0], (android.widget.TextView) objArr[20], (C35888oHk) objArr[11], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[18], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[2]);
        this.getFieldNames = -1L;
        this.EZpvd.setContainingBinding(this);
        this.copydefault.setContainingBinding(this);
        this.fetchVPNInfo.setContainingBinding(this);
        this.AkhnZx.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.getFieldNames = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.getFieldNames != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C44108sDq.OLrzqt != i) {
            return false;
        }
        copydefault((C35254nrp) obj);
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.getFieldNames = 0L;
        }
        if (this.EZpvd.getBinding() != null) {
            ViewDataBinding.executeBindingsOn(this.EZpvd.getBinding());
        }
        if (this.copydefault.getBinding() != null) {
            ViewDataBinding.executeBindingsOn(this.copydefault.getBinding());
        }
        if (this.fetchVPNInfo.getBinding() != null) {
            ViewDataBinding.executeBindingsOn(this.fetchVPNInfo.getBinding());
        }
    }
}
