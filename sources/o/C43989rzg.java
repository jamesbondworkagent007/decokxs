package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rzg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C43989rzg extends AbstractC43990rzh {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public final ConstraintLayout AhwBna;
    public long gEmmrt;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        AYXKKw = sparseIntArray;
        sparseIntArray.put(C43662rtX.ActionBar.getUserContextRegisteredStatus, 3);
    }

    public C43989rzg(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, djBIcL, AYXKKw));
    }

    public C43989rzg(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.view.View) objArr[3], (rQQ) objArr[1], (android.widget.TextView) objArr[2]);
        this.gEmmrt = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AhwBna = constraintLayout;
        constraintLayout.setTag(null);
        this.EZpvd.setTag(null);
        this.KWHzl.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.gEmmrt = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.gEmmrt != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C43664rtZ.copydefault == i) {
            KWHzl((java.lang.Boolean) obj);
        } else {
            if (C43664rtZ.EZpvd != i) {
                return false;
            }
            KWHzl((java.lang.String) obj);
        }
        return true;
    }

    @Override // o.AbstractC43990rzh
    public void KWHzl(@androidx.annotation.Nullable java.lang.Boolean bool) {
        this.AEQbTJ = bool;
        synchronized (this) {
            this.gEmmrt |= 1;
        }
        notifyPropertyChanged(C43664rtZ.copydefault);
        super.requestRebind();
    }

    @Override // o.AbstractC43990rzh
    public void KWHzl(@androidx.annotation.Nullable java.lang.String str) {
        this.copydefault = str;
        synchronized (this) {
            this.gEmmrt |= 2;
        }
        notifyPropertyChanged(C43664rtZ.EZpvd);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.gEmmrt;
            this.gEmmrt = 0L;
        }
        java.lang.Boolean bool = this.AEQbTJ;
        java.lang.String str = this.copydefault;
        long j2 = j & 5;
        int i = 0;
        if (j2 != 0) {
            boolean zSafeUnbox = ViewDataBinding.safeUnbox(bool);
            if (j2 != 0) {
                j |= zSafeUnbox ? 16L : 8L;
            }
            if (zSafeUnbox) {
                i = 8;
            }
        }
        if ((5 & j) != 0) {
            this.EZpvd.setVisibility(i);
        }
        if ((j & 6) != 0) {
            TextViewBindingAdapter.setText(this.KWHzl, str);
        }
    }
}
