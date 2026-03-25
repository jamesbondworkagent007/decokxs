package com.okinc.business.defi.wallet.tee.converter.ui.fragment;

import com.okinc.business.dex.api.bean.sa_small_assets.SmallAssetQuoteData;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC43419rot;
import o.C52794wYp;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.fUP;

/* JADX INFO: loaded from: classes18.dex */
public final class SlippageBottomSheet$onFooterCreated$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C52794wYp $this_apply;
    int label;
    final /* synthetic */ fUP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlippageBottomSheet$onFooterCreated$1$2(fUP fup, C52794wYp c52794wYp, Continuation<? super SlippageBottomSheet$onFooterCreated$1$2> continuation) {
        super(2, continuation);
        this.this$0 = fup;
        this.$this_apply = c52794wYp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SlippageBottomSheet$onFooterCreated$1$2(this.this$0, this.$this_apply, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SlippageBottomSheet$onFooterCreated$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.converter.ui.fragment.SlippageBottomSheet$onFooterCreated$1$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<AbstractC43419rot<? extends SmallAssetQuoteData, ? extends OKServerException>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C52794wYp $this_apply;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ fUP this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(fUP fup, C52794wYp c52794wYp, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = fup;
            this.$this_apply = c52794wYp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$this_apply, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(AbstractC43419rot<? extends SmallAssetQuoteData, ? extends OKServerException> abstractC43419rot, Continuation<? super Unit> continuation) {
            return invoke2((AbstractC43419rot<SmallAssetQuoteData, OKServerException>) abstractC43419rot, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(AbstractC43419rot<SmallAssetQuoteData, OKServerException> abstractC43419rot, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(abstractC43419rot, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                AbstractC43419rot abstractC43419rot = (AbstractC43419rot) this.L$0;
                fUP fup = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                    if (fup.AEQbTJ) {
                        fup.dismissAllowingStateLoss();
                    }
                }
                fUP fup2 = this.this$0;
                C52794wYp c52794wYp = this.$this_apply;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    OKServerException oKServerException = (OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl();
                    if (fup2.AEQbTJ) {
                        c52794wYp.fIwbmz();
                        String message = oKServerException.getMessage();
                        if (message != null) {
                            C55326xho.toastWithFailedIcon$default(message, 0, 1, (Object) null);
                        }
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
            Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.AEQbTJ().values());
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$this_apply, null);
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
}
