package o;

import com.google.gson.Gson;
import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.EVMContractSignData;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.common.WalletSelectedChainBean;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.bean.BroadcastBean;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.biz.core.transaction.sign.evm.bean.CustomEvmSignInfo;
import com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EvmSignInfoGasPrice;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.AddressCheck;
import com.okinc.business.defi.biz.net.bean.AddressCheckResItem;
import com.okinc.business.defi.biz.net.bean.ContractAddressResp;
import com.okinc.business.defi.biz.net.bean.FromAddressCheckReq;
import com.okinc.business.defi.biz.net.bean.FromAddressCheckRes;
import com.okinc.business.defi.biz.net.bean.PreExecTransactionReq;
import com.okinc.business.defi.biz.net.bean.TxToastCheckRes;
import com.okinc.business.defi.biz.net.bean.WalletGasLimitRes;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.TxMessage;
import com.okinc.wallet.core.sign.evm.EvmSignatureRawValue;
import com.okinc.wallet.core.sign.evm.SigData;
import com.okinc.wallet.core.sign.utxo.RSV;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import java.math.RoundingMode;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC8601bFm;
import o.C10614brl;
import o.InterfaceC9218bRT;
import o.InterfaceC9730bbB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bRR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9216bRR extends AbstractC8913bLg<C9338bTh, EVMContractSignData> implements InterfaceC9218bRT {
    public java.lang.String OcIXYQ;
    public EVMContractSignData QUSxYX;
    public java.lang.Integer QVAiDq;
    public java.lang.String QbewEr;
    public java.lang.Integer QfsBiF;
    public java.lang.String RJOkX;
    public CustomChainMeta djBIcL;
    public EVMContractSignData fetchVPNInfo;
    public java.lang.String valueOf;
    public final InterfaceC56387yDm ORxRYg = C56392yDr.copydefault(new Function0() { // from class: o.bSf
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C9216bRR.OLrzqt(this.copydefault);
        }
    });
    public final AbstractC8564bFB<?, ?> UeEOUB = this;
    public CustomEvmSignInfo aKErDB = new CustomEvmSignInfo((java.lang.String) null, (java.lang.String) null, (EvmSignInfoGasPrice) null, 7, (DefaultConstructorMarker) null);
    public WalletGasLimitRes AhwBna = new WalletGasLimitRes((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, 16383, (DefaultConstructorMarker) null);
    public boolean AYXKKw = true;

    /* JADX INFO: renamed from: o.bRR$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKWBaseTransaction.TransactionType.values().length];
            try {
                iArr[OKWBaseTransaction.TransactionType.Approve.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OKWBaseTransaction.TransactionType.CancelApprove.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
            int[] iArr2 = new int[WalletType.values().length];
            try {
                iArr2[WalletType.HDWallet.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[WalletType.KeyWallet.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[WalletType.MPCWallet.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            copydefault = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9218bRT
    public WalletGasLimitRes AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void AhwBna(boolean z) {
        this.AYXKKw = z;
    }

    @Override // o.AbstractC8564bFB
    public boolean DCUTEI() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: fetchVPNInfo()Lcom/okinc/business/defi/biz/core/transaction/sign/OKWBaseTransaction; */
    @Override // o.InterfaceC9217bRS
    /* JADX INFO: renamed from: DbNXlk, reason: merged with bridge method [inline-methods] */
    public AbstractC8564bFB<?, ?> fetchVPNInfo() {
        return this.UeEOUB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean ODXsMY() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@NotNull CustomChainMeta customChainMeta) {
        Intrinsics.checkNotNullParameter(customChainMeta, "");
        this.djBIcL = customChainMeta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9218bRT
    public void copydefault(java.lang.String str) {
        this.OcIXYQ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9218bRT
    public java.lang.String djBIcL() {
        return this.OcIXYQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9218bRT
    public CustomEvmSignInfo isConnected() {
        return this.aKErDB;
    }

    public void AhwBna(java.lang.String str) {
        InterfaceC9218bRT.StateListAnimator.OLrzqt(this, str);
    }

    public java.lang.String UeEOUB() {
        return InterfaceC9218bRT.StateListAnimator.copydefault(this);
    }

    public java.lang.String aKErDB() {
        return InterfaceC9218bRT.StateListAnimator.AEQbTJ(this);
    }

    @Override // o.InterfaceC9729bbA
    public java.lang.String copydefault() {
        return InterfaceC9218bRT.StateListAnimator.EZpvd(this);
    }

    public java.lang.String fARcdN() {
        return InterfaceC9218bRT.StateListAnimator.KWHzl(this);
    }

    /* JADX DEBUG: Method merged with bridge method: AkhnZx()Lo/bTi; */
    /* JADX DEBUG: Method merged with bridge method: DXXBbs()Lo/bCW; */
    @Override // o.AbstractC8564bFB
    /* JADX INFO: renamed from: djSkpj, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C9338bTh fJNWhG() {
        return (C9338bTh) this.ORxRYg.getValue();
    }

    public static final C9338bTh OLrzqt(C9216bRR c9216bRR) {
        return new C9338bTh(c9216bRR, c9216bRR);
    }

    @Override // o.InterfaceC9218bRT
    public CustomChainMeta valueOf() {
        CustomChainMeta customChainMeta = this.djBIcL;
        if (customChainMeta != null) {
            return customChainMeta;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public PreExecTransactionReq RdAHlO() {
        PreExecTransactionReq preExecTransactionReqRdAHlO = super.RdAHlO();
        preExecTransactionReqRdAHlO.setDappData(new Gson().toJson(super.QVsKAR()));
        preExecTransactionReqRdAHlO.setMethod("eth_sendTransaction");
        preExecTransactionReqRdAHlO.setChainIndex(dHguZz().isConnected());
        preExecTransactionReqRdAHlO.setRpcChain(true);
        return preExecTransactionReqRdAHlO;
    }

    @Override // o.AbstractC8913bLg, o.AbstractC8564bFB, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean KWHzl(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull C10854bwM c10854bwM, @NotNull SignDataArgs<EVMContractSignData> signDataArgs) {
        C10854bwM c10854bwMAEQbTJ;
        java.lang.String rpcUrl = "";
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(signDataArgs, "");
        if (signDataArgs.isChangedCustomRpc()) {
            rpcUrl = c10854bwM.RJOkX();
        } else {
            WalletSelectedChainBean walletSelectedChainBeanKWHzl = C10614brl.TaskDescription.getInstance$default(C10614brl.Companion, null, 1, null).KWHzl(abstractC12782ctV.DbNXlk());
            if (Intrinsics.EZpvd((java.lang.Object) walletSelectedChainBeanKWHzl.getChainId(), (java.lang.Object) java.lang.String.valueOf(c10854bwM.AEQbTJ()))) {
                rpcUrl = walletSelectedChainBeanKWHzl.getRpcUrl();
            }
        }
        CustomChainCoinMeta customChainCoinMetaEZpvd = C10598brV.AEQbTJ.EZpvd(signDataArgs.getGeneralChainId(), rpcUrl);
        if (customChainCoinMetaEZpvd == null || (c10854bwMAEQbTJ = customChainCoinMetaEZpvd.AEQbTJ()) == null) {
            return false;
        }
        boolean zKWHzl = super.KWHzl(abstractC12782ctV, c10854bwMAEQbTJ, signDataArgs);
        CustomChainMeta customChainMetaOLrzqt = customChainCoinMetaEZpvd.OLrzqt();
        if (customChainMetaOLrzqt == null) {
            return false;
        }
        OLrzqt(customChainMetaOLrzqt);
        return zKWHzl;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public ChainAddress OLrzqt(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(str, "");
        return InterfaceC9218bRT.StateListAnimator.KWHzl(this, abstractC12782ctV, str);
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AxsJAYsNCnLh() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.AbstractC8601bFm, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.util.ArrayList<java.lang.Integer> getNewProxyInstance() {
        return new java.util.ArrayList<>();
    }

    @Override // o.AbstractC8601bFm
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> OcIXYQ() {
        AbstractC58260yxt<ContractAddressResp> abstractC58260yxtAEQbTJ = C10598brV.AEQbTJ.AEQbTJ(aKErDB(), zLjUOn());
        final Function1 function1 = new Function1() { // from class: o.bSk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9216bRR.AEQbTJ(this.KWHzl, (ContractAddressResp) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = abstractC58260yxtAEQbTJ.copydefault(new InterfaceC58229yxO() { // from class: o.bSm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9216bRR.gGvvIC(function1, obj);
            }
        }).EZpvd();
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final kotlin.Pair gGvvIC(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair AEQbTJ(C9216bRR c9216bRR, ContractAddressResp contractAddressResp) {
        Intrinsics.checkNotNullParameter(contractAddressResp, "");
        c9216bRR.copydefault(contractAddressResp);
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public void x_() {
        DLWbHP().AEQbTJ(new C9828bcu(ORxRYg(), dHguZz(), fARcdN()));
    }

    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public void AhwBna() {
        DLWbHP().AEQbTJ(new C9826bcs(DTwDnp(), AkhnZx().AYXKKw(), fARcdN()));
    }

    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public java.util.ArrayList<java.lang.Integer> AuCTelauCTel() {
        return new java.util.ArrayList<>();
    }

    /* JADX DEBUG: Method merged with bridge method: QVsKAR()Lcom/okinc/business/defi/api/model/tx/signdata/BaseSignData; */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    /* JADX INFO: renamed from: fZBcTu, reason: merged with bridge method [inline-methods] */
    public EVMContractSignData QVsKAR() {
        EVMContractSignData eVMContractSignData = (EVMContractSignData) super.QVsKAR();
        if (!Intrinsics.EZpvd(this.fetchVPNInfo, eVMContractSignData)) {
            this.QUSxYX = (EVMContractSignData) xVA.EZpvd(eVMContractSignData);
            this.fetchVPNInfo = eVMContractSignData;
        }
        EVMContractSignData eVMContractSignData2 = this.QUSxYX;
        if (eVMContractSignData2 != null) {
            return eVMContractSignData2;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0109  */
    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean q_() {
        java.lang.String strOLrzqt;
        java.lang.Integer num;
        java.lang.Integer num2;
        java.lang.Integer num3;
        java.lang.String gasLimit;
        EVMContractSignData eVMContractSignDataQVsKAR = QVsKAR();
        java.lang.String gas = eVMContractSignDataQVsKAR.getGas();
        java.lang.String gasPrice = null;
        eVMContractSignDataQVsKAR.setGas(gas != null ? C33491mxU.OLrzqt(gas) : null);
        java.lang.String gasPrice2 = eVMContractSignDataQVsKAR.getGasPrice();
        eVMContractSignDataQVsKAR.setGasPrice(gasPrice2 != null ? C33491mxU.OLrzqt(gasPrice2) : null);
        java.lang.String gasLimit2 = eVMContractSignDataQVsKAR.getGasLimit();
        eVMContractSignDataQVsKAR.setGasLimit(gasLimit2 != null ? C33491mxU.OLrzqt(gasLimit2) : null);
        java.lang.String value = eVMContractSignDataQVsKAR.getValue();
        if (value == null || (strOLrzqt = C33491mxU.OLrzqt(value)) == null) {
            strOLrzqt = "0";
        }
        eVMContractSignDataQVsKAR.setValue(strOLrzqt);
        java.lang.String nonce = eVMContractSignDataQVsKAR.getNonce();
        eVMContractSignDataQVsKAR.setNonce(nonce != null ? C33491mxU.OLrzqt(nonce) : null);
        boolean z = C33129mqd.OLrzqt((java.lang.CharSequence) eVMContractSignDataQVsKAR.getGas()) || C33129mqd.OLrzqt((java.lang.CharSequence) eVMContractSignDataQVsKAR.getGasLimit());
        java.lang.String gasLimitRate = eVMContractSignDataQVsKAR.getGasLimitRate();
        boolean z2 = !(gasLimitRate == null || gasLimitRate.length() == 0);
        boolean zOLrzqt = C33129mqd.OLrzqt((java.lang.CharSequence) eVMContractSignDataQVsKAR.getGasPrice());
        boolean z3 = eVMContractSignDataQVsKAR.getGasRate() != null;
        if (z && !z2 && zOLrzqt && !z3) {
            num = 0;
        } else if ((!z || z2) && zOLrzqt && !z3) {
            num = 1;
        } else if (z && !z2 && (!zOLrzqt || z3)) {
            num = 2;
        } else {
            num = 3;
        }
        this.QfsBiF = num;
        if ((num != null && num.intValue() == 0) || ((num2 = this.QfsBiF) != null && num2.intValue() == 1)) {
            num3 = null;
        } else {
            java.lang.Integer gasRate = QVsKAR().getGasRate();
            if (gasRate != null && gasRate.intValue() == 3) {
                num3 = 31;
            } else if (gasRate != null && gasRate.intValue() == 2) {
                num3 = 32;
            } else if (gasRate != null && gasRate.intValue() == 1) {
                num3 = 33;
            }
        }
        this.QVAiDq = num3;
        if (!z || z2) {
            gasLimit = null;
        } else if (C33129mqd.OLrzqt((java.lang.CharSequence) eVMContractSignDataQVsKAR.getGas())) {
            gasLimit = eVMContractSignDataQVsKAR.getGas();
            if (gasLimit == null) {
                gasLimit = "";
            }
        } else {
            gasLimit = eVMContractSignDataQVsKAR.getGasLimit();
        }
        this.RJOkX = gasLimit;
        if (zOLrzqt && !z3) {
            gasPrice = eVMContractSignDataQVsKAR.getGasPrice();
        }
        this.QbewEr = gasPrice;
        super.q_();
        return true;
    }

    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> r_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXR_ = super.r_();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDjBIcL = InterfaceC9218bRT.StateListAnimator.djBIcL(this);
        AbstractC58185ywX<Unit> abstractC58185ywXGasjUx = gasjUx();
        final yHO yho = new yHO() { // from class: o.bSB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C9216bRR.AEQbTJ(this.OLrzqt, (kotlin.Pair) obj, (kotlin.Pair) obj2, (Unit) obj3);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXR_, abstractC58185ywXDjBIcL, abstractC58185ywXGasjUx, new InterfaceC58228yxN() { // from class: o.bSy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58228yxN
            public final java.lang.Object AEQbTJ(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C9216bRR.EZpvd(yho, obj, obj2, obj3);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final kotlin.Pair EZpvd(yHO yho, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Intrinsics.checkNotNullParameter(obj3, "");
        return (kotlin.Pair) yho.invoke(obj, obj2, obj3);
    }

    public static final kotlin.Pair AEQbTJ(C9216bRR c9216bRR, kotlin.Pair pair, kotlin.Pair pair2, Unit unit) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        Intrinsics.checkNotNullParameter(unit, "");
        if (!((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return pair;
        }
        if (!((java.lang.Boolean) pair2.getFirst()).booleanValue()) {
            return pair2;
        }
        c9216bRR.AkhnZx().EZpvd(c9216bRR.QfsBiF, c9216bRR.QVAiDq, c9216bRR.QbewEr);
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    public static final kotlin.Pair DAIeex(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> dxcTrN() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDxcTrN = super.dxcTrN();
        final Function1 function1 = new Function1() { // from class: o.bRY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9216bRR.copydefault(this.copydefault, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXDxcTrN.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bRV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9216bRR.DAIeex(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair copydefault(C9216bRR c9216bRR, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        c9216bRR.AkhnZx().KWHzl(0);
        return pair;
    }

    public final AbstractC58185ywX<Unit> gasjUx() {
        if (aUsmxb() == OKWBaseTransaction.TransactionType.Approve) {
            AbstractC58260yxt<java.lang.String> abstractC58260yxtOLrzqt = C10734btz.KWHzl.EZpvd(aKErDB(), htlTjW(), zLjUOn()).OLrzqt(AbstractC58260yxt.copydefault(""));
            final Function1 function1 = new Function1() { // from class: o.bSu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C9216bRR.valueOf(this.copydefault, (java.lang.String) obj);
                }
            };
            AbstractC58185ywX<Unit> abstractC58185ywXEZpvd = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.bSt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C9216bRR.hUfVAv(function1, obj);
                }
            }).EZpvd();
            Intrinsics.copydefault(abstractC58185ywXEZpvd);
            return abstractC58185ywXEZpvd;
        }
        AbstractC58185ywX<Unit> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(Unit.INSTANCE);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final Unit hUfVAv(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public static final Unit valueOf(C9216bRR c9216bRR, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            str = null;
        }
        c9216bRR.valueOf = str;
        return Unit.INSTANCE;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> KWHzl(boolean z) {
        if (ODXsMY()) {
            return super.KWHzl(z);
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl((AbstractC58185ywX) OFhtUX().copydefault(new FromAddressCheckReq(true, C56402yEa.EZpvd(new AddressCheck(dHguZz().isConnected(), htlTjW(), zLjUOn())))));
        final Function1 function1 = new Function1() { // from class: o.bSh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9216bRR.copydefault(this.EZpvd, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bSi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9216bRR.iZzfmt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair iZzfmt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair copydefault(C9216bRR c9216bRR, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        FromAddressCheckRes fromAddressCheckRes = (FromAddressCheckRes) responseData.getData();
        java.util.List<AddressCheckResItem> txTagList = fromAddressCheckRes != null ? fromAddressCheckRes.getTxTagList() : null;
        if (txTagList == null || txTagList.isEmpty()) {
            return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, "");
        }
        java.lang.Object data = responseData.getData();
        Intrinsics.copydefault(data);
        c9216bRR.KWHzl((FromAddressCheckRes) data);
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    public final void KWHzl(FromAddressCheckRes fromAddressCheckRes) {
        Triple triple = new Triple(java.lang.Boolean.TRUE, "", java.lang.Boolean.FALSE);
        boolean zBooleanValue = ((java.lang.Boolean) triple.component1()).booleanValue();
        java.lang.Object objComponent2 = triple.component2();
        boolean zBooleanValue2 = ((java.lang.Boolean) triple.component3()).booleanValue();
        boolean z = zBooleanValue;
        boolean z2 = true;
        for (AddressCheckResItem addressCheckResItem : fromAddressCheckRes.getTxTagList()) {
            java.util.List<java.lang.String> causeRiskItem = addressCheckResItem.getCauseRiskItem();
            if (causeRiskItem != null && causeRiskItem.contains(TxToastCheckRes.FROM_RISK_REJECT)) {
                z2 = false;
            }
            java.util.List<java.lang.String> causeRiskItem2 = addressCheckResItem.getCauseRiskItem();
            if (causeRiskItem2 != null && causeRiskItem2.contains(TxToastCheckRes.BLACK_TAG)) {
                objComponent2 = addressCheckResItem.getTo();
                if (objComponent2 == null) {
                    objComponent2 = "";
                }
                z = false;
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(yDY.gEmmrt(new C9788bcG(z2, false), new C9870bdj(z, (java.lang.String) objComponent2, zBooleanValue2, true, null, null, 48, null)));
        UlJrfe().OLrzqt(arrayList);
    }

    @Override // o.AbstractC8564bFB
    public java.lang.String zLjUOn() {
        java.lang.String to = QVsKAR().getTo();
        return to == null ? "" : to;
    }

    @Override // o.AbstractC8601bFm
    public java.lang.String zuBGHE() {
        java.lang.String value = QVsKAR().getValue();
        return value == null ? "0" : value;
    }

    public java.lang.String RcXXUw() {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) djBIcL())) {
            return djBIcL();
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) QVsKAR().getNonce())) {
            java.lang.String nonce = QVsKAR().getNonce();
            Intrinsics.copydefault((java.lang.Object) nonce);
            return nonce;
        }
        java.lang.String nonce2 = isConnected().getNonce();
        return nonce2 == null ? "" : nonce2;
    }

    public static final kotlin.Pair copydefault(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> ffGIBT() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXFvQaOB = fvQaOB();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDvKsVJ = dvKsVJ();
        final Function2 function2 = new Function2() { // from class: o.bSa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C9216bRR.AEQbTJ(this.OLrzqt, (kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXFvQaOB, abstractC58185ywXDvKsVJ, new InterfaceC58223yxI() { // from class: o.bSg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C9216bRR.copydefault(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final kotlin.Pair AEQbTJ(C9216bRR c9216bRR, kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        if (!((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return pair;
        }
        if (!((java.lang.Boolean) pair2.getFirst()).booleanValue()) {
            return pair2;
        }
        c9216bRR.AkhnZx().EZpvd(c9216bRR.QfsBiF, c9216bRR.QVAiDq, c9216bRR.QbewEr);
        c9216bRR.AkhnZx().KWHzl(1);
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    @Override // o.InterfaceC9218bRT
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> values() {
        java.lang.String strCopydefault;
        C10747buL c10747buL = C10747buL.AEQbTJ;
        java.lang.String strAKErDB = aKErDB();
        long jFetchVPNInfo = dHguZz().fetchVPNInfo();
        java.lang.String strHtlTjW = htlTjW();
        java.lang.String strZLjUOn = zLjUOn();
        java.lang.String inputData$default = AbstractC8601bFm.getInputData$default(this, false, 1, null);
        java.lang.String strCopydefault2 = C33491mxU.copydefault(zuBGHE());
        java.lang.String str = this.RJOkX;
        if (str == null || (strCopydefault = C33491mxU.copydefault(str)) == null) {
            strCopydefault = "";
        }
        AbstractC58260yxt<C10745buJ> abstractC58260yxtOLrzqt = c10747buL.OLrzqt(strAKErDB, jFetchVPNInfo, strHtlTjW, strZLjUOn, inputData$default, strCopydefault2, strCopydefault);
        final Function1 function1 = new Function1() { // from class: o.bSd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9216bRR.KWHzl(this.copydefault, (C10745buJ) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.bSc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9216bRR.flVtFt(function1, obj);
            }
        }).EZpvd();
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final kotlin.Pair flVtFt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair KWHzl(C9216bRR c9216bRR, C10745buJ c10745buJ) {
        Intrinsics.checkNotNullParameter(c10745buJ, "");
        c9216bRR.isConnected().setNonce(c10745buJ.AEQbTJ());
        c9216bRR.isConnected(c10745buJ.EZpvd());
        c9216bRR.values(c10745buJ.KWHzl());
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> fvQaOB() {
        AbstractC58260yxt<java.lang.String> abstractC58260yxtAuCTelauCTel = C10734btz.KWHzl.AuCTelauCTel(aKErDB());
        final Function1 function1 = new Function1() { // from class: o.bSw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9216bRR.KWHzl(this.copydefault, (java.lang.String) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = abstractC58260yxtAuCTelauCTel.copydefault(new InterfaceC58229yxO() { // from class: o.bSA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9216bRR.AxsJAYaxsJAY(function1, obj);
            }
        }).EZpvd();
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final kotlin.Pair AxsJAYaxsJAY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair KWHzl(C9216bRR c9216bRR, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c9216bRR.isConnected(str);
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    public final void isConnected(java.lang.String str) {
        java.lang.String gasPriceRate = QVsKAR().getGasPriceRate();
        EvmSignInfoGasPrice gasPrice = isConnected().getGasPrice();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) gasPriceRate) && C33129mqd.AEQbTJ(gasPriceRate, "0")) {
            str = C54862xYb.convertToString$default(C54862xYb.OLrzqt(str, gasPriceRate), false, 0, RoundingMode.UP, 1, null);
        }
        gasPrice.setNormal(str);
    }

    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> dvKsVJ() {
        AbstractC58260yxt<java.lang.String> abstractC58260yxtCopydefault = C10734btz.KWHzl.copydefault(aKErDB(), htlTjW(), zLjUOn(), AbstractC8601bFm.getInputData$default(this, false, 1, null), C33491mxU.copydefault(zuBGHE()));
        final Function1 function1 = new Function1() { // from class: o.bRX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9216bRR.OLrzqt(this.AEQbTJ, (java.lang.String) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.bRU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9216bRR.AxsJAYsNCnLh(function1, obj);
            }
        }).EZpvd();
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair AxsJAYsNCnLh(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair OLrzqt(C9216bRR c9216bRR, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c9216bRR.values(str);
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
    }

    public final void values(java.lang.String str) {
        java.lang.String gasLimitRate = QVsKAR().getGasLimitRate();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) gasLimitRate)) {
            AYXKKw().setOriginGasLimit(str);
            AYXKKw().setGasLimit(C54862xYb.convertToString$default(C54862xYb.OLrzqt(str, gasLimitRate), false, 0, RoundingMode.UP, 1, null));
        } else if (this.RJOkX != null) {
            AYXKKw().setOriginGasLimit(this.RJOkX);
            AYXKKw().setGasLimit(this.RJOkX);
        } else {
            AYXKKw().setOriginGasLimit(str);
            AYXKKw().setGasLimit(C54862xYb.convertToBigIntegerString$default(C54862xYb.OLrzqt(str, java.lang.Float.valueOf(1.5f)), false, (RoundingMode) null, 3, (java.lang.Object) null));
        }
    }

    /* JADX DEBUG: Type inference failed for r0v5. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Unit> */
    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public AbstractC58185ywX<Unit> p_() {
        int iFIwbmz = AkhnZx().fIwbmz();
        if (AkhnZx().DbNXlk() == 4 || iFIwbmz == 0 || iFIwbmz == 1) {
            AbstractC58185ywX<Unit> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(Unit.INSTANCE);
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXFvQaOB = fvQaOB();
        final Function1 function1 = new Function1() { // from class: o.bSl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9216bRR.AEQbTJ(this.copydefault, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXFvQaOB.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bSn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9216bRR.iRxXKY(function1, obj);
            }
        });
        Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
        return abstractC58185ywXAEQbTJ;
    }

    public static final Unit iRxXKY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C9216bRR c9216bRR, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c9216bRR.AkhnZx().KWHzl(3);
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC8601bFm
    public java.lang.String AEQbTJ(boolean z) {
        java.lang.String data = QVsKAR().getData();
        return data == null ? "" : data;
    }

    @Override // o.InterfaceC9730bbB
    public boolean w_() {
        return aUsmxb() == OKWBaseTransaction.TransactionType.Approve;
    }

    @Override // o.InterfaceC9730bbB
    public boolean AEQbTJ() {
        return !AbstractC8919bLm.Companion.AEQbTJ(AbstractC8601bFm.getInputData$default(this, false, 1, null));
    }

    @Override // o.InterfaceC9730bbB
    public boolean KWHzl() {
        return AEQbTJ();
    }

    @Override // o.InterfaceC9730bbB
    public java.lang.String a_(boolean z) {
        java.lang.String inputData$default = AbstractC8601bFm.getInputData$default(this, false, 1, null);
        InterfaceC9730bbB.StateListAnimator stateListAnimatorEZpvd = EZpvd();
        int iCopydefault = stateListAnimatorEZpvd != null ? stateListAnimatorEZpvd.copydefault() : 0;
        if (iCopydefault < 0) {
            C10856bwO.copydefault("OKWCustomSignContract", -1, "getApproveAmount: invalid precision=" + iCopydefault + ", approveInfo=" + stateListAnimatorEZpvd);
        }
        java.lang.String strSubstring = inputData$default.substring(inputData$default.length() - 64);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        java.lang.String strOLrzqt = C33491mxU.OLrzqt(strSubstring);
        if (z) {
            return C54870xYj.EZpvd(strOLrzqt, C56548yJl.copydefault(iCopydefault, 0), stateListAnimatorEZpvd != null ? stateListAnimatorEZpvd.valueOf() : 8, null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
        }
        return strOLrzqt;
    }

    @Override // o.InterfaceC9730bbB
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strCopydefault = C33491mxU.copydefault(str);
        if (C59449zhJ.startsWith$default(strCopydefault, EIP1271Verifier.hexPrefix, false, 2, null)) {
            strCopydefault = strCopydefault.substring(2);
            Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int iRJOkX = CollectionsKt___CollectionsKt.RJOkX(C56548yJl.AhwBna(0, 64 - strCopydefault.length()));
        for (int i = 0; i < iRJOkX; i++) {
            sb.append("0");
        }
        sb.append(strCopydefault);
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String data = QVsKAR().getData();
        if (data != null) {
            EVMContractSignData eVMContractSignDataQVsKAR = QVsKAR();
            java.lang.String strSubstring = data.substring(0, data.length() - 64);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            eVMContractSignDataQVsKAR.setData(strSubstring + string);
        }
    }

    @Override // o.InterfaceC9730bbB
    public InterfaceC9730bbB.StateListAnimator EZpvd() {
        ContractAddressResp contractAddressRespY_ = Y_();
        if (contractAddressRespY_ == null) {
            return null;
        }
        return new InterfaceC9730bbB.StateListAnimator(zLjUOn(), this.valueOf, null, contractAddressRespY_.getSymbol(), contractAddressRespY_.getPrecision(), contractAddressRespY_.getPrecision(), contractAddressRespY_.getLogo(), null, contractAddressRespY_.isNft(), 128, null);
    }

    @Override // o.InterfaceC9730bbB
    public java.lang.String OLrzqt() {
        return C12801cto.EZpvd.KWHzl(AbstractC8601bFm.getInputData$default(this, false, 1, null), java.lang.String.valueOf(dHguZz().fetchVPNInfo()));
    }

    public static final ResponseData gkJEwt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull final java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(Unit.INSTANCE);
        final Function1 function1 = new Function1() { // from class: o.bSj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9216bRR.EZpvd(str, this, (Unit) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bSr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9216bRR.gkJEwt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return OLrzqt(abstractC58185ywXAEQbTJ);
    }

    public static final ResponseData EZpvd(java.lang.String str, C9216bRR c9216bRR, Unit unit) {
        java.lang.String strSubstring = str;
        Intrinsics.checkNotNullParameter(unit, "");
        if (C59449zhJ.startsWith$default(strSubstring, EIP1271Verifier.hexPrefix, false, 2, null)) {
            strSubstring = strSubstring.substring(2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strSubstring)) {
            return new ResponseData(0, null, null, null, xYZ.KWHzl.EZpvd(strSubstring, C33129mqd.valueOf(c9216bRR.UeEOUB()), c9216bRR.giSNqX()), null, 46, null);
        }
        return new ResponseData(-5004, null, null, null, null, null, 62, null);
    }

    private final SigData giSNqX() {
        return new SigData(zLjUOn(), C33491mxU.copydefault(C54862xYb.convertToBigIntegerString$default(zuBGHE(), false, (RoundingMode) null, 3, (java.lang.Object) null)), AbstractC8601bFm.getInputData$default(this, false, 1, null), C33491mxU.copydefault(C54862xYb.convertToBigIntegerString$default(C9339bTi.getGasPrice$default(AkhnZx(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null)), C33491mxU.copydefault(C54862xYb.convertToBigIntegerString$default(AbstractC9346bTp.getGasLimit$default(AkhnZx(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null)), C33491mxU.copydefault(C54862xYb.convertToBigIntegerString$default(RcXXUw(), false, (RoundingMode) null, 3, (java.lang.Object) null)), "0", (java.lang.String) null, (java.lang.String) null, (java.util.List) null, 512, (DefaultConstructorMarker) null);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> EZpvd(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        final long jQKVWgx = dHguZz().QKVWgx();
        final long jValueOf = C33129mqd.valueOf(UeEOUB());
        return OLrzqt(C10965byR.OLrzqt.OLrzqt(str, dUDNAs(), dHguZz(), new Function0() { // from class: o.bSq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C9216bRR.KWHzl(jValueOf, this);
            }
        }, new Function2() { // from class: o.bSv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C9216bRR.AEQbTJ(jQKVWgx, jValueOf, (java.lang.String) obj, (RSV) obj2);
            }
        }, new Function1() { // from class: o.bSx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C9216bRR.OLrzqt((java.lang.String) obj));
            }
        }));
    }

    public static final TxMessage KWHzl(long j, C9216bRR c9216bRR) {
        return xYZ.KWHzl.copydefault(j, c9216bRR.giSNqX());
    }

    public static final java.lang.String AEQbTJ(long j, long j2, java.lang.String str, RSV rsv) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(rsv, "");
        return xYZ.KWHzl.EZpvd(j, new EvmSignatureRawValue(0, java.lang.String.valueOf(j2), rsv.getR(), rsv.getS(), rsv.getV(), str));
    }

    public static final boolean OLrzqt(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return !(str.length() == 0);
    }

    /* JADX DEBUG: Type inference failed for r3v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    private final AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywX) {
        final Function1 function1 = new Function1() { // from class: o.bSs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9216bRR.EZpvd(this.copydefault, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywX.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bSo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9216bRR.giSNqX(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData giSNqX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData EZpvd(C9216bRR c9216bRR, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001 || responseData.getCode() == 0) {
            java.lang.String str = (java.lang.String) responseData.getData();
            java.lang.String str2 = str == null ? "" : str;
            return new ResponseData(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(AbstractC8601bFm.generateBroadcastModel$default(c9216bRR, str2, xYW.AEQbTJ.AEQbTJ(str2, C33129mqd.valueOf(c9216bRR.UeEOUB())), null, null, 12, null)), (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 254, (DefaultConstructorMarker) null), null, 46, null);
        }
        return new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, null, responseData.getError_code(), 28, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
    @Override // o.AbstractC8564bFB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC58185ywX<ResponseData<DappTxResultBean>> copydefault(@NotNull final BroadcastBean broadcastBean, java.lang.String str, SignAuthType signAuthType) {
        int i;
        int i2;
        java.lang.String inputData;
        Intrinsics.checkNotNullParameter(broadcastBean, "");
        java.lang.String txHash = broadcastBean.getTxHash();
        java.lang.String str2 = txHash == null ? "" : txHash;
        C10747buL c10747buL = C10747buL.AEQbTJ;
        java.lang.String strAKErDB = aKErDB();
        java.lang.String strDmq = Dmq();
        long jDmfpNf = dmfpNf();
        long jFetchVPNInfo = dHguZz().fetchVPNInfo();
        int i3 = ActionBar.OLrzqt[aUsmxb().ordinal()];
        if (i3 == 1) {
            i = 4;
        } else {
            if (i3 != 2) {
                i2 = 3;
                java.lang.String strHtlTjW = htlTjW();
                java.lang.String strZLjUOn = zLjUOn();
                java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(RcXXUw(), false, (RoundingMode) null, 3, (java.lang.Object) null);
                java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(C9339bTi.getGasPrice$default(AkhnZx(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
                java.lang.String strConvertToBigIntegerString$default3 = C54862xYb.convertToBigIntegerString$default(AbstractC9346bTp.getGasLimit$default(AkhnZx(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
                java.lang.String strConvertToBigIntegerString$default4 = C54862xYb.convertToBigIntegerString$default(zuBGHE(), true, (RoundingMode) null, 2, (java.lang.Object) null);
                inputData = broadcastBean.getInputData();
                if (inputData == null) {
                    inputData = EIP1271Verifier.hexPrefix;
                }
                AbstractC58260yxt<java.lang.String> abstractC58260yxtCopydefault = c10747buL.copydefault(strAKErDB, new C10746buK(strDmq, jDmfpNf, str2, str2, "", jFetchVPNInfo, i2, 0, 1, strHtlTjW, strZLjUOn, strConvertToBigIntegerString$default, strConvertToBigIntegerString$default2, strConvertToBigIntegerString$default3, strConvertToBigIntegerString$default4, inputData, broadcastBean.getSignedTx(), null, java.lang.System.currentTimeMillis(), 0L, null, 1703936, null));
                final Function1 function1 = new Function1() { // from class: o.bSe
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C9216bRR.OLrzqt(broadcastBean, (java.lang.String) obj);
                    }
                };
                AbstractC58185ywX<ResponseData<DappTxResultBean>> abstractC58185ywXEZpvd = abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.bSp
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C9216bRR.gasjUx(function1, obj);
                    }
                }).EZpvd();
                Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
                return abstractC58185ywXEZpvd;
            }
            i = 6;
        }
        i2 = i;
        java.lang.String strHtlTjW2 = htlTjW();
        java.lang.String strZLjUOn2 = zLjUOn();
        java.lang.String strConvertToBigIntegerString$default5 = C54862xYb.convertToBigIntegerString$default(RcXXUw(), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default22 = C54862xYb.convertToBigIntegerString$default(C9339bTi.getGasPrice$default(AkhnZx(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default32 = C54862xYb.convertToBigIntegerString$default(AbstractC9346bTp.getGasLimit$default(AkhnZx(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default42 = C54862xYb.convertToBigIntegerString$default(zuBGHE(), true, (RoundingMode) null, 2, (java.lang.Object) null);
        inputData = broadcastBean.getInputData();
        if (inputData == null) {
        }
        AbstractC58260yxt<java.lang.String> abstractC58260yxtCopydefault2 = c10747buL.copydefault(strAKErDB, new C10746buK(strDmq, jDmfpNf, str2, str2, "", jFetchVPNInfo, i2, 0, 1, strHtlTjW2, strZLjUOn2, strConvertToBigIntegerString$default5, strConvertToBigIntegerString$default22, strConvertToBigIntegerString$default32, strConvertToBigIntegerString$default42, inputData, broadcastBean.getSignedTx(), null, java.lang.System.currentTimeMillis(), 0L, null, 1703936, null));
        final Function1 function12 = new Function1() { // from class: o.bSe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9216bRR.OLrzqt(broadcastBean, (java.lang.String) obj);
            }
        };
        AbstractC58185ywX<ResponseData<DappTxResultBean>> abstractC58185ywXEZpvd2 = abstractC58260yxtCopydefault2.copydefault(new InterfaceC58229yxO() { // from class: o.bSp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9216bRR.gasjUx(function12, obj);
            }
        }).EZpvd();
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd2, "");
        return abstractC58185ywXEZpvd2;
    }

    public static final ResponseData gasjUx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData OLrzqt(BroadcastBean broadcastBean, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ResponseData(0, null, null, null, new DappTxResultBean(broadcastBean.getSignedTx(), str, broadcastBean.getTxHash(), (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.String) null, 120, (DefaultConstructorMarker) null), null, 46, null);
    }

    public static final InterfaceC60096zvd accept(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r3v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<o.bbT>> */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<C9748bbT>> AEQbTJ(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX<ResponseData<C9748bbT>> abstractC58185ywXAEQbTJ = super.AEQbTJ(str, submitTxExpandBean);
        final Function1 function1 = new Function1() { // from class: o.bRZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9216bRR.AYXKKw(this.OLrzqt, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXAEQbTJ.KWHzl(new InterfaceC58229yxO() { // from class: o.bSb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9216bRR.accept(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd AYXKKw(C9216bRR c9216bRR, ResponseData responseData) {
        java.lang.String strKWHzl;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            C9748bbT c9748bbT = (C9748bbT) responseData.getData();
            if (c9748bbT != null && (strKWHzl = c9748bbT.KWHzl()) != null) {
                str = strKWHzl;
            }
            c9216bRR.valueOf(str);
        }
        return AbstractC58185ywX.KWHzl(responseData);
    }

    public final void valueOf(final java.lang.String str) {
        final java.lang.String strKWHzl;
        java.lang.String strAEQbTJ;
        java.util.List<AbstractC8601bFm<Fee, SignData>.Activity> listOLrzqt = OLrzqt(true);
        final AbstractC8601bFm.Activity activity = listOLrzqt != null ? (AbstractC8601bFm.Activity) CollectionsKt___CollectionsKt.firstOrNull(listOLrzqt) : null;
        if (activity == null || (strAEQbTJ = activity.AEQbTJ()) == null || (strKWHzl = KWHzl(strAEQbTJ)) == null) {
            strKWHzl = "";
        }
        C32866mlf.onEvent$default("WalletRPC_Confirmation_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.bRW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9216bRR.KWHzl(this.copydefault, activity, strKWHzl, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(C9216bRR c9216bRR, AbstractC8601bFm.Activity activity, java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        java.lang.String strKWHzl;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("tx_source", "dapp", true);
        eventParamsList.put("from_addr", c9216bRR.htlTjW(), false);
        eventParamsList.put("to_addr", c9216bRR.zLjUOn(), false);
        eventParamsList.put("main_token_symbol", c9216bRR.dHguZz().fJNWhG(), false);
        eventParamsList.put("chain_id", C33129mqd.gEmmrt(java.lang.Long.valueOf(c9216bRR.dHguZz().isConnected())), false);
        if (activity == null || (strKWHzl = activity.KWHzl()) == null) {
            strKWHzl = "";
        }
        eventParamsList.put("token_symbol", strKWHzl, false);
        eventParamsList.put("contract_address", "", false);
        eventParamsList.put("terminal", "android", true);
        eventParamsList.put("volume_token", str, false);
        java.lang.String strCopydefault = c9216bRR.copydefault(c9216bRR.dHguZz(), str);
        if (strCopydefault.length() == 0) {
            strCopydefault = "0";
        }
        eventParamsList.put("volume_usdt", strCopydefault, false);
        eventParamsList.put("tx_hash_unique", str2, false);
        int i = ActionBar.copydefault[c9216bRR.dUDNAs().QwvEab().ordinal()];
        eventParamsList.put("wallet_type", i != 1 ? i != 2 ? i != 3 ? "" : "mpc" : Web3SecurityTrackEvent.VALUE_PRIVATE_KEY : Web3SecurityTrackEvent.VALUE_SEED_PHRASE, false);
        java.lang.String strCopydefault2 = xVW.copydefault();
        Intrinsics.checkNotNullExpressionValue(strCopydefault2, "");
        eventParamsList.put("device_id", strCopydefault2, false);
        return Unit.INSTANCE;
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        if (!C59449zhJ.startsWith$default(str, "-", false, 2, null)) {
            return str;
        }
        java.lang.String strSubstring = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }
}
