package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eoC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16660eoC extends AbstractC16706eow {
    public static final ViewDataBinding.IncludedLayouts AYXKKw = null;
    public static final android.util.SparseIntArray AhwBna;
    public final LinearLayoutCompat isConnected;
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
        sparseIntArray.put(C13754dXa.ActionBar.getPlaybackInfo, 1);
        sparseIntArray.put(C13754dXa.ActionBar.DXXBbs, 2);
        sparseIntArray.put(C13754dXa.ActionBar.CheckResult, 3);
        sparseIntArray.put(C13754dXa.ActionBar.getRatingType, 4);
        sparseIntArray.put(C13754dXa.ActionBar.sGvRiA, 5);
        sparseIntArray.put(C13754dXa.ActionBar.flag, 6);
        sparseIntArray.put(C13754dXa.ActionBar.aVPvww, 7);
    }

    public C16660eoC(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, AYXKKw, AhwBna));
    }

    public C16660eoC(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[2], (android.widget.ImageView) objArr[7], (LinearLayoutCompat) objArr[5], (RecyclerView) objArr[4], (AppCompatImageView) objArr[1], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[6]);
        this.valueOf = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.isConnected = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
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
