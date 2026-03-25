package com.okinc.kline.ui.unlock.ui;

import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.kline.data.KlineCoinInfo;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import o.C39732pxr;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;

/* JADX INFO: loaded from: classes8.dex */
public final class KlineUnlockTokenFragment$initView$3 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends KlineCoinInfo>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C39732pxr this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineUnlockTokenFragment$initView$3(C39732pxr c39732pxr, Continuation<? super KlineUnlockTokenFragment$initView$3> continuation) {
        super(2, continuation);
        this.this$0 = c39732pxr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KlineUnlockTokenFragment$initView$3 klineUnlockTokenFragment$initView$3 = new KlineUnlockTokenFragment$initView$3(this.this$0, continuation);
        klineUnlockTokenFragment$initView$3.L$0 = obj;
        return klineUnlockTokenFragment$initView$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends KlineCoinInfo> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return invoke2((InterfaceC49371unL<KlineCoinInfo>) interfaceC49371unL, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC49371unL<KlineCoinInfo> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return ((KlineUnlockTokenFragment$initView$3) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) this.L$0;
            Job jobEZpvd = this.this$0.EZpvd();
            if (jobEZpvd != null) {
                Job.DefaultImpls.cancel$default(jobEZpvd, (CancellationException) null, 1, (Object) null);
            }
            C39732pxr c39732pxr = this.this$0;
            c39732pxr.EZpvd(LifecycleOwnerKt.getLifecycleScope(c39732pxr).launchWhenResumed(new AnonymousClass1(interfaceC49371unL, this.this$0, null)));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: renamed from: com.okinc.kline.ui.unlock.ui.KlineUnlockTokenFragment$initView$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ InterfaceC49371unL<KlineCoinInfo> $it;
        int label;
        final /* synthetic */ C39732pxr this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC49371unL<KlineCoinInfo> interfaceC49371unL, C39732pxr c39732pxr, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$it = interfaceC49371unL;
            this.this$0 = c39732pxr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$it, this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC49371unL<KlineCoinInfo> interfaceC49371unL = this.$it;
                if ((interfaceC49371unL instanceof InterfaceC49371unL.Activity) && ((KlineCoinInfo) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault()).getSupportTokenUnlock()) {
                    this.this$0.KWHzl().EZpvd();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
