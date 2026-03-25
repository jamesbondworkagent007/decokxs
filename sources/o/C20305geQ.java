package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.business.defi.biz.core.error.CoinMetaError;
import com.okinc.business.defi.biz.database.addressbook.entity.SendCoinRecordEntity;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.wallet.api.bean.WalletRechargeBean;
import com.okinc.web3Uilib.bean.TransactionHeaderInfoBean;
import com.okinc.web3Uilib.bean.TransactionTopReminderInfoBean;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C13754dXa;
import o.InterfaceC54829xWw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.geQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C20305geQ extends AbstractC20080gaD<C12266cjh> {
    public C57471yiz fARcdN;

    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v13, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v16, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v20, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v23, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v25, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC20082gaF
    public void AEQbTJ(@NotNull AbstractC20082gaF<C12266cjh>.ActionBar actionBar, boolean z) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        CDNSourceManager cDNSourceManager = CDNSourceManager.OLrzqt;
        CDNSourceManager.ImageSource imageSource = CDNSourceManager.ImageSource.TxConfirmMint;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        actionBar.OLrzqt(AbstractC20102gaZ.titleInfoView$default(this, cDNSourceManager.KWHzl(imageSource, contextRequireContext), C33070mpX.AYXKKw(C13754dXa.FragmentManager.applyFixedSizeWindow), null, null, null, null, null, 124, null));
        C57422yiC c57422yiCOLrzqt = OLrzqt("", "", null, null, null, "");
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.applyFixedSizeWindow);
        java.lang.String strDbNXlk = ((C12266cjh) ejfBZ()).fHqPtx().DbNXlk();
        C14726dqr c14726dqr = C14726dqr.OLrzqt;
        android.content.Context context = c57422yiCOLrzqt.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c57422yiCOLrzqt.setViewDataBean(new TransactionHeaderInfoBean(strAYXKKw, C56402yEa.EZpvd(new TransactionHeaderInfoBean.HeaderSimpleDataBean(0, 0.0f, 0, 0, strDbNXlk, null, c14726dqr.OLrzqt(context), null, C54870xYj.EZpvd(AbstractC8704bHj.getTransferAmount$default((AbstractC8704bHj) ejfBZ(), false, false, 3, null), ((C12266cjh) ejfBZ()).fHqPtx().valueOf(), ((C12266cjh) ejfBZ()).fHqPtx().DTwDnp(), null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : java.lang.Boolean.valueOf(((C12266cjh) ejfBZ()).fHqPtx().getNewProxyInstance()), (248 & 64) != 0 ? false : true, (248 & 128) != 0 ? RoundingMode.DOWN : null), ((C12266cjh) ejfBZ()).fHqPtx().fJNWhG(), false, ((C12266cjh) ejfBZ()).EZpvd(true), null, ((C12266cjh) ejfBZ()).fHqPtx().dNCPSb(), 1, null, null, null, null, null, 1021103, null)), false, null, null, null, null, 124, null));
        actionBar.OLrzqt(c57422yiCOLrzqt);
        actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
        actionBar.OLrzqt(AbstractC20102gaZ.lineView$default(this, 0, 0, 3, null));
        actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
        actionBar.OLrzqt(EZpvd());
        C57471yiz c57471yizQUSxYX = QUSxYX();
        this.fARcdN = c57471yizQUSxYX;
        actionBar.OLrzqt(c57471yizQUSxYX);
        actionBar.OLrzqt(AbstractC20102gaZ.walletUsedView$default(this, null, ((C12266cjh) ejfBZ()).fERRXa().getAddressTypeText(), 1, null));
        QVAiDq();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [o.bCW] */
    public final C57471yiz QUSxYX() {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57471yiz c57471yiz = new C57471yiz(contextRequireContext, null, 0, 6, null);
        c57471yiz.setHeaderTitleInfo(C33070mpX.AYXKKw(C13754dXa.FragmentManager.attachToWindow));
        c57471yiz.setContentInfo(((C12266cjh) ejfBZ()).TarCU() + " Sats " + AbstractC8426bCW.formatToFeeCurrencyAmount$default(((C12266cjh) ejfBZ()).QKudOq(), ((C12266cjh) ejfBZ()).TarCU(), false, false, false, 14, null));
        return c57471yiz;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [o.bCW] */
    /* JADX WARN: Type inference failed for: r1v5, types: [o.bCW] */
    public final void QVAiDq() {
        java.lang.String strULRxlR = ((C12266cjh) ejfBZ()).ULRxlR();
        java.lang.String str = AbstractC8426bCW.formatToFeeCoinAmount$default(((C12266cjh) ejfBZ()).QKudOq(), strULRxlR, false, false, false, 14, null) + AbstractC8426bCW.formatToFeeCurrencyAmount$default(((C12266cjh) ejfBZ()).QKudOq(), strULRxlR, false, false, false, 14, null);
        if (AEQbTJ()) {
            str = "--";
        }
        AbstractC20102gaZ.showTotalCostView$default(this, null, str, 1, null);
    }

    @Override // o.AbstractC20080gaD
    public void KWHzl(@NotNull AbstractC8426bCW<?> abstractC8426bCW, @NotNull C8486bDd c8486bDd) {
        Intrinsics.checkNotNullParameter(abstractC8426bCW, "");
        Intrinsics.checkNotNullParameter(c8486bDd, "");
        super.KWHzl(abstractC8426bCW, c8486bDd);
        QVAiDq();
    }

    @Override // o.AbstractC20080gaD
    public java.util.ArrayList<android.view.View> KWHzl() {
        java.util.ArrayList<android.view.View> arrayListKWHzl = super.KWHzl();
        C57471yiz c57471yiz = this.fARcdN;
        if (c57471yiz != null) {
            arrayListKWHzl.add(c57471yiz.EZpvd());
        }
        return arrayListKWHzl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r13v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r13v7, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC20080gaD, o.AbstractC20082gaF
    public void copydefault(@NotNull java.util.Collection<? extends AbstractC9832bcy> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        super.copydefault(collection);
        AEQbTJ(collection);
        AbstractC9832bcy abstractC9832bcy = (AbstractC9832bcy) CollectionsKt___CollectionsKt.RcXXUw(collection);
        if (abstractC9832bcy instanceof C9808bca) {
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.FQMcgE), C33069mpW.copydefault(C13754dXa.FragmentManager.fcfzuX, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", ((C12266cjh) ejfBZ()).fHqPtx().fJNWhG()))), new Function0() { // from class: o.geR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C20305geQ.KWHzl(this.copydefault);
                }
            }, (java.lang.CharSequence) null, (Function0) null, 49, (DefaultConstructorMarker) null));
            return;
        }
        if (abstractC9832bcy instanceof C9784bcC) {
            java.lang.String strFJNWhG = ((C11990ceW) ((C12266cjh) ejfBZ()).QKudOq()).KWHzl().getFeeCoinMeta().fJNWhG();
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33069mpW.copydefault(C13754dXa.FragmentManager.onFitSystemWindows, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", strFJNWhG))), C33069mpW.copydefault(C13754dXa.FragmentManager.fcfzuX, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", strFJNWhG))), new Function0() { // from class: o.geU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C20305geQ.EZpvd(this.KWHzl);
                }
            }, (java.lang.CharSequence) null, (Function0) null, 49, (DefaultConstructorMarker) null));
        } else if (abstractC9832bcy == null) {
            KWHzl((TransactionTopReminderInfoBean) null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C20305geQ c20305geQ) {
        C10854bwM c10854bwMFHqPtx = ((C12266cjh) c20305geQ.ejfBZ()).fHqPtx();
        InterfaceC54829xWw interfaceC54829xWw = (InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class);
        FragmentActivity activity = c20305geQ.getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov != null) {
            InterfaceC54829xWw.ActionBar.showRechargeDialog$default(interfaceC54829xWw, abstractActivityC33041mov, new WalletRechargeBean(C33129mqd.gEmmrt(java.lang.Long.valueOf(c10854bwMFHqPtx.fetchVPNInfo())), C33129mqd.gEmmrt(c10854bwMFHqPtx.OLrzqt()), "wallet", "balance", yDY.copydefault("gas_station"), (java.util.ArrayList) null, false, (java.lang.String) null, ((C12266cjh) c20305geQ.ejfBZ()).fERRXa().getAddressType(), 224, (DefaultConstructorMarker) null), 0, null, 12, null);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Fee */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C20305geQ c20305geQ) throws CoinMetaError {
        c20305geQ.gHZMYf();
        C10854bwM c10854bwMAYXKKw = ((C11990ceW) ((C12266cjh) c20305geQ.ejfBZ()).QKudOq()).AYXKKw();
        InterfaceC54829xWw interfaceC54829xWw = (InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class);
        FragmentActivity activity = c20305geQ.getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov != null) {
            InterfaceC54829xWw.ActionBar.showRechargeDialog$default(interfaceC54829xWw, abstractActivityC33041mov, new WalletRechargeBean(C33129mqd.gEmmrt(java.lang.Long.valueOf(c10854bwMAYXKKw.fetchVPNInfo())), C33129mqd.gEmmrt(c10854bwMAYXKKw.OLrzqt()), "wallet", "gas", yDY.copydefault("dex"), (java.util.ArrayList) null, false, (java.lang.String) null, ((C12266cjh) c20305geQ.ejfBZ()).fERRXa().getAddressType(), 224, (DefaultConstructorMarker) null), 0, null, 12, null);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(java.util.Collection<? extends AbstractC9832bcy> collection) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            fXW fxwAkhnZx = AkhnZx();
            androidx.fragment.app.FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            fXW.dealFromAddressRisk$default(fxwAkhnZx, activity, supportFragmentManager, collection, false, 8, null);
        }
    }

    @Override // o.AbstractC20082gaF
    public void OLrzqt(@NotNull final C9748bbT c9748bbT) {
        Intrinsics.checkNotNullParameter(c9748bbT, "");
        C20690gle.OLrzqt.copydefault(true);
        KWHzl(new Function0() { // from class: o.geN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20305geQ.KWHzl(this.OLrzqt, c9748bbT);
            }
        });
        C32866mlf.onEvent$default("Web3SendCoin_SendResult_Api_Status", (TrackChannel[]) null, new Function1() { // from class: o.geP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20305geQ.AEQbTJ(c9748bbT, this, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(C20305geQ c20305geQ, C9748bbT c9748bbT) {
        FragmentActivity activity = c20305geQ.getActivity();
        if (activity != null) {
            android.content.Intent intentPutExtra = new android.content.Intent().putExtra("send_coin_status", true);
            java.lang.String strKWHzl = c9748bbT.KWHzl();
            if (strKWHzl == null) {
                strKWHzl = "";
            }
            activity.setResult(-1, intentPutExtra.putExtra("tx_hash", strKWHzl));
        }
        FragmentActivity activity2 = c20305geQ.getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C9748bbT c9748bbT, C20305geQ c20305geQ, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String strKWHzl = c9748bbT.KWHzl();
        eventParamsList.put("hash", strKWHzl != null ? strKWHzl : "", false);
        eventParamsList.put("network", ((C12266cjh) c20305geQ.ejfBZ()).dHguZz().fJNWhG(), false);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(final Function0<Unit> function0) {
        java.lang.String string;
        SendCoinRecordEntity sendCoinRecordEntity = new SendCoinRecordEntity(null, null, null, null, null, 0L, 0, 127, null);
        C10854bwM c10854bwMFHqPtx = ((C12266cjh) ejfBZ()).fHqPtx();
        java.lang.String strZLjUOn = ((C12266cjh) ejfBZ()).zLjUOn();
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("ens_domain")) == null) {
            string = "";
        }
        if (string.length() > 0 && StringsKt__StringsKt.contains$default((java.lang.CharSequence) string, (java.lang.CharSequence) JwtUtilsKt.JWT_DELIMITER, false, 2, (java.lang.Object) null)) {
            sendCoinRecordEntity.setAddress(string);
        } else {
            sendCoinRecordEntity.setAddress(strZLjUOn);
        }
        sendCoinRecordEntity.setChainId(C33129mqd.gEmmrt(java.lang.Long.valueOf(c10854bwMFHqPtx.AhwBna())));
        sendCoinRecordEntity.setWalletId(((C12266cjh) ejfBZ()).dUDNAs().DbNXlk());
        sendCoinRecordEntity.setChainName(c10854bwMFHqPtx.djBIcL());
        java.util.List<C13853daS> listAEQbTJ = C13847daM.Companion.AEQbTJ(strZLjUOn);
        if (listAEQbTJ.isEmpty()) {
            sendCoinRecordEntity.setChainUrl(c10854bwMFHqPtx.DbNXlk());
        } else {
            for (C13853daS c13853daS : listAEQbTJ) {
                if (Intrinsics.EZpvd((java.lang.Object) c13853daS.copydefault().djBIcL(), (java.lang.Object) sendCoinRecordEntity.getChainName())) {
                    sendCoinRecordEntity.setChainUrl(c13853daS.copydefault().DbNXlk());
                }
            }
        }
        sendCoinRecordEntity.setCreateTime(java.lang.System.currentTimeMillis());
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 != null && arguments2.getBoolean("is_smart_account")) {
            sendCoinRecordEntity.setSmartContract();
        }
        AbstractC58260yxt<java.lang.Long> abstractC58260yxtKWHzl = cGL.KWHzl.KWHzl(sendCoinRecordEntity);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        AbstractC58260yxt abstractC58260yxtAEQbTJ = C58156yvv.AEQbTJ(abstractC58260yxtKWHzl, viewLifecycleOwner, Lifecycle.Event.ON_DESTROY);
        final Function1 function1 = new Function1() { // from class: o.geO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20305geQ.AEQbTJ(function0, (java.lang.Long) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.geM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C20305geQ.AYXKKw(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.geS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20305geQ.copydefault(function0, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.geV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C20305geQ.AkhnZx(function12, obj);
            }
        });
    }

    public static final Unit AEQbTJ(Function0 function0, java.lang.Long l) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void AkhnZx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(Function0 function0, java.lang.Throwable th) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
