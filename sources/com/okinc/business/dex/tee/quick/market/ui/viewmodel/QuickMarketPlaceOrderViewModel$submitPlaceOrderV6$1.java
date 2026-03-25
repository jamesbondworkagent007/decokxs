package com.okinc.business.dex.tee.quick.market.ui.viewmodel;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelKt;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.dex.tee.domain.model.SignAndBroadcastRes;
import com.okinc.business.dex.tee.domain.model.TeeMarketPlaceOrderParams;
import com.okinc.business.dex.tee.quick.market.ui.viewmodel.QuickMarketPlaceOrderViewModel$submitPlaceOrderV6$1;
import com.okinc.business.dex.trade.widget.jwt.OrderRetryHelper;
import com.okinc.business.dexlogic.bean.OrderDetailBean;
import com.okinc.business.dexlogic.bean.TraceData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC28108kPe;
import o.C19750gNy;
import o.C28109kPf;
import o.C28110kPg;
import o.C30565ldZ;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC9738bbJ;
import o.InterfaceC9740bbL;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class QuickMarketPlaceOrderViewModel$submitPlaceOrderV6$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ boolean $forceManualSign;
    final /* synthetic */ InterfaceC9740bbL.TaskDescription $loadingCallback;
    final /* synthetic */ TeeMarketPlaceOrderParams $orderParams;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ QuickMarketPlaceOrderViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickMarketPlaceOrderViewModel$submitPlaceOrderV6$1(QuickMarketPlaceOrderViewModel quickMarketPlaceOrderViewModel, TeeMarketPlaceOrderParams teeMarketPlaceOrderParams, FragmentActivity fragmentActivity, InterfaceC9740bbL.TaskDescription taskDescription, boolean z, Continuation<? super QuickMarketPlaceOrderViewModel$submitPlaceOrderV6$1> continuation) {
        super(2, continuation);
        this.this$0 = quickMarketPlaceOrderViewModel;
        this.$orderParams = teeMarketPlaceOrderParams;
        this.$activity = fragmentActivity;
        this.$loadingCallback = taskDescription;
        this.$forceManualSign = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QuickMarketPlaceOrderViewModel$submitPlaceOrderV6$1(this.this$0, this.$orderParams, this.$activity, this.$loadingCallback, this.$forceManualSign, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((QuickMarketPlaceOrderViewModel$submitPlaceOrderV6$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0195  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object obj2;
        QuickMarketPlaceOrderViewModel quickMarketPlaceOrderViewModel;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C19750gNy c19750gNy = this.this$0.uzCIH;
            InterfaceC9738bbJ interfaceC9738bbJKWHzl = this.this$0.hDKMBd.KWHzl();
            String strEjfBZ = interfaceC9738bbJKWHzl != null ? interfaceC9738bbJKWHzl.ejfBZ() : null;
            String str = strEjfBZ == null ? "" : strEjfBZ;
            String strKWHzl = this.this$0.hDKMBd.KWHzl(this.$orderParams.getChainId());
            String strKWHzl2 = this.this$0.hDKMBd.KWHzl(this.$orderParams.getChainId());
            InterfaceC9738bbJ interfaceC9738bbJKWHzl2 = this.this$0.hDKMBd.KWHzl();
            String strDbNXlk = interfaceC9738bbJKWHzl2 != null ? interfaceC9738bbJKWHzl2.DbNXlk() : null;
            String str2 = strDbNXlk == null ? "" : strDbNXlk;
            TeeMarketPlaceOrderParams teeMarketPlaceOrderParams = this.$orderParams;
            TeeMarketPlaceOrderParams teeMarketPlaceOrderParamsCopy = teeMarketPlaceOrderParams.copy(((-100663300) & 1) != 0 ? teeMarketPlaceOrderParams.teeId : str, ((-100663300) & 2) != 0 ? teeMarketPlaceOrderParams.walletAddress : strKWHzl2, ((-100663300) & 4) != 0 ? teeMarketPlaceOrderParams.strategyType : null, ((-100663300) & 8) != 0 ? teeMarketPlaceOrderParams.maxSlippage : null, ((-100663300) & 16) != 0 ? teeMarketPlaceOrderParams.priorityFeeType : null, ((-100663300) & 32) != 0 ? teeMarketPlaceOrderParams.priorityFee : null, ((-100663300) & 64) != 0 ? teeMarketPlaceOrderParams.routerModeType : null, ((-100663300) & 128) != 0 ? teeMarketPlaceOrderParams.tpslConfig : null, ((-100663300) & 256) != 0 ? teeMarketPlaceOrderParams.orderSource : null, ((-100663300) & 512) != 0 ? teeMarketPlaceOrderParams.gasPrice : null, ((-100663300) & 1024) != 0 ? teeMarketPlaceOrderParams.enableJito : null, ((-100663300) & 2048) != 0 ? teeMarketPlaceOrderParams.gasUsed : null, ((-100663300) & 4096) != 0 ? teeMarketPlaceOrderParams.mevInfo : null, ((-100663300) & 8192) != 0 ? teeMarketPlaceOrderParams.serviceFeeInfo : null, ((-100663300) & 16384) != 0 ? teeMarketPlaceOrderParams.tradeMode : null, ((-100663300) & 32768) != 0 ? teeMarketPlaceOrderParams.traceData : null, ((-100663300) & 65536) != 0 ? teeMarketPlaceOrderParams.direction : null, ((-100663300) & 131072) != 0 ? teeMarketPlaceOrderParams.chainId : null, ((-100663300) & 262144) != 0 ? teeMarketPlaceOrderParams.chainName : null, ((-100663300) & 524288) != 0 ? teeMarketPlaceOrderParams.businessType : null, ((-100663300) & 1048576) != 0 ? teeMarketPlaceOrderParams.fromTokenAddress : null, ((-100663300) & 2097152) != 0 ? teeMarketPlaceOrderParams.toTokenAddress : null, ((-100663300) & 4194304) != 0 ? teeMarketPlaceOrderParams.amount : null, ((-100663300) & 8388608) != 0 ? teeMarketPlaceOrderParams.slippageType : null, ((-100663300) & 16777216) != 0 ? teeMarketPlaceOrderParams.slippage : null, ((-100663300) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? teeMarketPlaceOrderParams.userWalletAddress : strKWHzl, ((-100663300) & 67108864) != 0 ? teeMarketPlaceOrderParams.accountId : str2, ((-100663300) & 134217728) != 0 ? teeMarketPlaceOrderParams.toAmount : null, ((-100663300) & 268435456) != 0 ? teeMarketPlaceOrderParams.dexRouterList : null, ((-100663300) & 536870912) != 0 ? teeMarketPlaceOrderParams.expireTime : null, ((-100663300) & 1073741824) != 0 ? teeMarketPlaceOrderParams.fromTokenDecimals : null, ((-100663300) & Integer.MIN_VALUE) != 0 ? teeMarketPlaceOrderParams.toTokenDecimals : null, (31 & 1) != 0 ? teeMarketPlaceOrderParams.minimumReceived : null, (31 & 2) != 0 ? teeMarketPlaceOrderParams.quoteId : null, (31 & 4) != 0 ? teeMarketPlaceOrderParams.refParam : null, (31 & 8) != 0 ? teeMarketPlaceOrderParams.isOKXPlatform : false, (31 & 16) != 0 ? teeMarketPlaceOrderParams.isAutoConfirmQuotaRemaining : false);
            FragmentActivity fragmentActivity = this.$activity;
            InterfaceC9740bbL.TaskDescription taskDescription = this.$loadingCallback;
            boolean zKWHzl = this.this$0.AYXKKw.KWHzl(this.$forceManualSign, this.$orderParams.isOKXPlatform(), this.$orderParams.isAutoConfirmQuotaRemaining());
            this.label = 1;
            objAEQbTJ = c19750gNy.AEQbTJ(teeMarketPlaceOrderParamsCopy, fragmentActivity, taskDescription, zKWHzl, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                quickMarketPlaceOrderViewModel = (QuickMarketPlaceOrderViewModel) this.L$1;
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                quickMarketPlaceOrderViewModel.fJNWhG.EZpvd();
                final QuickMarketPlaceOrderViewModel quickMarketPlaceOrderViewModel2 = this.this$0;
                final TeeMarketPlaceOrderParams teeMarketPlaceOrderParams2 = this.$orderParams;
                final FragmentActivity fragmentActivity2 = this.$activity;
                final InterfaceC9740bbL.TaskDescription taskDescription2 = this.$loadingCallback;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                    quickMarketPlaceOrderViewModel2.AEQbTJ.setValue(C56443yFo.KWHzl(false));
                    pUU.KWHzl("QuickMarketPlaceOrderViewModel", "submitPlaceOrderV6 failure, entering retry handler");
                    OrderRetryHelper.handleErrorWithRetry$default(quickMarketPlaceOrderViewModel2.fJNWhG, thM7380exceptionOrNullimpl, new Function1() { // from class: o.gNx
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj3) {
                            return QuickMarketPlaceOrderViewModel$submitPlaceOrderV6$1.invokeSuspend$lambda$3$lambda$1(quickMarketPlaceOrderViewModel2, teeMarketPlaceOrderParams2, fragmentActivity2, taskDescription2, ((java.lang.Boolean) obj3).booleanValue());
                        }
                    }, new Function1() { // from class: o.gNA
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj3) {
                            return QuickMarketPlaceOrderViewModel$submitPlaceOrderV6$1.invokeSuspend$lambda$3$lambda$2(quickMarketPlaceOrderViewModel2, (java.lang.Throwable) obj3);
                        }
                    }, "V6 RETRY -> submitPlaceOrderV6 failed", null, 16, null);
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        obj2 = objAEQbTJ;
        TeeMarketPlaceOrderParams teeMarketPlaceOrderParams3 = this.$orderParams;
        QuickMarketPlaceOrderViewModel quickMarketPlaceOrderViewModel3 = this.this$0;
        if (Result.m7384isSuccessimpl(obj2)) {
            SignAndBroadcastRes signAndBroadcastRes = (SignAndBroadcastRes) obj2;
            pUU.KWHzl("QuickMarketPlaceOrderViewModel", "submitPlaceOrderV6 success");
            C28110kPg c28110kPg = C28110kPg.KWHzl;
            String chainId = teeMarketPlaceOrderParams3.getChainId();
            String chainName = teeMarketPlaceOrderParams3.getChainName();
            String businessType = teeMarketPlaceOrderParams3.getBusinessType();
            TraceData traceData = teeMarketPlaceOrderParams3.getTraceData();
            String quoteId = traceData != null ? traceData.getQuoteId() : null;
            C28109kPf c28109kPf = new C28109kPf(chainId, chainName, businessType, "swap", quoteId == null ? "" : quoteId, quickMarketPlaceOrderViewModel3.copydefault(teeMarketPlaceOrderParams3.getChainId()));
            OrderDetailBean marketOrderDetail = signAndBroadcastRes.getMarketOrderDetail();
            String transactionHash = marketOrderDetail != null ? marketOrderDetail.getTransactionHash() : null;
            c28110kPg.copydefault(new AbstractC28108kPe.Activity(c28109kPf, transactionHash != null ? transactionHash : ""));
            quickMarketPlaceOrderViewModel3.AEQbTJ.setValue(C56443yFo.KWHzl(false));
            MutableSharedFlow mutableSharedFlow = quickMarketPlaceOrderViewModel3.AhwBna;
            this.L$0 = obj2;
            this.L$1 = quickMarketPlaceOrderViewModel3;
            this.label = 2;
            if (mutableSharedFlow.emit(signAndBroadcastRes, this) == objCopydefault) {
                return objCopydefault;
            }
            quickMarketPlaceOrderViewModel = quickMarketPlaceOrderViewModel3;
            quickMarketPlaceOrderViewModel.fJNWhG.EZpvd();
        }
        final QuickMarketPlaceOrderViewModel quickMarketPlaceOrderViewModel22 = this.this$0;
        final TeeMarketPlaceOrderParams teeMarketPlaceOrderParams22 = this.$orderParams;
        final FragmentActivity fragmentActivity22 = this.$activity;
        final InterfaceC9740bbL.TaskDescription taskDescription22 = this.$loadingCallback;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3$lambda$1(QuickMarketPlaceOrderViewModel quickMarketPlaceOrderViewModel, TeeMarketPlaceOrderParams teeMarketPlaceOrderParams, FragmentActivity fragmentActivity, InterfaceC9740bbL.TaskDescription taskDescription, boolean z) {
        pUU.KWHzl("QuickMarketPlaceOrderViewModel", "submitPlaceOrderV6 retryAction invoked, forceManualSign=" + z);
        quickMarketPlaceOrderViewModel.AEQbTJ(teeMarketPlaceOrderParams, fragmentActivity, taskDescription, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3$lambda$2(QuickMarketPlaceOrderViewModel quickMarketPlaceOrderViewModel, Throwable th) {
        pUU.copydefault("QuickMarketPlaceOrderViewModel", "submitPlaceOrderV6 non JWT code = " + C30565ldZ.EZpvd(th));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(quickMarketPlaceOrderViewModel), null, null, new QuickMarketPlaceOrderViewModel$submitPlaceOrderV6$1$2$2$1(quickMarketPlaceOrderViewModel, th, null), 3, null);
        return Unit.INSTANCE;
    }
}
