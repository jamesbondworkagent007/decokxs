package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uVp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48551uVp extends AbstractC48550uVo {
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public static final android.util.SparseIntArray isConnected;
    public long AkhnZx;
    public final ConstraintLayout fetchVPNInfo;

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
        isConnected = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.ROgMPW, 1);
        sparseIntArray.put(C48033uCm.Application.hfFNez, 2);
        sparseIntArray.put(C48033uCm.Application.FullyDrawnReporterOwner, 3);
        sparseIntArray.put(C48033uCm.Application.OqhRBMiKdSzF, 4);
        sparseIntArray.put(C48033uCm.Application.ActivityResultCallerKtExternalSyntheticLambda1, 5);
        sparseIntArray.put(C48033uCm.Application.resultCodeToString, 6);
        sparseIntArray.put(C48033uCm.Application.RvdRAu, 7);
        sparseIntArray.put(C48033uCm.Application.QhsCdEQhsCdE, 8);
        sparseIntArray.put(C48033uCm.Application.createFromXmlInner, 9);
    }

    public C48551uVp(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, AhwBna, isConnected));
    }

    public C48551uVp(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (RecyclerView) objArr[7], (AppCompatTextView) objArr[1], (AppCompatTextView) objArr[2], (AppCompatImageView) objArr[4], (C33604mzb) objArr[8], (AppCompatImageView) objArr[3], (C33546myW) objArr[6], (Group) objArr[5], (C55113xdn) objArr[9]);
        this.AkhnZx = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fetchVPNInfo = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AkhnZx = 1L;
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
    public void executeBindings() {
        synchronized (this) {
            this.AkhnZx = 0L;
        }
    }
}
