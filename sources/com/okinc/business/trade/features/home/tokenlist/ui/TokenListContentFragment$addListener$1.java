package com.okinc.business.trade.features.home.tokenlist.ui;

import androidx.appcompat.widget.AppCompatTextView;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C22318hdB;
import o.C22366hdx;
import o.C30429law;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.kZJ;

/* JADX INFO: loaded from: classes7.dex */
public final class TokenListContentFragment$addListener$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ kZJ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenListContentFragment$addListener$1(kZJ kzj, Continuation<? super TokenListContentFragment$addListener$1> continuation) {
        super(2, continuation);
        this.this$0 = kzj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TokenListContentFragment$addListener$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TokenListContentFragment$addListener$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<String> stateFlowEZpvd = this.this$0.valueOf().EZpvd();
            final kZJ kzj = this.this$0;
            FlowCollector<? super String> flowCollector = new FlowCollector() { // from class: com.okinc.business.trade.features.home.tokenlist.ui.TokenListContentFragment$addListener$1.1
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                public final Object emit(String str, Continuation<? super Unit> continuation) {
                    AppCompatTextView appCompatTextView;
                    String strAYXKKw;
                    C22318hdB c22318hdB = kzj.EZpvd;
                    if (c22318hdB != null && (appCompatTextView = c22318hdB.EZpvd) != null) {
                        if (str.length() > 0) {
                            if (!kzj.values().valueOf()) {
                                strAYXKKw = C33070mpX.AYXKKw(C22366hdx.StateListAnimator.AEQbTJ);
                            } else {
                                strAYXKKw = C33070mpX.AYXKKw(C22366hdx.StateListAnimator.OcIXYQ);
                            }
                        } else if (kzj.values().valueOf()) {
                            strAYXKKw = C33070mpX.AYXKKw(C22366hdx.StateListAnimator.AEQbTJ);
                        } else {
                            strAYXKKw = C33070mpX.AYXKKw(C22366hdx.StateListAnimator.OcIXYQ);
                        }
                        appCompatTextView.setText(strAYXKKw);
                    }
                    kzj.fetchVPNInfo();
                    C30429law.loadTokenList$default(kzj.values(), str, false, 2, null);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (stateFlowEZpvd.collect(flowCollector, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }
}
