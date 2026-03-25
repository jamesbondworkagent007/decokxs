package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C47501trL;

/* JADX INFO: loaded from: classes10.dex */
public class tNG extends tNH {
    public static final android.util.SparseIntArray AuCTelauCTel;
    public static final ViewDataBinding.IncludedLayouts zsXlph = null;
    public final ConstraintLayout AubY;
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
        AuCTelauCTel = sparseIntArray;
        sparseIntArray.put(C47501trL.TaskDescription.OeawrH, 1);
        sparseIntArray.put(C47501trL.TaskDescription.OKvQBs, 2);
        sparseIntArray.put(C47501trL.TaskDescription.DCUTEIddSDPG, 3);
        sparseIntArray.put(C47501trL.TaskDescription.OeZisf, 4);
        sparseIntArray.put(C47501trL.TaskDescription.resume, 5);
        sparseIntArray.put(C47501trL.TaskDescription.hcetpZ, 6);
        sparseIntArray.put(C47501trL.TaskDescription.aUsmxb, 7);
        sparseIntArray.put(C47501trL.TaskDescription.UlJrfe, 8);
        sparseIntArray.put(C47501trL.TaskDescription.QwvEab, 9);
        sparseIntArray.put(C47501trL.TaskDescription.DcMfJKDDUqPf, 10);
        sparseIntArray.put(C47501trL.TaskDescription.getUserContextRegisteredStatus, 11);
        sparseIntArray.put(C47501trL.TaskDescription.zeUYeG, 12);
        sparseIntArray.put(C47501trL.TaskDescription.reset, 13);
        sparseIntArray.put(C47501trL.TaskDescription.atDTRm, 14);
        sparseIntArray.put(C47501trL.TaskDescription.v, 15);
        sparseIntArray.put(C47501trL.TaskDescription.aKhcqp, 16);
        sparseIntArray.put(C47501trL.TaskDescription.zDGrpR, 17);
        sparseIntArray.put(C47501trL.TaskDescription.gBtXYZ, 18);
        sparseIntArray.put(C47501trL.TaskDescription.deregisterUser, 19);
        sparseIntArray.put(C47501trL.TaskDescription.clearRegistrations, 20);
        sparseIntArray.put(C47501trL.TaskDescription.aeJQwa, 21);
        sparseIntArray.put(C47501trL.TaskDescription.dzkkkq, 22);
        sparseIntArray.put(C47501trL.TaskDescription.dPnHjp, 23);
        sparseIntArray.put(C47501trL.TaskDescription.sIqKDg, 24);
        sparseIntArray.put(C47501trL.TaskDescription.zEHIKV, 25);
    }

    public tNG(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 26, zsXlph, AuCTelauCTel));
    }

    public tNG(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[8], (android.widget.LinearLayout) objArr[7], (android.widget.TextView) objArr[9], (tUG) objArr[3], (Guideline) objArr[13], (android.widget.TextView) objArr[16], (android.widget.TextView) objArr[23], (android.widget.TextView) objArr[14], (android.widget.TextView) objArr[22], (android.widget.TextView) objArr[18], (android.widget.TextView) objArr[19], (android.view.View) objArr[11], (android.widget.TextView) objArr[10], (android.widget.TextView) objArr[17], (android.widget.TextView) objArr[25], (android.widget.TextView) objArr[15], (android.widget.TextView) objArr[24], (android.widget.TextView) objArr[20], (android.widget.TextView) objArr[21], (android.widget.TextView) objArr[12], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[6], (android.widget.ImageView) objArr[2], (android.widget.RelativeLayout) objArr[1], (android.widget.TextView) objArr[4]);
        this.wlaJM = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AubY = constraintLayout;
        constraintLayout.setTag(null);
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
