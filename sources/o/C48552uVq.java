package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;
import com.robinhood.ticker.TickerView;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uVq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48552uVq extends AbstractC48553uVr {
    public static final ViewDataBinding.IncludedLayouts AuCTel = null;
    public static final android.util.SparseIntArray fARcdN;
    public final ConstraintLayout getFieldNames;
    public final LinearLayoutCompat iwGUEr;
    public long uzCIH;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        fARcdN = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.getNavigationItemCount, 8);
        sparseIntArray.put(C48033uCm.Application.closeOptionsMenu, 9);
        sparseIntArray.put(C48033uCm.Application.removeOnMultiWindowModeChangedListener, 10);
        sparseIntArray.put(C48033uCm.Application.removeOnPictureInPictureModeChangedListener, 11);
        sparseIntArray.put(C48033uCm.Application.UlJrfe, 12);
        sparseIntArray.put(C48033uCm.Application.USBtdM, 13);
        sparseIntArray.put(C48033uCm.Application.PlaybackStateCompatErrorCode, 14);
        sparseIntArray.put(C48033uCm.Application.isStateful, 15);
        sparseIntArray.put(C48033uCm.Application.QYvkLl, 16);
        sparseIntArray.put(C48033uCm.Application.MediaControllerCompatCallbackMessageHandler, 17);
    }

    public C48552uVq(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 18, AuCTel, fARcdN));
    }

    public C48552uVq(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatTextView) objArr[13], (C49774uur) objArr[12], (AppCompatTextView) objArr[3], (AppCompatImageView) objArr[7], (C52705wVh) objArr[16], new ViewStubProxy((android.view.ViewStub) objArr[17]), (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[6], (C55320xhi) objArr[14], (ConstraintLayout) objArr[10], (AppCompatImageView) objArr[11], (TickerView) objArr[9], (AppCompatImageView) objArr[2], (AppCompatTextView) objArr[8], (C8226ayj) objArr[4], new ViewStubProxy((android.view.ViewStub) objArr[15]));
        this.uzCIH = -1L;
        this.copydefault.setTag(null);
        this.AEQbTJ.setTag(null);
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.iwGUEr = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.getFieldNames = constraintLayout;
        constraintLayout.setTag(null);
        this.djBIcL.setContainingBinding(this);
        this.valueOf.setTag(null);
        this.AhwBna.setTag(null);
        this.values.setTag(null);
        this.ejfBZ.setTag(null);
        this.fIwbmz.setContainingBinding(this);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.uzCIH = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.uzCIH != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C48034uCn.AhwBna == i) {
            copydefault(((java.lang.Boolean) obj).booleanValue());
        } else {
            if (C48034uCn.EZpvd != i) {
                return false;
            }
            OLrzqt(((java.lang.Boolean) obj).booleanValue());
        }
        return true;
    }

    @Override // o.AbstractC48553uVr
    public void copydefault(boolean z) {
        this.gEmmrt = z;
        synchronized (this) {
            this.uzCIH |= 1;
        }
        notifyPropertyChanged(C48034uCn.AhwBna);
        super.requestRebind();
    }

    @Override // o.AbstractC48553uVr
    public void OLrzqt(boolean z) {
        this.AYXKKw = z;
        synchronized (this) {
            this.uzCIH |= 2;
        }
        notifyPropertyChanged(C48034uCn.EZpvd);
        super.requestRebind();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026 A[PHI: r0
  0x0026: PHI (r0v2 long) = (r0v1 long), (r0v18 long) binds: [B:6:0x0015, B:12:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void executeBindings() {
        long j;
        int i;
        int i2;
        synchronized (this) {
            j = this.uzCIH;
            this.uzCIH = 0L;
        }
        boolean z = this.gEmmrt;
        boolean z2 = this.AYXKKw;
        long j2 = j & 5;
        int i3 = 0;
        if (j2 == 0) {
            i = 0;
        } else {
            if (j2 != 0) {
                j |= z ? 16L : 8L;
            }
            if (!z) {
                i = 8;
            }
        }
        long j3 = j & 6;
        if (j3 != 0) {
            if (j3 != 0) {
                j |= z2 ? 320L : 160L;
            }
            int i4 = z2 ? 8 : 0;
            i2 = z2 ? 0 : 8;
            i3 = i4;
        } else {
            i2 = 0;
        }
        if ((6 & j) != 0) {
            this.copydefault.setVisibility(i3);
            C51707vsB.EZpvd(this.getFieldNames, z2);
            this.valueOf.setVisibility(i2);
            this.AhwBna.setVisibility(i2);
            this.values.setVisibility(i3);
            this.ejfBZ.setVisibility(i2);
        }
        if ((j & 5) != 0) {
            this.AEQbTJ.setVisibility(i);
        }
        if (this.djBIcL.getBinding() != null) {
            ViewDataBinding.executeBindingsOn(this.djBIcL.getBinding());
        }
        if (this.fIwbmz.getBinding() != null) {
            ViewDataBinding.executeBindingsOn(this.fIwbmz.getBinding());
        }
    }
}
