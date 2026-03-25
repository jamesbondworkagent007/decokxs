package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.uilab.item.OKRegularCell;
import o.C43084ric;

/* JADX INFO: renamed from: o.rip, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C43097rip extends AbstractC43098riq {
    public static final ViewDataBinding.IncludedLayouts ejfBZ = null;
    public static final android.util.SparseIntArray getFieldNames;
    public final android.widget.LinearLayout getNewProxyInstance;
    public long iwGUEr;

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
        sparseIntArray.put(C43084ric.TaskDescription.EZpvd, 1);
        sparseIntArray.put(C43084ric.TaskDescription.AEQbTJ, 2);
        sparseIntArray.put(C43084ric.TaskDescription.valueOf, 3);
        sparseIntArray.put(C43084ric.TaskDescription.AhwBna, 4);
        sparseIntArray.put(C43084ric.TaskDescription.djBIcL, 5);
        sparseIntArray.put(C43084ric.TaskDescription.gEmmrt, 6);
        sparseIntArray.put(C43084ric.TaskDescription.OLrzqt, 7);
        sparseIntArray.put(C43084ric.TaskDescription.getNewProxyInstance, 8);
        sparseIntArray.put(C43084ric.TaskDescription.ejfBZ, 9);
        sparseIntArray.put(C43084ric.TaskDescription.fetchVPNInfo, 10);
        sparseIntArray.put(C43084ric.TaskDescription.isConnected, 11);
        sparseIntArray.put(C43084ric.TaskDescription.DbNXlk, 12);
        sparseIntArray.put(C43084ric.TaskDescription.AYXKKw, 13);
        sparseIntArray.put(C43084ric.TaskDescription.values, 14);
        sparseIntArray.put(C43084ric.TaskDescription.fIwbmz, 15);
        sparseIntArray.put(C43084ric.TaskDescription.AuCTel, 16);
        sparseIntArray.put(C43084ric.TaskDescription.iwGUEr, 17);
        sparseIntArray.put(C43084ric.TaskDescription.fJNWhG, 18);
        sparseIntArray.put(C43084ric.TaskDescription.uzCIH, 19);
    }

    public C43097rip(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 20, ejfBZ, getFieldNames));
    }

    public C43097rip(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (OKRegularCell) objArr[7], (android.widget.ImageView) objArr[1], (android.widget.TextView) objArr[2], (ConstraintLayout) objArr[3], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[6], (C55251xgS) objArr[5], (C55239xgG) objArr[13], (C55239xgG) objArr[12], (C55239xgG) objArr[11], (C55239xgG) objArr[10], (OKRegularCell) objArr[14], (OKRegularCell) objArr[15], (C55239xgG) objArr[9], (OKRegularCell) objArr[16], (C55241xgI) objArr[18], (RecyclerView) objArr[19], (C55239xgG) objArr[17], (OKRegularCell) objArr[8]);
        this.iwGUEr = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.getNewProxyInstance = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.iwGUEr = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.iwGUEr != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.iwGUEr = 0L;
        }
    }
}
