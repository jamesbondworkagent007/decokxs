package o;

import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.edit.OKEditText;
import o.C47315tni;

/* JADX INFO: renamed from: o.tnF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C47286tnF extends AbstractC47288tnH {
    public static final android.util.SparseIntArray gEmmrt;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public final android.widget.LinearLayout AkhnZx;
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
        gEmmrt = sparseIntArray;
        sparseIntArray.put(C47315tni.TaskDescription.DQYQgr, 1);
        sparseIntArray.put(C47315tni.TaskDescription.Rtjmuc, 2);
        sparseIntArray.put(C47315tni.TaskDescription.zOIQXb, 3);
        sparseIntArray.put(C47315tni.TaskDescription.aKhcqp, 4);
        sparseIntArray.put(C47315tni.TaskDescription.YFmri, 5);
        sparseIntArray.put(C47315tni.TaskDescription.gUEfcq, 6);
        sparseIntArray.put(C47315tni.TaskDescription.hlkKmr, 7);
        sparseIntArray.put(C47315tni.TaskDescription.UccSpe, 8);
    }

    public C47286tnF(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, valueOf, gEmmrt));
    }

    public C47286tnF(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[7], (C55018xby) objArr[3], (NestedScrollView) objArr[1], (C52794wYp) objArr[8], (C55018xby) objArr[2], (OKEditText) objArr[5], (android.widget.TextView) objArr[4]);
        this.fetchVPNInfo = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.AkhnZx = linearLayout;
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
