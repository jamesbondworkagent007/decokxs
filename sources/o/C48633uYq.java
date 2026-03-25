package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uYq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48633uYq extends AbstractC48632uYp {
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public static final android.util.SparseIntArray values;
    public final ConstraintLayout AkhnZx;
    public long DbNXlk;

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
        values = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.DuXjdv, 1);
        sparseIntArray.put(C48033uCm.Application.Dfm, 2);
        sparseIntArray.put(C48033uCm.Application.onCommand, 3);
        sparseIntArray.put(C48033uCm.Application.getMediaController, 4);
        sparseIntArray.put(C48033uCm.Application.IMediaSessionStubProxy, 5);
        sparseIntArray.put(C48033uCm.Application.MediaSessionCompat3, 6);
        sparseIntArray.put(C48033uCm.Application.fZBcTu, 7);
        sparseIntArray.put(C48033uCm.Application.djSkpj, 8);
        sparseIntArray.put(C48033uCm.Application.isNavigationVisible, 9);
    }

    public C48633uYq(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, djBIcL, values));
    }

    public C48633uYq(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatTextView) objArr[8], (AppCompatTextView) objArr[7], (AppCompatImageView) objArr[1], (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[4], (C49774uur) objArr[6], (C49774uur) objArr[3], (AppCompatTextView) objArr[9]);
        this.DbNXlk = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AkhnZx = constraintLayout;
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
