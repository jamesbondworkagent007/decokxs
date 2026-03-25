package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.edit.OKEditText;
import o.C47315tni;

/* JADX INFO: renamed from: o.tov, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C47381tov extends AbstractC47382tow {
    public static final android.util.SparseIntArray AhwBna;
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public final ConstraintLayout DbNXlk;
    public long isConnected;

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
        AhwBna = sparseIntArray;
        sparseIntArray.put(C47315tni.TaskDescription.RuDPQV, 1);
        sparseIntArray.put(C47315tni.TaskDescription.djSkpj, 2);
        sparseIntArray.put(C47315tni.TaskDescription.iZzfmt, 3);
        sparseIntArray.put(C47315tni.TaskDescription.DPHOMC, 4);
        sparseIntArray.put(C47315tni.TaskDescription.fZBcTu, 5);
        sparseIntArray.put(C47315tni.TaskDescription.dzCpvv, 6);
        sparseIntArray.put(C47315tni.TaskDescription.AxsJAYaxsJAY, 7);
        sparseIntArray.put(C47315tni.TaskDescription.UeEOUB, 8);
    }

    public C47381tov(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, gEmmrt, AhwBna));
    }

    public C47381tov(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[2], (C52794wYp) objArr[8], (android.widget.TextView) objArr[5], (android.view.View) objArr[3], (OKEditText) objArr[7], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[1]);
        this.isConnected = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.DbNXlk = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.isConnected = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.isConnected != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.isConnected = 0L;
        }
    }
}
