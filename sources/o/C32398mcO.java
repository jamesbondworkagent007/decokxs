package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C32392mcI;

/* JADX INFO: renamed from: o.mcO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C32398mcO extends AbstractC32400mcQ {
    public static final ViewDataBinding.IncludedLayouts fARcdN = null;
    public static final android.util.SparseIntArray fIwbmz;
    public final android.widget.LinearLayout ejfBZ;
    public long fJNWhG;

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
        fIwbmz = sparseIntArray;
        sparseIntArray.put(C32392mcI.TaskDescription.values, 1);
        sparseIntArray.put(C32392mcI.TaskDescription.QfsBiF, 2);
        sparseIntArray.put(C32392mcI.TaskDescription.RJOkX, 3);
        sparseIntArray.put(C32392mcI.TaskDescription.fetchVPNInfo, 4);
        sparseIntArray.put(C32392mcI.TaskDescription.aKErDB, 5);
        sparseIntArray.put(C32392mcI.TaskDescription.RcXXUw, 6);
        sparseIntArray.put(C32392mcI.TaskDescription.EZpvd, 7);
        sparseIntArray.put(C32392mcI.TaskDescription.AxsJAY, 8);
        sparseIntArray.put(C32392mcI.TaskDescription.sSMYrx, 9);
        sparseIntArray.put(C32392mcI.TaskDescription.copydefault, 10);
        sparseIntArray.put(C32392mcI.TaskDescription.getNewProxyInstance, 11);
        sparseIntArray.put(C32392mcI.TaskDescription.AuCTelauCTel, 12);
        sparseIntArray.put(C32392mcI.TaskDescription.AkhnZx, 13);
        sparseIntArray.put(C32392mcI.TaskDescription.gHZMYf, 14);
        sparseIntArray.put(C32392mcI.TaskDescription.AwvSrB, 15);
    }

    public C32398mcO(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 16, fARcdN, fIwbmz));
    }

    public C32398mcO(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.LinearLayout) objArr[10], (android.widget.LinearLayout) objArr[7], (android.widget.LinearLayout) objArr[1], (android.widget.LinearLayout) objArr[4], (android.widget.LinearLayout) objArr[13], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[12], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[14], (android.widget.TextView) objArr[15], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[5]);
        this.fJNWhG = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.ejfBZ = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fJNWhG = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fJNWhG != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fJNWhG = 0L;
        }
    }
}
