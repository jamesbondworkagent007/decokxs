package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import o.C47315tni;

/* JADX INFO: renamed from: o.tqs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C47484tqs extends AbstractC47485tqt {
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public static final android.util.SparseIntArray djBIcL;
    public final ConstraintLayout AkhnZx;
    public long gEmmrt;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        djBIcL = sparseIntArray;
        sparseIntArray.put(C47315tni.TaskDescription.fvQaOB, 4);
    }

    public C47484tqs(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, AhwBna, djBIcL));
    }

    public C47484tqs(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[4], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[2]);
        this.gEmmrt = -1L;
        this.AEQbTJ.setTag(null);
        this.copydefault.setTag(null);
        this.OLrzqt.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AkhnZx = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.gEmmrt = 8L;
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
        if (C47317tnk.gEmmrt == i) {
            AEQbTJ((java.lang.String) obj);
        } else if (C47317tnk.AYXKKw == i) {
            KWHzl((java.lang.String) obj);
        } else {
            if (C47317tnk.djBIcL != i) {
                return false;
            }
            OLrzqt((java.lang.String) obj);
        }
        return true;
    }

    @Override // o.AbstractC47485tqt
    public void AEQbTJ(@androidx.annotation.Nullable java.lang.String str) {
        this.valueOf = str;
        synchronized (this) {
            this.gEmmrt |= 1;
        }
        notifyPropertyChanged(C47317tnk.gEmmrt);
        super.requestRebind();
    }

    @Override // o.AbstractC47485tqt
    public void KWHzl(@androidx.annotation.Nullable java.lang.String str) {
        this.KWHzl = str;
        synchronized (this) {
            this.gEmmrt |= 2;
        }
        notifyPropertyChanged(C47317tnk.AYXKKw);
        super.requestRebind();
    }

    @Override // o.AbstractC47485tqt
    public void OLrzqt(@androidx.annotation.Nullable java.lang.String str) {
        this.AYXKKw = str;
        synchronized (this) {
            this.gEmmrt |= 4;
        }
        notifyPropertyChanged(C47317tnk.djBIcL);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.gEmmrt;
            this.gEmmrt = 0L;
        }
        java.lang.String str = this.valueOf;
        java.lang.String str2 = this.KWHzl;
        java.lang.String str3 = this.AYXKKw;
        if ((10 & j) != 0) {
            TextViewBindingAdapter.setText(this.AEQbTJ, str2);
        }
        if ((9 & j) != 0) {
            TextViewBindingAdapter.setText(this.copydefault, str);
        }
        if ((j & 12) != 0) {
            TextViewBindingAdapter.setText(this.OLrzqt, str3);
        }
    }
}
