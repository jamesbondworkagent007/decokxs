package com.okinc.localization2.repo;

import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C38314pUe;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes9.dex */
public final class LanguageFallbackRepo$getFallbackLocaleForSelectLanguageInternal$locale$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Locale>, Object> {
    final /* synthetic */ String $market;
    int label;
    final /* synthetic */ C38314pUe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageFallbackRepo$getFallbackLocaleForSelectLanguageInternal$locale$1(C38314pUe c38314pUe, String str, Continuation<? super LanguageFallbackRepo$getFallbackLocaleForSelectLanguageInternal$locale$1> continuation) {
        super(2, continuation);
        this.this$0 = c38314pUe;
        this.$market = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LanguageFallbackRepo$getFallbackLocaleForSelectLanguageInternal$locale$1(this.this$0, this.$market, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Locale> continuation) {
        return ((LanguageFallbackRepo$getFallbackLocaleForSelectLanguageInternal$locale$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C38314pUe c38314pUe = this.this$0;
            String str = this.$market;
            this.label = 1;
            obj = c38314pUe.AEQbTJ(str, (Continuation<? super Locale>) this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        Locale locale = (Locale) obj;
        return locale != null ? locale : this.this$0.OLrzqt(this.$market);
    }
}
