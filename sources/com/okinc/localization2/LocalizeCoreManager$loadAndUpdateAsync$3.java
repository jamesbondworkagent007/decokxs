package com.okinc.localization2;

import com.okinc.localization2.LocalizeCoreManager$loadAndUpdateAsync$3;
import com.okinc.localization2.bean.AppLocaleInfo;
import com.okinc.localization2.bean.LangChangeConfig;
import com.okinc.localization2.bean.LanguageListConfig;
import com.okinc.localization2.bean.LanguagePackConfig;
import com.okinc.localization2.bean.LanguageUnit;
import com.okinc.localization2.bean.LanguageUpdateResult;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import o.C56391yDq;
import o.C56442yFn;
import o.pTG;
import o.pTJ;
import o.pUU;

/* JADX INFO: loaded from: classes9.dex */
public final class LocalizeCoreManager$loadAndUpdateAsync$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LanguageUnit $languageUnit;
    int label;
    final /* synthetic */ pTJ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalizeCoreManager$loadAndUpdateAsync$3(pTJ ptj, LanguageUnit languageUnit, Continuation<? super LocalizeCoreManager$loadAndUpdateAsync$3> continuation) {
        super(2, continuation);
        this.this$0 = ptj;
        this.$languageUnit = languageUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LocalizeCoreManager$loadAndUpdateAsync$3(this.this$0, this.$languageUnit, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LocalizeCoreManager$loadAndUpdateAsync$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pTJ ptj = this.this$0;
            LanguageUnit languageUnit = this.$languageUnit;
            LangChangeConfig langChangeConfig = new LangChangeConfig(LanguageListConfig.NO_CHECK, LanguagePackConfig.CACHE_OR_EMBEDDED, null, false, 12, null);
            this.label = 1;
            obj = pTJ.setAppLanguage$default(ptj, languageUnit, langChangeConfig, false, this, 4, null);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((LanguageUpdateResult) obj) instanceof LanguageUpdateResult.ActionBar) {
            pTG ptg = pTG.OLrzqt;
            if (ptg.KWHzl(new File(ptg.AEQbTJ(this.this$0.KWHzl, this.$languageUnit))) && !this.this$0.DbNXlk.copydefault(this.$languageUnit, false)) {
                pUU.KWHzl("LocalizeCoreManager", "loadLocalLanguagePack, has json doesn't have mmkv.");
            }
        }
        AppLocaleInfo appLocaleInfoCopydefault = this.this$0.AhwBna.copydefault();
        if (appLocaleInfoCopydefault != null) {
            pTJ ptj2 = this.this$0;
            LanguageUnit languageUnit2 = this.$languageUnit;
            pTG ptg2 = pTG.OLrzqt;
            if (!ptg2.KWHzl(new File(ptg2.AEQbTJ(ptj2.KWHzl, languageUnit2))) || !ptj2.DbNXlk.copydefault(languageUnit2, false)) {
                pUU.KWHzl("LocalizeCoreManager", "updateAsync, not exist langPack for " + appLocaleInfoCopydefault.getLocale() + ". update now");
                this.label = 2;
                if (ptj2.OLrzqt((Continuation<? super Unit>) this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
        }
        pTG ptg3 = pTG.OLrzqt;
        final pTJ ptj3 = this.this$0;
        Function0<Unit> function0 = new Function0() { // from class: o.pTI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return LocalizeCoreManager$loadAndUpdateAsync$3.invokeSuspend$lambda$1(ptj3);
            }
        };
        this.label = 3;
        if (ptg3.EZpvd(function0, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(pTJ ptj) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(ptj.gEmmrt), null, null, new LocalizeCoreManager$loadAndUpdateAsync$3$2$1(ptj, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(ptj.gEmmrt), null, null, new LocalizeCoreManager$loadAndUpdateAsync$3$2$2(ptj, null), 3, null);
        return Unit.INSTANCE;
    }
}
