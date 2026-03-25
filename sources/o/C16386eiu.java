package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eiu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16386eiu extends AbstractC16388eiw {
    public static final ViewDataBinding.IncludedLayouts AYXKKw = null;
    public static final android.util.SparseIntArray gEmmrt;
    public final ConstraintLayout DbNXlk;
    public long fetchVPNInfo;

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
        gEmmrt = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.iZzfmt, 1);
        sparseIntArray.put(C13754dXa.ActionBar.zFtALg, 2);
        sparseIntArray.put(C13754dXa.ActionBar.toLegacyStreamType, 3);
        sparseIntArray.put(C13754dXa.ActionBar.getSessionID, 4);
        sparseIntArray.put(C13754dXa.ActionBar.RLmrWm, 5);
        sparseIntArray.put(C13754dXa.ActionBar.isActive, 6);
        sparseIntArray.put(C13754dXa.ActionBar.getPercentRating, 7);
        sparseIntArray.put(C13754dXa.ActionBar.MediaControllerCompatCallbackStubApi21, 8);
    }

    public C16386eiu(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, AYXKKw, gEmmrt));
    }

    public C16386eiu(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C33537myN) objArr[1], (android.widget.ImageView) objArr[4], (android.widget.TextView) objArr[5], (C55173xeu) objArr[2], (android.widget.TextView) objArr[7], (RecyclerView) objArr[8], (NestedScrollView) objArr[3], (android.widget.TextView) objArr[6]);
        this.fetchVPNInfo = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.DbNXlk = constraintLayout;
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
