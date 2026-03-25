package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rzl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C43994rzl extends AbstractC43991rzi {
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public static final android.util.SparseIntArray valueOf;
    public long AYXKKw;
    public final ConstraintLayout AhwBna;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        valueOf = sparseIntArray;
        sparseIntArray.put(C43662rtX.ActionBar.getUserContextRegisteredStatus, 3);
    }

    public C43994rzl(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, gEmmrt, valueOf));
    }

    public C43994rzl(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[3], (rQQ) objArr[1], (android.widget.TextView) objArr[2]);
        this.AYXKKw = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AhwBna = constraintLayout;
        constraintLayout.setTag(null);
        this.AEQbTJ.setTag(null);
        this.OLrzqt.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AYXKKw = 4L;
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
        if (C43664rtZ.copydefault == i) {
            KWHzl((java.lang.Boolean) obj);
        } else {
            if (C43664rtZ.EZpvd != i) {
                return false;
            }
            OLrzqt((java.lang.String) obj);
        }
        return true;
    }

    @Override // o.AbstractC43991rzi
    public void KWHzl(@androidx.annotation.Nullable java.lang.Boolean bool) {
        this.EZpvd = bool;
        synchronized (this) {
            this.AYXKKw |= 1;
        }
        notifyPropertyChanged(C43664rtZ.copydefault);
        super.requestRebind();
    }

    @Override // o.AbstractC43991rzi
    public void OLrzqt(@androidx.annotation.Nullable java.lang.String str) {
        this.KWHzl = str;
        synchronized (this) {
            this.AYXKKw |= 2;
        }
        notifyPropertyChanged(C43664rtZ.EZpvd);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.AYXKKw;
            this.AYXKKw = 0L;
        }
        java.lang.Boolean bool = this.EZpvd;
        java.lang.String str = this.KWHzl;
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
            this.AEQbTJ.setVisibility(i);
        }
        if ((j & 6) != 0) {
            TextViewBindingAdapter.setText(this.OLrzqt, str);
        }
    }
}
