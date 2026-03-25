package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.reminder.OKReminder;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uTy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48506uTy extends AbstractC48500uTs {
    public static final ViewDataBinding.IncludedLayouts uzCIH = null;
    public static final android.util.SparseIntArray zsXlph;
    public long AuCTelauCTel;
    public final NestedScrollView zLjUOn;

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
        zsXlph = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.DdI, 1);
        sparseIntArray.put(C48033uCm.Application.setExtraBinder, 2);
        sparseIntArray.put(C48033uCm.Application.MediaSessionCompatToken1, 3);
        sparseIntArray.put(C48033uCm.Application.fromQueueItemList, 4);
        sparseIntArray.put(C48033uCm.Application.IMediaSessionStub, 5);
        sparseIntArray.put(C48033uCm.Application.MediaSessionCompatMediaSessionImplBaseCommand, 6);
        sparseIntArray.put(C48033uCm.Application.playFromSearch, 7);
        sparseIntArray.put(C48033uCm.Application.DtnWsU, 8);
        sparseIntArray.put(C48033uCm.Application.removeCancellable, 9);
        sparseIntArray.put(C48033uCm.Application.ScLVFT, 10);
        sparseIntArray.put(C48033uCm.Application.getConnectivityMgr, 11);
        sparseIntArray.put(C48033uCm.Application.FF, 12);
        sparseIntArray.put(C48033uCm.Application.getAlpha, 13);
        sparseIntArray.put(C48033uCm.Application.OHsvZP, 14);
        sparseIntArray.put(C48033uCm.Application.putString, 15);
        sparseIntArray.put(C48033uCm.Application.onScrollChanged, 16);
        sparseIntArray.put(C48033uCm.Application.NavItemSelectedListener, 17);
        sparseIntArray.put(C48033uCm.Application.isConnected, 18);
        sparseIntArray.put(C48033uCm.Application.DbNXlk, 19);
        sparseIntArray.put(C48033uCm.Application.AkhnZx, 20);
        sparseIntArray.put(C48033uCm.Application.setErrorMessage, 21);
        sparseIntArray.put(C48033uCm.Application.UJpkuA, 22);
        sparseIntArray.put(C48033uCm.Application.Rstring, 23);
        sparseIntArray.put(C48033uCm.Application.values, 24);
    }

    public C48506uTy(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 25, uzCIH, zsXlph));
    }

    public C48506uTy(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.LinearLayout) objArr[18], (android.widget.TextView) objArr[19], (android.widget.TextView) objArr[20], (Group) objArr[24], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[14], (C55258xgZ) objArr[11], (android.widget.TextView) objArr[12], (android.widget.TextView) objArr[22], (C47988uAv) objArr[10], (ConstraintLayout) objArr[1], (vKO) objArr[15], (C47988uAv) objArr[7], (C47988uAv) objArr[5], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[4], (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[3], (C53605woe) objArr[21], (C55258xgZ) objArr[9], (vKO) objArr[16], (OKReminder) objArr[23], (android.widget.TextView) objArr[17], (C55113xdn) objArr[13]);
        this.AuCTelauCTel = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.zLjUOn = nestedScrollView;
        nestedScrollView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AuCTelauCTel = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AuCTelauCTel != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AuCTelauCTel = 0L;
        }
    }
}
