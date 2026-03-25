package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C31976mKx;

/* JADX INFO: loaded from: classes8.dex */
public class mMX extends mMW {
    public static final android.util.SparseIntArray AkhnZx;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public long isConnected;

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
        AkhnZx = sparseIntArray;
        sparseIntArray.put(C31976mKx.Activity.DCUTEIdCUTEI, 1);
        sparseIntArray.put(C31976mKx.Activity.DXXBbs, 2);
        sparseIntArray.put(C31976mKx.Activity.OcIXYQ, 3);
        sparseIntArray.put(C31976mKx.Activity.gEmmrt, 4);
        sparseIntArray.put(C31976mKx.Activity.DbNXlk, 5);
        sparseIntArray.put(C31976mKx.Activity.copydefault, 6);
        sparseIntArray.put(C31976mKx.Activity.DsrFlB, 7);
        sparseIntArray.put(C31976mKx.Activity.AubY, 8);
    }

    public mMX(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, valueOf, AkhnZx));
    }

    public mMX(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[6], (android.widget.LinearLayout) objArr[4], (C52794wYp) objArr[5], (android.widget.LinearLayout) objArr[0], (android.widget.TextView) objArr[8], (android.widget.EditText) objArr[3], (android.widget.RelativeLayout) objArr[2], (androidx.appcompat.widget.Toolbar) objArr[1], (android.widget.TextView) objArr[7]);
        this.isConnected = -1L;
        this.EZpvd.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.isConnected = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.isConnected != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.isConnected = 0L;
        }
    }
}
