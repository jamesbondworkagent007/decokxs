package com.okinc.common.localization;

import com.okinc.localization2.bean.LanguageUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC32554mfl;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pTU;

/* JADX INFO: loaded from: classes7.dex */
public final class SwitchMarketLoadingActivity$startSwitchMarket$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Boolean, Continuation<? super Unit>, Object> $finishCallback;
    final /* synthetic */ pTU $localizeService;
    final /* synthetic */ LanguageUnit $newUnit;
    int label;
    final /* synthetic */ ActivityC32554mfl this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwitchMarketLoadingActivity$startSwitchMarket$3$1(ActivityC32554mfl activityC32554mfl, pTU ptu, LanguageUnit languageUnit, Function2<? super Boolean, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super SwitchMarketLoadingActivity$startSwitchMarket$3$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC32554mfl;
        this.$localizeService = ptu;
        this.$newUnit = languageUnit;
        this.$finishCallback = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SwitchMarketLoadingActivity$startSwitchMarket$3$1(this.this$0, this.$localizeService, this.$newUnit, this.$finishCallback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SwitchMarketLoadingActivity$startSwitchMarket$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ActivityC32554mfl activityC32554mfl = this.this$0;
            pTU ptu = this.$localizeService;
            LanguageUnit languageUnit = this.$newUnit;
            this.label = 1;
            obj = activityC32554mfl.KWHzl(ptu, languageUnit, 2000L, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            Function2<Boolean, Continuation<? super Unit>, Object> function2 = this.$finishCallback;
            Boolean boolKWHzl = C56443yFo.KWHzl(true);
            this.label = 2;
            if (function2.invoke(boolKWHzl, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}
