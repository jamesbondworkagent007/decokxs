package com.okinc.localization2;

import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import com.okinc.localization.internal.repository.LanguagesListRepository;
import com.okinc.localization2.bean.AppLocaleInfo;
import com.okinc.localization2.bean.LanguageUnit;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C38311pUb;
import o.C56391yDq;
import o.C56442yFn;
import o.pTJ;
import o.pUU;

/* JADX INFO: loaded from: classes9.dex */
public final class LocalizeCoreManager$setAppResourceConfig$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LanguageUnit $unit;
    Object L$0;
    int label;
    final /* synthetic */ pTJ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalizeCoreManager$setAppResourceConfig$2(LanguageUnit languageUnit, pTJ ptj, Continuation<? super LocalizeCoreManager$setAppResourceConfig$2> continuation) {
        super(2, continuation);
        this.$unit = languageUnit;
        this.this$0 = ptj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LocalizeCoreManager$setAppResourceConfig$2(this.$unit, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LocalizeCoreManager$setAppResourceConfig$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C38311pUb c38311pUb;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Locale localeForLanguageTag = Locale.forLanguageTag(this.$unit.getLanguageCode());
            pUU.KWHzl("LocalizeCoreManager", "setAppResourceConfig, locale:" + this.$unit);
            Locale.setDefault(localeForLanguageTag);
            Context applicationContext = this.this$0.KWHzl.getApplicationContext();
            Configuration configuration = applicationContext.getResources().getConfiguration();
            LocaleList localeList = new LocaleList(localeForLanguageTag);
            LocaleList.setDefault(localeList);
            configuration.setLocale(localeForLanguageTag);
            configuration.setLocales(localeList);
            applicationContext.getResources().updateConfiguration(configuration, applicationContext.getResources().getDisplayMetrics());
            C38311pUb c38311pUb2 = this.this$0.AhwBna;
            LanguagesListRepository languagesListRepository = this.this$0.djBIcL;
            LanguageUnit languageUnit = this.$unit;
            this.L$0 = c38311pUb2;
            this.label = 1;
            Object objKWHzl = languagesListRepository.KWHzl(languageUnit, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            c38311pUb = c38311pUb2;
            obj = objKWHzl;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c38311pUb = (C38311pUb) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        c38311pUb.OLrzqt((AppLocaleInfo) obj);
        return Unit.INSTANCE;
    }
}
