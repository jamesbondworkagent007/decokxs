package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uMA extends AbstractC48309uMs {
    public static final android.util.SparseIntArray gEmmrt;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public long isConnected;

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
        gEmmrt = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.reportWhenComplete, 1);
        sparseIntArray.put(C48033uCm.Application.ActivityResultContractsPickVisualMediaCompanionExternalSyntheticApiModelOutline0, 2);
        sparseIntArray.put(C48033uCm.Application.createFromXmlInner, 3);
        sparseIntArray.put(C48033uCm.Application.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, 4);
        sparseIntArray.put(C48033uCm.Application.getEXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAXannotations, 5);
        sparseIntArray.put(C48033uCm.Application.initializeReflectiveFields, 6);
        sparseIntArray.put(C48033uCm.Application.reportWhenCompleteforInline, 7);
    }

    public uMA(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, valueOf, gEmmrt));
    }

    public uMA(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.FrameLayout) objArr[4], (android.widget.LinearLayout) objArr[0], (C55230xfy) objArr[1], (RecyclerView) objArr[7], (C33546myW) objArr[6], (android.widget.TextView) objArr[2], (C51808vtx) objArr[5], (C55113xdn) objArr[3]);
        this.isConnected = -1L;
        this.copydefault.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.isConnected = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.isConnected != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.isConnected = 0L;
        }
    }
}
