package com.okinc.business.defi.wallet.home;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.business.defi.biz.net.bean.WalletPnlAnalysisResponse;
import com.okinc.business.defi.wallet.home.addressDetail.viewmodel.WalletPnlDataViewModel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.C14706dqX;
import o.C16595emr;
import o.C56391yDq;
import o.C56442yFn;
import o.ePI;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiHomeWalletFragment$initPnlViewAndCollectPnlData$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ WalletPnlDataViewModel $this_with;
    int label;
    final /* synthetic */ ePI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiHomeWalletFragment$initPnlViewAndCollectPnlData$2$1(ePI epi, WalletPnlDataViewModel walletPnlDataViewModel, Continuation<? super DefiHomeWalletFragment$initPnlViewAndCollectPnlData$2$1> continuation) {
        super(2, continuation);
        this.this$0 = epi;
        this.$this_with = walletPnlDataViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiHomeWalletFragment$initPnlViewAndCollectPnlData$2$1(this.this$0, this.$this_with, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiHomeWalletFragment$initPnlViewAndCollectPnlData$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.DefiHomeWalletFragment$initPnlViewAndCollectPnlData$2$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WalletPnlDataViewModel $this_with;
        int label;
        final /* synthetic */ ePI this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WalletPnlDataViewModel walletPnlDataViewModel, ePI epi, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_with = walletPnlDataViewModel;
            this.this$0 = epi;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$this_with, this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.DefiHomeWalletFragment$initPnlViewAndCollectPnlData$2$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C02621 extends SuspendLambda implements Function2<Result<? extends WalletPnlAnalysisResponse>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ePI this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02621(ePI epi, Continuation<? super C02621> continuation) {
                super(2, continuation);
                this.this$0 = epi;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C02621 c02621 = new C02621(this.this$0, continuation);
                c02621.L$0 = obj;
                return c02621;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(Result<? extends WalletPnlAnalysisResponse> result, Continuation<? super Unit> continuation) {
                return invoke(result.m7386unboximpl(), continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
                return ((C02621) create(Result.m7376boximpl(obj), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C14706dqX c14706dqX;
                C14706dqX c14706dqX2;
                C14706dqX c14706dqX3;
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    Object objM7386unboximpl = ((Result) this.L$0).m7386unboximpl();
                    if (this.this$0.QUSxYX()) {
                        C16595emr c16595emr = this.this$0.AhwBna;
                        if (c16595emr != null && (c14706dqX3 = c16595emr.fARcdN) != null) {
                            c14706dqX3.setVisibility(0);
                        }
                        C16595emr c16595emr2 = this.this$0.AhwBna;
                        if (c16595emr2 != null && (c14706dqX2 = c16595emr2.fARcdN) != null) {
                            C14706dqX.setData$default(c14706dqX2, (WalletPnlAnalysisResponse) (Result.m7383isFailureimpl(objM7386unboximpl) ? null : objM7386unboximpl), Result.m7384isSuccessimpl(objM7386unboximpl) ? 3 : 2, false, 4, null);
                        }
                    } else {
                        C16595emr c16595emr3 = this.this$0.AhwBna;
                        if (c16595emr3 != null && (c14706dqX = c16595emr3.fARcdN) != null) {
                            c14706dqX.setVisibility(8);
                        }
                    }
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
                SharedFlow<Result<WalletPnlAnalysisResponse>> sharedFlowOLrzqt = this.$this_with.OLrzqt();
                C02621 c02621 = new C02621(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlowOLrzqt, c02621, this) == objCopydefault) {
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ePI epi = this.this$0;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_with, epi, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(epi, state, anonymousClass1, this) == objCopydefault) {
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
