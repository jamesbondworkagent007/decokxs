package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import o.C47501trL;

/* JADX INFO: loaded from: classes10.dex */
public class tNA extends AbstractC46260tNt {
    public static final ViewDataBinding.IncludedLayouts AYXKKw = null;
    public static final android.util.SparseIntArray gEmmrt;
    public long DbNXlk;
    public final ConstraintLayout values;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        gEmmrt = sparseIntArray;
        sparseIntArray.put(C47501trL.TaskDescription.QfJbVf, 3);
        sparseIntArray.put(C47501trL.TaskDescription.gwwfep, 4);
        sparseIntArray.put(C47501trL.TaskDescription.DGUQLIhJrIAr, 5);
        sparseIntArray.put(C47501trL.TaskDescription.frkDMe, 6);
    }

    public tNA(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, AYXKKw, gEmmrt));
    }

    public tNA(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[5], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[6], (ConstraintLayout) objArr[3], (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[4]);
        this.DbNXlk = -1L;
        this.KWHzl.setTag(null);
        this.OLrzqt.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.values = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.DbNXlk = 4L;
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
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C47499trJ.OLrzqt == i) {
            KWHzl((java.lang.String) obj);
        } else {
            if (C47499trJ.AEQbTJ != i) {
                return false;
            }
            AEQbTJ((java.lang.String) obj);
        }
        return true;
    }

    @Override // o.AbstractC46260tNt
    public void KWHzl(@androidx.annotation.Nullable java.lang.String str) {
        this.djBIcL = str;
        synchronized (this) {
            this.DbNXlk |= 1;
        }
        notifyPropertyChanged(C47499trJ.OLrzqt);
        super.requestRebind();
    }

    @Override // o.AbstractC46260tNt
    public void AEQbTJ(@androidx.annotation.Nullable java.lang.String str) {
        this.valueOf = str;
        synchronized (this) {
            this.DbNXlk |= 2;
        }
        notifyPropertyChanged(C47499trJ.AEQbTJ);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.DbNXlk;
            this.DbNXlk = 0L;
        }
        java.lang.String str = this.djBIcL;
        java.lang.String str2 = this.valueOf;
        if ((5 & j) != 0) {
            TextViewBindingAdapter.setText(this.KWHzl, str);
        }
        if ((j & 6) != 0) {
            TextViewBindingAdapter.setText(this.OLrzqt, str2);
        }
    }
}
