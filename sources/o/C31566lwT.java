package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lwT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31566lwT extends AbstractC31563lwQ {
    public static final android.util.SparseIntArray isConnected;
    public static final ViewDataBinding.IncludedLayouts values = null;
    public long AkhnZx;
    public final ConstraintLayout fetchVPNInfo;

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
        isConnected = sparseIntArray;
        sparseIntArray.put(C31351lsQ.Application.sCB, 1);
        sparseIntArray.put(C31351lsQ.Application.Hx, 2);
        sparseIntArray.put(C31351lsQ.Application.DcMfJKfbSiEC, 3);
        sparseIntArray.put(C31351lsQ.Application.DcMfJKfNLfdT, 4);
        sparseIntArray.put(C31351lsQ.Application.DcMfJKffREWX, 5);
        sparseIntArray.put(C31351lsQ.Application.DrNnAm, 6);
        sparseIntArray.put(C31351lsQ.Application.DcMfJKdMCrTj, 7);
        sparseIntArray.put(C31351lsQ.Application.fcfzuX, 8);
        sparseIntArray.put(C31351lsQ.Application.jh, 9);
        sparseIntArray.put(C31351lsQ.Application.DcMfJKOmnske, 10);
        sparseIntArray.put(C31351lsQ.Application.akftKQ, 11);
    }

    public C31566lwT(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, values, isConnected));
    }

    public C31566lwT(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.view.View) objArr[11], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[10], (android.widget.TextView) objArr[9], (android.widget.ImageView) objArr[7], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[4], (android.widget.ImageView) objArr[2], (android.widget.TextView) objArr[3]);
        this.AkhnZx = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fetchVPNInfo = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AkhnZx = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AkhnZx != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AkhnZx = 0L;
        }
    }
}
