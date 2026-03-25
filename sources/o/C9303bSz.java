package o;

import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.defi.api.model.tx.signdata.TransferSignData;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.bean.BroadcastBean;
import com.okinc.business.defi.biz.core.transaction.sign.evm.bean.CustomEvmSignInfo;
import com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EvmSignInfoGasPrice;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.business.defi.biz.net.bean.AddressCheck;
import com.okinc.business.defi.biz.net.bean.AddressCheckResItem;
import com.okinc.business.defi.biz.net.bean.FromAddressCheckReq;
import com.okinc.business.defi.biz.net.bean.FromAddressCheckRes;
import com.okinc.business.defi.biz.net.bean.PreExecTransactionReq;
import com.okinc.business.defi.biz.net.bean.TxToastCheckRes;
import com.okinc.business.defi.biz.net.bean.WalletGasLimitRes;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.TxMessage;
import com.okinc.wallet.core.sign.evm.AccountTokenTransaction;
import com.okinc.wallet.core.sign.evm.AccountTransaction;
import com.okinc.wallet.core.sign.evm.BaseAccountTransaction;
import com.okinc.wallet.core.sign.evm.EvmSignatureRawValue;
import com.okinc.wallet.core.sign.utxo.RSV;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import java.math.RoundingMode;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C10614brl;
import o.InterfaceC9218bRT;
import o.InterfaceC9778bbx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bSz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9303bSz extends AbstractC8664bGw<C9339bTi, TransferSignData> implements InterfaceC9218bRT, InterfaceC9778bbx {
    public CustomChainMeta AEQbTJ;
    public java.lang.String OLrzqt;
    public InterfaceC60094zvb valueOf;
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.bTd
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C9303bSz.OLrzqt(this.KWHzl);
        }
    });
    public final AbstractC8564bFB<?, ?> djBIcL = this;
    public CustomEvmSignInfo AYXKKw = new CustomEvmSignInfo((java.lang.String) null, (java.lang.String) null, (EvmSignInfoGasPrice) null, 7, (DefaultConstructorMarker) null);
    public WalletGasLimitRes EZpvd = new WalletGasLimitRes((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, 16383, (DefaultConstructorMarker) null);
    public boolean copydefault = true;
    public java.lang.String KWHzl = EIP1271Verifier.hexPrefix;

    /* JADX INFO: renamed from: o.bSz$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[WalletType.values().length];
            try {
                iArr[WalletType.HDWallet.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[WalletType.KeyWallet.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletType.MPCWallet.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull CustomChainMeta customChainMeta) {
        Intrinsics.checkNotNullParameter(customChainMeta, "");
        this.AEQbTJ = customChainMeta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9218bRT
    public WalletGasLimitRes AYXKKw() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void AhwBna(boolean z) {
        this.copydefault = z;
    }

    @Override // o.AbstractC8564bFB
    public boolean DCUTEI() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: fetchVPNInfo()Lcom/okinc/business/defi/biz/core/transaction/sign/OKWBaseTransaction; */
    @Override // o.InterfaceC9217bRS
    /* JADX INFO: renamed from: DbNXlk */
    public AbstractC8564bFB<?, ?> fetchVPNInfo() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@NotNull WalletGasLimitRes walletGasLimitRes) {
        Intrinsics.checkNotNullParameter(walletGasLimitRes, "");
        this.EZpvd = walletGasLimitRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean ODXsMY() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@NotNull CustomEvmSignInfo customEvmSignInfo) {
        Intrinsics.checkNotNullParameter(customEvmSignInfo, "");
        this.AYXKKw = customEvmSignInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9218bRT
    public void copydefault(java.lang.String str) {
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9218bRT
    public java.lang.String djBIcL() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9218bRT
    public CustomEvmSignInfo isConnected() {
        return this.AYXKKw;
    }

    public boolean AhwBna(java.lang.String str) {
        return InterfaceC9778bbx.StateListAnimator.KWHzl(this, str);
    }

    public java.lang.String ORxRYg() {
        return InterfaceC9218bRT.StateListAnimator.copydefault(this);
    }

    public java.lang.String OcIXYQ() {
        return InterfaceC9218bRT.StateListAnimator.OLrzqt(this);
    }

    public java.lang.String QKVWgx() {
        return InterfaceC9218bRT.StateListAnimator.AEQbTJ(this);
    }

    @Override // o.InterfaceC9729bbA
    public java.lang.String copydefault() {
        return InterfaceC9218bRT.StateListAnimator.EZpvd(this);
    }

    public void valueOf(java.lang.String str) {
        InterfaceC9218bRT.StateListAnimator.OLrzqt(this, str);
    }

    public java.lang.String zuBGHE() {
        return InterfaceC9218bRT.StateListAnimator.KWHzl(this);
    }

    /* JADX DEBUG: Method merged with bridge method: DXXBbs()Lo/bCW; */
    @Override // o.AbstractC8564bFB
    /* JADX INFO: renamed from: AkhnZx */
    public C9339bTi fJNWhG() {
        return (C9339bTi) this.gEmmrt.getValue();
    }

    public static final C9339bTi OLrzqt(C9303bSz c9303bSz) {
        return new C9339bTi(c9303bSz, c9303bSz);
    }

    @Override // o.InterfaceC9218bRT
    public CustomChainMeta valueOf() {
        CustomChainMeta customChainMeta = this.AEQbTJ;
        if (customChainMeta != null) {
            return customChainMeta;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.AbstractC8564bFB, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean KWHzl(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull C10854bwM c10854bwM, @NotNull SignDataArgs<TransferSignData> signDataArgs) {
        C10854bwM c10854bwMAEQbTJ;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(signDataArgs, "");
        CustomChainCoinMeta customChainCoinMetaCopydefault = C10598brV.AEQbTJ.copydefault(c10854bwM.AhwBna(), C10614brl.TaskDescription.getInstance$default(C10614brl.Companion, null, 1, null).KWHzl(abstractC12782ctV.DbNXlk()).getRpcUrl());
        if (customChainCoinMetaCopydefault == null || (c10854bwMAEQbTJ = customChainCoinMetaCopydefault.AEQbTJ()) == null) {
            return false;
        }
        boolean zKWHzl = super.KWHzl(abstractC12782ctV, c10854bwMAEQbTJ, signDataArgs);
        CustomChainMeta customChainMetaOLrzqt = customChainCoinMetaCopydefault.OLrzqt();
        if (customChainMetaOLrzqt == null) {
            return false;
        }
        AEQbTJ(customChainMetaOLrzqt);
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

    @Override // o.AbstractC8664bGw, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.util.ArrayList<java.lang.Integer> getNewProxyInstance() {
        return new java.util.ArrayList<>();
    }

    @Override // o.AbstractC8664bGw, o.AbstractC8564bFB
    public java.util.ArrayList<java.lang.Integer> AuCTelauCTel() {
        return new java.util.ArrayList<>();
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> r_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXR_ = super.r_();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDjBIcL = InterfaceC9218bRT.StateListAnimator.djBIcL(this);
        final Function2 function2 = new Function2() { // from class: o.bSY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C9303bSz.copydefault(this.KWHzl, (kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXR_, abstractC58185ywXDjBIcL, new InterfaceC58223yxI() { // from class: o.bSZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C9303bSz.OLrzqt(function2, obj, obj2);
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

    public static final kotlin.Pair copydefault(C9303bSz c9303bSz, kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        if (!((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return pair;
        }
        if (!((java.lang.Boolean) pair2.getFirst()).booleanValue()) {
            return pair2;
        }
        c9303bSz.fJNWhG().KWHzl(0);
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> KWHzl(boolean z) {
        if (ODXsMY()) {
            return super.KWHzl(z);
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl((AbstractC58185ywX) OFhtUX().copydefault(new FromAddressCheckReq(true, C56402yEa.EZpvd(new AddressCheck(dHguZz().isConnected(), htlTjW(), zLjUOn())))));
        final Function1 function1 = new Function1() { // from class: o.bSQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9303bSz.OLrzqt(this.AEQbTJ, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bTb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9303bSz.DarRvM(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair DarRvM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair OLrzqt(C9303bSz c9303bSz, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        FromAddressCheckRes fromAddressCheckRes = (FromAddressCheckRes) responseData.getData();
        java.util.List<AddressCheckResItem> txTagList = fromAddressCheckRes != null ? fromAddressCheckRes.getTxTagList() : null;
        if (txTagList == null || txTagList.isEmpty()) {
            return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, "");
        }
        java.lang.Object data = responseData.getData();
        Intrinsics.copydefault(data);
        c9303bSz.EZpvd((FromAddressCheckRes) data);
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    private final void EZpvd(FromAddressCheckRes fromAddressCheckRes) {
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

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public PreExecTransactionReq RdAHlO() {
        PreExecTransactionReq preExecTransactionReqRdAHlO = super.RdAHlO();
        preExecTransactionReqRdAHlO.setTo(zLjUOn());
        preExecTransactionReqRdAHlO.setMethod("wallet_inner_transfer");
        preExecTransactionReqRdAHlO.setChainIndex(dHguZz().isConnected());
        preExecTransactionReqRdAHlO.setRpcChain(true);
        return preExecTransactionReqRdAHlO;
    }

    @Override // o.AbstractC8664bGw, o.AbstractC8564bFB
    public void x_() {
        C8497bDo c8497bDoDLWbHP = DLWbHP();
        kotlin.Pair<java.lang.Boolean, java.lang.String> pairAo_ = ao_();
        c8497bDoDLWbHP.OLrzqt(yDY.gEmmrt(new C9828bcu(E_(), fHqPtx(), zuBGHE()), new C9829bcv(pairAo_.getFirst().booleanValue(), pairAo_.getSecond(), zuBGHE())));
    }

    @Override // o.AbstractC8664bGw, o.AbstractC8564bFB
    public void AhwBna() {
        C8497bDo c8497bDoDLWbHP = DLWbHP();
        kotlin.Pair<java.lang.Boolean, java.lang.String> pairAo_ = ao_();
        c8497bDoDLWbHP.OLrzqt(yDY.gEmmrt(new C9826bcs(F_(), fJNWhG().AYXKKw(), zuBGHE()), new C9829bcv(pairAo_.getFirst().booleanValue(), pairAo_.getSecond(), zuBGHE())));
    }

    @Override // o.InterfaceC9218bRT
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> values() {
        java.lang.String strZLjUOn;
        C10747buL c10747buL = C10747buL.AEQbTJ;
        java.lang.String strQKVWgx = QKVWgx();
        long jFetchVPNInfo = dHguZz().fetchVPNInfo();
        java.lang.String strHtlTjW = htlTjW();
        if (fHqPtx().DCUTEIddSDPG()) {
            strZLjUOn = fHqPtx().OLrzqt();
        } else {
            strZLjUOn = zLjUOn();
        }
        AbstractC58260yxt abstractC58260yxtOLrzqt = c10747buL.OLrzqt(strQKVWgx, jFetchVPNInfo, strHtlTjW, strZLjUOn, AEQbTJ(), (64 & 32) != 0 ? "" : fHqPtx().AuCTel() ? C33491mxU.copydefault(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null)) : "", (64 & 64) != 0 ? "" : null);
        final Function1 function1 = new Function1() { // from class: o.bTk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9303bSz.AEQbTJ(this.KWHzl, (C10745buJ) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.bTl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9303bSz.AxsJAYsNCnLh(function1, obj);
            }
        }).EZpvd();
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final kotlin.Pair AxsJAYsNCnLh(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair AEQbTJ(C9303bSz c9303bSz, C10745buJ c10745buJ) {
        Intrinsics.checkNotNullParameter(c10745buJ, "");
        c9303bSz.copydefault(new CustomEvmSignInfo(c10745buJ.AEQbTJ(), (java.lang.String) null, new EvmSignInfoGasPrice((java.lang.String) null, c10745buJ.EZpvd(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 262141, (DefaultConstructorMarker) null), 2, (DefaultConstructorMarker) null));
        c9303bSz.fJNWhG(c10745buJ.KWHzl());
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    private final void fJNWhG(java.lang.String str) {
        EZpvd(new WalletGasLimitRes((java.lang.String) null, C54862xYb.convertToBigIntegerString$default(C54862xYb.OLrzqt(str, java.lang.Float.valueOf(1.5f)), false, (RoundingMode) null, 3, (java.lang.Object) null), str, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, 16377, (DefaultConstructorMarker) null));
    }

    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> QVAiDq() {
        AbstractC58260yxt<java.lang.String> abstractC58260yxtAuCTelauCTel = C10734btz.KWHzl.AuCTelauCTel(QKVWgx());
        final Function1 function1 = new Function1() { // from class: o.bSX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9303bSz.copydefault(this.copydefault, (java.lang.String) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = abstractC58260yxtAuCTelauCTel.copydefault(new InterfaceC58229yxO() { // from class: o.bTf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9303bSz.RlQdEF(function1, obj);
            }
        }).EZpvd();
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final kotlin.Pair RlQdEF(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair copydefault(C9303bSz c9303bSz, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c9303bSz.isConnected().getGasPrice().setNormal(str);
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> QUSxYX() {
        java.lang.String strZLjUOn;
        C10734btz c10734btz = C10734btz.KWHzl;
        java.lang.String strQKVWgx = QKVWgx();
        java.lang.String strHtlTjW = htlTjW();
        if (fHqPtx().DCUTEIddSDPG()) {
            strZLjUOn = fHqPtx().OLrzqt();
        } else {
            strZLjUOn = zLjUOn();
        }
        AbstractC58260yxt<java.lang.String> abstractC58260yxtCopydefault = c10734btz.copydefault(strQKVWgx, strHtlTjW, strZLjUOn, AEQbTJ(), fHqPtx().AuCTel() ? C33491mxU.copydefault(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null)) : "");
        final Function1 function1 = new Function1() { // from class: o.bTe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9303bSz.AEQbTJ(this.copydefault, (java.lang.String) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.bTj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9303bSz.OqFWZa(function1, obj);
            }
        }).EZpvd();
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair OqFWZa(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair AEQbTJ(C9303bSz c9303bSz, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c9303bSz.fJNWhG(str);
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
    }

    public static final kotlin.Pair accept(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> ffGIBT() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXUeEOUB = UeEOUB();
        final Function1 function1 = new Function1() { // from class: o.bSU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9303bSz.AhwBna(this.EZpvd, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXUeEOUB.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bSV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9303bSz.accept(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair AhwBna(C9303bSz c9303bSz, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c9303bSz.fJNWhG().KWHzl(1);
        }
        return pair;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getPostValueLengthLimit(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Unit> */
    @Override // o.AbstractC8704bHj, o.AbstractC8564bFB
    public AbstractC58185ywX<Unit> p_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXQVAiDq = QVAiDq();
        final Function1 function1 = new Function1() { // from class: o.bSI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9303bSz.EZpvd(this.AEQbTJ, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXQVAiDq.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bSP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9303bSz.getPostValueLengthLimit(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final Unit EZpvd(C9303bSz c9303bSz, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c9303bSz.fJNWhG().KWHzl(3);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Type inference failed for r0v7. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8664bGw
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> wlaJM() {
        if (C33129mqd.AEQbTJ(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), "0")) {
            C8475bDS c8475bDSDCJXGO = DCJXGO();
            long jDGOPHZ = DGOPHZ();
            if (C33129mqd.copydefault(c8475bDSDCJXGO.KWHzl(java.lang.Long.valueOf(jDGOPHZ), htlTjW()), AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null))) {
                AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXUeEOUB = UeEOUB();
                final Function1 function1 = new Function1() { // from class: o.bSW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C9303bSz.gEmmrt(this.AEQbTJ, (kotlin.Pair) obj);
                    }
                };
                AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXUeEOUB.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bTa
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C9303bSz.DAIeex(function1, obj);
                    }
                });
                Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
                return abstractC58185ywXAEQbTJ;
            }
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final kotlin.Pair DAIeex(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair gEmmrt(C9303bSz c9303bSz, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c9303bSz.fJNWhG().KWHzl(2);
        }
        return pair;
    }

    @Override // o.AbstractC8664bGw
    public java.lang.String EZpvd(boolean z) {
        return z ? "" : super.EZpvd(false);
    }

    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> UeEOUB() {
        InterfaceC60094zvb interfaceC60094zvb = this.valueOf;
        if (interfaceC60094zvb != null) {
            interfaceC60094zvb.cancel();
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXQUSxYX = QUSxYX();
        final Function1 function1 = new Function1() { // from class: o.bSM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9303bSz.AEQbTJ(this.EZpvd, (InterfaceC60094zvb) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = abstractC58185ywXQUSxYX.EZpvd(new InterfaceC58227yxM() { // from class: o.bSJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C9303bSz.DCJXGO(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final void DCJXGO(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C9303bSz c9303bSz, InterfaceC60094zvb interfaceC60094zvb) {
        c9303bSz.valueOf = interfaceC60094zvb;
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC9778bbx
    public java.lang.String AEQbTJ() {
        return (!fHqPtx().DCUTEIddSDPG() || zLjUOn().length() <= 0) ? this.KWHzl : xYW.AEQbTJ.copydefault(zLjUOn(), C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), false, (RoundingMode) null, 3, (java.lang.Object) null));
    }

    @Override // o.InterfaceC9778bbx
    public boolean KWHzl() {
        return fHqPtx().AuCTel();
    }

    @Override // o.InterfaceC9778bbx
    public AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> KWHzl(java.lang.String str) {
        java.lang.String string = str != null ? StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString() : null;
        java.lang.String str2 = EIP1271Verifier.hexPrefix;
        if (string != null && string.length() != 0 && !C59449zhJ.gEmmrt(string, EIP1271Verifier.hexPrefix, true)) {
            str2 = string;
        }
        this.KWHzl = str2;
        if (AhwBna(string)) {
            DLWbHP().AEQbTJ(new C9795bcN(true));
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXQUSxYX = QUSxYX();
            final Function1 function1 = new Function1() { // from class: o.bSO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C9303bSz.djBIcL(this.copydefault, (kotlin.Pair) obj);
                }
            };
            AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58260yxtValueOf = abstractC58185ywXQUSxYX.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bSN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C9303bSz.ODWQjV(function1, obj);
                }
            }).valueOf();
            Intrinsics.copydefault(abstractC58260yxtValueOf);
            return abstractC58260yxtValueOf;
        }
        DLWbHP().AEQbTJ(new C9795bcN(false));
        AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, null));
        Intrinsics.copydefault(abstractC58260yxtCopydefault);
        return abstractC58260yxtCopydefault;
    }

    public static final kotlin.Pair ODWQjV(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair djBIcL(C9303bSz c9303bSz, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c9303bSz.fJNWhG().KWHzl(2);
        }
        return pair;
    }

    private final BaseAccountTransaction djSkpj() {
        if (fHqPtx().AuCTel()) {
            return RcXXUw();
        }
        return dNCPSb();
    }

    private final AccountTransaction RcXXUw() {
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(OcIXYQ(), false, (RoundingMode) null, 3, (java.lang.Object) null);
        return new AccountTransaction(zLjUOn(), strConvertToBigIntegerString$default, C54862xYb.convertToBigIntegerString$default(C9339bTi.getGasPrice$default(fJNWhG(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(AbstractC9346bTp.getGasLimit$default(fJNWhG(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), false, (RoundingMode) null, 3, (java.lang.Object) null), null, 0, null, null, ORxRYg(), this.KWHzl);
    }

    private final AccountTokenTransaction dNCPSb() {
        java.lang.String strZLjUOn = zLjUOn();
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(OcIXYQ(), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(C9339bTi.getGasPrice$default(fJNWhG(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default3 = C54862xYb.convertToBigIntegerString$default(AbstractC9346bTp.getGasLimit$default(fJNWhG(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strOLrzqt = fHqPtx().OLrzqt();
        java.lang.String strHtlTjW = htlTjW();
        java.lang.String strORxRYg = ORxRYg();
        java.lang.String strConvertToBigIntegerString$default4 = C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strAEQbTJ = AEQbTJ();
        if (strAEQbTJ.length() == 0) {
            strAEQbTJ = "";
        } else if (!C59449zhJ.AYXKKw(strAEQbTJ, EIP1271Verifier.hexPrefix, true)) {
            strAEQbTJ = EIP1271Verifier.hexPrefix + strAEQbTJ;
        }
        return new AccountTokenTransaction(strZLjUOn, strConvertToBigIntegerString$default, strConvertToBigIntegerString$default2, strConvertToBigIntegerString$default3, "0", 0, null, null, strORxRYg, strAEQbTJ, strOLrzqt, strConvertToBigIntegerString$default4, strHtlTjW);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull final java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(Unit.INSTANCE);
        final Function1 function1 = new Function1() { // from class: o.bSL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9303bSz.AEQbTJ(this.copydefault, str, (Unit) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bSK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9303bSz.QKudOq(function1, obj);
            }
        });
        Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
        return OLrzqt(abstractC58185ywXAEQbTJ);
    }

    public static final ResponseData QKudOq(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData AEQbTJ(C9303bSz c9303bSz, java.lang.String str, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        java.lang.String strOLrzqt = xYZ.KWHzl.OLrzqt(new SignParams(c9303bSz.dHguZz().QKVWgx(), c9303bSz.dHguZz().fetchVPNInfo(), c9303bSz.fHqPtx().AuCTel() ? null : c9303bSz.fHqPtx().fJNWhG(), str, null, java.lang.Integer.valueOf(c9303bSz.dUDNAs().finit()), 0, null, false, false, null, 1984, null), c9303bSz.djSkpj());
        if (strOLrzqt == null || strOLrzqt.length() == 0) {
            return new ResponseData(-5005, null, null, null, null, null, 62, null);
        }
        return new ResponseData(-5001, null, null, null, strOLrzqt, null, 46, null);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> EZpvd(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        C10854bwM c10854bwMDHguZz = dHguZz();
        final long jQKVWgx = c10854bwMDHguZz.QKVWgx();
        final long jFetchVPNInfo = c10854bwMDHguZz.fetchVPNInfo();
        if (c10854bwMDHguZz.hrNTAI()) {
            abstractC58185ywXKWHzl = C10965byR.OLrzqt.OLrzqt(str, dUDNAs(), c10854bwMDHguZz, new Function0() { // from class: o.bSD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C9303bSz.AEQbTJ(jQKVWgx, jFetchVPNInfo, this);
                }
            }, new Function2() { // from class: o.bSE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C9303bSz.OLrzqt(jQKVWgx, this, (java.lang.String) obj, (RSV) obj2);
                }
            }, new Function1() { // from class: o.bSF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(C9303bSz.EZpvd((java.lang.String) obj));
                }
            });
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5006, null, null, null, null, null, 62, null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
        }
        return OLrzqt(abstractC58185ywXKWHzl);
    }

    public static final TxMessage AEQbTJ(long j, long j2, C9303bSz c9303bSz) {
        return xYZ.KWHzl.copydefault(j, j2, c9303bSz.fHqPtx().AuCTel() ? null : c9303bSz.fHqPtx().fJNWhG(), c9303bSz.djSkpj());
    }

    public static final java.lang.String OLrzqt(long j, C9303bSz c9303bSz, java.lang.String str, RSV rsv) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(rsv, "");
        return xYZ.KWHzl.EZpvd(j, new EvmSignatureRawValue(0, c9303bSz.ORxRYg(), rsv.getR(), rsv.getS(), rsv.getV(), str));
    }

    public static final boolean EZpvd(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return !(str.length() == 0);
    }

    /* JADX DEBUG: Type inference failed for r3v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    private final AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywX) {
        final Function1 function1 = new Function1() { // from class: o.bTc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9303bSz.copydefault(this.OLrzqt, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywX.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bTg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9303bSz.hUfVAv(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData hUfVAv(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData copydefault(C9303bSz c9303bSz, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001 || responseData.getCode() == 0) {
            java.lang.String str = (java.lang.String) responseData.getData();
            java.lang.String str2 = str == null ? "" : str;
            BroadcastBean broadcastBeanGenerateBroadcastModel$default = AbstractC8664bGw.generateBroadcastModel$default(c9303bSz, str2, xYW.AEQbTJ.AEQbTJ(str2, C33129mqd.valueOf(c9303bSz.ORxRYg())), null, null, 12, null);
            broadcastBeanGenerateBroadcastModel$default.setInputData(c9303bSz.AEQbTJ());
            Unit unit = Unit.INSTANCE;
            return new ResponseData(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(broadcastBeanGenerateBroadcastModel$default), (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 254, (DefaultConstructorMarker) null), null, 46, null);
        }
        return new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, null, responseData.getError_code(), 28, null);
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<ResponseData<DappTxResultBean>> copydefault(@NotNull final BroadcastBean broadcastBean, java.lang.String str, SignAuthType signAuthType) {
        Intrinsics.checkNotNullParameter(broadcastBean, "");
        java.lang.String txHash = broadcastBean.getTxHash();
        java.lang.String str2 = txHash == null ? "" : txHash;
        C10747buL c10747buL = C10747buL.AEQbTJ;
        java.lang.String strQKVWgx = QKVWgx();
        java.lang.String strDmq = Dmq();
        long jDGOPHZ = DGOPHZ();
        long jFetchVPNInfo = dHguZz().fetchVPNInfo();
        java.lang.String strHtlTjW = htlTjW();
        java.lang.String strZLjUOn = zLjUOn();
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(OcIXYQ(), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(C9339bTi.getGasPrice$default(fJNWhG(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default3 = C54862xYb.convertToBigIntegerString$default(AbstractC9346bTp.getGasLimit$default(fJNWhG(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default4 = C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), true, (RoundingMode) null, 2, (java.lang.Object) null);
        java.lang.String inputData = broadcastBean.getInputData();
        if (inputData == null) {
            inputData = EIP1271Verifier.hexPrefix;
        }
        AbstractC58260yxt<java.lang.String> abstractC58260yxtCopydefault = c10747buL.copydefault(strQKVWgx, new C10746buK(strDmq, jDGOPHZ, str2, str2, "", jFetchVPNInfo, 2, 0, 1, strHtlTjW, strZLjUOn, strConvertToBigIntegerString$default, strConvertToBigIntegerString$default2, strConvertToBigIntegerString$default3, strConvertToBigIntegerString$default4, inputData, broadcastBean.getSignedTx(), null, java.lang.System.currentTimeMillis(), 0L, null, 1703936, null));
        final Function1 function1 = new Function1() { // from class: o.bSS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9303bSz.OLrzqt(broadcastBean, (java.lang.String) obj);
            }
        };
        AbstractC58185ywX<ResponseData<DappTxResultBean>> abstractC58185ywXEZpvd = abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.bST
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9303bSz.AxsJAYaxsJAY(function1, obj);
            }
        }).EZpvd();
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final ResponseData AxsJAYaxsJAY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData OLrzqt(BroadcastBean broadcastBean, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ResponseData(0, null, null, null, new DappTxResultBean(broadcastBean.getSignedTx(), str, broadcastBean.getTxHash(), (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.String) null, 120, (DefaultConstructorMarker) null), null, 46, null);
    }

    public static final InterfaceC60096zvd DXXBbs(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r3v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<o.bbT>> */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<C9748bbT>> AEQbTJ(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX<ResponseData<C9748bbT>> abstractC58185ywXAEQbTJ = super.AEQbTJ(str, submitTxExpandBean);
        final Function1 function1 = new Function1() { // from class: o.bSG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9303bSz.AYXKKw(this.EZpvd, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXAEQbTJ.KWHzl(new InterfaceC58229yxO() { // from class: o.bSH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9303bSz.DXXBbs(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd AYXKKw(C9303bSz c9303bSz, ResponseData responseData) {
        java.lang.String strKWHzl;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            C9748bbT c9748bbT = (C9748bbT) responseData.getData();
            if (c9748bbT != null && (strKWHzl = c9748bbT.KWHzl()) != null) {
                str = strKWHzl;
            }
            c9303bSz.fIwbmz(str);
        }
        return AbstractC58185ywX.KWHzl(responseData);
    }

    private final void fIwbmz(final java.lang.String str) {
        C32866mlf.onEvent$default("WalletRPC_Confirmation_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.bSR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9303bSz.EZpvd(this.EZpvd, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(C9303bSz c9303bSz, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("tx_source", ExtJson.BRC20TYPE_TRANSFER, true);
        eventParamsList.put("from_addr", c9303bSz.htlTjW(), false);
        eventParamsList.put("to_addr", c9303bSz.zLjUOn(), false);
        eventParamsList.put("main_token_symbol", c9303bSz.dHguZz().fJNWhG(), false);
        eventParamsList.put("chain_id", C33129mqd.gEmmrt(java.lang.Long.valueOf(c9303bSz.dHguZz().isConnected())), false);
        eventParamsList.put("token_symbol", c9303bSz.fHqPtx().fJNWhG(), false);
        eventParamsList.put("contract_address", c9303bSz.fHqPtx().OLrzqt(), false);
        eventParamsList.put("terminal", "android", true);
        eventParamsList.put("volume_token", C54870xYj.EZpvd(AbstractC8704bHj.getTransferAmount$default(c9303bSz, false, false, 3, null), c9303bSz.fHqPtx().valueOf(), c9303bSz.fHqPtx().DTwDnp(), null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null), false);
        eventParamsList.put("volume_usdt", c9303bSz.isConnected(AbstractC8704bHj.getTransferAmount$default(c9303bSz, false, false, 3, null)), false);
        eventParamsList.put("tx_hash_unique", str, false);
        int i = TaskDescription.copydefault[c9303bSz.dUDNAs().QwvEab().ordinal()];
        eventParamsList.put("wallet_type", i != 1 ? i != 2 ? i != 3 ? "" : "mpc" : Web3SecurityTrackEvent.VALUE_PRIVATE_KEY : Web3SecurityTrackEvent.VALUE_SEED_PHRASE, false);
        java.lang.String strCopydefault = xVW.copydefault();
        Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
        eventParamsList.put("device_id", strCopydefault, false);
        return Unit.INSTANCE;
    }
}
