package o;

import androidx.core.view.PointerIconCompat;
import androidx.fragment.app.FragmentActivity;
import com.flyco.tablayout.BuildConfig;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.business.defi.api.model.tx.signdata.PlatformItem;
import com.okinc.business.defi.biz.core.error.CoinMetaError;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.UTXONftInfo;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.wallet.api.bean.WalletBtcAddressBean;
import com.okinc.wallet.api.bean.WalletRechargeBean;
import com.okinc.web3Uilib.bean.TransactionTopReminderInfoBean;
import com.okinc.web3Uilib.bean.TransferAssetInfoBean;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.InterfaceC54829xWw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gfd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C20371gfd extends AbstractC20080gaD<C12149chW> {
    public C57457yil fARcdN;

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r15v17, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r15v23, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r15v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC20082gaF
    public void AEQbTJ(@NotNull AbstractC20082gaF<C12149chW>.ActionBar actionBar, boolean z) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        CDNSourceManager cDNSourceManager = CDNSourceManager.OLrzqt;
        CDNSourceManager.ImageSource imageSource = CDNSourceManager.ImageSource.TxConfirmTransfer;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        java.lang.String strKWHzl = cDNSourceManager.KWHzl(imageSource, contextRequireContext);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.gkZNMa);
        PlatformItem dapp = ((C12149chW) ejfBZ()).OJuSTm().getDapp();
        java.lang.String urlOnlyHost = dapp != null ? dapp.getUrlOnlyHost() : null;
        actionBar.OLrzqt(AbstractC20102gaZ.titleInfoView$default(this, strKWHzl, strAYXKKw, null, urlOnlyHost == null ? "" : urlOnlyHost, null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        for (UTXONftInfo uTXONftInfo : ((C12149chW) ejfBZ()).alsFma()) {
            java.lang.String imgUrl = uTXONftInfo.getImgUrl();
            java.lang.String strDbNXlk = ((C12149chW) ejfBZ()).dHguZz().DbNXlk();
            if (imgUrl == null || imgUrl.length() == 0) {
                imgUrl = strDbNXlk;
            }
            java.lang.String name = uTXONftInfo.getName();
            java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ensureSubDecor);
            if (name == null || name.length() == 0) {
                name = strAYXKKw2;
            }
            actionBar.OLrzqt(KWHzl(imgUrl, name));
            actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null)));
        }
        actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null)));
        actionBar.OLrzqt(AbstractC20102gaZ.lineView$default(this, 0, 0, 3, null));
        actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
        actionBar.OLrzqt(EZpvd());
        C57457yil c57457yilCopydefault = copydefault(new Function0() { // from class: o.gfe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20371gfd.valueOf(this.copydefault);
            }
        });
        this.fARcdN = c57457yilCopydefault;
        actionBar.OLrzqt(c57457yilCopydefault);
        actionBar.OLrzqt(AbstractC20102gaZ.walletUsedView$default(this, null, ((C12149chW) ejfBZ()).fERRXa().getAddressTypeText(), 1, null));
        actionBar.OLrzqt(AbstractC20102gaZ.addressView$default(this, C33070mpX.AYXKKw(C13754dXa.FragmentManager.setDrawerSlideAnimationEnabled), ((C12149chW) ejfBZ()).zLjUOn(), null, null, null, null, false, null, false, null, PointerIconCompat.TYPE_GRAB, null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit valueOf(C20371gfd c20371gfd) {
        C55251xgS c55251xgSEZpvd;
        android.widget.TextView textViewAEQbTJ;
        android.widget.TextView textViewCopydefault;
        C57457yil c57457yil = c20371gfd.fARcdN;
        if (c57457yil != null && (textViewCopydefault = c57457yil.copydefault()) != null) {
            textViewCopydefault.setText(((C12149chW) c20371gfd.ejfBZ()).QUSxYX());
        }
        C57457yil c57457yil2 = c20371gfd.fARcdN;
        if (c57457yil2 != null && (textViewAEQbTJ = c57457yil2.AEQbTJ()) != null) {
            textViewAEQbTJ.setText(c20371gfd.QbewEr());
        }
        C57457yil c57457yil3 = c20371gfd.fARcdN;
        if (c57457yil3 != null && (c55251xgSEZpvd = c57457yil3.EZpvd()) != null) {
            ChainAddress chainAddressRcXXUw = ((C12149chW) c20371gfd.ejfBZ()).RcXXUw();
            java.lang.String addressTypeText = chainAddressRcXXUw != null ? chainAddressRcXXUw.getAddressTypeText() : null;
            if (addressTypeText == null) {
                addressTypeText = "";
            }
            c55251xgSEZpvd.setText(addressTypeText);
        }
        return Unit.INSTANCE;
    }

    public final C57435yiP KWHzl(java.lang.String str, java.lang.String str2) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57435yiP c57435yiP = new C57435yiP(contextRequireContext, null, 0, 6, null);
        C14726dqr c14726dqr = C14726dqr.OLrzqt;
        android.content.Context context = c57435yiP.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c57435yiP.setViewDataBean(new TransferAssetInfoBean(str, c14726dqr.OLrzqt(context), C55298xhM.dp2px$default(8.0f, null, 1, null), 2, str2, "", null, "", null, true, 320, null));
        return c57435yiP;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final C57457yil copydefault(final Function0<Unit> function0) {
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcqEDu);
        java.lang.String strQUSxYX = ((C12149chW) ejfBZ()).QUSxYX();
        java.lang.String strQbewEr = QbewEr();
        ChainAddress chainAddressRcXXUw = ((C12149chW) ejfBZ()).RcXXUw();
        java.lang.String addressTypeText = chainAddressRcXXUw != null ? chainAddressRcXXUw.getAddressTypeText() : null;
        if (addressTypeText == null) {
            addressTypeText = "";
        }
        return AbstractC20102gaZ.addressView$default(this, strAYXKKw, strQUSxYX, null, strQbewEr, null, addressTypeText, false, null, true, new Function1() { // from class: o.gfi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20371gfd.copydefault(this.copydefault, function0, (C57457yil) obj);
            }
        }, BuildConfig.VERSION_CODE, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r13v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r13v6, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r13v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(final C20371gfd c20371gfd, final Function0 function0, C57457yil c57457yil) {
        Intrinsics.checkNotNullParameter(c57457yil, "");
        C13851daQ c13851daQ = new C13851daQ();
        androidx.fragment.app.FragmentManager parentFragmentManager = c20371gfd.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        c13851daQ.AEQbTJ(parentFragmentManager, ((C12149chW) c20371gfd.ejfBZ()).fHqPtx().AhwBna(), ((C12149chW) c20371gfd.ejfBZ()).dmfpNf(), ((C12149chW) c20371gfd.ejfBZ()).Dmq(), ((C12149chW) c20371gfd.ejfBZ()).QUSxYX(), new yHO() { // from class: o.gfg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C20371gfd.AEQbTJ(this.EZpvd, function0, (java.lang.String) obj, (java.lang.String) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }, new Function0() { // from class: o.gfh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20371gfd.QVAiDq();
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C20371gfd c20371gfd, Function0 function0, java.lang.String str, java.lang.String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        ((C12149chW) c20371gfd.ejfBZ()).AEQbTJ(new WalletBtcAddressBean(str, i, C54870xYj.KWHzl(str2, ((C12149chW) c20371gfd.ejfBZ()).dHguZz().valueOf()), "", ((C12149chW) c20371gfd.ejfBZ()).dHguZz().fJNWhG()));
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit QVAiDq() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v11, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v14, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String QbewEr() {
        java.lang.String strEZpvd;
        int i = C13754dXa.FragmentManager.fsSxsn;
        java.lang.String strOcIXYQ = ((C12149chW) ejfBZ()).OcIXYQ();
        if (strOcIXYQ != null) {
            strEZpvd = C54870xYj.EZpvd(strOcIXYQ, ((C12149chW) ejfBZ()).dHguZz().valueOf(), ((C12149chW) ejfBZ()).dHguZz().AkhnZx(), ((C12149chW) ejfBZ()).dHguZz().fJNWhG(), (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
        } else {
            strEZpvd = null;
        }
        if (strEZpvd == null) {
            strEZpvd = "";
        }
        return C33069mpW.copydefault(this, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("value", strEZpvd)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r13v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r13v7, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC20080gaD, o.AbstractC20082gaF
    public void copydefault(@NotNull java.util.Collection<? extends AbstractC9832bcy> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        super.copydefault(collection);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            fXW fxwAkhnZx = AkhnZx();
            androidx.fragment.app.FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            fXW.dealFromAddressRisk$default(fxwAkhnZx, activity, supportFragmentManager, collection, false, 8, null);
        }
        AbstractC9832bcy abstractC9832bcy = (AbstractC9832bcy) CollectionsKt___CollectionsKt.RcXXUw(collection);
        if (abstractC9832bcy instanceof C9808bca) {
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.FQMcgE), C33069mpW.copydefault(C13754dXa.FragmentManager.fcfzuX, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", ((C12149chW) ejfBZ()).fHqPtx().fJNWhG()))), new Function0() { // from class: o.gfk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C20371gfd.EZpvd(this.AEQbTJ);
                }
            }, (java.lang.CharSequence) null, (Function0) null, 49, (DefaultConstructorMarker) null));
            return;
        }
        if (abstractC9832bcy instanceof C9784bcC) {
            java.lang.String strFJNWhG = ((C11990ceW) ((C12149chW) ejfBZ()).QKudOq()).KWHzl().getFeeCoinMeta().fJNWhG();
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33069mpW.copydefault(C13754dXa.FragmentManager.onFitSystemWindows, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", strFJNWhG))), C33069mpW.copydefault(C13754dXa.FragmentManager.fcfzuX, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", strFJNWhG))), new Function0() { // from class: o.gfj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C20371gfd.KWHzl(this.EZpvd);
                }
            }, (java.lang.CharSequence) null, (Function0) null, 49, (DefaultConstructorMarker) null));
        } else if (abstractC9832bcy == null) {
            KWHzl((TransactionTopReminderInfoBean) null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C20371gfd c20371gfd) {
        C10854bwM c10854bwMFHqPtx = ((C12149chW) c20371gfd.ejfBZ()).fHqPtx();
        InterfaceC54829xWw interfaceC54829xWw = (InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class);
        FragmentActivity activity = c20371gfd.getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov != null) {
            InterfaceC54829xWw.ActionBar.showRechargeDialog$default(interfaceC54829xWw, abstractActivityC33041mov, new WalletRechargeBean(C33129mqd.gEmmrt(java.lang.Long.valueOf(c10854bwMFHqPtx.fetchVPNInfo())), C33129mqd.gEmmrt(c10854bwMFHqPtx.OLrzqt()), "wallet", "balance", yDY.copydefault("gas_station"), (java.util.ArrayList) null, false, (java.lang.String) null, ((C12149chW) c20371gfd.ejfBZ()).fERRXa().getAddressType(), 224, (DefaultConstructorMarker) null), 0, null, 12, null);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Fee */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C20371gfd c20371gfd) throws CoinMetaError {
        c20371gfd.gHZMYf();
        C10854bwM c10854bwMAYXKKw = ((C11990ceW) ((C12149chW) c20371gfd.ejfBZ()).QKudOq()).AYXKKw();
        InterfaceC54829xWw interfaceC54829xWw = (InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class);
        FragmentActivity activity = c20371gfd.getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov != null) {
            InterfaceC54829xWw.ActionBar.showRechargeDialog$default(interfaceC54829xWw, abstractActivityC33041mov, new WalletRechargeBean(C33129mqd.gEmmrt(java.lang.Long.valueOf(c10854bwMAYXKKw.fetchVPNInfo())), C33129mqd.gEmmrt(c10854bwMAYXKKw.OLrzqt()), "wallet", "gas", yDY.copydefault("dex"), (java.util.ArrayList) null, false, (java.lang.String) null, ((C12149chW) c20371gfd.ejfBZ()).fERRXa().getAddressType(), 224, (DefaultConstructorMarker) null), 0, null, 12, null);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC20082gaF
    public void OLrzqt(@NotNull C9748bbT c9748bbT) {
        Intrinsics.checkNotNullParameter(c9748bbT, "");
        KWHzl(c9748bbT);
    }
}
