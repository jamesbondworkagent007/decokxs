package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uOB extends AbstractC48368uOx {
    public static final ViewDataBinding.IncludedLayouts ejfBZ = null;
    public static final android.util.SparseIntArray uzCIH;
    public long getFieldNames;
    public final android.widget.LinearLayout getNewProxyInstance;

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
        uzCIH = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.startSupportActionMode, 1);
        sparseIntArray.put(C48033uCm.Application.setTheme, 2);
        sparseIntArray.put(C48033uCm.Application.supportNavigateUpTo, 3);
        sparseIntArray.put(C48033uCm.Application.setSupportProgressBarVisibility, 4);
        sparseIntArray.put(C48033uCm.Application.applyDayNight, 5);
        sparseIntArray.put(C48033uCm.Application.isCompatVectorFromResourcesEnabled, 6);
        sparseIntArray.put(C48033uCm.Application.addActiveDelegate, 7);
        sparseIntArray.put(C48033uCm.Application.removeActivityDelegate, 8);
        sparseIntArray.put(C48033uCm.Application.AppCompatActivity2, 9);
        sparseIntArray.put(C48033uCm.Application.OnBackPressedDispatcherOwner, 10);
        sparseIntArray.put(C48033uCm.Application.AppCompatActivity1, 11);
        sparseIntArray.put(C48033uCm.Application.supportShouldUpRecreateTask, 12);
        sparseIntArray.put(C48033uCm.Application.AppCompatCallback, 13);
        sparseIntArray.put(C48033uCm.Application.supportRequestWindowFeature, 14);
        sparseIntArray.put(C48033uCm.Application.PipHintTrackerKt, 15);
        sparseIntArray.put(C48033uCm.Application.getDefaultNightMode, 16);
        sparseIntArray.put(C48033uCm.Application.AppCompatDelegate, 17);
        sparseIntArray.put(C48033uCm.Application.applyDayNightToActiveDelegates, 18);
        sparseIntArray.put(C48033uCm.Application.QnnRaN, 19);
    }

    public uOB(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 20, ejfBZ, uzCIH));
    }

    public uOB(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[19], (android.widget.LinearLayout) objArr[10], (android.widget.LinearLayout) objArr[15], (android.widget.TextView) objArr[2], (C55001xbh) objArr[3], (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[11], (C55001xbh) objArr[12], (android.widget.TextView) objArr[13], (wYK) objArr[9], (wYK) objArr[14], (android.widget.TextView) objArr[6], (C55001xbh) objArr[7], (android.widget.TextView) objArr[16], (C55001xbh) objArr[17], (android.widget.TextView) objArr[18], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[5]);
        this.getFieldNames = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.getNewProxyInstance = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.getFieldNames = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.getFieldNames != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.getFieldNames = 0L;
        }
    }
}
