package com.okinc.business.defi.wallet.mine.search.ui.view;

import androidx.core.app.FrameMetricsAggregator;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchRecommendResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C18980fse;
import o.C18995fst;
import o.C19000fsy;
import o.C19155fvu;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSearchResultContainerFragment$initListener$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C19155fvu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSearchResultContainerFragment$initListener$1(C19155fvu c19155fvu, Continuation<? super WalletSearchResultContainerFragment$initListener$1> continuation) {
        super(2, continuation);
        this.this$0 = c19155fvu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletSearchResultContainerFragment$initListener$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletSearchResultContainerFragment$initListener$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowZip = FlowKt.zip(this.this$0.EZpvd().KWHzl(), this.this$0.djBIcL().AEQbTJ(), new AnonymousClass1(this.this$0, null));
            final C19155fvu c19155fvu = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchResultContainerFragment$initListener$1.3
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                public final Object emit(C18995fst c18995fst, Continuation<? super Unit> continuation) {
                    c19155fvu.OLrzqt(c18995fst);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowZip.collect(flowCollector, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchResultContainerFragment$initListener$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements yHO<C19000fsy, SearchRecommendResponse, Continuation<? super C18995fst>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;
        final /* synthetic */ C19155fvu this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C19155fvu c19155fvu, Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
            this.this$0 = c19155fvu;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.yHO
        public final Object invoke(C19000fsy c19000fsy, SearchRecommendResponse searchRecommendResponse, Continuation<? super C18995fst> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = c19000fsy;
            anonymousClass1.L$1 = searchRecommendResponse;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                C19000fsy c19000fsy = (C19000fsy) this.L$0;
                SearchRecommendResponse searchRecommendResponse = (SearchRecommendResponse) this.L$1;
                C18980fse c18980fseAhwBna = this.this$0.djBIcL().AhwBna();
                if (c18980fseAhwBna == null) {
                    c18980fseAhwBna = new C18980fse(false, null, null, null, null, null, null, null, false, FrameMetricsAggregator.EVERY_DURATION, null);
                }
                return new C18995fst(c18980fseAhwBna, c19000fsy, searchRecommendResponse);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
