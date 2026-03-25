package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uXN extends uXL {
    public static final android.util.SparseIntArray AkhnZx;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public long DbNXlk;

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
        sparseIntArray.put(C48033uCm.Application.writeTypedObject, 3);
        sparseIntArray.put(C48033uCm.Application.MenuRes, 4);
        sparseIntArray.put(C48033uCm.Application.tryUnwrapContext, 5);
        sparseIntArray.put(C48033uCm.Application.onDetachedFromWindow, 6);
        sparseIntArray.put(C48033uCm.Application.onPrepareActionMode, 7);
        sparseIntArray.put(C48033uCm.Application.superDispatchKeyEvent, 8);
    }

    public uXN(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 9, valueOf, AkhnZx));
    }

    public uXN(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (C55251xgS) objArr[3], (android.widget.LinearLayout) objArr[2], (android.widget.LinearLayout) objArr[4], (C55258xgZ) objArr[0], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[8], (AppCompatTextView) objArr[1]);
        this.DbNXlk = -1L;
        this.KWHzl.setTag(null);
        this.OLrzqt.setTag(null);
        this.AhwBna.setTag(null);
        setRootTag(viewArr);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.DbNXlk = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.DbNXlk != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.DbNXlk = 0L;
        }
    }
}
