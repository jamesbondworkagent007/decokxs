package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.uilab.banner.OKAlertBanner;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ehR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16304ehR extends AbstractC16298ehL {
    public static final android.util.SparseIntArray DTwDnp;
    public static final ViewDataBinding.IncludedLayouts QKVWgx;
    public long OcIXYQ;
    public final ConstraintLayout QfsBiF;
    public final android.widget.LinearLayout RJOkX;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(39);
        QKVWgx = includedLayouts;
        includedLayouts.setIncludes(2, new java.lang.String[]{"activity_defi_wallet_custom_tx_detail_transaction_item"}, new int[]{7}, new int[]{C13754dXa.TaskDescription.sSMYrx});
        int i = C13754dXa.TaskDescription.sEcTXd;
        includedLayouts.setIncludes(3, new java.lang.String[]{"layout_tx_detail_assets_expand", "layout_tx_detail_include_assets", "layout_tx_detail_assets_expand"}, new int[]{4, 5, 6}, new int[]{i, C13754dXa.TaskDescription.icKaHr, i});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        DTwDnp = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.MediaSessionCompatMediaSessionImplApi191, 8);
        sparseIntArray.put(C13754dXa.ActionBar.OTJFaA, 9);
        sparseIntArray.put(C13754dXa.ActionBar.ITrustedWebActivityService, 10);
        sparseIntArray.put(C13754dXa.ActionBar.validateSHA256, 11);
        sparseIntArray.put(C13754dXa.ActionBar.ActivityResultContractSynchronousResult, 12);
        sparseIntArray.put(C13754dXa.ActionBar.aUsmxb, 13);
        sparseIntArray.put(C13754dXa.ActionBar.setCurrentControllerInfo, 14);
        sparseIntArray.put(C13754dXa.ActionBar.isTransportControlEnabled, 15);
        sparseIntArray.put(C13754dXa.ActionBar.getMediaUri, 16);
        sparseIntArray.put(C13754dXa.ActionBar.IMediaSessionStub, 17);
        sparseIntArray.put(C13754dXa.ActionBar.getSubtitle, 18);
        sparseIntArray.put(C13754dXa.ActionBar.ICustomTabsServiceDefault, 19);
        sparseIntArray.put(C13754dXa.ActionBar.setFillInIntent, 20);
        sparseIntArray.put(C13754dXa.ActionBar.ddhgMB, 21);
        sparseIntArray.put(C13754dXa.ActionBar.IPostMessageServiceStubProxy, 22);
        sparseIntArray.put(C13754dXa.ActionBar.ActivityResultContractsPickMultipleVisualMedia, 23);
        sparseIntArray.put(C13754dXa.ActionBar.aLnfMH, 24);
        sparseIntArray.put(C13754dXa.ActionBar.extraCallback, 25);
        sparseIntArray.put(C13754dXa.ActionBar.ComponentActivityKt, 26);
        sparseIntArray.put(C13754dXa.ActionBar.onTransact, 27);
        sparseIntArray.put(C13754dXa.ActionBar.DimensionCompanion, 28);
        sparseIntArray.put(C13754dXa.ActionBar.ITrustedWebActivityCallbackDefault, 29);
        sparseIntArray.put(C13754dXa.ActionBar.QFTsTN, 30);
        sparseIntArray.put(C13754dXa.ActionBar.sTbpmZ, 31);
        sparseIntArray.put(C13754dXa.ActionBar.zKcAg, 32);
        sparseIntArray.put(C13754dXa.ActionBar.iKEqwx, 33);
        sparseIntArray.put(C13754dXa.ActionBar.fGQ, 34);
        sparseIntArray.put(C13754dXa.ActionBar.dzCpvv, 35);
        sparseIntArray.put(C13754dXa.ActionBar.YqksP, 36);
        sparseIntArray.put(C13754dXa.ActionBar.gFTCsA, 37);
        sparseIntArray.put(C13754dXa.ActionBar.INotificationSideChannelStub, 38);
    }

    public C16304ehR(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 39, QKVWgx, DTwDnp));
    }

    public C16304ehR(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 4, (android.widget.Space) objArr[13], (C52794wYp) objArr[32], (C52794wYp) objArr[36], (C52794wYp) objArr[35], (C52794wYp) objArr[33], (C52794wYp) objArr[34], (RecyclerView) objArr[30], (android.widget.FrameLayout) objArr[37], (ConstraintLayout) objArr[1], (android.widget.ImageView) objArr[9], (android.widget.ImageView) objArr[21], (LottieAnimationView) objArr[11], (android.widget.ImageView) objArr[24], (AbstractC16338ehz) objArr[7], (ConstraintLayout) objArr[25], (android.widget.LinearLayout) objArr[31], (android.widget.LinearLayout) objArr[27], (AbstractC17054evZ) objArr[5], (AbstractC17045evQ) objArr[4], (android.widget.LinearLayout) objArr[19], (AbstractC17045evQ) objArr[6], (android.widget.LinearLayout) objArr[22], (android.widget.LinearLayout) objArr[10], (android.widget.LinearLayout) objArr[29], (ConstraintLayout) objArr[3], (C55113xdn) objArr[38], (NestedScrollView) objArr[16], (OKAlertBanner) objArr[18], (C33603mza) objArr[15], (OKAlertBanner) objArr[17], (C33546myW) objArr[14], (C57261yfA) objArr[8], (android.widget.TextView) objArr[26], (android.widget.TextView) objArr[20], (android.widget.TextView) objArr[12], (android.widget.TextView) objArr[23], (android.widget.TextView) objArr[28]);
        this.OcIXYQ = -1L;
        this.AhwBna.setTag(null);
        setContainedBinding(this.isConnected);
        setContainedBinding(this.AuCTel);
        setContainedBinding(this.fJNWhG);
        setContainedBinding(this.hDKMBd);
        this.getNewProxyInstance.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.QfsBiF = constraintLayout;
        constraintLayout.setTag(null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[2];
        this.RJOkX = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.OcIXYQ = 16L;
        }
        this.fJNWhG.invalidateAll();
        this.AuCTel.invalidateAll();
        this.hDKMBd.invalidateAll();
        this.isConnected.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.OcIXYQ != 0) {
                return true;
            }
            return this.fJNWhG.hasPendingBindings() || this.AuCTel.hasPendingBindings() || this.hDKMBd.hasPendingBindings() || this.isConnected.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.fJNWhG.setLifecycleOwner(lifecycleOwner);
        this.AuCTel.setLifecycleOwner(lifecycleOwner);
        this.hDKMBd.setLifecycleOwner(lifecycleOwner);
        this.isConnected.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i == 0) {
            return copydefault((AbstractC17045evQ) obj, i2);
        }
        if (i == 1) {
            return AEQbTJ((AbstractC17054evZ) obj, i2);
        }
        if (i == 2) {
            return KWHzl((AbstractC16338ehz) obj, i2);
        }
        if (i != 3) {
            return false;
        }
        return OLrzqt((AbstractC17045evQ) obj, i2);
    }

    public final boolean copydefault(AbstractC17045evQ abstractC17045evQ, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.OcIXYQ |= 1;
        }
        return true;
    }

    public final boolean AEQbTJ(AbstractC17054evZ abstractC17054evZ, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.OcIXYQ |= 2;
        }
        return true;
    }

    public final boolean KWHzl(AbstractC16338ehz abstractC16338ehz, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.OcIXYQ |= 4;
        }
        return true;
    }

    public final boolean OLrzqt(AbstractC17045evQ abstractC17045evQ, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.OcIXYQ |= 8;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.OcIXYQ;
            this.OcIXYQ = 0L;
        }
        if ((j & 16) != 0) {
            C33090mpr.EZpvd(this.AhwBna, C33570myu.valueOf(getRoot().getContext()));
        }
        ViewDataBinding.executeBindingsOn(this.fJNWhG);
        ViewDataBinding.executeBindingsOn(this.AuCTel);
        ViewDataBinding.executeBindingsOn(this.hDKMBd);
        ViewDataBinding.executeBindingsOn(this.isConnected);
    }
}
