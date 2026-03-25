package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lve, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31524lve extends AbstractC31527lvh {
    public static final android.util.SparseIntArray getFieldNames;
    public static final ViewDataBinding.IncludedLayouts iwGUEr = null;
    public long hDKMBd;
    public final android.widget.FrameLayout uzCIH;

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
        getFieldNames = sparseIntArray;
        sparseIntArray.put(C31351lsQ.Application.DGUQLIekVPG, 2);
        sparseIntArray.put(C31351lsQ.Application.DXd, 3);
        sparseIntArray.put(C31351lsQ.Application.hKJZrr, 4);
        sparseIntArray.put(C31351lsQ.Application.getValue, 5);
        sparseIntArray.put(C31351lsQ.Application.GiPPlL, 6);
        sparseIntArray.put(C31351lsQ.Application.GhqvEQ, 7);
        sparseIntArray.put(C31351lsQ.Application.apNbdB, 8);
        sparseIntArray.put(C31351lsQ.Application.RihMUf, 9);
        sparseIntArray.put(C31351lsQ.Application.RckOJh, 10);
        sparseIntArray.put(C31351lsQ.Application.hbZCHz, 11);
        sparseIntArray.put(C31351lsQ.Application.fMBJsc, 12);
        sparseIntArray.put(C31351lsQ.Application.zuBGHE, 13);
        sparseIntArray.put(C31351lsQ.Application.fQQVvf, 14);
        sparseIntArray.put(C31351lsQ.Application.FhERFw, 15);
        sparseIntArray.put(C31351lsQ.Application.OBJEWx, 16);
        sparseIntArray.put(C31351lsQ.Application.QfsBiF, 17);
        sparseIntArray.put(C31351lsQ.Application.QUSxYX, 18);
        sparseIntArray.put(C31351lsQ.Application.dNCPSb, 19);
        sparseIntArray.put(C31351lsQ.Application.UeEOUB, 20);
        sparseIntArray.put(C31351lsQ.Application.aCSzUz, 21);
    }

    public C31524lve(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 22, iwGUEr, getFieldNames));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C31524lve(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[13];
        C54984xbQ c54984xbQ = (C54984xbQ) objArr[17];
        C54984xbQ c54984xbQ2 = (C54984xbQ) objArr[18];
        C54984xbQ c54984xbQ3 = (C54984xbQ) objArr[19];
        C54984xbQ c54984xbQ4 = (C54984xbQ) objArr[20];
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[16];
        android.widget.Space space = (android.widget.Space) objArr[8];
        java.lang.Object obj = objArr[2];
        super(dataBindingComponent, view, 0, linearLayout, c54984xbQ, c54984xbQ2, c54984xbQ3, c54984xbQ4, constraintLayout, space, obj != null ? C31597lwz.AEQbTJ((android.view.View) obj) : null, (C55030xcJ) objArr[21], (ConstraintLayout) objArr[11], (lIE) objArr[12], (C52794wYp) objArr[15], (ConstraintLayout) objArr[1], (C55173xeu) objArr[5], (ConstraintLayout) objArr[4], (C30019lIx) objArr[10], (ConstraintLayout) objArr[7], (C55113xdn) objArr[3], (C52794wYp) objArr[14], (android.widget.ScrollView) objArr[6], (lIL) objArr[9]);
        this.hDKMBd = -1L;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) objArr[0];
        this.uzCIH = frameLayout;
        frameLayout.setTag(null);
        this.isConnected.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.hDKMBd = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.hDKMBd != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.hDKMBd = 0L;
        }
    }
}
