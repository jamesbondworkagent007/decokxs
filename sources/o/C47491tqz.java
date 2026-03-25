package o;

import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.tqz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C47491tqz extends AbstractC47440tqA {
    public static final android.util.SparseIntArray AkhnZx;
    public static final ViewDataBinding.IncludedLayouts fetchVPNInfo = null;
    public final NestedScrollView DbNXlk;
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
        AkhnZx = sparseIntArray;
        sparseIntArray.put(C47315tni.TaskDescription.DCJXGO, 1);
        sparseIntArray.put(C47315tni.TaskDescription.UhxbNG, 2);
        sparseIntArray.put(C47315tni.TaskDescription.onComplete, 3);
        sparseIntArray.put(C47315tni.TaskDescription.DcMfJKDGTeJD, 4);
        sparseIntArray.put(C47315tni.TaskDescription.gsvlRV, 5);
        sparseIntArray.put(C47315tni.TaskDescription.DcMfJKDCKfqPDCfLja, 6);
        sparseIntArray.put(C47315tni.TaskDescription.DcMfJKDIADVb, 7);
        sparseIntArray.put(C47315tni.TaskDescription.sbu, 8);
        sparseIntArray.put(C47315tni.TaskDescription.DcMfJKDDUqPf, 9);
        sparseIntArray.put(C47315tni.TaskDescription.hlXVux, 10);
    }

    public C47491tqz(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, fetchVPNInfo, AkhnZx));
    }

    public C47491tqz(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.LinearLayout) objArr[1], (android.widget.RelativeLayout) objArr[2], (android.widget.TextView) objArr[10], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[8], (android.view.View) objArr[5]);
        this.isConnected = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.DbNXlk = nestedScrollView;
        nestedScrollView.setTag(null);
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
