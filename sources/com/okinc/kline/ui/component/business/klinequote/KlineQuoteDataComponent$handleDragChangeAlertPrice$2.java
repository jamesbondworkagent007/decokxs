package com.okinc.kline.ui.component.business.klinequote;

import com.okinc.kline.data.PriceWarningItemBean;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35964oKf;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC39563puh;
import o.pEY;

/* JADX INFO: loaded from: classes23.dex */
public final class KlineQuoteDataComponent$handleDragChangeAlertPrice$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PriceWarningItemBean $priceWarningItemBean;
    int label;
    final /* synthetic */ KlineQuoteDataComponent this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineQuoteDataComponent$handleDragChangeAlertPrice$2(PriceWarningItemBean priceWarningItemBean, KlineQuoteDataComponent klineQuoteDataComponent, Continuation<? super KlineQuoteDataComponent$handleDragChangeAlertPrice$2> continuation) {
        super(2, continuation);
        this.$priceWarningItemBean = priceWarningItemBean;
        this.this$0 = klineQuoteDataComponent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KlineQuoteDataComponent$handleDragChangeAlertPrice$2(this.$priceWarningItemBean, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KlineQuoteDataComponent$handleDragChangeAlertPrice$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.kline.ui.component.business.klinequote.KlineQuoteDataComponent$handleDragChangeAlertPrice$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ PriceWarningItemBean $priceWarningItemBean;
        int label;
        final /* synthetic */ KlineQuoteDataComponent this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PriceWarningItemBean priceWarningItemBean, KlineQuoteDataComponent klineQuoteDataComponent, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.$priceWarningItemBean = priceWarningItemBean;
            this.this$0 = klineQuoteDataComponent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.$priceWarningItemBean, this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                PriceWarningItemBean priceWarningItemBean = this.$priceWarningItemBean;
                this.label = 1;
                obj = pEY.OLrzqt(priceWarningItemBean, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            if (((ResponseData) obj).getCode() == 0) {
                C55326xho.toastWithSuccessfulIcon$default(C35964oKf.Fragment.ONJgbh, 0, 1, (Object) null);
                InterfaceC39563puh.StateListAnimator stateListAnimatorUzCIH = this.this$0.uzCIH();
                if (stateListAnimatorUzCIH != null) {
                    stateListAnimatorUzCIH.copydefault(this.this$0.OLrzqt());
                }
            } else {
                C55326xho.toastWithSuccessfulIcon$default(C35964oKf.Fragment.HJWChPRAkuRW, 0, 1, (Object) null);
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$priceWarningItemBean, this.this$0, null);
            this.label = 1;
            if (pEY.AEQbTJ(anonymousClass1, this) == objCopydefault) {
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
