package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C32392mcI;

/* JADX INFO: renamed from: o.mcH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C32391mcH extends AbstractC32393mcJ {
    public static final android.util.SparseIntArray getNewProxyInstance;
    public static final ViewDataBinding.IncludedLayouts hDKMBd = null;
    public long getFieldNames;
    public final android.widget.LinearLayout iwGUEr;

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
        getNewProxyInstance = sparseIntArray;
        sparseIntArray.put(C32392mcI.TaskDescription.gEmmrt, 1);
        sparseIntArray.put(C32392mcI.TaskDescription.hDKMBd, 2);
        sparseIntArray.put(C32392mcI.TaskDescription.QOLQEE, 3);
        sparseIntArray.put(C32392mcI.TaskDescription.isConnected, 4);
        sparseIntArray.put(C32392mcI.TaskDescription.iwGUEr, 5);
        sparseIntArray.put(C32392mcI.TaskDescription.QVAiDq, 6);
        sparseIntArray.put(C32392mcI.TaskDescription.djBIcL, 7);
        sparseIntArray.put(C32392mcI.TaskDescription.AuCTel, 8);
        sparseIntArray.put(C32392mcI.TaskDescription.OcIXYQ, 9);
        sparseIntArray.put(C32392mcI.TaskDescription.AhwBna, 10);
        sparseIntArray.put(C32392mcI.TaskDescription.ejfBZ, 11);
        sparseIntArray.put(C32392mcI.TaskDescription.DTwDnp, 12);
        sparseIntArray.put(C32392mcI.TaskDescription.valueOf, 13);
        sparseIntArray.put(C32392mcI.TaskDescription.fARcdN, 14);
        sparseIntArray.put(C32392mcI.TaskDescription.QKVWgx, 15);
        sparseIntArray.put(C32392mcI.TaskDescription.AkhnZx, 16);
        sparseIntArray.put(C32392mcI.TaskDescription.getFieldNames, 17);
        sparseIntArray.put(C32392mcI.TaskDescription.djSkpj, 18);
        sparseIntArray.put(C32392mcI.TaskDescription.OLrzqt, 19);
        sparseIntArray.put(C32392mcI.TaskDescription.fIwbmz, 20);
        sparseIntArray.put(C32392mcI.TaskDescription.uzCIH, 21);
    }

    public C32391mcH(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 22, hDKMBd, getNewProxyInstance));
    }

    public C32391mcH(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.LinearLayout) objArr[19], (android.widget.LinearLayout) objArr[13], (android.widget.LinearLayout) objArr[10], (android.widget.LinearLayout) objArr[7], (android.widget.LinearLayout) objArr[1], (android.widget.LinearLayout) objArr[4], (android.widget.LinearLayout) objArr[16], (android.widget.TextView) objArr[20], (android.widget.TextView) objArr[21], (android.widget.TextView) objArr[14], (android.widget.TextView) objArr[15], (android.widget.TextView) objArr[12], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[18], (android.widget.TextView) objArr[17]);
        this.getFieldNames = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.iwGUEr = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.getFieldNames = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.getFieldNames != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.getFieldNames = 0L;
        }
    }
}
