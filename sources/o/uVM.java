package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.reminder.OKReminder;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uVM extends uVK {
    public static final ViewDataBinding.IncludedLayouts fIwbmz = null;
    public static final android.util.SparseIntArray fJNWhG;
    public long AuCTel;

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
        fJNWhG = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.DdI, 1);
        sparseIntArray.put(C48033uCm.Application.newInstance, 2);
        sparseIntArray.put(C48033uCm.Application.setAutoMirrored, 3);
        sparseIntArray.put(C48033uCm.Application.ActivityResultContractsCaptureVideo, 4);
        sparseIntArray.put(C48033uCm.Application.ContextAware, 5);
        sparseIntArray.put(C48033uCm.Application.ContextAwareKt, 6);
        sparseIntArray.put(C48033uCm.Application.ContextAwareHelper, 7);
        sparseIntArray.put(C48033uCm.Application.onError, 8);
        sparseIntArray.put(C48033uCm.Application.clearAvailableContext, 9);
        sparseIntArray.put(C48033uCm.Application.ContextAwareKtwithContextAvailable21, 10);
        sparseIntArray.put(C48033uCm.Application.dispatchOnContextAvailable, 11);
        sparseIntArray.put(C48033uCm.Application.OnContextAvailableListener, 12);
        sparseIntArray.put(C48033uCm.Application.ContextAwareKtwithContextAvailable2listener1, 13);
        sparseIntArray.put(C48033uCm.Application.withContextAvailableforInline, 14);
        sparseIntArray.put(C48033uCm.Application.createAutoCompleteTextView, 15);
    }

    public uVM(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 16, fIwbmz, fJNWhG));
    }

    public uVM(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[1], (C53560wnm) objArr[8], (android.widget.LinearLayout) objArr[2], (NestedScrollView) objArr[0], (C50351vLe) objArr[5], (C55258xgZ) objArr[6], (android.widget.TextView) objArr[7], (C55258xgZ) objArr[9], (C55258xgZ) objArr[11], (C55258xgZ) objArr[13], (android.widget.TextView) objArr[10], (android.widget.TextView) objArr[12], (android.widget.TextView) objArr[14], (C53573wnz) objArr[4], (android.widget.TextView) objArr[15], (OKReminder) objArr[3]);
        this.AuCTel = -1L;
        this.copydefault.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AuCTel = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AuCTel != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AuCTel = 0L;
        }
    }
}
