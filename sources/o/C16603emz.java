package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.emz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16603emz extends AbstractC16554emC {
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public static final android.util.SparseIntArray valueOf;
    public long fetchVPNInfo;
    public final LinearLayoutCompat isConnected;

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
        valueOf = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.sbu, 1);
        sparseIntArray.put(C13754dXa.ActionBar.zAGdSp, 2);
        sparseIntArray.put(C13754dXa.ActionBar.ComponentActivity1, 3);
        sparseIntArray.put(C13754dXa.ActionBar.getOnBackPressedDispatcher, 4);
        sparseIntArray.put(C13754dXa.ActionBar.ICustomTabsService, 5);
        sparseIntArray.put(C13754dXa.ActionBar.DdI, 6);
        sparseIntArray.put(C13754dXa.ActionBar.setContent, 7);
        sparseIntArray.put(C13754dXa.ActionBar.gSBher, 8);
    }

    public C16603emz(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, gEmmrt, valueOf));
    }

    public C16603emz(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[8], (android.widget.LinearLayout) objArr[1], (AppCompatImageView) objArr[6], (android.widget.ImageView) objArr[2], (android.widget.LinearLayout) objArr[5], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[3]);
        this.fetchVPNInfo = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.isConnected = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
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
