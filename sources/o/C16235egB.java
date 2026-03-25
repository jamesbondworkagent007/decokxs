package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.egB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16235egB extends AbstractC16237egD {
    public static final ViewDataBinding.IncludedLayouts AkhnZx = null;
    public static final android.util.SparseIntArray fetchVPNInfo;
    public final ConstraintLayout isConnected;
    public long values;

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
        fetchVPNInfo = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.HJWChPzRXNTw, 1);
        sparseIntArray.put(C13754dXa.ActionBar.getPlaybackInfo, 2);
        sparseIntArray.put(C13754dXa.ActionBar.DXXBbs, 3);
        sparseIntArray.put(C13754dXa.ActionBar.IResultReceiver, 4);
        sparseIntArray.put(C13754dXa.ActionBar.onVolumeChanged, 5);
        sparseIntArray.put(C13754dXa.ActionBar.onRepeatModeChanged, 6);
        sparseIntArray.put(C13754dXa.ActionBar.GQzpsZsQwTVT, 7);
        sparseIntArray.put(C13754dXa.ActionBar.dispatchMediaButtonEvent, 8);
        sparseIntArray.put(C13754dXa.ActionBar.sRzUNh, 9);
        sparseIntArray.put(C13754dXa.ActionBar.zzQwtT, 10);
    }

    public C16235egB(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, AkhnZx, fetchVPNInfo));
    }

    public C16235egB(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[3], (C52794wYp) objArr[10], (android.widget.TextView) objArr[9], (LinearLayoutCompat) objArr[7], (LinearLayoutCompat) objArr[1], (RecyclerView) objArr[6], (android.widget.ImageView) objArr[2], (android.widget.ImageView) objArr[8], (NestedScrollView) objArr[5], (androidx.appcompat.widget.Toolbar) objArr[4]);
        this.values = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.isConnected = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.values = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.values != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.values = 0L;
        }
    }
}
