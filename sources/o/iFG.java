package o;

import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.defi.api.bean.FromToken;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.invest_biz.data.bean.InvestCallDataReq;
import com.okinc.business.invest_biz.data.bean.InvestCallDataResult;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.business.invest_biz.data.logic.InvestTradeManager;
import com.okinc.business.invest_biz.data.usecase.GetCallDataUseCaseImpl$getAACallData$1;
import com.okinc.business.invest_biz.data.usecase.GetCallDataUseCaseImpl$getAACallData$2;
import com.okinc.business.invest_biz.data.usecase.GetCallDataUseCaseImpl$getCallData$1;
import com.okinc.business.invest_biz.data.usecase.GetCallDataUseCaseImpl$getCallData$2;
import com.okinc.business.invest_biz.data.usecase.GetCallDataUseCaseImpl$invoke$1;
import com.okinc.business.invest_biz.di.TransactionBiz;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iFG implements iFJ {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final InterfaceC23916iOb AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final iNW KWHzl;
    public final Json copydefault;

    @yCM
    public iFG(@NotNull InterfaceC23916iOb interfaceC23916iOb, @NotNull iNW inw, @NotNull Json json, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23916iOb, "");
        Intrinsics.checkNotNullParameter(inw, "");
        Intrinsics.checkNotNullParameter(json, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = interfaceC23916iOb;
        this.KWHzl = inw;
        this.copydefault = json;
        this.EZpvd = coroutineDispatcher;
    }

    public final boolean OLrzqt() {
        InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) CollectionsKt___CollectionsKt.firstOrNull(this.AEQbTJ.gEmmrt().copydefault());
        return interfaceC9738bbJ != null && interfaceC9738bbJ.getFieldNames();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iFJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull InvestTxModel investTxModel, @NotNull Continuation<? super Result<InvestCallDataResult>> continuation) throws java.lang.Throwable {
        GetCallDataUseCaseImpl$invoke$1 getCallDataUseCaseImpl$invoke$1;
        TransactionBiz transactionBiz;
        if (continuation instanceof GetCallDataUseCaseImpl$invoke$1) {
            getCallDataUseCaseImpl$invoke$1 = (GetCallDataUseCaseImpl$invoke$1) continuation;
            int i = getCallDataUseCaseImpl$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getCallDataUseCaseImpl$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getCallDataUseCaseImpl$invoke$1 = new GetCallDataUseCaseImpl$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = getCallDataUseCaseImpl$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getCallDataUseCaseImpl$invoke$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(obj);
                return ((Result) obj).m7386unboximpl();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        iNW inw = this.KWHzl;
        if (investTxModel.isBoostTrade()) {
            transactionBiz = TransactionBiz.BOOST;
        } else {
            transactionBiz = TransactionBiz.DEFI;
        }
        iDH idhAEQbTJ = inw.AEQbTJ(transactionBiz);
        if (OLrzqt()) {
            InvestCallDataReq investCallDataReqOLrzqt = InvestTradeManager.OLrzqt.OLrzqt(investTxModel);
            getCallDataUseCaseImpl$invoke$1.label = 1;
            java.lang.Object objOLrzqt = OLrzqt(idhAEQbTJ, investTxModel, investCallDataReqOLrzqt, getCallDataUseCaseImpl$invoke$1);
            return objOLrzqt == objCopydefault ? objCopydefault : objOLrzqt;
        }
        InvestCallDataReq investCallDataReqOLrzqt2 = InvestTradeManager.OLrzqt.OLrzqt(investTxModel);
        getCallDataUseCaseImpl$invoke$1.label = 2;
        java.lang.Object objKWHzl = KWHzl(idhAEQbTJ, investTxModel, investCallDataReqOLrzqt2, getCallDataUseCaseImpl$invoke$1);
        return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(iDH idh, InvestTxModel investTxModel, InvestCallDataReq investCallDataReq, Continuation<? super Result<InvestCallDataResult>> continuation) throws java.lang.Throwable {
        GetCallDataUseCaseImpl$getCallData$1 getCallDataUseCaseImpl$getCallData$1;
        if (continuation instanceof GetCallDataUseCaseImpl$getCallData$1) {
            getCallDataUseCaseImpl$getCallData$1 = (GetCallDataUseCaseImpl$getCallData$1) continuation;
            int i = getCallDataUseCaseImpl$getCallData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getCallDataUseCaseImpl$getCallData$1.label = i - Integer.MIN_VALUE;
            } else {
                getCallDataUseCaseImpl$getCallData$1 = new GetCallDataUseCaseImpl$getCallData$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getCallDataUseCaseImpl$getCallData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getCallDataUseCaseImpl$getCallData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            GetCallDataUseCaseImpl$getCallData$2 getCallDataUseCaseImpl$getCallData$2 = new GetCallDataUseCaseImpl$getCallData$2(investTxModel, investCallDataReq, idh, this, null);
            getCallDataUseCaseImpl$getCallData$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getCallDataUseCaseImpl$getCallData$2, getCallDataUseCaseImpl$getCallData$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(iDH idh, InvestTxModel investTxModel, InvestCallDataReq investCallDataReq, Continuation<? super Result<InvestCallDataResult>> continuation) throws java.lang.Throwable {
        GetCallDataUseCaseImpl$getAACallData$1 getCallDataUseCaseImpl$getAACallData$1;
        if (continuation instanceof GetCallDataUseCaseImpl$getAACallData$1) {
            getCallDataUseCaseImpl$getAACallData$1 = (GetCallDataUseCaseImpl$getAACallData$1) continuation;
            int i = getCallDataUseCaseImpl$getAACallData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getCallDataUseCaseImpl$getAACallData$1.label = i - Integer.MIN_VALUE;
            } else {
                getCallDataUseCaseImpl$getAACallData$1 = new GetCallDataUseCaseImpl$getAACallData$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getCallDataUseCaseImpl$getAACallData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getCallDataUseCaseImpl$getAACallData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            GetCallDataUseCaseImpl$getAACallData$2 getCallDataUseCaseImpl$getAACallData$2 = new GetCallDataUseCaseImpl$getAACallData$2(idh, investCallDataReq, investTxModel, this, null);
            getCallDataUseCaseImpl$getAACallData$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getCallDataUseCaseImpl$getAACallData$2, getCallDataUseCaseImpl$getAACallData$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    public final InvestCallDataResult copydefault(java.lang.String str, JsonObject jsonObject, InvestTxModel investTxModel) {
        JsonPrimitive jsonPrimitive;
        JsonPrimitive jsonPrimitive2;
        JsonPrimitive jsonPrimitive3;
        JsonPrimitive jsonPrimitive4;
        JsonPrimitive jsonPrimitive5;
        JsonElement jsonElement = (JsonElement) jsonObject.get("data");
        java.lang.String content = null;
        java.lang.String strGEmmrt = C33129mqd.gEmmrt((jsonElement == null || (jsonPrimitive5 = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : jsonPrimitive5.getContent());
        JsonElement jsonElement2 = (JsonElement) jsonObject.get("from");
        java.lang.String strGEmmrt2 = C33129mqd.gEmmrt((jsonElement2 == null || (jsonPrimitive4 = JsonElementKt.getJsonPrimitive(jsonElement2)) == null) ? null : jsonPrimitive4.getContent());
        JsonElement jsonElement3 = (JsonElement) jsonObject.get("to");
        java.lang.String strGEmmrt3 = C33129mqd.gEmmrt((jsonElement3 == null || (jsonPrimitive3 = JsonElementKt.getJsonPrimitive(jsonElement3)) == null) ? null : jsonPrimitive3.getContent());
        JsonElement jsonElement4 = (JsonElement) jsonObject.get("checkSum");
        java.lang.String strGEmmrt4 = C33129mqd.gEmmrt((jsonElement4 == null || (jsonPrimitive2 = JsonElementKt.getJsonPrimitive(jsonElement4)) == null) ? null : jsonPrimitive2.getContent());
        JsonElement jsonElement5 = (JsonElement) jsonObject.get("orderId");
        if (jsonElement5 != null && (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement5)) != null) {
            content = jsonPrimitive.getContent();
        }
        return new InvestCallDataResult(strGEmmrt, str, (java.lang.String) null, strGEmmrt2, strGEmmrt3, strGEmmrt4, C33129mqd.gEmmrt(content), investTxModel.getSlipPoint(), investTxModel.getPubkey(), (java.lang.String) null, (java.lang.String) null, investTxModel.getPriorityFee(), 1540, (DefaultConstructorMarker) null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iFG.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final DappInteractionArgs AEQbTJ(@NotNull java.lang.String str, @NotNull InvestTxModel investTxModel) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(investTxModel, "");
            DappInteractionArgs dappInteractionArgs = new DappInteractionArgs(investTxModel.getWalletId(), null, C33129mqd.AYXKKw(java.lang.Long.valueOf(investTxModel.getChainId())), new PlatformItem(0L, investTxModel.getPlatform(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, 0L, investTxModel.getDrawableRes(), (java.lang.String) null, (java.lang.String) null, 14333, (DefaultConstructorMarker) null), str, investTxModel.getCoinId(), "invest", 7, null, null, null, null, false, false, null, true, null, null, null, null, null, null, null, null, null, null, 3, null, null, null, null, java.lang.Boolean.valueOf(investTxModel.isOpenMEV()), 2080341762, null);
            java.util.List<FromToken> fromToken = investTxModel.getFromToken();
            if (fromToken == null) {
                return dappInteractionArgs;
            }
            dappInteractionArgs.setSignDataJson(DappInteractionArgs.Companion.OLrzqt(dappInteractionArgs.getSignDataJson(), fromToken));
            return dappInteractionArgs;
        }

        public final DappSignArgs copydefault(@NotNull java.lang.String str, @NotNull InvestTxModel investTxModel) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(investTxModel, "");
            java.lang.String walletId = investTxModel.getWalletId();
            java.lang.String strAYXKKw = C33129mqd.AYXKKw(java.lang.Long.valueOf(investTxModel.getChainId()));
            java.lang.String platformName = investTxModel.getPlatformName();
            if (platformName.length() == 0) {
                platformName = investTxModel.getPlatform();
            }
            return new DappSignArgs(walletId, strAYXKKw, new PlatformItem(0L, platformName, investTxModel.getPlatformLogo(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, 0L, 0, (java.lang.String) null, (java.lang.String) null, 16377, (DefaultConstructorMarker) null), str, false, 7, "invest", null, true, false, "btc_psbt", null, null, null, null, false, null, 129152, null);
        }
    }
}
