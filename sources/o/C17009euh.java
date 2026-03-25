package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.euh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C17009euh extends AbstractC17010eui {
    public static final ViewDataBinding.IncludedLayouts AuCTel = null;
    public static final android.util.SparseIntArray fIwbmz;
    public long ejfBZ;
    public final ConstraintLayout hDKMBd;

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
        sparseIntArray.put(C13754dXa.ActionBar.accept, 1);
        sparseIntArray.put(C13754dXa.ActionBar.CheckResult, 2);
        sparseIntArray.put(C13754dXa.ActionBar.ActivityResultContractsStartIntentSenderForResultCompanion, 3);
        sparseIntArray.put(C13754dXa.ActionBar.QjzqRB, 4);
        sparseIntArray.put(C13754dXa.ActionBar.aWJMta, 5);
        sparseIntArray.put(C13754dXa.ActionBar.PlaybackStateCompatBuilder, 6);
        sparseIntArray.put(C13754dXa.ActionBar.DfrfUJ, 7);
        sparseIntArray.put(C13754dXa.ActionBar.DcNNRp, 8);
        sparseIntArray.put(C13754dXa.ActionBar.DtnWsU, 9);
        sparseIntArray.put(C13754dXa.ActionBar.PlaybackStateCompatActions, 10);
        sparseIntArray.put(C13754dXa.ActionBar.glVQsU, 11);
        sparseIntArray.put(C13754dXa.ActionBar.QhYuFg, 12);
        sparseIntArray.put(C13754dXa.ActionBar.apLTlu, 13);
        sparseIntArray.put(C13754dXa.ActionBar.getPosition, 14);
        sparseIntArray.put(C13754dXa.ActionBar.DwQSDd, 15);
        sparseIntArray.put(C13754dXa.ActionBar.dIjzlO, 16);
        sparseIntArray.put(C13754dXa.ActionBar.DUUtXg, 17);
    }

    public C17009euh(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 18, AuCTel, fIwbmz));
    }

    public C17009euh(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C33537myN) objArr[1], (C52794wYp) objArr[17], (wYK) objArr[16], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[15], (android.widget.ImageView) objArr[5], (android.widget.ImageView) objArr[9], (android.widget.ImageView) objArr[13], (ConstraintLayout) objArr[4], (ConstraintLayout) objArr[8], (ConstraintLayout) objArr[12], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[10], (android.widget.TextView) objArr[14], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[2]);
        this.ejfBZ = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.hDKMBd = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.ejfBZ = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.ejfBZ != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.ejfBZ = 0L;
        }
    }
}
