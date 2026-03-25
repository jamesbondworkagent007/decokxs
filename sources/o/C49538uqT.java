package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;
import o.C49511upt;

/* JADX INFO: renamed from: o.uqT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C49538uqT extends AbstractC49534uqP {
    public static final android.util.SparseIntArray AuCTel;
    public static final ViewDataBinding.IncludedLayouts fJNWhG = null;
    public long ejfBZ;
    public final android.widget.LinearLayout fARcdN;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49534uqP
    public void EZpvd(@androidx.annotation.Nullable ViewOnClickListenerC49657usg viewOnClickListenerC49657usg) {
        this.valueOf = viewOnClickListenerC49657usg;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        AuCTel = sparseIntArray;
        sparseIntArray.put(C49511upt.Application.gUEfcq, 1);
        sparseIntArray.put(C49511upt.Application.OxVOHk, 2);
        sparseIntArray.put(C49511upt.Application.QCjLjM, 3);
        sparseIntArray.put(C49511upt.Application.gSBher, 4);
        sparseIntArray.put(C49511upt.Application.USBtdM, 5);
        sparseIntArray.put(C49511upt.Application.DaRZkR, 6);
        sparseIntArray.put(C49511upt.Application.DCUTEI, 7);
        sparseIntArray.put(C49511upt.Application.OqFWZa, 8);
        sparseIntArray.put(C49511upt.Application.hlkKmr, 9);
        sparseIntArray.put(C49511upt.Application.gasjUx, 10);
        sparseIntArray.put(C49511upt.Application.ffGIBT, 11);
        sparseIntArray.put(C49511upt.Application.QHmsKR, 12);
        sparseIntArray.put(C49511upt.Application.DcqEDu, 13);
        sparseIntArray.put(C49511upt.Application.QSLkRj, 14);
    }

    public C49538uqT(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 15, fJNWhG, AuCTel));
    }

    public C49538uqT(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatImageView) objArr[10], (LinearLayoutCompat) objArr[8], (android.widget.LinearLayout) objArr[11], (android.widget.ImageView) objArr[7], (android.widget.ImageView) objArr[12], (android.widget.ImageView) objArr[14], (LinearLayoutCompat) objArr[3], (LinearLayoutCompat) objArr[2], (C55251xgS) objArr[5], (ShapeableImageView) objArr[13], (AppCompatImageView) objArr[6], (android.widget.TextView) objArr[9], (C49658ush) objArr[1], (AppCompatTextView) objArr[4]);
        this.ejfBZ = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.fARcdN = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.ejfBZ = 2L;
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
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C49512upu.KWHzl != i) {
            return false;
        }
        EZpvd((ViewOnClickListenerC49657usg) obj);
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.ejfBZ = 0L;
        }
    }
}
