package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.luW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31463luW extends AbstractC31464luX {
    public static final android.util.SparseIntArray iwGUEr;
    public static final ViewDataBinding.IncludedLayouts uzCIH = null;
    public final android.widget.FrameLayout getNewProxyInstance;
    public long hDKMBd;

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
        iwGUEr = sparseIntArray;
        sparseIntArray.put(C31351lsQ.Application.DGUQLIekVPG, 2);
        sparseIntArray.put(C31351lsQ.Application.DCUTEIdCUTEI, 3);
        sparseIntArray.put(C31351lsQ.Application.hlkKmr, 4);
        sparseIntArray.put(C31351lsQ.Application.gUEfcq, 5);
        sparseIntArray.put(C31351lsQ.Application.DCUTEIddSDPG, 6);
        sparseIntArray.put(C31351lsQ.Application.fRNHEq, 7);
        sparseIntArray.put(C31351lsQ.Application.apNbdB, 8);
        sparseIntArray.put(C31351lsQ.Application.zblBkD, 9);
        sparseIntArray.put(C31351lsQ.Application.hbZCHz, 10);
        sparseIntArray.put(C31351lsQ.Application.fMBJsc, 11);
        sparseIntArray.put(C31351lsQ.Application.zuBGHE, 12);
        sparseIntArray.put(C31351lsQ.Application.fERRXa, 13);
        sparseIntArray.put(C31351lsQ.Application.FhERFw, 14);
        sparseIntArray.put(C31351lsQ.Application.OBJEWx, 15);
        sparseIntArray.put(C31351lsQ.Application.QfsBiF, 16);
        sparseIntArray.put(C31351lsQ.Application.QUSxYX, 17);
        sparseIntArray.put(C31351lsQ.Application.dNCPSb, 18);
        sparseIntArray.put(C31351lsQ.Application.UeEOUB, 19);
        sparseIntArray.put(C31351lsQ.Application.aCSzUz, 20);
    }

    public C31463luW(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 21, uzCIH, iwGUEr));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C31463luW(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[12];
        C54984xbQ c54984xbQ = (C54984xbQ) objArr[16];
        C54984xbQ c54984xbQ2 = (C54984xbQ) objArr[17];
        C54984xbQ c54984xbQ3 = (C54984xbQ) objArr[18];
        C54984xbQ c54984xbQ4 = (C54984xbQ) objArr[19];
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[15];
        C52794wYp c52794wYp = (C52794wYp) objArr[13];
        C30019lIx c30019lIx = (C30019lIx) objArr[9];
        C55113xdn c55113xdn = (C55113xdn) objArr[3];
        android.widget.ScrollView scrollView = (android.widget.ScrollView) objArr[6];
        android.widget.Space space = (android.widget.Space) objArr[8];
        C55173xeu c55173xeu = (C55173xeu) objArr[5];
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[4];
        java.lang.Object obj = objArr[2];
        super(dataBindingComponent, view, 0, linearLayout, c54984xbQ, c54984xbQ2, c54984xbQ3, c54984xbQ4, constraintLayout, c52794wYp, c30019lIx, c55113xdn, scrollView, space, c55173xeu, constraintLayout2, obj != null ? C31597lwz.AEQbTJ((android.view.View) obj) : null, (C55030xcJ) objArr[20], (ConstraintLayout) objArr[10], (lIE) objArr[11], (C52794wYp) objArr[14], (ConstraintLayout) objArr[1], (ConstraintLayout) objArr[7]);
        this.hDKMBd = -1L;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) objArr[0];
        this.getNewProxyInstance = frameLayout;
        frameLayout.setTag(null);
        this.fJNWhG.setTag(null);
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
