package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.luU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31461luU extends AbstractC31462luV {
    public static final ViewDataBinding.IncludedLayouts AuCTelauCTel = null;
    public static final android.util.SparseIntArray zLjUOn;
    public long wlaJM;
    public final android.widget.FrameLayout zsXlph;

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
        zLjUOn = sparseIntArray;
        sparseIntArray.put(C31351lsQ.Application.DGUQLIekVPG, 2);
        sparseIntArray.put(C31351lsQ.Application.AxsJAYaxsJAY, 3);
        sparseIntArray.put(C31351lsQ.Application.iRxXKY, 4);
        sparseIntArray.put(C31351lsQ.Application.gkJEwt, 5);
        sparseIntArray.put(C31351lsQ.Application.apNbdB, 6);
        sparseIntArray.put(C31351lsQ.Application.RihMUf, 7);
        sparseIntArray.put(C31351lsQ.Application.giSNqX, 8);
        sparseIntArray.put(C31351lsQ.Application.fHqPtx, 9);
        sparseIntArray.put(C31351lsQ.Application.hbZCHz, 10);
        sparseIntArray.put(C31351lsQ.Application.fMBJsc, 11);
        sparseIntArray.put(C31351lsQ.Application.zuBGHE, 12);
        sparseIntArray.put(C31351lsQ.Application.hUfVAv, 13);
        sparseIntArray.put(C31351lsQ.Application.FhERFw, 14);
        sparseIntArray.put(C31351lsQ.Application.atDTRm, 15);
        sparseIntArray.put(C31351lsQ.Application.aKhcqp, 16);
        sparseIntArray.put(C31351lsQ.Application.dPnHjp, 17);
        sparseIntArray.put(C31351lsQ.Application.OBJEWx, 18);
        sparseIntArray.put(C31351lsQ.Application.QfsBiF, 19);
        sparseIntArray.put(C31351lsQ.Application.QUSxYX, 20);
        sparseIntArray.put(C31351lsQ.Application.dNCPSb, 21);
        sparseIntArray.put(C31351lsQ.Application.UeEOUB, 22);
        sparseIntArray.put(C31351lsQ.Application.aCSzUz, 23);
        sparseIntArray.put(C31351lsQ.Application.gGvvIC, 24);
        sparseIntArray.put(C31351lsQ.Application.fvQaOB, 25);
    }

    public C31461luU(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 26, AuCTelauCTel, zLjUOn));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C31461luU(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[12];
        C54984xbQ c54984xbQ = (C54984xbQ) objArr[19];
        C54984xbQ c54984xbQ2 = (C54984xbQ) objArr[20];
        C54984xbQ c54984xbQ3 = (C54984xbQ) objArr[21];
        C54984xbQ c54984xbQ4 = (C54984xbQ) objArr[22];
        C55173xeu c55173xeu = (C55173xeu) objArr[25];
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[24];
        C30019lIx c30019lIx = (C30019lIx) objArr[8];
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[5];
        C55113xdn c55113xdn = (C55113xdn) objArr[3];
        C52794wYp c52794wYp = (C52794wYp) objArr[13];
        android.widget.ScrollView scrollView = (android.widget.ScrollView) objArr[4];
        ConstraintLayout constraintLayout3 = (ConstraintLayout) objArr[18];
        android.view.View view2 = (android.view.View) objArr[9];
        android.widget.Space space = (android.widget.Space) objArr[6];
        java.lang.Object obj = objArr[2];
        super(dataBindingComponent, view, 0, linearLayout, c54984xbQ, c54984xbQ2, c54984xbQ3, c54984xbQ4, c55173xeu, constraintLayout, c30019lIx, constraintLayout2, c55113xdn, c52794wYp, scrollView, constraintLayout3, view2, space, obj != null ? C31597lwz.AEQbTJ((android.view.View) obj) : null, (C55030xcJ) objArr[23], (C52794wYp) objArr[16], (ConstraintLayout) objArr[15], (wYB) objArr[17], (ConstraintLayout) objArr[10], (lIE) objArr[11], (C52794wYp) objArr[14], (ConstraintLayout) objArr[1], (lIL) objArr[7]);
        this.wlaJM = -1L;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) objArr[0];
        this.zsXlph = frameLayout;
        frameLayout.setTag(null);
        this.hDKMBd.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.wlaJM = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.wlaJM != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.wlaJM = 0L;
        }
    }
}
