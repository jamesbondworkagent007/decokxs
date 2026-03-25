package com.okinc.lifecycle.impl.deeplink.usecase;

import android.app.Activity;
import com.okinc.lifecycle.impl.deeplink.usecase.HandleDeferredDeeplinkUseCaseImpl$listenToConfigUpdate$1;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC43238rlX;
import o.C43251rlk;
import o.C54819xWm;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.InterfaceC43294rma;
import o.pMD;
import o.pUU;

/* JADX INFO: loaded from: classes9.dex */
public final class HandleDeferredDeeplinkUseCaseImpl$listenToConfigUpdate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ pMD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandleDeferredDeeplinkUseCaseImpl$listenToConfigUpdate$1(pMD pmd, Continuation<? super HandleDeferredDeeplinkUseCaseImpl$listenToConfigUpdate$1> continuation) {
        super(2, continuation);
        this.this$0 = pmd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HandleDeferredDeeplinkUseCaseImpl$listenToConfigUpdate$1 handleDeferredDeeplinkUseCaseImpl$listenToConfigUpdate$1 = new HandleDeferredDeeplinkUseCaseImpl$listenToConfigUpdate$1(this.this$0, continuation);
        handleDeferredDeeplinkUseCaseImpl$listenToConfigUpdate$1.L$0 = obj;
        return handleDeferredDeeplinkUseCaseImpl$listenToConfigUpdate$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HandleDeferredDeeplinkUseCaseImpl$listenToConfigUpdate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.lifecycle.impl.deeplink.usecase.HandleDeferredDeeplinkUseCaseImpl$listenToConfigUpdate$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        final /* synthetic */ CoroutineScope $$this$launch;
        int label;
        final /* synthetic */ pMD this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(pMD pmd, CoroutineScope coroutineScope, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = pmd;
            this.$$this$launch = coroutineScope;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$$this$launch, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                pUU.KWHzl("HandleDeferredDeeplink", "Config updated successfully");
                String strKWHzl = this.this$0.KWHzl();
                pUU.KWHzl("HandleDeferredDeeplink", "Deeplink - " + strKWHzl);
                if (strKWHzl != null && this.this$0.AEQbTJ(strKWHzl)) {
                    if (C54819xWm.KWHzl().AEQbTJ() != null) {
                        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
                        Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
                        Intrinsics.checkNotNullExpressionValue(activityAEQbTJ, "");
                        Map<String, ? extends Object> mapKWHzl = C56424yEw.KWHzl();
                        final CoroutineScope coroutineScope = this.$$this$launch;
                        interfaceC43294rma.KWHzl(activityAEQbTJ, strKWHzl, mapKWHzl, new Function1() { // from class: o.pMB
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return HandleDeferredDeeplinkUseCaseImpl$listenToConfigUpdate$1.AnonymousClass1.invokeSuspend$lambda$0(coroutineScope, (AbstractC43238rlX) obj2);
                            }
                        });
                    }
                } else {
                    pUU.copydefault("LifecycleLinkServiceImpl - failed to process deferred deeplink");
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(CoroutineScope coroutineScope, AbstractC43238rlX abstractC43238rlX) {
            pUU.KWHzl(coroutineScope.getClass().getName(), "Deferred Deeplink processed - " + abstractC43238rlX);
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Flow flowTake = FlowKt.take(this.this$0.AEQbTJ.OLrzqt(), 1);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, coroutineScope, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowTake, anonymousClass1, this) == objCopydefault) {
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
