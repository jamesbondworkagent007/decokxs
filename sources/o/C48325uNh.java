package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uNh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48325uNh extends AbstractC48324uNg {
    public static final android.util.SparseIntArray DbNXlk;
    public static final ViewDataBinding.IncludedLayouts values = null;
    public long ejfBZ;
    public final LinearLayoutCompat fARcdN;

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
        sparseIntArray.put(C48033uCm.Application.DDxOgT, 1);
        sparseIntArray.put(C48033uCm.Application.ahrCSq, 2);
        sparseIntArray.put(C48033uCm.Application.onSetRating, 3);
        sparseIntArray.put(C48033uCm.Application.MediaMetadataCompatTextKey, 4);
        sparseIntArray.put(C48033uCm.Application.getMinimumWidth, 5);
        sparseIntArray.put(C48033uCm.Application.MediaControllerCompatApi21, 6);
        sparseIntArray.put(C48033uCm.Application.QfZsXX, 7);
        sparseIntArray.put(C48033uCm.Application.ICustomTabsCallback, 8);
        sparseIntArray.put(C48033uCm.Application.DaRZkR, 9);
        sparseIntArray.put(C48033uCm.Application.UJpkuA, 10);
        sparseIntArray.put(C48033uCm.Application.ORxRYg, 11);
        sparseIntArray.put(C48033uCm.Application.OcIXYQ, 12);
        sparseIntArray.put(C48033uCm.Application.QOLQEE, 13);
    }

    public C48325uNh(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, values, DbNXlk));
    }

    public C48325uNh(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatTextView) objArr[13], (ConstraintLayout) objArr[11], (C55258xgZ) objArr[12], (C53539wnR) objArr[9], (C55258xgZ) objArr[7], (AppCompatTextView) objArr[10], (C52465wMk) objArr[1], (C52470wMp) objArr[2], (C47988uAv) objArr[8], (C52468wMn) objArr[4], (ConstraintLayout) objArr[6], (RecyclerView) objArr[3], (C54154wyx) objArr[5]);
        this.ejfBZ = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.fARcdN = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
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
