package com.okinc.business.trade.features.home.advanced.viewmodel.delegate;

import com.okinc.business.dex.trade.core.domain.model.DefiPlatformInfo;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dexlogic.bean.TraceData;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedCommonDexInfo;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteAndCallData;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteResponse;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData;
import com.okinc.network.okg.response.OKServerException;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C28141kQk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC30595leC;
import o.kTB;
import o.pUU;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedQuotePollingDelegate$startMarketQuote$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<String, Unit> $onDeFiPlatformNameUpdate;
    final /* synthetic */ Function1<V6BaseQuoteResponse, String> $onDeFiPlatformUpdated;
    final /* synthetic */ Function1<InterfaceC30595leC, Unit> $onOrderError;
    final /* synthetic */ Function1<Boolean, Unit> $onProviderOKXPlatformUpdate;
    final /* synthetic */ C28141kQk $params;
    int label;
    final /* synthetic */ kTB this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse, java.lang.String> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.leC, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AdvancedQuotePollingDelegate$startMarketQuote$1(kTB ktb, C28141kQk c28141kQk, Function1<? super V6BaseQuoteResponse, String> function1, Function1<? super InterfaceC30595leC, Unit> function12, Function1<? super String, Unit> function13, Function1<? super Boolean, Unit> function14, Continuation<? super AdvancedQuotePollingDelegate$startMarketQuote$1> continuation) {
        super(2, continuation);
        this.this$0 = ktb;
        this.$params = c28141kQk;
        this.$onDeFiPlatformUpdated = function1;
        this.$onOrderError = function12;
        this.$onDeFiPlatformNameUpdate = function13;
        this.$onProviderOKXPlatformUpdate = function14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedQuotePollingDelegate$startMarketQuote$1(this.this$0, this.$params, this.$onDeFiPlatformUpdated, this.$onOrderError, this.$onDeFiPlatformNameUpdate, this.$onProviderOKXPlatformUpdate, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedQuotePollingDelegate$startMarketQuote$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.trade.features.home.advanced.viewmodel.delegate.AdvancedQuotePollingDelegate$startMarketQuote$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Result<? extends AdvancedQuoteAndCallData.V6>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<String, Unit> $onDeFiPlatformNameUpdate;
        final /* synthetic */ Function1<V6BaseQuoteResponse, String> $onDeFiPlatformUpdated;
        final /* synthetic */ Function1<InterfaceC30595leC, Unit> $onOrderError;
        final /* synthetic */ Function1<Boolean, Unit> $onProviderOKXPlatformUpdate;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        final /* synthetic */ kTB this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse, java.lang.String> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.leC, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(kTB ktb, Function1<? super V6BaseQuoteResponse, String> function1, Function1<? super InterfaceC30595leC, Unit> function12, Function1<? super String, Unit> function13, Function1<? super Boolean, Unit> function14, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ktb;
            this.$onDeFiPlatformUpdated = function1;
            this.$onOrderError = function12;
            this.$onDeFiPlatformNameUpdate = function13;
            this.$onProviderOKXPlatformUpdate = function14;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$onDeFiPlatformUpdated, this.$onOrderError, this.$onDeFiPlatformNameUpdate, this.$onProviderOKXPlatformUpdate, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Result<? extends AdvancedQuoteAndCallData.V6> result, Continuation<? super Unit> continuation) {
            return invoke(result.m7386unboximpl(), continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(Result.m7376boximpl(obj), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x01b7  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x01c9  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM7386unboximpl;
            Function1<InterfaceC30595leC, Unit> function1;
            Function1<String, Unit> function12;
            Object obj2;
            AdvancedQuoteAndCallData.V6 v6;
            AdvancedQuoteUiData advancedQuoteUiData;
            Object value;
            InterfaceC30595leC interfaceC30595leC;
            Function1<Boolean, Unit> function13;
            Object obj3;
            Object objInvoke;
            AdvancedQuoteAndCallData.V6 v62;
            kTB ktb;
            Function1<InterfaceC30595leC, Unit> function14;
            Throwable thM7380exceptionOrNullimpl;
            AdvancedQuoteUiData advancedQuoteUiData2;
            Object obj4;
            InterfaceC30595leC interfaceC30595leC2;
            Object objInvoke2;
            AdvancedQuoteUiData advancedQuoteUiData3;
            kTB ktb2;
            Function1<InterfaceC30595leC, Unit> function15;
            Object obj5;
            String name;
            MutableStateFlow<Result<V6BaseQuoteResponse>> mutableStateFlowOLrzqt;
            Result<V6BaseQuoteResponse> value2;
            Throwable thM7380exceptionOrNullimpl2;
            Result<V6BaseQuoteResponse> resultM7376boximpl;
            MutableStateFlow mutableStateFlow;
            Object value3;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) this.L$0).m7386unboximpl();
                Function1<V6BaseQuoteResponse, String> function16 = this.$onDeFiPlatformUpdated;
                kTB ktb3 = this.this$0;
                function1 = this.$onOrderError;
                function12 = this.$onDeFiPlatformNameUpdate;
                Function1<Boolean, Unit> function17 = this.$onProviderOKXPlatformUpdate;
                if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
                    v6 = (AdvancedQuoteAndCallData.V6) objM7386unboximpl;
                    advancedQuoteUiData = new AdvancedQuoteUiData(v6);
                    v6.sSMYrx().setLocalSelectedDeFiPlatformId(function16.invoke(v6.sSMYrx()));
                    MutableStateFlow mutableStateFlow2 = ktb3.AEQbTJ;
                    do {
                        value = mutableStateFlow2.getValue();
                    } while (!mutableStateFlow2.compareAndSet(value, advancedQuoteUiData));
                    Function2<AdvancedQuoteUiData, Continuation<? super InterfaceC30595leC>, Object> function2Copydefault = ktb3.copydefault();
                    if (function2Copydefault == null) {
                        interfaceC30595leC = null;
                        function13 = function17;
                        obj3 = objM7386unboximpl;
                        function1.invoke(interfaceC30595leC);
                        DefiPlatformInfo selectedDeFiPlatform = v6.sSMYrx().getSelectedDeFiPlatform();
                        name = selectedDeFiPlatform == null ? selectedDeFiPlatform.getName() : null;
                        if (name == null) {
                            name = "";
                        }
                        function12.invoke(name);
                        function13.invoke(C56443yFo.KWHzl(advancedQuoteUiData.KWHzl().DbNXlk()));
                        obj2 = obj3;
                        ktb = this.this$0;
                        function14 = this.$onOrderError;
                        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                        if (thM7380exceptionOrNullimpl != null) {
                            OKServerException oKServerException = thM7380exceptionOrNullimpl instanceof OKServerException ? (OKServerException) thM7380exceptionOrNullimpl : null;
                            if (oKServerException != null) {
                                Throwable origin = oKServerException.getOrigin();
                                OKServerException oKServerException2 = origin instanceof OKServerException ? (OKServerException) origin : null;
                                if (oKServerException2 != null) {
                                    oKServerException = oKServerException2;
                                }
                            } else {
                                oKServerException = null;
                            }
                            pUU.AEQbTJ("QuotePollingDelegate", "startMarketQuote: code=" + (oKServerException != null ? C56443yFo.AEQbTJ(oKServerException.getCode()) : null), oKServerException);
                            advancedQuoteUiData2 = new AdvancedQuoteUiData(new AdvancedQuoteAndCallData.LegacyLimit(new AdvancedQuoteResponse((AdvancedCommonDexInfo) null, (TraceData) null, true, oKServerException != null ? C56443yFo.AEQbTJ(oKServerException.getCode()) : null, oKServerException != null ? oKServerException.getMessage() : null, (String) null, (List) null, (String) null, 227, (DefaultConstructorMarker) null), null));
                            Function2<AdvancedQuoteUiData, Continuation<? super InterfaceC30595leC>, Object> function2Copydefault2 = ktb.copydefault();
                            if (function2Copydefault2 != null) {
                                this.L$0 = obj2;
                                this.L$1 = objM7386unboximpl;
                                this.L$2 = ktb;
                                this.L$3 = function14;
                                this.L$4 = advancedQuoteUiData2;
                                this.L$5 = null;
                                this.L$6 = null;
                                this.label = 2;
                                objInvoke2 = function2Copydefault2.invoke(advancedQuoteUiData2, this);
                                if (objInvoke2 == objCopydefault) {
                                    return objCopydefault;
                                }
                                advancedQuoteUiData3 = advancedQuoteUiData2;
                                Object obj6 = obj2;
                                ktb2 = ktb;
                                function15 = function14;
                                obj5 = obj6;
                                interfaceC30595leC2 = (InterfaceC30595leC) objInvoke2;
                                advancedQuoteUiData2 = advancedQuoteUiData3;
                                obj4 = obj5;
                                function14 = function15;
                                ktb = ktb2;
                                function14.invoke(interfaceC30595leC2);
                                mutableStateFlow = ktb.AEQbTJ;
                                do {
                                    value3 = mutableStateFlow.getValue();
                                } while (!mutableStateFlow.compareAndSet(value3, advancedQuoteUiData2));
                                obj2 = obj4;
                            } else {
                                obj4 = obj2;
                                interfaceC30595leC2 = null;
                                function14.invoke(interfaceC30595leC2);
                                mutableStateFlow = ktb.AEQbTJ;
                                do {
                                    value3 = mutableStateFlow.getValue();
                                } while (!mutableStateFlow.compareAndSet(value3, advancedQuoteUiData2));
                                obj2 = obj4;
                            }
                        }
                        mutableStateFlowOLrzqt = this.this$0.OLrzqt();
                        do {
                            value2 = mutableStateFlowOLrzqt.getValue();
                            thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(obj2);
                            if (thM7380exceptionOrNullimpl2 != null) {
                            }
                        } while (!mutableStateFlowOLrzqt.compareAndSet(value2, resultM7376boximpl));
                        return Unit.INSTANCE;
                    }
                    this.L$0 = objM7386unboximpl;
                    this.L$1 = objM7386unboximpl;
                    this.L$2 = function1;
                    this.L$3 = function12;
                    this.L$4 = function17;
                    this.L$5 = v6;
                    this.L$6 = advancedQuoteUiData;
                    this.label = 1;
                    objInvoke = function2Copydefault.invoke(advancedQuoteUiData, this);
                    if (objInvoke == objCopydefault) {
                        return objCopydefault;
                    }
                    function13 = function17;
                    v62 = v6;
                    obj3 = objM7386unboximpl;
                } else {
                    obj2 = objM7386unboximpl;
                    ktb = this.this$0;
                    function14 = this.$onOrderError;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    mutableStateFlowOLrzqt = this.this$0.OLrzqt();
                    do {
                        value2 = mutableStateFlowOLrzqt.getValue();
                        thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(obj2);
                        if (thM7380exceptionOrNullimpl2 != null) {
                        }
                    } while (!mutableStateFlowOLrzqt.compareAndSet(value2, resultM7376boximpl));
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    advancedQuoteUiData3 = (AdvancedQuoteUiData) this.L$4;
                    function15 = (Function1) this.L$3;
                    kTB ktb4 = (kTB) this.L$2;
                    Object obj7 = this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    obj5 = obj7;
                    ktb2 = ktb4;
                    objInvoke2 = obj;
                    interfaceC30595leC2 = (InterfaceC30595leC) objInvoke2;
                    advancedQuoteUiData2 = advancedQuoteUiData3;
                    obj4 = obj5;
                    function14 = function15;
                    ktb = ktb2;
                    function14.invoke(interfaceC30595leC2);
                    mutableStateFlow = ktb.AEQbTJ;
                    do {
                        value3 = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value3, advancedQuoteUiData2));
                    obj2 = obj4;
                    mutableStateFlowOLrzqt = this.this$0.OLrzqt();
                    do {
                        value2 = mutableStateFlowOLrzqt.getValue();
                        thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(obj2);
                        if (thM7380exceptionOrNullimpl2 != null) {
                            Result.Application application = Result.Companion;
                            resultM7376boximpl = Result.m7376boximpl(Result.m7377constructorimpl(((AdvancedQuoteAndCallData.V6) obj2).sSMYrx()));
                        } else {
                            Result.Application application2 = Result.Companion;
                            OKServerException oKServerException3 = thM7380exceptionOrNullimpl2 instanceof OKServerException ? (OKServerException) thM7380exceptionOrNullimpl2 : null;
                            if (oKServerException3 != null) {
                                Throwable origin2 = oKServerException3.getOrigin();
                                OKServerException oKServerException4 = origin2 instanceof OKServerException ? (OKServerException) origin2 : null;
                                if (oKServerException4 != null) {
                                    oKServerException3 = oKServerException4;
                                }
                            } else {
                                oKServerException3 = new OKServerException(0, null, null, null, 15, null);
                            }
                            resultM7376boximpl = Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(oKServerException3)));
                        }
                    } while (!mutableStateFlowOLrzqt.compareAndSet(value2, resultM7376boximpl));
                    return Unit.INSTANCE;
                }
                AdvancedQuoteUiData advancedQuoteUiData4 = (AdvancedQuoteUiData) this.L$6;
                v62 = (AdvancedQuoteAndCallData.V6) this.L$5;
                function13 = (Function1) this.L$4;
                function12 = (Function1) this.L$3;
                function1 = (Function1) this.L$2;
                objM7386unboximpl = this.L$1;
                obj3 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                advancedQuoteUiData = advancedQuoteUiData4;
                objInvoke = obj;
            }
            interfaceC30595leC = (InterfaceC30595leC) objInvoke;
            v6 = v62;
            function1.invoke(interfaceC30595leC);
            DefiPlatformInfo selectedDeFiPlatform2 = v6.sSMYrx().getSelectedDeFiPlatform();
            if (selectedDeFiPlatform2 == null) {
            }
            if (name == null) {
            }
            function12.invoke(name);
            function13.invoke(C56443yFo.KWHzl(advancedQuoteUiData.KWHzl().DbNXlk()));
            obj2 = obj3;
            ktb = this.this$0;
            function14 = this.$onOrderError;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
            mutableStateFlowOLrzqt = this.this$0.OLrzqt();
            do {
                value2 = mutableStateFlowOLrzqt.getValue();
                thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl2 != null) {
                }
            } while (!mutableStateFlowOLrzqt.compareAndSet(value2, resultM7376boximpl));
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow<Result<AdvancedQuoteAndCallData.V6>> flowKWHzl = this.this$0.EZpvd.KWHzl(this.$params);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$onDeFiPlatformUpdated, this.$onOrderError, this.$onDeFiPlatformNameUpdate, this.$onProviderOKXPlatformUpdate, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowKWHzl, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
