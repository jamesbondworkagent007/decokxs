package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import o.C49720utq;

/* JADX INFO: renamed from: o.utE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C49682utE extends AbstractC49681utD {
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public static final android.util.SparseIntArray valueOf;
    public final ConstraintLayout AYXKKw;
    public long djBIcL;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        valueOf = sparseIntArray;
        sparseIntArray.put(C49720utq.Application.copydefault, 3);
    }

    public C49682utE(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, gEmmrt, valueOf));
    }

    public C49682utE(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[2], (Guideline) objArr[3], (android.widget.TextView) objArr[1]);
        this.djBIcL = -1L;
        this.OLrzqt.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AYXKKw = constraintLayout;
        constraintLayout.setTag(null);
        this.AhwBna.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.djBIcL = 8L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.djBIcL != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C49719utp.copydefault == i) {
            AEQbTJ((java.lang.String) obj);
        } else if (C49719utp.OLrzqt == i) {
            OLrzqt((java.lang.String) obj);
        } else {
            if (C49719utp.KWHzl != i) {
                return false;
            }
            KWHzl(((java.lang.Boolean) obj).booleanValue());
        }
        return true;
    }

    @Override // o.AbstractC49681utD
    public void AEQbTJ(@androidx.annotation.Nullable java.lang.String str) {
        this.EZpvd = str;
        synchronized (this) {
            this.djBIcL |= 1;
        }
        notifyPropertyChanged(C49719utp.copydefault);
        super.requestRebind();
    }

    @Override // o.AbstractC49681utD
    public void OLrzqt(@androidx.annotation.Nullable java.lang.String str) {
        this.KWHzl = str;
        synchronized (this) {
            this.djBIcL |= 2;
        }
        notifyPropertyChanged(C49719utp.OLrzqt);
        super.requestRebind();
    }

    @Override // o.AbstractC49681utD
    public void KWHzl(boolean z) {
        this.copydefault = z;
        synchronized (this) {
            this.djBIcL |= 4;
        }
        notifyPropertyChanged(C49719utp.KWHzl);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.djBIcL;
            this.djBIcL = 0L;
        }
        java.lang.String str = this.EZpvd;
        java.lang.String str2 = this.KWHzl;
        boolean z = this.copydefault;
        long j2 = j & 12;
        int i = 0;
        if (j2 != 0) {
            if (j2 != 0) {
                j |= z ? 32L : 16L;
            }
            if (z) {
                i = 8;
            }
        }
        if ((9 & j) != 0) {
            TextViewBindingAdapter.setText(this.OLrzqt, str);
        }
        if ((j & 12) != 0) {
            this.AYXKKw.setVisibility(i);
        }
        if ((j & 10) != 0) {
            TextViewBindingAdapter.setText(this.AhwBna, str2);
        }
    }
}
