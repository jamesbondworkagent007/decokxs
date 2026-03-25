package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uZZ extends AbstractC50778vaa {
    public static final ViewDataBinding.IncludedLayouts AwvSrB = null;
    public static final android.util.SparseIntArray sSMYrx;
    public long zuBGHE;

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
        sSMYrx = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.gLWkOL, 1);
        sparseIntArray.put(C48033uCm.Application.ActionBarDrawerToggleFrameworkActionBarDelegate, 2);
        sparseIntArray.put(C48033uCm.Application.UrRBLY, 3);
        sparseIntArray.put(C48033uCm.Application.fHqPtx, 4);
        sparseIntArray.put(C48033uCm.Application.WorkerThread, 5);
        sparseIntArray.put(C48033uCm.Application.Rattr, 6);
        sparseIntArray.put(C48033uCm.Application.ICustomTabsCallbackStub, 7);
        sparseIntArray.put(C48033uCm.Application.postOrRun, 8);
        sparseIntArray.put(C48033uCm.Application.XmlRes, 9);
        sparseIntArray.put(C48033uCm.Application.Experimental, 10);
        sparseIntArray.put(C48033uCm.Application.ExperimentalLevel, 11);
        sparseIntArray.put(C48033uCm.Application.checkShowingFlags, 12);
        sparseIntArray.put(C48033uCm.Application.cleanupTabs, 13);
        sparseIntArray.put(C48033uCm.Application.HJWChPHhYHK, 14);
        sparseIntArray.put(C48033uCm.Application.DDDCac, 15);
        sparseIntArray.put(C48033uCm.Application.hCLrkq, 16);
        sparseIntArray.put(C48033uCm.Application.putText, 17);
        sparseIntArray.put(C48033uCm.Application.putLong, 18);
        sparseIntArray.put(C48033uCm.Application.putRating, 19);
        sparseIntArray.put(C48033uCm.Application.dPkBzA, 20);
        sparseIntArray.put(C48033uCm.Application.IMediaSession, 21);
        sparseIntArray.put(C48033uCm.Application.MediaSessionCompatApi22, 22);
        sparseIntArray.put(C48033uCm.Application.addOnPictureInPictureModeChangedListener, 23);
        sparseIntArray.put(C48033uCm.Application.addOnContextAvailableListener, 24);
        sparseIntArray.put(C48033uCm.Application.DGOPHZ, 25);
        sparseIntArray.put(C48033uCm.Application.call, 26);
        sparseIntArray.put(C48033uCm.Application.DCUTEIddSDPG, 27);
        sparseIntArray.put(C48033uCm.Application.WS, 28);
        sparseIntArray.put(C48033uCm.Application.getMinimumWidth, 29);
        sparseIntArray.put(C48033uCm.Application.iwGUEr, 30);
        sparseIntArray.put(C48033uCm.Application.setupContent, 31);
    }

    public uZZ(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 32, AwvSrB, sSMYrx));
    }

    public uZZ(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C50192vFh) objArr[30], (C47988uAv) objArr[27], (C55239xgG) objArr[26], (C55258xgZ) objArr[25], (AppCompatTextView) objArr[28], (C53513wms) objArr[4], (android.widget.FrameLayout) objArr[3], (C53539wnR) objArr[16], (android.widget.TextView) objArr[20], (android.widget.TextView) objArr[14], (C53533wnL) objArr[1], (android.widget.TextView) objArr[15], (ConstraintLayout) objArr[0], (C55258xgZ) objArr[7], (C50189vFe) objArr[8], (android.widget.TextView) objArr[19], (ConstraintLayout) objArr[17], (C55258xgZ) objArr[18], (android.widget.TextView) objArr[21], (C53470wmB) objArr[22], (C55239xgG) objArr[24], (C55258xgZ) objArr[23], (C47988uAv) objArr[9], (C47988uAv) objArr[11], (C47988uAv) objArr[5], (C47988uAv) objArr[10], (C47988uAv) objArr[6], (C55258xgZ) objArr[2], (android.widget.TextView) objArr[31], (ConstraintLayout) objArr[12], (C55258xgZ) objArr[13], (C54154wyx) objArr[29]);
        this.zuBGHE = -1L;
        this.isConnected.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.zuBGHE = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.zuBGHE != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.zuBGHE = 0L;
        }
    }
}
