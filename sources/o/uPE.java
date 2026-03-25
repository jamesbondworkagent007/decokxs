package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.tradingbot.impl.strategy.view.TickerIconView;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uPE extends AbstractC48396uPy {
    public static final ViewDataBinding.IncludedLayouts DTwDnp = null;
    public static final android.util.SparseIntArray QOLQEE;
    public long OcIXYQ;

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
        QOLQEE = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.apLTlu, 1);
        sparseIntArray.put(C48033uCm.Application.getRccStateFromState, 2);
        sparseIntArray.put(C48033uCm.Application.DGGHxk, 3);
        sparseIntArray.put(C48033uCm.Application.ibnZAm, 4);
        sparseIntArray.put(C48033uCm.Application.identifier, 5);
        sparseIntArray.put(C48033uCm.Application.toBundle, 6);
        sparseIntArray.put(C48033uCm.Application.dbAction, 7);
        sparseIntArray.put(C48033uCm.Application.ReportDrawnKt, 8);
        sparseIntArray.put(C48033uCm.Application.QFTsTN, 9);
        sparseIntArray.put(C48033uCm.Application.KWHzl, 10);
        sparseIntArray.put(C48033uCm.Application.copydefault, 11);
        sparseIntArray.put(C48033uCm.Application.sZqaRl, 12);
        sparseIntArray.put(C48033uCm.Application.hwkNQP, 13);
        sparseIntArray.put(C48033uCm.Application.apNbdB, 14);
        sparseIntArray.put(C48033uCm.Application.dLBcXg, 15);
        sparseIntArray.put(C48033uCm.Application.DGgkXd, 16);
        sparseIntArray.put(C48033uCm.Application.ComponentActivity3, 17);
        sparseIntArray.put(C48033uCm.Application.getMediaDescription, 18);
        sparseIntArray.put(C48033uCm.Application.ensureWindow, 19);
        sparseIntArray.put(C48033uCm.Application.DcMfJKDDUqPf, 20);
        sparseIntArray.put(C48033uCm.Application.getSessionID, 21);
        sparseIntArray.put(C48033uCm.Application.updateStatusGuardColor, 22);
        sparseIntArray.put(C48033uCm.Application.OnBackPressedDispatcherLifecycleOnBackPressedCancellable, 23);
        sparseIntArray.put(C48033uCm.Application.onCreateDialog, 24);
        sparseIntArray.put(C48033uCm.Application.setIconUri, 25);
        sparseIntArray.put(C48033uCm.Application.onPause, 26);
        sparseIntArray.put(C48033uCm.Application.onPlayFromSearch, 27);
        sparseIntArray.put(C48033uCm.Application.DzkRMH, 28);
        sparseIntArray.put(C48033uCm.Application.getMediaItem, 29);
        sparseIntArray.put(C48033uCm.Application.MediaBrowserCompatMediaBrowserImplApi215, 30);
        sparseIntArray.put(C48033uCm.Application.finish, 31);
        sparseIntArray.put(C48033uCm.Application.startIntentSenderForResult, 32);
        sparseIntArray.put(C48033uCm.Application.MediaBrowserCompatServiceBinderWrapper, 33);
        sparseIntArray.put(C48033uCm.Application.fRNHEq, 34);
        sparseIntArray.put(C48033uCm.Application.sVaiLC, 35);
        sparseIntArray.put(C48033uCm.Application.QOeQqh, 36);
    }

    public uPE(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 37, DTwDnp, QOLQEE));
    }

    public uPE(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C55320xhi) objArr[10], (android.widget.TextView) objArr[11], (Barrier) objArr[14], (Barrier) objArr[15], (ConstraintLayout) objArr[20], (android.widget.TextView) objArr[21], (ConstraintLayout) objArr[28], (ConstraintLayout) objArr[3], (ConstraintLayout) objArr[9], (C55320xhi) objArr[12], (android.widget.TextView) objArr[13], (android.widget.TextView) objArr[4], (Group) objArr[16], (C55173xeu) objArr[36], (C55173xeu) objArr[1], (android.view.View) objArr[34], (android.widget.TextView) objArr[35], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[7], (RecyclerView) objArr[30], (LinearLayoutCompat) objArr[18], (LinearLayoutCompat) objArr[0], (LinearLayoutCompat) objArr[29], (LinearLayoutCompat) objArr[33], (LinearLayoutCompat) objArr[25], (C55258xgZ) objArr[26], (C55258xgZ) objArr[27], (wAI) objArr[2], (TickerIconView) objArr[6], (RecyclerView) objArr[32], (android.view.View) objArr[17], (android.widget.TextView) objArr[23], (Group) objArr[8], (android.widget.TextView) objArr[19], (android.widget.TextView) objArr[22], (android.widget.TextView) objArr[24], (android.view.View) objArr[31]);
        this.OcIXYQ = -1L;
        this.getFieldNames.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.OcIXYQ = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.OcIXYQ != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.OcIXYQ = 0L;
        }
    }
}
