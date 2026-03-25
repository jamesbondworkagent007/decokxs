package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ehv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16334ehv extends AbstractC16330ehr {
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public static final android.util.SparseIntArray valueOf;
    public long AkhnZx;
    public final ConstraintLayout fetchVPNInfo;

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
        valueOf = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.iZzfmt, 1);
        sparseIntArray.put(C13754dXa.ActionBar.hlkKmr, 2);
        sparseIntArray.put(C13754dXa.ActionBar.MediaBrowserCompatSubscriptionCallbackSubscriptionCallbackApi26, 3);
        sparseIntArray.put(C13754dXa.ActionBar.ComponentActivity1, 4);
        sparseIntArray.put(C13754dXa.ActionBar.onContextAvailable, 5);
        sparseIntArray.put(C13754dXa.ActionBar.MediaDescriptionCompatBuilder, 6);
        sparseIntArray.put(C13754dXa.ActionBar.build, 7);
        sparseIntArray.put(C13754dXa.ActionBar.getMediaDescription, 8);
    }

    public C16334ehv(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, gEmmrt, valueOf));
    }

    public C16334ehv(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C33537myN) objArr[1], (C52794wYp) objArr[2], (NestedScrollView) objArr[3], (C55008xbo) objArr[8], (C55008xbo) objArr[7], (C55008xbo) objArr[6], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[5]);
        this.AkhnZx = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fetchVPNInfo = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AkhnZx = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AkhnZx != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AkhnZx = 0L;
        }
    }
}
