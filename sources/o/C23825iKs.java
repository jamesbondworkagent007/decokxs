package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iKs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C23825iKs extends AbstractC23827iKu {
    public static final android.util.SparseIntArray AuCTelauCTel;
    public static final ViewDataBinding.IncludedLayouts iwGUEr = null;
    public long AubY;
    public final android.widget.LinearLayout wlaJM;

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
        AuCTelauCTel = sparseIntArray;
        sparseIntArray.put(C25493ixk.ActionBar.QSAYLr, 1);
        sparseIntArray.put(C25493ixk.ActionBar.RcXXUw, 2);
        sparseIntArray.put(C25493ixk.ActionBar.OrsvgJ, 3);
        sparseIntArray.put(C25493ixk.ActionBar.MediaDescriptionCompatApi21Builder, 4);
        sparseIntArray.put(C25493ixk.ActionBar.setCurrentKeyboardTarget, 5);
        sparseIntArray.put(C25493ixk.ActionBar.jFiva, 6);
        sparseIntArray.put(C25493ixk.ActionBar.invokespecialsiEkQe, 7);
        sparseIntArray.put(C25493ixk.ActionBar.ROgMPW, 8);
        sparseIntArray.put(C25493ixk.ActionBar.DPHOMC, 9);
        sparseIntArray.put(C25493ixk.ActionBar.DaTmkG, 10);
        sparseIntArray.put(C25493ixk.ActionBar.ODCBUN, 11);
        sparseIntArray.put(C25493ixk.ActionBar.IYdWPz, 12);
        sparseIntArray.put(C25493ixk.ActionBar.registerKeyboardTarget, 13);
        sparseIntArray.put(C25493ixk.ActionBar.clearCurrentKeyboardTarget, 14);
        sparseIntArray.put(C25493ixk.ActionBar.keyboardTargetTextChanged, 15);
        sparseIntArray.put(C25493ixk.ActionBar.QSbQqJ, 16);
        sparseIntArray.put(C25493ixk.ActionBar.aPFruk, 17);
        sparseIntArray.put(C25493ixk.ActionBar.apNKau, 18);
        sparseIntArray.put(C25493ixk.ActionBar.IconCompatParcelizer, 19);
        sparseIntArray.put(C25493ixk.ActionBar.DjWNei, 20);
        sparseIntArray.put(C25493ixk.ActionBar.ZpNRhN, 21);
        sparseIntArray.put(C25493ixk.ActionBar.QBiWsm, 22);
        sparseIntArray.put(C25493ixk.ActionBar.DXXBbs, 23);
        sparseIntArray.put(C25493ixk.ActionBar.invokespecialaVhqwO, 24);
    }

    public C23825iKs(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 25, iwGUEr, AuCTelauCTel));
    }

    public C23825iKs(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[2], (ConstraintLayout) objArr[23], (C52794wYp) objArr[24], (Guideline) objArr[9], (Guideline) objArr[10], (Guideline) objArr[11], (Guideline) objArr[7], (Guideline) objArr[8], (android.widget.ImageView) objArr[3], (NestedScrollView) objArr[1], (C27465jvh) objArr[12], (ConstraintLayout) objArr[6], (RecyclerView) objArr[22], (RecyclerView) objArr[20], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[13], (android.widget.TextView) objArr[14], (android.widget.TextView) objArr[15], (android.widget.TextView) objArr[16], (android.widget.TextView) objArr[17], (android.widget.TextView) objArr[18], (android.widget.TextView) objArr[21], (android.widget.TextView) objArr[19], (C55258xgZ) objArr[4]);
        this.AubY = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.wlaJM = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AubY = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AubY != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AubY = 0L;
        }
    }
}
