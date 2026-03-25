package com.okinc.business.defi.wallet.home;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC12782ctV;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.dTH;
import o.dTN;
import o.ePI;
import o.eUI;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiHomeWalletFragment$initView$2$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ eUI $this_with;
    int label;
    final /* synthetic */ ePI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiHomeWalletFragment$initView$2$2(eUI eui, ePI epi, Continuation<? super DefiHomeWalletFragment$initView$2$2> continuation) {
        super(2, continuation);
        this.$this_with = eui;
        this.this$0 = epi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiHomeWalletFragment$initView$2$2(this.$this_with, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiHomeWalletFragment$initView$2$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowFilterNotNull = FlowKt.filterNotNull(((dTN) C43251rlk.copydefault(dTN.class)).OLrzqt());
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_with, this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowFilterNotNull, anonymousClass1, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.DefiHomeWalletFragment$initView$2$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<dTH, Continuation<? super Unit>, Object> {
        final /* synthetic */ eUI $this_with;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ePI this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(eUI eui, ePI epi, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_with = eui;
            this.this$0 = epi;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_with, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(dTH dth, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(dth, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                dTH dth = (dTH) this.L$0;
                AbstractC12782ctV value = this.$this_with.fARcdN().getValue();
                if (Intrinsics.EZpvd((Object) dth.EZpvd(), (Object) (value != null ? value.DbNXlk() : null))) {
                    this.this$0.ejfBZ(value);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
