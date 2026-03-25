package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import o.C35399nuc;

/* JADX INFO: loaded from: classes8.dex */
public class nKP extends nKQ {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public long valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.nKQ
    public void copydefault(boolean z) {
        this.copydefault = z;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        AYXKKw = sparseIntArray;
        sparseIntArray.put(C35399nuc.StateListAnimator.zLAIeZ, 2);
        sparseIntArray.put(C35399nuc.StateListAnimator.isReflectionWorking, 3);
    }

    public nKP(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, gEmmrt, AYXKKw));
    }

    public nKP(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.FrameLayout) objArr[2], (android.widget.TextView) objArr[1], (android.widget.ImageView) objArr[3], (android.widget.RelativeLayout) objArr[0]);
        this.valueOf = -1L;
        this.KWHzl.setTag(null);
        this.AEQbTJ.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.valueOf = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.valueOf != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C35342ntX.valueOf == i) {
            copydefault(((java.lang.Boolean) obj).booleanValue());
        } else {
            if (C35342ntX.DbNXlk != i) {
                return false;
            }
            KWHzl((java.lang.String) obj);
        }
        return true;
    }

    @Override // o.nKQ
    public void KWHzl(@androidx.annotation.Nullable java.lang.String str) {
        this.djBIcL = str;
        synchronized (this) {
            this.valueOf |= 2;
        }
        notifyPropertyChanged(C35342ntX.DbNXlk);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.valueOf;
            this.valueOf = 0L;
        }
        java.lang.String str = this.djBIcL;
        if ((j & 6) != 0) {
            TextViewBindingAdapter.setText(this.KWHzl, str);
        }
    }
}
