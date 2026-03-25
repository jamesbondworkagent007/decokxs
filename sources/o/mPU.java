package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C32113mPz;
import o.C57652ymU;

/* JADX INFO: loaded from: classes8.dex */
public class mPU extends mPX {
    public static final android.util.SparseIntArray OLrzqt;
    public static final ViewDataBinding.IncludedLayouts copydefault = null;
    public long AYXKKw;
    public final android.widget.RelativeLayout valueOf;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        OLrzqt = sparseIntArray;
        sparseIntArray.put(C32113mPz.FragmentManager.fFgQHt, 2);
    }

    public mPU(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, copydefault, OLrzqt));
    }

    public mPU(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[2], (android.widget.TextView) objArr[1]);
        this.AYXKKw = -1L;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) objArr[0];
        this.valueOf = relativeLayout;
        relativeLayout.setTag(null);
        this.AEQbTJ.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AYXKKw = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AYXKKw != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (mPD.AEQbTJ != i) {
            return false;
        }
        KWHzl((C57652ymU.Activity) obj);
        return true;
    }

    public void KWHzl(@androidx.annotation.Nullable C57652ymU.Activity activity) {
        this.KWHzl = activity;
        synchronized (this) {
            this.AYXKKw |= 1;
        }
        notifyPropertyChanged(mPD.AEQbTJ);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.AYXKKw;
            this.AYXKKw = 0L;
        }
        C57652ymU.Activity activity = this.KWHzl;
        long j2 = j & 3;
        java.lang.String strKWHzl = (j2 == 0 || activity == null) ? null : activity.KWHzl();
        if (j2 != 0) {
            this.AEQbTJ.setText(strKWHzl);
        }
    }
}
