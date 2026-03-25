package com.okinc.localization2.repo;

import com.okinc.localization2.bean.GroupLanguages;
import com.okinc.localization2.bean.LPDownloadResult;
import com.okinc.localization2.bean.LPLoadResult;
import com.okinc.localization2.bean.LanguagePackConfig;
import com.okinc.localization2.bean.LanguagePackType;
import com.okinc.localization2.bean.LanguageUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.C38313pUd;
import o.C56390yDp;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.pSI;
import o.pUU;

/* JADX INFO: loaded from: classes9.dex */
public final class LanguagePackRepo$loadLangPack$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Pair<? extends LPLoadResult, ? extends pSI>>>, Object> {
    final /* synthetic */ LPDownloadResult $downloadAndUnzipResult;
    final /* synthetic */ LanguagePackConfig $langPackConfig;
    final /* synthetic */ LanguagePackType $langPackType;
    final /* synthetic */ LanguageUnit $mainLanguage;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C38313pUd this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguagePackRepo$loadLangPack$2(C38313pUd c38313pUd, LanguageUnit languageUnit, LanguagePackConfig languagePackConfig, LPDownloadResult lPDownloadResult, LanguagePackType languagePackType, Continuation<? super LanguagePackRepo$loadLangPack$2> continuation) {
        super(2, continuation);
        this.this$0 = c38313pUd;
        this.$mainLanguage = languageUnit;
        this.$langPackConfig = languagePackConfig;
        this.$downloadAndUnzipResult = lPDownloadResult;
        this.$langPackType = languagePackType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LanguagePackRepo$loadLangPack$2 languagePackRepo$loadLangPack$2 = new LanguagePackRepo$loadLangPack$2(this.this$0, this.$mainLanguage, this.$langPackConfig, this.$downloadAndUnzipResult, this.$langPackType, continuation);
        languagePackRepo$loadLangPack$2.L$0 = obj;
        return languagePackRepo$loadLangPack$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Pair<? extends LPLoadResult, ? extends pSI>>> continuation) {
        return ((LanguagePackRepo$loadLangPack$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [242=4] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ce  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objAwaitAll;
        List list;
        Iterator it;
        Object objAEQbTJ2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            GroupLanguages groupLanguagesAEQbTJ = this.this$0.values.AEQbTJ(this.$mainLanguage);
            if (groupLanguagesAEQbTJ == null || !this.this$0.values.OLrzqt(this.$mainLanguage)) {
                C38313pUd c38313pUd = this.this$0;
                LanguageUnit languageUnit = this.$mainLanguage;
                LanguagePackConfig languagePackConfig = this.$langPackConfig;
                this.label = 1;
                objAEQbTJ = c38313pUd.AEQbTJ(languageUnit, languagePackConfig, (Continuation<? super LPLoadResult>) this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                return C56402yEa.EZpvd(C56390yDp.OLrzqt((LPLoadResult) objAEQbTJ, null));
            }
            LPDownloadResult lPDownloadResult = this.$downloadAndUnzipResult;
            boolean z = ((lPDownloadResult instanceof LPDownloadResult.ActionBar) || (lPDownloadResult instanceof LPDownloadResult.Activity)) ? false : true;
            ArrayList arrayList = new ArrayList();
            List listKWHzl = this.this$0.KWHzl(groupLanguagesAEQbTJ);
            C38313pUd c38313pUd2 = this.this$0;
            LanguagePackType languagePackType = this.$langPackType;
            Iterator it2 = listKWHzl.iterator();
            while (it2.hasNext()) {
                LanguagePackType languagePackType2 = languagePackType;
                LanguagePackRepo$loadLangPack$2$1$job$1 languagePackRepo$loadLangPack$2$1$job$1 = new LanguagePackRepo$loadLangPack$2$1$job$1(c38313pUd2, (Pair) it2.next(), z, languagePackType, null);
                ArrayList arrayList2 = arrayList;
                arrayList2.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, languagePackRepo$loadLangPack$2$1$job$1, 3, null));
                arrayList = arrayList2;
                languagePackType = languagePackType2;
                c38313pUd2 = c38313pUd2;
            }
            this.label = 2;
            objAwaitAll = AwaitKt.awaitAll(arrayList, this);
            if (objAwaitAll == objCopydefault) {
                return objCopydefault;
            }
            list = (List) objAwaitAll;
            if (list instanceof Collection) {
            }
            it = list.iterator();
            while (it.hasNext()) {
            }
            this.this$0.AkhnZx.AEQbTJ(false, this.$mainLanguage);
            return list;
        }
        if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = obj;
            return C56402yEa.EZpvd(C56390yDp.OLrzqt((LPLoadResult) objAEQbTJ, null));
        }
        if (i == 2) {
            C56391yDq.AEQbTJ(obj);
            objAwaitAll = obj;
            list = (List) objAwaitAll;
            if ((list instanceof Collection) || !list.isEmpty()) {
                it = list.iterator();
                while (it.hasNext()) {
                    if (((Pair) it.next()).getFirst() instanceof LPLoadResult.Application) {
                        pUU.KWHzl("LanguagePackRepo", "loadLangPack, failInLoad. tryEmbedded");
                        C38313pUd c38313pUd3 = this.this$0;
                        LanguageUnit languageUnit2 = this.$mainLanguage;
                        LanguagePackConfig languagePackConfig2 = this.$langPackConfig;
                        this.label = 3;
                        objAEQbTJ2 = c38313pUd3.AEQbTJ(languageUnit2, languagePackConfig2, (Continuation<? super LPLoadResult>) this);
                        if (objAEQbTJ2 == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
            }
            this.this$0.AkhnZx.AEQbTJ(false, this.$mainLanguage);
            return list;
        }
        if (i != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        objAEQbTJ2 = obj;
        return C56402yEa.EZpvd(C56390yDp.OLrzqt((LPLoadResult) objAEQbTJ2, null));
    }
}
