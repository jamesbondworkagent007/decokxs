package com.okinc.localization;

import com.okinc.localization2.bean.LangChangeConfig;
import com.okinc.localization2.bean.LanguageListConfig;
import com.okinc.localization2.bean.LanguagePackConfig;
import com.okinc.localization2.bean.LanguageUnit;
import com.okinc.localization2.bean.LanguageUpdateResult;
import java.util.Locale;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC58184ywW;
import o.pSC;
import o.pTJ;

/* JADX INFO: loaded from: classes9.dex */
public final class OKLocalize$setLocale$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC58184ywW<Boolean> $emitter;
    final /* synthetic */ Locale $locale;
    Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKLocalize$setLocale$1$1(Locale locale, InterfaceC58184ywW<Boolean> interfaceC58184ywW, Continuation<? super OKLocalize$setLocale$1$1> continuation) {
        super(2, continuation);
        this.$locale = locale;
        this.$emitter = interfaceC58184ywW;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKLocalize$setLocale$1$1(this.$locale, this.$emitter, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKLocalize$setLocale$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        InterfaceC58184ywW<Boolean> interfaceC58184ywW;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Locale locale = this.$locale;
                InterfaceC58184ywW<Boolean> interfaceC58184ywW2 = this.$emitter;
                Result.Application application = Result.Companion;
                String market = pSC.valueOf.OLrzqt().getMarket();
                if (locale == null) {
                    locale = Locale.ENGLISH;
                }
                String languageTag = locale.toLanguageTag();
                Intrinsics.checkNotNullExpressionValue(languageTag, "");
                LanguageUnit languageUnit = new LanguageUnit(market, languageTag);
                pTJ ptj = pSC.copydefault;
                LangChangeConfig langChangeConfig = new LangChangeConfig(LanguageListConfig.NO_CHECK, LanguagePackConfig.CACHE_OR_LATEST_OR_EMBEDDED, null, false, 12, null);
                this.L$0 = interfaceC58184ywW2;
                this.label = 1;
                obj = pTJ.setAppLanguage$default(ptj, languageUnit, langChangeConfig, false, this, 4, null);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                interfaceC58184ywW = interfaceC58184ywW2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC58184ywW = (InterfaceC58184ywW) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            interfaceC58184ywW.onNext(C56443yFo.KWHzl(!(((LanguageUpdateResult) obj) instanceof LanguageUpdateResult.ActionBar)));
            interfaceC58184ywW.onComplete();
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        InterfaceC58184ywW<Boolean> interfaceC58184ywW3 = this.$emitter;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            interfaceC58184ywW3.onError(thM7380exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}
