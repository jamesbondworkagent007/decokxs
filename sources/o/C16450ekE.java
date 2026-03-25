package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ekE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16450ekE extends AbstractC16453ekH {
    public static final android.util.SparseIntArray DbNXlk;
    public static final ViewDataBinding.IncludedLayouts fetchVPNInfo = null;
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
        DbNXlk = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.HJWChPOKBmQN, 1);
        sparseIntArray.put(C13754dXa.ActionBar.OqhRBM, 2);
        sparseIntArray.put(C13754dXa.ActionBar.DzCpqu, 3);
        sparseIntArray.put(C13754dXa.ActionBar.iqMDAV, 4);
        sparseIntArray.put(C13754dXa.ActionBar.ODXsMY, 5);
        sparseIntArray.put(C13754dXa.ActionBar.PlaybackStateCompatBuilder, 6);
        sparseIntArray.put(C13754dXa.ActionBar.setActiveQueueItemId, 7);
        sparseIntArray.put(C13754dXa.ActionBar.setBufferedPosition, 8);
        sparseIntArray.put(C13754dXa.ActionBar.sbu, 9);
        sparseIntArray.put(C13754dXa.ActionBar.OAhWiU, 10);
        sparseIntArray.put(C13754dXa.ActionBar.update, 11);
    }

    public C16450ekE(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, fetchVPNInfo, DbNXlk));
    }

    public C16450ekE(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatImageView) objArr[5], (Guideline) objArr[4], (AppCompatImageView) objArr[9], (android.view.View) objArr[10], (android.widget.FrameLayout) objArr[1], (ConstraintLayout) objArr[3], (android.widget.ImageView) objArr[2], (ConstraintLayout) objArr[0], (android.widget.FrameLayout) objArr[11], (android.widget.TextView) objArr[6], (AppCompatImageView) objArr[7], (android.widget.TextView) objArr[8]);
        this.isConnected = -1L;
        this.AYXKKw.setTag(null);
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
