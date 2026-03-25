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
import o.pTU;

/* JADX INFO: loaded from: classes7.dex */
public final class SwitchMarketLoadingActivity$onCreate$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $languageCode;
    final /* synthetic */ String $market;
    final /* synthetic */ int $maxSwitchCount;
    final /* synthetic */ String $requestKey;
    int label;
    final /* synthetic */ ActivityC32554mfl this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchMarketLoadingActivity$onCreate$3(ActivityC32554mfl activityC32554mfl, String str, String str2, int i, String str3, Continuation<? super SwitchMarketLoadingActivity$onCreate$3> continuation) {
        super(2, continuation);
        this.this$0 = activityC32554mfl;
        this.$market = str;
        this.$languageCode = str2;
        this.$maxSwitchCount = i;
        this.$requestKey = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SwitchMarketLoadingActivity$onCreate$3(this.this$0, this.$market, this.$languageCode, this.$maxSwitchCount, this.$requestKey, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SwitchMarketLoadingActivity$onCreate$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ActivityC32554mfl activityC32554mfl = this.this$0;
            pTU ptuAhwBna = activityC32554mfl.AhwBna();
            LanguageUnit languageUnit = new LanguageUnit(this.$market, this.$languageCode);
            int i2 = this.$maxSwitchCount;
            String str = this.$requestKey;
            this.label = 1;
            if (activityC32554mfl.OLrzqt(ptuAhwBna, languageUnit, i2, str, (Continuation<? super Unit>) this) == objCopydefault) {
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
