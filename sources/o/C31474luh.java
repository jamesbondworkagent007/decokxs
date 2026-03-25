package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.reminder.OKReminder;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.luh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31474luh extends AbstractC31472luf {
    public static final android.util.SparseIntArray DbNXlk;
    public static final ViewDataBinding.IncludedLayouts fetchVPNInfo = null;
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
        DbNXlk = sparseIntArray;
        sparseIntArray.put(C31351lsQ.Application.DjwCMv, 1);
        sparseIntArray.put(C31351lsQ.Application.hDKMBd, 2);
        sparseIntArray.put(C31351lsQ.Application.fIwbmz, 3);
        sparseIntArray.put(C31351lsQ.Application.GiPPlLRPuVlr, 4);
        sparseIntArray.put(C31351lsQ.Application.AubY, 5);
        sparseIntArray.put(C31351lsQ.Application.Ohcwxs, 6);
        sparseIntArray.put(C31351lsQ.Application.OeawrHRnVkix, 7);
        sparseIntArray.put(C31351lsQ.Application.gvFztT, 8);
        sparseIntArray.put(C31351lsQ.Application.HJWChPQdUnVm, 9);
        sparseIntArray.put(C31351lsQ.Application.ibnZAm, 10);
        sparseIntArray.put(C31351lsQ.Application.itxZVF, 11);
        sparseIntArray.put(C31351lsQ.Application.UJpkuA, 12);
    }

    public C31474luh(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, fetchVPNInfo, DbNXlk));
    }

    public C31474luh(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[3], (ConstraintLayout) objArr[2], (ConstraintLayout) objArr[5], (ConstraintLayout) objArr[0], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[11], (ConstraintLayout) objArr[9], (android.widget.TextView) objArr[10], (android.widget.TextView) objArr[8], (ConstraintLayout) objArr[6], (android.widget.TextView) objArr[7], (OKReminder) objArr[12]);
        this.fJNWhG = -1L;
        this.AEQbTJ.setTag(null);
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
