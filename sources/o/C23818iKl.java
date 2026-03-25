package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iKl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C23818iKl extends AbstractC23817iKk {
    public static final android.util.SparseIntArray AkhnZx;
    public static final ViewDataBinding.IncludedLayouts fetchVPNInfo = null;
    public long AuCTel;
    public final android.widget.FrameLayout fJNWhG;

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
        AkhnZx = sparseIntArray;
        sparseIntArray.put(C25493ixk.ActionBar.onConnected, 1);
        sparseIntArray.put(C25493ixk.ActionBar.glVQsU, 2);
        sparseIntArray.put(C25493ixk.ActionBar.iUnTnt, 3);
        sparseIntArray.put(C25493ixk.ActionBar.QFTsTN, 4);
        sparseIntArray.put(C25493ixk.ActionBar.ExKek, 5);
        sparseIntArray.put(C25493ixk.ActionBar.postOrRun, 6);
        sparseIntArray.put(C25493ixk.ActionBar.gsvlRV, 7);
        sparseIntArray.put(C25493ixk.ActionBar.gGNlxh, 8);
        sparseIntArray.put(C25493ixk.ActionBar.dbwnZN, 9);
        sparseIntArray.put(C25493ixk.ActionBar.UscePu, 10);
        sparseIntArray.put(C25493ixk.ActionBar.search, 11);
        sparseIntArray.put(C25493ixk.ActionBar.QslYrK, 12);
        sparseIntArray.put(C25493ixk.ActionBar.MediaBrowserCompatItemCallbackItemCallbackApi23, 13);
    }

    public C23818iKl(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, fetchVPNInfo, AkhnZx));
    }

    public C23818iKl(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[10], (android.widget.ImageView) objArr[2], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[4], (android.widget.LinearLayout) objArr[5], (android.widget.LinearLayout) objArr[7], (android.widget.LinearLayout) objArr[8], (android.widget.LinearLayout) objArr[12], (android.widget.LinearLayout) objArr[9], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[13], (android.widget.TextView) objArr[6]);
        this.AuCTel = -1L;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) objArr[0];
        this.fJNWhG = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AuCTel = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AuCTel != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AuCTel = 0L;
        }
    }
}
