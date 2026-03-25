package o;

import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.enm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16643enm extends AbstractC16639eni {
    public static final ViewDataBinding.IncludedLayouts fARcdN = null;
    public static final android.util.SparseIntArray fIwbmz;
    public final android.widget.LinearLayout AuCTel;
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
        fIwbmz = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.ensureClassLoader, 1);
        sparseIntArray.put(C13754dXa.ActionBar.setErrorMessage, 2);
        sparseIntArray.put(C13754dXa.ActionBar.getCustomAction, 3);
        sparseIntArray.put(C13754dXa.ActionBar.StringDef, 4);
        sparseIntArray.put(C13754dXa.ActionBar.ReportDrawnAfter, 5);
        sparseIntArray.put(C13754dXa.ActionBar.HJWChPfrwjPh, 6);
        sparseIntArray.put(C13754dXa.ActionBar.remove, 7);
        sparseIntArray.put(C13754dXa.ActionBar.getResultCode, 8);
        sparseIntArray.put(C13754dXa.ActionBar.GVpNrsfQMcgE, 9);
        sparseIntArray.put(C13754dXa.ActionBar.GuardedBy, 10);
        sparseIntArray.put(C13754dXa.ActionBar.IntentSenderRequestBuilder, 11);
        sparseIntArray.put(C13754dXa.ActionBar.SUwuXE, 12);
        sparseIntArray.put(C13754dXa.ActionBar.multiple, 13);
        sparseIntArray.put(C13754dXa.ActionBar.ArrayRes, 14);
        sparseIntArray.put(C13754dXa.ActionBar.fhwtiV, 15);
        sparseIntArray.put(C13754dXa.ActionBar.tIwhY, 16);
    }

    public C16643enm(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 17, fARcdN, fIwbmz));
    }

    public C16643enm(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[16], (Group) objArr[6], (android.widget.ImageView) objArr[12], (C55030xcJ) objArr[15], (android.view.View) objArr[9], (NestedScrollView) objArr[1], (C57431yiL) objArr[2], (C57524yjz) objArr[3], (android.widget.TextView) objArr[7], (C57461yip) objArr[5], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[14], (android.widget.TextView) objArr[10], (android.view.View) objArr[4], (android.view.View) objArr[13]);
        this.fJNWhG = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.AuCTel = linearLayout;
        linearLayout.setTag(null);
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
