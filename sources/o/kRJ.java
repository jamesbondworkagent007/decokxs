package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.dex.tee.domain.model.SignAndBroadcastRes;
import com.okinc.business.dex.tee.domain.model.TeeMarketPlaceOrderParams;
import com.okinc.business.dex.trade.core.domain.model.ApproveUnsignedData;
import com.okinc.business.dex.trade.core.domain.model.CommonDexInfo;
import com.okinc.business.dex.trade.core.domain.model.DefiPlatformInfo;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dex.trade.core.domain.model.V6CalldataResponseData;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.OrderDetailBean;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedSubmitTeeMarketOrderUseCase$submitOrder$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedSubmitTeeMarketOrderUseCase$submitOrderInternal$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedSubmitTeeMarketOrderUseCase$submitOrderWithBatchSign$1;
import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import com.okinc.business.trade.features.home.ui.cefi.common.TxDirection;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.wallet.api.WalletDexService;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC9740bbL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kRJ {
    public final C30788lhk EZpvd;
    public final kRK KWHzl;
    public final C19750gNy OLrzqt;
    public final C28195kSk copydefault;

    @yCM
    public kRJ(@NotNull kRK krk, @NotNull C19750gNy c19750gNy, @NotNull C30788lhk c30788lhk, @NotNull C28195kSk c28195kSk) {
        Intrinsics.checkNotNullParameter(krk, "");
        Intrinsics.checkNotNullParameter(c19750gNy, "");
        Intrinsics.checkNotNullParameter(c30788lhk, "");
        Intrinsics.checkNotNullParameter(c28195kSk, "");
        this.KWHzl = krk;
        this.OLrzqt = c19750gNy;
        this.EZpvd = c30788lhk;
        this.copydefault = c28195kSk;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse, @NotNull C30808liD c30808liD, java.util.List<? extends AdvancedAutoSellStrategy> list, java.util.List<java.lang.String> list2, @NotNull SlippageMode slippageMode, @NotNull java.lang.String str, @NotNull TxDirection txDirection, @NotNull FragmentActivity fragmentActivity, boolean z, @NotNull InterfaceC9740bbL.TaskDescription taskDescription, @NotNull Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        AdvancedSubmitTeeMarketOrderUseCase$submitOrder$1 advancedSubmitTeeMarketOrderUseCase$submitOrder$1;
        java.util.List<? extends AdvancedAutoSellStrategy> list3;
        java.util.List<java.lang.String> list4;
        SlippageMode slippageMode2;
        java.lang.String str2;
        TxDirection txDirection2;
        boolean z2;
        java.lang.Object objKWHzl;
        FragmentActivity fragmentActivity2;
        InterfaceC9740bbL.TaskDescription taskDescription2;
        V6BaseQuoteResponse v6BaseQuoteResponse2;
        C30808liD c30808liD2;
        kRJ krj;
        WalletDexService.SupportedMevNodeBean supportedMevNodeBean;
        if (continuation instanceof AdvancedSubmitTeeMarketOrderUseCase$submitOrder$1) {
            advancedSubmitTeeMarketOrderUseCase$submitOrder$1 = (AdvancedSubmitTeeMarketOrderUseCase$submitOrder$1) continuation;
            int i = advancedSubmitTeeMarketOrderUseCase$submitOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedSubmitTeeMarketOrderUseCase$submitOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedSubmitTeeMarketOrderUseCase$submitOrder$1 = new AdvancedSubmitTeeMarketOrderUseCase$submitOrder$1(this, continuation);
            }
        }
        AdvancedSubmitTeeMarketOrderUseCase$submitOrder$1 advancedSubmitTeeMarketOrderUseCase$submitOrder$12 = advancedSubmitTeeMarketOrderUseCase$submitOrder$1;
        java.lang.Object obj = advancedSubmitTeeMarketOrderUseCase$submitOrder$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedSubmitTeeMarketOrderUseCase$submitOrder$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (v6BaseQuoteResponse.getCommonDexInfo() == null) {
                Result.Application application = Result.Companion;
                return Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.NullPointerException("CommonDexInfo cannot be null for TEE market order")));
            }
            DefiPlatformInfo selectedDeFiPlatform = v6BaseQuoteResponse.getSelectedDeFiPlatform();
            V6CalldataResponseData transactionData = selectedDeFiPlatform != null ? selectedDeFiPlatform.getTransactionData() : null;
            ApproveUnsignedData approveTxInfo = transactionData != null ? transactionData.getApproveTxInfo() : null;
            if (approveTxInfo != null) {
                advancedSubmitTeeMarketOrderUseCase$submitOrder$12.label = 1;
                java.lang.Object objEZpvd = EZpvd(v6BaseQuoteResponse, transactionData, approveTxInfo, c30808liD, fragmentActivity, z, advancedSubmitTeeMarketOrderUseCase$submitOrder$12);
                return objEZpvd == objCopydefault ? objCopydefault : objEZpvd;
            }
            kRK krk = this.KWHzl;
            boolean zFetchVPNInfo = c30808liD.fetchVPNInfo();
            advancedSubmitTeeMarketOrderUseCase$submitOrder$12.L$0 = this;
            advancedSubmitTeeMarketOrderUseCase$submitOrder$12.L$1 = v6BaseQuoteResponse;
            advancedSubmitTeeMarketOrderUseCase$submitOrder$12.L$2 = c30808liD;
            list3 = list;
            advancedSubmitTeeMarketOrderUseCase$submitOrder$12.L$3 = list3;
            list4 = list2;
            advancedSubmitTeeMarketOrderUseCase$submitOrder$12.L$4 = list4;
            slippageMode2 = slippageMode;
            advancedSubmitTeeMarketOrderUseCase$submitOrder$12.L$5 = slippageMode2;
            str2 = str;
            advancedSubmitTeeMarketOrderUseCase$submitOrder$12.L$6 = str2;
            txDirection2 = txDirection;
            advancedSubmitTeeMarketOrderUseCase$submitOrder$12.L$7 = txDirection2;
            advancedSubmitTeeMarketOrderUseCase$submitOrder$12.L$8 = fragmentActivity;
            advancedSubmitTeeMarketOrderUseCase$submitOrder$12.L$9 = taskDescription;
            z2 = z;
            advancedSubmitTeeMarketOrderUseCase$submitOrder$12.Z$0 = z2;
            advancedSubmitTeeMarketOrderUseCase$submitOrder$12.label = 2;
            objKWHzl = krk.KWHzl(v6BaseQuoteResponse, zFetchVPNInfo, advancedSubmitTeeMarketOrderUseCase$submitOrder$12);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            fragmentActivity2 = fragmentActivity;
            taskDescription2 = taskDescription;
            v6BaseQuoteResponse2 = v6BaseQuoteResponse;
            c30808liD2 = c30808liD;
            krj = this;
        } else {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(obj);
                return ((Result) obj).m7386unboximpl();
            }
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return ((Result) obj).m7386unboximpl();
            }
            boolean z3 = advancedSubmitTeeMarketOrderUseCase$submitOrder$12.Z$0;
            taskDescription2 = (InterfaceC9740bbL.TaskDescription) advancedSubmitTeeMarketOrderUseCase$submitOrder$12.L$9;
            fragmentActivity2 = (FragmentActivity) advancedSubmitTeeMarketOrderUseCase$submitOrder$12.L$8;
            TxDirection txDirection3 = (TxDirection) advancedSubmitTeeMarketOrderUseCase$submitOrder$12.L$7;
            java.lang.String str3 = (java.lang.String) advancedSubmitTeeMarketOrderUseCase$submitOrder$12.L$6;
            slippageMode2 = (SlippageMode) advancedSubmitTeeMarketOrderUseCase$submitOrder$12.L$5;
            java.util.List<java.lang.String> list5 = (java.util.List) advancedSubmitTeeMarketOrderUseCase$submitOrder$12.L$4;
            java.util.List<? extends AdvancedAutoSellStrategy> list6 = (java.util.List) advancedSubmitTeeMarketOrderUseCase$submitOrder$12.L$3;
            c30808liD2 = (C30808liD) advancedSubmitTeeMarketOrderUseCase$submitOrder$12.L$2;
            v6BaseQuoteResponse2 = (V6BaseQuoteResponse) advancedSubmitTeeMarketOrderUseCase$submitOrder$12.L$1;
            krj = (kRJ) advancedSubmitTeeMarketOrderUseCase$submitOrder$12.L$0;
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
            z2 = z3;
            txDirection2 = txDirection3;
            list3 = list6;
            str2 = str3;
            list4 = list5;
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
        if (thM7380exceptionOrNullimpl != null) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl));
        }
        java.util.List list7 = (java.util.List) objKWHzl;
        C30788lhk c30788lhk = krj.EZpvd;
        java.lang.String name = (list7 == null || (supportedMevNodeBean = (WalletDexService.SupportedMevNodeBean) CollectionsKt___CollectionsKt.firstOrNull(list7)) == null) ? null : supportedMevNodeBean.getName();
        if (name == null) {
            name = "";
        }
        java.lang.Object objCopydefault2 = c30788lhk.copydefault(v6BaseQuoteResponse2, c30808liD2, list3, list4, slippageMode2, str2, txDirection2, name);
        java.lang.Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objCopydefault2);
        if (thM7380exceptionOrNullimpl2 != null) {
            Result.Application application3 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl2));
        }
        advancedSubmitTeeMarketOrderUseCase$submitOrder$12.L$0 = null;
        advancedSubmitTeeMarketOrderUseCase$submitOrder$12.L$1 = null;
        advancedSubmitTeeMarketOrderUseCase$submitOrder$12.L$2 = null;
        advancedSubmitTeeMarketOrderUseCase$submitOrder$12.L$3 = null;
        advancedSubmitTeeMarketOrderUseCase$submitOrder$12.L$4 = null;
        advancedSubmitTeeMarketOrderUseCase$submitOrder$12.L$5 = null;
        advancedSubmitTeeMarketOrderUseCase$submitOrder$12.L$6 = null;
        advancedSubmitTeeMarketOrderUseCase$submitOrder$12.L$7 = null;
        advancedSubmitTeeMarketOrderUseCase$submitOrder$12.L$8 = null;
        advancedSubmitTeeMarketOrderUseCase$submitOrder$12.L$9 = null;
        advancedSubmitTeeMarketOrderUseCase$submitOrder$12.label = 3;
        java.lang.Object objOLrzqt = krj.OLrzqt((TeeMarketPlaceOrderParams) objCopydefault2, fragmentActivity2, taskDescription2, z2, advancedSubmitTeeMarketOrderUseCase$submitOrder$12);
        return objOLrzqt == objCopydefault ? objCopydefault : objOLrzqt;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(V6BaseQuoteResponse v6BaseQuoteResponse, V6CalldataResponseData v6CalldataResponseData, ApproveUnsignedData approveUnsignedData, C30808liD c30808liD, FragmentActivity fragmentActivity, boolean z, Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        AdvancedSubmitTeeMarketOrderUseCase$submitOrderWithBatchSign$1 advancedSubmitTeeMarketOrderUseCase$submitOrderWithBatchSign$1;
        DexMultiTokenInfoBean fromToken;
        DexMultiTokenInfoBean fromToken2;
        if (continuation instanceof AdvancedSubmitTeeMarketOrderUseCase$submitOrderWithBatchSign$1) {
            advancedSubmitTeeMarketOrderUseCase$submitOrderWithBatchSign$1 = (AdvancedSubmitTeeMarketOrderUseCase$submitOrderWithBatchSign$1) continuation;
            int i = advancedSubmitTeeMarketOrderUseCase$submitOrderWithBatchSign$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedSubmitTeeMarketOrderUseCase$submitOrderWithBatchSign$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedSubmitTeeMarketOrderUseCase$submitOrderWithBatchSign$1 = new AdvancedSubmitTeeMarketOrderUseCase$submitOrderWithBatchSign$1(this, continuation);
            }
        }
        java.lang.Object obj = advancedSubmitTeeMarketOrderUseCase$submitOrderWithBatchSign$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedSubmitTeeMarketOrderUseCase$submitOrderWithBatchSign$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CommonDexInfo commonDexInfo = v6BaseQuoteResponse.getCommonDexInfo();
        java.lang.String chainId = (commonDexInfo == null || (fromToken2 = commonDexInfo.getFromToken()) == null) ? null : fromToken2.getChainId();
        if (chainId == null) {
            chainId = "";
        }
        java.lang.String str = chainId;
        C28195kSk c28195kSk = this.copydefault;
        boolean zFetchVPNInfo = c30808liD.fetchVPNInfo();
        CommonDexInfo commonDexInfo2 = v6BaseQuoteResponse.getCommonDexInfo();
        java.lang.String tokenContractAddress = (commonDexInfo2 == null || (fromToken = commonDexInfo2.getFromToken()) == null) ? null : fromToken.getTokenContractAddress();
        CommonDexInfo commonDexInfo3 = v6BaseQuoteResponse.getCommonDexInfo();
        C28194kSj c28194kSj = new C28194kSj(str, v6CalldataResponseData, approveUnsignedData, zFetchVPNInfo, tokenContractAddress, commonDexInfo3 != null ? commonDexInfo3.getFromTokenAmount() : null, z);
        advancedSubmitTeeMarketOrderUseCase$submitOrderWithBatchSign$1.label = 1;
        java.lang.Object objOLrzqt = c28195kSk.OLrzqt(c28194kSj, fragmentActivity, advancedSubmitTeeMarketOrderUseCase$submitOrderWithBatchSign$1);
        return objOLrzqt == objCopydefault ? objCopydefault : objOLrzqt;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(TeeMarketPlaceOrderParams teeMarketPlaceOrderParams, FragmentActivity fragmentActivity, InterfaceC9740bbL.TaskDescription taskDescription, boolean z, Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        AdvancedSubmitTeeMarketOrderUseCase$submitOrderInternal$1 advancedSubmitTeeMarketOrderUseCase$submitOrderInternal$1;
        java.lang.Object objAEQbTJ;
        if (continuation instanceof AdvancedSubmitTeeMarketOrderUseCase$submitOrderInternal$1) {
            advancedSubmitTeeMarketOrderUseCase$submitOrderInternal$1 = (AdvancedSubmitTeeMarketOrderUseCase$submitOrderInternal$1) continuation;
            int i = advancedSubmitTeeMarketOrderUseCase$submitOrderInternal$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedSubmitTeeMarketOrderUseCase$submitOrderInternal$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedSubmitTeeMarketOrderUseCase$submitOrderInternal$1 = new AdvancedSubmitTeeMarketOrderUseCase$submitOrderInternal$1(this, continuation);
            }
        }
        AdvancedSubmitTeeMarketOrderUseCase$submitOrderInternal$1 advancedSubmitTeeMarketOrderUseCase$submitOrderInternal$12 = advancedSubmitTeeMarketOrderUseCase$submitOrderInternal$1;
        java.lang.Object obj = advancedSubmitTeeMarketOrderUseCase$submitOrderInternal$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedSubmitTeeMarketOrderUseCase$submitOrderInternal$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C19750gNy c19750gNy = this.OLrzqt;
            advancedSubmitTeeMarketOrderUseCase$submitOrderInternal$12.label = 1;
            objAEQbTJ = c19750gNy.AEQbTJ(teeMarketPlaceOrderParams, fragmentActivity, taskDescription, z, advancedSubmitTeeMarketOrderUseCase$submitOrderInternal$12);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ);
        if (thM7380exceptionOrNullimpl != null) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl));
        }
        SignAndBroadcastRes signAndBroadcastRes = (SignAndBroadcastRes) objAEQbTJ;
        java.lang.String tpslOrderFailMsg = signAndBroadcastRes.getTpslOrderFailMsg();
        if (tpslOrderFailMsg != null && tpslOrderFailMsg.length() != 0) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(new OKServerException(0, signAndBroadcastRes.getTpslOrderFailMsg(), null, null, 13, null)));
        }
        Result.Application application3 = Result.Companion;
        OrderDetailBean marketOrderDetail = signAndBroadcastRes.getMarketOrderDetail();
        java.lang.String transactionHash = marketOrderDetail != null ? marketOrderDetail.getTransactionHash() : null;
        if (transactionHash == null) {
            transactionHash = "";
        }
        return Result.m7377constructorimpl(transactionHash);
    }
}
