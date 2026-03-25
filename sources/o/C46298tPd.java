package o;

import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C47501trL;

/* JADX INFO: renamed from: o.tPd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C46298tPd extends AbstractC46299tPe {
    public static final ViewDataBinding.IncludedLayouts AubY = null;
    public static final android.util.SparseIntArray zLjUOn;
    public long wlaJM;

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
        sparseIntArray.put(C47501trL.TaskDescription.DXXBbs, 1);
        sparseIntArray.put(C47501trL.TaskDescription.DQYQgr, 2);
        sparseIntArray.put(C47501trL.TaskDescription.UccSpe, 3);
        sparseIntArray.put(C47501trL.TaskDescription.putInt, 4);
        sparseIntArray.put(C47501trL.TaskDescription.RckOJh, 5);
        sparseIntArray.put(C47501trL.TaskDescription.HJWChPfvRMlC, 6);
        sparseIntArray.put(C47501trL.TaskDescription.HJWChP, 7);
        sparseIntArray.put(C47501trL.TaskDescription.fQQVvf, 8);
        sparseIntArray.put(C47501trL.TaskDescription.zlvcHA, 9);
        sparseIntArray.put(C47501trL.TaskDescription.OFhtUX, 10);
        sparseIntArray.put(C47501trL.TaskDescription.DjwCMv, 11);
        sparseIntArray.put(C47501trL.TaskDescription.HJWChPOKBmQNaCIdOM, 12);
        sparseIntArray.put(C47501trL.TaskDescription.HJWChPOKBmQN, 13);
        sparseIntArray.put(C47501trL.TaskDescription.OcIXYQ, 14);
        sparseIntArray.put(C47501trL.TaskDescription.abAflu, 15);
        sparseIntArray.put(C47501trL.TaskDescription.getSerial, 16);
        sparseIntArray.put(C47501trL.TaskDescription.ikIEnW, 17);
        sparseIntArray.put(C47501trL.TaskDescription.HJWChPOZOJIj, 18);
        sparseIntArray.put(C47501trL.TaskDescription.fDu, 19);
        sparseIntArray.put(C47501trL.TaskDescription.YFmri, 20);
        sparseIntArray.put(C47501trL.TaskDescription.ibnZAm, 21);
        sparseIntArray.put(C47501trL.TaskDescription.HJWChPRAkuRW, 22);
        sparseIntArray.put(C47501trL.TaskDescription.Rtjmuc, 23);
        sparseIntArray.put(C47501trL.TaskDescription.RSmiaq, 24);
        sparseIntArray.put(C47501trL.TaskDescription.RWIpjU, 25);
        sparseIntArray.put(C47501trL.TaskDescription.registerUser, 26);
    }

    public C46298tPd(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 27, AubY, zLjUOn));
    }

    public C46298tPd(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.LinearLayout) objArr[14], (android.widget.LinearLayout) objArr[1], (CardView) objArr[0], (C46496tWm) objArr[10], (ConstraintLayout) objArr[9], (android.widget.LinearLayout) objArr[2], (android.widget.ImageView) objArr[3], (android.widget.LinearLayout) objArr[20], (android.widget.LinearLayout) objArr[23], (C55113xdn) objArr[26], (android.widget.LinearLayout) objArr[15], (C45996tDz) objArr[5], (C45996tDz) objArr[8], (C52794wYp) objArr[7], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[18], (android.widget.TextView) objArr[19], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[13], (android.widget.TextView) objArr[12], (android.widget.TextView) objArr[21], (android.widget.TextView) objArr[24], (android.widget.TextView) objArr[22], (android.widget.TextView) objArr[25], (android.widget.TextView) objArr[16], (android.widget.TextView) objArr[17], (android.widget.TextView) objArr[6]);
        this.wlaJM = -1L;
        this.EZpvd.setTag(null);
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
