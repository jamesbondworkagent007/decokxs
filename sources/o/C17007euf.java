package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.euf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C17007euf extends AbstractC17006eue {
    public static final ViewDataBinding.IncludedLayouts AkhnZx = null;
    public static final android.util.SparseIntArray values;
    public long fetchVPNInfo;
    public final ConstraintLayout isConnected;

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
        values = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.accept, 1);
        sparseIntArray.put(C13754dXa.ActionBar.CheckResult, 2);
        sparseIntArray.put(C13754dXa.ActionBar.ActivityResultContractsStartIntentSenderForResultCompanion, 3);
        sparseIntArray.put(C13754dXa.ActionBar.gdmIOq, 4);
        sparseIntArray.put(C13754dXa.ActionBar.ColorLong, 5);
        sparseIntArray.put(C13754dXa.ActionBar.ActivityResultLauncherKt, 6);
        sparseIntArray.put(C13754dXa.ActionBar.ActivityResultContractsTakePicturePreview, 7);
        sparseIntArray.put(C13754dXa.ActionBar.getPackageName, 8);
        sparseIntArray.put(C13754dXa.ActionBar.DQzvGNdrmXxudrmXxu, 9);
        sparseIntArray.put(C13754dXa.ActionBar.DKtBnz, 10);
        sparseIntArray.put(C13754dXa.ActionBar.sTzBva, 11);
    }

    public C17007euf(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, AkhnZx, values));
    }

    public C17007euf(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C33537myN) objArr[1], (C52794wYp) objArr[11], (C52794wYp) objArr[10], (MaterialCardView) objArr[4], (MaterialCardView) objArr[9], (RecyclerView) objArr[8], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[5]);
        this.fetchVPNInfo = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.isConnected = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fetchVPNInfo = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fetchVPNInfo != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fetchVPNInfo = 0L;
        }
    }
}
