package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.tradingbot.impl.strategy.view.TickerIconView;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uPJ extends uPG {
    public static final ViewDataBinding.IncludedLayouts DTwDnp = null;
    public static final android.util.SparseIntArray QUSxYX;
    public final NestedScrollView QbewEr;
    public long RJOkX;

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
        QUSxYX = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.MediaDescriptionCompat1, 1);
        sparseIntArray.put(C48033uCm.Application.apLTlu, 2);
        sparseIntArray.put(C48033uCm.Application.onActiveChanged, 3);
        sparseIntArray.put(C48033uCm.Application.AYXKKw, 4);
        sparseIntArray.put(C48033uCm.Application.KWHzl, 5);
        sparseIntArray.put(C48033uCm.Application.copydefault, 6);
        sparseIntArray.put(C48033uCm.Application.provides, 7);
        sparseIntArray.put(C48033uCm.Application.LocalActivityResultRegistryOwner, 8);
        sparseIntArray.put(C48033uCm.Application.getCurrent, 9);
        sparseIntArray.put(C48033uCm.Application.LocalActivityResultRegistryOwnerLocalComposition1, 10);
        sparseIntArray.put(C48033uCm.Application.LocalOnBackPressedDispatcherOwnerLocalOnBackPressedDispatcherOwner1, 11);
        sparseIntArray.put(C48033uCm.Application.LocalFullyDrawnReporterOwnerLocalFullyDrawnReporterOwner1, 12);
        sparseIntArray.put(C48033uCm.Application.DGGHxk, 13);
        sparseIntArray.put(C48033uCm.Application.ibnZAm, 14);
        sparseIntArray.put(C48033uCm.Application.identifier, 15);
        sparseIntArray.put(C48033uCm.Application.toBundle, 16);
        sparseIntArray.put(C48033uCm.Application.dbAction, 17);
        sparseIntArray.put(C48033uCm.Application.ReportDrawnKt, 18);
        sparseIntArray.put(C48033uCm.Application.QFTsTN, 19);
        sparseIntArray.put(C48033uCm.Application.ComponentActivity3, 20);
        sparseIntArray.put(C48033uCm.Application.getMediaDescription, 21);
        sparseIntArray.put(C48033uCm.Application.ensureWindow, 22);
        sparseIntArray.put(C48033uCm.Application.DcMfJKDDUqPf, 23);
        sparseIntArray.put(C48033uCm.Application.getSessionID, 24);
        sparseIntArray.put(C48033uCm.Application.updateStatusGuardColor, 25);
        sparseIntArray.put(C48033uCm.Application.OnBackPressedDispatcherLifecycleOnBackPressedCancellable, 26);
        sparseIntArray.put(C48033uCm.Application.onCreateDialog, 27);
        sparseIntArray.put(C48033uCm.Application.setIconUri, 28);
        sparseIntArray.put(C48033uCm.Application.onPause, 29);
        sparseIntArray.put(C48033uCm.Application.onPlayFromSearch, 30);
        sparseIntArray.put(C48033uCm.Application.DzkRMH, 31);
        sparseIntArray.put(C48033uCm.Application.getMediaItem, 32);
        sparseIntArray.put(C48033uCm.Application.MediaBrowserCompatMediaBrowserImplApi215, 33);
        sparseIntArray.put(C48033uCm.Application.finish, 34);
        sparseIntArray.put(C48033uCm.Application.startIntentSenderForResult, 35);
        sparseIntArray.put(C48033uCm.Application.QOeQqh, 36);
        sparseIntArray.put(C48033uCm.Application.MediaBrowserCompatServiceBinderWrapper, 37);
        sparseIntArray.put(C48033uCm.Application.fRNHEq, 38);
        sparseIntArray.put(C48033uCm.Application.sVaiLC, 39);
    }

    public uPJ(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 40, DTwDnp, QUSxYX));
    }

    public uPJ(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[6], (LinearLayoutCompat) objArr[4], (ConstraintLayout) objArr[23], (android.widget.TextView) objArr[24], (ConstraintLayout) objArr[31], (ConstraintLayout) objArr[13], (ConstraintLayout) objArr[19], (android.widget.TextView) objArr[14], (C55173xeu) objArr[36], (C55173xeu) objArr[2], (android.view.View) objArr[38], (android.widget.TextView) objArr[39], (android.widget.TextView) objArr[15], (android.widget.TextView) objArr[17], (RecyclerView) objArr[33], (LinearLayoutCompat) objArr[21], (LinearLayoutCompat) objArr[1], (LinearLayoutCompat) objArr[32], (LinearLayoutCompat) objArr[37], (LinearLayoutCompat) objArr[28], (C55258xgZ) objArr[29], (C55258xgZ) objArr[30], (ConstraintLayout) objArr[3], (TickerIconView) objArr[16], (RecyclerView) objArr[35], (android.view.View) objArr[20], (android.widget.TextView) objArr[26], (LinearLayoutCompat) objArr[7], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[9], (LinearLayoutCompat) objArr[10], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[12], (Group) objArr[18], (android.widget.TextView) objArr[22], (android.widget.TextView) objArr[25], (android.widget.TextView) objArr[27], (android.view.View) objArr[34]);
        this.RJOkX = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.QbewEr = nestedScrollView;
        nestedScrollView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.RJOkX = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.RJOkX != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.RJOkX = 0L;
        }
    }
}
