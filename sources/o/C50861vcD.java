package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vcD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50861vcD extends AbstractC50907vcx {
    public static final android.util.SparseIntArray DbNXlk;
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public long values;

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
        DbNXlk = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.onTitleChanged, 2);
        sparseIntArray.put(C48033uCm.Application.onNightModeChanged, 3);
        sparseIntArray.put(C48033uCm.Application.INotificationSideChannelDefault, 4);
        sparseIntArray.put(C48033uCm.Application.dGgpab, 5);
        sparseIntArray.put(C48033uCm.Application.MediaBrowserCompatSubscriptionCallback, 6);
        sparseIntArray.put(C48033uCm.Application.setSupportActionBar, 7);
        sparseIntArray.put(C48033uCm.Application.onChildrenLoaded, 8);
        sparseIntArray.put(C48033uCm.Application.onSupportActionModeFinished, 9);
        sparseIntArray.put(C48033uCm.Application.isEmpty, 10);
        sparseIntArray.put(C48033uCm.Application.onSupportNavigateUp, 11);
    }

    public C50861vcD(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 12, isConnected, DbNXlk));
    }

    public C50861vcD(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (android.widget.HorizontalScrollView) objArr[5], (android.widget.ImageView) objArr[4], (android.widget.LinearLayout) objArr[8], (android.widget.LinearLayout) objArr[10], (android.widget.LinearLayout) objArr[6], (android.widget.FrameLayout) objArr[1], (android.widget.TableLayout) objArr[0], (C55251xgS) objArr[3], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[7]);
        this.values = -1L;
        this.AYXKKw.setTag(null);
        this.valueOf.setTag(null);
        setRootTag(viewArr);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.values = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.values != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.values = 0L;
        }
    }
}
