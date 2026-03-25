package com.okinc.localization2.repo;

import android.content.Context;
import com.okinc.localization2.bean.LPDownloadResult;
import com.okinc.localization2.bean.LanguageUnit;
import com.okinc.localization2.bean.server.AppLinkLang;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C38313pUd;
import o.C56391yDq;
import o.C56442yFn;
import o.pTG;
import o.pUU;

/* JADX INFO: loaded from: classes9.dex */
public final class LanguagePackRepo$updateLangPackInternal$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super LPDownloadResult>, Object> {
    final /* synthetic */ AppLinkLang $langPackInfo;
    final /* synthetic */ LanguageUnit $languageUnit;
    final /* synthetic */ String $path;
    int label;
    final /* synthetic */ C38313pUd this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguagePackRepo$updateLangPackInternal$2(C38313pUd c38313pUd, AppLinkLang appLinkLang, String str, LanguageUnit languageUnit, Continuation<? super LanguagePackRepo$updateLangPackInternal$2> continuation) {
        super(2, continuation);
        this.this$0 = c38313pUd;
        this.$langPackInfo = appLinkLang;
        this.$path = str;
        this.$languageUnit = languageUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LanguagePackRepo$updateLangPackInternal$2(this.this$0, this.$langPackInfo, this.$path, this.$languageUnit, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super LPDownloadResult> continuation) {
        return ((LanguagePackRepo$updateLangPackInternal$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                pTG ptg = pTG.OLrzqt;
                Context context = this.this$0.KWHzl;
                String link = this.$langPackInfo.getLink();
                String str = this.$path;
                this.label = 1;
                if (ptg.EZpvd(context, link, str, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return new LPDownloadResult.TaskDescription(this.$languageUnit, new File(this.$path), this.$langPackInfo.getMd5());
        } catch (Exception e) {
            String str2 = "updateLangPack, download failed.e:" + e;
            pUU.copydefault("LanguagePackRepo", str2);
            File file = new File(this.$path + "tmp");
            if (file.exists()) {
                file.delete();
            }
            return new LPDownloadResult.ActionBar(this.$languageUnit, str2);
        }
    }
}
