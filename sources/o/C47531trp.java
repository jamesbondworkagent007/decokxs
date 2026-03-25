package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.trp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C47531trp extends AbstractC47533trr {
    public static final ViewDataBinding.IncludedLayouts fetchVPNInfo = null;
    public static final android.util.SparseIntArray values;
    public long AkhnZx;

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
        values = sparseIntArray;
        sparseIntArray.put(C47315tni.TaskDescription.RTWSvT, 2);
        sparseIntArray.put(C47315tni.TaskDescription.RkASWs, 3);
        sparseIntArray.put(C47315tni.TaskDescription.RZNAhV, 4);
        sparseIntArray.put(C47315tni.TaskDescription.RgLUBD, 5);
        sparseIntArray.put(C47315tni.TaskDescription.RqmePg, 6);
        sparseIntArray.put(C47315tni.TaskDescription.gtCCJH, 7);
        sparseIntArray.put(C47315tni.TaskDescription.DGUQLIhJrIAr, 8);
        sparseIntArray.put(C47315tni.TaskDescription.YqksP, 9);
    }

    public C47531trp(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, fetchVPNInfo, values));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C47531trp(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        android.widget.TextView textView = (android.widget.TextView) objArr[7];
        android.widget.TextView textView2 = (android.widget.TextView) objArr[8];
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        android.widget.TextView textView3 = (android.widget.TextView) objArr[9];
        java.lang.Object obj = objArr[2];
        C47532trq c47532trqAEQbTJ = obj != null ? C47532trq.AEQbTJ((android.view.View) obj) : null;
        java.lang.Object obj2 = objArr[3];
        C47532trq c47532trqAEQbTJ2 = obj2 != null ? C47532trq.AEQbTJ((android.view.View) obj2) : null;
        java.lang.Object obj3 = objArr[4];
        C47532trq c47532trqAEQbTJ3 = obj3 != null ? C47532trq.AEQbTJ((android.view.View) obj3) : null;
        java.lang.Object obj4 = objArr[5];
        C47532trq c47532trqAEQbTJ4 = obj4 != null ? C47532trq.AEQbTJ((android.view.View) obj4) : null;
        java.lang.Object obj5 = objArr[6];
        super(dataBindingComponent, view, 0, textView, textView2, constraintLayout, textView3, c47532trqAEQbTJ, c47532trqAEQbTJ2, c47532trqAEQbTJ3, c47532trqAEQbTJ4, obj5 != null ? C47532trq.AEQbTJ((android.view.View) obj5) : null, (ConstraintLayout) objArr[1]);
        this.AkhnZx = -1L;
        this.AEQbTJ.setTag(null);
        this.djBIcL.setTag(null);
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
