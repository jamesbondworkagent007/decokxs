package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.trl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C47527trl extends AbstractC47526trk {
    public static final android.util.SparseIntArray AkhnZx;
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public long fARcdN;

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
        AkhnZx = sparseIntArray;
        sparseIntArray.put(C47315tni.TaskDescription.QIZEnU, 1);
        sparseIntArray.put(C47315tni.TaskDescription.DGUQLIDGUQLI, 2);
        sparseIntArray.put(C47315tni.TaskDescription.DTg, 3);
        sparseIntArray.put(C47315tni.TaskDescription.zSsVtY, 4);
        sparseIntArray.put(C47315tni.TaskDescription.DGUQLIekVPG, 5);
        sparseIntArray.put(C47315tni.TaskDescription.fBE, 6);
        sparseIntArray.put(C47315tni.TaskDescription.DGUQLIdZmdUa, 7);
        sparseIntArray.put(C47315tni.TaskDescription.DSiOMJ, 8);
        sparseIntArray.put(C47315tni.TaskDescription.DUUtXg, 9);
        sparseIntArray.put(C47315tni.TaskDescription.DIIpTV, 10);
        sparseIntArray.put(C47315tni.TaskDescription.DrqXHJ, 11);
        sparseIntArray.put(C47315tni.TaskDescription.frkDMe, 12);
    }

    public C47527trl(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, isConnected, AkhnZx));
    }

    public C47527trl(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.LinearLayout) objArr[0], (android.widget.TextView) objArr[1], (android.widget.ToggleButton) objArr[3], (android.widget.ToggleButton) objArr[4], (android.widget.ToggleButton) objArr[5], (android.widget.ToggleButton) objArr[6], (android.widget.ToggleButton) objArr[7], (android.widget.ToggleButton) objArr[8], (android.widget.ToggleButton) objArr[9], (android.widget.TextView) objArr[10], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[12], (android.widget.LinearLayout) objArr[2]);
        this.fARcdN = -1L;
        this.copydefault.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fARcdN = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fARcdN != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fARcdN = 0L;
        }
    }
}
