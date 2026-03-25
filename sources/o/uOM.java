package o;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uOM extends uOO {
    public static final android.util.SparseIntArray fetchVPNInfo;
    public static final ViewDataBinding.IncludedLayouts values = null;
    public final CoordinatorLayout fARcdN;
    public long fIwbmz;

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
        sparseIntArray.put(C48033uCm.Application.giSNqX, 1);
        sparseIntArray.put(C48033uCm.Application.Rbool, 2);
        sparseIntArray.put(C48033uCm.Application.setPositiveButton, 3);
        sparseIntArray.put(C48033uCm.Application.setOnItemSelectedListener, 4);
        sparseIntArray.put(C48033uCm.Application.zCTncp, 5);
        sparseIntArray.put(C48033uCm.Application.getWindowCallback, 6);
        sparseIntArray.put(C48033uCm.Application.getSubDecor, 7);
        sparseIntArray.put(C48033uCm.Application.AppCompatViewInflaterDeclaredOnClickListener, 8);
        sparseIntArray.put(C48033uCm.Application.createRatingBar, 9);
        sparseIntArray.put(C48033uCm.Application.getResultContract, 10);
        sparseIntArray.put(C48033uCm.Application.ContentView, 11);
        sparseIntArray.put(C48033uCm.Application.getFlags, 12);
        sparseIntArray.put(C48033uCm.Application.getOutline, 13);
    }

    public uOM(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, values, fetchVPNInfo));
    }

    public uOM(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppBarLayout) objArr[1], (android.widget.ImageView) objArr[5], (android.view.View) objArr[12], (android.view.View) objArr[10], (C55254xgV) objArr[11], (CollapsingToolbarLayout) objArr[2], (android.widget.TextView) objArr[4], (C55258xgZ) objArr[3], (android.widget.TextView) objArr[7], (C55258xgZ) objArr[6], (android.widget.TextView) objArr[9], (C55258xgZ) objArr[8], (ViewPager2) objArr[13]);
        this.fIwbmz = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.fARcdN = coordinatorLayout;
        coordinatorLayout.setTag(null);
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
