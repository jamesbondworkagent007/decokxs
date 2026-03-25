package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import o.C13754dXa;

/* JADX INFO: renamed from: o.emf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16583emf extends AbstractC16586emi {
    public static final android.util.SparseIntArray AuCTel;
    public static final ViewDataBinding.IncludedLayouts fJNWhG = null;
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
        sparseIntArray.put(C13754dXa.ActionBar.iZzfmt, 1);
        sparseIntArray.put(C13754dXa.ActionBar.DzCpqu, 2);
        sparseIntArray.put(C13754dXa.ActionBar.getLabel, 3);
        sparseIntArray.put(C13754dXa.ActionBar.MediaSessionCompatCallback, 4);
        sparseIntArray.put(C13754dXa.ActionBar.onSessionReady, 5);
        sparseIntArray.put(C13754dXa.ActionBar.GqbzPL, 6);
        sparseIntArray.put(C13754dXa.ActionBar.zpGcln, 7);
        sparseIntArray.put(C13754dXa.ActionBar.OFQuKP, 8);
        sparseIntArray.put(C13754dXa.ActionBar.addReporter, 9);
        sparseIntArray.put(C13754dXa.ActionBar.OnBackPressedDispatcherApi33Impl, 10);
        sparseIntArray.put(C13754dXa.ActionBar.OhcwxsRkSIEV, 11);
        sparseIntArray.put(C13754dXa.ActionBar.onProviderEnabled, 12);
        sparseIntArray.put(C13754dXa.ActionBar.ZNPcth, 13);
        sparseIntArray.put(C13754dXa.ActionBar.MenuRes, 14);
    }

    public C16583emf(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 15, fJNWhG, AuCTel));
    }

    public C16583emf(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppBarLayout) objArr[1], (C21262gwT) objArr[3], (ConstraintLayout) objArr[7], (android.widget.TextView) objArr[6], (C19394gAt) objArr[2], (AppCompatTextView) objArr[12], (C21321gxZ) objArr[11], (android.widget.TextView) objArr[8], (android.widget.FrameLayout) objArr[13], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[4], (C33546myW) objArr[0], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[10], (RecyclerView) objArr[14]);
        this.fARcdN = -1L;
        this.DbNXlk.setTag(null);
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
