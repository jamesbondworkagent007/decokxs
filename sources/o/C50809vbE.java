package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.edit.OKEditText;

/* JADX INFO: renamed from: o.vbE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50809vbE extends AbstractC50810vbF {
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public static final android.util.SparseIntArray gEmmrt = null;
    public final android.widget.TextView AYXKKw;
    public long djBIcL;
    public final android.widget.TextView valueOf;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    public C50809vbE(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 7, AhwBna, gEmmrt));
    }

    public C50809vbE(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[3], (C55258xgZ) objArr[2], (OKEditText) objArr[5], (OKEditText) objArr[1]);
        this.djBIcL = -1L;
        this.KWHzl.setTag(null);
        android.widget.TextView textView = (android.widget.TextView) objArr[0];
        this.valueOf = textView;
        textView.setTag(null);
        android.widget.TextView textView2 = (android.widget.TextView) objArr[4];
        this.AYXKKw = textView2;
        textView2.setTag(null);
        this.AEQbTJ.setTag(null);
        this.EZpvd.setTag(null);
        this.OLrzqt.setTag(null);
        this.copydefault.setTag(null);
        setRootTag(viewArr);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.djBIcL = 1L;
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
    public void executeBindings() {
        synchronized (this) {
            this.djBIcL = 0L;
        }
    }
}
