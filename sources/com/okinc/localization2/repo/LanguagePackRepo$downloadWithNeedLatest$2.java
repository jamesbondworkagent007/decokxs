package com.okinc.localization2.repo;

import com.okinc.localization2.bean.LPDownloadResult;
import com.okinc.localization2.bean.LanguageUnit;
import com.okinc.localization2.bean.server.AppLink;
import com.okinc.localization2.bean.server.AppLinkLang;
import java.util.ArrayList;
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

/* JADX INFO: loaded from: classes9.dex */
public final class LanguagePackRepo$downloadWithNeedLatest$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends LPDownloadResult>>, Object> {
    final /* synthetic */ LanguageUnit $mainLanguage;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C38313pUd this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguagePackRepo$downloadWithNeedLatest$2(C38313pUd c38313pUd, LanguageUnit languageUnit, Continuation<? super LanguagePackRepo$downloadWithNeedLatest$2> continuation) {
        super(2, continuation);
        this.this$0 = c38313pUd;
        this.$mainLanguage = languageUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LanguagePackRepo$downloadWithNeedLatest$2 languagePackRepo$downloadWithNeedLatest$2 = new LanguagePackRepo$downloadWithNeedLatest$2(this.this$0, this.$mainLanguage, continuation);
        languagePackRepo$downloadWithNeedLatest$2.L$0 = obj;
        return languagePackRepo$downloadWithNeedLatest$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends LPDownloadResult>> continuation) {
        return ((LanguagePackRepo$downloadWithNeedLatest$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            C38313pUd c38313pUd = this.this$0;
            LanguageUnit languageUnit = this.$mainLanguage;
            this.L$0 = coroutineScope;
            this.label = 1;
            obj = c38313pUd.EZpvd(languageUnit, (Continuation<? super AppLink>) this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                List list = (List) obj;
                this.this$0.OLrzqt("downloadWithNeedLatest", (List<? extends Object>) list);
                return list;
            }
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        AppLink appLink = (AppLink) obj;
        if (appLink == null) {
            return C56402yEa.EZpvd(new LPDownloadResult.ActionBar(this.$mainLanguage, "requestLangPackInfo failed"));
        }
        this.this$0.values.AEQbTJ(this.$mainLanguage, this.this$0.AEQbTJ(appLink.getMarket(), appLink.getMarketCurrent()), this.this$0.AEQbTJ(appLink.getMarket(), appLink.getMarketDefault()), this.this$0.AEQbTJ(appLink.getMarket(), appLink.getGlobalCurrent()), this.this$0.AEQbTJ(appLink.getMarket(), appLink.getGlobalDefault()));
        ArrayList arrayList = new ArrayList();
        AppLinkLang marketCurrent = appLink.getMarketCurrent();
        if (marketCurrent != null) {
            arrayList.add(C56390yDp.OLrzqt(appLink.getMarket(), marketCurrent));
        }
        AppLinkLang marketDefault = appLink.getMarketDefault();
        if (marketDefault != null) {
            arrayList.add(C56390yDp.OLrzqt(appLink.getMarket(), marketDefault));
        }
        AppLinkLang globalCurrent = appLink.getGlobalCurrent();
        if (globalCurrent != null) {
            arrayList.add(C56390yDp.OLrzqt("global", globalCurrent));
        }
        AppLinkLang globalDefault = appLink.getGlobalDefault();
        if (globalDefault != null) {
            arrayList.add(C56390yDp.OLrzqt("global", globalDefault));
        }
        this.this$0.KWHzl((List<Pair<String, AppLinkLang>>) arrayList);
        ArrayList arrayList2 = new ArrayList();
        C38313pUd c38313pUd2 = this.this$0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new LanguagePackRepo$downloadWithNeedLatest$2$5$job$1(c38313pUd2, (Pair) it.next(), null), 3, null));
        }
        this.L$0 = null;
        this.label = 2;
        obj = AwaitKt.awaitAll(arrayList2, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        List list2 = (List) obj;
        this.this$0.OLrzqt("downloadWithNeedLatest", (List<? extends Object>) list2);
        return list2;
    }
}
