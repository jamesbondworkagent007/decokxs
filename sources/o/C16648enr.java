package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.uilab.banner.OKAlertBanner;
import o.C13754dXa;

/* JADX INFO: renamed from: o.enr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16648enr extends AbstractC16646enp {
    public static final ViewDataBinding.IncludedLayouts AuCTelauCTel = null;
    public static final android.util.SparseIntArray zLjUOn;
    public long AxsJAY;

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
        zLjUOn = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.fAklCm, 1);
        sparseIntArray.put(C13754dXa.ActionBar.fromMediaSession, 2);
        sparseIntArray.put(C13754dXa.ActionBar.getLaunchPendingIntent, 3);
        sparseIntArray.put(C13754dXa.ActionBar.getMetadata, 4);
        sparseIntArray.put(C13754dXa.ActionBar.newSession, 5);
        sparseIntArray.put(C13754dXa.ActionBar.hdBMmm, 6);
        sparseIntArray.put(C13754dXa.ActionBar.readTypedObject, 7);
        sparseIntArray.put(C13754dXa.ActionBar.ActivityResultContract, 8);
        sparseIntArray.put(C13754dXa.ActionBar.newHeartRating, 9);
        sparseIntArray.put(C13754dXa.ActionBar.ResultReceiver1, 10);
        sparseIntArray.put(C13754dXa.ActionBar.fHqPtx, 11);
        sparseIntArray.put(C13754dXa.ActionBar.DGgnkA, 12);
        sparseIntArray.put(C13754dXa.ActionBar.DBxZfM, 13);
        sparseIntArray.put(C13754dXa.ActionBar.OVMstZ, 14);
        sparseIntArray.put(C13754dXa.ActionBar.fastForward, 15);
        sparseIntArray.put(C13754dXa.ActionBar.OAhWiU, 16);
        sparseIntArray.put(C13754dXa.ActionBar.getQueueId, 17);
        sparseIntArray.put(C13754dXa.ActionBar.invokespecialDaTmkG, 18);
        sparseIntArray.put(C13754dXa.ActionBar.UnZVfqExternalSyntheticApiModelOutline0, 19);
        sparseIntArray.put(C13754dXa.ActionBar.m, 20);
        sparseIntArray.put(C13754dXa.ActionBar.setMediaType, 21);
        sparseIntArray.put(C13754dXa.ActionBar.fRNHEq, 22);
        sparseIntArray.put(C13754dXa.ActionBar.onActiveChanged, 23);
        sparseIntArray.put(C13754dXa.ActionBar.isThumbUp, 24);
        sparseIntArray.put(C13754dXa.ActionBar.IPostMessageService, 25);
        sparseIntArray.put(C13754dXa.ActionBar.DcMfJKDCKfqP, 26);
        sparseIntArray.put(C13754dXa.ActionBar.INotificationSideChannelStub, 27);
    }

    public C16648enr(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 28, AuCTelauCTel, zLjUOn));
    }

    public C16648enr(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[11], (android.widget.TextView) objArr[13], (android.widget.TextView) objArr[12], (C55251xgS) objArr[18], (ConstraintLayout) objArr[0], (C52794wYp) objArr[26], (android.view.View) objArr[16], (android.widget.FrameLayout) objArr[1], (AppCompatImageView) objArr[22], (AppCompatImageView) objArr[14], (android.widget.ImageView) objArr[6], (LinearLayoutCompat) objArr[20], (LinearLayoutCompat) objArr[19], (android.widget.FrameLayout) objArr[5], (C52794wYp) objArr[25], (C55113xdn) objArr[27], (LottieAnimationView) objArr[7], (ConstraintLayout) objArr[9], (LinearLayoutCompat) objArr[24], (ConstraintLayout) objArr[15], (ConstraintLayout) objArr[3], (OKAlertBanner) objArr[4], (NestedScrollView) objArr[2], (android.widget.TextView) objArr[23], (AppCompatTextView) objArr[17], (AppCompatTextView) objArr[10], (AppCompatTextView) objArr[21], (AppCompatTextView) objArr[8]);
        this.AxsJAY = -1L;
        this.OLrzqt.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AxsJAY = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AxsJAY != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AxsJAY = 0L;
        }
    }
}
