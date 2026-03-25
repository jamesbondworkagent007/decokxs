package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import o.mDC;

/* JADX INFO: loaded from: classes8.dex */
public class mFN extends mFJ {
    public static final android.util.SparseIntArray AEQbTJ;
    public static final ViewDataBinding.IncludedLayouts EZpvd = null;
    public final ConstraintLayout AhwBna;
    public long valueOf;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        AEQbTJ = sparseIntArray;
        sparseIntArray.put(mDC.ActionBar.QXDzTk, 2);
    }

    public mFN(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, EZpvd, AEQbTJ));
    }

    public mFN(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.view.View) objArr[2], (android.widget.TextView) objArr[1]);
        this.valueOf = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AhwBna = constraintLayout;
        constraintLayout.setTag(null);
        this.OLrzqt.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.valueOf = 2L;
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
        if (mDB.AEQbTJ != i) {
            return false;
        }
        EZpvd((java.lang.String) obj);
        return true;
    }

    public void EZpvd(@androidx.annotation.Nullable java.lang.String str) {
        this.KWHzl = str;
        synchronized (this) {
            this.valueOf |= 1;
        }
        notifyPropertyChanged(mDB.AEQbTJ);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.valueOf;
            this.valueOf = 0L;
        }
        java.lang.String str = this.KWHzl;
        if ((j & 3) != 0) {
            TextViewBindingAdapter.setText(this.OLrzqt, str);
        }
    }
}
