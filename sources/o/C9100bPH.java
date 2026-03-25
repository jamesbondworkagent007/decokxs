package o;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.AACancelApprovalSignData;
import com.okinc.business.defi.api.model.tx.signdata.AAContractSignData;
import com.okinc.business.defi.api.model.tx.signdata.AASubSignData;
import com.okinc.business.defi.api.model.tx.signdata.ContractSignData;
import com.okinc.business.defi.api.model.tx.signdata.PlatformItem;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.defi.biz.core.error.CoinMetaError;
import com.okinc.business.defi.biz.core.ticker.WalletTickerManager;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.bean.BroadcastBean;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.biz.core.transaction.sign.evm.aa.bean.AAExtJson;
import com.okinc.business.defi.biz.core.transaction.sign.evm.aa.bean.ApprovalForAll;
import com.okinc.business.defi.biz.core.transaction.sign.evm.bean.AAEvmSignInfo;
import com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EvmSignInfoGasPrice;
import com.okinc.business.defi.biz.net.bean.AAAccountInfo;
import com.okinc.business.defi.biz.net.bean.ApproveAAItemParam;
import com.okinc.business.defi.biz.net.bean.ApproveAASubRequest;
import com.okinc.business.defi.biz.net.bean.ContractAddressReq;
import com.okinc.business.defi.biz.net.bean.ContractAddressResp;
import com.okinc.business.defi.biz.net.bean.Paymaster;
import com.okinc.business.defi.biz.net.bean.PaymasterToken;
import com.okinc.business.defi.biz.net.bean.SignInfo;
import com.okinc.business.defi.biz.net.bean.SignInfoReq;
import com.okinc.business.defi.biz.net.bean.TxToastCheckReq;
import com.okinc.business.defi.biz.net.bean.TxToastCheckRes;
import com.okinc.business.defi.biz.net.bean.UserOperation;
import com.okinc.business.defi.wallet.transfer.manager.FreeGasManager;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.javascript.WalletJsBridge;
import com.okinc.wallet.core.sign.evm.ExecuteParams;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import io.reactivex.BackpressureStrategy;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import java.util.Map;
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
import kotlinx.serialization.json.JsonPrimitive;
import o.AbstractC8919bLm;
import o.C13754dXa;
import o.InterfaceC9041bOB;
import o.InterfaceC9730bbB;
import o.InterfaceC9736bbH;
import o.InterfaceC9737bbI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bPH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9100bPH extends AbstractC8919bLm<C9225bRa, AAContractSignData> implements InterfaceC9041bOB, InterfaceC9736bbH {
    public AAAccountInfo AYXKKw;
    public AAContractSignData OcIXYQ;
    public FreeGasManager.UserFreeGasInfo QUSxYX;
    public final boolean QfsBiF;
    public AAContractSignData RJOkX;
    public java.util.List<ContractAddressResp> djBIcL;
    public AbstractC9226bRb djSkpj;
    public java.util.List<C9168bQW> valueOf;
    public final AbstractC8564bFB<?, ?> dNCPSb = this;
    public final InterfaceC56387yDm ORxRYg = C56392yDr.copydefault(new Function0() { // from class: o.bPL
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C9100bPH.AEQbTJ(this.copydefault);
        }
    });
    public final InterfaceC56387yDm fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.bPM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C9100bPH.aKErDB();
        }
    });
    public final FreeGasManager AhwBna = new FreeGasManager();
    public AAEvmSignInfo RcXXUw = new AAEvmSignInfo((java.lang.String) null, (java.lang.String) null, (EvmSignInfoGasPrice) null, 7, (DefaultConstructorMarker) null);
    public final java.util.Map<kotlin.Pair<java.lang.String, java.lang.String>, java.util.List<java.lang.String>> QVAiDq = new LinkedHashMap();
    public java.util.List<PaymasterToken> QbewEr = yDY.AhwBna();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final ResponseData AEQbTJ(ResponseData responseData, ResponseData responseData2) {
        Intrinsics.checkNotNullParameter(responseData2, "");
        return responseData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final kotlin.Pair valueOf(kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        return pair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9041bOB
    public void AEQbTJ(@NotNull AAAccountInfo aAAccountInfo) {
        Intrinsics.checkNotNullParameter(aAAccountInfo, "");
        this.AYXKKw = aAAccountInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9041bOB
    public java.util.List<PaymasterToken> AuCTel() {
        return this.QbewEr;
    }

    @Override // o.AbstractC8564bFB
    public boolean DCUTEI() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9041bOB
    public void EZpvd(@NotNull java.util.List<PaymasterToken> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.QbewEr = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean H_() {
        return this.QfsBiF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9041bOB
    public void KWHzl(@NotNull java.util.List<C9168bQW> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.valueOf = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9041bOB
    public void OLrzqt(@NotNull AbstractC9226bRb abstractC9226bRb) {
        Intrinsics.checkNotNullParameter(abstractC9226bRb, "");
        this.djSkpj = abstractC9226bRb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@NotNull AAEvmSignInfo aAEvmSignInfo) {
        Intrinsics.checkNotNullParameter(aAEvmSignInfo, "");
        this.RcXXUw = aAEvmSignInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9041bOB
    public void copydefault(@NotNull FreeGasManager.UserFreeGasInfo userFreeGasInfo) {
        Intrinsics.checkNotNullParameter(userFreeGasInfo, "");
        this.QUSxYX = userFreeGasInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9041bOB
    public java.util.Map<kotlin.Pair<java.lang.String, java.lang.String>, java.util.List<java.lang.String>> fJNWhG() {
        return this.QVAiDq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9041bOB
    public AbstractC8564bFB<?, ?> getFieldNames() {
        return this.dNCPSb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9041bOB
    public AAEvmSignInfo hDKMBd() {
        return this.RcXXUw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9041bOB
    public FreeGasManager valueOf() {
        return this.AhwBna;
    }

    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> AEQbTJ(SubmitTxExpandBean submitTxExpandBean) {
        return InterfaceC9041bOB.Application.copydefault(this, submitTxExpandBean);
    }

    @Override // o.InterfaceC9730bbB
    public boolean AEQbTJ() {
        return InterfaceC9736bbH.StateListAnimator.EZpvd(this);
    }

    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> AYXKKw(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        return InterfaceC9041bOB.Application.OLrzqt(this, str, submitTxExpandBean);
    }

    @Override // o.InterfaceC9041bOB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AubY() {
        return InterfaceC9041bOB.Application.values(this);
    }

    @Override // o.InterfaceC9730bbB
    public InterfaceC9730bbB.StateListAnimator EZpvd() {
        return InterfaceC9736bbH.StateListAnimator.AEQbTJ(this);
    }

    @Override // o.InterfaceC9730bbB
    public void EZpvd(@NotNull java.lang.String str) {
        InterfaceC9736bbH.StateListAnimator.OLrzqt(this, str);
    }

    @Override // o.InterfaceC9730bbB
    public boolean KWHzl() {
        return InterfaceC9736bbH.StateListAnimator.copydefault(this);
    }

    @Override // o.InterfaceC9730bbB
    public java.lang.String OLrzqt() {
        return InterfaceC9736bbH.StateListAnimator.OLrzqt(this);
    }

    public AbstractC58185ywX<ResponseData<UserOperation>> OLrzqt(@NotNull TxToastCheckReq txToastCheckReq, @NotNull java.util.List<ExecuteParams> list, @NotNull Function1<? super java.lang.String, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1) {
        return InterfaceC9041bOB.Application.KWHzl(this, txToastCheckReq, list, function1);
    }

    public boolean UeEOUB() {
        return InterfaceC9041bOB.Application.copydefault(this);
    }

    @Override // o.InterfaceC9730bbB
    public java.lang.String a_(boolean z) {
        return InterfaceC9736bbH.StateListAnimator.KWHzl(this, z);
    }

    @Override // o.InterfaceC9729bbA
    public java.lang.String copydefault() {
        return InterfaceC9041bOB.Application.KWHzl(this);
    }

    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> copydefault(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        return InterfaceC9041bOB.Application.AEQbTJ(this, str, submitTxExpandBean);
    }

    @Override // o.InterfaceC9041bOB
    public java.lang.String fetchVPNInfo() {
        return InterfaceC9041bOB.Application.OLrzqt(this);
    }

    @Override // o.InterfaceC9041bOB
    public boolean gHZMYf() {
        return InterfaceC9041bOB.Application.DbNXlk(this);
    }

    public boolean giSNqX() {
        return InterfaceC9041bOB.Application.AkhnZx(this);
    }

    public AbstractC58185ywX<Unit> iZzfmt() {
        return InterfaceC9041bOB.Application.fetchVPNInfo(this);
    }

    @Override // o.InterfaceC9041bOB
    public boolean sSMYrx() {
        return InterfaceC9041bOB.Application.fARcdN(this);
    }

    /* JADX DEBUG: Method merged with bridge method: DXXBbs()Lo/bCW; */
    @Override // o.AbstractC8564bFB
    /* JADX INFO: renamed from: isConnected, reason: merged with bridge method [inline-methods] */
    public C9225bRa fJNWhG() {
        return (C9225bRa) this.ORxRYg.getValue();
    }

    public static final C9225bRa AEQbTJ(C9100bPH c9100bPH) {
        return new C9225bRa(c9100bPH, c9100bPH);
    }

    @Override // o.InterfaceC9041bOB
    public xYJ AkhnZx() {
        return (xYJ) this.fetchVPNInfo.getValue();
    }

    public static final xYJ aKErDB() {
        android.app.Application applicationAEQbTJ = C9678baC.Companion.AEQbTJ();
        java.lang.String strOLrzqt = WalletJsBridge.AEQbTJ.OLrzqt();
        if (strOLrzqt == null) {
            strOLrzqt = "";
        }
        return new xYJ(applicationAEQbTJ, strOLrzqt);
    }

    @Override // o.InterfaceC9041bOB
    public FreeGasManager.UserFreeGasInfo fARcdN() {
        FreeGasManager.UserFreeGasInfo userFreeGasInfo = this.QUSxYX;
        if (userFreeGasInfo != null) {
            return userFreeGasInfo;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.InterfaceC9041bOB
    public java.util.List<C9168bQW> DbNXlk() {
        java.util.List<C9168bQW> list = this.valueOf;
        if (list != null) {
            return list;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.InterfaceC9041bOB
    public AAAccountInfo AYXKKw() {
        AAAccountInfo aAAccountInfo = this.AYXKKw;
        if (aAAccountInfo != null) {
            return aAAccountInfo;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.InterfaceC9041bOB
    public AbstractC9226bRb iwGUEr() {
        AbstractC9226bRb abstractC9226bRb = this.djSkpj;
        if (abstractC9226bRb != null) {
            return abstractC9226bRb;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.AbstractC8564bFB, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean KWHzl(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull C10854bwM c10854bwM, @NotNull SignDataArgs<AAContractSignData> signDataArgs) {
        OKWBaseTransaction.TransactionType transactionType;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(signDataArgs, "");
        boolean zKWHzl = super.KWHzl(abstractC12782ctV, c10854bwM, signDataArgs);
        java.util.List<AASubSignData> dataList = QVsKAR().getDataList();
        if (dataList.size() == 1) {
            java.lang.String data = dataList.get(0).getData();
            if (QVsKAR() instanceof AACancelApprovalSignData) {
                OLrzqt(OKWBaseTransaction.TransactionType.CancelApprove);
            } else if (dataList.get(0).isErc20Approval()) {
                OLrzqt(OKWBaseTransaction.TransactionType.Approve);
            } else {
                AbstractC8919bLm.ActionBar actionBar = AbstractC8919bLm.Companion;
                if (actionBar.EZpvd(data)) {
                    OLrzqt(OKWBaseTransaction.TransactionType.DappTransfer);
                } else if (actionBar.AEQbTJ(data)) {
                    if (actionBar.KWHzl(data)) {
                        transactionType = OKWBaseTransaction.TransactionType.Approve;
                    } else {
                        transactionType = OKWBaseTransaction.TransactionType.CancelApprove;
                    }
                    OLrzqt(transactionType);
                }
            }
        }
        return zKWHzl;
    }

    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> r_() {
        if (QwvEab() == 2 && (aUsmxb() == OKWBaseTransaction.TransactionType.DappTransfer || fvQaOB())) {
            C32866mlf.onEvent$default("AANonContractTransactionInterception_Function_Api_Click", (TrackChannel[]) null, new Function1() { // from class: o.bQk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C9100bPH.KWHzl(this.KWHzl, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            UlJrfe().AEQbTJ(new C9868bdh(false, C33070mpX.AYXKKw(C13754dXa.FragmentManager.initWindowDecorActionBar), null, null, 12, null));
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXR_ = super.r_();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXIsConnected = InterfaceC9041bOB.Application.isConnected(this);
        final Function2 function2 = new Function2() { // from class: o.bQj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C9100bPH.copydefault(this.EZpvd, (kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXR_, abstractC58185ywXIsConnected, new InterfaceC58223yxI() { // from class: o.bPG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C9100bPH.AYXKKw(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final Unit KWHzl(C9100bPH c9100bPH, EventParamsList eventParamsList) {
        java.lang.String url;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        PlatformItem dapp = c9100bPH.OJuSTm().getDapp();
        EventParamsList.put$default(eventParamsList, "url", (dapp == null || (url = dapp.getUrl()) == null) ? "" : url, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final kotlin.Pair AYXKKw(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final kotlin.Pair copydefault(C9100bPH c9100bPH, kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        if (!((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return pair;
        }
        if (!((java.lang.Boolean) pair2.getFirst()).booleanValue()) {
            return pair2;
        }
        c9100bPH.fJNWhG().KWHzl(0);
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    public final boolean fvQaOB() {
        java.lang.String inputData$default = AbstractC8601bFm.getInputData$default(this, false, 1, null);
        return C59449zhJ.startsWith$default(inputData$default, "a9059cbb", false, 2, null) || C59449zhJ.startsWith$default(inputData$default, "0xa9059cbb", false, 2, null);
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> QHmsKR() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.InterfaceC9041bOB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AxsJAY() {
        return super.QHmsKR();
    }

    @Override // o.AbstractC8601bFm
    public boolean ae_() {
        return super.ae_() || (aUsmxb() == OKWBaseTransaction.TransactionType.Contract && djBIcL() > 0);
    }

    /* JADX DEBUG: Type inference failed for r0v10. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8601bFm
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> OcIXYQ() {
        if (aUsmxb() == OKWBaseTransaction.TransactionType.Contract && djBIcL() > 0) {
            long jAhwBna = dHguZz().AhwBna();
            java.util.List<AASubSignData> dataList = QVsKAR().getDataList();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : dataList) {
                if (((AASubSignData) obj).isErc20Approval()) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new ContractAddressReq(jAhwBna, ((AASubSignData) it.next()).getTo(), (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null));
            }
            AbstractC58185ywX<ResponseData<java.util.List<ContractAddressResp>>> abstractC58185ywXKWHzl = OFhtUX().KWHzl(dUDNAs().USBtdM(), dUDNAs().DbNXlk(), arrayList2);
            final Function1 function1 = new Function1() { // from class: o.bPK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C9100bPH.AhwBna(this.OLrzqt, (ResponseData) obj2);
                }
            };
            AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bPS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj2) {
                    return C9100bPH.gGvvIC(function1, obj2);
                }
            });
            Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
            return abstractC58185ywXAEQbTJ;
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXOcIXYQ = super.OcIXYQ();
        final Function1 function12 = new Function1() { // from class: o.bPQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C9100bPH.EZpvd(this.EZpvd, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ2 = abstractC58185ywXOcIXYQ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bPR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj2) {
                return C9100bPH.giSNqX(function12, obj2);
            }
        });
        Intrinsics.copydefault(abstractC58185ywXAEQbTJ2);
        return abstractC58185ywXAEQbTJ2;
    }

    public static final kotlin.Pair gGvvIC(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair giSNqX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair EZpvd(C9100bPH c9100bPH, kotlin.Pair pair) {
        AASubSignData aASubSignData;
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue() && c9100bPH.Y_() != null) {
            if (c9100bPH.aUsmxb() == OKWBaseTransaction.TransactionType.Approve) {
                ContractAddressResp contractAddressRespY_ = c9100bPH.Y_();
                Intrinsics.copydefault(contractAddressRespY_);
                if (Intrinsics.EZpvd(contractAddressRespY_.isNft(), java.lang.Boolean.TRUE) && (aASubSignData = (AASubSignData) CollectionsKt___CollectionsKt.firstOrNull(c9100bPH.QVsKAR().getDataList())) != null) {
                    aASubSignData.setErc20Approval(false);
                }
            }
            ContractAddressResp contractAddressRespY_2 = c9100bPH.Y_();
            Intrinsics.copydefault(contractAddressRespY_2);
            c9100bPH.djBIcL = C56402yEa.EZpvd(contractAddressRespY_2);
        }
        return pair;
    }

    /* JADX DEBUG: Method merged with bridge method: QVsKAR()Lcom/okinc/business/defi/api/model/tx/signdata/BaseSignData; */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    /* JADX INFO: renamed from: gasjUx, reason: merged with bridge method [inline-methods] */
    public AAContractSignData QVsKAR() {
        AAContractSignData aAContractSignData = (AAContractSignData) super.QVsKAR();
        if (!Intrinsics.EZpvd(this.OcIXYQ, aAContractSignData)) {
            this.RJOkX = (AAContractSignData) xVA.EZpvd(aAContractSignData);
            this.OcIXYQ = aAContractSignData;
        }
        AAContractSignData aAContractSignData2 = this.RJOkX;
        if (aAContractSignData2 != null) {
            return aAContractSignData2;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public boolean q_() {
        AAContractSignData aAContractSignDataQVsKAR = QVsKAR();
        for (AASubSignData aASubSignData : aAContractSignDataQVsKAR.getDataList()) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) aASubSignData.getValue())) {
                aASubSignData.setValue(C33491mxU.OLrzqt(aASubSignData.getValue()));
                if (aASubSignData.getValue().length() == 0) {
                    aASubSignData.setValue("0");
                }
            } else {
                aASubSignData.setValue("0");
            }
            if (aASubSignData.getData().length() == 0) {
                aASubSignData.setData(EIP1271Verifier.hexPrefix);
            }
        }
        java.util.List<ContractSignData.FromToken> fromToken = aAContractSignDataQVsKAR.getFromToken();
        if (fromToken == null || fromToken.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (AASubSignData aASubSignData2 : aAContractSignDataQVsKAR.getDataList()) {
                if (!aASubSignData2.getFromToken().isEmpty()) {
                    arrayList.addAll(aASubSignData2.getFromToken());
                }
            }
            aAContractSignDataQVsKAR.setFromToken(arrayList);
        }
        super.q_();
        return true;
    }

    @Override // o.AbstractC8919bLm, o.AbstractC8601bFm, o.AbstractC8564bFB
    public java.util.HashSet<java.lang.Long> j_() {
        C10854bwM c10854bwM;
        java.util.HashSet<java.lang.Long> hashSetJ_ = super.j_();
        java.util.Iterator<T> it = AuCTel().iterator();
        while (it.hasNext()) {
            java.lang.Long coinId = ((PaymasterToken) it.next()).getCoinId();
            if (coinId != null) {
                hashSetJ_.add(java.lang.Long.valueOf(coinId.longValue()));
            }
        }
        if (aUsmxb() == OKWBaseTransaction.TransactionType.Approve && (c10854bwM = (C10854bwM) InterfaceC9737bbI.Application.getTokenWithContractAddressAndChainId$default(C11627cVg.KWHzl, zLjUOn(), dHguZz().fetchVPNInfo(), false, 4, null)) != null) {
            hashSetJ_.add(java.lang.Long.valueOf(c10854bwM.AhwBna()));
        }
        return hashSetJ_;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    @Override // o.AbstractC8601bFm, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.ArrayList<java.lang.Integer> getNewProxyInstance() {
        java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
        int iQwvEab = QwvEab();
        if (iQwvEab == 2) {
            arrayList.add(9);
        } else if (iQwvEab != 3 && iQwvEab != 4) {
            if (iQwvEab != 5) {
                arrayList.add(2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o.bPH$TaskDescription */
    public static final class TaskDescription<T> implements InterfaceC58187ywZ {
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ java.lang.Object KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(java.lang.Object obj, java.lang.String str) {
            this.KWHzl = obj;
            this.EZpvd = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.ywW<com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EvmSignInfoGasPrice> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.InterfaceC58187ywZ
        public final void subscribe(InterfaceC58184ywW<EvmSignInfoGasPrice> interfaceC58184ywW) {
            java.lang.Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
            java.lang.String str = this.EZpvd;
            java.lang.Object obj = this.KWHzl;
            try {
                Result.Application application = Result.Companion;
                JsonObject asJsonObject = ((JsonObject) new Gson().fromJson(str, new TypeToken<JsonObject>() { // from class: o.bPH.TaskDescription.2
                }.getType())).getAsJsonObject();
                if (asJsonObject.has("gasPrice") && asJsonObject.get("gasPrice").isJsonObject()) {
                    asJsonObject = ((JsonObject) new Gson().fromJson(str, new TypeToken<JsonObject>() { // from class: o.bPH.TaskDescription.4
                    }.getType())).get("gasPrice").getAsJsonObject();
                }
                JsonObject jsonObject = (JsonObject) new Gson().fromJson(obj != null ? C33488mxR.EZpvd(obj) : null, new TypeToken<JsonObject>() { // from class: o.bPH.TaskDescription.1
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
                obj2 = this.KWHzl;
            }
            interfaceC58184ywW.onNext(obj2);
            interfaceC58184ywW.onComplete();
        }
    }

    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public java.util.ArrayList<java.lang.Integer> AuCTelauCTel() {
        java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
        if (djBIcL() > 0) {
            arrayList.add(3);
        }
        return arrayList;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<java.util.List<TxToastCheckRes>> OLrzqt(@NotNull TxToastCheckReq txToastCheckReq) {
        java.util.ArrayList arrayList;
        Intrinsics.checkNotNullParameter(txToastCheckReq, "");
        java.util.List<java.lang.Integer> checkTypes = txToastCheckReq.getCheckTypes();
        java.lang.String strKWHzl = (aUsmxb() == OKWBaseTransaction.TransactionType.Approve && QwvEab() == 2) ? KWHzl(0) : "";
        if (checkTypes.size() == 1 && checkTypes.contains(3)) {
            arrayList = new java.util.ArrayList();
            int i = 0;
            for (java.lang.Object obj : QVsKAR().getDataList()) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                if (((AASubSignData) obj).isErc20Approval()) {
                    txToastCheckReq.setTxType(java.lang.Integer.valueOf(copydefault(OKWBaseTransaction.TransactionType.Approve)));
                    txToastCheckReq.setTo(AEQbTJ(i));
                    txToastCheckReq.setAmount(C54862xYb.convertToBigIntegerString$default(OLrzqt(i), false, (RoundingMode) null, 3, (java.lang.Object) null));
                    txToastCheckReq.setInputData(EZpvd(i));
                    txToastCheckReq.setTokenAddress(AEQbTJ(i));
                    txToastCheckReq.setProjectAddress(strKWHzl);
                    arrayList.add(C43423rox.unwrapResponseData$default(OFhtUX().copydefault(txToastCheckReq), (Function1) null, 1, (java.lang.Object) null));
                }
                i++;
            }
        } else {
            java.util.List<AASubSignData> dataList = QVsKAR().getDataList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(dataList, 10));
            int i2 = 0;
            for (java.lang.Object obj2 : dataList) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                txToastCheckReq.setCheckTypes(checkTypes);
                txToastCheckReq.setTxType(java.lang.Integer.valueOf(copydefault(((AASubSignData) obj2).isErc20Approval() ? OKWBaseTransaction.TransactionType.Approve : OKWBaseTransaction.TransactionType.Contract)));
                txToastCheckReq.setTo(AEQbTJ(i2));
                txToastCheckReq.setAmount(C54862xYb.convertToBigIntegerString$default(OLrzqt(i2), false, (RoundingMode) null, 3, (java.lang.Object) null));
                txToastCheckReq.setInputData(EZpvd(i2));
                txToastCheckReq.setTokenAddress(AEQbTJ(i2));
                txToastCheckReq.setProjectAddress(strKWHzl);
                arrayList2.add(C43423rox.unwrapResponseData$default(OFhtUX().copydefault(txToastCheckReq), (Function1) null, 1, (java.lang.Object) null));
                i2++;
            }
            arrayList = arrayList2;
        }
        final Function1 function1 = new Function1() { // from class: o.bPE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return C9100bPH.copydefault((java.lang.Object[]) obj3);
            }
        };
        InterfaceC58229yxO interfaceC58229yxO = new InterfaceC58229yxO() { // from class: o.bPI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj3) {
                return C9100bPH.AxsJAYaxsJAY(function1, obj3);
            }
        };
        int iOLrzqt = AbstractC58185ywX.OLrzqt();
        AbstractC58185ywX[] abstractC58185ywXArr = (AbstractC58185ywX[]) arrayList.toArray(new AbstractC58185ywX[0]);
        AbstractC58185ywX<java.util.List<TxToastCheckRes>> abstractC58185ywXCopydefault = AbstractC58185ywX.copydefault(interfaceC58229yxO, false, iOLrzqt, (InterfaceC60096zvd[]) java.util.Arrays.copyOf(abstractC58185ywXArr, abstractC58185ywXArr.length));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    public static final java.util.List AxsJAYaxsJAY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List copydefault(java.lang.Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : objArr) {
            Intrinsics.copydefault(obj, "");
            arrayList.addAll((java.util.List) obj);
        }
        return arrayList;
    }

    @Override // o.InterfaceC9041bOB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AwvSrB() {
        C13934dbu c13934dbuOFhtUX = OFhtUX();
        java.lang.String strOxVOHk = OxVOHk();
        java.lang.String strDmq = Dmq();
        long jAhwBna = dHguZz().AhwBna();
        AbstractC58185ywX<ResponseData<SignInfo>> abstractC58185ywXCopydefault = c13934dbuOFhtUX.copydefault(strOxVOHk, strDmq, new SignInfoReq(java.lang.String.valueOf(jAhwBna), fERRXa().getAddress(), zLjUOn(), ai_(), AbstractC8601bFm.getInputData$default(this, false, 1, null), C54862xYb.convertToBigIntegerString$default(zuBGHE(), true, (RoundingMode) null, 2, (java.lang.Object) null), (java.lang.String) null, (java.lang.Integer) null, (java.lang.Long) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Boolean) null, 8128, (DefaultConstructorMarker) null));
        final Function1 function1 = new Function1() { // from class: o.bQa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9100bPH.AYXKKw(this.AEQbTJ, (ResponseData) obj);
            }
        };
        InterfaceC60096zvd interfaceC60096zvdAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bPY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9100bPH.gasjUx(function1, obj);
            }
        });
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDGOPHZ = DGOPHZ();
        final Function2 function2 = new Function2() { // from class: o.bPZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C9100bPH.valueOf((kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(interfaceC60096zvdAEQbTJ, abstractC58185ywXDGOPHZ, new InterfaceC58223yxI() { // from class: o.bQb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C9100bPH.gEmmrt(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final kotlin.Pair gasjUx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair gEmmrt(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    @Override // o.AbstractC8601bFm
    public java.lang.String zuBGHE() {
        BigDecimal bigDecimalCopydefault = C33129mqd.copydefault(null);
        java.util.Iterator<T> it = QVsKAR().getDataList().iterator();
        BigDecimal bigDecimalKWHzl = bigDecimalCopydefault;
        while (it.hasNext()) {
            bigDecimalKWHzl = C54862xYb.KWHzl(bigDecimalKWHzl, ((AASubSignData) it.next()).getValue());
        }
        return C54862xYb.convertToString$default(bigDecimalKWHzl, false, null, null, 7, null);
    }

    @Override // o.AbstractC8601bFm
    public java.lang.String AEQbTJ(boolean z) {
        java.lang.String data;
        AASubSignData aASubSignData = (AASubSignData) CollectionsKt___CollectionsKt.wlaJM(QVsKAR().getDataList());
        return (aASubSignData == null || (data = aASubSignData.getData()) == null) ? EIP1271Verifier.hexPrefix : data;
    }

    @Override // o.AbstractC8564bFB
    public java.lang.String zLjUOn() {
        java.lang.String to;
        AASubSignData aASubSignData = (AASubSignData) CollectionsKt___CollectionsKt.wlaJM(QVsKAR().getDataList());
        return (aASubSignData == null || (to = aASubSignData.getTo()) == null) ? "" : to;
    }

    public final java.lang.String AEQbTJ(int i) {
        java.lang.String to;
        AASubSignData aASubSignData = (AASubSignData) CollectionsKt___CollectionsKt.AkhnZx(QVsKAR().getDataList(), i);
        return (aASubSignData == null || (to = aASubSignData.getTo()) == null) ? "" : to;
    }

    public final java.lang.String OLrzqt(int i) {
        java.lang.String value;
        AASubSignData aASubSignData = (AASubSignData) CollectionsKt___CollectionsKt.AkhnZx(QVsKAR().getDataList(), i);
        return (aASubSignData == null || (value = aASubSignData.getValue()) == null) ? "0" : value;
    }

    public final java.lang.String EZpvd(int i) {
        java.lang.String data;
        AASubSignData aASubSignData = (AASubSignData) CollectionsKt___CollectionsKt.AkhnZx(QVsKAR().getDataList(), i);
        return (aASubSignData == null || (data = aASubSignData.getData()) == null) ? EIP1271Verifier.hexPrefix : data;
    }

    public static final Unit iZzfmt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Unit> */
    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public AbstractC58185ywX<Unit> p_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAwvSrB = AwvSrB();
        final Function1 function1 = new Function1() { // from class: o.bQe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9100bPH.KWHzl(this.EZpvd, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXAwvSrB.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bQd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9100bPH.iZzfmt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final Unit KWHzl(C9100bPH c9100bPH, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c9100bPH.fJNWhG().KWHzl(3);
        }
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd iRxXKY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> DbNXlk(@NotNull java.lang.String str) {
        AbstractC58185ywX abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        EvmSignInfoGasPrice gasPrice = hDKMBd().getGasPrice();
        if (gasPrice == null || str.length() == 0) {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(gasPrice);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new TaskDescription(gasPrice, str), BackpressureStrategy.BUFFER).copydefault(yBP.AEQbTJ()).KWHzl(C58266yxz.OLrzqt());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        }
        final Function1 function1 = new Function1() { // from class: o.bPU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9100bPH.copydefault(this.AEQbTJ, (EvmSignInfoGasPrice) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.bPV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9100bPH.iRxXKY(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd copydefault(C9100bPH c9100bPH, EvmSignInfoGasPrice evmSignInfoGasPrice) {
        Intrinsics.checkNotNullParameter(evmSignInfoGasPrice, "");
        c9100bPH.hDKMBd().setGasPrice(evmSignInfoGasPrice);
        return c9100bPH.DGOPHZ();
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> DGOPHZ() {
        AbstractC58185ywX<Unit> abstractC58185ywXIZzfmt = iZzfmt();
        final Function1 function1 = new Function1() { // from class: o.bQh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9100bPH.KWHzl((Unit) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXIZzfmt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bQg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9100bPH.flVtFt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair flVtFt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair KWHzl(Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
    }

    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public void x_() {
        C10854bwM c10854bwMKWHzl;
        for (Map.Entry<java.lang.Long, java.lang.String> entry : ac_().copydefault().entrySet()) {
            if (C33129mqd.gEmmrt(DCJXGO().KWHzl(entry.getKey(), htlTjW()), entry.getValue()) && (c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(entry.getKey())) != null) {
                DLWbHP().AEQbTJ(new C9808bca(false, c10854bwMKWHzl));
                return;
            }
        }
        DLWbHP().AEQbTJ(new C9808bca(true, dHguZz()));
    }

    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public void AhwBna() throws CoinMetaError {
        super.AhwBna();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new C9750bbV(UeEOUB()));
        arrayList.add(new C9751bbW(!giSNqX()));
        DLWbHP().OLrzqt(arrayList);
    }

    @Override // o.AbstractC8601bFm
    public boolean DTwDnp() {
        java.lang.String strZuBGHE;
        java.lang.Object feeAmount;
        C9165bQT c9165bQTKWHzl = fJNWhG().KWHzl();
        if (!c9165bQTKWHzl.AEQbTJ()) {
            long jAhwBna = fJNWhG().AYXKKw().AhwBna();
            java.lang.String strKWHzl = DCJXGO().KWHzl(java.lang.Long.valueOf(jAhwBna), htlTjW());
            if (jAhwBna == dHguZz().AhwBna()) {
                strZuBGHE = zuBGHE();
            } else {
                strZuBGHE = ac_().copydefault().get(java.lang.Long.valueOf(jAhwBna));
            }
            BigDecimal bigDecimalAEQbTJ = C54862xYb.AEQbTJ(strKWHzl, strZuBGHE);
            if (jAhwBna == dHguZz().AhwBna()) {
                feeAmount = C54862xYb.AEQbTJ(c9165bQTKWHzl.getFeeAmount(), AYXKKw().getDepositAmount());
                if (C33129mqd.gEmmrt(feeAmount, "0")) {
                    feeAmount = "0";
                }
            } else {
                feeAmount = c9165bQTKWHzl.getFeeAmount();
            }
            if (C33129mqd.gEmmrt(bigDecimalAEQbTJ, feeAmount)) {
                return false;
            }
        }
        return true;
    }

    public static final kotlin.Pair gkJEwt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> ffGIBT() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAubY = AubY();
        final Function1 function1 = new Function1() { // from class: o.bPJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9100bPH.AYXKKw(this.copydefault, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXAubY.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bPN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9100bPH.gkJEwt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair AYXKKw(C9100bPH c9100bPH, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c9100bPH.fJNWhG().KWHzl(1);
            c9100bPH.fJNWhG().AwvSrB();
        }
        return pair;
    }

    public final boolean djSkpj() {
        java.lang.Object obj;
        if (QVsKAR().getDataList().size() <= 1) {
            return false;
        }
        java.util.Iterator<T> it = QVsKAR().getDataList().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            AASubSignData aASubSignData = (AASubSignData) next;
            if (!C59449zhJ.startsWith$default(aASubSignData.getData(), "a22cb465", false, 2, null) && !C59449zhJ.startsWith$default(aASubSignData.getData(), "0xa22cb465", false, 2, null)) {
                obj = next;
                break;
            }
        }
        return obj == null;
    }

    public final java.util.List<ApprovalForAll> fZBcTu() {
        if (!djSkpj()) {
            return null;
        }
        java.util.List<AASubSignData> dataList = QVsKAR().getDataList();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(dataList, 10));
        for (AASubSignData aASubSignData : dataList) {
            arrayList.add(new ApprovalForAll(aASubSignData.getTo(), aASubSignData.getData()));
        }
        return arrayList;
    }

    @Override // o.InterfaceC9041bOB
    public Function1<PaymasterToken, Unit> ejfBZ() {
        if (aUsmxb() != OKWBaseTransaction.TransactionType.CancelApprove) {
            return null;
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(zLjUOn(), KWHzl(0));
        final java.lang.String str = (java.lang.String) pairOLrzqt.component1();
        final java.lang.String str2 = (java.lang.String) pairOLrzqt.component2();
        return new Function1() { // from class: o.bPP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9100bPH.OLrzqt(str, str2, (PaymasterToken) obj);
            }
        };
    }

    public static final Unit OLrzqt(java.lang.String str, java.lang.String str2, PaymasterToken paymasterToken) {
        Intrinsics.checkNotNullParameter(paymasterToken, "");
        if (paymasterToken.getCoinMeta().DCUTEIddSDPG() && C59449zhJ.gEmmrt(paymasterToken.getCoinMeta().OLrzqt(), str, true)) {
            java.util.ArrayList<Paymaster> payMaster = paymasterToken.getPayMaster();
            Intrinsics.copydefault(payMaster);
            java.util.Iterator<Paymaster> it = payMaster.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (it.hasNext()) {
                Paymaster next = it.next();
                if (C59449zhJ.gEmmrt(str2, next != null ? next.getRealPaymasterAddress() : null, true)) {
                    it.remove();
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC9730bbB
    public boolean w_() {
        return djBIcL() > 0;
    }

    @Override // o.InterfaceC9736bbH
    public int djBIcL() {
        java.util.List<AASubSignData> dataList = QVsKAR().getDataList();
        int i = 0;
        if (!(dataList instanceof java.util.Collection) || !dataList.isEmpty()) {
            java.util.Iterator<T> it = dataList.iterator();
            while (it.hasNext()) {
                if (((AASubSignData) it.next()).isErc20Approval() && (i = i + 1) < 0) {
                    yDY.djBIcL();
                }
            }
        }
        return i;
    }

    @Override // o.InterfaceC9736bbH
    public java.lang.String copydefault(int i, boolean z) {
        java.lang.String data;
        AAContractSignData aAContractSignDataQVsKAR = QVsKAR();
        if (aUsmxb() == OKWBaseTransaction.TransactionType.CancelApprove) {
            data = aAContractSignDataQVsKAR.getDataList().get(0).getData();
        } else {
            java.util.List<AASubSignData> dataList = aAContractSignDataQVsKAR.getDataList();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : dataList) {
                if (((AASubSignData) obj).isErc20Approval()) {
                    arrayList.add(obj);
                }
            }
            AASubSignData aASubSignData = (AASubSignData) CollectionsKt___CollectionsKt.AkhnZx(arrayList, i);
            if (aASubSignData == null || (data = aASubSignData.getData()) == null) {
                data = EIP1271Verifier.hexPrefix;
            }
        }
        java.lang.String strOLrzqt = "";
        if (data.length() > 64) {
            java.lang.String strSubstring = data.substring(data.length() - 64);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            strOLrzqt = C33491mxU.OLrzqt(strSubstring);
        }
        java.lang.String str = strOLrzqt;
        if (!z) {
            return str;
        }
        InterfaceC9730bbB.StateListAnimator stateListAnimatorCopydefault = copydefault(i);
        return C54862xYb.formatToString$default(C54862xYb.divB$default(str, java.lang.Double.valueOf(java.lang.Math.pow(10.0d, stateListAnimatorCopydefault != null ? C33129mqd.AEQbTJ(java.lang.Integer.valueOf(stateListAnimatorCopydefault.copydefault())) : 18.0d)), 0, null, 6, null), false, null, null, 7, null);
    }

    @Override // o.InterfaceC9736bbH
    public void copydefault(int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List<AASubSignData> dataList = QVsKAR().getDataList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : dataList) {
            if (((AASubSignData) obj).isErc20Approval()) {
                arrayList.add(obj);
            }
        }
        AASubSignData aASubSignData = (AASubSignData) CollectionsKt___CollectionsKt.AkhnZx(arrayList, i);
        if (aASubSignData == null) {
            return;
        }
        java.lang.String strCopydefault = C33491mxU.copydefault(str);
        if (C59449zhJ.startsWith$default(strCopydefault, EIP1271Verifier.hexPrefix, false, 2, null)) {
            strCopydefault = strCopydefault.substring(2);
            Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int iRJOkX = CollectionsKt___CollectionsKt.RJOkX(C56548yJl.AhwBna(0, 64 - strCopydefault.length()));
        for (int i2 = 0; i2 < iRJOkX; i2++) {
            sb.append("0");
        }
        sb.append(strCopydefault);
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String strSubstring = aASubSignData.getData().substring(0, aASubSignData.getData().length() - 64);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        aASubSignData.setData(strSubstring + string);
    }

    @Override // o.InterfaceC9736bbH
    public InterfaceC9730bbB.StateListAnimator copydefault(int i) {
        ContractAddressResp contractAddressResp;
        AASubSignData aASubSignData;
        AAContractSignData aAContractSignDataQVsKAR = QVsKAR();
        java.util.List<ContractAddressResp> list = this.djBIcL;
        if (list == null || (contractAddressResp = (ContractAddressResp) CollectionsKt___CollectionsKt.AkhnZx(list, i)) == null) {
            return null;
        }
        if (aUsmxb() == OKWBaseTransaction.TransactionType.CancelApprove) {
            aASubSignData = aAContractSignDataQVsKAR.getDataList().get(0);
        } else {
            java.util.List<AASubSignData> dataList = aAContractSignDataQVsKAR.getDataList();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : dataList) {
                if (((AASubSignData) obj).isErc20Approval()) {
                    arrayList.add(obj);
                }
            }
            aASubSignData = (AASubSignData) CollectionsKt___CollectionsKt.AkhnZx(arrayList, i);
            if (aASubSignData == null) {
                return null;
            }
        }
        C10854bwM c10854bwM = (C10854bwM) InterfaceC9737bbI.Application.getTokenWithContractAddressAndChainId$default(C11627cVg.KWHzl, AEQbTJ(i), dHguZz().fetchVPNInfo(), false, 4, null);
        java.lang.String to = aASubSignData.getTo();
        java.lang.String strKWHzl = DarRvM().KWHzl(c10854bwM != null ? java.lang.Long.valueOf(c10854bwM.AhwBna()) : null, htlTjW());
        WalletTickerManager.CoinPrice coinPriceCopydefault = DarRvM().copydefault(c10854bwM != null ? java.lang.Long.valueOf(c10854bwM.AhwBna()) : null);
        return new InterfaceC9730bbB.StateListAnimator(to, strKWHzl, coinPriceCopydefault != null ? coinPriceCopydefault.getRealPrice() : null, contractAddressResp.getSymbol(), contractAddressResp.getPrecision(), contractAddressResp.getPrecision(), contractAddressResp.getLogo(), C54862xYb.convertToString$default(C54862xYb.OLrzqt(aASubSignData.getMinErc20ApprovalAmount(), java.lang.Double.valueOf(java.lang.Math.pow(10.0d, C33129mqd.AEQbTJ(java.lang.Integer.valueOf(contractAddressResp.getPrecision()))))), false, null, null, 7, null), contractAddressResp.isNft());
    }

    @Override // o.InterfaceC9736bbH
    public java.lang.String KWHzl(int i) {
        java.lang.String data;
        AAContractSignData aAContractSignDataQVsKAR = QVsKAR();
        if (aUsmxb() == OKWBaseTransaction.TransactionType.CancelApprove) {
            data = aAContractSignDataQVsKAR.getDataList().get(0).getData();
        } else {
            java.util.List<AASubSignData> dataList = aAContractSignDataQVsKAR.getDataList();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : dataList) {
                if (((AASubSignData) obj).isErc20Approval()) {
                    arrayList.add(obj);
                }
            }
            AASubSignData aASubSignData = (AASubSignData) CollectionsKt___CollectionsKt.AkhnZx(arrayList, i);
            if (aASubSignData == null || (data = aASubSignData.getData()) == null) {
                data = EIP1271Verifier.hexPrefix;
            }
        }
        return C12801cto.EZpvd.KWHzl(data, java.lang.String.valueOf(dHguZz().fetchVPNInfo()));
    }

    public final java.util.List<ExecuteParams> dvKsVJ() {
        java.util.List<AASubSignData> dataList = QVsKAR().getDataList();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(dataList, 10));
        for (AASubSignData aASubSignData : dataList) {
            arrayList.add(new ExecuteParams(java.lang.Boolean.FALSE, aASubSignData.getTo(), aASubSignData.getValue(), aASubSignData.getData(), (java.util.List) null, 16, (DefaultConstructorMarker) null));
        }
        return arrayList;
    }

    @Override // o.InterfaceC9041bOB
    public int uzCIH() {
        return djBIcL();
    }

    @Override // o.InterfaceC9041bOB
    public int zsXlph() {
        return QVsKAR().getDataList().size();
    }

    public final TxToastCheckReq flVtFt() {
        java.util.List listEZpvd = C56402yEa.EZpvd(7);
        long jAhwBna = dHguZz().AhwBna();
        long jFetchVPNInfo = dHguZz().fetchVPNInfo();
        int toastCheckTxType$default = OKWBaseTransaction.getToastCheckTxType$default(this, null, 1, null);
        return new TxToastCheckReq(listEZpvd, java.lang.Long.valueOf(jAhwBna), java.lang.Integer.valueOf(toastCheckTxType$default), null, fERRXa().getAddress(), zLjUOn(), "0", C9225bRa.getGasPrice$default(fJNWhG(), 0, 1, null), AbstractC8601bFm.getInputData$default(this, false, 1, null), null, null, null, null, OJuSTm().getTxToastCheckBizLine(), OJuSTm().getTxToastCheckPayload(), null, jFetchVPNInfo, null, null, null, null, null, 4103168, null);
    }

    @Override // o.InterfaceC9041bOB
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> copydefault(@NotNull Function1<? super java.lang.String, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        return OLrzqt(OLrzqt(flVtFt(), dvKsVJ(), function1));
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        return AYXKKw(str, submitTxExpandBean);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> copydefault(SubmitTxExpandBean submitTxExpandBean) {
        return AEQbTJ(submitTxExpandBean);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> EZpvd(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        return copydefault(str, submitTxExpandBean);
    }

    /* JADX DEBUG: Type inference failed for r3v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    private final AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(AbstractC58185ywX<ResponseData<UserOperation>> abstractC58185ywX) {
        final Function1 function1 = new Function1() { // from class: o.bPX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9100bPH.AEQbTJ(this.EZpvd, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywX.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bQc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9100bPH.fvQaOB(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData fvQaOB(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData AEQbTJ(C9100bPH c9100bPH, ResponseData responseData) throws CoinMetaError {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001 || responseData.getCode() == 0) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            UserOperation userOperation = (UserOperation) data;
            java.lang.String uopHash = userOperation.getUopHash();
            C10854bwM c10854bwMAYXKKw = c9100bPH.fJNWhG().AYXKKw();
            java.lang.String strOLrzqt = c10854bwMAYXKKw.AuCTel() ? null : c10854bwMAYXKKw.OLrzqt();
            java.util.List<ApprovalForAll> listFZBcTu = c9100bPH.fZBcTu();
            C9165bQT c9165bQTKWHzl = c9100bPH.fJNWhG().KWHzl();
            java.lang.String signature = userOperation.getSignature();
            java.lang.String str = signature == null ? "" : signature;
            java.lang.String strFetchVPNInfo = c9100bPH.fetchVPNInfo();
            java.lang.String gasPrice$default = C9225bRa.getGasPrice$default(c9100bPH.fJNWhG(), 0, 1, null);
            java.lang.String strIwGUEr = c9100bPH.fJNWhG().iwGUEr();
            BroadcastBean broadcastBeanGenerateBroadcastModel$default = AbstractC8601bFm.generateBroadcastModel$default(c9100bPH, str, uopHash, null, new AAExtJson(strFetchVPNInfo, gasPrice$default, strIwGUEr == null ? "" : strIwGUEr, c9100bPH.dHguZz().valueOf(), 0, c9100bPH.fJNWhG().fetchVPNInfo()), 4, null);
            broadcastBeanGenerateBroadcastModel$default.setUop(userOperation);
            broadcastBeanGenerateBroadcastModel$default.setAaFeeToken(strOLrzqt);
            broadcastBeanGenerateBroadcastModel$default.setApprovalForAllList(listFZBcTu);
            Unit unit = Unit.INSTANCE;
            return new ResponseData(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(broadcastBeanGenerateBroadcastModel$default), (java.util.List) null, (java.lang.Boolean) null, c9165bQTKWHzl.getCost(), (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 246, (DefaultConstructorMarker) null), null, 46, null);
        }
        return new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, null, responseData.getError_code(), 28, null);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<C9748bbT>> AEQbTJ(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        return KWHzl(super.AEQbTJ(str, submitTxExpandBean));
    }

    public static final InterfaceC60096zvd DAIeex(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r3v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<o.bbT>> */
    public final AbstractC58185ywX<ResponseData<C9748bbT>> KWHzl(AbstractC58185ywX<ResponseData<C9748bbT>> abstractC58185ywX) {
        final Function1 function1 = new Function1() { // from class: o.bPT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9100bPH.djBIcL(this.AEQbTJ, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywX.KWHzl(new InterfaceC58229yxO() { // from class: o.bPW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9100bPH.DAIeex(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd djBIcL(C9100bPH c9100bPH, final ResponseData responseData) {
        java.util.ArrayList arrayList;
        java.lang.String realPaymasterAddress;
        java.lang.String approvalAmount;
        java.lang.String strCopydefault;
        java.lang.String strKWHzl;
        java.lang.String strGEmmrt;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            java.lang.String address = c9100bPH.fERRXa().getAddress();
            C9748bbT c9748bbT = (C9748bbT) responseData.getData();
            java.lang.String str2 = (c9748bbT == null || (strGEmmrt = c9748bbT.gEmmrt()) == null) ? "" : strGEmmrt;
            C9748bbT c9748bbT2 = (C9748bbT) responseData.getData();
            java.lang.String str3 = (c9748bbT2 == null || (strKWHzl = c9748bbT2.KWHzl()) == null) ? "" : strKWHzl;
            long jFetchVPNInfo = c9100bPH.dHguZz().fetchVPNInfo();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (c9100bPH.aUsmxb() == OKWBaseTransaction.TransactionType.CancelApprove) {
                java.lang.String strZLjUOn = c9100bPH.zLjUOn();
                java.lang.String strKWHzl2 = c9100bPH.KWHzl(0);
                AAContractSignData aAContractSignDataQVsKAR = c9100bPH.QVsKAR();
                AACancelApprovalSignData aACancelApprovalSignData = aAContractSignDataQVsKAR instanceof AACancelApprovalSignData ? (AACancelApprovalSignData) aAContractSignDataQVsKAR : null;
                arrayList2.add(new ApproveAAItemParam(address, strZLjUOn, strKWHzl2, java.lang.Long.valueOf(jFetchVPNInfo), str2, "0000000000000000000000000000000000000000000000000000000000000000", (aACancelApprovalSignData == null || (approvalAmount = aACancelApprovalSignData.getApprovalAmount()) == null || (strCopydefault = C33491mxU.copydefault(approvalAmount)) == null) ? null : StringsKt__StringsKt.KWHzl(strCopydefault, (java.lang.CharSequence) EIP1271Verifier.hexPrefix), str3));
            }
            if (c9100bPH.giSNqX()) {
                C9170bQY c9170bQYHDKMBd = c9100bPH.fJNWhG().hDKMBd();
                Paymaster paymasterValueOf = c9170bQYHDKMBd.valueOf();
                java.lang.String str4 = (paymasterValueOf == null || (realPaymasterAddress = paymasterValueOf.getRealPaymasterAddress()) == null) ? "" : realPaymasterAddress;
                java.lang.String strDjBIcL = c9170bQYHDKMBd.djBIcL();
                arrayList = arrayList2;
                arrayList.add(new ApproveAAItemParam(address, strDjBIcL == null ? "" : strDjBIcL, str4, java.lang.Long.valueOf(jFetchVPNInfo), str2, "ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff", (java.lang.String) null, str3, 64, (DefaultConstructorMarker) null));
            } else {
                arrayList = arrayList2;
            }
            java.util.List<AASubSignData> dataList = c9100bPH.QVsKAR().getDataList();
            java.util.ArrayList<AASubSignData> arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj : dataList) {
                if (((AASubSignData) obj).isErc20Approval()) {
                    arrayList3.add(obj);
                }
            }
            for (AASubSignData aASubSignData : arrayList3) {
                java.lang.String to = aASubSignData.getTo();
                java.lang.String strKWHzl3 = C12801cto.EZpvd.KWHzl(aASubSignData.getData(), java.lang.String.valueOf(jFetchVPNInfo));
                java.lang.String strSubstring = aASubSignData.getData().substring(aASubSignData.getData().length() - 64);
                Intrinsics.checkNotNullExpressionValue(strSubstring, str);
                arrayList.add(new ApproveAAItemParam(address, to, strKWHzl3, java.lang.Long.valueOf(jFetchVPNInfo), str2, strSubstring, (java.lang.String) null, str3, 64, (DefaultConstructorMarker) null));
                str = str;
            }
            if (!arrayList.isEmpty()) {
                AbstractC58185ywX<ResponseData<Unit>> abstractC58185ywXOLrzqt = c9100bPH.OFhtUX().OLrzqt(c9100bPH.dUDNAs().USBtdM(), c9100bPH.dUDNAs().DbNXlk(), new ApproveAASubRequest(arrayList));
                final Function1 function1 = new Function1() { // from class: o.bPO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return C9100bPH.AEQbTJ(responseData, (ResponseData) obj2);
                    }
                };
                return abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bQf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj2) {
                        return C9100bPH.hUfVAv(function1, obj2);
                    }
                });
            }
            return AbstractC58185ywX.KWHzl(responseData);
        }
        return AbstractC58185ywX.KWHzl(responseData);
    }

    public static final ResponseData hUfVAv(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    @Override // o.AbstractC8564bFB
    public void EZpvd(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "");
        super.EZpvd(jsonObject);
        InterfaceC9041bOB.Application.EZpvd(this, jsonObject);
    }

    public static final kotlin.Pair AhwBna(C9100bPH c9100bPH, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            c9100bPH.djBIcL = (java.util.List) responseData.getData();
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }

    public static final kotlin.Pair AYXKKw(C9100bPH c9100bPH, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            if (((SignInfo) data).getInfo() != null) {
                SignInfo signInfo = (SignInfo) responseData.getData();
                c9100bPH.copydefault(signInfo != null ? signInfo.getSupportPush() : false);
                C33489mxS c33489mxS = C33489mxS.KWHzl;
                KSerializer<AAEvmSignInfo> kSerializerSerializer = AAEvmSignInfo.Companion.serializer();
                java.lang.Object data2 = responseData.getData();
                Intrinsics.copydefault(data2);
                kotlinx.serialization.json.JsonObject info = ((SignInfo) data2).getInfo();
                Intrinsics.copydefault(info);
                c9100bPH.copydefault((AAEvmSignInfo) c33489mxS.OLrzqt((DeserializationStrategy) kSerializerSerializer, info.toString()));
                java.lang.Object data3 = responseData.getData();
                Intrinsics.copydefault(data3);
                kotlinx.serialization.json.JsonObject info2 = ((SignInfo) data3).getInfo();
                Intrinsics.copydefault(info2);
                if (info2.containsKey((java.lang.Object) "reserveFeeRatio")) {
                    C8518bEI c8518bEIAc_ = c9100bPH.ac_();
                    java.lang.Object data4 = responseData.getData();
                    Intrinsics.copydefault(data4);
                    kotlinx.serialization.json.JsonObject info3 = ((SignInfo) data4).getInfo();
                    Intrinsics.copydefault(info3);
                    java.lang.Object obj = info3.get((java.lang.Object) "reserveFeeRatio");
                    JsonPrimitive jsonPrimitive = obj instanceof JsonPrimitive ? (JsonPrimitive) obj : null;
                    c8518bEIAc_.OLrzqt(jsonPrimitive != null ? jsonPrimitive.getContent() : null);
                }
                return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
            }
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }
}
