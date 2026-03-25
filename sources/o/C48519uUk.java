package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uUk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48519uUk extends AbstractC48515uUg {
    public static final ViewDataBinding.IncludedLayouts AYXKKw = null;
    public static final android.util.SparseIntArray DbNXlk;
    public long fetchVPNInfo;

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
        sparseIntArray.put(C48033uCm.Application.fIwbmz, 1);
        sparseIntArray.put(C48033uCm.Application.uzCIH, 2);
        sparseIntArray.put(C48033uCm.Application.hDKMBd, 3);
        sparseIntArray.put(C48033uCm.Application.newStarRating, 4);
        sparseIntArray.put(C48033uCm.Application.newUnratedRating, 5);
        sparseIntArray.put(C48033uCm.Application.playFromUri, 6);
        sparseIntArray.put(C48033uCm.Application.prepareFromSearch, 7);
        sparseIntArray.put(C48033uCm.Application.getNewProxyInstance, 8);
    }

    public C48519uUk(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, AYXKKw, DbNXlk));
    }

    public C48519uUk(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatImageView) objArr[3], (Group) objArr[8], (android.widget.LinearLayout) objArr[1], (C55258xgZ) objArr[2], (C47988uAv) objArr[5], (C55258xgZ) objArr[4], (C47988uAv) objArr[7], (C55258xgZ) objArr[6], (ConstraintLayout) objArr[0]);
        this.fetchVPNInfo = -1L;
        this.gEmmrt.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fetchVPNInfo = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fetchVPNInfo != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fetchVPNInfo = 0L;
        }
    }
}
