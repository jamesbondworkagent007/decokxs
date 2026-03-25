package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vbv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50852vbv extends AbstractC50851vbu {
    public static final android.util.SparseIntArray AkhnZx;
    public static final ViewDataBinding.IncludedLayouts fetchVPNInfo = null;
    public long isConnected;
    public final ConstraintLayout values;

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
        AkhnZx = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.findOwner, 1);
        sparseIntArray.put(C48033uCm.Application.getLauncher, 2);
        sparseIntArray.put(C48033uCm.Application.ActivityResultRegistryKtrememberLauncherForActivityResult11, 3);
        sparseIntArray.put(C48033uCm.Application.flag, 4);
        sparseIntArray.put(C48033uCm.Application.ViewTreeFullyDrawnReporterOwner, 5);
        sparseIntArray.put(C48033uCm.Application.PlaybackStateCompatRepeatMode, 6);
        sparseIntArray.put(C48033uCm.Application.newArray, 7);
        sparseIntArray.put(C48033uCm.Application.DjWNei, 8);
        sparseIntArray.put(C48033uCm.Application.setEnabled, 9);
        sparseIntArray.put(C48033uCm.Application.InspectablePropertyEnumEntry, 10);
        sparseIntArray.put(C48033uCm.Application.getFlags, 11);
    }

    public C50852vbv(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, fetchVPNInfo, AkhnZx));
    }

    public C50852vbv(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[8], (android.view.View) objArr[11], (android.widget.LinearLayout) objArr[7], (RecyclerView) objArr[6], (C52794wYp) objArr[9], (android.widget.TextView) objArr[5], (android.widget.ImageView) objArr[1], (C55372xih) objArr[2], (android.widget.TextView) objArr[3], (C52794wYp) objArr[10], (C55251xgS) objArr[4]);
        this.isConnected = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.values = constraintLayout;
        constraintLayout.setTag(null);
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
