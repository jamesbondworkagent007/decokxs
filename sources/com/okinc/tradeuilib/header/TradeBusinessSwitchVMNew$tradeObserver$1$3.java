package com.okinc.tradeuilib.header;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.AbstractC54531xLw;
import o.C49673usw;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54581xNr;

/* JADX INFO: loaded from: classes19.dex */
public final class TradeBusinessSwitchVMNew$tradeObserver$1$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC54581xNr $it;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C49673usw this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeBusinessSwitchVMNew$tradeObserver$1$3(InterfaceC54581xNr interfaceC54581xNr, C49673usw c49673usw, Continuation<? super TradeBusinessSwitchVMNew$tradeObserver$1$3> continuation) {
        super(2, continuation);
        this.$it = interfaceC54581xNr;
        this.this$0 = c49673usw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TradeBusinessSwitchVMNew$tradeObserver$1$3 tradeBusinessSwitchVMNew$tradeObserver$1$3 = new TradeBusinessSwitchVMNew$tradeObserver$1$3(this.$it, this.this$0, continuation);
        tradeBusinessSwitchVMNew$tradeObserver$1$3.L$0 = obj;
        return tradeBusinessSwitchVMNew$tradeObserver$1$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TradeBusinessSwitchVMNew$tradeObserver$1$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.tradeuilib.header.TradeBusinessSwitchVMNew$tradeObserver$1$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ InterfaceC54581xNr $it;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C49673usw this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC54581xNr interfaceC54581xNr, C49673usw c49673usw, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$it = interfaceC54581xNr;
            this.this$0 = c49673usw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM7377constructorimpl;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
            } catch (Throwable th) {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC54581xNr interfaceC54581xNr = this.$it;
                Result.Application application2 = Result.Companion;
                this.label = 1;
                obj = interfaceC54581xNr.EZpvd("FUTURES", this);
                if (obj == objCopydefault) {
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
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((AbstractC54531xLw) obj);
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = null;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            C06301 c06301 = new C06301(this.this$0, (AbstractC54531xLw) objM7377constructorimpl, null);
            this.label = 2;
            if (BuildersKt.withContext(main, c06301, this) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.tradeuilib.header.TradeBusinessSwitchVMNew$tradeObserver$1$3$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C06301 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ AbstractC54531xLw $future;
            int label;
            final /* synthetic */ C49673usw this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06301(C49673usw c49673usw, AbstractC54531xLw abstractC54531xLw, Continuation<? super C06301> continuation) {
                super(2, continuation);
                this.this$0 = c49673usw;
                this.$future = abstractC54531xLw;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06301(this.this$0, this.$future, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    this.this$0.gEmmrt().setValue(this.$future);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, Dispatchers.getIO(), null, new AnonymousClass1(this.$it, this.this$0, null), 2, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
