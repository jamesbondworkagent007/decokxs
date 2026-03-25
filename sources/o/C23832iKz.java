package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iKz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C23832iKz extends AbstractC23831iKy {
    public static final android.util.SparseIntArray DbNXlk;
    public static final ViewDataBinding.IncludedLayouts values = null;
    public final android.widget.LinearLayout fJNWhG;
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
        DbNXlk = sparseIntArray;
        sparseIntArray.put(C25493ixk.ActionBar.onConnectionFailed, 1);
        sparseIntArray.put(C25493ixk.ActionBar.onConnected, 2);
        sparseIntArray.put(C25493ixk.ActionBar.RcvFxC, 3);
        sparseIntArray.put(C25493ixk.ActionBar.FHvxmb, 4);
        sparseIntArray.put(C25493ixk.ActionBar.UscePu, 5);
        sparseIntArray.put(C25493ixk.ActionBar.gCZUJG, 6);
        sparseIntArray.put(C25493ixk.ActionBar.fVjYLc, 7);
        sparseIntArray.put(C25493ixk.ActionBar.MediaBrowserCompatItemCallbackItemCallbackApi23, 8);
        sparseIntArray.put(C25493ixk.ActionBar.setCallbacksMessenger, 9);
        sparseIntArray.put(C25493ixk.ActionBar.glVQsU, 10);
        sparseIntArray.put(C25493ixk.ActionBar.iUnTnt, 11);
        sparseIntArray.put(C25493ixk.ActionBar.QFTsTN, 12);
    }

    public C23832iKz(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, values, DbNXlk));
    }

    public C23832iKz(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[5], (android.widget.ImageView) objArr[10], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[12], (android.widget.LinearLayout) objArr[7], (android.widget.LinearLayout) objArr[4], (android.widget.TextView) objArr[6], (android.widget.LinearLayout) objArr[3], (android.widget.TextView) objArr[9], (android.widget.LinearLayout) objArr[1], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[8]);
        this.isConnected = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.fJNWhG = linearLayout;
        linearLayout.setTag(null);
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
