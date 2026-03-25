package o;

import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.CeDefiTransferSignData;
import com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.bean.BroadcastBean;
import com.okinc.business.defi.biz.core.transaction.bean.CommonExtJson;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.biz.core.ws.channel.WalletCoinAssetSubManager;
import com.okinc.business.defi.biz.net.bean.CeDefiCreateUopReq;
import com.okinc.business.defi.biz.net.bean.CeDefiCreateUopResp;
import com.okinc.business.defi.biz.net.bean.CeDefiEvmGasLimit;
import com.okinc.business.defi.biz.net.bean.CeDefiEvmGasPrice;
import com.okinc.business.defi.biz.net.bean.CeDefiGasLimitReq;
import com.okinc.business.defi.biz.net.bean.CeDefiGasResp;
import com.okinc.business.defi.biz.net.bean.CeDefiPreCreateOrderReq;
import com.okinc.business.defi.biz.net.bean.CeDefiPreCreateOrderResp;
import com.okinc.business.defi.biz.net.bean.CeDefiSendUopReq;
import com.okinc.business.defi.biz.net.bean.CeDefiSolGas;
import com.okinc.business.defi.biz.net.bean.TxToastCheckRes;
import com.okinc.network.okg.response.ResponseData;
import java.math.RoundingMode;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import o.AbstractC8744bIW;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bIF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8727bIF<Fee extends AbstractC8744bIW> extends AbstractC8564bFB<Fee, CeDefiTransferSignData> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public CeDefiGasResp KWHzl;
    public OKWBaseTransaction.TransactionType AEQbTJ = OKWBaseTransaction.TransactionType.Transfer;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.bIE
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC8727bIF.copydefault(this.AEQbTJ);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void AEQbTJ(@NotNull java.util.List<TxToastCheckRes> list) {
        Intrinsics.checkNotNullParameter(list, "");
    }

    @Override // o.AbstractC8564bFB
    public boolean DCUTEI() {
        return false;
    }

    public abstract java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC8564bFB
    public void OLrzqt(@NotNull java.util.List<TxToastCheckRes> list) {
        Intrinsics.checkNotNullParameter(list, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.lang.String ag_() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public OKWBaseTransaction.TransactionType k_() {
        return this.AEQbTJ;
    }

    @Override // o.AbstractC8564bFB
    public java.lang.String l_() {
        return null;
    }

    @Override // o.AbstractC8564bFB
    public boolean q_() {
        return true;
    }

    @Override // o.AbstractC8564bFB
    public void x_() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AbstractC8744bIW OLrzqt(AbstractC8727bIF abstractC8727bIF) {
        return (AbstractC8744bIW) abstractC8727bIF.DXXBbs();
    }

    /* JADX INFO: renamed from: o.bIF$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bIF.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final CeDefiGasResp AEQbTJ() {
        CeDefiGasResp ceDefiGasResp = this.KWHzl;
        if (ceDefiGasResp != null) {
            return ceDefiGasResp;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.AbstractC8564bFB, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> s_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAxsJAYsNCnLh = AxsJAYsNCnLh();
        AbstractC58185ywX<Unit> abstractC58185ywXEZpvd = OqFWZa().EZpvd(DAIeex());
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXR_ = r_();
        final yHO yho = new yHO() { // from class: o.bIQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return AbstractC8727bIF.AEQbTJ(this.AEQbTJ, (kotlin.Pair) obj, (Unit) obj2, (kotlin.Pair) obj3);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd2 = AbstractC58185ywX.EZpvd(abstractC58185ywXAxsJAYsNCnLh, abstractC58185ywXEZpvd, abstractC58185ywXR_, new InterfaceC58228yxN() { // from class: o.bIP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58228yxN
            public final java.lang.Object AEQbTJ(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return AbstractC8727bIF.EZpvd(yho, obj, obj2, obj3);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd2, "");
        return abstractC58185ywXEZpvd2;
    }

    public static final kotlin.Pair EZpvd(yHO yho, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Intrinsics.checkNotNullParameter(obj3, "");
        return (kotlin.Pair) yho.invoke(obj, obj2, obj3);
    }

    public static final kotlin.Pair AEQbTJ(AbstractC8727bIF abstractC8727bIF, kotlin.Pair pair, Unit unit, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(unit, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        if (!((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return pair;
        }
        if (!((java.lang.Boolean) pair2.getFirst()).booleanValue()) {
            return pair2;
        }
        abstractC8727bIF.AhwBna();
        abstractC8727bIF.EZpvd();
        abstractC8727bIF.run();
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
    }

    public final java.lang.String KWHzl() {
        return (java.lang.String) this.copydefault.getValue();
    }

    public static final java.lang.String copydefault(AbstractC8727bIF abstractC8727bIF) {
        return "subCoinAsset-OKWCeDefiSignTransfer-" + abstractC8727bIF;
    }

    /* JADX INFO: renamed from: o.bIF$StateListAnimator */
    public static final class StateListAnimator extends WalletCoinAssetSubManager.TaskDescription {
        public final /* synthetic */ AbstractC8727bIF<Fee> AEQbTJ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(AbstractC8727bIF<Fee> abstractC8727bIF, java.lang.String str) {
            super(str, null, null, true, 6, null);
            this.AEQbTJ = abstractC8727bIF;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: SignData */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.xZF.TaskDescription
        public void EZpvd(java.util.List<WalletCoinAssetSubManager.SubResponse> list) {
            java.lang.Object next;
            boolean zEZpvd;
            Intrinsics.checkNotNullParameter(list, "");
            super.EZpvd(list);
            AbstractC8727bIF<Fee> abstractC8727bIF = this.AEQbTJ;
            java.util.Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                WalletCoinAssetSubManager.SubResponse subResponse = (WalletCoinAssetSubManager.SubResponse) next;
                if (Intrinsics.EZpvd((java.lang.Object) subResponse.getAddress(), (java.lang.Object) ((CeDefiTransferSignData) abstractC8727bIF.QVsKAR()).getFromAddress())) {
                    java.lang.Long chainId = subResponse.getChainId();
                    long jFetchVPNInfo = abstractC8727bIF.dHguZz().fetchVPNInfo();
                    if (chainId != null && chainId.longValue() == jFetchVPNInfo) {
                        if (Intrinsics.EZpvd(subResponse.isBaseCoin(), java.lang.Boolean.TRUE)) {
                            zEZpvd = AbstractC8727bIF.OLrzqt((AbstractC8727bIF) abstractC8727bIF).DbNXlk();
                        } else {
                            zEZpvd = Intrinsics.EZpvd((java.lang.Object) subResponse.getTokenAddress(), (java.lang.Object) abstractC8727bIF.AEQbTJ().getFeeTokenAddress());
                        }
                        if (zEZpvd) {
                            break;
                        }
                    }
                }
            }
            WalletCoinAssetSubManager.SubResponse subResponse2 = (WalletCoinAssetSubManager.SubResponse) next;
            if (subResponse2 == null) {
                return;
            }
            CeDefiGasResp ceDefiGasRespAEQbTJ = this.AEQbTJ.AEQbTJ();
            java.lang.String coinAmount = subResponse2.getCoinAmount();
            if (coinAmount == null) {
                return;
            }
            ceDefiGasRespAEQbTJ.setFeeTokenBalance(coinAmount);
            this.AEQbTJ.AhwBna();
        }
    }

    public final void EZpvd() {
        C11205cFp.EZpvd.zLjUOn().AEQbTJ(new StateListAnimator(this, KWHzl()));
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> r_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXR_ = super.r_();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXOLrzqt = OLrzqt();
        final Function2 function2 = new Function2() { // from class: o.bIT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return AbstractC8727bIF.OLrzqt((kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXR_, abstractC58185ywXOLrzqt, new InterfaceC58223yxI() { // from class: o.bII
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return AbstractC8727bIF.OLrzqt(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair OLrzqt(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final kotlin.Pair OLrzqt(kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        return !((java.lang.Boolean) pair.getFirst()).booleanValue() ? pair : !((java.lang.Boolean) pair2.getFirst()).booleanValue() ? pair2 : C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    @Override // o.AbstractC8564bFB, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void fFgQHt() {
        super.fFgQHt();
        C11205cFp.EZpvd.zLjUOn().OLrzqt(KWHzl());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: SignData */
    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> OLrzqt() {
        C13934dbu c13934dbuOFhtUX = OFhtUX();
        CeDefiTransferSignData ceDefiTransferSignData = (CeDefiTransferSignData) QVsKAR();
        AbstractC58185ywX<ResponseData<CeDefiGasResp>> abstractC58185ywXOLrzqt = c13934dbuOFhtUX.OLrzqt(new CeDefiGasLimitReq(ceDefiTransferSignData.getAccountId(), 2, 600, ceDefiTransferSignData.getChainIndex(), C33488mxR.EZpvd(new CeDefiGasLimitReq.CeDefiGasLimitReqBizExtraData(ceDefiTransferSignData.getTokenAddress(), ceDefiTransferSignData.getToAddress(), 0, ceDefiTransferSignData.getTokenAmount()))));
        final Function1 function1 = new Function1() { // from class: o.bIO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC8727bIF.AEQbTJ(this.AEQbTJ, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bIN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC8727bIF.djBIcL(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> ffGIBT() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8564bFB
    public java.lang.String zLjUOn() {
        return ((CeDefiTransferSignData) QVsKAR()).getToAddress();
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<Unit> p_() {
        AbstractC58185ywX<Unit> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(Unit.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r5v14, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r5v18, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r5v9, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8564bFB
    public void AhwBna() {
        if (DXXBbs().fJNWhG()) {
            return;
        }
        java.lang.String strAEQbTJ = DXXBbs().AEQbTJ();
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) AEQbTJ().getFeeTokenAddress(), (java.lang.Object) ((CeDefiTransferSignData) QVsKAR()).getTokenAddress());
        if (zEZpvd && C33129mqd.AEQbTJ(((CeDefiTransferSignData) QVsKAR()).getOriginTokenAmount(), strAEQbTJ)) {
            ((CeDefiTransferSignData) QVsKAR()).setTokenAmount(C54862xYb.convertToBigIntegerString$default(C54862xYb.AEQbTJ(((CeDefiTransferSignData) QVsKAR()).getOriginTokenAmount(), strAEQbTJ), true, (RoundingMode) null, 2, (java.lang.Object) null));
        }
        boolean zCopydefault = C33129mqd.copydefault(AEQbTJ().getFeeTokenBalance(), strAEQbTJ);
        boolean z = C33129mqd.valueOf(AEQbTJ().getMinTransferAmount(), 0) || C33129mqd.copydefault(((CeDefiTransferSignData) QVsKAR()).getTokenAmount(), AEQbTJ().getMinTransferAmount());
        C8497bDo c8497bDoDLWbHP = DLWbHP();
        C9785bcD[] c9785bcDArr = new C9785bcD[2];
        c9785bcDArr[0] = new C9784bcC(zEZpvd ? zCopydefault && z : zCopydefault, DXXBbs().AYXKKw(), null, 4, null);
        if (zEZpvd) {
            z = true;
        }
        c9785bcDArr[1] = new C9808bca(z, null);
        c8497bDoDLWbHP.OLrzqt(yDY.gEmmrt(c9785bcDArr));
    }

    @Override // o.AbstractC8564bFB
    public java.util.ArrayList<java.lang.Integer> AuCTelauCTel() {
        return new java.util.ArrayList<>();
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.util.ArrayList<java.lang.Integer> getNewProxyInstance() {
        return new java.util.ArrayList<>();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r3v11, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r3v13, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r3v7, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r3v9, resolved type: SignData */
    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public final AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull final java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        C13934dbu c13934dbuOFhtUX = OFhtUX();
        java.lang.String chainIndex = ((CeDefiTransferSignData) QVsKAR()).getChainIndex();
        java.lang.String toAddress = ((CeDefiTransferSignData) QVsKAR()).getToAddress();
        CeDefiEvmGasLimit gasLimit = AEQbTJ().getGasLimit();
        CeDefiEvmGasPrice gasPrice = AEQbTJ().getGasPrice();
        CeDefiSolGas gasFeeInfo = AEQbTJ().getGasFeeInfo();
        java.lang.String accountId = ((CeDefiTransferSignData) QVsKAR()).getAccountId();
        java.lang.String tokenAddress = ((CeDefiTransferSignData) QVsKAR()).getTokenAddress();
        java.lang.String toAddress2 = ((CeDefiTransferSignData) QVsKAR()).getToAddress();
        java.lang.String tokenAmount = ((CeDefiTransferSignData) QVsKAR()).getTokenAmount();
        int gasPayType = AEQbTJ().getGasPayType();
        int paymasterName = AEQbTJ().getPaymasterName();
        AbstractC58185ywX<ResponseData<CeDefiPreCreateOrderResp>> abstractC58185ywXOLrzqt = c13934dbuOFhtUX.OLrzqt(new CeDefiPreCreateOrderReq(chainIndex, toAddress, 600, gasLimit, gasPrice, gasFeeInfo, 2, accountId, C33488mxR.EZpvd(new CeDefiPreCreateOrderReq.CeDefiPreCreateOrderReqBizExtraData(tokenAddress, toAddress2, 0, tokenAmount, java.lang.Integer.valueOf(gasPayType), new CeDefiPreCreateOrderReq.CeDefiPreCreateOrderReqBizExtraData.CeDefiPreCreateOrderReqBizExtraDataGasToken(java.lang.Integer.valueOf(paymasterName), AEQbTJ().getFeeTokenCoinTypeNo())))));
        final Function1 function1 = new Function1() { // from class: o.bIK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC8727bIF.OLrzqt(this.EZpvd, str, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXOLrzqt.KWHzl(new InterfaceC58229yxO() { // from class: o.bIR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC8727bIF.AYXKKw(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AhwBna(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: SignData */
    /* JADX DEBUG: Type inference failed for r9v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<ResponseData<DappTxResultBean>> copydefault(@NotNull final BroadcastBean broadcastBean, java.lang.String str, SignAuthType signAuthType) {
        Intrinsics.checkNotNullParameter(broadcastBean, "");
        AbstractC58185ywX<ResponseData<JsonElement>> abstractC58185ywXKWHzl = OFhtUX().KWHzl(new CeDefiSendUopReq(broadcastBean.getSignType(), new CeDefiSendUopReq.CeDefiSendUopReqSignedMsg(htlTjW(), broadcastBean.getSignedTx()), broadcastBean.getUopHash(), 2, ((CeDefiTransferSignData) QVsKAR()).getAccountId()));
        final Function1 function1 = new Function1() { // from class: o.bIJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC8727bIF.EZpvd(this.AEQbTJ, broadcastBean, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bIL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC8727bIF.AEQbTJ(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData AEQbTJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData EZpvd(AbstractC8727bIF abstractC8727bIF, BroadcastBean broadcastBean, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return abstractC8727bIF.AhwBna(new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, new DappTxResultBean(broadcastBean.getSignedTx(), (java.lang.String) null, broadcastBean.getUopHash(), (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.String) null, 122, (DefaultConstructorMarker) null), null, 44, null));
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!z) {
            return str;
        }
        return C54880xYt.formatValuation$default(pTB.OLrzqt((java.lang.Object) str), 0, 0, null, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, zuWLRA().KWHzl(), null, false, 103, null);
    }

    public final <T> ResponseData<T> AhwBna(ResponseData<T> responseData) {
        java.lang.String content;
        JsonPrimitive jsonPrimitive;
        if (responseData.getCode() == 9998) {
            try {
                Result.Application application = Result.Companion;
                java.lang.String msg = responseData.getMsg();
                Json.Default r1 = Json.Default;
                r1.getSerializersModule();
                JsonObject jsonObject = (JsonObject) r1.decodeFromString(JsonObject.Companion.serializer(), msg);
                int i = java.lang.Integer.parseInt(java.lang.String.valueOf(jsonObject.get((java.lang.Object) "code")));
                JsonElement jsonElement = (JsonElement) jsonObject.get((java.lang.Object) "msg");
                if (jsonElement == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null || (content = jsonPrimitive.getContent()) == null) {
                    content = "";
                }
                return ResponseData.copy$default(responseData, i, content, null, null, null, null, 60, null);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        return responseData;
    }

    public static final kotlin.Pair AEQbTJ(AbstractC8727bIF abstractC8727bIF, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            abstractC8727bIF.KWHzl = (CeDefiGasResp) data;
        } else {
            abstractC8727bIF.KWHzl = new CeDefiGasResp(0, "", "", 0, "", "", 0, 0, false, "", 0, 0, "", "", "", (CeDefiEvmGasLimit) null, (CeDefiEvmGasPrice) null, (CeDefiSolGas) null, (java.lang.String) null, 262144, (DefaultConstructorMarker) null);
            abstractC8727bIF.DLWbHP().AEQbTJ(new C9868bdh(false, C33070mpX.AYXKKw(C13754dXa.FragmentManager.onCreateView), null, java.lang.Boolean.TRUE, 4, null));
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC60096zvd EZpvd(AbstractC8727bIF abstractC8727bIF, java.lang.String str, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            CeDefiCreateUopResp ceDefiCreateUopResp = (CeDefiCreateUopResp) data;
            BroadcastBean broadcastBeanGenerateCommonBroadcastModel$default = AbstractC8564bFB.generateCommonBroadcastModel$default(abstractC8727bIF, abstractC8727bIF.KWHzl(str, ceDefiCreateUopResp.getServerOption().getHash()), null, 0L, "0", ((AbstractC8422bCS) abstractC8727bIF.DXXBbs()).AEQbTJ(), new CommonExtJson(abstractC8727bIF.dHguZz().valueOf(), 0, null), null, null, null, 448, null);
            broadcastBeanGenerateCommonBroadcastModel$default.setSignType(java.lang.Integer.valueOf(ceDefiCreateUopResp.getSignType()));
            broadcastBeanGenerateCommonBroadcastModel$default.setUopHash(ceDefiCreateUopResp.getUopHash());
            Unit unit = Unit.INSTANCE;
            return AbstractC58185ywX.KWHzl(new ResponseData(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(broadcastBeanGenerateCommonBroadcastModel$default), (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 254, (DefaultConstructorMarker) null), null, 46, null));
        }
        return AbstractC58185ywX.KWHzl(abstractC8727bIF.AhwBna(new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, null, null, 60, null)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC60096zvd OLrzqt(final AbstractC8727bIF abstractC8727bIF, final java.lang.String str, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            C13934dbu c13934dbuOFhtUX = abstractC8727bIF.OFhtUX();
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            AbstractC58185ywX<ResponseData<CeDefiCreateUopResp>> abstractC58185ywXEZpvd = c13934dbuOFhtUX.EZpvd(new CeDefiCreateUopReq(((CeDefiPreCreateOrderResp) data).getOrderId(), ((CeDefiTransferSignData) abstractC8727bIF.QVsKAR()).getAccountId()));
            final Function1 function1 = new Function1() { // from class: o.bIG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC8727bIF.EZpvd(this.copydefault, str, (ResponseData) obj);
                }
            };
            return abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.bIM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return AbstractC8727bIF.AhwBna(function1, obj);
                }
            });
        }
        return AbstractC58185ywX.KWHzl(new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, null, null, 60, null));
    }
}
