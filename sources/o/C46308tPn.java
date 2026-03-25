package o;

import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C47501trL;

/* JADX INFO: renamed from: o.tPn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C46308tPn extends AbstractC46305tPk {
    public static final ViewDataBinding.IncludedLayouts AubY = null;
    public static final android.util.SparseIntArray zsXlph;
    public long zLjUOn;

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
        zsXlph = sparseIntArray;
        sparseIntArray.put(C47501trL.TaskDescription.DXXBbs, 1);
        sparseIntArray.put(C47501trL.TaskDescription.DQYQgr, 2);
        sparseIntArray.put(C47501trL.TaskDescription.UccSpe, 3);
        sparseIntArray.put(C47501trL.TaskDescription.putInt, 4);
        sparseIntArray.put(C47501trL.TaskDescription.HJWChPQPAeHI, 5);
        sparseIntArray.put(C47501trL.TaskDescription.HJWChP, 6);
        sparseIntArray.put(C47501trL.TaskDescription.zlvcHA, 7);
        sparseIntArray.put(C47501trL.TaskDescription.OFhtUX, 8);
        sparseIntArray.put(C47501trL.TaskDescription.DjwCMv, 9);
        sparseIntArray.put(C47501trL.TaskDescription.HJWChPOKBmQNaCIdOM, 10);
        sparseIntArray.put(C47501trL.TaskDescription.HJWChPOKBmQN, 11);
        sparseIntArray.put(C47501trL.TaskDescription.OcIXYQ, 12);
        sparseIntArray.put(C47501trL.TaskDescription.abAflu, 13);
        sparseIntArray.put(C47501trL.TaskDescription.getSerial, 14);
        sparseIntArray.put(C47501trL.TaskDescription.ikIEnW, 15);
        sparseIntArray.put(C47501trL.TaskDescription.HJWChPOZOJIj, 16);
        sparseIntArray.put(C47501trL.TaskDescription.fDu, 17);
        sparseIntArray.put(C47501trL.TaskDescription.YFmri, 18);
        sparseIntArray.put(C47501trL.TaskDescription.ibnZAm, 19);
        sparseIntArray.put(C47501trL.TaskDescription.HJWChPRAkuRW, 20);
        sparseIntArray.put(C47501trL.TaskDescription.Rtjmuc, 21);
        sparseIntArray.put(C47501trL.TaskDescription.RSmiaq, 22);
        sparseIntArray.put(C47501trL.TaskDescription.RWIpjU, 23);
        sparseIntArray.put(C47501trL.TaskDescription.hwkNQP, 24);
        sparseIntArray.put(C47501trL.TaskDescription.registerUser, 25);
    }

    public C46308tPn(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 26, AubY, zsXlph));
    }

    public C46308tPn(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.LinearLayout) objArr[12], (android.widget.LinearLayout) objArr[1], (CardView) objArr[0], (C46496tWm) objArr[8], (ConstraintLayout) objArr[7], (android.widget.LinearLayout) objArr[2], (android.widget.ImageView) objArr[3], (android.widget.LinearLayout) objArr[18], (android.widget.LinearLayout) objArr[21], (C55113xdn) objArr[25], (android.widget.LinearLayout) objArr[13], (C52794wYp) objArr[6], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[24], (android.widget.TextView) objArr[16], (android.widget.TextView) objArr[17], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[10], (C55251xgS) objArr[5], (android.widget.TextView) objArr[19], (android.widget.TextView) objArr[22], (android.widget.TextView) objArr[20], (android.widget.TextView) objArr[23], (android.widget.TextView) objArr[14], (android.widget.TextView) objArr[15]);
        this.zLjUOn = -1L;
        this.KWHzl.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.zLjUOn = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.zLjUOn != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.zLjUOn = 0L;
        }
    }
}
