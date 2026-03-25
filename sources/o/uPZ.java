package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uPZ extends AbstractC48400uQb {
    public static final android.util.SparseIntArray isConnected;
    public static final ViewDataBinding.IncludedLayouts values = null;
    public long fIwbmz;
    public final android.widget.LinearLayout fJNWhG;

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
        isConnected = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.MediaControllerCompatApi21TransportControls, 1);
        sparseIntArray.put(C48033uCm.Application.setTitle, 2);
        sparseIntArray.put(C48033uCm.Application.UccSpe, 3);
        sparseIntArray.put(C48033uCm.Application.ggKfIT, 4);
        sparseIntArray.put(C48033uCm.Application.iHkeWl, 5);
        sparseIntArray.put(C48033uCm.Application.setPlaybackToLocal, 6);
        sparseIntArray.put(C48033uCm.Application.ActivityResultCallerLauncherresultContract2, 7);
        sparseIntArray.put(C48033uCm.Application.RzdrRQ, 8);
        sparseIntArray.put(C48033uCm.Application.MediaBrowserCompat, 9);
        sparseIntArray.put(C48033uCm.Application.PlaybackStateCompatApi22, 10);
        sparseIntArray.put(C48033uCm.Application.onWindowVisibilityChanged, 11);
        sparseIntArray.put(C48033uCm.Application.onFitSystemWindows, 12);
        sparseIntArray.put(C48033uCm.Application.profile, 13);
    }

    public uPZ(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, values, isConnected));
    }

    public uPZ(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[4], (android.view.View) objArr[3], (android.widget.LinearLayout) objArr[8], (C52794wYp) objArr[13], (android.widget.ImageView) objArr[9], (android.widget.FrameLayout) objArr[2], (NestedScrollView) objArr[1], (AppCompatTextView) objArr[6], (RecyclerView) objArr[10], (android.widget.LinearLayout) objArr[7], (android.widget.TextView) objArr[12], (android.view.View) objArr[11]);
        this.fIwbmz = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.fJNWhG = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fIwbmz = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fIwbmz != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fIwbmz = 0L;
        }
    }
}
