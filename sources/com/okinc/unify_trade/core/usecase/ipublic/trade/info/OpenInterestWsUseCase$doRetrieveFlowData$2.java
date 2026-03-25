package com.okinc.unify_trade.core.usecase.ipublic.trade.info;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.unify_trade.biz.subscribe.OpenInterestData;
import com.okinc.unify_trade.core.usecase.ipublic.trade.info.OpenInterestWsUseCase$doRetrieveFlowData$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import o.AbstractC55682xoZ;
import o.AbstractC58185ywX;
import o.C33129mqd;
import o.C54280xCo;
import o.C54589xNz;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C58266yxz;
import o.InterfaceC54581xNr;
import o.InterfaceC58227yxM;
import o.yDY;

/* JADX INFO: loaded from: classes24.dex */
public final class OpenInterestWsUseCase$doRetrieveFlowData$2 extends SuspendLambda implements Function2<ProducerScope<? super ResponseData<OpenInterestData>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C54280xCo this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenInterestWsUseCase$doRetrieveFlowData$2(C54280xCo c54280xCo, Continuation<? super OpenInterestWsUseCase$doRetrieveFlowData$2> continuation) {
        super(2, continuation);
        this.this$0 = c54280xCo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OpenInterestWsUseCase$doRetrieveFlowData$2 openInterestWsUseCase$doRetrieveFlowData$2 = new OpenInterestWsUseCase$doRetrieveFlowData$2(this.this$0, continuation);
        openInterestWsUseCase$doRetrieveFlowData$2.L$0 = obj;
        return openInterestWsUseCase$doRetrieveFlowData$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super ResponseData<OpenInterestData>> producerScope, Continuation<? super Unit> continuation) {
        return ((OpenInterestWsUseCase$doRetrieveFlowData$2) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ProducerScope producerScope;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            producerScope = (ProducerScope) this.L$0;
            C54280xCo c54280xCo = this.this$0;
            c54280xCo.OLrzqt(yDY.copydefault(new AnonymousClass5(producerScope, c54280xCo.EZpvd, C33129mqd.gEmmrt(C56443yFo.KWHzl(System.currentTimeMillis())))));
            C54280xCo c54280xCo2 = this.this$0;
            this.L$0 = producerScope;
            this.label = 1;
            if (c54280xCo2.copydefault(this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            producerScope = (ProducerScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        final C54280xCo c54280xCo3 = this.this$0;
        Function0 function0 = new Function0() { // from class: o.xCk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OpenInterestWsUseCase$doRetrieveFlowData$2.invokeSuspend$lambda$0(c54280xCo3);
            }
        };
        this.L$0 = null;
        this.label = 2;
        if (ProduceKt.awaitClose(producerScope, function0, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.unify_trade.core.usecase.ipublic.trade.info.OpenInterestWsUseCase$doRetrieveFlowData$2$5, reason: invalid class name */
    public static final class AnonymousClass5 extends AbstractC55682xoZ {
        public final /* synthetic */ ProducerScope<ResponseData<OpenInterestData>> EZpvd;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.channels.ProducerScope<? super com.okinc.network.okg.response.ResponseData<com.okinc.unify_trade.biz.subscribe.OpenInterestData>> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(ProducerScope<? super ResponseData<OpenInterestData>> producerScope, String str, String str2) {
            super(str, str2);
            this.EZpvd = producerScope;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void copydefault(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void EZpvd(OpenInterestData openInterestData, String str) {
            TradePositionManager tradePositionManagerFJNWhG;
            AbstractC58185ywX<OpenInterestData> abstractC58185ywXOLrzqt;
            AbstractC58185ywX<OpenInterestData> abstractC58185ywXCopydefault;
            Intrinsics.checkNotNullParameter(openInterestData, "");
            Intrinsics.checkNotNullParameter(str, "");
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt == null || (tradePositionManagerFJNWhG = interfaceC54581xNrOLrzqt.fJNWhG()) == null || (abstractC58185ywXOLrzqt = tradePositionManagerFJNWhG.OLrzqt(openInterestData)) == null || (abstractC58185ywXCopydefault = abstractC58185ywXOLrzqt.copydefault(C58266yxz.OLrzqt())) == null) {
                return;
            }
            final ProducerScope<ResponseData<OpenInterestData>> producerScope = this.EZpvd;
            final Function1 function1 = new Function1() { // from class: o.xCr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return OpenInterestWsUseCase$doRetrieveFlowData$2.AnonymousClass5.copydefault(producerScope, (OpenInterestData) obj);
                }
            };
            InterfaceC58227yxM<? super OpenInterestData> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.xCs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    OpenInterestWsUseCase$doRetrieveFlowData$2.AnonymousClass5.copydefault(function1, obj);
                }
            };
            final ProducerScope<ResponseData<OpenInterestData>> producerScope2 = this.EZpvd;
            final Function1 function12 = new Function1() { // from class: o.xCp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return OpenInterestWsUseCase$doRetrieveFlowData$2.AnonymousClass5.copydefault(producerScope2, (java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.xCt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    OpenInterestWsUseCase$doRetrieveFlowData$2.AnonymousClass5.AEQbTJ(function12, obj);
                }
            });
        }

        public static final Unit copydefault(ProducerScope producerScope, OpenInterestData openInterestData) {
            producerScope.mo5769trySendJP2dKIU(new ResponseData(0, null, null, null, openInterestData, null, 46, null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void AEQbTJ(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        public static final Unit copydefault(ProducerScope producerScope, Throwable th) {
            producerScope.mo5769trySendJP2dKIU(new ResponseData(-1, "", null, null, null, null, 60, null));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(C54280xCo c54280xCo) {
        c54280xCo.AYXKKw();
        return Unit.INSTANCE;
    }
}
