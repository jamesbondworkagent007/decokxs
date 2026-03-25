package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ewB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C17083ewB extends AbstractC17084ewC {
    public static final ViewDataBinding.IncludedLayouts fARcdN = null;
    public static final android.util.SparseIntArray getNewProxyInstance;
    public long getFieldNames;

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
        getNewProxyInstance = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.PlaybackStateCompatBuilder, 2);
        sparseIntArray.put(C13754dXa.ActionBar.zMXLsR, 3);
        sparseIntArray.put(C13754dXa.ActionBar.HJWChPhFGucI, 4);
        sparseIntArray.put(C13754dXa.ActionBar.gdLjtZ, 5);
        sparseIntArray.put(C13754dXa.ActionBar.OqFWZa, 6);
        sparseIntArray.put(C13754dXa.ActionBar.GzAsTt, 7);
        sparseIntArray.put(C13754dXa.ActionBar.HJWChP, 8);
        sparseIntArray.put(C13754dXa.ActionBar.aappFQ, 9);
        sparseIntArray.put(C13754dXa.ActionBar.dXcUrg, 10);
        sparseIntArray.put(C13754dXa.ActionBar.HJWChPHhYHK, 11);
        sparseIntArray.put(C13754dXa.ActionBar.MediaSessionCompatCallbackStubApi23, 12);
        sparseIntArray.put(C13754dXa.ActionBar.HJWChPDXdlte, 13);
        sparseIntArray.put(C13754dXa.ActionBar.hgxRZI, 14);
        sparseIntArray.put(C13754dXa.ActionBar.hcetpZ, 15);
        sparseIntArray.put(C13754dXa.ActionBar.setDefaultImpl, 16);
        sparseIntArray.put(C13754dXa.ActionBar.setContentdefault, 17);
        sparseIntArray.put(C13754dXa.ActionBar.SlnMSS, 18);
    }

    public C17083ewB(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 19, fARcdN, getNewProxyInstance));
    }

    public C17083ewB(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (android.widget.ImageView) objArr[6], (ConstraintLayout) objArr[0], (ConstraintLayout) objArr[1], (android.widget.TextView) objArr[14], (android.view.View) objArr[15], (ConstraintLayout) objArr[5], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[13], (ConstraintLayout) objArr[10], (android.widget.ImageView) objArr[11], (Guideline) objArr[4], (android.widget.ImageView) objArr[18], (android.widget.ImageView) objArr[3], (android.widget.LinearLayout) objArr[16], (androidx.legacy.widget.Space) objArr[12], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[17]);
        this.getFieldNames = -1L;
        this.copydefault.setTag(null);
        this.AEQbTJ.setTag(null);
        setRootTag(viewArr);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.getFieldNames = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.getFieldNames != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.getFieldNames = 0L;
        }
    }
}
