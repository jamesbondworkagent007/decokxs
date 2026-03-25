package o;

import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.biz.net.bean.DappBTCUTXOAllInfo;
import com.okinc.business.defi.biz.net.bean.DappBTCUTXOInfo;
import com.okinc.business.defi.biz.net.bean.DappBTCXRCAssetChange;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.web3Uilib.bean.RiskPageInfoBean;
import com.okinc.web3Uilib.bean.TransactionHeaderInfoBean;
import com.okinc.web3Uilib.bean.TransactionNetworkFeeBean;
import com.okinc.web3Uilib.bean.TransactionTopReminderInfoBean;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC20082gaF;
import o.C13754dXa;
import o.C21203gvN;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.gej, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C20324gej extends C20290geB<C12152chZ> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public Function1<? super C20324gej, Unit> fARcdN;
    public int uzCIH;

    /* JADX INFO: renamed from: o.gej$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gej.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C20324gej OLrzqt(@NotNull Function1<? super C20324gej, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            C20324gej c20324gej = new C20324gej();
            c20324gej.fARcdN = function1;
            return c20324gej;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r9v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC20082gaF, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, getViewLifecycleOwner(), false, new Function1() { // from class: o.gem
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20324gej.copydefault(this.OLrzqt, (OnBackPressedCallback) obj);
                }
            }, 2, null);
        }
        gEmmrt().KWHzl.setVisibility(((C12152chZ) ejfBZ()).values() ? 8 : 0);
        fXL fxl = fXL.copydefault;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        fxl.OLrzqt(contextRequireContext, parentFragmentManager, C13754dXa.ActionBar.DfrfUJ, (C12152chZ) ejfBZ(), new Function0() { // from class: o.geq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20324gej.copydefault(this.KWHzl);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(C20324gej c20324gej, OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        if (((C12152chZ) c20324gej.ejfBZ()).values()) {
            Function1<? super C20324gej, Unit> function1 = c20324gej.fARcdN;
            if (function1 != null) {
                function1.invoke(c20324gej);
            }
        } else {
            FragmentActivity activity = c20324gej.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C20324gej c20324gej) {
        FragmentActivity activity = c20324gej.getActivity();
        if (activity != null) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v16, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r12v22, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C20290geB, o.AbstractC20082gaF
    public void AEQbTJ(@NotNull AbstractC20082gaF<C12152chZ>.ActionBar actionBar, boolean z) {
        java.lang.String strKWHzl;
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(actionBar, "");
        if (OLrzqt()) {
            CDNSourceManager cDNSourceManager = CDNSourceManager.OLrzqt;
            CDNSourceManager.ImageSource imageSource = CDNSourceManager.ImageSource.TxConfirmContract;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            strKWHzl = cDNSourceManager.KWHzl(imageSource, contextRequireContext);
        } else {
            CDNSourceManager cDNSourceManager2 = CDNSourceManager.OLrzqt;
            CDNSourceManager.ImageSource imageSource2 = CDNSourceManager.ImageSource.TxConfirmSignMessage;
            android.content.Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            strKWHzl = cDNSourceManager2.KWHzl(imageSource2, contextRequireContext2);
        }
        java.lang.String str = strKWHzl;
        if (OLrzqt()) {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.callOnPanelClosed);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.closeSocket);
        }
        actionBar.OLrzqt(AbstractC20102gaZ.titleInfoView$default(this, str, strAYXKKw, null, null, null, null, null, 124, null));
        if (!OLrzqt()) {
            actionBar.OLrzqt(QbewEr());
            actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
        }
        java.util.List<android.view.View> listCopydefault = copydefault();
        if (listCopydefault != null) {
            actionBar.EZpvd(listCopydefault);
            actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
        }
        actionBar.OLrzqt(AbstractC20102gaZ.lineView$default(this, 0, 0, 3, null));
        android.view.View viewAEQbTJ = AEQbTJ();
        if (viewAEQbTJ != null) {
            actionBar.OLrzqt(viewAEQbTJ);
            actionBar.OLrzqt(AbstractC20102gaZ.lineView$default(this, 0, 0, 3, null));
        }
        actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
        actionBar.OLrzqt(KWHzl());
        if (!OLrzqt()) {
            actionBar.OLrzqt(djBIcL());
        }
        actionBar.OLrzqt(AbstractC20102gaZ.walletUsedView$default(this, null, ((C12152chZ) ejfBZ()).fERRXa().getAddressTypeText(), 1, null));
        if (OLrzqt()) {
            actionBar.OLrzqt(OcIXYQ());
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) ((C12152chZ) ejfBZ()).AEQbTJ(true))) {
            actionBar.OLrzqt(AbstractC20102gaZ.moreView$default(this, false, null, new Function1() { // from class: o.gei
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20324gej.AEQbTJ(this.copydefault, (AbstractC20082gaF.ActionBar) obj);
                }
            }, 3, null));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C20324gej c20324gej, AbstractC20082gaF.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        java.lang.String strAEQbTJ = ((C12152chZ) c20324gej.ejfBZ()).AEQbTJ(true);
        actionBar.copydefault(AbstractC20102gaZ.normalDataInMoreView$default(c20324gej, null, strAEQbTJ != null ? strAEQbTJ : "", 1, null));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: T */
    /* JADX DEBUG: Possible override for method o.gaF.OLrzqt()V */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OLrzqt() {
        return ((C12152chZ) ejfBZ()).DbNXlk() || ((C12152chZ) ejfBZ()).fetchVPNInfo();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.util.List<android.view.View> copydefault() {
        DappBTCUTXOAllInfo dappBTCUTXOAllInfoOLrzqt = ((C12152chZ) ejfBZ()).OLrzqt();
        java.util.ArrayList arrayList = null;
        java.util.List<DappBTCXRCAssetChange> assetChange = dappBTCUTXOAllInfoOLrzqt != null ? dappBTCUTXOAllInfoOLrzqt.getAssetChange() : null;
        if (assetChange != null && !assetChange.isEmpty()) {
            arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : assetChange) {
                java.lang.Integer direction = ((DappBTCXRCAssetChange) obj).getDirection();
                if (direction != null && direction.intValue() == 2) {
                    arrayList2.add(obj);
                }
            }
            if (!arrayList2.isEmpty()) {
                android.content.Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                C57422yiC c57422yiC = new C57422yiC(contextRequireContext, null, 0, 6, null);
                java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ArkbYM);
                fXL fxl = fXL.copydefault;
                android.content.Context contextRequireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                c57422yiC.setViewDataBean(new TransactionHeaderInfoBean(strAYXKKw, fxl.AEQbTJ(contextRequireContext2, "-", arrayList2), false, null, null, null, null, 124, null));
                c57422yiC.KWHzl().setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.QwvEab)));
                arrayList.add(c57422yiC);
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj2 : assetChange) {
                java.lang.Integer direction2 = ((DappBTCXRCAssetChange) obj2).getDirection();
                if (direction2 != null && direction2.intValue() == 1) {
                    arrayList3.add(obj2);
                }
            }
            if (!arrayList3.isEmpty()) {
                android.content.Context contextRequireContext3 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
                C57422yiC c57422yiC2 = new C57422yiC(contextRequireContext3, null, 0, 6, null);
                java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.sjbWxX);
                fXL fxl2 = fXL.copydefault;
                android.content.Context contextRequireContext4 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "");
                c57422yiC2.setViewDataBean(new TransactionHeaderInfoBean(strAYXKKw2, fxl2.AEQbTJ(contextRequireContext4, Marker.ANY_NON_NULL_MARKER, arrayList3), false, null, null, null, null, 124, null));
                c57422yiC2.KWHzl().setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.QwvEab)));
                arrayList.add(c57422yiC2);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: T */
    /* JADX DEBUG: Possible override for method o.geB.KWHzl()Lo/eUI; */
    /* JADX WARN: Multi-variable type inference failed */
    public final android.view.View KWHzl() {
        java.lang.String strKWHzl;
        java.lang.String gasFee;
        java.lang.String valuationFromFee$default = null;
        if (!((C12152chZ) ejfBZ()).AkhnZx()) {
            return null;
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57429yiJ c57429yiJ = new C57429yiJ(contextRequireContext, null, 0, 6, null);
        DappBTCUTXOAllInfo dappBTCUTXOAllInfoOLrzqt = ((C12152chZ) ejfBZ()).OLrzqt();
        C10854bwM c10854bwMDHguZz = ((C12152chZ) ejfBZ()).dHguZz();
        if (dappBTCUTXOAllInfoOLrzqt == null || (gasFee = dappBTCUTXOAllInfoOLrzqt.getGasFee()) == null) {
            strKWHzl = null;
        } else {
            strKWHzl = C54870xYj.KWHzl(gasFee, c10854bwMDHguZz.valueOf(), c10854bwMDHguZz.fZBcTu(), c10854bwMDHguZz.fJNWhG(), (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? DisplaySign.AUTO : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? RoundingMode.DOWN : null);
        }
        java.lang.String usdGasFee = dappBTCUTXOAllInfoOLrzqt != null ? dappBTCUTXOAllInfoOLrzqt.getUsdGasFee() : null;
        if (usdGasFee == null || usdGasFee.length() == 0) {
            valuationFromFee$default = "--";
        } else {
            java.lang.String usdGasFee2 = dappBTCUTXOAllInfoOLrzqt.getUsdGasFee();
            if (usdGasFee2 != null) {
                valuationFromFee$default = C54880xYt.formatValuationFromFee$default(usdGasFee2, null, false, false, 7, null);
            }
        }
        c57429yiJ.setViewDataBean(new TransactionNetworkFeeBean(null, null, C33069mpW.copydefault(C13754dXa.FragmentManager.bypassDispatchKeyEvent, C56423yEv.EZpvd(C56390yDp.OLrzqt("network", c10854bwMDHguZz.djBIcL()))), null, pTF.KWHzl.EZpvd(strKWHzl + " (" + valuationFromFee$default + ")"), null, null, null, null, null, false, null, null, 8171, null));
        return c57429yiJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v17, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v20, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final android.view.View AEQbTJ() {
        DappBTCUTXOAllInfo dappBTCUTXOAllInfoOLrzqt = ((C12152chZ) ejfBZ()).OLrzqt();
        if (!C33129mqd.KWHzl((java.util.Collection) (dappBTCUTXOAllInfoOLrzqt != null ? dappBTCUTXOAllInfoOLrzqt.getInputInfo() : null))) {
            return null;
        }
        DappBTCUTXOAllInfo dappBTCUTXOAllInfoOLrzqt2 = ((C12152chZ) ejfBZ()).OLrzqt();
        if (!C33129mqd.KWHzl((java.util.Collection) (dappBTCUTXOAllInfoOLrzqt2 != null ? dappBTCUTXOAllInfoOLrzqt2.getOutputInfo() : null))) {
            return null;
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C21213gvX c21213gvX = new C21213gvX(contextRequireContext);
        java.lang.String strHtlTjW = ((C12152chZ) ejfBZ()).htlTjW();
        C10854bwM c10854bwMDHguZz = ((C12152chZ) ejfBZ()).dHguZz();
        DappBTCUTXOAllInfo dappBTCUTXOAllInfoOLrzqt3 = ((C12152chZ) ejfBZ()).OLrzqt();
        java.util.List<DappBTCUTXOInfo> inputInfo = dappBTCUTXOAllInfoOLrzqt3 != null ? dappBTCUTXOAllInfoOLrzqt3.getInputInfo() : null;
        Intrinsics.copydefault(inputInfo);
        DappBTCUTXOAllInfo dappBTCUTXOAllInfoOLrzqt4 = ((C12152chZ) ejfBZ()).OLrzqt();
        java.util.List<DappBTCUTXOInfo> outputInfo = dappBTCUTXOAllInfoOLrzqt4 != null ? dappBTCUTXOAllInfoOLrzqt4.getOutputInfo() : null;
        Intrinsics.copydefault(outputInfo);
        c21213gvX.setInputAndOutput(strHtlTjW, c10854bwMDHguZz, inputInfo, outputInfo, new Function1() { // from class: o.gel
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20324gej.OLrzqt(this.AEQbTJ, (java.lang.String) obj);
            }
        });
        return c21213gvX;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C20324gej c20324gej, java.lang.String str) {
        C21203gvN.TaskDescription taskDescription = C21203gvN.Companion;
        DappBTCUTXOAllInfo dappBTCUTXOAllInfoOLrzqt = ((C12152chZ) c20324gej.ejfBZ()).OLrzqt();
        C21203gvN c21203gvNCopydefault = taskDescription.copydefault(dappBTCUTXOAllInfoOLrzqt != null ? dappBTCUTXOAllInfoOLrzqt.getExploreUrl() : null, str);
        androidx.fragment.app.FragmentManager parentFragmentManager = c20324gej.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        c21203gvNCopydefault.show(parentFragmentManager);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C20290geB, o.AbstractC20082gaF
    public void copydefault(@NotNull java.util.Collection<? extends AbstractC9832bcy> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        if (!((C12152chZ) ejfBZ()).values()) {
            AbstractC9832bcy abstractC9832bcy = (AbstractC9832bcy) CollectionsKt___CollectionsKt.RcXXUw(collection);
            if (abstractC9832bcy instanceof C9820bcm) {
                EZpvd();
            } else if (abstractC9832bcy instanceof C9818bck) {
                KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, ((C9818bck) abstractC9832bcy).OLrzqt(), (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 61, (DefaultConstructorMarker) null));
            }
        }
        super.copydefault(collection);
    }

    public final void EZpvd() {
        if (C33129mqd.valueOf(java.lang.Integer.valueOf(this.uzCIH), 0)) {
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
        this.uzCIH++;
    }
}
