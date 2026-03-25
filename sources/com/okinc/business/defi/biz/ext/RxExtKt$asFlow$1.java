package com.okinc.business.defi.biz.ext;

import com.okinc.business.defi.biz.ext.RxExtKt$asFlow$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import o.AbstractC58260yxt;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes4.dex */
public final class RxExtKt$asFlow$1<T> extends SuspendLambda implements Function2<ProducerScope<? super T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC58260yxt<T> $this_asFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RxExtKt$asFlow$1(AbstractC58260yxt<T> abstractC58260yxt, Continuation<? super RxExtKt$asFlow$1> continuation) {
        super(2, continuation);
        this.$this_asFlow = abstractC58260yxt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RxExtKt$asFlow$1 rxExtKt$asFlow$1 = new RxExtKt$asFlow$1(this.$this_asFlow, continuation);
        rxExtKt$asFlow$1.L$0 = obj;
        return rxExtKt$asFlow$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super T> producerScope, Continuation<? super Unit> continuation) {
        return ((RxExtKt$asFlow$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            AbstractC58260yxt<T> abstractC58260yxt = this.$this_asFlow;
            final Function1 function1 = new Function1() { // from class: o.cUq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return RxExtKt$asFlow$1.invokeSuspend$lambda$0(producerScope, obj2);
                }
            };
            InterfaceC58227yxM<? super T> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.cUp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj2) {
                    function1.invoke(obj2);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.cUx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return RxExtKt$asFlow$1.invokeSuspend$lambda$2(producerScope, (java.lang.Throwable) obj2);
                }
            };
            final InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.cUv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj2) {
                    function12.invoke(obj2);
                }
            });
            Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
            Function0 function0 = new Function0() { // from class: o.cUw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return RxExtKt$asFlow$1.invokeSuspend$lambda$4(interfaceC58217yxCAEQbTJ);
                }
            };
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, function0, this) == objCopydefault) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(ProducerScope producerScope, Object obj) {
        ChannelResult.m7430isSuccessimpl(producerScope.mo5769trySendJP2dKIU(obj));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(ProducerScope producerScope, Throwable th) {
        producerScope.close(th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$4(InterfaceC58217yxC interfaceC58217yxC) {
        interfaceC58217yxC.dispose();
        return Unit.INSTANCE;
    }
}
