package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.model.tx.signdata.BTCMessageSignData;
import com.okinc.business.defi.api.model.tx.signdata.PlatformItem;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import com.okinc.wallet.widget.dialog.DefiWalletVReminderDFragment;
import com.okinc.web3Uilib.bean.RiskPageInfoBean;
import com.okinc.web3Uilib.bean.TransactionGeneralInfoBean;
import com.okinc.web3Uilib.bean.TransactionTopReminderInfoBean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gep, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C20330gep extends C20290geB<C12152chZ> {
    public int copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC20082gaF, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        if (((C12152chZ) ejfBZ()).dUDNAs().gHZMYf() || ((C12152chZ) ejfBZ()).dUDNAs().AEQbTJ(WalletType.HardwareWallet)) {
            return;
        }
        gEmmrt().KWHzl.setPrimaryButtonText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.OFnBcz));
        gEmmrt().KWHzl.setSecondaryButtonText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.UPzgla));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r15v13, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C20290geB, o.AbstractC20082gaF
    public void AEQbTJ(@NotNull AbstractC20082gaF<C12152chZ>.ActionBar actionBar, boolean z) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        CDNSourceManager cDNSourceManager = CDNSourceManager.OLrzqt;
        CDNSourceManager.ImageSource imageSource = CDNSourceManager.ImageSource.TxConfirmContract;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        actionBar.OLrzqt(AbstractC20102gaZ.titleInfoView$default(this, cDNSourceManager.KWHzl(imageSource, contextRequireContext), C33070mpX.AYXKKw(C13754dXa.FragmentManager.callOnPanelClosed), null, null, null, null, null, 124, null));
        actionBar.OLrzqt(copydefault());
        actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(32.0f, (android.content.Context) null, 1, (java.lang.Object) null)));
        actionBar.OLrzqt(AbstractC20102gaZ.lineView$default(this, 0, 0, 3, null));
        actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(16.0f, (android.content.Context) null, 1, (java.lang.Object) null)));
        actionBar.OLrzqt(AbstractC20102gaZ.walletUsedView$default(this, null, ((C12152chZ) ejfBZ()).fERRXa().getAddressTypeText(), 1, null));
        actionBar.OLrzqt(OLrzqt());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final android.view.View copydefault() {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C21199gvJ c21199gvJ = new C21199gvJ(contextRequireContext);
        java.util.List<java.lang.String> psbtHexs = ((BTCMessageSignData) ((C12152chZ) ejfBZ()).QVsKAR()).getPsbtHexs();
        if (psbtHexs == null) {
            psbtHexs = yDY.AhwBna();
        }
        c21199gvJ.setData(psbtHexs, new Function1() { // from class: o.gen
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20330gep.AEQbTJ(this.OLrzqt, ((java.lang.Integer) obj).intValue());
            }
        });
        return c21199gvJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C20330gep c20330gep, int i) {
        ((C12152chZ) c20330gep.ejfBZ()).KWHzl(i);
        c20330gep.AEQbTJ();
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        getParentFragmentManager().beginTransaction().hide(this).add(C13754dXa.ActionBar.DfrfUJ, C20324gej.Companion.OLrzqt(new Function1() { // from class: o.geo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20330gep.KWHzl(this.OLrzqt, (C20324gej) obj);
            }
        }), getTAG()).commitAllowingStateLoss();
    }

    public static final Unit KWHzl(C20330gep c20330gep, C20324gej c20324gej) {
        Intrinsics.checkNotNullParameter(c20324gej, "");
        c20330gep.getParentFragmentManager().beginTransaction().remove(c20324gej).show(c20330gep).commitAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Possible override for method o.gaF.OLrzqt()V */
    /* JADX WARN: Multi-variable type inference failed */
    public final android.view.View OLrzqt() {
        PlatformItem dapp = ((C12152chZ) ejfBZ()).OJuSTm().getDapp();
        java.lang.String urlOnlyHost = dapp != null ? dapp.getUrlOnlyHost() : null;
        if (urlOnlyHost == null || urlOnlyHost.length() == 0) {
            return null;
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57471yiz c57471yiz = new C57471yiz(contextRequireContext, null, 0, 6, null);
        c57471yiz.setViewDataBean(new TransactionGeneralInfoBean(C33070mpX.AYXKKw(C13754dXa.FragmentManager.openFileOutput), false, urlOnlyHost, null, null, null, null, null, 0.0f, null, 0.0f, false, null, null, null, null, null, null, null, 524282, null));
        return c57471yiz;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C20290geB, o.AbstractC20082gaF
    public void getFieldNames() {
        androidx.fragment.app.FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager == null) {
            return;
        }
        if (((C12152chZ) ejfBZ()).djBIcL()) {
            copydefault(fragmentManager, new Function0() { // from class: o.gev
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C20330gep.EZpvd(this.copydefault);
                }
            });
        } else {
            super.getFieldNames();
        }
    }

    public static final Unit EZpvd(C20330gep c20330gep) {
        super.getFieldNames();
        return Unit.INSTANCE;
    }

    public final void copydefault(androidx.fragment.app.FragmentManager fragmentManager, final Function0<Unit> function0) {
        DefiWalletVReminderDFragment.Companion.EZpvd(new DefiWalletVReminderDFragment.ReminderDataBean(C52761wXj.TaskDescription.NRYds, null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.fqaWRL), C33070mpX.AYXKKw(C13754dXa.FragmentManager.ZpNRhN), C33070mpX.AYXKKw(C13754dXa.FragmentManager.QAQCdZ), C33070mpX.AYXKKw(C13754dXa.FragmentManager.AxsJAYsNCnLh), 2, null)).AEQbTJ(fragmentManager, new Function1() { // from class: o.ger
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20330gep.copydefault(function0, (java.lang.Integer) obj);
            }
        });
    }

    public static final Unit copydefault(Function0 function0, java.lang.Integer num) {
        if (num != null && num.intValue() == 1) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    @Override // o.C20290geB, o.AbstractC20082gaF
    public void copydefault(@NotNull java.util.Collection<? extends AbstractC9832bcy> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        AbstractC9832bcy abstractC9832bcy = (AbstractC9832bcy) CollectionsKt___CollectionsKt.RcXXUw(collection);
        if (abstractC9832bcy instanceof C9820bcm) {
            KWHzl();
        } else if (abstractC9832bcy instanceof C9818bck) {
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, ((C9818bck) abstractC9832bcy).OLrzqt(), (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 61, (DefaultConstructorMarker) null));
        }
        super.copydefault(collection);
    }

    private final void KWHzl() {
        if (C33129mqd.valueOf(java.lang.Integer.valueOf(this.copydefault), 0)) {
            C57445yiZ c57445yiZ = C57445yiZ.copydefault;
            FragmentActivity activity = getActivity();
            if (activity == null) {
                return;
            }
            androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            int i = C13754dXa.ActionBar.DfrfUJ;
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.AlertController4);
            C14128dfc c14128dfc = C14128dfc.KWHzl;
            FragmentActivity activity2 = getActivity();
            if (activity2 == null) {
                return;
            }
            android.content.res.Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            c57445yiZ.copydefault(activity, parentFragmentManager, i, new RiskPageInfoBean(strAYXKKw, c14128dfc.copydefault(activity2, resources, C13754dXa.FragmentManager.MediaControllerCompatApi24TransportControls, "case", (48 & 16) != 0 ? null : null, (48 & 32) != 0 ? null : null), null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaSession), C33070mpX.AYXKKw(C13754dXa.FragmentManager.addOnActiveChangeListener), C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKt), C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatCallback), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getRemoteControlClient), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaSession), null, false, 1540, null), (496 & 16) != 0 ? null : null, (496 & 32) != 0 ? null : null, (496 & 64) != 0 ? null : null, (496 & 128) != 0 ? null : null, (496 & 256) != 0 ? null : null);
        }
        this.copydefault++;
    }
}
