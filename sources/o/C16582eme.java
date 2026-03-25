package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eme, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16582eme extends AbstractC16580emc {
    public static final android.util.SparseIntArray fARcdN;
    public static final ViewDataBinding.IncludedLayouts values = null;
    public long fJNWhG;

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
        fARcdN = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.getVolumeAttributes, 1);
        sparseIntArray.put(C13754dXa.ActionBar.iZzfmt, 2);
        sparseIntArray.put(C13754dXa.ActionBar.DzCpqu, 3);
        sparseIntArray.put(C13754dXa.ActionBar.zpGcln, 4);
        sparseIntArray.put(C13754dXa.ActionBar.addReporter, 5);
        sparseIntArray.put(C13754dXa.ActionBar.m, 6);
        sparseIntArray.put(C13754dXa.ActionBar.OnBackPressedDispatcherApi33Impl, 7);
        sparseIntArray.put(C13754dXa.ActionBar.fRNHEq, 8);
        sparseIntArray.put(C13754dXa.ActionBar.DGOPHZDGOPHZ, 9);
        sparseIntArray.put(C13754dXa.ActionBar.jh, 10);
        sparseIntArray.put(C13754dXa.ActionBar.onProviderEnabled, 11);
        sparseIntArray.put(C13754dXa.ActionBar.ZNPcth, 12);
        sparseIntArray.put(C13754dXa.ActionBar.MenuRes, 13);
    }

    public C16582eme(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, values, fARcdN));
    }

    public C16582eme(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppBarLayout) objArr[2], (android.view.View) objArr[9], (ConstraintLayout) objArr[4], (C14707dqY) objArr[10], (C19394gAt) objArr[3], (AppCompatTextView) objArr[11], (AppCompatImageView) objArr[8], (android.widget.FrameLayout) objArr[12], (android.widget.LinearLayout) objArr[6], (C33603mza) objArr[1], (C33546myW) objArr[0], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[7], (RecyclerView) objArr[13]);
        this.fJNWhG = -1L;
        this.DbNXlk.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fJNWhG = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fJNWhG != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fJNWhG = 0L;
        }
    }
}
