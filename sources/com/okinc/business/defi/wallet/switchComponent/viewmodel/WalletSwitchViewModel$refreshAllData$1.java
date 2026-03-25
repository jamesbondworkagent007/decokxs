package com.okinc.business.defi.wallet.switchComponent.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C17776fRw;
import o.C17781fSa;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC17773fRt;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSwitchViewModel$refreshAllData$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C17781fSa this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSwitchViewModel$refreshAllData$1(C17781fSa c17781fSa, Continuation<? super WalletSwitchViewModel$refreshAllData$1> continuation) {
        super(1, continuation);
        this.this$0 = c17781fSa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new WalletSwitchViewModel$refreshAllData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((WalletSwitchViewModel$refreshAllData$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.iwGUEr.OLrzqt();
            this.this$0.fIwbmz.OLrzqt();
            InterfaceC17773fRt interfaceC17773fRt = this.this$0.AwvSrB;
            this.label = 1;
            if (interfaceC17773fRt.EZpvd(this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                this.this$0.OLrzqt();
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        CoroutineDispatcher io2 = Dispatchers.getIO();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
        this.label = 2;
        if (BuildersKt.withContext(io2, anonymousClass1, this) == objCopydefault) {
            return objCopydefault;
        }
        this.this$0.OLrzqt();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.switchComponent.viewmodel.WalletSwitchViewModel$refreshAllData$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
        int label;
        final /* synthetic */ C17781fSa this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C17781fSa c17781fSa, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c17781fSa;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Object> continuation) {
            return invoke2(coroutineScope, (Continuation<Object>) continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<Object> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C17776fRw c17776fRw = this.this$0.fIwbmz;
                this.label = 1;
                if (c17776fRw.copydefault(this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        C56391yDq.AEQbTJ(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            C17776fRw c17776fRw2 = this.this$0.iwGUEr;
            this.label = 2;
            obj = c17776fRw2.copydefault(this);
            return obj == objCopydefault ? objCopydefault : obj;
        }
    }
}
