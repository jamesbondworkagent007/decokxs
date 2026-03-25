package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eiU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16360eiU extends AbstractC16361eiV {
    public static final ViewDataBinding.IncludedLayouts getFieldNames = null;
    public static final android.util.SparseIntArray getNewProxyInstance;
    public long uzCIH;
    public final ConstraintLayout zLjUOn;

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
        getNewProxyInstance = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.MediaSessionCompatMediaSessionImplApi191, 2);
        sparseIntArray.put(C13754dXa.ActionBar.OTJFaA, 3);
        sparseIntArray.put(C13754dXa.ActionBar.ITrustedWebActivityService, 4);
        sparseIntArray.put(C13754dXa.ActionBar.validateSHA256, 5);
        sparseIntArray.put(C13754dXa.ActionBar.ActivityResultContractSynchronousResult, 6);
        sparseIntArray.put(C13754dXa.ActionBar.aUsmxb, 7);
        sparseIntArray.put(C13754dXa.ActionBar.setSessionImpl, 8);
        sparseIntArray.put(C13754dXa.ActionBar.isTransportControlEnabled, 9);
        sparseIntArray.put(C13754dXa.ActionBar.MediaBrowserCompatSubscriptionCallbackSubscriptionCallbackApi26, 10);
        sparseIntArray.put(C13754dXa.ActionBar.fupbxE, 11);
        sparseIntArray.put(C13754dXa.ActionBar.sVaiLC, 12);
        sparseIntArray.put(C13754dXa.ActionBar.HrFqwD, 13);
        sparseIntArray.put(C13754dXa.ActionBar.lambdanew1, 14);
        sparseIntArray.put(C13754dXa.ActionBar.zqaRxl, 15);
        sparseIntArray.put(C13754dXa.ActionBar.getSavedStateRegistry, 16);
        sparseIntArray.put(C13754dXa.ActionBar.OFnBcz, 17);
        sparseIntArray.put(C13754dXa.ActionBar.ComponentActivity3, 18);
        sparseIntArray.put(C13754dXa.ActionBar.RYPzIz, 19);
        sparseIntArray.put(C13754dXa.ActionBar.MediaControllerCompatCallbackStubApi21, 20);
        sparseIntArray.put(C13754dXa.ActionBar.zFtALg, 21);
        sparseIntArray.put(C13754dXa.ActionBar.INotificationSideChannelStub, 22);
    }

    public C16360eiU(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 23, getFieldNames, getNewProxyInstance));
    }

    public C16360eiU(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.Space) objArr[7], (ConstraintLayout) objArr[11], (C55173xeu) objArr[21], (ConstraintLayout) objArr[1], (C57299yfm) objArr[13], (android.widget.ImageView) objArr[12], (android.widget.ImageView) objArr[3], (LottieAnimationView) objArr[5], (ConstraintLayout) objArr[15], (android.widget.LinearLayout) objArr[17], (android.widget.LinearLayout) objArr[4], (android.widget.LinearLayout) objArr[19], (C55113xdn) objArr[22], (NestedScrollView) objArr[10], (C33603mza) objArr[9], (RecyclerView) objArr[20], (C33546myW) objArr[8], (C57261yfA) objArr[2], (AppCompatTextView) objArr[14], (android.widget.TextView) objArr[16], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[18]);
        this.uzCIH = -1L;
        this.KWHzl.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.zLjUOn = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.uzCIH = 1L;
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
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.uzCIH;
            this.uzCIH = 0L;
        }
        if ((j & 1) != 0) {
            C33090mpr.EZpvd(this.KWHzl, C33570myu.valueOf(getRoot().getContext()));
        }
    }
}
