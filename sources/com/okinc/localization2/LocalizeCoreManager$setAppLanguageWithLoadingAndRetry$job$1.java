package com.okinc.localization2;

import com.okinc.localization2.bean.AppLanguagesChangeResult;
import com.okinc.localization2.bean.LanguageUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C48787ucK;
import o.C56391yDq;
import o.C56442yFn;
import o.pTJ;

/* JADX INFO: loaded from: classes9.dex */
public final class LocalizeCoreManager$setAppLanguageWithLoadingAndRetry$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AppLanguagesChangeResult>, Object> {
    final /* synthetic */ LanguageUnit $newUnit;
    int label;
    final /* synthetic */ pTJ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalizeCoreManager$setAppLanguageWithLoadingAndRetry$job$1(pTJ ptj, LanguageUnit languageUnit, Continuation<? super LocalizeCoreManager$setAppLanguageWithLoadingAndRetry$job$1> continuation) {
        super(2, continuation);
        this.this$0 = ptj;
        this.$newUnit = languageUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LocalizeCoreManager$setAppLanguageWithLoadingAndRetry$job$1(this.this$0, this.$newUnit, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AppLanguagesChangeResult> continuation) {
        return ((LocalizeCoreManager$setAppLanguageWithLoadingAndRetry$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            int iAEQbTJ = C48787ucK.AEQbTJ.AEQbTJ("localizationConfig.maxSwitchMarketRetryTimes", 2);
            pTJ ptj = this.this$0;
            LanguageUnit languageUnit = this.$newUnit;
            this.label = 1;
            obj = ptj.EZpvd(languageUnit, iAEQbTJ + 1, (Continuation<? super AppLanguagesChangeResult>) this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
