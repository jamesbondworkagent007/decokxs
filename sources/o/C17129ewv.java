package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ewv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C17129ewv extends AbstractC17132ewy {
    public static final android.util.SparseIntArray AkhnZx;
    public static final ViewDataBinding.IncludedLayouts DbNXlk = null;
    public final ConstraintLayout fetchVPNInfo;
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
        sparseIntArray.put(C13754dXa.ActionBar.ComponentActivity1, 1);
        sparseIntArray.put(C13754dXa.ActionBar.WFXFk, 2);
        sparseIntArray.put(C13754dXa.ActionBar.ComponentActivityReportFullyDrawnExecutorApi1, 3);
        sparseIntArray.put(C13754dXa.ActionBar.ComponentActivityApi33Impl, 4);
        sparseIntArray.put(C13754dXa.ActionBar.ComponentActivityApi19Impl, 5);
        sparseIntArray.put(C13754dXa.ActionBar.MediaSessionCompatCallbackStubApi23, 6);
        sparseIntArray.put(C13754dXa.ActionBar.UkuJRw, 7);
        sparseIntArray.put(C13754dXa.ActionBar.peekAvailableContext, 8);
        sparseIntArray.put(C13754dXa.ActionBar.removeMenuProvider, 9);
        sparseIntArray.put(C13754dXa.ActionBar.registerForActivityResult, 10);
        sparseIntArray.put(C13754dXa.ActionBar.DGOPHZDGOPHZ, 11);
    }

    public C17129ewv(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, DbNXlk, AkhnZx));
    }

    public C17129ewv(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.view.View) objArr[11], (android.widget.LinearLayout) objArr[7], (android.widget.LinearLayout) objArr[2], (android.view.View) objArr[6], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[10], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[3]);
        this.isConnected = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fetchVPNInfo = constraintLayout;
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
