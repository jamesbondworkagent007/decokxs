package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.reminder.OKReminder;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uPz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48397uPz extends AbstractC48394uPw {
    public static final android.util.SparseIntArray iwGUEr;
    public static final ViewDataBinding.IncludedLayouts uzCIH = null;
    public long getFieldNames;
    public final NestedScrollView getNewProxyInstance;

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
        iwGUEr = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.getPlaybackType, 1);
        sparseIntArray.put(C48033uCm.Application.AlertController3, 2);
        sparseIntArray.put(C48033uCm.Application.setMediaId, 3);
        sparseIntArray.put(C48033uCm.Application.initDelegate, 4);
        sparseIntArray.put(C48033uCm.Application.fVBECu, 5);
        sparseIntArray.put(C48033uCm.Application.jNexW, 6);
        sparseIntArray.put(C48033uCm.Application.applyOptions, 7);
        sparseIntArray.put(C48033uCm.Application.fbC, 8);
        sparseIntArray.put(C48033uCm.Application.notifyNotificationWithChannel, 9);
        sparseIntArray.put(C48033uCm.Application.aPFruk, 10);
        sparseIntArray.put(C48033uCm.Application.setSubscription, 11);
        sparseIntArray.put(C48033uCm.Application.hasWindowFeature, 12);
        sparseIntArray.put(C48033uCm.Application.svUkWZ, 13);
        sparseIntArray.put(C48033uCm.Application.attachBaseContext2, 14);
        sparseIntArray.put(C48033uCm.Application.dXhJGx, 15);
        sparseIntArray.put(C48033uCm.Application.DtA, 16);
        sparseIntArray.put(C48033uCm.Application.compare, 17);
        sparseIntArray.put(C48033uCm.Application.dispatchMenuVisibilityChanged, 18);
        sparseIntArray.put(C48033uCm.Application.setOnDismissListener, 19);
        sparseIntArray.put(C48033uCm.Application.RequiresApi, 20);
    }

    public C48397uPz(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 21, uzCIH, iwGUEr));
    }

    public C48397uPz(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (wYK) objArr[8], (ConstraintLayout) objArr[6], (android.widget.TextView) objArr[17], (android.widget.FrameLayout) objArr[10], (C53539wnR) objArr[15], (C53539wnR) objArr[16], (C47988uAv) objArr[13], (C47988uAv) objArr[5], (C55320xhi) objArr[9], (android.widget.LinearLayout) objArr[7], (android.widget.LinearLayout) objArr[11], (C55372xih) objArr[3], (OKReminder) objArr[1], (android.view.View) objArr[20], (vKO) objArr[18], (android.widget.TextView) objArr[19], (C55258xgZ) objArr[4], (android.widget.TextView) objArr[14], (C55258xgZ) objArr[12], (android.widget.TextView) objArr[2]);
        this.getFieldNames = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.getNewProxyInstance = nestedScrollView;
        nestedScrollView.setTag(null);
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
