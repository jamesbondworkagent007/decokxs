package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.reminder.OKReminder;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.luF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31446luF extends AbstractC31442luB {
    public static final android.util.SparseIntArray AhwBna;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public long DbNXlk;

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
        sparseIntArray.put(C31351lsQ.Application.invokespecialhOMIpD, 1);
        sparseIntArray.put(C31351lsQ.Application.OAUGar, 2);
        sparseIntArray.put(C31351lsQ.Application.avCqka, 3);
        sparseIntArray.put(C31351lsQ.Application.GLcwwN, 4);
        sparseIntArray.put(C31351lsQ.Application.RcXXUw, 5);
        sparseIntArray.put(C31351lsQ.Application.djSkpj, 6);
        sparseIntArray.put(C31351lsQ.Application.QVAiDq, 7);
    }

    public C31446luF(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, valueOf, AhwBna));
    }

    public C31446luF(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[7], (ConstraintLayout) objArr[5], (C52794wYp) objArr[6], (ConstraintLayout) objArr[0], (android.widget.ImageView) objArr[1], (OKReminder) objArr[4], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[2]);
        this.DbNXlk = -1L;
        this.copydefault.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.DbNXlk = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.DbNXlk != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.DbNXlk = 0L;
        }
    }
}
