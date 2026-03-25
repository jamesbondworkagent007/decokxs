package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.web3Uilib.bean.MultiTransactionDetailItem;
import o.C57406yhn;

/* JADX INFO: renamed from: o.yhB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57368yhB extends AbstractC57415yhw {
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public static final android.util.SparseIntArray isConnected;
    public long AkhnZx;
    public final ConstraintLayout DbNXlk;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@androidx.annotation.Nullable MultiTransactionDetailItem multiTransactionDetailItem) {
        this.OLrzqt = multiTransactionDetailItem;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        isConnected = sparseIntArray;
        sparseIntArray.put(C57406yhn.StateListAnimator.WS, 1);
        sparseIntArray.put(C57406yhn.StateListAnimator.ffGIBT, 2);
        sparseIntArray.put(C57406yhn.StateListAnimator.flVtFt, 3);
        sparseIntArray.put(C57406yhn.StateListAnimator.aHXSQp, 4);
        sparseIntArray.put(C57406yhn.StateListAnimator.fERRXa, 5);
        sparseIntArray.put(C57406yhn.StateListAnimator.QwvEab, 6);
        sparseIntArray.put(C57406yhn.StateListAnimator.hCLrkq, 7);
        sparseIntArray.put(C57406yhn.StateListAnimator.OcIXYQ, 8);
    }

    public C57368yhB(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, gEmmrt, isConnected));
    }

    public C57368yhB(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatImageView) objArr[8], (AppCompatImageView) objArr[3], (android.view.View) objArr[2], (C57456yik) objArr[6], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[1], (AppCompatTextView) objArr[7], (AppCompatTextView) objArr[4]);
        this.AkhnZx = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.DbNXlk = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AkhnZx = 2L;
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
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C57409yhq.EZpvd != i) {
            return false;
        }
        EZpvd((MultiTransactionDetailItem) obj);
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AkhnZx = 0L;
        }
    }
}
