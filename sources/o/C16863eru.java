package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.okinc.uilab.reminder.OKReminder;

/* JADX INFO: renamed from: o.eru, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16863eru extends AbstractC16867ery {
    public static final ViewDataBinding.IncludedLayouts AYXKKw = null;
    public static final android.util.SparseIntArray gEmmrt = null;
    public long djBIcL;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    public C16863eru(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, AYXKKw, gEmmrt));
    }

    public C16863eru(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[3], (C52794wYp) objArr[4], (C52794wYp) objArr[2], (ConstraintLayout) objArr[0], (OKReminder) objArr[1]);
        this.djBIcL = -1L;
        this.OLrzqt.setTag(null);
        this.EZpvd.setTag(null);
        this.AEQbTJ.setTag(null);
        this.copydefault.setTag(null);
        this.AhwBna.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.djBIcL = 2L;
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
        if (dTV.AEQbTJ != i) {
            return false;
        }
        EZpvd((C15489eKf) obj);
        return true;
    }

    @Override // o.AbstractC16867ery
    public void EZpvd(@androidx.annotation.Nullable C15489eKf c15489eKf) {
        this.KWHzl = c15489eKf;
        synchronized (this) {
            this.djBIcL |= 1;
        }
        notifyPropertyChanged(dTV.AEQbTJ);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        int iKWHzl;
        java.lang.String strAhwBna;
        int iOLrzqt;
        int iDjBIcL;
        int iValueOf;
        synchronized (this) {
            j = this.djBIcL;
            this.djBIcL = 0L;
        }
        C15489eKf c15489eKf = this.KWHzl;
        long j2 = j & 3;
        if (j2 == 0 || c15489eKf == null) {
            iKWHzl = 0;
            strAhwBna = null;
            iOLrzqt = 0;
            iDjBIcL = 0;
            iValueOf = 0;
        } else {
            iKWHzl = c15489eKf.KWHzl();
            iOLrzqt = c15489eKf.OLrzqt();
            strAhwBna = c15489eKf.AhwBna();
            iValueOf = c15489eKf.valueOf();
            iDjBIcL = c15489eKf.djBIcL();
        }
        if (j2 != 0) {
            this.OLrzqt.setVisibility(iDjBIcL);
            TextViewBindingAdapter.setText(this.OLrzqt, strAhwBna);
            this.EZpvd.setVisibility(iOLrzqt);
            this.AEQbTJ.setVisibility(iKWHzl);
            this.AhwBna.setVisibility(iValueOf);
        }
    }
}
