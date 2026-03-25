package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.elN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16512elN extends AbstractC16513elO {
    public static final ViewDataBinding.IncludedLayouts AYXKKw = null;
    public static final android.util.SparseIntArray gEmmrt;
    public long djBIcL;
    public final android.widget.LinearLayout values;

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
        sparseIntArray.put(C13754dXa.ActionBar.stop, 1);
        sparseIntArray.put(C13754dXa.ActionBar.validateCustomAction, 2);
        sparseIntArray.put(C13754dXa.ActionBar.IMediaSessionStubProxy, 3);
        sparseIntArray.put(C13754dXa.ActionBar.skipToQueueItem, 4);
        sparseIntArray.put(C13754dXa.ActionBar.ffGIBT, 5);
        sparseIntArray.put(C13754dXa.ActionBar.QHmsKR, 6);
        sparseIntArray.put(C13754dXa.ActionBar.fkESqH, 7);
    }

    public C16512elN(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, AYXKKw, gEmmrt));
    }

    public C16512elN(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C57422yiC) objArr[5], (C57508yjj) objArr[6], (C57468yiw) objArr[7], (android.view.View) objArr[4], (AppCompatImageView) objArr[1], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[2]);
        this.djBIcL = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.values = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.djBIcL = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.djBIcL != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.djBIcL = 0L;
        }
    }
}
