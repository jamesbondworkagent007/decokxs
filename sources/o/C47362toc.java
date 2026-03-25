package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.toc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C47362toc extends AbstractC47301tnU {
    public static final android.util.SparseIntArray AhwBna;
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public final android.widget.LinearLayout AkhnZx;
    public long valueOf;

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
        sparseIntArray.put(C47315tni.TaskDescription.DQzvGN, 1);
        sparseIntArray.put(C47315tni.TaskDescription.iPSTqm, 2);
        sparseIntArray.put(C47315tni.TaskDescription.glVQsU, 3);
        sparseIntArray.put(C47315tni.TaskDescription.DcMfJKfNLfdT, 4);
        sparseIntArray.put(C47315tni.TaskDescription.RcXXUw, 5);
        sparseIntArray.put(C47315tni.TaskDescription.AuCTel, 6);
        sparseIntArray.put(C47315tni.TaskDescription.AuCTelauCTel, 7);
    }

    public C47362toc(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, gEmmrt, AhwBna));
    }

    public C47362toc(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[6], (C52794wYp) objArr[7], (wYK) objArr[5], (android.widget.LinearLayout) objArr[2], (android.widget.ScrollView) objArr[1], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[3]);
        this.valueOf = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.AkhnZx = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.valueOf = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.valueOf != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.valueOf = 0L;
        }
    }
}
