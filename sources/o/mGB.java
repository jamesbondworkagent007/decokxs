package o;

import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.mHF;

/* JADX INFO: loaded from: classes8.dex */
public class mGB extends AbstractC31864mGt implements mHF.TaskDescription {
    public static final ViewDataBinding.IncludedLayouts AEQbTJ = null;
    public static final android.util.SparseIntArray EZpvd = null;
    public long AhwBna;
    public final View.OnClickListener KWHzl;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    public mGB(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 1, AEQbTJ, EZpvd));
    }

    public mGB(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (mIB) objArr[0]);
        this.AhwBna = -1L;
        this.copydefault.setTag(null);
        setRootTag(view);
        this.KWHzl = new mHF(this, 1);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AhwBna = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AhwBna != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (mDB.copydefault != i) {
            return false;
        }
        copydefault((C31944mJs) obj);
        return true;
    }

    public void copydefault(@androidx.annotation.Nullable C31944mJs c31944mJs) {
        this.OLrzqt = c31944mJs;
        synchronized (this) {
            this.AhwBna |= 1;
        }
        notifyPropertyChanged(mDB.copydefault);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.AhwBna;
            this.AhwBna = 0L;
        }
        if ((j & 2) != 0) {
            mID.EZpvd(this.copydefault, this.KWHzl, null, null, null);
        }
    }

    @Override // o.mHF.TaskDescription
    public final void copydefault(int i, android.view.View view) {
        C31944mJs c31944mJs = this.OLrzqt;
        if (c31944mJs != null) {
            c31944mJs.KWHzl();
        }
    }
}
