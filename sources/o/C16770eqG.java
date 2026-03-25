package o;

import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eqG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16770eqG extends AbstractC16768eqE {
    public static final ViewDataBinding.IncludedLayouts AkhnZx = null;
    public static final android.util.SparseIntArray isConnected;
    public long fetchVPNInfo;
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
        isConnected = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.IYdWPz, 1);
        sparseIntArray.put(C13754dXa.ActionBar.aWJMta, 2);
        sparseIntArray.put(C13754dXa.ActionBar.OnBackPressedDispatcherApi33ImplExternalSyntheticLambda0, 3);
        sparseIntArray.put(C13754dXa.ActionBar.unregisterOnBackInvokedCallback, 4);
        sparseIntArray.put(C13754dXa.ActionBar.USBtdM, 5);
        sparseIntArray.put(C13754dXa.ActionBar.onAddQueueItem, 6);
        sparseIntArray.put(C13754dXa.ActionBar.Nullable, 7);
        sparseIntArray.put(C13754dXa.ActionBar.addSubscription, 8);
        sparseIntArray.put(C13754dXa.ActionBar.MediaBrowserCompatMediaItemFlags, 9);
        sparseIntArray.put(C13754dXa.ActionBar.GiPPlLRPuVlr, 10);
        sparseIntArray.put(C13754dXa.ActionBar.rememberLauncherForActivityResult, 11);
    }

    public C16770eqG(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, AkhnZx, isConnected));
    }

    public C16770eqG(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (Barrier) objArr[5], (android.view.View) objArr[10], (android.widget.ImageView) objArr[2], (android.widget.FrameLayout) objArr[1], (android.widget.LinearLayout) objArr[9], (android.widget.LinearLayout) objArr[8], (android.view.View) objArr[6], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[7]);
        this.fetchVPNInfo = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.values = constraintLayout;
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
