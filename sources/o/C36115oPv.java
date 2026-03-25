package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oPv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36115oPv extends AbstractC36117oPx {
    public static final android.util.SparseIntArray fIwbmz;
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public final ConstraintLayout AuCTel;
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
        fIwbmz = sparseIntArray;
        sparseIntArray.put(C35964oKf.StateListAnimator.zlvcHA, 1);
        sparseIntArray.put(C35964oKf.StateListAnimator.dbwnZN, 2);
        sparseIntArray.put(C35964oKf.StateListAnimator.gsvlRV, 3);
        sparseIntArray.put(C35964oKf.StateListAnimator.zqTOFw, 4);
        sparseIntArray.put(C35964oKf.StateListAnimator.zYHWMc, 5);
        sparseIntArray.put(C35964oKf.StateListAnimator.QslYrK, 6);
        sparseIntArray.put(C35964oKf.StateListAnimator.DQzvGN, 7);
        sparseIntArray.put(C35964oKf.StateListAnimator.DrNnAm, 8);
        sparseIntArray.put(C35964oKf.StateListAnimator.reset, 9);
        sparseIntArray.put(C35964oKf.StateListAnimator.RvdRAu, 10);
        sparseIntArray.put(C35964oKf.StateListAnimator.zLAIeZ, 11);
        sparseIntArray.put(C35964oKf.StateListAnimator.geLlBI, 12);
        sparseIntArray.put(C35964oKf.StateListAnimator.gdmIOq, 13);
        sparseIntArray.put(C35964oKf.StateListAnimator.Swccd, 14);
    }

    public C36115oPv(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 15, isConnected, fIwbmz));
    }

    public C36115oPv(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[10], (android.widget.TextView) objArr[12], (android.widget.TextView) objArr[14], (android.widget.ImageView) objArr[7], (android.widget.ImageView) objArr[9], (android.widget.ImageView) objArr[11], (android.widget.ImageView) objArr[13], (android.widget.ImageView) objArr[2], (android.widget.ImageView) objArr[3], (android.widget.ImageView) objArr[6]);
        this.fJNWhG = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AuCTel = constraintLayout;
        constraintLayout.setTag(null);
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
