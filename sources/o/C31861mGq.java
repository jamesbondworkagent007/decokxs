package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.mDC;

/* JADX INFO: renamed from: o.mGq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C31861mGq extends AbstractC31853mGi {
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public static final android.util.SparseIntArray fetchVPNInfo;
    public final ConstraintLayout AkhnZx;
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
        sparseIntArray.put(mDC.ActionBar.USBtdM, 1);
        sparseIntArray.put(mDC.ActionBar.ODWQjV, 2);
        sparseIntArray.put(mDC.ActionBar.tIwhY, 3);
        sparseIntArray.put(mDC.ActionBar.apNbdB, 4);
        sparseIntArray.put(mDC.ActionBar.sTzBva, 5);
        sparseIntArray.put(mDC.ActionBar.QfsBiF, 6);
        sparseIntArray.put(mDC.ActionBar.OFhtUX, 7);
        sparseIntArray.put(mDC.ActionBar.QCjLjM, 8);
        sparseIntArray.put(mDC.ActionBar.hrNTAI, 9);
    }

    public C31861mGq(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, djBIcL, fetchVPNInfo));
    }

    public C31861mGq(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[6], (ConstraintLayout) objArr[2], (ConstraintLayout) objArr[7], (android.widget.ImageView) objArr[9], (android.widget.TextView) objArr[8], (ConstraintLayout) objArr[1], (ConstraintLayout) objArr[4], (android.widget.TextView) objArr[5], (android.widget.ImageView) objArr[3]);
        this.values = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AkhnZx = constraintLayout;
        constraintLayout.setTag(null);
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
