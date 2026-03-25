package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C35964oKf;

/* JADX INFO: loaded from: classes8.dex */
public class oMC extends AbstractC36037oMy {
    public static final android.util.SparseIntArray AuCTel;
    public static final ViewDataBinding.IncludedLayouts ejfBZ = null;
    public long fARcdN;

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
        AuCTel = sparseIntArray;
        sparseIntArray.put(C35964oKf.StateListAnimator.MediaBrowserCompatMediaItemFlags, 1);
        sparseIntArray.put(C35964oKf.StateListAnimator.getMediaId, 2);
        sparseIntArray.put(C35964oKf.StateListAnimator.putCallback, 3);
        sparseIntArray.put(C35964oKf.StateListAnimator.registerCallbackMessenger, 4);
        sparseIntArray.put(C35964oKf.StateListAnimator.unregisterCallbackMessenger, 5);
        sparseIntArray.put(C35964oKf.StateListAnimator.MediaBrowserCompatMediaBrowserServiceCallbackImpl, 6);
        sparseIntArray.put(C35964oKf.StateListAnimator.getMediaItem, 7);
        sparseIntArray.put(C35964oKf.StateListAnimator.onSearchResult, 8);
        sparseIntArray.put(C35964oKf.StateListAnimator.MediaBrowserCompatSearchResultReceiver, 9);
        sparseIntArray.put(C35964oKf.StateListAnimator.MediaBrowserCompatSearchCallback, 10);
        sparseIntArray.put(C35964oKf.StateListAnimator.createFromParcel, 11);
        sparseIntArray.put(C35964oKf.StateListAnimator.MediaBrowserCompatMediaItem1, 12);
        sparseIntArray.put(C35964oKf.StateListAnimator.writeToParcel, 13);
        sparseIntArray.put(C35964oKf.StateListAnimator.MediaBrowserCompatSubscription, 14);
        sparseIntArray.put(C35964oKf.StateListAnimator.isPlayable, 15);
    }

    public oMC(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 16, ejfBZ, AuCTel));
    }

    public oMC(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.LinearLayout) objArr[0], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[15], (android.widget.TextView) objArr[12], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[13], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[10], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[14], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[3]);
        this.fARcdN = -1L;
        this.OLrzqt.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fARcdN = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fARcdN != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fARcdN = 0L;
        }
    }
}
