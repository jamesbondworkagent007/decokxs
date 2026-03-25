package com.okinc.unify_trade.dex.assets.data.repository;

import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.unify_trade.biz.subscribe.DexAssetsResponse;
import com.okinc.unify_trade.dex.assets.data.model.DexWsAssetsRequest;
import com.okinc.unify_trade.dex.assets.data.repository.DexAssetsRepository$getWsDexAssetsData$2;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import o.AbstractC55660xoD;
import o.C33129mqd;
import o.C54589xNz;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC54581xNr;

/* JADX INFO: loaded from: classes24.dex */
public final class DexAssetsRepository$getWsDexAssetsData$2 extends SuspendLambda implements Function2<ProducerScope<? super Result<? extends DexAssetsResponse>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ DexWsAssetsRequest $dexWsAssetsRequest;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexAssetsRepository$getWsDexAssetsData$2(DexWsAssetsRequest dexWsAssetsRequest, Continuation<? super DexAssetsRepository$getWsDexAssetsData$2> continuation) {
        super(2, continuation);
        this.$dexWsAssetsRequest = dexWsAssetsRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DexAssetsRepository$getWsDexAssetsData$2 dexAssetsRepository$getWsDexAssetsData$2 = new DexAssetsRepository$getWsDexAssetsData$2(this.$dexWsAssetsRequest, continuation);
        dexAssetsRepository$getWsDexAssetsData$2.L$0 = obj;
        return dexAssetsRepository$getWsDexAssetsData$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ProducerScope<? super Result<? extends DexAssetsResponse>> producerScope, Continuation<? super Unit> continuation) {
        return invoke2((ProducerScope<? super Result<DexAssetsResponse>>) producerScope, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(ProducerScope<? super Result<DexAssetsResponse>> producerScope, Continuation<? super Unit> continuation) {
        return ((DexAssetsRepository$getWsDexAssetsData$2) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        final ArrayList arrayList;
        ProducerScope producerScope;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ProducerScope producerScope2 = (ProducerScope) this.L$0;
            arrayList = new ArrayList();
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$dexWsAssetsRequest, arrayList, producerScope2, null);
            this.L$0 = producerScope2;
            this.L$1 = arrayList;
            this.label = 1;
            if (BuildersKt.withContext(main, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
            producerScope = producerScope2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            arrayList = (ArrayList) this.L$1;
            producerScope = (ProducerScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        Function0 function0 = new Function0() { // from class: o.xHH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DexAssetsRepository$getWsDexAssetsData$2.invokeSuspend$lambda$0(arrayList);
            }
        };
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (ProduceKt.awaitClose(producerScope, function0, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.unify_trade.dex.assets.data.repository.DexAssetsRepository$getWsDexAssetsData$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ProducerScope<Result<DexAssetsResponse>> $$this$callbackFlow;
        final /* synthetic */ DexWsAssetsRequest $dexWsAssetsRequest;
        final /* synthetic */ ArrayList<Object> $listener;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlinx.coroutines.channels.ProducerScope<? super kotlin.Result<com.okinc.unify_trade.biz.subscribe.DexAssetsResponse>> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(DexWsAssetsRequest dexWsAssetsRequest, ArrayList<Object> arrayList, ProducerScope<? super Result<DexAssetsResponse>> producerScope, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$dexWsAssetsRequest = dexWsAssetsRequest;
            this.$listener = arrayList;
            this.$$this$callbackFlow = producerScope;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$dexWsAssetsRequest, this.$listener, this.$$this$callbackFlow, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.unify_trade.dex.assets.data.repository.DexAssetsRepository$getWsDexAssetsData$2$1$TaskDescription */
        public static final class TaskDescription extends AbstractC55660xoD {
            public final /* synthetic */ ProducerScope<Result<DexAssetsResponse>> AhwBna;

            /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlinx.coroutines.channels.ProducerScope<? super kotlin.Result<com.okinc.unify_trade.biz.subscribe.DexAssetsResponse>> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public TaskDescription(ProducerScope<? super Result<DexAssetsResponse>> producerScope, int i, String str, String str2, boolean z, String str3) {
                super(i, str, str2, z, str3);
                this.AhwBna = producerScope;
            }

            /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Boolean;)V */
            @Override // o.AbstractC55755xpt
            public void AEQbTJ(DexAssetsResponse dexAssetsResponse, String str, Boolean bool) {
                Intrinsics.checkNotNullParameter(dexAssetsResponse, "");
                Intrinsics.checkNotNullParameter(str, "");
                super.AEQbTJ(dexAssetsResponse, str, bool);
                if (Intrinsics.EZpvd(bool, Boolean.TRUE)) {
                    ProducerScope<Result<DexAssetsResponse>> producerScope = this.AhwBna;
                    Result.Application application = Result.Companion;
                    producerScope.mo5769trySendJP2dKIU(Result.m7376boximpl(Result.m7377constructorimpl(dexAssetsResponse)));
                } else {
                    ProducerScope<Result<DexAssetsResponse>> producerScope2 = this.AhwBna;
                    Result.Application application2 = Result.Companion;
                    producerScope2.mo5769trySendJP2dKIU(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(new BizApiException("", null, null, null, null, 30, null)))));
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                this.$listener.add(new TaskDescription(this.$$this$callbackFlow, this.$dexWsAssetsRequest.getLimit(), this.$dexWsAssetsRequest.getChainIndex(), this.$dexWsAssetsRequest.getTokenAddress(), this.$dexWsAssetsRequest.getHideSmallBalance(), C33129mqd.gEmmrt(C56443yFo.KWHzl(System.currentTimeMillis()))));
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                if (interfaceC54581xNrOLrzqt == null) {
                    return null;
                }
                interfaceC54581xNrOLrzqt.copydefault(this.$listener);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(ArrayList arrayList) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            interfaceC54581xNrOLrzqt.AEQbTJ((ArrayList<Object>) arrayList);
        }
        return Unit.INSTANCE;
    }
}
