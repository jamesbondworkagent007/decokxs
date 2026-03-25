package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.item.OKRegularCell;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vcn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50897vcn extends AbstractC50898vco {
    public static final android.util.SparseIntArray EZpvd;
    public static final ViewDataBinding.IncludedLayouts OLrzqt = null;
    public long KWHzl;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        EZpvd = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.DcMfJKsgNvtZ, 1);
    }

    public C50897vcn(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 2, OLrzqt, EZpvd));
    }

    public C50897vcn(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (OKRegularCell) objArr[0], (android.widget.ImageView) objArr[1]);
        this.KWHzl = -1L;
        this.AEQbTJ.setTag(null);
        setRootTag(viewArr);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.KWHzl = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.KWHzl != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.KWHzl = 0L;
        }
    }
}
