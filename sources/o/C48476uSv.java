package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uSv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48476uSv extends AbstractC48475uSu {
    public static final ViewDataBinding.IncludedLayouts getNewProxyInstance = null;
    public static final android.util.SparseIntArray hDKMBd;
    public long getFieldNames;
    public final android.widget.LinearLayout iwGUEr;

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
        hDKMBd = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.postOrRun, 1);
        sparseIntArray.put(C48033uCm.Application.ICustomTabsCallback, 2);
        sparseIntArray.put(C48033uCm.Application.jNexW, 3);
        sparseIntArray.put(C48033uCm.Application.applyOptions, 4);
        sparseIntArray.put(C48033uCm.Application.fbC, 5);
        sparseIntArray.put(C48033uCm.Application.notifyNotificationWithChannel, 6);
        sparseIntArray.put(C48033uCm.Application.aPFruk, 7);
        sparseIntArray.put(C48033uCm.Application.setSubscription, 8);
        sparseIntArray.put(C48033uCm.Application.hasWindowFeature, 9);
        sparseIntArray.put(C48033uCm.Application.svUkWZ, 10);
        sparseIntArray.put(C48033uCm.Application.attachBaseContext2, 11);
        sparseIntArray.put(C48033uCm.Application.dXhJGx, 12);
        sparseIntArray.put(C48033uCm.Application.DaRZkR, 13);
        sparseIntArray.put(C48033uCm.Application.UJpkuA, 14);
        sparseIntArray.put(C48033uCm.Application.dispatchMenuVisibilityChanged, 15);
        sparseIntArray.put(C48033uCm.Application.putString, 16);
        sparseIntArray.put(C48033uCm.Application.onScrollChanged, 17);
        sparseIntArray.put(C48033uCm.Application.getMinimumWidth, 18);
        sparseIntArray.put(C48033uCm.Application.NavItemSelectedListener, 19);
        sparseIntArray.put(C48033uCm.Application.setOnDismissListener, 20);
    }

    public C48476uSv(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 21, getNewProxyInstance, hDKMBd));
    }

    public C48476uSv(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C53539wnR) objArr[13], (wYK) objArr[5], (ConstraintLayout) objArr[3], (android.widget.TextView) objArr[14], (android.widget.FrameLayout) objArr[7], (C53539wnR) objArr[12], (C47988uAv) objArr[10], (C47988uAv) objArr[2], (C55320xhi) objArr[6], (C50191vFg) objArr[1], (android.widget.LinearLayout) objArr[4], (android.widget.LinearLayout) objArr[8], (vKO) objArr[16], (vKO) objArr[17], (vKO) objArr[15], (android.widget.TextView) objArr[20], (android.widget.TextView) objArr[11], (C55258xgZ) objArr[9], (android.widget.TextView) objArr[19], (C54154wyx) objArr[18]);
        this.getFieldNames = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.iwGUEr = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.getFieldNames = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.getFieldNames != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.getFieldNames = 0L;
        }
    }
}
