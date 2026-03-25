package com.okinc.business.invest_biz.ui.screens.univ3;

import com.okinc.business.invest_biz.ui.widget.InvestUniv3APRViewMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C23732iHg;
import o.C23956iPo;
import o.C27247jrb;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class InvestUniv3SubscribeActivity$initConfirmPage$13 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ InvestUniv3SubscribeActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUniv3SubscribeActivity$initConfirmPage$13(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, Continuation<? super InvestUniv3SubscribeActivity$initConfirmPage$13> continuation) {
        super(2, continuation);
        this.this$0 = investUniv3SubscribeActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUniv3SubscribeActivity$initConfirmPage$13(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestUniv3SubscribeActivity$initConfirmPage$13) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeActivity$initConfirmPage$13$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<C23956iPo, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ InvestUniv3SubscribeActivity this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = investUniv3SubscribeActivity;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(C23956iPo c23956iPo, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(c23956iPo, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                C23956iPo c23956iPo = (C23956iPo) this.L$0;
                C23732iHg c23732iHg = this.this$0.AhwBna;
                C23732iHg c23732iHg2 = null;
                if (c23732iHg == null) {
                    Intrinsics.gEmmrt("");
                    c23732iHg = null;
                }
                c23732iHg.gkJEwt.EZpvd(InvestUniv3APRViewMode.V2);
                C23732iHg c23732iHg3 = this.this$0.AhwBna;
                if (c23732iHg3 == null) {
                    Intrinsics.gEmmrt("");
                    c23732iHg3 = null;
                }
                C27247jrb c27247jrb = c23732iHg3.gkJEwt;
                Intrinsics.checkNotNullExpressionValue(c27247jrb, "");
                c27247jrb.setVisibility(C33129mqd.OLrzqt((CharSequence) c23956iPo.OLrzqt()) ? 0 : 8);
                C23732iHg c23732iHg4 = this.this$0.AhwBna;
                if (c23732iHg4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c23732iHg2 = c23732iHg4;
                }
                c23732iHg2.gkJEwt.setData(c23956iPo);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow<C23956iPo> mutableStateFlowGkJEwt = this.this$0.isConnected().gkJEwt();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(mutableStateFlowGkJEwt, anonymousClass1, this) == objCopydefault) {
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
