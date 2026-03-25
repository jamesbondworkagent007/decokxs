package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uYi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48625uYi extends AbstractC48626uYj {
    public static final ViewDataBinding.IncludedLayouts AkhnZx = null;
    public static final android.util.SparseIntArray DbNXlk;
    public long values;

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
        sparseIntArray.put(C48033uCm.Application.enableContentAnimations, 6);
        sparseIntArray.put(C48033uCm.Application.QXDzTk, 7);
        sparseIntArray.put(C48033uCm.Application.fZc, 8);
        sparseIntArray.put(C48033uCm.Application.onReceive, 9);
    }

    public C48625uYi(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 10, AkhnZx, DbNXlk));
    }

    public C48625uYi(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (android.widget.ImageView) objArr[7], (C51601vqB) objArr[5], (AppCompatTextView) objArr[9], (AppCompatTextView) objArr[8], (RecyclerView) objArr[4], (ConstraintLayout) objArr[3], (C51998vxb) objArr[2], (AppCompatTextView) objArr[0], (android.widget.LinearLayout) objArr[1], (android.widget.FrameLayout) objArr[6]);
        this.values = -1L;
        this.OLrzqt.setTag(null);
        this.EZpvd.setTag(null);
        this.valueOf.setTag(null);
        this.djBIcL.setTag(null);
        this.gEmmrt.setTag(null);
        this.AYXKKw.setTag(null);
        setRootTag(viewArr);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.values = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.values != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.values = 0L;
        }
    }
}
