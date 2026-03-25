package com.okinc.localization2.repo;

import com.okinc.localization2.bean.LPDownloadResult;
import com.okinc.localization2.bean.LPLoadResult;
import com.okinc.localization2.bean.LangChangeConfig;
import com.okinc.localization2.bean.LanguagePackConfig;
import com.okinc.localization2.bean.LanguagePackType;
import com.okinc.localization2.bean.LanguageUnit;
import com.okinc.localization2.bean.LanguageUpdateResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C38313pUd;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes9.dex */
public final class LanguagePackRepo$updateAndLoadLangPack$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super LanguageUpdateResult>, Object> {
    final /* synthetic */ LangChangeConfig $langChangeConfig;
    final /* synthetic */ LanguageUnit $languageUnit;
    Object L$0;
    int label;
    final /* synthetic */ C38313pUd this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguagePackRepo$updateAndLoadLangPack$result$1(C38313pUd c38313pUd, LanguageUnit languageUnit, LangChangeConfig langChangeConfig, Continuation<? super LanguagePackRepo$updateAndLoadLangPack$result$1> continuation) {
        super(2, continuation);
        this.this$0 = c38313pUd;
        this.$languageUnit = languageUnit;
        this.$langChangeConfig = langChangeConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LanguagePackRepo$updateAndLoadLangPack$result$1(this.this$0, this.$languageUnit, this.$langChangeConfig, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super LanguageUpdateResult> continuation) {
        return ((LanguagePackRepo$updateAndLoadLangPack$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strCopydefault;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.EZpvd(this.$languageUnit.getLanguageCode(), this.$langChangeConfig.getLangListConfig())) {
                strCopydefault = this.this$0.AkhnZx.copydefault();
                C38313pUd c38313pUd = this.this$0;
                LanguageUnit languageUnit = this.$languageUnit;
                LanguagePackConfig langPackConfig = this.$langChangeConfig.getLangPackConfig();
                LanguagePackType langPackType = this.$langChangeConfig.getLangPackType();
                this.L$0 = strCopydefault;
                this.label = 1;
                obj = c38313pUd.copydefault(languageUnit, langPackConfig, langPackType, (Continuation<? super LPDownloadResult>) this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                String str = "updateAndLoadLangPack, checkLanguageList failed for " + this.$languageUnit;
                pUU.valueOf("LanguagePackRepo", str);
                return new LanguageUpdateResult.ActionBar(str);
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                this.this$0.AhwBna();
                return this.this$0.EZpvd((LPLoadResult) obj);
            }
            strCopydefault = (String) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        String str2 = strCopydefault;
        LPDownloadResult lPDownloadResult = (LPDownloadResult) obj;
        if (this.this$0.KWHzl(lPDownloadResult, this.$langChangeConfig.getLangPackConfig())) {
            String str3 = "updateAndLoadLangPack, downloadAndUnzipResult failed for " + this.$languageUnit;
            pUU.valueOf("LanguagePackRepo", str3);
            return new LanguageUpdateResult.ActionBar(str3);
        }
        if (this.$langChangeConfig.getFromUpdateCurrentLanguage() && this.this$0.AhwBna.get()) {
            pUU.KWHzl("LanguagePackRepo", "updateAndLoadLangPack, isSwitchMarketRunning. stop for " + this.$languageUnit);
            return LanguageUpdateResult.TaskDescription.OLrzqt;
        }
        C38313pUd c38313pUd2 = this.this$0;
        LanguageUnit languageUnit2 = this.$languageUnit;
        LanguagePackConfig langPackConfig2 = this.$langChangeConfig.getLangPackConfig();
        LanguagePackType langPackType2 = this.$langChangeConfig.getLangPackType();
        this.L$0 = null;
        this.label = 2;
        obj = c38313pUd2.EZpvd(languageUnit2, lPDownloadResult, langPackConfig2, langPackType2, str2, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        this.this$0.AhwBna();
        return this.this$0.EZpvd((LPLoadResult) obj);
    }
}
