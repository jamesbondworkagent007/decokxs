package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.robinhood.ticker.TickerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eja, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16419eja extends AbstractC16365eiZ {
    public static final android.util.SparseIntArray AuCTel;
    public static final ViewDataBinding.IncludedLayouts fetchVPNInfo = null;
    public final ConstraintLayout ejfBZ;
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
        sparseIntArray.put(C13754dXa.ActionBar.RlQdEF, 1);
        sparseIntArray.put(C13754dXa.ActionBar.next, 2);
        sparseIntArray.put(C13754dXa.ActionBar.isTransportControlEnabled, 3);
        sparseIntArray.put(C13754dXa.ActionBar.sYcwUD, 4);
        sparseIntArray.put(C13754dXa.ActionBar.onChildrenLoaded, 5);
        sparseIntArray.put(C13754dXa.ActionBar.iZzfmt, 6);
        sparseIntArray.put(C13754dXa.ActionBar.applyOptions, 7);
        sparseIntArray.put(C13754dXa.ActionBar.dzkkkq, 8);
        sparseIntArray.put(C13754dXa.ActionBar.Rdimen, 9);
        sparseIntArray.put(C13754dXa.ActionBar.gGvvIC, 10);
        sparseIntArray.put(C13754dXa.ActionBar.dHguZz, 11);
        sparseIntArray.put(C13754dXa.ActionBar.QSBOWP, 12);
        sparseIntArray.put(C13754dXa.ActionBar.RdAHlO, 13);
        sparseIntArray.put(C13754dXa.ActionBar.zFtALg, 14);
    }

    public C16419eja(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 15, fetchVPNInfo, AuCTel));
    }

    public C16419eja(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C14697dqO) objArr[10], (AppBarLayout) objArr[6], (C33537myN) objArr[1], (C55244xgL) objArr[12], (NestedScrollView) objArr[11], (ViewPager2) objArr[13], (ConstraintLayout) objArr[8], (ConstraintLayout) objArr[4], (C55173xeu) objArr[14], (C15828eWu) objArr[5], (C15764eUk) objArr[7], (C33546myW) objArr[2], (C33603mza) objArr[3], (TickerView) objArr[9]);
        this.fARcdN = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.ejfBZ = constraintLayout;
        constraintLayout.setTag(null);
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
