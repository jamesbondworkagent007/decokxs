package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nIg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33853nIg extends nHX {
    public static final android.util.SparseIntArray gHZMYf;
    public static final ViewDataBinding.IncludedLayouts zLjUOn = null;
    public long AxsJAY;
    public final ConstraintLayout zuBGHE;

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
        gHZMYf = sparseIntArray;
        sparseIntArray.put(C35399nuc.StateListAnimator.zbGDDc, 1);
        sparseIntArray.put(C35399nuc.StateListAnimator.QOjuYg, 2);
        sparseIntArray.put(C35399nuc.StateListAnimator.DTeKQX, 3);
        sparseIntArray.put(C35399nuc.StateListAnimator.DMb, 4);
        sparseIntArray.put(C35399nuc.StateListAnimator.Dfm, 5);
        sparseIntArray.put(C35399nuc.StateListAnimator.DcMfJKDGTeJD, 6);
        sparseIntArray.put(C35399nuc.StateListAnimator.DLGVGj, 7);
        sparseIntArray.put(C35399nuc.StateListAnimator.sVvuFk, 8);
        sparseIntArray.put(C35399nuc.StateListAnimator.iKEqwx, 9);
        sparseIntArray.put(C35399nuc.StateListAnimator.sbu, 10);
        sparseIntArray.put(C35399nuc.StateListAnimator.hrjNmC, 11);
        sparseIntArray.put(C35399nuc.StateListAnimator.DBAlnt, 12);
        sparseIntArray.put(C35399nuc.StateListAnimator.RKDWNf, 13);
        sparseIntArray.put(C35399nuc.StateListAnimator.zeUYeG, 14);
        sparseIntArray.put(C35399nuc.StateListAnimator.dbUqJD, 15);
        sparseIntArray.put(C35399nuc.StateListAnimator.OAhWiU, 16);
        sparseIntArray.put(C35399nuc.StateListAnimator.GQzpsZ, 17);
        sparseIntArray.put(C35399nuc.StateListAnimator.sILrnl, 18);
        sparseIntArray.put(C35399nuc.StateListAnimator.fARcdN, 19);
        sparseIntArray.put(C35399nuc.StateListAnimator.AuCTel, 20);
        sparseIntArray.put(C35399nuc.StateListAnimator.sVXHln, 21);
        sparseIntArray.put(C35399nuc.StateListAnimator.iPSTqm, 22);
        sparseIntArray.put(C35399nuc.StateListAnimator.aJFbMH, 23);
        sparseIntArray.put(C35399nuc.StateListAnimator.gGNlxh, 24);
        sparseIntArray.put(C35399nuc.StateListAnimator.gsvlRV, 25);
        sparseIntArray.put(C35399nuc.StateListAnimator.getUriFromString, 26);
        sparseIntArray.put(C35399nuc.StateListAnimator.dTTfOR, 27);
        sparseIntArray.put(C35399nuc.StateListAnimator.UeEOUB, 28);
        sparseIntArray.put(C35399nuc.StateListAnimator.OAUGar, 29);
    }

    public C33853nIg(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 30, zLjUOn, gHZMYf));
    }

    public C33853nIg(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (Group) objArr[19], (ConstraintLayout) objArr[20], (C52794wYp) objArr[28], (ConstraintLayout) objArr[13], (android.view.View) objArr[23], (android.widget.TextView) objArr[22], (android.widget.TextView) objArr[21], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[9], (LinearLayoutCompat) objArr[7], (C35893oHp) objArr[3], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[10], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[25], (android.widget.TextView) objArr[24], (C35893oHp) objArr[8], (oJD) objArr[5], (android.widget.TextView) objArr[15], (android.view.View) objArr[16], (CardView) objArr[12], (android.widget.TextView) objArr[18], (android.widget.TextView) objArr[17], (android.widget.TextView) objArr[14], (android.widget.ScrollView) objArr[2], (androidx.appcompat.widget.Toolbar) objArr[1], (android.widget.TextView) objArr[29], (C55173xeu) objArr[27], (C55113xdn) objArr[26]);
        this.AxsJAY = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.zuBGHE = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AxsJAY = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AxsJAY != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AxsJAY = 0L;
        }
    }
}
