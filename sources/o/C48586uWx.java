package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uWx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48586uWx extends AbstractC48585uWw {
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public static final android.util.SparseIntArray djBIcL;
    public long valueOf;

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
        djBIcL = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.MediaSessionCompatOnActiveChangeListener, 1);
        sparseIntArray.put(C48033uCm.Application.AppCompatDelegateImplAppCompatWindowCallback, 2);
        sparseIntArray.put(C48033uCm.Application.onWindowStartingActionMode, 3);
        sparseIntArray.put(C48033uCm.Application.AppCompatDelegateImplApi26ImplExternalSyntheticApiModelOutline0, 4);
    }

    public C48586uWx(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 5, AhwBna, djBIcL));
    }

    public C48586uWx(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (android.widget.LinearLayout) objArr[0], new ViewStubProxy((android.view.ViewStub) objArr[1]), (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[3]);
        this.valueOf = -1L;
        this.OLrzqt.setTag(null);
        this.EZpvd.setContainingBinding(this);
        setRootTag(viewArr);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.valueOf = 1L;
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
    public void executeBindings() {
        synchronized (this) {
            this.valueOf = 0L;
        }
        if (this.EZpvd.getBinding() != null) {
            ViewDataBinding.executeBindingsOn(this.EZpvd.getBinding());
        }
    }
}
