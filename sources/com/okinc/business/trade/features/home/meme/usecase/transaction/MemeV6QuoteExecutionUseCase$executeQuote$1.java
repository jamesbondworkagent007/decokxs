package com.okinc.business.trade.features.home.meme.usecase.transaction;

import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dexlogic.bean.TradeMode;
import com.okinc.business.trade.features.home.meme.usecase.transaction.MemeV6QuoteExecutionUseCase;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C22380heK;
import o.C28163kRf;
import o.C31172lox;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.gYS;
import o.kWR;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeV6QuoteExecutionUseCase$executeQuote$1 extends SuspendLambda implements Function2<FlowCollector<? super MemeV6QuoteExecutionUseCase.Application>, Continuation<? super Unit>, Object> {
    final /* synthetic */ MemeV6QuoteExecutionUseCase.QuoteParams $params;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MemeV6QuoteExecutionUseCase this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeV6QuoteExecutionUseCase$executeQuote$1(MemeV6QuoteExecutionUseCase.QuoteParams quoteParams, MemeV6QuoteExecutionUseCase memeV6QuoteExecutionUseCase, Continuation<? super MemeV6QuoteExecutionUseCase$executeQuote$1> continuation) {
        super(2, continuation);
        this.$params = quoteParams;
        this.this$0 = memeV6QuoteExecutionUseCase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MemeV6QuoteExecutionUseCase$executeQuote$1 memeV6QuoteExecutionUseCase$executeQuote$1 = new MemeV6QuoteExecutionUseCase$executeQuote$1(this.$params, this.this$0, continuation);
        memeV6QuoteExecutionUseCase$executeQuote$1.L$0 = obj;
        return memeV6QuoteExecutionUseCase$executeQuote$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super MemeV6QuoteExecutionUseCase.Application> flowCollector, Continuation<? super Unit> continuation) {
        return ((MemeV6QuoteExecutionUseCase$executeQuote$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b5 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        String selectedDeFiPlatformId;
        kWR.TaskDescription taskDescription;
        int type;
        kWR.TaskDescription taskDescription2;
        FlowCollector flowCollector2;
        int i;
        Object objAEQbTJ;
        Flow<Result<V6BaseQuoteResponse>> flowKWHzl;
        AnonymousClass4 anonymousClass4;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            flowCollector = (FlowCollector) this.L$0;
            if (!this.$params.isPreCheckSupported()) {
                MemeV6QuoteExecutionUseCase.Application.C0379Application c0379Application = MemeV6QuoteExecutionUseCase.Application.C0379Application.OLrzqt;
                this.label = 1;
                if (flowCollector.emit(c0379Application, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            Pair<String, String> fromToTokenAddress = this.$params.getFromToTokenAddress();
            String strComponent1 = fromToTokenAddress.component1();
            String strComponent2 = fromToTokenAddress.component2();
            String strKWHzl = C22380heK.OLrzqt.copydefault("default_trade").fARcdN().KWHzl(this.$params.getChainId());
            int iM6634getMemeUIStylezYUCHBs = this.$params.m6634getMemeUIStylezYUCHBs();
            C31172lox.TaskDescription taskDescription3 = C31172lox.Companion;
            if (C31172lox.KWHzl(iM6634getMemeUIStylezYUCHBs, taskDescription3.OLrzqt())) {
                selectedDeFiPlatformId = "11";
                taskDescription = new kWR.TaskDescription(this.$params.getChainId(), strComponent1, strComponent2, this.$params.getRealAmount(), strKWHzl, this.$params.getTransactionType().getType(), this.$params.getRouterModeType(), this.$params.getSlippageValue(), this.$params.getMaxSlippage(), this.$params.getSlippageMode(), this.$params.getPriorityFeeType(), selectedDeFiPlatformId, this.this$0.KWHzl.OLrzqt(this.$params.getChainId()), this.this$0.KWHzl.copydefault(this.$params.getChainId()), this.$params.getPriorityFeeValue(), this.$params.getSupportCustomGas(), this.$params.isBatchBroadCast());
                type = (!C31172lox.KWHzl(this.$params.m6634getMemeUIStylezYUCHBs(), taskDescription3.KWHzl()) ? TradeMode.MemeMode : TradeMode.QuickMode).getType();
                if (C31172lox.KWHzl(this.$params.m6634getMemeUIStylezYUCHBs(), taskDescription3.KWHzl())) {
                    C28163kRf c28163kRf = this.this$0.AEQbTJ;
                    String sourceType = this.$params.getSourceType();
                    String chainId = this.$params.getChainId();
                    this.L$0 = flowCollector;
                    this.L$1 = taskDescription;
                    this.I$0 = type;
                    this.label = 2;
                    if (c28163kRf.OLrzqt(sourceType, chainId, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    taskDescription2 = taskDescription;
                    flowCollector2 = flowCollector;
                    i = type;
                    type = i;
                    flowCollector = flowCollector2;
                    taskDescription = taskDescription2;
                }
            } else {
                selectedDeFiPlatformId = this.$params.getSelectedDeFiPlatformId();
                if (selectedDeFiPlatformId.length() == 0) {
                }
                taskDescription = new kWR.TaskDescription(this.$params.getChainId(), strComponent1, strComponent2, this.$params.getRealAmount(), strKWHzl, this.$params.getTransactionType().getType(), this.$params.getRouterModeType(), this.$params.getSlippageValue(), this.$params.getMaxSlippage(), this.$params.getSlippageMode(), this.$params.getPriorityFeeType(), selectedDeFiPlatformId, this.this$0.KWHzl.OLrzqt(this.$params.getChainId()), this.this$0.KWHzl.copydefault(this.$params.getChainId()), this.$params.getPriorityFeeValue(), this.$params.getSupportCustomGas(), this.$params.isBatchBroadCast());
                type = (!C31172lox.KWHzl(this.$params.m6634getMemeUIStylezYUCHBs(), taskDescription3.KWHzl()) ? TradeMode.MemeMode : TradeMode.QuickMode).getType();
                if (C31172lox.KWHzl(this.$params.m6634getMemeUIStylezYUCHBs(), taskDescription3.KWHzl())) {
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 == 1) {
            C56391yDq.AEQbTJ(obj);
            return Unit.INSTANCE;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = obj;
            gYS gys = (gYS) objAEQbTJ;
            flowKWHzl = this.this$0.EZpvd.KWHzl(gys);
            anonymousClass4 = new AnonymousClass4(this.this$0, this.$params, gys, flowCollector);
            this.L$0 = null;
            this.label = 4;
            if (flowKWHzl.collect(anonymousClass4, this) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
        i = this.I$0;
        taskDescription2 = (kWR.TaskDescription) this.L$1;
        flowCollector2 = (FlowCollector) this.L$0;
        C56391yDq.AEQbTJ(obj);
        ((Result) obj).m7386unboximpl();
        type = i;
        flowCollector = flowCollector2;
        taskDescription = taskDescription2;
        boolean zKWHzl = this.this$0.OLrzqt.KWHzl(this.$params.getChainId());
        kWR kwr = this.this$0.EZpvd;
        this.L$0 = flowCollector;
        this.L$1 = null;
        this.label = 3;
        objAEQbTJ = kwr.AEQbTJ(taskDescription, String.valueOf(type), zKWHzl, this);
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        gYS gys2 = (gYS) objAEQbTJ;
        flowKWHzl = this.this$0.EZpvd.KWHzl(gys2);
        anonymousClass4 = new AnonymousClass4(this.this$0, this.$params, gys2, flowCollector);
        this.L$0 = null;
        this.label = 4;
        if (flowKWHzl.collect(anonymousClass4, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.trade.features.home.meme.usecase.transaction.MemeV6QuoteExecutionUseCase$executeQuote$1$4, reason: invalid class name */
    public static final class AnonymousClass4<T> implements FlowCollector {
        public final /* synthetic */ MemeV6QuoteExecutionUseCase.QuoteParams AEQbTJ;
        public final /* synthetic */ MemeV6QuoteExecutionUseCase EZpvd;
        public final /* synthetic */ gYS OLrzqt;
        public final /* synthetic */ FlowCollector<MemeV6QuoteExecutionUseCase.Application> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlinx.coroutines.flow.FlowCollector<? super com.okinc.business.trade.features.home.meme.usecase.transaction.MemeV6QuoteExecutionUseCase$Application> */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(MemeV6QuoteExecutionUseCase memeV6QuoteExecutionUseCase, MemeV6QuoteExecutionUseCase.QuoteParams quoteParams, gYS gys, FlowCollector<? super MemeV6QuoteExecutionUseCase.Application> flowCollector) {
            this.EZpvd = memeV6QuoteExecutionUseCase;
            this.AEQbTJ = quoteParams;
            this.OLrzqt = gys;
            this.copydefault = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation<? super Unit> continuation) throws Throwable {
            MemeV6QuoteExecutionUseCase$executeQuote$1$1$emit$1 memeV6QuoteExecutionUseCase$executeQuote$1$1$emit$1;
            Object objM7386unboximpl;
            AnonymousClass4<T> anonymousClass4;
            if (continuation instanceof MemeV6QuoteExecutionUseCase$executeQuote$1$1$emit$1) {
                memeV6QuoteExecutionUseCase$executeQuote$1$1$emit$1 = (MemeV6QuoteExecutionUseCase$executeQuote$1$1$emit$1) continuation;
                int i = memeV6QuoteExecutionUseCase$executeQuote$1$1$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    memeV6QuoteExecutionUseCase$executeQuote$1$1$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    memeV6QuoteExecutionUseCase$executeQuote$1$1$emit$1 = new MemeV6QuoteExecutionUseCase$executeQuote$1$1$emit$1(this, continuation);
                }
            }
            Object obj2 = memeV6QuoteExecutionUseCase$executeQuote$1$1$emit$1.result;
            Object objCopydefault = C56442yFn.copydefault();
            int i2 = memeV6QuoteExecutionUseCase$executeQuote$1$1$emit$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj2);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
                MemeV6QuoteExecutionUseCase memeV6QuoteExecutionUseCase = this.EZpvd;
                MemeV6QuoteExecutionUseCase.QuoteParams quoteParams = this.AEQbTJ;
                gYS gys = this.OLrzqt;
                FlowCollector<MemeV6QuoteExecutionUseCase.Application> flowCollector = this.copydefault;
                if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
                    MemeV6QuoteExecutionUseCase.Application applicationOLrzqt = memeV6QuoteExecutionUseCase.OLrzqt((V6BaseQuoteResponse) objM7386unboximpl, quoteParams, gys);
                    memeV6QuoteExecutionUseCase$executeQuote$1$1$emit$1.L$0 = this;
                    memeV6QuoteExecutionUseCase$executeQuote$1$1$emit$1.L$1 = objM7386unboximpl;
                    memeV6QuoteExecutionUseCase$executeQuote$1$1$emit$1.label = 1;
                    if (flowCollector.emit(applicationOLrzqt, memeV6QuoteExecutionUseCase$executeQuote$1$1$emit$1) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                anonymousClass4 = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                    return Unit.INSTANCE;
                }
                objM7386unboximpl = memeV6QuoteExecutionUseCase$executeQuote$1$1$emit$1.L$1;
                anonymousClass4 = (AnonymousClass4) memeV6QuoteExecutionUseCase$executeQuote$1$1$emit$1.L$0;
                C56391yDq.AEQbTJ(obj2);
            }
            MemeV6QuoteExecutionUseCase memeV6QuoteExecutionUseCase2 = anonymousClass4.EZpvd;
            FlowCollector<MemeV6QuoteExecutionUseCase.Application> flowCollector2 = anonymousClass4.copydefault;
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
            if (thM7380exceptionOrNullimpl != null) {
                Integer numAEQbTJ = C56443yFo.AEQbTJ(thM7380exceptionOrNullimpl instanceof OKServerException ? ((OKServerException) thM7380exceptionOrNullimpl).getCode() : -1);
                String message = thM7380exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "";
                }
                MemeV6QuoteExecutionUseCase.Application.TaskDescription taskDescriptionKWHzl = memeV6QuoteExecutionUseCase2.KWHzl(numAEQbTJ, message);
                memeV6QuoteExecutionUseCase$executeQuote$1$1$emit$1.L$0 = objM7386unboximpl;
                memeV6QuoteExecutionUseCase$executeQuote$1$1$emit$1.L$1 = null;
                memeV6QuoteExecutionUseCase$executeQuote$1$1$emit$1.label = 2;
                if (flowCollector2.emit(taskDescriptionKWHzl, memeV6QuoteExecutionUseCase$executeQuote$1$1$emit$1) == objCopydefault) {
                    return objCopydefault;
                }
            }
            return Unit.INSTANCE;
        }
    }
}
