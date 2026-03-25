package o;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.EVMAuthorization;
import com.okinc.business.defi.api.model.tx.signdata.EVMStateOverride;
import com.okinc.business.defi.api.model.tx.signdata.TransferSignData;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.bean.BroadcastBean;
import com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EVMExtJson;
import com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EvmSignInfo;
import com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EvmSignInfoGasPrice;
import com.okinc.business.defi.biz.net.bean.ExtFeeResp;
import com.okinc.business.defi.biz.net.bean.InputDataReq;
import com.okinc.business.defi.biz.net.bean.PreExecTransactionReq;
import com.okinc.business.defi.biz.net.bean.SignInfo;
import com.okinc.business.defi.biz.net.bean.SignInfoReq;
import com.okinc.business.defi.biz.net.bean.WalletGasLimitRes;
import com.okinc.business.defi.biz.wallethardware.ledger.LedgerSignHelper;
import com.okinc.business.defi.biz.wallethardware.onekey.EvmTransactionData;
import com.okinc.business.defi.biz.wallethardware.onekey.OneKeySignHelper;
import com.okinc.business.defi.wallet.hardware.onekey.OneKeyModule;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.BaseModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.PreExecTransactionRes;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TipMessageInfo;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TxInfoItem;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.TxMessage;
import com.okinc.wallet.core.sign.evm.AccountTokenTransaction;
import com.okinc.wallet.core.sign.evm.AccountTransaction;
import com.okinc.wallet.core.sign.evm.BaseAccountTransaction;
import com.okinc.wallet.core.sign.evm.EvmSignatureRawValue;
import com.okinc.wallet.core.sign.evm.OpCalDataTransaction;
import com.okinc.wallet.core.sign.utxo.RSV;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import io.reactivex.BackpressureStrategy;
import java.math.RoundingMode;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import o.C13754dXa;
import o.InterfaceC8931bLy;
import o.InterfaceC9778bbx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bNL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C8998bNL extends AbstractC8664bGw<C9311bTG, TransferSignData> implements InterfaceC8931bLy, InterfaceC9778bbx {
    public InterfaceC60094zvb AhwBna;
    public java.lang.String EZpvd;
    public java.lang.String copydefault;
    public java.lang.String djBIcL;
    public java.lang.String valueOf;
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.bNK
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C8998bNL.OLrzqt(this.AEQbTJ);
        }
    });
    public EvmSignInfo fetchVPNInfo = new EvmSignInfo((java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (EvmSignInfoGasPrice) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, 127, (DefaultConstructorMarker) null);
    public WalletGasLimitRes gEmmrt = new WalletGasLimitRes((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, 16383, (DefaultConstructorMarker) null);
    public boolean AEQbTJ = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull EvmSignInfo evmSignInfo) {
        Intrinsics.checkNotNullParameter(evmSignInfo, "");
        this.fetchVPNInfo = evmSignInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC8931bLy
    public void AEQbTJ(java.lang.String str) {
        this.valueOf = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void AhwBna(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC8931bLy
    public WalletGasLimitRes AkhnZx() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC8931bLy
    public java.lang.String AuCTel() {
        return this.valueOf;
    }

    @Override // o.AbstractC8564bFB
    public boolean DCUTEI() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC8931bLy
    public java.lang.String DbNXlk() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@NotNull WalletGasLimitRes walletGasLimitRes) {
        Intrinsics.checkNotNullParameter(walletGasLimitRes, "");
        this.gEmmrt = walletGasLimitRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean ODXsMY() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean ORxRYg() {
        return this.EZpvd != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String RcXXUw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC8931bLy
    public void copydefault(java.lang.String str) {
        this.djBIcL = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void fIwbmz(java.lang.String str) {
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC8931bLy
    public EvmSignInfo uzCIH() {
        return this.fetchVPNInfo;
    }

    public java.lang.String QKVWgx() {
        return InterfaceC8931bLy.StateListAnimator.djBIcL(this);
    }

    public java.lang.String V_() {
        return InterfaceC8931bLy.StateListAnimator.OLrzqt(this);
    }

    public int aKErDB() {
        return InterfaceC8931bLy.StateListAnimator.AYXKKw(this);
    }

    @Override // o.InterfaceC9729bbA
    public java.lang.String copydefault() {
        return InterfaceC8931bLy.StateListAnimator.AEQbTJ(this);
    }

    @Override // o.InterfaceC8931bLy
    public void copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        InterfaceC8931bLy.StateListAnimator.AEQbTJ(this, str, str2, str3);
    }

    public boolean fARcdN(java.lang.String str) {
        return InterfaceC9778bbx.StateListAnimator.KWHzl(this, str);
    }

    @Override // o.InterfaceC8931bLy
    public int fIwbmz() {
        return InterfaceC8931bLy.StateListAnimator.gEmmrt(this);
    }

    @Override // o.InterfaceC8931bLy
    public WalletGasLimitRes fetchVPNInfo() {
        return InterfaceC8931bLy.StateListAnimator.copydefault(this);
    }

    @Override // o.InterfaceC8931bLy
    public boolean getFieldNames() {
        return InterfaceC8931bLy.StateListAnimator.AkhnZx(this);
    }

    @Override // o.InterfaceC8931bLy
    public boolean hDKMBd() {
        return InterfaceC8931bLy.StateListAnimator.AhwBna(this);
    }

    @Override // o.InterfaceC8931bLy
    public EvmSignInfoGasPrice isConnected() {
        return InterfaceC8931bLy.StateListAnimator.KWHzl(this);
    }

    @Override // o.InterfaceC8931bLy
    public int iwGUEr() {
        return InterfaceC8931bLy.StateListAnimator.valueOf(this);
    }

    @Override // o.InterfaceC8931bLy
    public void valueOf(java.lang.String str) {
        InterfaceC8931bLy.StateListAnimator.EZpvd(this, str);
    }

    /* JADX DEBUG: Method merged with bridge method: DXXBbs()Lo/bCW; */
    @Override // o.AbstractC8564bFB
    public C9311bTG fJNWhG() {
        return (C9311bTG) this.AYXKKw.getValue();
    }

    public static final C9311bTG OLrzqt(C8998bNL c8998bNL) {
        return new C9311bTG(c8998bNL, c8998bNL);
    }

    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> dvKsVJ() {
        return super.r_();
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> r_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDvKsVJ = dvKsVJ();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXFZBcTu = fZBcTu();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDjSkpj = djSkpj();
        final yHO yho = new yHO() { // from class: o.bNQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C8998bNL.copydefault(this.copydefault, (kotlin.Pair) obj, (kotlin.Pair) obj2, (kotlin.Pair) obj3);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXDvKsVJ, abstractC58185ywXFZBcTu, abstractC58185ywXDjSkpj, new InterfaceC58228yxN() { // from class: o.bNP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58228yxN
            public final java.lang.Object AEQbTJ(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C8998bNL.AEQbTJ(yho, obj, obj2, obj3);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final kotlin.Pair AEQbTJ(yHO yho, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Intrinsics.checkNotNullParameter(obj3, "");
        return (kotlin.Pair) yho.invoke(obj, obj2, obj3);
    }

    public static final kotlin.Pair copydefault(C8998bNL c8998bNL, kotlin.Pair pair, kotlin.Pair pair2, kotlin.Pair pair3) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        Intrinsics.checkNotNullParameter(pair3, "");
        if (!((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return pair;
        }
        if (!((java.lang.Boolean) pair2.getFirst()).booleanValue()) {
            return pair2;
        }
        if (!((java.lang.Boolean) pair3.getFirst()).booleanValue()) {
            return pair3;
        }
        c8998bNL.fJNWhG().KWHzl(0);
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    @Override // o.AbstractC8664bGw, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.util.ArrayList<java.lang.Integer> getNewProxyInstance() {
        java.util.ArrayList<java.lang.Integer> newProxyInstance = super.getNewProxyInstance();
        newProxyInstance.add(9);
        return newProxyInstance;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public PreExecTransactionReq RdAHlO() {
        java.lang.String strOLrzqt;
        PreExecTransactionReq preExecTransactionReqRdAHlO = super.RdAHlO();
        if (fHqPtx().AuCTel()) {
            strOLrzqt = zLjUOn();
        } else {
            strOLrzqt = fHqPtx().OLrzqt();
        }
        preExecTransactionReqRdAHlO.setTo(strOLrzqt);
        preExecTransactionReqRdAHlO.setMethod("wallet_inner_transfer");
        preExecTransactionReqRdAHlO.setAmount(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null));
        preExecTransactionReqRdAHlO.setInputData(AEQbTJ());
        return preExecTransactionReqRdAHlO;
    }

    public static final kotlin.Pair AxsJAYsNCnLh(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> ffGIBT() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXGiSNqX = giSNqX();
        final Function1 function1 = new Function1() { // from class: o.bOe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8998bNL.valueOf(this.KWHzl, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXGiSNqX.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bOk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8998bNL.AxsJAYsNCnLh(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair valueOf(C8998bNL c8998bNL, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c8998bNL.fJNWhG().KWHzl(1);
        }
        return pair;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC60096zvd DXXBbs(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> DbNXlk(@NotNull java.lang.String str) {
        AbstractC58185ywX abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        EvmSignInfoGasPrice gasPrice = uzCIH().getGasPrice();
        if (gasPrice == null || str.length() == 0) {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(gasPrice);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ActionBar(gasPrice, str), BackpressureStrategy.BUFFER).copydefault(yBP.AEQbTJ()).KWHzl(C58266yxz.OLrzqt());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        }
        final Function1 function1 = new Function1() { // from class: o.bOb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8998bNL.KWHzl(this.OLrzqt, (EvmSignInfoGasPrice) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.bNX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8998bNL.DXXBbs(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd KWHzl(C8998bNL c8998bNL, EvmSignInfoGasPrice evmSignInfoGasPrice) {
        Intrinsics.checkNotNullParameter(evmSignInfoGasPrice, "");
        c8998bNL.uzCIH().setGasPrice(evmSignInfoGasPrice);
        return c8998bNL.gasjUx();
    }

    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> gasjUx() {
        return flVtFt();
    }

    @Override // o.AbstractC8664bGw, o.AbstractC8564bFB
    public java.util.ArrayList<java.lang.Integer> AuCTelauCTel() {
        java.util.ArrayList<java.lang.Integer> arrayListAuCTelauCTel = super.AuCTelauCTel();
        arrayListAuCTelauCTel.add(5);
        return arrayListAuCTelauCTel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DAIeex(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Unit> */
    @Override // o.AbstractC8704bHj, o.AbstractC8564bFB
    public AbstractC58185ywX<Unit> p_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXFZBcTu = fZBcTu();
        final Function1 function1 = new Function1() { // from class: o.bNU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8998bNL.copydefault(this.EZpvd, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXFZBcTu.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bNW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8998bNL.DAIeex(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final Unit copydefault(C8998bNL c8998bNL, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c8998bNL.fJNWhG().KWHzl(3);
        }
        return Unit.INSTANCE;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void KWHzl(@NotNull PreExecTransactionRes preExecTransactionRes) {
        WalletGasLimitRes gasFee;
        Intrinsics.checkNotNullParameter(preExecTransactionRes, "");
        super.KWHzl(preExecTransactionRes);
        TxInfoItem txInfo = preExecTransactionRes.getTxInfo();
        if (txInfo == null || (gasFee = txInfo.getGasFee()) == null) {
            return;
        }
        KWHzl(gasFee);
    }

    /* JADX DEBUG: Type inference failed for r0v8. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8664bGw
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> wlaJM() {
        if (ODXsMY()) {
            return flVtFt();
        }
        if (C33129mqd.AEQbTJ(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), "0")) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXGiSNqX = giSNqX();
            final Function1 function1 = new Function1() { // from class: o.bOn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C8998bNL.AEQbTJ(this.AEQbTJ, (kotlin.Pair) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXGiSNqX.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bOm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C8998bNL.gkJEwt(function1, obj);
                }
            });
            Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
            return abstractC58185ywXAEQbTJ;
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final kotlin.Pair gkJEwt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair AEQbTJ(C8998bNL c8998bNL, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c8998bNL.fJNWhG().KWHzl(2);
        }
        return pair;
    }

    @Override // o.AbstractC8664bGw, o.AbstractC8564bFB
    public void AhwBna() {
        TxInfoItem txInfo;
        TipMessageInfo tipMessageInfo;
        PreExecTransactionRes preExecTransactionResQSLkRj = QSLkRj();
        if (preExecTransactionResQSLkRj == null || (txInfo = preExecTransactionResQSLkRj.getTxInfo()) == null || (tipMessageInfo = txInfo.getTipMessageInfo()) == null || !fZQ.OLrzqt(tipMessageInfo)) {
            DLWbHP().AEQbTJ(new C9868bdh(!(AkhnZx().getQueryGasLimitErrorUseDefault() != null ? r2.booleanValue() : false), C33070mpX.AYXKKw(C13754dXa.FragmentManager.onMenuModeChange), null, java.lang.Boolean.TRUE, 4, null));
        }
        super.AhwBna();
    }

    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> giSNqX() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl;
        InterfaceC60094zvb interfaceC60094zvb = this.AhwBna;
        if (interfaceC60094zvb != null) {
            interfaceC60094zvb.cancel();
        }
        java.lang.Boolean needExtFee = uzCIH().getNeedExtFee();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (Intrinsics.EZpvd(needExtFee, bool)) {
            abstractC58185ywXKWHzl = fZBcTu();
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(bool, null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDjSkpj = djSkpj();
        final Function2 function2 = new Function2() { // from class: o.bOa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C8998bNL.EZpvd((kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXKWHzl, abstractC58185ywXDjSkpj, new InterfaceC58223yxI() { // from class: o.bOg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C8998bNL.EZpvd(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.bOd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8998bNL.EZpvd(this.AEQbTJ, (InterfaceC60094zvb) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd2 = abstractC58185ywXEZpvd.EZpvd(new InterfaceC58227yxM() { // from class: o.bOf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C8998bNL.OqFWZa(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd2, "");
        return abstractC58185ywXEZpvd2;
    }

    public static final kotlin.Pair EZpvd(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final kotlin.Pair EZpvd(kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        return !((java.lang.Boolean) pair.getFirst()).booleanValue() ? pair : !((java.lang.Boolean) pair2.getFirst()).booleanValue() ? pair2 : C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OqFWZa(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C8998bNL c8998bNL, InterfaceC60094zvb interfaceC60094zvb) {
        c8998bNL.AhwBna = interfaceC60094zvb;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC60096zvd RlQdEF(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> fZBcTu() {
        AbstractC58185ywX<ResponseData<SignInfo>> abstractC58185ywXOcIXYQ = OcIXYQ();
        final Function1 function1 = new Function1() { // from class: o.bNI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8998bNL.valueOf(this.KWHzl, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXOcIXYQ.KWHzl(new InterfaceC58229yxO() { // from class: o.bNM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8998bNL.RlQdEF(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public AbstractC58185ywX<ResponseData<SignInfo>> OcIXYQ() {
        C13934dbu c13934dbuOFhtUX = OFhtUX();
        java.lang.String strOxVOHk = OxVOHk();
        java.lang.String strDmq = Dmq();
        long jDGOPHZ = DGOPHZ();
        return c13934dbuOFhtUX.copydefault(strOxVOHk, strDmq, new SignInfoReq(java.lang.String.valueOf(jDGOPHZ), fERRXa().getAddress(), zLjUOn(), 5, AEQbTJ(), fHqPtx().AuCTel() ? C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), true, (RoundingMode) null, 2, (java.lang.Object) null) : "0", (java.lang.String) null, (java.lang.Integer) null, (java.lang.Long) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Boolean) null, 8128, (DefaultConstructorMarker) null));
    }

    /* JADX DEBUG: Type inference failed for r0v8. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> flVtFt() {
        java.lang.Boolean needExtFee = uzCIH().getNeedExtFee();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (Intrinsics.EZpvd(needExtFee, bool)) {
            AbstractC58185ywX<ResponseData<ExtFeeResp>> abstractC58185ywXOLrzqt = OFhtUX().OLrzqt(OxVOHk(), Dmq(), new InputDataReq(DGOPHZ(), fvQaOB()));
            final Function1 function1 = new Function1() { // from class: o.bOl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C8998bNL.AhwBna(this.KWHzl, (ResponseData) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bOi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C8998bNL.AYXKKw(function1, obj);
                }
            });
            Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
            return abstractC58185ywXAEQbTJ;
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(bool, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    private final java.lang.String fvQaOB() {
        OpCalDataTransaction opCalDataTransaction;
        long jFetchVPNInfo = dHguZz().fetchVPNInfo();
        SignParams signParams = new SignParams(jFetchVPNInfo, jFetchVPNInfo, dNCPSb(), null, null, null, 0, null, false, false, null, 2040, null);
        if (fHqPtx().AuCTel()) {
            opCalDataTransaction = new OpCalDataTransaction(zLjUOn(), C54862xYb.convertToBigIntegerString$default(C9311bTG.getGasPrice$default(fJNWhG(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(AbstractC9346bTp.getGasLimit$default(fJNWhG(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), true, (RoundingMode) null, 2, (java.lang.Object) null), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, WalletImportError.ERROR_CODE_AA_EXIST, (DefaultConstructorMarker) null);
        } else {
            opCalDataTransaction = new OpCalDataTransaction(zLjUOn(), C54862xYb.convertToBigIntegerString$default(C9311bTG.getGasPrice$default(fJNWhG(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(AbstractC9346bTp.getGasLimit$default(fJNWhG(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null), (java.lang.String) null, C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), true, (RoundingMode) null, 2, (java.lang.Object) null), fHqPtx().OLrzqt(), (java.lang.String) null, 72, (DefaultConstructorMarker) null);
        }
        return xYZ.KWHzl.copydefault(signParams, opCalDataTransaction);
    }

    /* JADX INFO: renamed from: o.bNL$ActionBar */
    public static final class ActionBar<T> implements InterfaceC58187ywZ {
        public final /* synthetic */ java.lang.String OLrzqt;
        public final /* synthetic */ java.lang.Object copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(java.lang.Object obj, java.lang.String str) {
            this.copydefault = obj;
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.ywW<com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EvmSignInfoGasPrice> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.InterfaceC58187ywZ
        public final void subscribe(InterfaceC58184ywW<EvmSignInfoGasPrice> interfaceC58184ywW) {
            java.lang.Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
            java.lang.String str = this.OLrzqt;
            java.lang.Object obj = this.copydefault;
            try {
                Result.Application application = Result.Companion;
                JsonObject asJsonObject = ((JsonObject) new Gson().fromJson(str, new TypeToken<JsonObject>() { // from class: o.bNL.ActionBar.5
                }.getType())).getAsJsonObject();
                if (asJsonObject.has("gasPrice") && asJsonObject.get("gasPrice").isJsonObject()) {
                    asJsonObject = ((JsonObject) new Gson().fromJson(str, new TypeToken<JsonObject>() { // from class: o.bNL.ActionBar.4
                    }.getType())).get("gasPrice").getAsJsonObject();
                }
                JsonObject jsonObject = (JsonObject) new Gson().fromJson(obj != null ? C33488mxR.EZpvd(obj) : null, new TypeToken<JsonObject>() { // from class: o.bNL.ActionBar.1
                }.getType());
                C12764ctD c12764ctD = C12764ctD.OLrzqt;
                Intrinsics.copydefault(jsonObject);
                Intrinsics.copydefault(asJsonObject);
                objM7377constructorimpl = Result.m7377constructorimpl(new Gson().fromJson((JsonElement) c12764ctD.OLrzqt(jsonObject, asJsonObject), (java.lang.Class) EvmSignInfoGasPrice.class));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Object obj2 = Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl;
            if (obj2 == null) {
                obj2 = this.copydefault;
            }
            interfaceC58184ywW.onNext(obj2);
            interfaceC58184ywW.onComplete();
        }
    }

    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> djSkpj() {
        java.lang.String strOLrzqt;
        if (ODXsMY()) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        C13934dbu c13934dbuOFhtUX = OFhtUX();
        java.lang.String address = fERRXa().getAddress();
        java.lang.String strAEQbTJ = AEQbTJ();
        if (fHqPtx().AuCTel()) {
            strOLrzqt = zLjUOn();
        } else {
            strOLrzqt = fHqPtx().OLrzqt();
        }
        AbstractC58185ywX abstractC58185ywXCopydefault = c13934dbuOFhtUX.copydefault(address, strAEQbTJ, strOLrzqt, (496 & 8) != 0 ? null : java.lang.Long.valueOf(DGOPHZ()), (496 & 16) != 0 ? null : fHqPtx().AuCTel() ? AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null) : null, (496 & 32) != 0, (java.util.List<EVMAuthorization>) ((496 & 64) != 0 ? null : null), (496 & 128) != 0 ? null : null, (java.util.List<EVMStateOverride>) ((496 & 256) != 0 ? null : null));
        final Function1 function1 = new Function1() { // from class: o.bNY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8998bNL.djBIcL(this.OLrzqt, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bNZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8998bNL.valueOf(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    @Override // o.InterfaceC9778bbx
    public java.lang.String AEQbTJ() {
        return (!fHqPtx().DCUTEIddSDPG() || zLjUOn().length() <= 0) ? this.EZpvd : xYW.AEQbTJ.copydefault(zLjUOn(), C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), false, (RoundingMode) null, 3, (java.lang.Object) null));
    }

    @Override // o.InterfaceC9778bbx
    public boolean KWHzl() {
        return fHqPtx().AuCTel();
    }

    @Override // o.InterfaceC9778bbx
    public AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> KWHzl(java.lang.String str) {
        DataInputModuleModel.DataInputItem data;
        final java.lang.String string = str != null ? StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString() : null;
        this.EZpvd = (string == null || string.length() == 0 || C59449zhJ.gEmmrt(string, EIP1271Verifier.hexPrefix, true)) ? null : string;
        java.util.List<BaseModel<?>> listUSBtdM = USBtdM();
        if (listUSBtdM != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listUSBtdM) {
                if (obj instanceof DataInputModuleModel) {
                    arrayList.add(obj);
                }
            }
            DataInputModuleModel dataInputModuleModel = (DataInputModuleModel) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
            if (dataInputModuleModel != null && (data = dataInputModuleModel.getData()) != null) {
                data.setContent(this.EZpvd);
            }
        }
        if (fARcdN(string)) {
            DLWbHP().AEQbTJ(new C9795bcN(true));
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXGiSNqX = giSNqX();
            final Function1 function1 = new Function1() { // from class: o.bNS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C8998bNL.OLrzqt(this.copydefault, string, (kotlin.Pair) obj2);
                }
            };
            AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58260yxtValueOf = abstractC58185ywXGiSNqX.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bNV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj2) {
                    return C8998bNL.accept(function1, obj2);
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

    public static final kotlin.Pair accept(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair OLrzqt(C8998bNL c8998bNL, java.lang.String str, kotlin.Pair pair) {
        java.util.ArrayList<java.lang.Integer> checkTypeFailList;
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c8998bNL.fJNWhG().KWHzl(2);
        }
        if (str != null && C9700baY.EZpvd(str) && C33129mqd.KWHzl((java.util.Collection) c8998bNL.OJuSTm().getCheckTypeFailList()) && (checkTypeFailList = c8998bNL.OJuSTm().getCheckTypeFailList()) != null && checkTypeFailList.contains(3)) {
            c8998bNL.DLWbHP().AEQbTJ(new C9821bcn(false));
        } else {
            c8998bNL.DLWbHP().AEQbTJ(new C9821bcn(true));
        }
        return pair;
    }

    public java.lang.String dNCPSb() {
        C10854bwM c10854bwMFHqPtx = fHqPtx();
        if (c10854bwMFHqPtx.AuCTel()) {
            return null;
        }
        return c10854bwMFHqPtx.fJNWhG();
    }

    public AccountTransaction QVAiDq() {
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(V_(), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strZLjUOn = zLjUOn();
        java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default3 = C54862xYb.convertToBigIntegerString$default(C9311bTG.getGasPrice$default(fJNWhG(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default4 = C54862xYb.convertToBigIntegerString$default(AbstractC9346bTp.getGasLimit$default(fJNWhG(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
        int iIwGUEr = iwGUEr();
        java.lang.String strConvertToBigIntegerString$default5 = C54862xYb.convertToBigIntegerString$default(C9311bTG.getGasPrice$default(fJNWhG(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String priorityFee$default = C9311bTG.getPriorityFee$default(fJNWhG(), 0, 1, null);
        return new AccountTransaction(strZLjUOn, strConvertToBigIntegerString$default, strConvertToBigIntegerString$default3, strConvertToBigIntegerString$default4, strConvertToBigIntegerString$default2, null, iIwGUEr, strConvertToBigIntegerString$default5, priorityFee$default != null ? C54862xYb.convertToBigIntegerString$default(priorityFee$default, false, (RoundingMode) null, 3, (java.lang.Object) null) : null, QKVWgx(), this.EZpvd);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AccountTokenTransaction QUSxYX() {
        java.lang.String str;
        java.lang.String strZLjUOn = zLjUOn();
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(V_(), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default2 = Intrinsics.EZpvd(fHqPtx().WS(), java.lang.Boolean.TRUE) ? C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), false, (RoundingMode) null, 3, (java.lang.Object) null) : "0";
        java.lang.String strConvertToBigIntegerString$default3 = C54862xYb.convertToBigIntegerString$default(C9311bTG.getGasPrice$default(fJNWhG(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default4 = C54862xYb.convertToBigIntegerString$default(AbstractC9346bTp.getGasLimit$default(fJNWhG(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strOLrzqt = fHqPtx().OLrzqt();
        java.lang.String address = fERRXa().getAddress();
        int iIwGUEr = iwGUEr();
        java.lang.String strConvertToBigIntegerString$default5 = C54862xYb.convertToBigIntegerString$default(C9311bTG.getGasPrice$default(fJNWhG(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default6 = C54862xYb.convertToBigIntegerString$default(C9311bTG.getPriorityFee$default(fJNWhG(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strQKVWgx = QKVWgx();
        java.lang.String strConvertToBigIntegerString$default7 = C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strAEQbTJ = AEQbTJ();
        if (strAEQbTJ == null) {
            str = "";
        } else {
            if (strAEQbTJ.length() == 0) {
                strAEQbTJ = "";
            } else if (!C59449zhJ.AYXKKw(strAEQbTJ, EIP1271Verifier.hexPrefix, true)) {
                strAEQbTJ = EIP1271Verifier.hexPrefix + strAEQbTJ;
            }
            if (strAEQbTJ != null) {
                str = strAEQbTJ;
            }
        }
        return new AccountTokenTransaction(strZLjUOn, strConvertToBigIntegerString$default, strConvertToBigIntegerString$default3, strConvertToBigIntegerString$default4, strConvertToBigIntegerString$default2, iIwGUEr, strConvertToBigIntegerString$default5, strConvertToBigIntegerString$default6, strQKVWgx, str, strOLrzqt, strConvertToBigIntegerString$default7, address);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull final java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(Unit.INSTANCE);
        final Function1 function1 = new Function1() { // from class: o.bNT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8998bNL.copydefault(this.KWHzl, str, (Unit) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bOc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8998bNL.QKudOq(function1, obj);
            }
        });
        Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
        return copydefault(abstractC58185ywXAEQbTJ);
    }

    public static final ResponseData QKudOq(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData copydefault(C8998bNL c8998bNL, java.lang.String str, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        java.lang.String strOLrzqt = xYZ.KWHzl.OLrzqt(new SignParams(c8998bNL.dHguZz().QKVWgx(), c8998bNL.dHguZz().fetchVPNInfo(), c8998bNL.dNCPSb(), str, null, java.lang.Integer.valueOf(c8998bNL.dUDNAs().finit()), 0, null, false, false, null, 1984, null), c8998bNL.UeEOUB());
        if (strOLrzqt == null || strOLrzqt.length() == 0) {
            return new ResponseData(-5005, null, null, null, null, null, 62, null);
        }
        return new ResponseData(-5001, null, null, null, strOLrzqt, null, 46, null);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> copydefault(SubmitTxExpandBean submitTxExpandBean) {
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl;
        LedgerSignHelper ledgerSignHelper = LedgerSignHelper.AEQbTJ;
        if (ledgerSignHelper.KWHzl(dHguZz())) {
            abstractC58185ywXKWHzl = ledgerSignHelper.KWHzl(new LedgerSignHelper.StateListAnimator(dHguZz(), fERRXa(), ORxRYg(), iwGUEr(), QKVWgx(), gEmmrt()));
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(73819761, null, null, null, null, null, 62, null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
        }
        return copydefault(abstractC58185ywXKWHzl);
    }

    @Override // o.InterfaceC8931bLy
    public java.lang.String gEmmrt() {
        return xYZ.KWHzl.AEQbTJ(dHguZz().QKVWgx(), dHguZz().fetchVPNInfo(), dNCPSb(), UeEOUB());
    }

    public BaseAccountTransaction UeEOUB() {
        if (fHqPtx().AuCTel()) {
            return QVAiDq();
        }
        return QUSxYX();
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> EZpvd(SubmitTxExpandBean submitTxExpandBean) {
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl;
        ResponseData responseData;
        java.lang.String keystoneSignTx;
        if (xZX.OLrzqt.copydefault(dHguZz())) {
            java.lang.String keystoneSignTx2 = submitTxExpandBean != null ? submitTxExpandBean.getKeystoneSignTx() : null;
            if (keystoneSignTx2 == null || keystoneSignTx2.length() == 0) {
                responseData = new ResponseData(-5013, null, null, null, null, null, 62, null);
            } else {
                java.lang.String keystoneSignTx3 = submitTxExpandBean.getKeystoneSignTx();
                Intrinsics.copydefault((java.lang.Object) keystoneSignTx3);
                if (C59449zhJ.AYXKKw(keystoneSignTx3, EIP1271Verifier.hexPrefix, true)) {
                    keystoneSignTx = submitTxExpandBean.getKeystoneSignTx();
                } else {
                    keystoneSignTx = EIP1271Verifier.hexPrefix + submitTxExpandBean.getKeystoneSignTx();
                }
                responseData = new ResponseData(-5001, null, null, null, keystoneSignTx, null, 46, null);
            }
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(responseData);
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5006, null, null, null, null, null, 62, null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
        }
        return copydefault(abstractC58185ywXKWHzl);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(SubmitTxExpandBean submitTxExpandBean) {
        if (OneKeyModule.OLrzqt.AEQbTJ(dHguZz())) {
            return copydefault(OneKeySignHelper.copydefault.KWHzl(dUDNAs(), fERRXa(), new EvmTransactionData(iwGUEr(), dHguZz().QKVWgx(), QKVWgx(), gEmmrt(), UeEOUB(), null)));
        }
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5006, null, null, null, null, null, 62, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> EZpvd(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        C10854bwM c10854bwMDHguZz = dHguZz();
        final long jQKVWgx = c10854bwMDHguZz.QKVWgx();
        final long jFetchVPNInfo = c10854bwMDHguZz.fetchVPNInfo();
        if (c10854bwMDHguZz.hrNTAI()) {
            abstractC58185ywXKWHzl = C10965byR.OLrzqt.OLrzqt(str, dUDNAs(), c10854bwMDHguZz, new Function0() { // from class: o.bNO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C8998bNL.OLrzqt(jQKVWgx, jFetchVPNInfo, this);
                }
            }, new Function2() { // from class: o.bNR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C8998bNL.copydefault(jQKVWgx, this, (java.lang.String) obj, (RSV) obj2);
                }
            }, new Function1() { // from class: o.bNN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(C8998bNL.AhwBna((java.lang.String) obj));
                }
            });
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5006, null, null, null, null, null, 62, null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
        }
        return copydefault(abstractC58185ywXKWHzl);
    }

    public static final TxMessage OLrzqt(long j, long j2, C8998bNL c8998bNL) {
        return xYZ.KWHzl.copydefault(j, j2, c8998bNL.dNCPSb(), c8998bNL.UeEOUB());
    }

    public static final java.lang.String copydefault(long j, C8998bNL c8998bNL, java.lang.String str, RSV rsv) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(rsv, "");
        return xYZ.KWHzl.EZpvd(j, new EvmSignatureRawValue(c8998bNL.iwGUEr(), c8998bNL.QKVWgx(), rsv.getR(), rsv.getS(), rsv.getV(), str));
    }

    public static final boolean AhwBna(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return !(str.length() == 0);
    }

    public static final ResponseData iZzfmt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> copydefault(@NotNull AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywX) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        final Function1 function1 = new Function1() { // from class: o.bOj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8998bNL.copydefault(this.KWHzl, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywX.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bOh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8998bNL.iZzfmt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData copydefault(C8998bNL c8998bNL, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001 || responseData.getCode() == 0) {
            java.lang.String str = (java.lang.String) responseData.getData();
            if (str == null) {
                str = "";
            }
            java.lang.String strOLrzqt = c8998bNL.OLrzqt(str);
            C9215bRQ c9215bRQKWHzl = c8998bNL.fJNWhG().KWHzl();
            java.lang.String str2 = (java.lang.String) responseData.getData();
            if (str2 == null) {
                str2 = "";
            }
            BroadcastBean broadcastBeanGenerateBroadcastModel$default = AbstractC8664bGw.generateBroadcastModel$default(c8998bNL, str2, strOLrzqt, null, new EVMExtJson(c8998bNL.V_(), AbstractC9346bTp.getGasLimit$default(c8998bNL.fJNWhG(), 0, 1, null), C9311bTG.getGasPrice$default(c8998bNL.fJNWhG(), 0, 1, null), C9311bTG.getPriorityFee$default(c8998bNL.fJNWhG(), 0, 1, null), c8998bNL.dHguZz().valueOf(), c8998bNL.aKErDB(), c8998bNL.DbNXlk(), c8998bNL.RcXXUw(), java.lang.Integer.valueOf(c8998bNL.fJNWhG().fetchVPNInfo()), null, 512, null), 4, null);
            broadcastBeanGenerateBroadcastModel$default.setInputData(c8998bNL.EZpvd);
            Unit unit = Unit.INSTANCE;
            return new ResponseData(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(broadcastBeanGenerateBroadcastModel$default), (java.util.List) null, (java.lang.Boolean) null, c9215bRQKWHzl.getCost(), (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 246, (DefaultConstructorMarker) null), null, 46, null);
        }
        return new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, null, responseData.getError_code(), 28, null);
    }

    public java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return xYW.AEQbTJ.AEQbTJ(str, dHguZz().fetchVPNInfo());
    }

    @Override // o.AbstractC8564bFB
    public void EZpvd(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "");
        super.EZpvd(jsonObject);
        InterfaceC8931bLy.StateListAnimator.copydefault(this, jsonObject);
    }

    public static final InterfaceC60096zvd valueOf(C8998bNL c8998bNL, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            if (((SignInfo) data).getInfo() != null) {
                java.lang.Object data2 = responseData.getData();
                Intrinsics.copydefault(data2);
                c8998bNL.copydefault(((SignInfo) data2).getSupportPush());
                C33489mxS c33489mxS = C33489mxS.KWHzl;
                KSerializer<EvmSignInfo> kSerializerSerializer = EvmSignInfo.Companion.serializer();
                java.lang.Object data3 = responseData.getData();
                Intrinsics.copydefault(data3);
                kotlinx.serialization.json.JsonObject info = ((SignInfo) data3).getInfo();
                Intrinsics.copydefault(info);
                c8998bNL.AEQbTJ((EvmSignInfo) c33489mxS.OLrzqt((DeserializationStrategy) kSerializerSerializer, info.toString()));
                return c8998bNL.gasjUx();
            }
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg()));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final kotlin.Pair AhwBna(C8998bNL c8998bNL, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            c8998bNL.fIwbmz(((ExtFeeResp) data).getExtFee());
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }

    public static final kotlin.Pair djBIcL(C8998bNL c8998bNL, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            c8998bNL.KWHzl((WalletGasLimitRes) data);
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }
}
