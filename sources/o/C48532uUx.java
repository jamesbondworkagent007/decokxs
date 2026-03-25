package o;

import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uUx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48532uUx extends AbstractC48526uUr {
    public static final android.util.SparseIntArray AkhnZx;
    public static final ViewDataBinding.IncludedLayouts DbNXlk = null;
    public long isConnected;
    public final android.widget.LinearLayout values;

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
        sparseIntArray.put(C48033uCm.Application.MediaControllerCompatApi21TransportControls, 1);
        sparseIntArray.put(C48033uCm.Application.dNCPSb, 2);
        sparseIntArray.put(C48033uCm.Application.OxVOHk, 3);
        sparseIntArray.put(C48033uCm.Application.hCLrkq, 4);
        sparseIntArray.put(C48033uCm.Application.UJpkuA, 5);
        sparseIntArray.put(C48033uCm.Application.getMinimumWidth, 6);
        sparseIntArray.put(C48033uCm.Application.MediaBrowserCompat, 7);
        sparseIntArray.put(C48033uCm.Application.PlaybackStateCompatApi22, 8);
        sparseIntArray.put(C48033uCm.Application.onWindowVisibilityChanged, 9);
        sparseIntArray.put(C48033uCm.Application.onFitSystemWindows, 10);
    }

    public C48532uUx(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, DbNXlk, AkhnZx));
    }

    public C48532uUx(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C47988uAv) objArr[2], (uBL) objArr[3], (C53539wnR) objArr[4], (android.widget.TextView) objArr[5], (android.widget.ImageView) objArr[7], (NestedScrollView) objArr[1], (RecyclerView) objArr[8], (android.widget.TextView) objArr[10], (android.view.View) objArr[9], (C54154wyx) objArr[6]);
        this.isConnected = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.values = linearLayout;
        linearLayout.setTag(null);
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
