package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.dexlogic.bean.DexQuoteBridgeVO;
import com.okinc.business.dexlogic.bean.MergeCallData;
import com.okinc.business.dexlogic.bean.OfflineQuote;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.TransactionBean;
import com.okinc.business.dexlogic.bean.UnsignedSwapData;
import com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.CallDataError;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hpw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23001hpw extends AbstractC22992hpn {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23001hpw(@NotNull java.lang.String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
    }

    @Override // o.AbstractC22992hpn
    public void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull MergeCallData mergeCallData, final Function1<? super InterfaceC9734bbF, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(mergeCallData, "");
        TransactionBean transactionBeanFJNWhG = fJNWhG();
        if (transactionBeanFJNWhG == null || transactionBeanFJNWhG.getQuotePriceRes() == null) {
            return;
        }
        C22374heE c22374heECopydefault = C22380heK.OLrzqt.copydefault(fetchVPNInfo());
        InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = c22374heECopydefault.fARcdN().AEQbTJ();
        if (interfaceC9738bbJAEQbTJ == null) {
            return;
        }
        KWHzl(str);
        OLrzqt(mergeCallData.getUnsingedCallData());
        AbstractC58260yxt<kotlin.Pair<InterfaceC9734bbF, java.lang.String>> abstractC58260yxtKWHzl = c22374heECopydefault.fARcdN().KWHzl(new SignDataArgs<>(interfaceC9738bbJAEQbTJ.DbNXlk(), null, C33129mqd.valueOf(str2), KWHzl(AEQbTJ()), null, null, null, null, null, null, 3, null, null, null, null, null, null, false, false, null, false, false, false, false, 16776178, null));
        final Function1 function12 = new Function1() { // from class: o.hpz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23001hpw.KWHzl(function1, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM<? super kotlin.Pair<InterfaceC9734bbF, java.lang.String>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hpC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23001hpw.AYXKKw(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.hpD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23001hpw.EZpvd(function1, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hpB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23001hpw.djBIcL(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ, call());
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(Function1 function1, kotlin.Pair pair) {
        if (function1 != null) {
            function1.invoke(pair != null ? (InterfaceC9734bbF) pair.getFirst() : null);
        }
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(Function1 function1, java.lang.Throwable th) {
        if (function1 != null) {
            function1.invoke(null);
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC22977hpY
    public AbstractC22974hpV copydefault() {
        return new C23097hrm(fetchVPNInfo(), this);
    }

    public final void OLrzqt(@NotNull final java.lang.String str) {
        QuotePriceRes value;
        OfflineQuote calldata;
        Intrinsics.checkNotNullParameter(str, "");
        UnsignedSwapData unsignedSwapDataAEQbTJ = AEQbTJ();
        if ((unsignedSwapDataAEQbTJ == null || (value = unsignedSwapDataAEQbTJ.getQuoteResult()) == null) && (value = hDKMBd().getValue()) == null) {
            return;
        }
        AbstractC22974hpV abstractC22974hpVCopydefault = copydefault();
        java.lang.String chainId = value.fromToken().getChainId();
        java.lang.String tokenContractAddress = value.fromToken().getTokenContractAddress();
        java.lang.String strPayAmount = value.payAmount();
        java.lang.String chainId2 = value.toToken().getChainId();
        java.lang.String tokenContractAddress2 = value.toToken().getTokenContractAddress();
        DexQuoteBridgeVO dexQuoteBridgeVOBridge = value.bridge();
        java.lang.String quote = (dexQuoteBridgeVOBridge == null || (calldata = dexQuoteBridgeVOBridge.getCalldata()) == null) ? null : calldata.getQuote();
        if (quote == null) {
            quote = "";
        }
        DexQuoteBridgeVO dexQuoteBridgeVOBridge2 = value.bridge();
        java.lang.String bridgeId = dexQuoteBridgeVOBridge2 != null ? dexQuoteBridgeVOBridge2.getBridgeId() : null;
        if (bridgeId == null) {
            bridgeId = "";
        }
        DexQuoteBridgeVO dexQuoteBridgeVOBridge3 = value.bridge();
        java.lang.String defiPlatformId = dexQuoteBridgeVOBridge3 != null ? dexQuoteBridgeVOBridge3.getDefiPlatformId() : null;
        if (defiPlatformId == null) {
            defiPlatformId = "";
        }
        java.lang.String strReceiveAmount = value.receiveAmount();
        java.lang.String walletAddressByType$default = AbstractC22977hpY.getWalletAddressByType$default(this, value.fromToken().getChainId(), null, 2, null);
        java.lang.String strMinimumReceived = value.minimumReceived();
        TransactionBean transactionBeanFJNWhG = fJNWhG();
        java.lang.String spSlipPage = transactionBeanFJNWhG != null ? transactionBeanFJNWhG.getSpSlipPage() : null;
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXOLrzqt = abstractC22974hpVCopydefault.OLrzqt(str, chainId, tokenContractAddress, strPayAmount, chainId2, tokenContractAddress2, quote, bridgeId, defiPlatformId, strReceiveAmount, walletAddressByType$default, strMinimumReceived, spSlipPage == null ? "" : spSlipPage, null);
        final Function1 function1 = new Function1() { // from class: o.hpE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23001hpw.copydefault(this.EZpvd, str, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM<? super ResponseData<java.lang.String>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hpF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23001hpw.isConnected(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hpG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23001hpw.AEQbTJ(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hpJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23001hpw.fetchVPNInfo(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ, call());
    }

    public static final void isConnected(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C23001hpw c23001hpw, java.lang.String str, ResponseData responseData) {
        C22380heK.OLrzqt.copydefault(c23001hpw.fetchVPNInfo()).OLrzqt(false).KWHzl(str);
        c23001hpw.DbNXlk().setValue(java.lang.Boolean.FALSE);
        c23001hpw.AhwBna().setValue(java.lang.Boolean.TRUE);
        return Unit.INSTANCE;
    }

    public static final void fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C23001hpw c23001hpw, java.lang.Throwable th) {
        c23001hpw.DbNXlk().setValue(java.lang.Boolean.FALSE);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.getShuffleMode);
        if (th instanceof OKServerException) {
            OKServerException oKServerException = (OKServerException) th;
            if (oKServerException.getCode() == 10055) {
                MutableLiveData<CallDataError> mutableLiveDataGEmmrt = c23001hpw.gEmmrt();
                java.lang.String message = oKServerException.getMessage();
                mutableLiveDataGEmmrt.setValue(new CallDataError("10055", message == null ? strAYXKKw : message, false, 4, (DefaultConstructorMarker) null));
            }
            InterfaceC22824hme interfaceC22824hmeOLrzqt = C22380heK.OLrzqt.copydefault(c23001hpw.fetchVPNInfo()).OLrzqt(false);
            java.lang.String message2 = oKServerException.getMessage();
            if (message2 != null) {
                strAYXKKw = message2;
            }
            interfaceC22824hmeOLrzqt.OLrzqt(strAYXKKw);
        }
        c23001hpw.AhwBna().setValue(java.lang.Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
