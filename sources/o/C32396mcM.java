package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C32392mcI;

/* JADX INFO: renamed from: o.mcM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C32396mcM extends AbstractC32394mcK {
    public static final android.util.SparseIntArray DbNXlk;
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public final android.widget.LinearLayout fIwbmz;
    public long fetchVPNInfo;

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
        DbNXlk = sparseIntArray;
        sparseIntArray.put(C32392mcI.TaskDescription.AYXKKw, 1);
        sparseIntArray.put(C32392mcI.TaskDescription.ORxRYg, 2);
        sparseIntArray.put(C32392mcI.TaskDescription.zuBGHE, 3);
        sparseIntArray.put(C32392mcI.TaskDescription.AEQbTJ, 4);
        sparseIntArray.put(C32392mcI.TaskDescription.wlaJM, 5);
        sparseIntArray.put(C32392mcI.TaskDescription.zLjUOn, 6);
        sparseIntArray.put(C32392mcI.TaskDescription.KWHzl, 7);
        sparseIntArray.put(C32392mcI.TaskDescription.AubY, 8);
        sparseIntArray.put(C32392mcI.TaskDescription.zsXlph, 9);
        sparseIntArray.put(C32392mcI.TaskDescription.DbNXlk, 10);
        sparseIntArray.put(C32392mcI.TaskDescription.QbewEr, 11);
        sparseIntArray.put(C32392mcI.TaskDescription.QUSxYX, 12);
    }

    public C32396mcM(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, isConnected, DbNXlk));
    }

    public C32396mcM(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.LinearLayout) objArr[4], (android.widget.LinearLayout) objArr[7], (android.widget.LinearLayout) objArr[1], (android.widget.LinearLayout) objArr[10], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[12], (android.widget.TextView) objArr[11]);
        this.fetchVPNInfo = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.fIwbmz = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fetchVPNInfo = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fetchVPNInfo != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fetchVPNInfo = 0L;
        }
    }
}
