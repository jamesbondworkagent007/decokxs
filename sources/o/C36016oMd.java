package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oMd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36016oMd extends AbstractC36017oMe {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public final C36023oMk fetchVPNInfo;
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
        AYXKKw = sparseIntArray;
        sparseIntArray.put(C35964oKf.StateListAnimator.AudioAttributesImplApi21Parcelizer, 2);
        sparseIntArray.put(C35964oKf.StateListAnimator.DCUTEI, 3);
        sparseIntArray.put(C35964oKf.StateListAnimator.onConnectionSuspended, 4);
        sparseIntArray.put(C35964oKf.StateListAnimator.aHXSQp, 5);
        sparseIntArray.put(C35964oKf.StateListAnimator.MediaSessionCompatMediaSessionImplApi191, 6);
        sparseIntArray.put(C35964oKf.StateListAnimator.iLWfRf, 7);
        sparseIntArray.put(C35964oKf.StateListAnimator.unsubscribe, 8);
    }

    public C36016oMd(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, AhwBna, AYXKKw));
    }

    public C36016oMd(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (FragmentContainerView) objArr[3], (C55254xgV) objArr[5], (C52794wYp) objArr[7], (android.widget.LinearLayout) objArr[0], (android.widget.FrameLayout) objArr[2], (C52794wYp) objArr[8], (android.widget.FrameLayout) objArr[4], (C57596ylR) objArr[6]);
        this.isConnected = -1L;
        java.lang.Object obj = objArr[1];
        this.fetchVPNInfo = obj != null ? C36023oMk.OLrzqt((android.view.View) obj) : null;
        this.AEQbTJ.setTag(null);
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
