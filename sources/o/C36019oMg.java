package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oMg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36019oMg extends AbstractC36018oMf {
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public static final android.util.SparseIntArray valueOf;
    public long DbNXlk;
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
        valueOf = sparseIntArray;
        sparseIntArray.put(C35964oKf.StateListAnimator.fJNWhG, 1);
        sparseIntArray.put(C35964oKf.StateListAnimator.zCTncp, 2);
        sparseIntArray.put(C35964oKf.StateListAnimator.onPrepareFromMediaId, 3);
        sparseIntArray.put(C35964oKf.StateListAnimator.apNbdB, 4);
        sparseIntArray.put(C35964oKf.StateListAnimator.UscePu, 5);
        sparseIntArray.put(C35964oKf.StateListAnimator.RSmiaq, 6);
        sparseIntArray.put(C35964oKf.StateListAnimator.AudioAttributesImplBaseParcelizer, 7);
        sparseIntArray.put(C35964oKf.StateListAnimator.GiPPlLRPuVlr, 8);
    }

    public C36019oMg(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, djBIcL, valueOf));
    }

    public C36019oMg(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C57597ylS) objArr[1], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[4], (AppCompatImageView) objArr[8], (ConstraintLayout) objArr[6], (NestedScrollView) objArr[2], (android.widget.TextView) objArr[7], (C39837pzq) objArr[3]);
        this.DbNXlk = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fetchVPNInfo = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.DbNXlk = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.DbNXlk != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.DbNXlk = 0L;
        }
    }
}
